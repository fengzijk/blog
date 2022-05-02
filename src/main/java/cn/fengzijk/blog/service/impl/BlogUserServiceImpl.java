package cn.fengzijk.blog.service.impl;


import cn.fengzijk.blog.config.redis.RedisUtil;
import cn.fengzijk.blog.config.response.exception.BusinessException;
import cn.fengzijk.blog.mapper.BlogUserMapper;
import cn.fengzijk.blog.pojo.entity.BlogUserEntity;
import cn.fengzijk.blog.pojo.vo.AdminLoginVO;
import cn.fengzijk.blog.service.BlogUserService;
import cn.fengzijk.blog.util.modelmapper.ModelMapperUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Collections;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * -------------------------------------------------
 * <pre>用户</pre>
 *
 * @author : fengzijk
 * @date : 2021/8/9 下午7:04
 * --------------------------------------------------
 */
@Service
@RequiredArgsConstructor
public class BlogUserServiceImpl extends ServiceImpl<BlogUserMapper, BlogUserEntity> implements BlogUserService {

    private  final BlogUserMapper blogUserMapper;
    private  final RedisUtil redisUtil;


    /**
     * 用户名密码登录
     *
     * @param username 用户名
     * @param password 密码
     * @return cn.fengzijk.blog.pojo.vo.AdminLoginVO
     * @author : fengzijk
     * @date : 2022-05-02 4:45
     */
    @Override
    public AdminLoginVO loginByUsername(String username, String password) {
        if (StringUtils.isAnyBlank(username,password)){
            throw  new BusinessException(1111,"用户名密码不能为空");
        }
        LambdaQueryWrapper<BlogUserEntity> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(BlogUserEntity::getUsername,username);
        BlogUserEntity blogUser=
          Optional.ofNullable(super.baseMapper.selectOne(queryWrapper)).orElseThrow(() -> new BusinessException(String.format("username(username=%s)不存在",
            username)));
        AdminLoginVO result=new AdminLoginVO();
        ModelMapperUtil.map(blogUser,result);
        result.setToken("1122222222222222");
        result.setAvatar("http://img.fengzijk.cn/biji/Imageali.png");
        result.setRoles(Collections.singletonList("admin"));
        return result;
    }
}

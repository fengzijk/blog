package cn.fengzijk.blog.service.impl;

import cn.fengzijk.blog.mapper.IpWhiteListMapper;
import cn.fengzijk.blog.pojo.entity.IpWhiteListEntity;
import cn.fengzijk.blog.service.IpWhiteListService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class IpWhiteListServiceImpl extends ServiceImpl<IpWhiteListMapper, IpWhiteListEntity> implements IpWhiteListService {


    @Override
    public List<IpWhiteListEntity> get() {
        LambdaQueryWrapper<IpWhiteListEntity> lambda3 = Wrappers.lambdaQuery();
        lambda3.ne(IpWhiteListEntity::getCreateTime, LocalDateTime.now());
        return super.baseMapper.selectList(lambda3);
    }



}

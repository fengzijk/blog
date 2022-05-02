package cn.fengzijk.blog.service;

import cn.fengzijk.blog.pojo.vo.AdminLoginVO;
import java.util.List;

/**
 * 服务类
 *
 * @author fengzijk
 * @since 2022-05-02
 */
public interface BlogUserService {

    /**
     * 用户名密码登录
     *
     * @param username 用户名
     * @param password 密码
     * @return cn.fengzijk.blog.pojo.vo.AdminLoginVO
     * @author : fengzijk
     * @date : 2022-05-02 4:45
     */
    AdminLoginVO loginByUsername(String username, String password);

}

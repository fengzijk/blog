/*
 *   All rights Reserved, Designed By ZTE-ITS
 *   Copyright:    Copyright(C) 2021-2030
 *   Company       FENGZIJK LTD.
 *   @Author:    fengzijk
 *   @Email: guozhifengvip@163.com
 *   @Version    V1.0
 *   @Date:   2022年05月02日 04时34分
 *   Modification       History:
 *   ------------------------------------------------------------------------------------
 *   Date                  Author        Version        Discription
 *   -----------------------------------------------------------------------------------
 *  2022-05-02 04:34:00    fengzijk         1.0         Why & What is modified: <修改原因描述>
 *
 *
 */

package cn.fengzijk.blog.pojo.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * -------------------------------------------------
 * <pre>管理员登录</pre>
 *
 * @author : guozhifeng
 * @date : 2022-05-02 4:30
 * --------------------------------------------------
 */
@Data
@Accessors(chain=true)
public class AdminLoginVO implements Serializable {

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * QQ
     */
    private String qq;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 超级管理员、管理员、普通用户
     */
    private String userType;

    /**
     * 公司
     */
    private String company;

    /**
     * 个人博客地址
     */

    private String blogUrl;

    /**
     * 地址
     */
    private String address;

    /**
     * 用户来源
     */
    private String source;

    /**
     * 用户唯一表示(第三方网站)
     */
    private String uuid;

    /**
     * 隐私（1：公开，0：不公开）
     */
    private Boolean privacy;

    /**
     * 通知：(1：通知显示消息详情，2：通知不显示详情)
     */
    private Boolean notification;

    /**
     * 注册IP
     */

    private String registerIp;

    /**
     * 最近登录IP
     */
    private String lastLoginIp;

    /**
     * 最近登录时间
     */
    private Date lastLoginTime;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 用户备注
     */
    private String remark;

    private  String token;

    private List<String> roles;
}
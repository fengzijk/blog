package cn.fengzijk.blog.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 
 *
 * @author fengzijk
 * @since 2022-05-02
 */
@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper=false)
@TableName("blog_user")
public class BlogUserEntity extends BaseEntity implements Serializable{

    /**
     * 用户名
     */
	private String username;
	
    /**
     * 密码盐
     */
	@TableField("password_salt")
	private String passwordSalt;
	
    /**
     * 登录密码
     */
	private String password;
	
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
	@TableField("user_type")
	private String userType;
	
    /**
     * 公司
     */
	private String company;
	
    /**
     * 个人博客地址
     */
	@TableField("blog_url")
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
	@TableField("register_ip")
	private String registerIp;
	
    /**
     * 最近登录IP
     */
	@TableField("last_login_ip")
	private String lastLoginIp;
	
    /**
     * 最近登录时间
     */
	@TableField("last_login_time")
	private Date lastLoginTime;
	
    /**
     * 登录次数
     */
	@TableField("login_count")
	private Integer loginCount;
	
    /**
     * 用户备注
     */
	private String remark;


}

/*
 *   All rights Reserved, Designed By ZTE-ITS
 *   Copyright:    Copyright(C) 2021-2030
 *   Company       FENGZIJK LTD.
 *   @Author:    fengzijk
 *   @Email: guozhifengvip@163.com
 *   @Version    V1.0
 *   @Date:   2022年05月02日 04时33分
 *   Modification       History:
 *   ------------------------------------------------------------------------------------
 *   Date                  Author        Version        Discription
 *   -----------------------------------------------------------------------------------
 *  2022-05-02 04:33:20    fengzijk         1.0         Why & What is modified: <修改原因描述>
 *
 *
 */

package cn.fengzijk.blog.pojo.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
*-------------------------------------------------
* <pre>管理员登录</pre>
* @author : guozhifeng
* @date : 2022-05-02 4:30
*--------------------------------------------------
*/
@Data
@Accessors
public class AdminLoginDTO implements Serializable {

    private String username;
    private String password;
}

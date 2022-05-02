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
 *  2022-05-02 04:33:12    fengzijk         1.0         Why & What is modified: <修改原因描述>
 *
 *
 */

package cn.fengzijk.blog.controller.open;


import cn.fengzijk.blog.config.response.annotation.EnableGlobalResponse;
import cn.fengzijk.blog.pojo.dto.AdminLoginDTO;
import cn.fengzijk.blog.pojo.vo.AdminLoginVO;
import cn.fengzijk.blog.service.BlogUserService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/open/admin/user")
@RequiredArgsConstructor
@CrossOrigin
@EnableGlobalResponse
public class OpenAuthController {

private  final BlogUserService blogUserService;



/**
 * 登录
 * @return cn.fengzijk.blog.config.model.ResponseEntity<cn.fengzijk.blog.pojo.vo.AdminLoginVO>
 * @author : fengzijk
 * @date : 2022-05-02 5:06
 */
    @PostMapping("/login")
    public AdminLoginVO adminLogin(@RequestBody  @Valid AdminLoginDTO  param) {
        return blogUserService.loginByUsername(param.getUsername(), param.getPassword());
    }
}

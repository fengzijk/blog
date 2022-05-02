/*
 *   All rights Reserved, Designed By ZTE-ITS
 *   Copyright:    Copyright(C) 2021-2030
 *   Company       FENGZIJK LTD.
 *   @Author:    fengzijk
 *   @Email: guozhifengvip@163.com
 *   @Version    V1.0
 *   @Date:   2022年05月02日 04时50分
 *   Modification       History:
 *   ------------------------------------------------------------------------------------
 *   Date                  Author        Version        Discription
 *   -----------------------------------------------------------------------------------
 *  2022-05-02 04:50:52    fengzijk         1.0         Why & What is modified: <修改原因描述>
 *
 *
 */

package cn.fengzijk.blog.config.response.config;


import cn.fengzijk.blog.config.response.GlobalResponseHandler;
import cn.fengzijk.blog.config.response.properties.GlobalResponseProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * -------------------------------------------------
 * <pre>统一返回值以及异常处理</pre>
 *
 * @author : fengzijk
 * @date : 2021/10/4 0:38
 * --------------------------------------------------
 */
@Configuration
@EnableConfigurationProperties(GlobalResponseProperties.class)
@ConditionalOnProperty(value = GlobalResponseProperties.PREFIX+".enabled", havingValue = "true", matchIfMissing = true)
public class GlobalResponseAutoConfig {

    @Bean
    public GlobalResponseHandler commonResponseDataAdvice() {
        return new GlobalResponseHandler();
    }
}

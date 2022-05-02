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

package cn.fengzijk.blog.config.response.exception;

/**
 * -------------------------------------------------
 * <pre>业务异常</pre>
 *
 * @author : fengzijk
 * @date : 2021/10/3 19:17
 * --------------------------------------------------
 */

public class BusinessException extends RuntimeException {

    private int code;

    public BusinessException() {
        super();
    }

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
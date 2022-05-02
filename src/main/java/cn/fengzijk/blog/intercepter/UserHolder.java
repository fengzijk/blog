package cn.fengzijk.blog.intercepter;


import cn.fengzijk.blog.pojo.dto.BaseUserInfoDTO;


/**
*-------------------------------------------------
* <pre>用户基础新封装</pre>
* @author : guozhifeng
* @date : 2022-05-02 4:03
*--------------------------------------------------
*/
public class UserHolder {
    private static final ThreadLocal<BaseUserInfoDTO> USER_HOLDER = new InheritableThreadLocal<>();

    public static void add(BaseUserInfoDTO loginInfo) {
        USER_HOLDER.set(loginInfo);
    }

    public static BaseUserInfoDTO getCurrentUser() {

        return USER_HOLDER.get();
    }

    public static void remove() {
        USER_HOLDER.remove();
    }
}

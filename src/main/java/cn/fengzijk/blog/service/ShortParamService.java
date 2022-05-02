package cn.fengzijk.blog.service;


import cn.fengzijk.blog.pojo.entity.ShortParamEntity;

/**
 * -------------------------------------------------
 * <pre>短连接或者参数缩短</pre>
 *
 * @author : fengzijk
 * @date : 2021/8/9 下午6:54
 * --------------------------------------------------
 */
public interface ShortParamService {

    /**
     * <pre> 查询md5Code是否存在 </pre>
     *
     * @param md5Code MD5code
     * @return java.lang.Boolean
     * @date : 2021/8/9 下午7:00
     */
    Boolean isExistByMd5Code(String md5Code);


    ShortParamEntity longToShort(String type, String param);

    String shortToLong(String shortParam);

    String longToShortUrl();

}

package cn.fengzijk.blog.service;

import cn.fengzijk.blog.pojo.entity.IpWhiteListEntity;
import com.baomidou.mybatisplus.extension.service.IService;


import java.util.List;

public interface IpWhiteListService extends IService<IpWhiteListEntity> {
    List<IpWhiteListEntity> get ();
}

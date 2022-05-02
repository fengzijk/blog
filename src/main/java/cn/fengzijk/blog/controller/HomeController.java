package cn.fengzijk.blog.controller;


import cn.fengzijk.blog.config.redis.RedisQueueHandle;
import cn.fengzijk.blog.config.redis.RedisUtil;
import cn.fengzijk.blog.config.redis.RedissonLockUtil;
import cn.fengzijk.blog.config.response.ResponseResult;
import cn.fengzijk.blog.pojo.dto.ShortParamDTO;
import cn.fengzijk.blog.pojo.entity.IpWhiteListEntity;
import cn.fengzijk.blog.pojo.entity.ShortParamEntity;
import cn.fengzijk.blog.service.IpWhiteListService;
import cn.fengzijk.blog.service.ShortParamService;
import cn.fengzijk.blog.service.impl.AsyncThreadServiceImpl;
import cn.fengzijk.blog.util.modelmapper.ModelMapperUtil;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HomeController {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    IpWhiteListService whiteListService;

    @Autowired
    private ShortParamService shortParamService;

    @Autowired
    private RedisQueueHandle redisQueueHandle;

    @Autowired

    private AsyncThreadServiceImpl asyncThreadService;


    /**
     * index
     */
    @GetMapping("/index")
    public ResponseResult<List<IpWhiteListEntity>> index() {
        redisUtil.set("xxx", "hhhhhhhhhhhhh");

        List<IpWhiteListEntity> lists = whiteListService.get();
        RedissonLockUtil.lock("gzf", TimeUnit.SECONDS, 100);

        redisQueueHandle.put("gzf", "test");
        System.out.println(1111);
        RedissonLockUtil.unlock("gzf");
        return new ResponseResult<List<IpWhiteListEntity>>().setData(lists);
    }
    /**
     * index
     */
    @GetMapping("/test/{param}")
    public ResponseResult<ShortParamDTO> testShort(@PathVariable(value = "param")String param) {
         ShortParamEntity param1 = shortParamService.longToShort(
                "param",
                param);
         param1.setOriginalParam(null);
        ShortParamDTO map = ModelMapperUtil.map(param1, ShortParamDTO.class);
        return new ResponseResult<ShortParamDTO>().setData(map);
    }

    /**
     * index
     */
    @GetMapping("/test")
    public ResponseResult<String> testShort() {
asyncThreadService.test();
        return new ResponseResult<String>().setData("su");
    }
}

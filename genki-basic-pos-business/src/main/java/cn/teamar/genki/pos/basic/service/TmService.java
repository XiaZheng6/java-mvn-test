package cn.teamar.genki.pos.basic.service;


import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.vo.tmService.StoreInfoVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @program: genki-basic
 * @description: 区域
 * @author: jie.pang
 * @create: 2018-07-31 11:50
 **/

@FeignClient(serviceId = "genki-operate-web")
public interface TmService {

    @PostMapping ("/genki/ops/store/find/{storeId}")
    Response<StoreInfoVo> getStoreInfo(@PathVariable("storeId") String storeId);

}

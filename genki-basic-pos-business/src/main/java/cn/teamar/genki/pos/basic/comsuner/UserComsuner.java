package cn.teamar.genki.pos.basic.comsuner;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.common.tools.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @program: genki-basic-pos
 * @description:
 * @author: jie.pang
 * @create: 2018-08-29 17:16
 **/


@FeignClient(name = "${service.eos-core-business.name}",
        path = "${service.eos-core-business.path}", fallback = UserComsuner.Fallback.class)
public interface UserComsuner {

    @PostMapping("/list")
    Response list(@RequestBody PageForm pageForm);

    @Component
    @Slf4j
    public static class Fallback implements UserComsuner {
        public Response list(@RequestBody PageForm pageForm){
            log.error("[query] fallback param={}", pageForm);
            return Response.error("fallback");
        }
    }
}

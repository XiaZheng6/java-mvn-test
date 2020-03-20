package cn.teamar.genki.pos.basic.provider;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.business.UserBusiness;
import cn.teamar.genki.pos.basic.po.TUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: genki-basic-pos
 * @description:
 * @author: jie.pang
 * @create: 2018-08-29 17:11
 **/
@Slf4j
@RestController
@RequestMapping("/basic/rpc/user")
public class UserProvider {
    @Autowired
    private UserBusiness userBusiness;

    @GetMapping("/list")
    public Response<List<TUser>> list(Long restaurantId) {
        PageForm page = new PageForm();
        page.setOffset(0);
        page.setSize(10);
        List<TUser> result = userBusiness.listUsers(page);
        return Response.success(result);
    }
}

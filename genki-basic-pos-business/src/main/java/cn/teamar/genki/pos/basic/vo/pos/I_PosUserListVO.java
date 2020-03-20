package cn.teamar.genki.pos.basic.vo.pos;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @program: genki-basic-pos
 * @description: 转义后UserVO
 * @author: jie.pang
 * @create: 2018-08-18 11:48
 **/
@Setter
@Getter
@ToString
@ApiModel
public class I_PosUserListVO {
    //员工的id
    private long id;
    private String realName;

    private String userName;

    private String password;
    //角色ID
    private int roleId;
    //角色名称
    private String roleType;
    //权限名称
    private String rightType;
    //权限
    private List<PosRightVO> powerList;

}

package cn.teamar.genki.pos.basic.vo;

import cn.teamar.genki.basic.common.entity.PageForm;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-07-31 20:35
 **/
@Getter
@Setter
@ToString
public class NameCodePageVO extends PageForm {
    private long code;
    private String name;
}

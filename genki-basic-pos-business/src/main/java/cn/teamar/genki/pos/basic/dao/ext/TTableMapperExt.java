package cn.teamar.genki.pos.basic.dao.ext;

import cn.teamar.genki.pos.basic.po.TTable;
import cn.teamar.genki.pos.basic.po.TTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 角色Mapper扩展
 * @author: jie.pang
 * @create: 2018-07-30 16:15
 **/
public interface TTableMapperExt {

    int deleteByIdSoft(@Param("id") long id, @Param("sid") long sid);
}

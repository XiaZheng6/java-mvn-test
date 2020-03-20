package cn.teamar.genki.pos.basic.dao.ext;

import org.apache.ibatis.annotations.Param;

/**
 * @program: genki-basic
 * @description: 角色Mapper扩展
 * @author: jie.pang
 * @create: 2018-07-30 16:15
 **/
public interface TAreaMapperExt {

    int deleteByIdSoft(@Param("id") long id, @Param("sid") long sid);
}

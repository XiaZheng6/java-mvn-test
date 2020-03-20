package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.pos.basic.po.TCityTree;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 区域
 * @author: jie.pang
 * @create: 2018-07-31 11:50
 **/
public interface CityService {

    int insert(TCityTree cityTree);

    List<TCityTree> selectByType(byte type);
    
    List<TCityTree> selectAllByType(byte type);

    List<TCityTree> selectByParentIdAndType(long parentId, byte type);

    TCityTree selectById(Long pid);

    TCityTree selectCity(Integer pid);
	

}

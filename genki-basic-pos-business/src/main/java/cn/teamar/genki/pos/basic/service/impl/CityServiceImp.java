package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.pos.basic.dao.TCityTreeMapper;
import cn.teamar.genki.pos.basic.dao.ext.TCityTreeMapperExt;
import cn.teamar.genki.pos.basic.po.TCityTree;
import cn.teamar.genki.pos.basic.po.TCityTreeExample;
import cn.teamar.genki.pos.basic.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-02 17:07
 **/
@Service
public class CityServiceImp implements CityService {
    @Autowired
    private TCityTreeMapper cityTreeMapper;
    @Autowired
    private TCityTreeMapperExt cityTreeMapperExt;

    @Override
    public int insert(TCityTree cityTree) {
        return cityTreeMapper.insert(cityTree);
    }

    @Override
    public List<TCityTree> selectByType(byte type) {
        return cityTreeMapperExt.selectByType(type);
    }

    @Override
    public List<TCityTree> selectAllByType(byte type) {
        return cityTreeMapperExt.selectAllByType(type);
    }

    @Override
    public List<TCityTree> selectByParentIdAndType(long parentId, byte type) {
        TCityTreeExample ex = new TCityTreeExample();
        ex.createCriteria().andParentCodeEqualTo(parentId).andTypeEqualTo(type);
        return cityTreeMapper.selectByExample(ex);
    }

    @Override
    public TCityTree selectById(Long pid) {
        return cityTreeMapper.selectByPrimaryKey(pid);
    }

    @Override
    public TCityTree selectCity(Integer pid) {
        TCityTreeExample example = new TCityTreeExample();
        example.createCriteria().andTypeEqualTo((byte) 2).andCodeEqualTo(pid);
        List<TCityTree> selectByExample = cityTreeMapper.selectByExample(example);
        if(selectByExample.size()>0){
            return selectByExample.get(0);
        }
        return null;
    }
}

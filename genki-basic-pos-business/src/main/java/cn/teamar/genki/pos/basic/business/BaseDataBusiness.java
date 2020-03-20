package cn.teamar.genki.pos.basic.business;

import cn.teamar.genki.pos.basic.vo.base.CityNodeVO;

import java.util.List;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-02 17:04
 **/
public interface BaseDataBusiness {

    public List<CityNodeVO> getCountriesByParent(int parentId);
    public List<CityNodeVO> getCitiesByParent(int parentId);
    public List<CityNodeVO> getProvinces();
    public List<CityNodeVO> getProvincesAll() ;


}

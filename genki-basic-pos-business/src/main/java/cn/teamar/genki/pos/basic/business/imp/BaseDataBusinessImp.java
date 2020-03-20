package cn.teamar.genki.pos.basic.business.imp;

import cn.teamar.genki.basic.common.enums.CityTypeEnum;
import cn.teamar.genki.pos.basic.business.BaseDataBusiness;
import cn.teamar.genki.pos.basic.po.TCityTree;
import cn.teamar.genki.pos.basic.service.CityService;
import cn.teamar.genki.pos.basic.vo.base.CityNodeVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-02 17:23
 **/
@Service
@Slf4j
public class BaseDataBusinessImp implements BaseDataBusiness {

    @Autowired
    private CityService cityService;

    public List<CityNodeVO> getCountriesByParent(int parentId) {
        return convert(cityService.selectByParentIdAndType(parentId, CityTypeEnum.COUNTRY.getCodeAsByte()));
    }

    public List<CityNodeVO> getCitiesByParent(int parentId) {
        return convert(cityService.selectByParentIdAndType(parentId, CityTypeEnum.CITY.getCodeAsByte()));
    }

    public List<CityNodeVO> getProvinces() {
        return convert(cityService.selectByType(CityTypeEnum.PROVINCE.getCodeAsByte()));
    }

    public List<CityNodeVO> getProvincesAll() {
        return convert(cityService.selectAllByType(CityTypeEnum.PROVINCE.getCodeAsByte()));
    }

    private List<CityNodeVO> convert(List<TCityTree> list) {
        return Optional.ofNullable(list)
                .orElseGet(ArrayList::new).stream()
                .map(tree -> new CityNodeVO(tree.getCode(), tree.getName(), tree.getParentCode()))
                .collect(Collectors.toList());
    }
}

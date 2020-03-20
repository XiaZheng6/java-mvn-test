package cn.teamar.genki.pos.basic.po;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FoodExCommodity {
    private Long id;

    private Long gId;

    private Long bId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long sId;

    private Long baseCommodityId;

    private String baseCommodityName;

    private String commodityName;

    private String commodityEnglishName;
    private String quickCode;

    private Byte sortCode;

    private Long categoryId;

    private Long typeId;

    private Byte isCombo;

    private Byte state;

    private Long packagePrice;
    private Long setmenuCount;

    private Long setmenuSelect;
    private String allocationPlan;//分配方案
    private Long baseCategoryId;

    private String baseCategoryName;

    private Long baseTypeId;

    private String baseTypeName;

    private Long unitId;

    private String unitName;

    public String getQuickCode() {
        return quickCode;
    }

    public void setQuickCode(String quickCode) {
        this.quickCode = quickCode;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Long getBaseCategoryId() {
        return baseCategoryId;
    }

    public void setBaseCategoryId(Long baseCategoryId) {
        this.baseCategoryId = baseCategoryId;
    }

    public String getBaseCategoryName() {
        return baseCategoryName;
    }

    public void setBaseCategoryName(String baseCategoryName) {
        this.baseCategoryName = baseCategoryName;
    }

    public Long getBaseTypeId() {
        return baseTypeId;
    }

    public void setBaseTypeId(Long baseTypeId) {
        this.baseTypeId = baseTypeId;
    }

    public String getBaseTypeName() {
        return baseTypeName;
    }

    public void setBaseTypeName(String baseTypeName) {
        this.baseTypeName = baseTypeName;
    }

    public Long getSetmenuCount() {
        return setmenuCount;
    }

    public void setSetmenuCount(Long setmenuCount) {
        this.setmenuCount = setmenuCount;
    }

    public Long getSetmenuSelect() {
        return setmenuSelect;
    }

    public void setSetmenuSelect(Long setmenuSelect) {
        this.setmenuSelect = setmenuSelect;
    }

    public String getAllocationPlan() {
        return allocationPlan;
    }

    public void setAllocationPlan(String allocationPlan) {
        this.allocationPlan = allocationPlan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getgId() {
        return gId;
    }

    public void setgId(Long gId) {
        this.gId = gId;
    }

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public Long getBaseCommodityId() {
        return baseCommodityId;
    }

    public void setBaseCommodityId(Long baseCommodityId) {
        this.baseCommodityId = baseCommodityId;
    }

    public String getBaseCommodityName() {
        return baseCommodityName;
    }

    public void setBaseCommodityName(String baseCommodityName) {
        this.baseCommodityName = baseCommodityName;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityEnglishName() {
        return commodityEnglishName;
    }

    public void setCommodityEnglishName(String commodityEnglishName) {
        this.commodityEnglishName = commodityEnglishName;
    }

    public Byte getSortCode() {
        return sortCode;
    }

    public void setSortCode(Byte sortCode) {
        this.sortCode = sortCode;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Byte getIsCombo() {
        return isCombo;
    }

    public void setIsCombo(Byte isCombo) {
        this.isCombo = isCombo;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Long getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(Long packagePrice) {
        this.packagePrice = packagePrice;
    }
}
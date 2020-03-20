package cn.teamar.genki.pos.basic.po;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FoodCommodity {
    private Long id;

    private Long gId;

    private Long bId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long sId;

    private String commodityName;

    private String commodityEnglishName;

    private Long unitId;
    private Long unitName;

    private String quickCode;

    private Byte sortCode;

    private Long categoryId;

    private Long typeId;

    private Long depId;

    private Long imgTagId;

    private String txtTag;

    private String analysisTag;

    private Byte state;

    private String specText;

    private Long txtTagId;

    private Long analysisTagId;

    private String imgTagText;

    private Long packagePrice;

    private Byte isCombo;

    private Long setmenuCount;

    private Long setmenuSelect;

    private String allocationplan;

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

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Long getUnitName() {
        return unitName;
    }

    public void setUnitName(Long unitName) {
        this.unitName = unitName;
    }

    public String getQuickCode() {
        return quickCode;
    }

    public void setQuickCode(String quickCode) {
        this.quickCode = quickCode;
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

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public Long getImgTagId() {
        return imgTagId;
    }

    public void setImgTagId(Long imgTagId) {
        this.imgTagId = imgTagId;
    }

    public String getTxtTag() {
        return txtTag;
    }

    public void setTxtTag(String txtTag) {
        this.txtTag = txtTag;
    }

    public String getAnalysisTag() {
        return analysisTag;
    }

    public void setAnalysisTag(String analysisTag) {
        this.analysisTag = analysisTag;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getSpecText() {
        return specText;
    }

    public void setSpecText(String specText) {
        this.specText = specText;
    }

    public Long getTxtTagId() {
        return txtTagId;
    }

    public void setTxtTagId(Long txtTagId) {
        this.txtTagId = txtTagId;
    }

    public Long getAnalysisTagId() {
        return analysisTagId;
    }

    public void setAnalysisTagId(Long analysisTagId) {
        this.analysisTagId = analysisTagId;
    }

    public String getImgTagText() {
        return imgTagText;
    }

    public void setImgTagText(String imgTagText) {
        this.imgTagText = imgTagText;
    }

    public Long getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(Long packagePrice) {
        this.packagePrice = packagePrice;
    }

    public Byte getIsCombo() {
        return isCombo;
    }

    public void setIsCombo(Byte isCombo) {
        this.isCombo = isCombo;
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

    public String getAllocationplan() {
        return allocationplan;
    }

    public void setAllocationplan(String allocationplan) {
        this.allocationplan = allocationplan;
    }
}
package cn.teamar.genki.pos.basic.po;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FoodExCommodityCombo {
    private Long id;

    private Long gId;

    private Long bId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long sId;

    private Long commodityId;

    private String commodityName;

    private String specText;

    private Long price;

    private Long commodityQty;

    private Long setmenuCount;
    private Byte state;

    private Long setmenuSelect;
    private Long baseCommodityId; //单品ID
    private String materielDepotRealId; //物料ID
    private String unitName; //单位名称

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getMaterielDepotRealId() {
        return materielDepotRealId;
    }

    public void setMaterielDepotRealId(String materielDepotRealId) {
        this.materielDepotRealId = materielDepotRealId;
    }
    public Long getBaseCommodityId() {
        return baseCommodityId;
    }

    public void setBaseCommodityId(Long baseCommodityId) {
        this.baseCommodityId = baseCommodityId;
    }

    public Long getSpecId() {
        return specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    private Long specId; //规格ID

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

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getSpecText() {
        return specText;
    }

    public void setSpecText(String specText) {
        this.specText = specText;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getCommodityQty() {
        return commodityQty;
    }

    public void setCommodityQty(Long commodityQty) {
        this.commodityQty = commodityQty;
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
}
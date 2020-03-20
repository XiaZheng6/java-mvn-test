package cn.teamar.genki.pos.basic.po;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FoodExSpecRef {
    private Long id;

    private Long gId;

    private Long bId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long sId;

    private Long commodityId;

    private Long baseSpecId;

    private String baseSpecName;

    private Long price;

    private Long cost;

    private String barCode;

    private Byte isDefault;

    private Byte state;
    private Long materielDepotRealId; //物料ID
    private Byte isBind; //物料是否绑定的状态（1：绑定；-1：未绑定）

    public Long getMaterielDepotRealId() {
        return materielDepotRealId;
    }

    public void setMaterielDepotRealId(Long materielDepotRealId) {
        this.materielDepotRealId = materielDepotRealId;
    }

    public Byte getIsBind() {
        return isBind;
    }

    public void setIsBind(Byte isBind) {
        this.isBind = isBind;
    }
    public String getBaseSpecName() {
        return baseSpecName;
    }

    public void setBaseSpecName(String baseSpecName) {
        this.baseSpecName = baseSpecName;
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

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public Long getBaseSpecId() {
        return baseSpecId;
    }

    public void setBaseSpecId(Long baseSpecId) {
        this.baseSpecId = baseSpecId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Byte getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}
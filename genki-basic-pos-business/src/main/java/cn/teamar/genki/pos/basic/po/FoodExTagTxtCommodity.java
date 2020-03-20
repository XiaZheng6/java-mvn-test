package cn.teamar.genki.pos.basic.po;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FoodExTagTxtCommodity {
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long sId;

    private Long commodityId;

    private String tagCode;

    private String tagName;

    private Long baseTagId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTagCode() {
        return tagCode;
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Long getBaseTagId() {
        return baseTagId;
    }

    public void setBaseTagId(Long baseTagId) {
        this.baseTagId = baseTagId;
    }
}
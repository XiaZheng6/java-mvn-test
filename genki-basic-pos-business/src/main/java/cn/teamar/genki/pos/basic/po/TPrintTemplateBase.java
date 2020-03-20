package cn.teamar.genki.pos.basic.po;

import java.util.Date;

public class TPrintTemplateBase {
    private Long id;

    private Long gId;

    private Long bId;

    private Long sId;

    private String templateName;

    private Long templateTypeId;

    private Long templateContentId;

    private String templateTypeName;

    private Double width;

    private Byte weight;

    private Byte state;

    private Date creatTime;

    private Date updateTime;

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

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Long getTemplateTypeId() {
        return templateTypeId;
    }

    public void setTemplateTypeId(Long templateTypeId) {
        this.templateTypeId = templateTypeId;
    }

    public Long getTemplateContentId() {
        return templateContentId;
    }

    public void setTemplateContentId(Long templateContentId) {
        this.templateContentId = templateContentId;
    }

    public String getTemplateTypeName() {
        return templateTypeName;
    }

    public void setTemplateTypeName(String templateTypeName) {
        this.templateTypeName = templateTypeName;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Byte getWeight() {
        return weight;
    }

    public void setWeight(Byte weight) {
        this.weight = weight;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
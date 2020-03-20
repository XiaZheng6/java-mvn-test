package cn.teamar.genki.pos.basic.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TPrinterTemplateLink {
    private Long id;

    private Long gId;

    private Long bId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long sId;

    private Long printerId;

    private Long templateId;

    private String templateName;

    private Byte copyNum;

    private Date creatTime;

    private Date updateTime;

    private TPrintTemplateContent printTemplateContent; //模板内容对象

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

    public Long getPrinterId() {
        return printerId;
    }

    public void setPrinterId(Long printerId) {
        this.printerId = printerId;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Byte getCopyNum() {
        return copyNum;
    }

    public void setCopyNum(Byte copyNum) {
        this.copyNum = copyNum;
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

    public TPrintTemplateContent getPrintTemplateContent() {
        return printTemplateContent;
    }

    public void setPrintTemplateContent(TPrintTemplateContent printTemplateContent) {
        this.printTemplateContent = printTemplateContent;
    }
}
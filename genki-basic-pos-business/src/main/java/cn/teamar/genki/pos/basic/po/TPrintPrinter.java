package cn.teamar.genki.pos.basic.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class TPrintPrinter {
    private Long id;

    private Long gId;

    private Long bId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long sId;

    private String printerName;

    private String printerType;

    private String printerCategory;

    private String printerIp;

    private String printerSn;

    private Integer printerPort;

    private Byte printWidth;

    private String leakProofCode;

    private Byte leakProofCodeState;

    private String resetrule;

    private Byte cashboxStatus;

    private String commodityShowType;

    private Byte state;

    private Date creatTime;

    private Date updateTime;

    List<Long> foodCommodityList; //基础商品集合
    List<TPrinterTemplateLink> tPrinterTemplateLinkList;//模板集合

    public List<TPrinterTemplateLink> gettPrinterTemplateLinkList() {
        return tPrinterTemplateLinkList;
    }

    public void settPrinterTemplateLinkList(List<TPrinterTemplateLink> tPrinterTemplateLinkList) {
        this.tPrinterTemplateLinkList = tPrinterTemplateLinkList;
    }

    public List<Long> getFoodCommodityList() {
        return foodCommodityList;
    }

    public void setFoodCommodityList(List<Long> foodCommodityList) {
        this.foodCommodityList = foodCommodityList;
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

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public String getPrinterType() {
        return printerType;
    }

    public void setPrinterType(String printerType) {
        this.printerType = printerType;
    }

    public String getPrinterCategory() {
        return printerCategory;
    }

    public void setPrinterCategory(String printerCategory) {
        this.printerCategory = printerCategory;
    }

    public String getPrinterIp() {
        return printerIp;
    }

    public void setPrinterIp(String printerIp) {
        this.printerIp = printerIp;
    }

    public String getPrinterSn() {
        return printerSn;
    }

    public void setPrinterSn(String printerSn) {
        this.printerSn = printerSn;
    }

    public Integer getPrinterPort() {
        return printerPort;
    }

    public void setPrinterPort(Integer printerPort) {
        this.printerPort = printerPort;
    }

    public Byte getPrintWidth() {
        return printWidth;
    }

    public void setPrintWidth(Byte printWidth) {
        this.printWidth = printWidth;
    }

    public String getLeakProofCode() {
        return leakProofCode;
    }

    public void setLeakProofCode(String leakProofCode) {
        this.leakProofCode = leakProofCode;
    }

    public Byte getLeakProofCodeState() {
        return leakProofCodeState;
    }

    public void setLeakProofCodeState(Byte leakProofCodeState) {
        this.leakProofCodeState = leakProofCodeState;
    }

    public String getResetrule() {
        return resetrule;
    }

    public void setResetrule(String resetrule) {
        this.resetrule = resetrule;
    }

    public Byte getCashboxStatus() {
        return cashboxStatus;
    }

    public void setCashboxStatus(Byte cashboxStatus) {
        this.cashboxStatus = cashboxStatus;
    }

    public String getCommodityShowType() {
        return commodityShowType;
    }

    public void setCommodityShowType(String commodityShowType) {
        this.commodityShowType = commodityShowType;
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
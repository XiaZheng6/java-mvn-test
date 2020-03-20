package cn.teamar.genki.pos.basic.po;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TTable {
    private Long id;

    private Long gId;

    private Long bId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long sId;

    private String tableName;

    private String tableCode;

    private Long areaId;

    private String areaName;

    private Byte defaultNum;

    private Byte state;
    private Byte tableType;

    public Byte getTableType() {
        return tableType;
    }

    public void setTableType(Byte tableType) {
        this.tableType = tableType;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Byte getDefaultNum() {
        return defaultNum;
    }

    public void setDefaultNum(Byte defaultNum) {
        this.defaultNum = defaultNum;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}
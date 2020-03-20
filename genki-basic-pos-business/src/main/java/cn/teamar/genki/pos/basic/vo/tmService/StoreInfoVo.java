package cn.teamar.genki.pos.basic.vo.tmService;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;


@Data
@ToString
@ApiModel("商铺信息")
public class StoreInfoVo {

    @ApiModelProperty("商铺主键")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long storeId;

    @ApiModelProperty("商铺名称")
    private String storeName;

    @ApiModelProperty("商铺所在城市地区ID")
    private String[] areaIds;

    @ApiModelProperty("企业名称全称")
    private String comFullname;

    @ApiModelProperty("商铺所在街道地址")
    private String storeAddress;

    @ApiModelProperty("商铺电话")
    private String storePhone;

    @ApiModelProperty("商铺统一信用代码号")
    private String storeCreditCode;

    @ApiModelProperty("商铺导航图")
    private String storeImgNav;

    @ApiModelProperty("营业执照")
    private String bussLicenseImg;

    @ApiModelProperty("食品流通许可证")
    private String hygiLicenseImg;

    @ApiModelProperty("商铺经营业态")
    private String bussStatus;

    @ApiModelProperty("商铺面积")
    private BigDecimal bussSpace;

    @ApiModelProperty("营业开始时间")
    @JsonFormat(pattern = "HH:mm")
    private String bussBeginTime;

    @ApiModelProperty("营业结束时间")
    @JsonFormat(pattern = "HH:mm")
    private String bussEndTime;

    @ApiModelProperty("合作开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date wtBeginTime;

    @ApiModelProperty("合作结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date wtEndTime;

    @ApiModelProperty("合作状态")
    private String wtStatus;


    @ApiModelProperty("第一次开户登陆名称")
    private String loginName;

    @ApiModelProperty("联系人名字")
    private String ctUserName;

    @ApiModelProperty("联系人电话")
    private String ctUserPhone;

    @ApiModelProperty("加入日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date issueDate;

    @ApiModelProperty("更新日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;
    @ApiModelProperty("店铺所在地图位置")
    private String location;
}
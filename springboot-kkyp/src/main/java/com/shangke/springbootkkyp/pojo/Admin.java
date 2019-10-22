package com.shangke.springbootkkyp.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 地址
 */
@Data
@ApiModel(value = "admin地址对象",description = "地址")
public class Admin {
   /* 地址id */
   @ApiModelProperty(value = "地址id")
   private Long id;
   /* 区县 */
   @ApiModelProperty(value = "区县")
   private String area;
    /* 市 */
    @ApiModelProperty(value = "市")
   private String city;
   /* 详细地址 */
   @ApiModelProperty(value = "详细地址")
   private String detailaddress;
   /* 是否默认 */
   @ApiModelProperty(value = "是否默认")
   private String priority;
   /* 省份 */
   @ApiModelProperty(value = "省份")
   private String province;
   /* 手机 */
   @ApiModelProperty(value = "手机")
   private String tel;
   /* 收货人姓名 */
   @ApiModelProperty(value = "收货人姓名")
   private String username;
   /* 授权编码 */
   @ApiModelProperty(value = "授权编码")
   private String xxlSsoSessionid;

   public Admin(String area, String city, String detailaddress, String priority, String province, String tel, String username, String xxlSsoSessionid) {
      this.area = area;
      this.city = city;
      this.detailaddress = detailaddress;
      this.priority = priority;
      this.province = province;
      this.tel = tel;
      this.username = username;
      this.xxlSsoSessionid = xxlSsoSessionid;
   }

   public Admin(){}
}

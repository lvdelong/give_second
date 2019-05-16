/**
 * Copyright (C), 2015-2019
 * FileName: OrderBean
 * Author:   Administrator
 * Date:     2019/5/14 11:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.model;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/14
 * @since 1.0.0
 */
public class OrderBean {

    private String id; //id

    private Double orderPrice; //订单金额

    private String firmName; //公司名字

    private String orderInfo; //订单说明

    private String orderNumber; //订单号

    private String applyVip; //申请会员

    private String applyTime; //申请时间

    private String payTheBill;//付账方式

    private Boolean checkeds=false;

    private Date  curData;

    private String status;

    private String orderType;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getApplyVip() {
        return applyVip;
    }

    public void setApplyVip(String applyVip) {
        this.applyVip = applyVip;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getPayTheBill() {
        return payTheBill;
    }

    public void setPayTheBill(String payTheBill) {
        this.payTheBill = payTheBill;
    }

    public Boolean getCheckeds() {
        return checkeds;
    }

    public void setCheckeds(Boolean checkeds) {
        this.checkeds = checkeds;
    }

    public Date getCurData() {
        return curData;
    }

    public void setCurData(Date curData) {
        this.curData = curData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "OrderBean{" +
                "id='" + id + '\'' +
                ", orderPrice=" + orderPrice +
                ", firmName='" + firmName + '\'' +
                ", orderInfo='" + orderInfo + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", applyVip='" + applyVip + '\'' +
                ", applyTime='" + applyTime + '\'' +
                ", payTheBill='" + payTheBill + '\'' +
                ", checkeds=" + checkeds +
                ", curData=" + curData +
                ", status='" + status + '\'' +
                ", orderType='" + orderType + '\'' +
                '}';
    }
}

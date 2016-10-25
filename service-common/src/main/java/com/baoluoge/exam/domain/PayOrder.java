package com.baoluoge.exam.domain;

import java.math.BigDecimal;
import java.util.Date;

public class PayOrder {
    /**
     * 未支付状态
     */
    public static final int STATUS_NOT_PAID = 1;
    /**
     * 已支付状态
     */
    public static final int STATUS_PAID = 2;
    /**
     * 支付失败状态
     */
    public static final int STATUS_FAIL = 3;
    /**
     * 异常
     */
    public static final int STATUS_ERROR = 4;
    /**
     * 无效，删除
     */
    public static final int STATUS_INVALID = 5;
    
    /**
     * 超时时间
     */
    
    public static final int STATUS_EXPIRED_HOUR = 24;
    
    public static final String STATUS_EXPIRED_HOUR_STR = "24h";
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.id
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.user_id
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.goods_id
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.order_no
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private String orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.order_status
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Integer orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.trade_no
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private String tradeNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.trade_status
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private String tradeStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.pay_type
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Integer payType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.pay_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.start_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.end_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.total_fee
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private BigDecimal totalFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.remark
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.create_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.update_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.is_delete
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    private Boolean isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.id
     *
     * @return the value of pay_order.id
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.id
     *
     * @param id the value for pay_order.id
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.user_id
     *
     * @return the value of pay_order.user_id
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.user_id
     *
     * @param userId the value for pay_order.user_id
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.goods_id
     *
     * @return the value of pay_order.goods_id
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.goods_id
     *
     * @param goodsId the value for pay_order.goods_id
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.order_no
     *
     * @return the value of pay_order.order_no
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.order_no
     *
     * @param orderNo the value for pay_order.order_no
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.order_status
     *
     * @return the value of pay_order.order_status
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.order_status
     *
     * @param orderStatus the value for pay_order.order_status
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.trade_no
     *
     * @return the value of pay_order.trade_no
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.trade_no
     *
     * @param tradeNo the value for pay_order.trade_no
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.trade_status
     *
     * @return the value of pay_order.trade_status
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.trade_status
     *
     * @param tradeStatus the value for pay_order.trade_status
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.pay_type
     *
     * @return the value of pay_order.pay_type
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.pay_type
     *
     * @param payType the value for pay_order.pay_type
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.pay_time
     *
     * @return the value of pay_order.pay_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.pay_time
     *
     * @param payTime the value for pay_order.pay_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.start_time
     *
     * @return the value of pay_order.start_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.start_time
     *
     * @param startTime the value for pay_order.start_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.end_time
     *
     * @return the value of pay_order.end_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.end_time
     *
     * @param endTime the value for pay_order.end_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.total_fee
     *
     * @return the value of pay_order.total_fee
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.total_fee
     *
     * @param totalFee the value for pay_order.total_fee
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.remark
     *
     * @return the value of pay_order.remark
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.remark
     *
     * @param remark the value for pay_order.remark
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.create_time
     *
     * @return the value of pay_order.create_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.create_time
     *
     * @param createTime the value for pay_order.create_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.update_time
     *
     * @return the value of pay_order.update_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.update_time
     *
     * @param updateTime the value for pay_order.update_time
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.is_delete
     *
     * @return the value of pay_order.is_delete
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.is_delete
     *
     * @param isDelete the value for pay_order.is_delete
     *
     * @mbg.generated Fri Oct 14 14:02:23 CST 2016
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}
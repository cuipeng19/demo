package com.demo.bean.ao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author cuipeng 2019/12/20 11:44
 */
@Data
public class AddBarcodeMerchAO {

    private String token;

    /**
     * 直属代理商编号
     */
    private String agentId;

    /**
     * 流水号
     */
    private String serialNumber;

    /**
     * 区县编码
     */
    private String countyCode;

    /**
     * mcc二级码
     */
    private String mcc;

    /**
     * 	商户详细地址
     */
    private String merchAddress;

    /**
     * 用户手机号
     */
    private String mobile;

    /**
     * 姓名
     */
    private String accountName;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 证件有效期开始日期(yyyyMMdd)
     */
    private String idCardStartDate;

    /**
     * 证件有效期间隔时间（YY，参数(5：5年,10：10年,20：20年,99:永久有效)）
     */
    private String idCardValidityInterval;

    /**
     * 银行卡号
     */
    private String cardNo;

    /**
     * 开户行行号
     */
    private String bankCode;

    /**
     * 开户行名称
     */
    private String bankName;

    /**
     * 预留手机号
     */
    private String accountMobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 客服电话
     */
    private String servicePhone;

    /**
     * POS信用卡手续费，取值范围0-100，单位：%
     */
    @JsonProperty(value = "cFeeRate")
    private BigDecimal cFeeRate;

    /**
     * POS借记卡手续费，取值范围0-100，单位：%
     */
    @JsonProperty(value = "dFeeRate")
    private BigDecimal dFeeRate;

    /**
     * POS借记卡手续费封顶值，0表示无封顶
     */
    @JsonProperty(value = "dFeeMax")
    private BigDecimal dFeeMax;

    /**
     * 二维码微信手续费，取值范围0-100，单位：%
     */
    private BigDecimal wxFeeRate;

    /**
     * 二维码支付宝手续费，取值范围0-100，单位：%
     */
    private BigDecimal bbFeeRate;


    /**
     * D0手续费，单位：元
     */
    private BigDecimal d0FeeRate;

    /**
     * D0单笔提现
     */
    private BigDecimal d0SingleCashDrawal;

    /**
     * 云闪付信用卡手续费
     */
    private BigDecimal ycFreeFeeRate;

    /**
     * 云闪付借记卡手续费
     */
    private BigDecimal ydFreeFeeRate;

    /**
     * 图片列表
     */
    private List<ImageAO> imageList;
}

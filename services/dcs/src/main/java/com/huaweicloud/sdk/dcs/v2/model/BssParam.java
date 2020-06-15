package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * BssParam
 */
public class BssParam  {

    /**
     * 当选择包年包月时，该字段为必选，表示是否自动续订资源。 取值范围： - false：不自动续订； - true：自动续订； 默认值为：false 约束： 如果设置为自动续订，到期后，会自动续订一个月（自动续订时间后续可能会变化），详情可联系客服咨询。 
     */
    public static class IsAutoRenewEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoRenewEnum TRUE = new IsAutoRenewEnum("true");

        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoRenewEnum FALSE = new IsAutoRenewEnum("false");

        

        public static Map<String, IsAutoRenewEnum> staticFields =
                new HashMap<String, IsAutoRenewEnum>() {
                    { 
                        put("true", TRUE);
                        put("false", FALSE);
                    }
                };

        private String value;

        IsAutoRenewEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoRenewEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            IsAutoRenewEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new IsAutoRenewEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static IsAutoRenewEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IsAutoRenewEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IsAutoRenewEnum) {
                return this.value.equals(((IsAutoRenewEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_auto_renew")
    
    private IsAutoRenewEnum isAutoRenew = IsAutoRenewEnum.FALSE;
    /**
     * 功能说明：付费方式（预付费、按需付费；预付费，即包周期付费）。 取值范围： - prePaid -预付费，即包年包月； - postPaid -后付费，即按需付费； 默认值是postPaid。 后付费的场景下，bss_param参数的其他字段都会被忽略。 
     */
    public static class ChargingModeEnum {

        
        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargingModeEnum PREPAID = new ChargingModeEnum("prePaid");

        
        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargingModeEnum POSTPAID = new ChargingModeEnum("postPaid");

        

        public static Map<String, ChargingModeEnum> staticFields =
                new HashMap<String, ChargingModeEnum>() {
                    { 
                        put("prePaid", PREPAID);
                        put("postPaid", POSTPAID);
                    }
                };

        private String value;

        ChargingModeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargingModeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ChargingModeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ChargingModeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ChargingModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charging_mode")
    
    private ChargingModeEnum chargingMode = ChargingModeEnum.POSTPAID;
    /**
     * 功能说明：下单订购后，是否自动从客户的账户中支付；默认是“不自动支付” 。  取值范围： - true：是（自动支付，从账户余额自动扣费） - false：否（默认值，只提交订单不支付，需要客户手动去支付）  约束： 自动支付时，只能使用账户的现金支付；如果要使用代金券，请选择不自动支付，然后在用户费用中心，选择代金券支付。  **如果没有设置成自动支付，即设置为false时，在创建实例之后，实例状态为“支付中”，用户必须在“费用中心 > 我的订单”，完成订单支付，否则订单一直在支付中，实例没有创建成功**。 
     */
    public static class IsAutoPayEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoPayEnum TRUE = new IsAutoPayEnum("true");

        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoPayEnum FALSE = new IsAutoPayEnum("false");

        

        public static Map<String, IsAutoPayEnum> staticFields =
                new HashMap<String, IsAutoPayEnum>() {
                    { 
                        put("true", TRUE);
                        put("false", FALSE);
                    }
                };

        private String value;

        IsAutoPayEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoPayEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            IsAutoPayEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new IsAutoPayEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static IsAutoPayEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IsAutoPayEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IsAutoPayEnum) {
                return this.value.equals(((IsAutoPayEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_auto_pay")
    
    private IsAutoPayEnum isAutoPay;
    /**
     * 当选择包年包月时，该字段为必选，表示订购资源的周期类型。  取值范围如下： - month：表示包月 - year：表示包年 
     */
    public static class PeriodTypeEnum {

        
        /**
         * Enum MONTH for value: "month"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("month");

        
        /**
         * Enum YEAR for value: "year"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("year");

        

        public static Map<String, PeriodTypeEnum> staticFields =
                new HashMap<String, PeriodTypeEnum>() {
                    { 
                        put("month", MONTH);
                        put("year", YEAR);
                    }
                };

        private String value;

        PeriodTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            PeriodTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new PeriodTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static PeriodTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PeriodTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PeriodTypeEnum) {
                return this.value.equals(((PeriodTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_type")
    
    private PeriodTypeEnum periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_num")
    
    private Integer periodNum;

    public BssParam withIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    


    /**
     * 当选择包年包月时，该字段为必选，表示是否自动续订资源。 取值范围： - false：不自动续订； - true：自动续订； 默认值为：false 约束： 如果设置为自动续订，到期后，会自动续订一个月（自动续订时间后续可能会变化），详情可联系客服咨询。 
     * @return isAutoRenew
     */
    public IsAutoRenewEnum getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public BssParam withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 功能说明：付费方式（预付费、按需付费；预付费，即包周期付费）。 取值范围： - prePaid -预付费，即包年包月； - postPaid -后付费，即按需付费； 默认值是postPaid。 后付费的场景下，bss_param参数的其他字段都会被忽略。 
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public BssParam withIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 功能说明：下单订购后，是否自动从客户的账户中支付；默认是“不自动支付” 。  取值范围： - true：是（自动支付，从账户余额自动扣费） - false：否（默认值，只提交订单不支付，需要客户手动去支付）  约束： 自动支付时，只能使用账户的现金支付；如果要使用代金券，请选择不自动支付，然后在用户费用中心，选择代金券支付。  **如果没有设置成自动支付，即设置为false时，在创建实例之后，实例状态为“支付中”，用户必须在“费用中心 > 我的订单”，完成订单支付，否则订单一直在支付中，实例没有创建成功**。 
     * @return isAutoPay
     */
    public IsAutoPayEnum getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public BssParam withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * 当选择包年包月时，该字段为必选，表示订购资源的周期类型。  取值范围如下： - month：表示包月 - year：表示包年 
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public BssParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    


    /**
     * 功能说明：订购周期数 取值范围：(后续会随运营策略变化) - period_type为month时，为[1,9]， - period_type为year时，为[1,3] 约束：同period_type约束。 
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BssParam bssParam = (BssParam) o;
        return Objects.equals(this.isAutoRenew, bssParam.isAutoRenew) &&
            Objects.equals(this.chargingMode, bssParam.chargingMode) &&
            Objects.equals(this.isAutoPay, bssParam.isAutoPay) &&
            Objects.equals(this.periodType, bssParam.periodType) &&
            Objects.equals(this.periodNum, bssParam.periodNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isAutoRenew, chargingMode, isAutoPay, periodType, periodNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BssParam {\n");
            sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
            sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
            sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
            sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
            sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

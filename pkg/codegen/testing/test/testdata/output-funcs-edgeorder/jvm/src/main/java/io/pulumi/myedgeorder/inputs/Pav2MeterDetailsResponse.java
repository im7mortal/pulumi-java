// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Billing type PAV2 meter details
 * 
 */
public final class Pav2MeterDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final Pav2MeterDetailsResponse Empty = new Pav2MeterDetailsResponse();

    /**
     * Represents billing type.
     * Expected value is 'Pav2'.
     * 
     */
    @InputImport(name="billingType", required=true)
    private final String billingType;

    public String getBillingType() {
        return this.billingType;
    }

    /**
     * Charging type.
     * 
     */
    @InputImport(name="chargingType", required=true)
    private final String chargingType;

    public String getChargingType() {
        return this.chargingType;
    }

    /**
     * Validation status of requested data center and transport.
     * 
     */
    @InputImport(name="meterGuid", required=true)
    private final String meterGuid;

    public String getMeterGuid() {
        return this.meterGuid;
    }

    /**
     * Billing unit applicable for Pav2 billing
     * 
     */
    @InputImport(name="multiplier", required=true)
    private final Double multiplier;

    public Double getMultiplier() {
        return this.multiplier;
    }

    public Pav2MeterDetailsResponse(
        String billingType,
        String chargingType,
        String meterGuid,
        Double multiplier) {
        this.billingType = Objects.requireNonNull(billingType, "expected parameter 'billingType' to be non-null");
        this.chargingType = Objects.requireNonNull(chargingType, "expected parameter 'chargingType' to be non-null");
        this.meterGuid = Objects.requireNonNull(meterGuid, "expected parameter 'meterGuid' to be non-null");
        this.multiplier = Objects.requireNonNull(multiplier, "expected parameter 'multiplier' to be non-null");
    }

    private Pav2MeterDetailsResponse() {
        this.billingType = null;
        this.chargingType = null;
        this.meterGuid = null;
        this.multiplier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Pav2MeterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingType;
        private String chargingType;
        private String meterGuid;
        private Double multiplier;

        public Builder() {
    	      // Empty
        }

        public Builder(Pav2MeterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingType = defaults.billingType;
    	      this.chargingType = defaults.chargingType;
    	      this.meterGuid = defaults.meterGuid;
    	      this.multiplier = defaults.multiplier;
        }

        public Builder setBillingType(String billingType) {
            this.billingType = Objects.requireNonNull(billingType);
            return this;
        }

        public Builder setChargingType(String chargingType) {
            this.chargingType = Objects.requireNonNull(chargingType);
            return this;
        }

        public Builder setMeterGuid(String meterGuid) {
            this.meterGuid = Objects.requireNonNull(meterGuid);
            return this;
        }

        public Builder setMultiplier(Double multiplier) {
            this.multiplier = Objects.requireNonNull(multiplier);
            return this;
        }

        public Pav2MeterDetailsResponse build() {
            return new Pav2MeterDetailsResponse(billingType, chargingType, meterGuid, multiplier);
        }
    }
}

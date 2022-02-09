// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.myedgeorder.inputs.Pav2MeterDetailsResponse;
import io.pulumi.myedgeorder.inputs.PurchaseMeterDetailsResponse;
import java.lang.String;
import java.util.Objects;


public final class BillingMeterDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BillingMeterDetailsResponse Empty = new BillingMeterDetailsResponse();

    @InputImport(name="frequency", required=true)
    private final String frequency;

    public String getFrequency() {
        return this.frequency;
    }

    @InputImport(name="meterDetails", required=true)
    private final Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails;

    public Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> getMeterDetails() {
        return this.meterDetails;
    }

    @InputImport(name="meteringType", required=true)
    private final String meteringType;

    public String getMeteringType() {
        return this.meteringType;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public BillingMeterDetailsResponse(
        String frequency,
        Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails,
        String meteringType,
        String name) {
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
        this.meterDetails = Objects.requireNonNull(meterDetails, "expected parameter 'meterDetails' to be non-null");
        this.meteringType = Objects.requireNonNull(meteringType, "expected parameter 'meteringType' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private BillingMeterDetailsResponse() {
        this.frequency = null;
        this.meterDetails = null;
        this.meteringType = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingMeterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frequency;
        private Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails;
        private String meteringType;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingMeterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.meterDetails = defaults.meterDetails;
    	      this.meteringType = defaults.meteringType;
    	      this.name = defaults.name;
        }

        public Builder setFrequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder setMeterDetails(Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails) {
            this.meterDetails = Objects.requireNonNull(meterDetails);
            return this;
        }

        public Builder setMeteringType(String meteringType) {
            this.meteringType = Objects.requireNonNull(meteringType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public BillingMeterDetailsResponse build() {
            return new BillingMeterDetailsResponse(frequency, meterDetails, meteringType, name);
        }
    }
}

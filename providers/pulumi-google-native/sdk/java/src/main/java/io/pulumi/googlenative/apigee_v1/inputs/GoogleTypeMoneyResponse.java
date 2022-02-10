// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GoogleTypeMoneyResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleTypeMoneyResponse Empty = new GoogleTypeMoneyResponse();

    @InputImport(name="currencyCode", required=true)
    private final String currencyCode;

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    @InputImport(name="nanos", required=true)
    private final Integer nanos;

    public Integer getNanos() {
        return this.nanos;
    }

    @InputImport(name="units", required=true)
    private final String units;

    public String getUnits() {
        return this.units;
    }

    public GoogleTypeMoneyResponse(
        String currencyCode,
        Integer nanos,
        String units) {
        this.currencyCode = Objects.requireNonNull(currencyCode, "expected parameter 'currencyCode' to be non-null");
        this.nanos = Objects.requireNonNull(nanos, "expected parameter 'nanos' to be non-null");
        this.units = Objects.requireNonNull(units, "expected parameter 'units' to be non-null");
    }

    private GoogleTypeMoneyResponse() {
        this.currencyCode = null;
        this.nanos = null;
        this.units = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleTypeMoneyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currencyCode;
        private Integer nanos;
        private String units;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleTypeMoneyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currencyCode = defaults.currencyCode;
    	      this.nanos = defaults.nanos;
    	      this.units = defaults.units;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = Objects.requireNonNull(currencyCode);
            return this;
        }

        public Builder setNanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }

        public Builder setUnits(String units) {
            this.units = Objects.requireNonNull(units);
            return this;
        }

        public GoogleTypeMoneyResponse build() {
            return new GoogleTypeMoneyResponse(currencyCode, nanos, units);
        }
    }
}
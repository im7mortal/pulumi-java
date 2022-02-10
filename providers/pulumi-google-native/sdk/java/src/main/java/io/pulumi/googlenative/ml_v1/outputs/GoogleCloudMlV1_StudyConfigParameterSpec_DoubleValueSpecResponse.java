// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse {
    private final Double maxValue;
    private final Double minValue;

    @OutputCustomType.Constructor({"maxValue","minValue"})
    private GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse(
        Double maxValue,
        Double minValue) {
        this.maxValue = Objects.requireNonNull(maxValue);
        this.minValue = Objects.requireNonNull(minValue);
    }

    public Double getMaxValue() {
        return this.maxValue;
    }
    public Double getMinValue() {
        return this.minValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double maxValue;
        private Double minValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
        }

        public Builder setMaxValue(Double maxValue) {
            this.maxValue = Objects.requireNonNull(maxValue);
            return this;
        }

        public Builder setMinValue(Double minValue) {
            this.minValue = Objects.requireNonNull(minValue);
            return this;
        }

        public GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse(maxValue, minValue);
        }
    }
}
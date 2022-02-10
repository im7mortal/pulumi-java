// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.runtimeconfig_v1beta1.outputs.CardinalityResponse;
import java.util.Objects;

@OutputCustomType
public final class EndConditionResponse {
    private final CardinalityResponse cardinality;

    @OutputCustomType.Constructor({"cardinality"})
    private EndConditionResponse(CardinalityResponse cardinality) {
        this.cardinality = Objects.requireNonNull(cardinality);
    }

    public CardinalityResponse getCardinality() {
        return this.cardinality;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CardinalityResponse cardinality;

        public Builder() {
    	      // Empty
        }

        public Builder(EndConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardinality = defaults.cardinality;
        }

        public Builder setCardinality(CardinalityResponse cardinality) {
            this.cardinality = Objects.requireNonNull(cardinality);
            return this;
        }

        public EndConditionResponse build() {
            return new EndConditionResponse(cardinality);
        }
    }
}
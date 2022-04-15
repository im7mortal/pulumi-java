// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiregistration.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.apiregistration.k8s.io_v1beta1.outputs.APIServiceCondition;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class APIServiceStatus {
    /**
     * Current service state of apiService.
     * 
     */
    private final @Nullable List<APIServiceCondition> conditions;

    @CustomType.Constructor
    private APIServiceStatus(@CustomType.Parameter("conditions") @Nullable List<APIServiceCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * Current service state of apiService.
     * 
    */
    public List<APIServiceCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(APIServiceStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<APIServiceCondition> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(APIServiceStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder conditions(@Nullable List<APIServiceCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(APIServiceCondition... conditions) {
            return conditions(List.of(conditions));
        }        public APIServiceStatus build() {
            return new APIServiceStatus(conditions);
        }
    }
}

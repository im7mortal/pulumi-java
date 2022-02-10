// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class VpcAccessibleServicesResponse {
    private final List<String> allowedServices;
    private final Boolean enableRestriction;

    @OutputCustomType.Constructor({"allowedServices","enableRestriction"})
    private VpcAccessibleServicesResponse(
        List<String> allowedServices,
        Boolean enableRestriction) {
        this.allowedServices = Objects.requireNonNull(allowedServices);
        this.enableRestriction = Objects.requireNonNull(enableRestriction);
    }

    public List<String> getAllowedServices() {
        return this.allowedServices;
    }
    public Boolean getEnableRestriction() {
        return this.enableRestriction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcAccessibleServicesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedServices;
        private Boolean enableRestriction;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcAccessibleServicesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedServices = defaults.allowedServices;
    	      this.enableRestriction = defaults.enableRestriction;
        }

        public Builder setAllowedServices(List<String> allowedServices) {
            this.allowedServices = Objects.requireNonNull(allowedServices);
            return this;
        }

        public Builder setEnableRestriction(Boolean enableRestriction) {
            this.enableRestriction = Objects.requireNonNull(enableRestriction);
            return this;
        }

        public VpcAccessibleServicesResponse build() {
            return new VpcAccessibleServicesResponse(allowedServices, enableRestriction);
        }
    }
}
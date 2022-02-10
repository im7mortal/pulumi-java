// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.accesscontextmanager_v1beta.outputs.VpcAccessibleServicesResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ServicePerimeterConfigResponse {
    private final List<String> accessLevels;
    private final List<String> resources;
    private final List<String> restrictedServices;
    private final VpcAccessibleServicesResponse vpcAccessibleServices;

    @OutputCustomType.Constructor({"accessLevels","resources","restrictedServices","vpcAccessibleServices"})
    private ServicePerimeterConfigResponse(
        List<String> accessLevels,
        List<String> resources,
        List<String> restrictedServices,
        VpcAccessibleServicesResponse vpcAccessibleServices) {
        this.accessLevels = Objects.requireNonNull(accessLevels);
        this.resources = Objects.requireNonNull(resources);
        this.restrictedServices = Objects.requireNonNull(restrictedServices);
        this.vpcAccessibleServices = Objects.requireNonNull(vpcAccessibleServices);
    }

    public List<String> getAccessLevels() {
        return this.accessLevels;
    }
    public List<String> getResources() {
        return this.resources;
    }
    public List<String> getRestrictedServices() {
        return this.restrictedServices;
    }
    public VpcAccessibleServicesResponse getVpcAccessibleServices() {
        return this.vpcAccessibleServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> accessLevels;
        private List<String> resources;
        private List<String> restrictedServices;
        private VpcAccessibleServicesResponse vpcAccessibleServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.resources = defaults.resources;
    	      this.restrictedServices = defaults.restrictedServices;
    	      this.vpcAccessibleServices = defaults.vpcAccessibleServices;
        }

        public Builder setAccessLevels(List<String> accessLevels) {
            this.accessLevels = Objects.requireNonNull(accessLevels);
            return this;
        }

        public Builder setResources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setRestrictedServices(List<String> restrictedServices) {
            this.restrictedServices = Objects.requireNonNull(restrictedServices);
            return this;
        }

        public Builder setVpcAccessibleServices(VpcAccessibleServicesResponse vpcAccessibleServices) {
            this.vpcAccessibleServices = Objects.requireNonNull(vpcAccessibleServices);
            return this;
        }

        public ServicePerimeterConfigResponse build() {
            return new ServicePerimeterConfigResponse(accessLevels, resources, restrictedServices, vpcAccessibleServices);
        }
    }
}
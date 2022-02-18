// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecEgressPolicyEgressToOperationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecEgressPolicyEgressToOperationArgs Empty = new ServicePerimeterSpecEgressPolicyEgressToOperationArgs();

    /**
     * API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    @InputImport(name="methodSelectors")
    private final @Nullable Input<List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors;

    public Input<List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs>> getMethodSelectors() {
        return this.methodSelectors == null ? Input.empty() : this.methodSelectors;
    }

    /**
     * The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    @InputImport(name="serviceName")
    private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    public ServicePerimeterSpecEgressPolicyEgressToOperationArgs(
        @Nullable Input<List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors,
        @Nullable Input<String> serviceName) {
        this.methodSelectors = methodSelectors;
        this.serviceName = serviceName;
    }

    private ServicePerimeterSpecEgressPolicyEgressToOperationArgs() {
        this.methodSelectors = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecEgressPolicyEgressToOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors;
        private @Nullable Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecEgressPolicyEgressToOperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodSelectors = defaults.methodSelectors;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setMethodSelectors(@Nullable Input<List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs>> methodSelectors) {
            this.methodSelectors = methodSelectors;
            return this;
        }

        public Builder setMethodSelectors(@Nullable List<ServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorArgs> methodSelectors) {
            this.methodSelectors = Input.ofNullable(methodSelectors);
            return this;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public ServicePerimeterSpecEgressPolicyEgressToOperationArgs build() {
            return new ServicePerimeterSpecEgressPolicyEgressToOperationArgs(methodSelectors, serviceName);
        }
    }
}
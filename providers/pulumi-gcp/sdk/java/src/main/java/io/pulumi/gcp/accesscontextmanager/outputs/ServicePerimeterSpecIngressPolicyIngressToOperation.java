// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterSpecIngressPolicyIngressToOperationMethodSelector;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePerimeterSpecIngressPolicyIngressToOperation {
    /**
     * API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServicePerimeterSpecIngressPolicyIngressToOperationMethodSelector> methodSelectors;
    /**
     * The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    private final @Nullable String serviceName;

    @OutputCustomType.Constructor({"methodSelectors","serviceName"})
    private ServicePerimeterSpecIngressPolicyIngressToOperation(
        @Nullable List<ServicePerimeterSpecIngressPolicyIngressToOperationMethodSelector> methodSelectors,
        @Nullable String serviceName) {
        this.methodSelectors = methodSelectors;
        this.serviceName = serviceName;
    }

    /**
     * API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
    */
    public List<ServicePerimeterSpecIngressPolicyIngressToOperationMethodSelector> getMethodSelectors() {
        return this.methodSelectors == null ? List.of() : this.methodSelectors;
    }
    /**
     * The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
    */
    public Optional<String> getServiceName() {
        return Optional.ofNullable(this.serviceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecIngressPolicyIngressToOperation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServicePerimeterSpecIngressPolicyIngressToOperationMethodSelector> methodSelectors;
        private @Nullable String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecIngressPolicyIngressToOperation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodSelectors = defaults.methodSelectors;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setMethodSelectors(@Nullable List<ServicePerimeterSpecIngressPolicyIngressToOperationMethodSelector> methodSelectors) {
            this.methodSelectors = methodSelectors;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public ServicePerimeterSpecIngressPolicyIngressToOperation build() {
            return new ServicePerimeterSpecIngressPolicyIngressToOperation(methodSelectors, serviceName);
        }
    }
}

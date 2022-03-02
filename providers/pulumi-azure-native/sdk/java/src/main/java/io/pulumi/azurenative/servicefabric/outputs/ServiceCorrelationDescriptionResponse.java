// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceCorrelationDescriptionResponse {
    /**
     * The ServiceCorrelationScheme which describes the relationship between this service and the service specified via ServiceName.
     * 
     */
    private final String scheme;
    /**
     * The name of the service that the correlation relationship is established with.
     * 
     */
    private final String serviceName;

    @OutputCustomType.Constructor({"scheme","serviceName"})
    private ServiceCorrelationDescriptionResponse(
        String scheme,
        String serviceName) {
        this.scheme = Objects.requireNonNull(scheme);
        this.serviceName = Objects.requireNonNull(serviceName);
    }

    /**
     * The ServiceCorrelationScheme which describes the relationship between this service and the service specified via ServiceName.
     * 
    */
    public String getScheme() {
        return this.scheme;
    }
    /**
     * The name of the service that the correlation relationship is established with.
     * 
    */
    public String getServiceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCorrelationDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheme;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCorrelationDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheme = defaults.scheme;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setScheme(String scheme) {
            this.scheme = Objects.requireNonNull(scheme);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public ServiceCorrelationDescriptionResponse build() {
            return new ServiceCorrelationDescriptionResponse(scheme, serviceName);
        }
    }
}

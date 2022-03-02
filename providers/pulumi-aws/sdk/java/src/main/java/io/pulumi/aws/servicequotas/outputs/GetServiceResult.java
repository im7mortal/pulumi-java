// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicequotas.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetServiceResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Code of the service.
     * 
     */
    private final String serviceCode;
    private final String serviceName;

    @OutputCustomType.Constructor({"id","serviceCode","serviceName"})
    private GetServiceResult(
        String id,
        String serviceCode,
        String serviceName) {
        this.id = Objects.requireNonNull(id);
        this.serviceCode = Objects.requireNonNull(serviceCode);
        this.serviceName = Objects.requireNonNull(serviceName);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Code of the service.
     * 
    */
    public String getServiceCode() {
        return this.serviceCode;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String serviceCode;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.serviceCode = defaults.serviceCode;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setServiceCode(String serviceCode) {
            this.serviceCode = Objects.requireNonNull(serviceCode);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetServiceResult build() {
            return new GetServiceResult(id, serviceCode, serviceName);
        }
    }
}

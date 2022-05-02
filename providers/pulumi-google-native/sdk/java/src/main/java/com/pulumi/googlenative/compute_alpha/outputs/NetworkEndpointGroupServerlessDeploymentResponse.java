// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkEndpointGroupServerlessDeploymentResponse {
    /**
     * @return The platform of the backend target(s) of this NEG. The only supported value is API Gateway: apigateway.googleapis.com.
     * 
     */
    private final String platform;
    /**
     * @return The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
     * 
     */
    private final String resource;
    /**
     * @return A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
     * 
     */
    private final String urlMask;
    /**
     * @return The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
     * 
     */
    private final String version;

    @CustomType.Constructor
    private NetworkEndpointGroupServerlessDeploymentResponse(
        @CustomType.Parameter("platform") String platform,
        @CustomType.Parameter("resource") String resource,
        @CustomType.Parameter("urlMask") String urlMask,
        @CustomType.Parameter("version") String version) {
        this.platform = platform;
        this.resource = resource;
        this.urlMask = urlMask;
        this.version = version;
    }

    /**
     * @return The platform of the backend target(s) of this NEG. The only supported value is API Gateway: apigateway.googleapis.com.
     * 
     */
    public String platform() {
        return this.platform;
    }
    /**
     * @return The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
     * 
     */
    public String resource() {
        return this.resource;
    }
    /**
     * @return A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
     * 
     */
    public String urlMask() {
        return this.urlMask;
    }
    /**
     * @return The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupServerlessDeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String platform;
        private String resource;
        private String urlMask;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupServerlessDeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.platform = defaults.platform;
    	      this.resource = defaults.resource;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder platform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }
        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public Builder urlMask(String urlMask) {
            this.urlMask = Objects.requireNonNull(urlMask);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public NetworkEndpointGroupServerlessDeploymentResponse build() {
            return new NetworkEndpointGroupServerlessDeploymentResponse(platform, resource, urlMask, version);
        }
    }
}

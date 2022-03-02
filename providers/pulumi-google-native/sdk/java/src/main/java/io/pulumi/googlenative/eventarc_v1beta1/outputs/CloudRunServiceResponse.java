// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudRunServiceResponse {
    /**
     * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: "/route", "route", "route/subroute".
     * 
     */
    private final String path;
    /**
     * The region the Cloud Run service is deployed in.
     * 
     */
    private final String region;
    /**
     * The name of the Cloud run service being addressed (see https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services). Only services located in the same project of the trigger object can be addressed.
     * 
     */
    private final String service;

    @OutputCustomType.Constructor({"path","region","service"})
    private CloudRunServiceResponse(
        String path,
        String region,
        String service) {
        this.path = Objects.requireNonNull(path);
        this.region = Objects.requireNonNull(region);
        this.service = Objects.requireNonNull(service);
    }

    /**
     * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: "/route", "route", "route/subroute".
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * The region the Cloud Run service is deployed in.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * The name of the Cloud run service being addressed (see https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services). Only services located in the same project of the trigger object can be addressed.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRunServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private String region;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudRunServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.region = defaults.region;
    	      this.service = defaults.service;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public CloudRunServiceResponse build() {
            return new CloudRunServiceResponse(path, region, service);
        }
    }
}

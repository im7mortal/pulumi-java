// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkEndpointGroupCloudRunResponse {
    /**
     * Cloud Run service is the main resource of Cloud Run. The service must be 1-63 characters long, and comply with RFC1035. Example value: "run-service".
     * 
     */
    private final String service;
    /**
     * Optional Cloud Run tag represents the "named-revision" to provide additional fine-grained traffic routing information. The tag must be 1-63 characters long, and comply with RFC1035. Example value: "revision-0010".
     * 
     */
    private final String tag;
    /**
     * A template to parse service and tag fields from a request URL. URL mask allows for routing to multiple Run services without having to create multiple network endpoint groups and backend services. For example, request URLs "foo1.domain.com/bar1" and "foo1.domain.com/bar2" can be backed by the same Serverless Network Endpoint Group (NEG) with URL mask ".domain.com/". The URL mask will parse them to { service="bar1", tag="foo1" } and { service="bar2", tag="foo2" } respectively.
     * 
     */
    private final String urlMask;

    @OutputCustomType.Constructor({"service","tag","urlMask"})
    private NetworkEndpointGroupCloudRunResponse(
        String service,
        String tag,
        String urlMask) {
        this.service = Objects.requireNonNull(service);
        this.tag = Objects.requireNonNull(tag);
        this.urlMask = Objects.requireNonNull(urlMask);
    }

    /**
     * Cloud Run service is the main resource of Cloud Run. The service must be 1-63 characters long, and comply with RFC1035. Example value: "run-service".
     * 
    */
    public String getService() {
        return this.service;
    }
    /**
     * Optional Cloud Run tag represents the "named-revision" to provide additional fine-grained traffic routing information. The tag must be 1-63 characters long, and comply with RFC1035. Example value: "revision-0010".
     * 
    */
    public String getTag() {
        return this.tag;
    }
    /**
     * A template to parse service and tag fields from a request URL. URL mask allows for routing to multiple Run services without having to create multiple network endpoint groups and backend services. For example, request URLs "foo1.domain.com/bar1" and "foo1.domain.com/bar2" can be backed by the same Serverless Network Endpoint Group (NEG) with URL mask ".domain.com/". The URL mask will parse them to { service="bar1", tag="foo1" } and { service="bar2", tag="foo2" } respectively.
     * 
    */
    public String getUrlMask() {
        return this.urlMask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupCloudRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String service;
        private String tag;
        private String urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupCloudRunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.tag = defaults.tag;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder setUrlMask(String urlMask) {
            this.urlMask = Objects.requireNonNull(urlMask);
            return this;
        }
        public NetworkEndpointGroupCloudRunResponse build() {
            return new NetworkEndpointGroupCloudRunResponse(service, tag, urlMask);
        }
    }
}

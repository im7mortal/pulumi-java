// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionNetworkEndpointGroupCloudRun {
    /**
     * Optional serving service.
     * The service name must be 1-63 characters long, and comply with RFC1035.
     * Example value: "default", "my-service".
     * 
     */
    private final @Nullable String service;
    /**
     * Cloud Run tag represents the "named-revision" to provide
     * additional fine-grained traffic routing information.
     * The tag must be 1-63 characters long, and comply with RFC1035.
     * Example value: "revision-0010".
     * 
     */
    private final @Nullable String tag;
    /**
     * A template to parse function field from a request URL. URL mask allows
     * for routing to multiple Cloud Functions without having to create
     * multiple Network Endpoint Groups and backend services.
     * For example, request URLs "mydomain.com/function1" and "mydomain.com/function2"
     * can be backed by the same Serverless NEG with URL mask "/". The URL mask
     * will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
     */
    private final @Nullable String urlMask;

    @OutputCustomType.Constructor({"service","tag","urlMask"})
    private RegionNetworkEndpointGroupCloudRun(
        @Nullable String service,
        @Nullable String tag,
        @Nullable String urlMask) {
        this.service = service;
        this.tag = tag;
        this.urlMask = urlMask;
    }

    /**
     * Optional serving service.
     * The service name must be 1-63 characters long, and comply with RFC1035.
     * Example value: "default", "my-service".
     * 
    */
    public Optional<String> getService() {
        return Optional.ofNullable(this.service);
    }
    /**
     * Cloud Run tag represents the "named-revision" to provide
     * additional fine-grained traffic routing information.
     * The tag must be 1-63 characters long, and comply with RFC1035.
     * Example value: "revision-0010".
     * 
    */
    public Optional<String> getTag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * A template to parse function field from a request URL. URL mask allows
     * for routing to multiple Cloud Functions without having to create
     * multiple Network Endpoint Groups and backend services.
     * For example, request URLs "mydomain.com/function1" and "mydomain.com/function2"
     * can be backed by the same Serverless NEG with URL mask "/". The URL mask
     * will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
    */
    public Optional<String> getUrlMask() {
        return Optional.ofNullable(this.urlMask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupCloudRun defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String service;
        private @Nullable String tag;
        private @Nullable String urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupCloudRun defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.tag = defaults.tag;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder setService(@Nullable String service) {
            this.service = service;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }

        public Builder setUrlMask(@Nullable String urlMask) {
            this.urlMask = urlMask;
            return this;
        }
        public RegionNetworkEndpointGroupCloudRun build() {
            return new RegionNetworkEndpointGroupCloudRun(service, tag, urlMask);
        }
    }
}

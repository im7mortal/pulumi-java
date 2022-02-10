// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RouteInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouteInfoResponse Empty = new RouteInfoResponse();

    @InputImport(name="destIpRange", required=true)
    private final String destIpRange;

    public String getDestIpRange() {
        return this.destIpRange;
    }

    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="instanceTags", required=true)
    private final List<String> instanceTags;

    public List<String> getInstanceTags() {
        return this.instanceTags;
    }

    @InputImport(name="networkUri", required=true)
    private final String networkUri;

    public String getNetworkUri() {
        return this.networkUri;
    }

    @InputImport(name="nextHop", required=true)
    private final String nextHop;

    public String getNextHop() {
        return this.nextHop;
    }

    @InputImport(name="nextHopType", required=true)
    private final String nextHopType;

    public String getNextHopType() {
        return this.nextHopType;
    }

    @InputImport(name="priority", required=true)
    private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    @InputImport(name="routeType", required=true)
    private final String routeType;

    public String getRouteType() {
        return this.routeType;
    }

    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    public RouteInfoResponse(
        String destIpRange,
        String displayName,
        List<String> instanceTags,
        String networkUri,
        String nextHop,
        String nextHopType,
        Integer priority,
        String routeType,
        String uri) {
        this.destIpRange = Objects.requireNonNull(destIpRange, "expected parameter 'destIpRange' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.instanceTags = Objects.requireNonNull(instanceTags, "expected parameter 'instanceTags' to be non-null");
        this.networkUri = Objects.requireNonNull(networkUri, "expected parameter 'networkUri' to be non-null");
        this.nextHop = Objects.requireNonNull(nextHop, "expected parameter 'nextHop' to be non-null");
        this.nextHopType = Objects.requireNonNull(nextHopType, "expected parameter 'nextHopType' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.routeType = Objects.requireNonNull(routeType, "expected parameter 'routeType' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private RouteInfoResponse() {
        this.destIpRange = null;
        this.displayName = null;
        this.instanceTags = List.of();
        this.networkUri = null;
        this.nextHop = null;
        this.nextHopType = null;
        this.priority = null;
        this.routeType = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destIpRange;
        private String displayName;
        private List<String> instanceTags;
        private String networkUri;
        private String nextHop;
        private String nextHopType;
        private Integer priority;
        private String routeType;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRange = defaults.destIpRange;
    	      this.displayName = defaults.displayName;
    	      this.instanceTags = defaults.instanceTags;
    	      this.networkUri = defaults.networkUri;
    	      this.nextHop = defaults.nextHop;
    	      this.nextHopType = defaults.nextHopType;
    	      this.priority = defaults.priority;
    	      this.routeType = defaults.routeType;
    	      this.uri = defaults.uri;
        }

        public Builder setDestIpRange(String destIpRange) {
            this.destIpRange = Objects.requireNonNull(destIpRange);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setInstanceTags(List<String> instanceTags) {
            this.instanceTags = Objects.requireNonNull(instanceTags);
            return this;
        }

        public Builder setNetworkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder setNextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }

        public Builder setNextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRouteType(String routeType) {
            this.routeType = Objects.requireNonNull(routeType);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public RouteInfoResponse build() {
            return new RouteInfoResponse(destIpRange, displayName, instanceTags, networkUri, nextHop, nextHopType, priority, routeType, uri);
        }
    }
}
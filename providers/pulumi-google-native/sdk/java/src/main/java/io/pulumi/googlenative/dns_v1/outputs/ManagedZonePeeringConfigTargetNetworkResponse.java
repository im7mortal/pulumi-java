// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagedZonePeeringConfigTargetNetworkResponse {
    /**
     * The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
     * 
     */
    private final String deactivateTime;
    private final String kind;
    /**
     * The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    private final String networkUrl;

    @OutputCustomType.Constructor({"deactivateTime","kind","networkUrl"})
    private ManagedZonePeeringConfigTargetNetworkResponse(
        String deactivateTime,
        String kind,
        String networkUrl) {
        this.deactivateTime = Objects.requireNonNull(deactivateTime);
        this.kind = Objects.requireNonNull(kind);
        this.networkUrl = Objects.requireNonNull(networkUrl);
    }

    /**
     * The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
     * 
    */
    public String getDeactivateTime() {
        return this.deactivateTime;
    }
    public String getKind() {
        return this.kind;
    }
    /**
     * The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
    */
    public String getNetworkUrl() {
        return this.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigTargetNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deactivateTime;
        private String kind;
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigTargetNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deactivateTime = defaults.deactivateTime;
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder setDeactivateTime(String deactivateTime) {
            this.deactivateTime = Objects.requireNonNull(deactivateTime);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setNetworkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }
        public ManagedZonePeeringConfigTargetNetworkResponse build() {
            return new ManagedZonePeeringConfigTargetNetworkResponse(deactivateTime, kind, networkUrl);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PolicyNetwork {
    /**
     * The id or fully qualified URL of the VPC network to forward queries to.
     * This should be formatted like `projects/{project}/global/networks/{network}` or
     * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
     * 
     */
    private final String networkUrl;

    @OutputCustomType.Constructor({"networkUrl"})
    private PolicyNetwork(String networkUrl) {
        this.networkUrl = Objects.requireNonNull(networkUrl);
    }

    /**
     * The id or fully qualified URL of the VPC network to forward queries to.
     * This should be formatted like `projects/{project}/global/networks/{network}` or
     * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
     * 
    */
    public String getNetworkUrl() {
        return this.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder setNetworkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }
        public PolicyNetwork build() {
            return new PolicyNetwork(networkUrl);
        }
    }
}

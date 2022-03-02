// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterReleaseChannel {
    /**
     * The selected release channel.
     * Accepted values are:
     * * UNSPECIFIED: Not set.
     * * RAPID: Weekly upgrade cadence; Early testers and developers who requires new features.
     * * REGULAR: Multiple per month upgrade cadence; Production users who need features not yet offered in the Stable channel.
     * * STABLE: Every few months upgrade cadence; Production users who need stability above all else, and for whom frequent upgrades are too risky.
     * 
     */
    private final String channel;

    @OutputCustomType.Constructor({"channel"})
    private ClusterReleaseChannel(String channel) {
        this.channel = Objects.requireNonNull(channel);
    }

    /**
     * The selected release channel.
     * Accepted values are:
     * * UNSPECIFIED: Not set.
     * * RAPID: Weekly upgrade cadence; Early testers and developers who requires new features.
     * * REGULAR: Multiple per month upgrade cadence; Production users who need features not yet offered in the Stable channel.
     * * STABLE: Every few months upgrade cadence; Production users who need stability above all else, and for whom frequent upgrades are too risky.
     * 
    */
    public String getChannel() {
        return this.channel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterReleaseChannel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channel;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterReleaseChannel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
        }

        public Builder setChannel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }
        public ClusterReleaseChannel build() {
            return new ClusterReleaseChannel(channel);
        }
    }
}

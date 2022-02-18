// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ScheduledActionPauseClusterMessage {
    private final String clusterIdentifier;

    @OutputCustomType.Constructor({"clusterIdentifier"})
    private ScheduledActionPauseClusterMessage(String clusterIdentifier) {
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
    }

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionPauseClusterMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionPauseClusterMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public ScheduledActionPauseClusterMessage build() {
            return new ScheduledActionPauseClusterMessage(clusterIdentifier);
        }
    }
}
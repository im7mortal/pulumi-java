// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterLogging {
    /**
     * The cluster control plane logging configuration for your cluster.
     * 
     */
    private final @Nullable ClusterLogging clusterLogging;

    @OutputCustomType.Constructor({"clusterLogging"})
    private ClusterLogging(@Nullable ClusterLogging clusterLogging) {
        this.clusterLogging = clusterLogging;
    }

    /**
     * The cluster control plane logging configuration for your cluster.
     * 
    */
    public Optional<ClusterLogging> getClusterLogging() {
        return Optional.ofNullable(this.clusterLogging);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterLogging clusterLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLogging = defaults.clusterLogging;
        }

        public Builder setClusterLogging(@Nullable ClusterLogging clusterLogging) {
            this.clusterLogging = clusterLogging;
            return this;
        }
        public ClusterLogging build() {
            return new ClusterLogging(clusterLogging);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.outputs.ClusterCapacityProviderStrategyItem;
import io.pulumi.awsnative.ecs.outputs.ClusterConfiguration;
import io.pulumi.awsnative.ecs.outputs.ClusterSettings;
import io.pulumi.awsnative.ecs.outputs.ClusterTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterResult {
    /**
     * The Amazon Resource Name (ARN) of the Amazon ECS cluster, such as arn:aws:ecs:us-east-2:123456789012:cluster/MyECSCluster.
     * 
     */
    private final @Nullable String arn;
    private final @Nullable List<String> capacityProviders;
    private final @Nullable List<ClusterSettings> clusterSettings;
    private final @Nullable ClusterConfiguration configuration;
    private final @Nullable List<ClusterCapacityProviderStrategyItem> defaultCapacityProviderStrategy;
    private final @Nullable List<ClusterTag> tags;

    @OutputCustomType.Constructor({"arn","capacityProviders","clusterSettings","configuration","defaultCapacityProviderStrategy","tags"})
    private GetClusterResult(
        @Nullable String arn,
        @Nullable List<String> capacityProviders,
        @Nullable List<ClusterSettings> clusterSettings,
        @Nullable ClusterConfiguration configuration,
        @Nullable List<ClusterCapacityProviderStrategyItem> defaultCapacityProviderStrategy,
        @Nullable List<ClusterTag> tags) {
        this.arn = arn;
        this.capacityProviders = capacityProviders;
        this.clusterSettings = clusterSettings;
        this.configuration = configuration;
        this.defaultCapacityProviderStrategy = defaultCapacityProviderStrategy;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon ECS cluster, such as arn:aws:ecs:us-east-2:123456789012:cluster/MyECSCluster.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<String> getCapacityProviders() {
        return this.capacityProviders == null ? List.of() : this.capacityProviders;
    }
    public List<ClusterSettings> getClusterSettings() {
        return this.clusterSettings == null ? List.of() : this.clusterSettings;
    }
    public Optional<ClusterConfiguration> getConfiguration() {
        return Optional.ofNullable(this.configuration);
    }
    public List<ClusterCapacityProviderStrategyItem> getDefaultCapacityProviderStrategy() {
        return this.defaultCapacityProviderStrategy == null ? List.of() : this.defaultCapacityProviderStrategy;
    }
    public List<ClusterTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<String> capacityProviders;
        private @Nullable List<ClusterSettings> clusterSettings;
        private @Nullable ClusterConfiguration configuration;
        private @Nullable List<ClusterCapacityProviderStrategyItem> defaultCapacityProviderStrategy;
        private @Nullable List<ClusterTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.capacityProviders = defaults.capacityProviders;
    	      this.clusterSettings = defaults.clusterSettings;
    	      this.configuration = defaults.configuration;
    	      this.defaultCapacityProviderStrategy = defaults.defaultCapacityProviderStrategy;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCapacityProviders(@Nullable List<String> capacityProviders) {
            this.capacityProviders = capacityProviders;
            return this;
        }

        public Builder setClusterSettings(@Nullable List<ClusterSettings> clusterSettings) {
            this.clusterSettings = clusterSettings;
            return this;
        }

        public Builder setConfiguration(@Nullable ClusterConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setDefaultCapacityProviderStrategy(@Nullable List<ClusterCapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy = defaultCapacityProviderStrategy;
            return this;
        }

        public Builder setTags(@Nullable List<ClusterTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(arn, capacityProviders, clusterSettings, configuration, defaultCapacityProviderStrategy, tags);
        }
    }
}

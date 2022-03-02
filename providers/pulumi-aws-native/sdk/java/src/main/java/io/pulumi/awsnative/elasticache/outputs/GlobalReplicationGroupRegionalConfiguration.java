// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache.outputs;

import io.pulumi.awsnative.elasticache.outputs.GlobalReplicationGroupReshardingConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlobalReplicationGroupRegionalConfiguration {
    /**
     * The replication group id of the Global Datastore member.
     * 
     */
    private final @Nullable String replicationGroupId;
    /**
     * The AWS region of the Global Datastore member.
     * 
     */
    private final @Nullable String replicationGroupRegion;
    /**
     * A list of PreferredAvailabilityZones objects that specifies the configuration of a node group in the resharded cluster.
     * 
     */
    private final @Nullable List<GlobalReplicationGroupReshardingConfiguration> reshardingConfigurations;

    @OutputCustomType.Constructor({"replicationGroupId","replicationGroupRegion","reshardingConfigurations"})
    private GlobalReplicationGroupRegionalConfiguration(
        @Nullable String replicationGroupId,
        @Nullable String replicationGroupRegion,
        @Nullable List<GlobalReplicationGroupReshardingConfiguration> reshardingConfigurations) {
        this.replicationGroupId = replicationGroupId;
        this.replicationGroupRegion = replicationGroupRegion;
        this.reshardingConfigurations = reshardingConfigurations;
    }

    /**
     * The replication group id of the Global Datastore member.
     * 
    */
    public Optional<String> getReplicationGroupId() {
        return Optional.ofNullable(this.replicationGroupId);
    }
    /**
     * The AWS region of the Global Datastore member.
     * 
    */
    public Optional<String> getReplicationGroupRegion() {
        return Optional.ofNullable(this.replicationGroupRegion);
    }
    /**
     * A list of PreferredAvailabilityZones objects that specifies the configuration of a node group in the resharded cluster.
     * 
    */
    public List<GlobalReplicationGroupReshardingConfiguration> getReshardingConfigurations() {
        return this.reshardingConfigurations == null ? List.of() : this.reshardingConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalReplicationGroupRegionalConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String replicationGroupId;
        private @Nullable String replicationGroupRegion;
        private @Nullable List<GlobalReplicationGroupReshardingConfiguration> reshardingConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalReplicationGroupRegionalConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationGroupId = defaults.replicationGroupId;
    	      this.replicationGroupRegion = defaults.replicationGroupRegion;
    	      this.reshardingConfigurations = defaults.reshardingConfigurations;
        }

        public Builder setReplicationGroupId(@Nullable String replicationGroupId) {
            this.replicationGroupId = replicationGroupId;
            return this;
        }

        public Builder setReplicationGroupRegion(@Nullable String replicationGroupRegion) {
            this.replicationGroupRegion = replicationGroupRegion;
            return this;
        }

        public Builder setReshardingConfigurations(@Nullable List<GlobalReplicationGroupReshardingConfiguration> reshardingConfigurations) {
            this.reshardingConfigurations = reshardingConfigurations;
            return this;
        }
        public GlobalReplicationGroupRegionalConfiguration build() {
            return new GlobalReplicationGroupRegionalConfiguration(replicationGroupId, replicationGroupRegion, reshardingConfigurations);
        }
    }
}

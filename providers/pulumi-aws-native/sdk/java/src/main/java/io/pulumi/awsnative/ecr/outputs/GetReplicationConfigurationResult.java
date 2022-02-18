// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.outputs;

import io.pulumi.awsnative.ecr.outputs.ReplicationConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetReplicationConfigurationResult {
    /**
     * The RegistryId associated with the aws account.
     * 
     */
    private final @Nullable String registryId;
    private final @Nullable ReplicationConfiguration replicationConfiguration;

    @OutputCustomType.Constructor({"registryId","replicationConfiguration"})
    private GetReplicationConfigurationResult(
        @Nullable String registryId,
        @Nullable ReplicationConfiguration replicationConfiguration) {
        this.registryId = registryId;
        this.replicationConfiguration = replicationConfiguration;
    }

    /**
     * The RegistryId associated with the aws account.
     * 
     */
    public Optional<String> getRegistryId() {
        return Optional.ofNullable(this.registryId);
    }
    public Optional<ReplicationConfiguration> getReplicationConfiguration() {
        return Optional.ofNullable(this.replicationConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String registryId;
        private @Nullable ReplicationConfiguration replicationConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryId = defaults.registryId;
    	      this.replicationConfiguration = defaults.replicationConfiguration;
        }

        public Builder setRegistryId(@Nullable String registryId) {
            this.registryId = registryId;
            return this;
        }

        public Builder setReplicationConfiguration(@Nullable ReplicationConfiguration replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }

        public GetReplicationConfigurationResult build() {
            return new GetReplicationConfigurationResult(registryId, replicationConfiguration);
        }
    }
}

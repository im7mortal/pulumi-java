// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class ReplicationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationArgs Empty = new ReplicationConfigurationArgs();

    @InputImport(name="replicationConfiguration", required=true)
    private final Input<io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationArgs> replicationConfiguration;

    public Input<io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationArgs> getReplicationConfiguration() {
        return this.replicationConfiguration;
    }

    public ReplicationConfigurationArgs(Input<io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationArgs> replicationConfiguration) {
        this.replicationConfiguration = Objects.requireNonNull(replicationConfiguration, "expected parameter 'replicationConfiguration' to be non-null");
    }

    private ReplicationConfigurationArgs() {
        this.replicationConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationArgs> replicationConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationConfiguration = defaults.replicationConfiguration;
        }

        public Builder setReplicationConfiguration(Input<io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationArgs> replicationConfiguration) {
            this.replicationConfiguration = Objects.requireNonNull(replicationConfiguration);
            return this;
        }

        public Builder setReplicationConfiguration(io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationArgs replicationConfiguration) {
            this.replicationConfiguration = Input.of(Objects.requireNonNull(replicationConfiguration));
            return this;
        }

        public ReplicationConfigurationArgs build() {
            return new ReplicationConfigurationArgs(replicationConfiguration);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.aws.ecs.outputs.ClusterConfigurationExecuteCommandConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterConfiguration {
    /**
     * The details of the execute command configuration. Detailed below.
     * 
     */
    private final @Nullable ClusterConfigurationExecuteCommandConfiguration executeCommandConfiguration;

    @OutputCustomType.Constructor({"executeCommandConfiguration"})
    private ClusterConfiguration(@Nullable ClusterConfigurationExecuteCommandConfiguration executeCommandConfiguration) {
        this.executeCommandConfiguration = executeCommandConfiguration;
    }

    /**
     * The details of the execute command configuration. Detailed below.
     * 
    */
    public Optional<ClusterConfigurationExecuteCommandConfiguration> getExecuteCommandConfiguration() {
        return Optional.ofNullable(this.executeCommandConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterConfigurationExecuteCommandConfiguration executeCommandConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeCommandConfiguration = defaults.executeCommandConfiguration;
        }

        public Builder setExecuteCommandConfiguration(@Nullable ClusterConfigurationExecuteCommandConfiguration executeCommandConfiguration) {
            this.executeCommandConfiguration = executeCommandConfiguration;
            return this;
        }
        public ClusterConfiguration build() {
            return new ClusterConfiguration(executeCommandConfiguration);
        }
    }
}

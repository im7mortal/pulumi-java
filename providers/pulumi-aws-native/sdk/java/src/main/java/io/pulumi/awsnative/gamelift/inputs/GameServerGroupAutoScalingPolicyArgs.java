// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.awsnative.gamelift.inputs.GameServerGroupTargetTrackingConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting
 * 
 */
public final class GameServerGroupAutoScalingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerGroupAutoScalingPolicyArgs Empty = new GameServerGroupAutoScalingPolicyArgs();

    @InputImport(name="estimatedInstanceWarmup")
    private final @Nullable Input<Double> estimatedInstanceWarmup;

    public Input<Double> getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup == null ? Input.empty() : this.estimatedInstanceWarmup;
    }

    @InputImport(name="targetTrackingConfiguration", required=true)
    private final Input<GameServerGroupTargetTrackingConfigurationArgs> targetTrackingConfiguration;

    public Input<GameServerGroupTargetTrackingConfigurationArgs> getTargetTrackingConfiguration() {
        return this.targetTrackingConfiguration;
    }

    public GameServerGroupAutoScalingPolicyArgs(
        @Nullable Input<Double> estimatedInstanceWarmup,
        Input<GameServerGroupTargetTrackingConfigurationArgs> targetTrackingConfiguration) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        this.targetTrackingConfiguration = Objects.requireNonNull(targetTrackingConfiguration, "expected parameter 'targetTrackingConfiguration' to be non-null");
    }

    private GameServerGroupAutoScalingPolicyArgs() {
        this.estimatedInstanceWarmup = Input.empty();
        this.targetTrackingConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupAutoScalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> estimatedInstanceWarmup;
        private Input<GameServerGroupTargetTrackingConfigurationArgs> targetTrackingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerGroupAutoScalingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.estimatedInstanceWarmup = defaults.estimatedInstanceWarmup;
    	      this.targetTrackingConfiguration = defaults.targetTrackingConfiguration;
        }

        public Builder setEstimatedInstanceWarmup(@Nullable Input<Double> estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        public Builder setEstimatedInstanceWarmup(@Nullable Double estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = Input.ofNullable(estimatedInstanceWarmup);
            return this;
        }

        public Builder setTargetTrackingConfiguration(Input<GameServerGroupTargetTrackingConfigurationArgs> targetTrackingConfiguration) {
            this.targetTrackingConfiguration = Objects.requireNonNull(targetTrackingConfiguration);
            return this;
        }

        public Builder setTargetTrackingConfiguration(GameServerGroupTargetTrackingConfigurationArgs targetTrackingConfiguration) {
            this.targetTrackingConfiguration = Input.of(Objects.requireNonNull(targetTrackingConfiguration));
            return this;
        }

        public GameServerGroupAutoScalingPolicyArgs build() {
            return new GameServerGroupAutoScalingPolicyArgs(estimatedInstanceWarmup, targetTrackingConfiguration);
        }
    }
}

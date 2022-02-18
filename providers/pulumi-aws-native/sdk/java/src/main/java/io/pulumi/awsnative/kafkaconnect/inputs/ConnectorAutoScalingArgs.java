// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorScaleInPolicyArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorScaleOutPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Details about auto scaling of a connector.
 * 
 */
public final class ConnectorAutoScalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorAutoScalingArgs Empty = new ConnectorAutoScalingArgs();

    /**
     * The maximum number of workers for a connector.
     * 
     */
    @InputImport(name="maxWorkerCount", required=true)
    private final Input<Integer> maxWorkerCount;

    public Input<Integer> getMaxWorkerCount() {
        return this.maxWorkerCount;
    }

    /**
     * Specifies how many MSK Connect Units (MCU) as the minimum scaling unit.
     * 
     */
    @InputImport(name="mcuCount", required=true)
    private final Input<Integer> mcuCount;

    public Input<Integer> getMcuCount() {
        return this.mcuCount;
    }

    /**
     * The minimum number of workers for a connector.
     * 
     */
    @InputImport(name="minWorkerCount", required=true)
    private final Input<Integer> minWorkerCount;

    public Input<Integer> getMinWorkerCount() {
        return this.minWorkerCount;
    }

    @InputImport(name="scaleInPolicy", required=true)
    private final Input<ConnectorScaleInPolicyArgs> scaleInPolicy;

    public Input<ConnectorScaleInPolicyArgs> getScaleInPolicy() {
        return this.scaleInPolicy;
    }

    @InputImport(name="scaleOutPolicy", required=true)
    private final Input<ConnectorScaleOutPolicyArgs> scaleOutPolicy;

    public Input<ConnectorScaleOutPolicyArgs> getScaleOutPolicy() {
        return this.scaleOutPolicy;
    }

    public ConnectorAutoScalingArgs(
        Input<Integer> maxWorkerCount,
        Input<Integer> mcuCount,
        Input<Integer> minWorkerCount,
        Input<ConnectorScaleInPolicyArgs> scaleInPolicy,
        Input<ConnectorScaleOutPolicyArgs> scaleOutPolicy) {
        this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount, "expected parameter 'maxWorkerCount' to be non-null");
        this.mcuCount = Objects.requireNonNull(mcuCount, "expected parameter 'mcuCount' to be non-null");
        this.minWorkerCount = Objects.requireNonNull(minWorkerCount, "expected parameter 'minWorkerCount' to be non-null");
        this.scaleInPolicy = Objects.requireNonNull(scaleInPolicy, "expected parameter 'scaleInPolicy' to be non-null");
        this.scaleOutPolicy = Objects.requireNonNull(scaleOutPolicy, "expected parameter 'scaleOutPolicy' to be non-null");
    }

    private ConnectorAutoScalingArgs() {
        this.maxWorkerCount = Input.empty();
        this.mcuCount = Input.empty();
        this.minWorkerCount = Input.empty();
        this.scaleInPolicy = Input.empty();
        this.scaleOutPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorAutoScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxWorkerCount;
        private Input<Integer> mcuCount;
        private Input<Integer> minWorkerCount;
        private Input<ConnectorScaleInPolicyArgs> scaleInPolicy;
        private Input<ConnectorScaleOutPolicyArgs> scaleOutPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorAutoScalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxWorkerCount = defaults.maxWorkerCount;
    	      this.mcuCount = defaults.mcuCount;
    	      this.minWorkerCount = defaults.minWorkerCount;
    	      this.scaleInPolicy = defaults.scaleInPolicy;
    	      this.scaleOutPolicy = defaults.scaleOutPolicy;
        }

        public Builder setMaxWorkerCount(Input<Integer> maxWorkerCount) {
            this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount);
            return this;
        }

        public Builder setMaxWorkerCount(Integer maxWorkerCount) {
            this.maxWorkerCount = Input.of(Objects.requireNonNull(maxWorkerCount));
            return this;
        }

        public Builder setMcuCount(Input<Integer> mcuCount) {
            this.mcuCount = Objects.requireNonNull(mcuCount);
            return this;
        }

        public Builder setMcuCount(Integer mcuCount) {
            this.mcuCount = Input.of(Objects.requireNonNull(mcuCount));
            return this;
        }

        public Builder setMinWorkerCount(Input<Integer> minWorkerCount) {
            this.minWorkerCount = Objects.requireNonNull(minWorkerCount);
            return this;
        }

        public Builder setMinWorkerCount(Integer minWorkerCount) {
            this.minWorkerCount = Input.of(Objects.requireNonNull(minWorkerCount));
            return this;
        }

        public Builder setScaleInPolicy(Input<ConnectorScaleInPolicyArgs> scaleInPolicy) {
            this.scaleInPolicy = Objects.requireNonNull(scaleInPolicy);
            return this;
        }

        public Builder setScaleInPolicy(ConnectorScaleInPolicyArgs scaleInPolicy) {
            this.scaleInPolicy = Input.of(Objects.requireNonNull(scaleInPolicy));
            return this;
        }

        public Builder setScaleOutPolicy(Input<ConnectorScaleOutPolicyArgs> scaleOutPolicy) {
            this.scaleOutPolicy = Objects.requireNonNull(scaleOutPolicy);
            return this;
        }

        public Builder setScaleOutPolicy(ConnectorScaleOutPolicyArgs scaleOutPolicy) {
            this.scaleOutPolicy = Input.of(Objects.requireNonNull(scaleOutPolicy));
            return this;
        }

        public ConnectorAutoScalingArgs build() {
            return new ConnectorAutoScalingArgs(maxWorkerCount, mcuCount, minWorkerCount, scaleInPolicy, scaleOutPolicy);
        }
    }
}
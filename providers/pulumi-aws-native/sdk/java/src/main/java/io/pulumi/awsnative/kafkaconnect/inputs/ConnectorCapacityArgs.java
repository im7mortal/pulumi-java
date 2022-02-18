// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorAutoScalingArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorProvisionedCapacityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the capacity allocated to the connector.
 * 
 */
public final class ConnectorCapacityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorCapacityArgs Empty = new ConnectorCapacityArgs();

    @InputImport(name="autoScaling")
    private final @Nullable Input<ConnectorAutoScalingArgs> autoScaling;

    public Input<ConnectorAutoScalingArgs> getAutoScaling() {
        return this.autoScaling == null ? Input.empty() : this.autoScaling;
    }

    @InputImport(name="provisionedCapacity")
    private final @Nullable Input<ConnectorProvisionedCapacityArgs> provisionedCapacity;

    public Input<ConnectorProvisionedCapacityArgs> getProvisionedCapacity() {
        return this.provisionedCapacity == null ? Input.empty() : this.provisionedCapacity;
    }

    public ConnectorCapacityArgs(
        @Nullable Input<ConnectorAutoScalingArgs> autoScaling,
        @Nullable Input<ConnectorProvisionedCapacityArgs> provisionedCapacity) {
        this.autoScaling = autoScaling;
        this.provisionedCapacity = provisionedCapacity;
    }

    private ConnectorCapacityArgs() {
        this.autoScaling = Input.empty();
        this.provisionedCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConnectorAutoScalingArgs> autoScaling;
        private @Nullable Input<ConnectorProvisionedCapacityArgs> provisionedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCapacityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScaling = defaults.autoScaling;
    	      this.provisionedCapacity = defaults.provisionedCapacity;
        }

        public Builder setAutoScaling(@Nullable Input<ConnectorAutoScalingArgs> autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }

        public Builder setAutoScaling(@Nullable ConnectorAutoScalingArgs autoScaling) {
            this.autoScaling = Input.ofNullable(autoScaling);
            return this;
        }

        public Builder setProvisionedCapacity(@Nullable Input<ConnectorProvisionedCapacityArgs> provisionedCapacity) {
            this.provisionedCapacity = provisionedCapacity;
            return this;
        }

        public Builder setProvisionedCapacity(@Nullable ConnectorProvisionedCapacityArgs provisionedCapacity) {
            this.provisionedCapacity = Input.ofNullable(provisionedCapacity);
            return this;
        }

        public ConnectorCapacityArgs build() {
            return new ConnectorCapacityArgs(autoScaling, provisionedCapacity);
        }
    }
}

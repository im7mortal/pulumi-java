// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowTriggerType;
import io.pulumi.awsnative.appflow.inputs.FlowScheduledTriggerPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger settings of the flow.
 * 
 */
public final class FlowTriggerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowTriggerConfigArgs Empty = new FlowTriggerConfigArgs();

    /**
     * Details required based on the type of trigger
     * 
     */
    @InputImport(name="triggerProperties")
    private final @Nullable Input<FlowScheduledTriggerPropertiesArgs> triggerProperties;

    public Input<FlowScheduledTriggerPropertiesArgs> getTriggerProperties() {
        return this.triggerProperties == null ? Input.empty() : this.triggerProperties;
    }

    /**
     * Trigger type of the flow
     * 
     */
    @InputImport(name="triggerType", required=true)
    private final Input<FlowTriggerType> triggerType;

    public Input<FlowTriggerType> getTriggerType() {
        return this.triggerType;
    }

    public FlowTriggerConfigArgs(
        @Nullable Input<FlowScheduledTriggerPropertiesArgs> triggerProperties,
        Input<FlowTriggerType> triggerType) {
        this.triggerProperties = triggerProperties;
        this.triggerType = Objects.requireNonNull(triggerType, "expected parameter 'triggerType' to be non-null");
    }

    private FlowTriggerConfigArgs() {
        this.triggerProperties = Input.empty();
        this.triggerType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTriggerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowScheduledTriggerPropertiesArgs> triggerProperties;
        private Input<FlowTriggerType> triggerType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTriggerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggerProperties = defaults.triggerProperties;
    	      this.triggerType = defaults.triggerType;
        }

        public Builder setTriggerProperties(@Nullable Input<FlowScheduledTriggerPropertiesArgs> triggerProperties) {
            this.triggerProperties = triggerProperties;
            return this;
        }

        public Builder setTriggerProperties(@Nullable FlowScheduledTriggerPropertiesArgs triggerProperties) {
            this.triggerProperties = Input.ofNullable(triggerProperties);
            return this;
        }

        public Builder setTriggerType(Input<FlowTriggerType> triggerType) {
            this.triggerType = Objects.requireNonNull(triggerType);
            return this;
        }

        public Builder setTriggerType(FlowTriggerType triggerType) {
            this.triggerType = Input.of(Objects.requireNonNull(triggerType));
            return this;
        }

        public FlowTriggerConfigArgs build() {
            return new FlowTriggerConfigArgs(triggerProperties, triggerType);
        }
    }
}

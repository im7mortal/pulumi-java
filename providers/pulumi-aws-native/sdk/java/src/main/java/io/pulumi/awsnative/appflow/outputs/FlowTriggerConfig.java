// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.FlowTriggerType;
import io.pulumi.awsnative.appflow.outputs.FlowScheduledTriggerProperties;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowTriggerConfig {
    /**
     * Details required based on the type of trigger
     * 
     */
    private final @Nullable FlowScheduledTriggerProperties triggerProperties;
    /**
     * Trigger type of the flow
     * 
     */
    private final FlowTriggerType triggerType;

    @OutputCustomType.Constructor({"triggerProperties","triggerType"})
    private FlowTriggerConfig(
        @Nullable FlowScheduledTriggerProperties triggerProperties,
        FlowTriggerType triggerType) {
        this.triggerProperties = triggerProperties;
        this.triggerType = Objects.requireNonNull(triggerType);
    }

    /**
     * Details required based on the type of trigger
     * 
     */
    public Optional<FlowScheduledTriggerProperties> getTriggerProperties() {
        return Optional.ofNullable(this.triggerProperties);
    }
    /**
     * Trigger type of the flow
     * 
     */
    public FlowTriggerType getTriggerType() {
        return this.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTriggerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowScheduledTriggerProperties triggerProperties;
        private FlowTriggerType triggerType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTriggerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggerProperties = defaults.triggerProperties;
    	      this.triggerType = defaults.triggerType;
        }

        public Builder setTriggerProperties(@Nullable FlowScheduledTriggerProperties triggerProperties) {
            this.triggerProperties = triggerProperties;
            return this;
        }

        public Builder setTriggerType(FlowTriggerType triggerType) {
            this.triggerType = Objects.requireNonNull(triggerType);
            return this;
        }

        public FlowTriggerConfig build() {
            return new FlowTriggerConfig(triggerProperties, triggerType);
        }
    }
}

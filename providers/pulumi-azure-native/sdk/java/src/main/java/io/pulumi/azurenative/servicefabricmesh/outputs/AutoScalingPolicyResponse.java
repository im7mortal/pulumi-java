// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.AddRemoveReplicaScalingMechanismResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.AverageLoadScalingTriggerResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AutoScalingPolicyResponse {
    /**
     * The mechanism that is used to scale when auto scaling operation is invoked.
     * 
     */
    private final AddRemoveReplicaScalingMechanismResponse mechanism;
    /**
     * The name of the auto scaling policy.
     * 
     */
    private final String name;
    /**
     * Determines when auto scaling operation will be invoked.
     * 
     */
    private final AverageLoadScalingTriggerResponse trigger;

    @OutputCustomType.Constructor({"mechanism","name","trigger"})
    private AutoScalingPolicyResponse(
        AddRemoveReplicaScalingMechanismResponse mechanism,
        String name,
        AverageLoadScalingTriggerResponse trigger) {
        this.mechanism = Objects.requireNonNull(mechanism);
        this.name = Objects.requireNonNull(name);
        this.trigger = Objects.requireNonNull(trigger);
    }

    /**
     * The mechanism that is used to scale when auto scaling operation is invoked.
     * 
    */
    public AddRemoveReplicaScalingMechanismResponse getMechanism() {
        return this.mechanism;
    }
    /**
     * The name of the auto scaling policy.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Determines when auto scaling operation will be invoked.
     * 
    */
    public AverageLoadScalingTriggerResponse getTrigger() {
        return this.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScalingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddRemoveReplicaScalingMechanismResponse mechanism;
        private String name;
        private AverageLoadScalingTriggerResponse trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScalingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mechanism = defaults.mechanism;
    	      this.name = defaults.name;
    	      this.trigger = defaults.trigger;
        }

        public Builder setMechanism(AddRemoveReplicaScalingMechanismResponse mechanism) {
            this.mechanism = Objects.requireNonNull(mechanism);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTrigger(AverageLoadScalingTriggerResponse trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }
        public AutoScalingPolicyResponse build() {
            return new AutoScalingPolicyResponse(mechanism, name, trigger);
        }
    }
}

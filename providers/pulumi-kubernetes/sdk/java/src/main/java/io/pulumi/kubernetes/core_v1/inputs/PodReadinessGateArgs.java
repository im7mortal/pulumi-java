// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * PodReadinessGate contains the reference to a pod condition
 * 
 */
public final class PodReadinessGateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodReadinessGateArgs Empty = new PodReadinessGateArgs();

    /**
     * ConditionType refers to a condition in the pod's condition list with matching type.
     * 
     * Possible enum values:
     *  - `"ContainersReady"` indicates whether all containers in the pod are ready.
     *  - `"Initialized"` means that all init containers in the pod have started successfully.
     *  - `"PodScheduled"` represents status of the scheduling process for this pod.
     *  - `"Ready"` means the pod is able to service requests and should be added to the load balancing pools of all matching services.
     * 
     */
    @InputImport(name="conditionType", required=true)
    private final Input<String> conditionType;

    public Input<String> getConditionType() {
        return this.conditionType;
    }

    public PodReadinessGateArgs(Input<String> conditionType) {
        this.conditionType = Objects.requireNonNull(conditionType, "expected parameter 'conditionType' to be non-null");
    }

    private PodReadinessGateArgs() {
        this.conditionType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodReadinessGateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> conditionType;

        public Builder() {
    	      // Empty
        }

        public Builder(PodReadinessGateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionType = defaults.conditionType;
        }

        public Builder setConditionType(Input<String> conditionType) {
            this.conditionType = Objects.requireNonNull(conditionType);
            return this;
        }

        public Builder setConditionType(String conditionType) {
            this.conditionType = Input.of(Objects.requireNonNull(conditionType));
            return this;
        }

        public PodReadinessGateArgs build() {
            return new PodReadinessGateArgs(conditionType);
        }
    }
}

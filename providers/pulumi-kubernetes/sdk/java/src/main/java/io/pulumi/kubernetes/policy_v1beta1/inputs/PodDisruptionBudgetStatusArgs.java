// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.ConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
 * 
 */
public final class PodDisruptionBudgetStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodDisruptionBudgetStatusArgs Empty = new PodDisruptionBudgetStatusArgs();

    /**
     * Conditions contain conditions for PDB. The disruption controller sets the DisruptionAllowed condition. The following are known values for the reason field (additional reasons could be added in the future): - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<ConditionArgs>> conditions;

    public Input<List<ConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * current number of healthy pods
     * 
     */
    @InputImport(name="currentHealthy", required=true)
    private final Input<Integer> currentHealthy;

    public Input<Integer> getCurrentHealthy() {
        return this.currentHealthy;
    }

    /**
     * minimum desired number of healthy pods
     * 
     */
    @InputImport(name="desiredHealthy", required=true)
    private final Input<Integer> desiredHealthy;

    public Input<Integer> getDesiredHealthy() {
        return this.desiredHealthy;
    }

    /**
     * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
     * 
     */
    @InputImport(name="disruptedPods")
    private final @Nullable Input<Map<String,String>> disruptedPods;

    public Input<Map<String,String>> getDisruptedPods() {
        return this.disruptedPods == null ? Input.empty() : this.disruptedPods;
    }

    /**
     * Number of pod disruptions that are currently allowed.
     * 
     */
    @InputImport(name="disruptionsAllowed", required=true)
    private final Input<Integer> disruptionsAllowed;

    public Input<Integer> getDisruptionsAllowed() {
        return this.disruptionsAllowed;
    }

    /**
     * total number of pods counted by this disruption budget
     * 
     */
    @InputImport(name="expectedPods", required=true)
    private final Input<Integer> expectedPods;

    public Input<Integer> getExpectedPods() {
        return this.expectedPods;
    }

    /**
     * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.
     * 
     */
    @InputImport(name="observedGeneration")
    private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    public PodDisruptionBudgetStatusArgs(
        @Nullable Input<List<ConditionArgs>> conditions,
        Input<Integer> currentHealthy,
        Input<Integer> desiredHealthy,
        @Nullable Input<Map<String,String>> disruptedPods,
        Input<Integer> disruptionsAllowed,
        Input<Integer> expectedPods,
        @Nullable Input<Integer> observedGeneration) {
        this.conditions = conditions;
        this.currentHealthy = Objects.requireNonNull(currentHealthy, "expected parameter 'currentHealthy' to be non-null");
        this.desiredHealthy = Objects.requireNonNull(desiredHealthy, "expected parameter 'desiredHealthy' to be non-null");
        this.disruptedPods = disruptedPods;
        this.disruptionsAllowed = Objects.requireNonNull(disruptionsAllowed, "expected parameter 'disruptionsAllowed' to be non-null");
        this.expectedPods = Objects.requireNonNull(expectedPods, "expected parameter 'expectedPods' to be non-null");
        this.observedGeneration = observedGeneration;
    }

    private PodDisruptionBudgetStatusArgs() {
        this.conditions = Input.empty();
        this.currentHealthy = Input.empty();
        this.desiredHealthy = Input.empty();
        this.disruptedPods = Input.empty();
        this.disruptionsAllowed = Input.empty();
        this.expectedPods = Input.empty();
        this.observedGeneration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodDisruptionBudgetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ConditionArgs>> conditions;
        private Input<Integer> currentHealthy;
        private Input<Integer> desiredHealthy;
        private @Nullable Input<Map<String,String>> disruptedPods;
        private Input<Integer> disruptionsAllowed;
        private Input<Integer> expectedPods;
        private @Nullable Input<Integer> observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(PodDisruptionBudgetStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentHealthy = defaults.currentHealthy;
    	      this.desiredHealthy = defaults.desiredHealthy;
    	      this.disruptedPods = defaults.disruptedPods;
    	      this.disruptionsAllowed = defaults.disruptionsAllowed;
    	      this.expectedPods = defaults.expectedPods;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder setConditions(@Nullable Input<List<ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<ConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setCurrentHealthy(Input<Integer> currentHealthy) {
            this.currentHealthy = Objects.requireNonNull(currentHealthy);
            return this;
        }

        public Builder setCurrentHealthy(Integer currentHealthy) {
            this.currentHealthy = Input.of(Objects.requireNonNull(currentHealthy));
            return this;
        }

        public Builder setDesiredHealthy(Input<Integer> desiredHealthy) {
            this.desiredHealthy = Objects.requireNonNull(desiredHealthy);
            return this;
        }

        public Builder setDesiredHealthy(Integer desiredHealthy) {
            this.desiredHealthy = Input.of(Objects.requireNonNull(desiredHealthy));
            return this;
        }

        public Builder setDisruptedPods(@Nullable Input<Map<String,String>> disruptedPods) {
            this.disruptedPods = disruptedPods;
            return this;
        }

        public Builder setDisruptedPods(@Nullable Map<String,String> disruptedPods) {
            this.disruptedPods = Input.ofNullable(disruptedPods);
            return this;
        }

        public Builder setDisruptionsAllowed(Input<Integer> disruptionsAllowed) {
            this.disruptionsAllowed = Objects.requireNonNull(disruptionsAllowed);
            return this;
        }

        public Builder setDisruptionsAllowed(Integer disruptionsAllowed) {
            this.disruptionsAllowed = Input.of(Objects.requireNonNull(disruptionsAllowed));
            return this;
        }

        public Builder setExpectedPods(Input<Integer> expectedPods) {
            this.expectedPods = Objects.requireNonNull(expectedPods);
            return this;
        }

        public Builder setExpectedPods(Integer expectedPods) {
            this.expectedPods = Input.of(Objects.requireNonNull(expectedPods));
            return this;
        }

        public Builder setObservedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }

        public PodDisruptionBudgetStatusArgs build() {
            return new PodDisruptionBudgetStatusArgs(conditions, currentHealthy, desiredHealthy, disruptedPods, disruptionsAllowed, expectedPods, observedGeneration);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.meta_v1.outputs.Condition;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodDisruptionBudgetStatus {
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
    private final @Nullable List<Condition> conditions;
    /**
     * current number of healthy pods
     * 
     */
    private final Integer currentHealthy;
    /**
     * minimum desired number of healthy pods
     * 
     */
    private final Integer desiredHealthy;
    /**
     * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
     * 
     */
    private final @Nullable Map<String,String> disruptedPods;
    /**
     * Number of pod disruptions that are currently allowed.
     * 
     */
    private final Integer disruptionsAllowed;
    /**
     * total number of pods counted by this disruption budget
     * 
     */
    private final Integer expectedPods;
    /**
     * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.
     * 
     */
    private final @Nullable Integer observedGeneration;

    @CustomType.Constructor
    private PodDisruptionBudgetStatus(
        @CustomType.Parameter("conditions") @Nullable List<Condition> conditions,
        @CustomType.Parameter("currentHealthy") Integer currentHealthy,
        @CustomType.Parameter("desiredHealthy") Integer desiredHealthy,
        @CustomType.Parameter("disruptedPods") @Nullable Map<String,String> disruptedPods,
        @CustomType.Parameter("disruptionsAllowed") Integer disruptionsAllowed,
        @CustomType.Parameter("expectedPods") Integer expectedPods,
        @CustomType.Parameter("observedGeneration") @Nullable Integer observedGeneration) {
        this.conditions = conditions;
        this.currentHealthy = currentHealthy;
        this.desiredHealthy = desiredHealthy;
        this.disruptedPods = disruptedPods;
        this.disruptionsAllowed = disruptionsAllowed;
        this.expectedPods = expectedPods;
        this.observedGeneration = observedGeneration;
    }

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
    public List<Condition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * current number of healthy pods
     * 
    */
    public Integer currentHealthy() {
        return this.currentHealthy;
    }
    /**
     * minimum desired number of healthy pods
     * 
    */
    public Integer desiredHealthy() {
        return this.desiredHealthy;
    }
    /**
     * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
     * 
    */
    public Map<String,String> disruptedPods() {
        return this.disruptedPods == null ? Map.of() : this.disruptedPods;
    }
    /**
     * Number of pod disruptions that are currently allowed.
     * 
    */
    public Integer disruptionsAllowed() {
        return this.disruptionsAllowed;
    }
    /**
     * total number of pods counted by this disruption budget
     * 
    */
    public Integer expectedPods() {
        return this.expectedPods;
    }
    /**
     * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.
     * 
    */
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodDisruptionBudgetStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Condition> conditions;
        private Integer currentHealthy;
        private Integer desiredHealthy;
        private @Nullable Map<String,String> disruptedPods;
        private Integer disruptionsAllowed;
        private Integer expectedPods;
        private @Nullable Integer observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(PodDisruptionBudgetStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentHealthy = defaults.currentHealthy;
    	      this.desiredHealthy = defaults.desiredHealthy;
    	      this.disruptedPods = defaults.disruptedPods;
    	      this.disruptionsAllowed = defaults.disruptionsAllowed;
    	      this.expectedPods = defaults.expectedPods;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder conditions(@Nullable List<Condition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(Condition... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder currentHealthy(Integer currentHealthy) {
            this.currentHealthy = Objects.requireNonNull(currentHealthy);
            return this;
        }
        public Builder desiredHealthy(Integer desiredHealthy) {
            this.desiredHealthy = Objects.requireNonNull(desiredHealthy);
            return this;
        }
        public Builder disruptedPods(@Nullable Map<String,String> disruptedPods) {
            this.disruptedPods = disruptedPods;
            return this;
        }
        public Builder disruptionsAllowed(Integer disruptionsAllowed) {
            this.disruptionsAllowed = Objects.requireNonNull(disruptionsAllowed);
            return this;
        }
        public Builder expectedPods(Integer expectedPods) {
            this.expectedPods = Objects.requireNonNull(expectedPods);
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }        public PodDisruptionBudgetStatus build() {
            return new PodDisruptionBudgetStatus(conditions, currentHealthy, desiredHealthy, disruptedPods, disruptionsAllowed, expectedPods, observedGeneration);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.ReplicaSetConditionArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ReplicaSetStatus represents the current status of a ReplicaSet.
 * 
 */
public final class ReplicaSetStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicaSetStatusArgs Empty = new ReplicaSetStatusArgs();

    /**
     * The number of available replicas (ready for at least minReadySeconds) for this replica set.
     * 
     */
    @InputImport(name="availableReplicas")
    private final @Nullable Input<Integer> availableReplicas;

    public Input<Integer> getAvailableReplicas() {
        return this.availableReplicas == null ? Input.empty() : this.availableReplicas;
    }

    /**
     * Represents the latest available observations of a replica set's current state.
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<ReplicaSetConditionArgs>> conditions;

    public Input<List<ReplicaSetConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * The number of pods that have labels matching the labels of the pod template of the replicaset.
     * 
     */
    @InputImport(name="fullyLabeledReplicas")
    private final @Nullable Input<Integer> fullyLabeledReplicas;

    public Input<Integer> getFullyLabeledReplicas() {
        return this.fullyLabeledReplicas == null ? Input.empty() : this.fullyLabeledReplicas;
    }

    /**
     * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
     * 
     */
    @InputImport(name="observedGeneration")
    private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    /**
     * The number of ready replicas for this replica set.
     * 
     */
    @InputImport(name="readyReplicas")
    private final @Nullable Input<Integer> readyReplicas;

    public Input<Integer> getReadyReplicas() {
        return this.readyReplicas == null ? Input.empty() : this.readyReplicas;
    }

    /**
     * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    @InputImport(name="replicas", required=true)
    private final Input<Integer> replicas;

    public Input<Integer> getReplicas() {
        return this.replicas;
    }

    public ReplicaSetStatusArgs(
        @Nullable Input<Integer> availableReplicas,
        @Nullable Input<List<ReplicaSetConditionArgs>> conditions,
        @Nullable Input<Integer> fullyLabeledReplicas,
        @Nullable Input<Integer> observedGeneration,
        @Nullable Input<Integer> readyReplicas,
        Input<Integer> replicas) {
        this.availableReplicas = availableReplicas;
        this.conditions = conditions;
        this.fullyLabeledReplicas = fullyLabeledReplicas;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = Objects.requireNonNull(replicas, "expected parameter 'replicas' to be non-null");
    }

    private ReplicaSetStatusArgs() {
        this.availableReplicas = Input.empty();
        this.conditions = Input.empty();
        this.fullyLabeledReplicas = Input.empty();
        this.observedGeneration = Input.empty();
        this.readyReplicas = Input.empty();
        this.replicas = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> availableReplicas;
        private @Nullable Input<List<ReplicaSetConditionArgs>> conditions;
        private @Nullable Input<Integer> fullyLabeledReplicas;
        private @Nullable Input<Integer> observedGeneration;
        private @Nullable Input<Integer> readyReplicas;
        private Input<Integer> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaSetStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.conditions = defaults.conditions;
    	      this.fullyLabeledReplicas = defaults.fullyLabeledReplicas;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
        }

        public Builder setAvailableReplicas(@Nullable Input<Integer> availableReplicas) {
            this.availableReplicas = availableReplicas;
            return this;
        }

        public Builder setAvailableReplicas(@Nullable Integer availableReplicas) {
            this.availableReplicas = Input.ofNullable(availableReplicas);
            return this;
        }

        public Builder setConditions(@Nullable Input<List<ReplicaSetConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<ReplicaSetConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setFullyLabeledReplicas(@Nullable Input<Integer> fullyLabeledReplicas) {
            this.fullyLabeledReplicas = fullyLabeledReplicas;
            return this;
        }

        public Builder setFullyLabeledReplicas(@Nullable Integer fullyLabeledReplicas) {
            this.fullyLabeledReplicas = Input.ofNullable(fullyLabeledReplicas);
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

        public Builder setReadyReplicas(@Nullable Input<Integer> readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }

        public Builder setReadyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = Input.ofNullable(readyReplicas);
            return this;
        }

        public Builder setReplicas(Input<Integer> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }

        public Builder setReplicas(Integer replicas) {
            this.replicas = Input.of(Objects.requireNonNull(replicas));
            return this;
        }

        public ReplicaSetStatusArgs build() {
            return new ReplicaSetStatusArgs(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas);
        }
    }
}

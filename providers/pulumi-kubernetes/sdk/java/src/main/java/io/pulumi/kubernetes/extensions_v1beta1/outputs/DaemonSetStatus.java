// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.DaemonSetCondition;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DaemonSetStatus {
    /**
     * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    private final @Nullable Integer collisionCount;
    /**
     * Represents the latest available observations of a DaemonSet's current state.
     * 
     */
    private final @Nullable List<DaemonSetCondition> conditions;
    /**
     * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    private final Integer currentNumberScheduled;
    /**
     * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    private final Integer desiredNumberScheduled;
    /**
     * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    private final @Nullable Integer numberAvailable;
    /**
     * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    private final Integer numberMisscheduled;
    /**
     * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
     * 
     */
    private final Integer numberReady;
    /**
     * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    private final @Nullable Integer numberUnavailable;
    /**
     * The most recent generation observed by the daemon set controller.
     * 
     */
    private final @Nullable Integer observedGeneration;
    /**
     * The total number of nodes that are running updated daemon pod
     * 
     */
    private final @Nullable Integer updatedNumberScheduled;

    @OutputCustomType.Constructor({"collisionCount","conditions","currentNumberScheduled","desiredNumberScheduled","numberAvailable","numberMisscheduled","numberReady","numberUnavailable","observedGeneration","updatedNumberScheduled"})
    private DaemonSetStatus(
        @Nullable Integer collisionCount,
        @Nullable List<DaemonSetCondition> conditions,
        Integer currentNumberScheduled,
        Integer desiredNumberScheduled,
        @Nullable Integer numberAvailable,
        Integer numberMisscheduled,
        Integer numberReady,
        @Nullable Integer numberUnavailable,
        @Nullable Integer observedGeneration,
        @Nullable Integer updatedNumberScheduled) {
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.currentNumberScheduled = Objects.requireNonNull(currentNumberScheduled);
        this.desiredNumberScheduled = Objects.requireNonNull(desiredNumberScheduled);
        this.numberAvailable = numberAvailable;
        this.numberMisscheduled = Objects.requireNonNull(numberMisscheduled);
        this.numberReady = Objects.requireNonNull(numberReady);
        this.numberUnavailable = numberUnavailable;
        this.observedGeneration = observedGeneration;
        this.updatedNumberScheduled = updatedNumberScheduled;
    }

    /**
     * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    public Optional<Integer> getCollisionCount() {
        return Optional.ofNullable(this.collisionCount);
    }
    /**
     * Represents the latest available observations of a DaemonSet's current state.
     * 
     */
    public List<DaemonSetCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    public Integer getCurrentNumberScheduled() {
        return this.currentNumberScheduled;
    }
    /**
     * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    public Integer getDesiredNumberScheduled() {
        return this.desiredNumberScheduled;
    }
    /**
     * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    public Optional<Integer> getNumberAvailable() {
        return Optional.ofNullable(this.numberAvailable);
    }
    /**
     * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    public Integer getNumberMisscheduled() {
        return this.numberMisscheduled;
    }
    /**
     * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
     * 
     */
    public Integer getNumberReady() {
        return this.numberReady;
    }
    /**
     * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    public Optional<Integer> getNumberUnavailable() {
        return Optional.ofNullable(this.numberUnavailable);
    }
    /**
     * The most recent generation observed by the daemon set controller.
     * 
     */
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * The total number of nodes that are running updated daemon pod
     * 
     */
    public Optional<Integer> getUpdatedNumberScheduled() {
        return Optional.ofNullable(this.updatedNumberScheduled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer collisionCount;
        private @Nullable List<DaemonSetCondition> conditions;
        private Integer currentNumberScheduled;
        private Integer desiredNumberScheduled;
        private @Nullable Integer numberAvailable;
        private Integer numberMisscheduled;
        private Integer numberReady;
        private @Nullable Integer numberUnavailable;
        private @Nullable Integer observedGeneration;
        private @Nullable Integer updatedNumberScheduled;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collisionCount = defaults.collisionCount;
    	      this.conditions = defaults.conditions;
    	      this.currentNumberScheduled = defaults.currentNumberScheduled;
    	      this.desiredNumberScheduled = defaults.desiredNumberScheduled;
    	      this.numberAvailable = defaults.numberAvailable;
    	      this.numberMisscheduled = defaults.numberMisscheduled;
    	      this.numberReady = defaults.numberReady;
    	      this.numberUnavailable = defaults.numberUnavailable;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.updatedNumberScheduled = defaults.updatedNumberScheduled;
        }

        public Builder setCollisionCount(@Nullable Integer collisionCount) {
            this.collisionCount = collisionCount;
            return this;
        }

        public Builder setConditions(@Nullable List<DaemonSetCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setCurrentNumberScheduled(Integer currentNumberScheduled) {
            this.currentNumberScheduled = Objects.requireNonNull(currentNumberScheduled);
            return this;
        }

        public Builder setDesiredNumberScheduled(Integer desiredNumberScheduled) {
            this.desiredNumberScheduled = Objects.requireNonNull(desiredNumberScheduled);
            return this;
        }

        public Builder setNumberAvailable(@Nullable Integer numberAvailable) {
            this.numberAvailable = numberAvailable;
            return this;
        }

        public Builder setNumberMisscheduled(Integer numberMisscheduled) {
            this.numberMisscheduled = Objects.requireNonNull(numberMisscheduled);
            return this;
        }

        public Builder setNumberReady(Integer numberReady) {
            this.numberReady = Objects.requireNonNull(numberReady);
            return this;
        }

        public Builder setNumberUnavailable(@Nullable Integer numberUnavailable) {
            this.numberUnavailable = numberUnavailable;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setUpdatedNumberScheduled(@Nullable Integer updatedNumberScheduled) {
            this.updatedNumberScheduled = updatedNumberScheduled;
            return this;
        }

        public DaemonSetStatus build() {
            return new DaemonSetStatus(collisionCount, conditions, currentNumberScheduled, desiredNumberScheduled, numberAvailable, numberMisscheduled, numberReady, numberUnavailable, observedGeneration, updatedNumberScheduled);
        }
    }
}

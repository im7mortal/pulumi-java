// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.batch_v1.inputs.JobConditionArgs;
import io.pulumi.kubernetes.batch_v1.inputs.UncountedTerminatedPodsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * JobStatus represents the current state of a Job.
 * 
 */
public final class JobStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatusArgs Empty = new JobStatusArgs();

    /**
     * The number of pending and running pods.
     * 
     */
    @InputImport(name="active")
    private final @Nullable Input<Integer> active;

    public Input<Integer> getActive() {
        return this.active == null ? Input.empty() : this.active;
    }

    /**
     * CompletedIndexes holds the completed indexes when .spec.completionMode = "Indexed" in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7".
     * 
     */
    @InputImport(name="completedIndexes")
    private final @Nullable Input<String> completedIndexes;

    public Input<String> getCompletedIndexes() {
        return this.completedIndexes == null ? Input.empty() : this.completedIndexes;
    }

    /**
     * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes successfully.
     * 
     */
    @InputImport(name="completionTime")
    private final @Nullable Input<String> completionTime;

    public Input<String> getCompletionTime() {
        return this.completionTime == null ? Input.empty() : this.completionTime;
    }

    /**
     * The latest available observations of an object's current state. When a Job fails, one of the conditions will have type "Failed" and status true. When a Job is suspended, one of the conditions will have type "Suspended" and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type "Complete" and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<JobConditionArgs>> conditions;

    public Input<List<JobConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * The number of pods which reached phase Failed.
     * 
     */
    @InputImport(name="failed")
    private final @Nullable Input<Integer> failed;

    public Input<Integer> getFailed() {
        return this.failed == null ? Input.empty() : this.failed;
    }

    /**
     * The number of pods which have a Ready condition.
     * 
     * This field is alpha-level. The job controller populates the field when the feature gate JobReadyPods is enabled (disabled by default).
     * 
     */
    @InputImport(name="ready")
    private final @Nullable Input<Integer> ready;

    public Input<Integer> getReady() {
        return this.ready == null ? Input.empty() : this.ready;
    }

    /**
     * Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * The number of pods which reached phase Succeeded.
     * 
     */
    @InputImport(name="succeeded")
    private final @Nullable Input<Integer> succeeded;

    public Input<Integer> getSucceeded() {
        return this.succeeded == null ? Input.empty() : this.succeeded;
    }

    /**
     * UncountedTerminatedPods holds the UIDs of Pods that have terminated but the job controller hasn't yet accounted for in the status counters.
     * 
     * The job controller creates pods with a finalizer. When a pod terminates (succeeded or failed), the controller does three steps to account for it in the job status: (1) Add the pod UID to the arrays in this field. (2) Remove the pod finalizer. (3) Remove the pod UID from the arrays while increasing the corresponding
     *     counter.
     * 
     * This field is beta-level. The job controller only makes use of this field when the feature gate JobTrackingWithFinalizers is enabled (enabled by default). Old jobs might not be tracked using this field, in which case the field remains null.
     * 
     */
    @InputImport(name="uncountedTerminatedPods")
    private final @Nullable Input<UncountedTerminatedPodsArgs> uncountedTerminatedPods;

    public Input<UncountedTerminatedPodsArgs> getUncountedTerminatedPods() {
        return this.uncountedTerminatedPods == null ? Input.empty() : this.uncountedTerminatedPods;
    }

    public JobStatusArgs(
        @Nullable Input<Integer> active,
        @Nullable Input<String> completedIndexes,
        @Nullable Input<String> completionTime,
        @Nullable Input<List<JobConditionArgs>> conditions,
        @Nullable Input<Integer> failed,
        @Nullable Input<Integer> ready,
        @Nullable Input<String> startTime,
        @Nullable Input<Integer> succeeded,
        @Nullable Input<UncountedTerminatedPodsArgs> uncountedTerminatedPods) {
        this.active = active;
        this.completedIndexes = completedIndexes;
        this.completionTime = completionTime;
        this.conditions = conditions;
        this.failed = failed;
        this.ready = ready;
        this.startTime = startTime;
        this.succeeded = succeeded;
        this.uncountedTerminatedPods = uncountedTerminatedPods;
    }

    private JobStatusArgs() {
        this.active = Input.empty();
        this.completedIndexes = Input.empty();
        this.completionTime = Input.empty();
        this.conditions = Input.empty();
        this.failed = Input.empty();
        this.ready = Input.empty();
        this.startTime = Input.empty();
        this.succeeded = Input.empty();
        this.uncountedTerminatedPods = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> active;
        private @Nullable Input<String> completedIndexes;
        private @Nullable Input<String> completionTime;
        private @Nullable Input<List<JobConditionArgs>> conditions;
        private @Nullable Input<Integer> failed;
        private @Nullable Input<Integer> ready;
        private @Nullable Input<String> startTime;
        private @Nullable Input<Integer> succeeded;
        private @Nullable Input<UncountedTerminatedPodsArgs> uncountedTerminatedPods;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.completedIndexes = defaults.completedIndexes;
    	      this.completionTime = defaults.completionTime;
    	      this.conditions = defaults.conditions;
    	      this.failed = defaults.failed;
    	      this.ready = defaults.ready;
    	      this.startTime = defaults.startTime;
    	      this.succeeded = defaults.succeeded;
    	      this.uncountedTerminatedPods = defaults.uncountedTerminatedPods;
        }

        public Builder setActive(@Nullable Input<Integer> active) {
            this.active = active;
            return this;
        }

        public Builder setActive(@Nullable Integer active) {
            this.active = Input.ofNullable(active);
            return this;
        }

        public Builder setCompletedIndexes(@Nullable Input<String> completedIndexes) {
            this.completedIndexes = completedIndexes;
            return this;
        }

        public Builder setCompletedIndexes(@Nullable String completedIndexes) {
            this.completedIndexes = Input.ofNullable(completedIndexes);
            return this;
        }

        public Builder setCompletionTime(@Nullable Input<String> completionTime) {
            this.completionTime = completionTime;
            return this;
        }

        public Builder setCompletionTime(@Nullable String completionTime) {
            this.completionTime = Input.ofNullable(completionTime);
            return this;
        }

        public Builder setConditions(@Nullable Input<List<JobConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<JobConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setFailed(@Nullable Input<Integer> failed) {
            this.failed = failed;
            return this;
        }

        public Builder setFailed(@Nullable Integer failed) {
            this.failed = Input.ofNullable(failed);
            return this;
        }

        public Builder setReady(@Nullable Input<Integer> ready) {
            this.ready = ready;
            return this;
        }

        public Builder setReady(@Nullable Integer ready) {
            this.ready = Input.ofNullable(ready);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setSucceeded(@Nullable Input<Integer> succeeded) {
            this.succeeded = succeeded;
            return this;
        }

        public Builder setSucceeded(@Nullable Integer succeeded) {
            this.succeeded = Input.ofNullable(succeeded);
            return this;
        }

        public Builder setUncountedTerminatedPods(@Nullable Input<UncountedTerminatedPodsArgs> uncountedTerminatedPods) {
            this.uncountedTerminatedPods = uncountedTerminatedPods;
            return this;
        }

        public Builder setUncountedTerminatedPods(@Nullable UncountedTerminatedPodsArgs uncountedTerminatedPods) {
            this.uncountedTerminatedPods = Input.ofNullable(uncountedTerminatedPods);
            return this;
        }

        public JobStatusArgs build() {
            return new JobStatusArgs(active, completedIndexes, completionTime, conditions, failed, ready, startTime, succeeded, uncountedTerminatedPods);
        }
    }
}

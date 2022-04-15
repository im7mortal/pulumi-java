// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * JobSpec describes how the job execution will look like.
 * 
 */
public final class JobSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSpecArgs Empty = new JobSpecArgs();

    /**
     * Specifies the duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it; value must be positive integer. If a Job is suspended (at creation or through an update), this timer will effectively be stopped and reset when the Job is resumed again.
     * 
     */
    @Import(name="activeDeadlineSeconds")
      private final @Nullable Output<Integer> activeDeadlineSeconds;

    public Output<Integer> activeDeadlineSeconds() {
        return this.activeDeadlineSeconds == null ? Codegen.empty() : this.activeDeadlineSeconds;
    }

    /**
     * Specifies the number of retries before marking this job failed. Defaults to 6
     * 
     */
    @Import(name="backoffLimit")
      private final @Nullable Output<Integer> backoffLimit;

    public Output<Integer> backoffLimit() {
        return this.backoffLimit == null ? Codegen.empty() : this.backoffLimit;
    }

    /**
     * CompletionMode specifies how Pod completions are tracked. It can be `NonIndexed` (default) or `Indexed`.
     * 
     * `NonIndexed` means that the Job is considered complete when there have been .spec.completions successfully completed Pods. Each Pod completion is homologous to each other.
     * 
     * `Indexed` means that the Pods of a Job get an associated completion index from 0 to (.spec.completions - 1), available in the annotation batch.kubernetes.io/job-completion-index. The Job is considered complete when there is one successfully completed Pod for each index. When value is `Indexed`, .spec.completions must be specified and `.spec.parallelism` must be less than or equal to 10^5. In addition, The Pod name takes the form `$(job-name)-$(index)-$(random-string)`, the Pod hostname takes the form `$(job-name)-$(index)`.
     * 
     * This field is beta-level. More completion modes can be added in the future. If the Job controller observes a mode that it doesn't recognize, the controller skips updates for the Job.
     * 
     */
    @Import(name="completionMode")
      private final @Nullable Output<String> completionMode;

    public Output<String> completionMode() {
        return this.completionMode == null ? Codegen.empty() : this.completionMode;
    }

    /**
     * Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @Import(name="completions")
      private final @Nullable Output<Integer> completions;

    public Output<Integer> completions() {
        return this.completions == null ? Codegen.empty() : this.completions;
    }

    /**
     * manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     * 
     */
    @Import(name="manualSelector")
      private final @Nullable Output<Boolean> manualSelector;

    public Output<Boolean> manualSelector() {
        return this.manualSelector == null ? Codegen.empty() : this.manualSelector;
    }

    /**
     * Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @Import(name="parallelism")
      private final @Nullable Output<Integer> parallelism;

    public Output<Integer> parallelism() {
        return this.parallelism == null ? Codegen.empty() : this.parallelism;
    }

    /**
     * A label query over pods that should match the pod count. Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @Import(name="selector")
      private final @Nullable Output<LabelSelectorArgs> selector;

    public Output<LabelSelectorArgs> selector() {
        return this.selector == null ? Codegen.empty() : this.selector;
    }

    /**
     * Suspend specifies whether the Job controller should create Pods or not. If a Job is created with suspend set to true, no Pods are created by the Job controller. If a Job is suspended after creation (i.e. the flag goes from false to true), the Job controller will delete all active Pods associated with this Job. Users must design their workload to gracefully handle this. Suspending a Job will reset the StartTime field of the Job, effectively resetting the ActiveDeadlineSeconds timer too. Defaults to false.
     * 
     * This field is beta-level, gated by SuspendJob feature flag (enabled by default).
     * 
     */
    @Import(name="suspend")
      private final @Nullable Output<Boolean> suspend;

    public Output<Boolean> suspend() {
        return this.suspend == null ? Codegen.empty() : this.suspend;
    }

    /**
     * Describes the pod that will be created when executing a job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @Import(name="template", required=true)
      private final Output<PodTemplateSpecArgs> template;

    public Output<PodTemplateSpecArgs> template() {
        return this.template;
    }

    /**
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes.
     * 
     */
    @Import(name="ttlSecondsAfterFinished")
      private final @Nullable Output<Integer> ttlSecondsAfterFinished;

    public Output<Integer> ttlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished == null ? Codegen.empty() : this.ttlSecondsAfterFinished;
    }

    public JobSpecArgs(
        @Nullable Output<Integer> activeDeadlineSeconds,
        @Nullable Output<Integer> backoffLimit,
        @Nullable Output<String> completionMode,
        @Nullable Output<Integer> completions,
        @Nullable Output<Boolean> manualSelector,
        @Nullable Output<Integer> parallelism,
        @Nullable Output<LabelSelectorArgs> selector,
        @Nullable Output<Boolean> suspend,
        Output<PodTemplateSpecArgs> template,
        @Nullable Output<Integer> ttlSecondsAfterFinished) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.backoffLimit = backoffLimit;
        this.completionMode = completionMode;
        this.completions = completions;
        this.manualSelector = manualSelector;
        this.parallelism = parallelism;
        this.selector = selector;
        this.suspend = suspend;
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    }

    private JobSpecArgs() {
        this.activeDeadlineSeconds = Codegen.empty();
        this.backoffLimit = Codegen.empty();
        this.completionMode = Codegen.empty();
        this.completions = Codegen.empty();
        this.manualSelector = Codegen.empty();
        this.parallelism = Codegen.empty();
        this.selector = Codegen.empty();
        this.suspend = Codegen.empty();
        this.template = Codegen.empty();
        this.ttlSecondsAfterFinished = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> activeDeadlineSeconds;
        private @Nullable Output<Integer> backoffLimit;
        private @Nullable Output<String> completionMode;
        private @Nullable Output<Integer> completions;
        private @Nullable Output<Boolean> manualSelector;
        private @Nullable Output<Integer> parallelism;
        private @Nullable Output<LabelSelectorArgs> selector;
        private @Nullable Output<Boolean> suspend;
        private Output<PodTemplateSpecArgs> template;
        private @Nullable Output<Integer> ttlSecondsAfterFinished;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeadlineSeconds = defaults.activeDeadlineSeconds;
    	      this.backoffLimit = defaults.backoffLimit;
    	      this.completionMode = defaults.completionMode;
    	      this.completions = defaults.completions;
    	      this.manualSelector = defaults.manualSelector;
    	      this.parallelism = defaults.parallelism;
    	      this.selector = defaults.selector;
    	      this.suspend = defaults.suspend;
    	      this.template = defaults.template;
    	      this.ttlSecondsAfterFinished = defaults.ttlSecondsAfterFinished;
        }

        public Builder activeDeadlineSeconds(@Nullable Output<Integer> activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }
        public Builder activeDeadlineSeconds(@Nullable Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = Codegen.ofNullable(activeDeadlineSeconds);
            return this;
        }
        public Builder backoffLimit(@Nullable Output<Integer> backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }
        public Builder backoffLimit(@Nullable Integer backoffLimit) {
            this.backoffLimit = Codegen.ofNullable(backoffLimit);
            return this;
        }
        public Builder completionMode(@Nullable Output<String> completionMode) {
            this.completionMode = completionMode;
            return this;
        }
        public Builder completionMode(@Nullable String completionMode) {
            this.completionMode = Codegen.ofNullable(completionMode);
            return this;
        }
        public Builder completions(@Nullable Output<Integer> completions) {
            this.completions = completions;
            return this;
        }
        public Builder completions(@Nullable Integer completions) {
            this.completions = Codegen.ofNullable(completions);
            return this;
        }
        public Builder manualSelector(@Nullable Output<Boolean> manualSelector) {
            this.manualSelector = manualSelector;
            return this;
        }
        public Builder manualSelector(@Nullable Boolean manualSelector) {
            this.manualSelector = Codegen.ofNullable(manualSelector);
            return this;
        }
        public Builder parallelism(@Nullable Output<Integer> parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Builder parallelism(@Nullable Integer parallelism) {
            this.parallelism = Codegen.ofNullable(parallelism);
            return this;
        }
        public Builder selector(@Nullable Output<LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }
        public Builder selector(@Nullable LabelSelectorArgs selector) {
            this.selector = Codegen.ofNullable(selector);
            return this;
        }
        public Builder suspend(@Nullable Output<Boolean> suspend) {
            this.suspend = suspend;
            return this;
        }
        public Builder suspend(@Nullable Boolean suspend) {
            this.suspend = Codegen.ofNullable(suspend);
            return this;
        }
        public Builder template(Output<PodTemplateSpecArgs> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public Builder template(PodTemplateSpecArgs template) {
            this.template = Output.of(Objects.requireNonNull(template));
            return this;
        }
        public Builder ttlSecondsAfterFinished(@Nullable Output<Integer> ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }
        public Builder ttlSecondsAfterFinished(@Nullable Integer ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = Codegen.ofNullable(ttlSecondsAfterFinished);
            return this;
        }        public JobSpecArgs build() {
            return new JobSpecArgs(activeDeadlineSeconds, backoffLimit, completionMode, completions, manualSelector, parallelism, selector, suspend, template, ttlSecondsAfterFinished);
        }
    }
}

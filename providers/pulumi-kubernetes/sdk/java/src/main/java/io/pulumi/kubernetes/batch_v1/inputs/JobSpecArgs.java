// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSpecArgs Empty = new JobSpecArgs();

    @InputImport(name="activeDeadlineSeconds")
    private final @Nullable Input<Integer> activeDeadlineSeconds;

    public Input<Integer> getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds == null ? Input.empty() : this.activeDeadlineSeconds;
    }

    @InputImport(name="backoffLimit")
    private final @Nullable Input<Integer> backoffLimit;

    public Input<Integer> getBackoffLimit() {
        return this.backoffLimit == null ? Input.empty() : this.backoffLimit;
    }

    @InputImport(name="completionMode")
    private final @Nullable Input<String> completionMode;

    public Input<String> getCompletionMode() {
        return this.completionMode == null ? Input.empty() : this.completionMode;
    }

    @InputImport(name="completions")
    private final @Nullable Input<Integer> completions;

    public Input<Integer> getCompletions() {
        return this.completions == null ? Input.empty() : this.completions;
    }

    @InputImport(name="manualSelector")
    private final @Nullable Input<Boolean> manualSelector;

    public Input<Boolean> getManualSelector() {
        return this.manualSelector == null ? Input.empty() : this.manualSelector;
    }

    @InputImport(name="parallelism")
    private final @Nullable Input<Integer> parallelism;

    public Input<Integer> getParallelism() {
        return this.parallelism == null ? Input.empty() : this.parallelism;
    }

    @InputImport(name="selector")
    private final @Nullable Input<LabelSelectorArgs> selector;

    public Input<LabelSelectorArgs> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    @InputImport(name="suspend")
    private final @Nullable Input<Boolean> suspend;

    public Input<Boolean> getSuspend() {
        return this.suspend == null ? Input.empty() : this.suspend;
    }

    @InputImport(name="template", required=true)
    private final Input<PodTemplateSpecArgs> template;

    public Input<PodTemplateSpecArgs> getTemplate() {
        return this.template;
    }

    @InputImport(name="ttlSecondsAfterFinished")
    private final @Nullable Input<Integer> ttlSecondsAfterFinished;

    public Input<Integer> getTtlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished == null ? Input.empty() : this.ttlSecondsAfterFinished;
    }

    public JobSpecArgs(
        @Nullable Input<Integer> activeDeadlineSeconds,
        @Nullable Input<Integer> backoffLimit,
        @Nullable Input<String> completionMode,
        @Nullable Input<Integer> completions,
        @Nullable Input<Boolean> manualSelector,
        @Nullable Input<Integer> parallelism,
        @Nullable Input<LabelSelectorArgs> selector,
        @Nullable Input<Boolean> suspend,
        Input<PodTemplateSpecArgs> template,
        @Nullable Input<Integer> ttlSecondsAfterFinished) {
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
        this.activeDeadlineSeconds = Input.empty();
        this.backoffLimit = Input.empty();
        this.completionMode = Input.empty();
        this.completions = Input.empty();
        this.manualSelector = Input.empty();
        this.parallelism = Input.empty();
        this.selector = Input.empty();
        this.suspend = Input.empty();
        this.template = Input.empty();
        this.ttlSecondsAfterFinished = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> activeDeadlineSeconds;
        private @Nullable Input<Integer> backoffLimit;
        private @Nullable Input<String> completionMode;
        private @Nullable Input<Integer> completions;
        private @Nullable Input<Boolean> manualSelector;
        private @Nullable Input<Integer> parallelism;
        private @Nullable Input<LabelSelectorArgs> selector;
        private @Nullable Input<Boolean> suspend;
        private Input<PodTemplateSpecArgs> template;
        private @Nullable Input<Integer> ttlSecondsAfterFinished;

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

        public Builder setActiveDeadlineSeconds(@Nullable Input<Integer> activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        public Builder setActiveDeadlineSeconds(@Nullable Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = Input.ofNullable(activeDeadlineSeconds);
            return this;
        }

        public Builder setBackoffLimit(@Nullable Input<Integer> backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }

        public Builder setBackoffLimit(@Nullable Integer backoffLimit) {
            this.backoffLimit = Input.ofNullable(backoffLimit);
            return this;
        }

        public Builder setCompletionMode(@Nullable Input<String> completionMode) {
            this.completionMode = completionMode;
            return this;
        }

        public Builder setCompletionMode(@Nullable String completionMode) {
            this.completionMode = Input.ofNullable(completionMode);
            return this;
        }

        public Builder setCompletions(@Nullable Input<Integer> completions) {
            this.completions = completions;
            return this;
        }

        public Builder setCompletions(@Nullable Integer completions) {
            this.completions = Input.ofNullable(completions);
            return this;
        }

        public Builder setManualSelector(@Nullable Input<Boolean> manualSelector) {
            this.manualSelector = manualSelector;
            return this;
        }

        public Builder setManualSelector(@Nullable Boolean manualSelector) {
            this.manualSelector = Input.ofNullable(manualSelector);
            return this;
        }

        public Builder setParallelism(@Nullable Input<Integer> parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        public Builder setParallelism(@Nullable Integer parallelism) {
            this.parallelism = Input.ofNullable(parallelism);
            return this;
        }

        public Builder setSelector(@Nullable Input<LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable LabelSelectorArgs selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }

        public Builder setSuspend(@Nullable Input<Boolean> suspend) {
            this.suspend = suspend;
            return this;
        }

        public Builder setSuspend(@Nullable Boolean suspend) {
            this.suspend = Input.ofNullable(suspend);
            return this;
        }

        public Builder setTemplate(Input<PodTemplateSpecArgs> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setTemplate(PodTemplateSpecArgs template) {
            this.template = Input.of(Objects.requireNonNull(template));
            return this;
        }

        public Builder setTtlSecondsAfterFinished(@Nullable Input<Integer> ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }

        public Builder setTtlSecondsAfterFinished(@Nullable Integer ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = Input.ofNullable(ttlSecondsAfterFinished);
            return this;
        }

        public JobSpecArgs build() {
            return new JobSpecArgs(activeDeadlineSeconds, backoffLimit, completionMode, completions, manualSelector, parallelism, selector, suspend, template, ttlSecondsAfterFinished);
        }
    }
}
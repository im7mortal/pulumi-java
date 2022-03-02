// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.apps_v1beta2.outputs.DaemonSetUpdateStrategy;
import io.pulumi.kubernetes.core_v1.outputs.PodTemplateSpec;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DaemonSetSpec {
    /**
     * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
     * 
     */
    private final @Nullable Integer minReadySeconds;
    /**
     * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    private final @Nullable Integer revisionHistoryLimit;
    /**
     * A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    private final LabelSelector selector;
    /**
     * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    private final PodTemplateSpec template;
    /**
     * An update strategy to replace existing DaemonSet pods with new pods.
     * 
     */
    private final @Nullable DaemonSetUpdateStrategy updateStrategy;

    @OutputCustomType.Constructor({"minReadySeconds","revisionHistoryLimit","selector","template","updateStrategy"})
    private DaemonSetSpec(
        @Nullable Integer minReadySeconds,
        @Nullable Integer revisionHistoryLimit,
        LabelSelector selector,
        PodTemplateSpec template,
        @Nullable DaemonSetUpdateStrategy updateStrategy) {
        this.minReadySeconds = minReadySeconds;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = Objects.requireNonNull(selector);
        this.template = Objects.requireNonNull(template);
        this.updateStrategy = updateStrategy;
    }

    /**
     * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
     * 
    */
    public Optional<Integer> getMinReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }
    /**
     * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
    */
    public Optional<Integer> getRevisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }
    /**
     * A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
    */
    public LabelSelector getSelector() {
        return this.selector;
    }
    /**
     * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
    */
    public PodTemplateSpec getTemplate() {
        return this.template;
    }
    /**
     * An update strategy to replace existing DaemonSet pods with new pods.
     * 
    */
    public Optional<DaemonSetUpdateStrategy> getUpdateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minReadySeconds;
        private @Nullable Integer revisionHistoryLimit;
        private LabelSelector selector;
        private PodTemplateSpec template;
        private @Nullable DaemonSetUpdateStrategy updateStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        public Builder setMinReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder setRevisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        public Builder setSelector(LabelSelector selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setTemplate(PodTemplateSpec template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setUpdateStrategy(@Nullable DaemonSetUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }
        public DaemonSetSpec build() {
            return new DaemonSetSpec(minReadySeconds, revisionHistoryLimit, selector, template, updateStrategy);
        }
    }
}

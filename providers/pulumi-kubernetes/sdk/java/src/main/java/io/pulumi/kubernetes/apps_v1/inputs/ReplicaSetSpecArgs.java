// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ReplicaSetSpec is the specification of a ReplicaSet.
 * 
 */
public final class ReplicaSetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicaSetSpecArgs Empty = new ReplicaSetSpecArgs();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    @Import(name="minReadySeconds")
      private final @Nullable Output<Integer> minReadySeconds;

    public Output<Integer> minReadySeconds() {
        return this.minReadySeconds == null ? Codegen.empty() : this.minReadySeconds;
    }

    /**
     * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    @Import(name="replicas")
      private final @Nullable Output<Integer> replicas;

    public Output<Integer> replicas() {
        return this.replicas == null ? Codegen.empty() : this.replicas;
    }

    /**
     * Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @Import(name="selector", required=true)
      private final Output<LabelSelectorArgs> selector;

    public Output<LabelSelectorArgs> selector() {
        return this.selector;
    }

    /**
     * Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    @Import(name="template")
      private final @Nullable Output<PodTemplateSpecArgs> template;

    public Output<PodTemplateSpecArgs> template() {
        return this.template == null ? Codegen.empty() : this.template;
    }

    public ReplicaSetSpecArgs(
        @Nullable Output<Integer> minReadySeconds,
        @Nullable Output<Integer> replicas,
        Output<LabelSelectorArgs> selector,
        @Nullable Output<PodTemplateSpecArgs> template) {
        this.minReadySeconds = minReadySeconds;
        this.replicas = replicas;
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.template = template;
    }

    private ReplicaSetSpecArgs() {
        this.minReadySeconds = Codegen.empty();
        this.replicas = Codegen.empty();
        this.selector = Codegen.empty();
        this.template = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minReadySeconds;
        private @Nullable Output<Integer> replicas;
        private Output<LabelSelectorArgs> selector;
        private @Nullable Output<PodTemplateSpecArgs> template;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaSetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.replicas = defaults.replicas;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
        }

        public Builder minReadySeconds(@Nullable Output<Integer> minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }
        public Builder minReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = Codegen.ofNullable(minReadySeconds);
            return this;
        }
        public Builder replicas(@Nullable Output<Integer> replicas) {
            this.replicas = replicas;
            return this;
        }
        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = Codegen.ofNullable(replicas);
            return this;
        }
        public Builder selector(Output<LabelSelectorArgs> selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public Builder selector(LabelSelectorArgs selector) {
            this.selector = Output.of(Objects.requireNonNull(selector));
            return this;
        }
        public Builder template(@Nullable Output<PodTemplateSpecArgs> template) {
            this.template = template;
            return this;
        }
        public Builder template(@Nullable PodTemplateSpecArgs template) {
            this.template = Codegen.ofNullable(template);
            return this;
        }        public ReplicaSetSpecArgs build() {
            return new ReplicaSetSpecArgs(minReadySeconds, replicas, selector, template);
        }
    }
}

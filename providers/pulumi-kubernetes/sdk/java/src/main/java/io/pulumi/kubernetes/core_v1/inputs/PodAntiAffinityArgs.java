// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.PodAffinityTermArgs;
import io.pulumi.kubernetes.core_v1.inputs.WeightedPodAffinityTermArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
 * 
 */
public final class PodAntiAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodAntiAffinityArgs Empty = new PodAntiAffinityArgs();

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
     * 
     */
    @Import(name="preferredDuringSchedulingIgnoredDuringExecution")
      private final @Nullable Output<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution;

    public Output<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution == null ? Codegen.empty() : this.preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
     * 
     */
    @Import(name="requiredDuringSchedulingIgnoredDuringExecution")
      private final @Nullable Output<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution;

    public Output<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution() {
        return this.requiredDuringSchedulingIgnoredDuringExecution == null ? Codegen.empty() : this.requiredDuringSchedulingIgnoredDuringExecution;
    }

    public PodAntiAffinityArgs(
        @Nullable Output<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution,
        @Nullable Output<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    private PodAntiAffinityArgs() {
        this.preferredDuringSchedulingIgnoredDuringExecution = Codegen.empty();
        this.requiredDuringSchedulingIgnoredDuringExecution = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodAntiAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution;
        private @Nullable Output<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution;

        public Builder() {
    	      // Empty
        }

        public Builder(PodAntiAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredDuringSchedulingIgnoredDuringExecution = defaults.preferredDuringSchedulingIgnoredDuringExecution;
    	      this.requiredDuringSchedulingIgnoredDuringExecution = defaults.requiredDuringSchedulingIgnoredDuringExecution;
        }

        public Builder preferredDuringSchedulingIgnoredDuringExecution(@Nullable Output<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }
        public Builder preferredDuringSchedulingIgnoredDuringExecution(@Nullable List<WeightedPodAffinityTermArgs> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = Codegen.ofNullable(preferredDuringSchedulingIgnoredDuringExecution);
            return this;
        }
        public Builder preferredDuringSchedulingIgnoredDuringExecution(WeightedPodAffinityTermArgs... preferredDuringSchedulingIgnoredDuringExecution) {
            return preferredDuringSchedulingIgnoredDuringExecution(List.of(preferredDuringSchedulingIgnoredDuringExecution));
        }
        public Builder requiredDuringSchedulingIgnoredDuringExecution(@Nullable Output<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }
        public Builder requiredDuringSchedulingIgnoredDuringExecution(@Nullable List<PodAffinityTermArgs> requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = Codegen.ofNullable(requiredDuringSchedulingIgnoredDuringExecution);
            return this;
        }
        public Builder requiredDuringSchedulingIgnoredDuringExecution(PodAffinityTermArgs... requiredDuringSchedulingIgnoredDuringExecution) {
            return requiredDuringSchedulingIgnoredDuringExecution(List.of(requiredDuringSchedulingIgnoredDuringExecution));
        }        public PodAntiAffinityArgs build() {
            return new PodAntiAffinityArgs(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
        }
    }
}

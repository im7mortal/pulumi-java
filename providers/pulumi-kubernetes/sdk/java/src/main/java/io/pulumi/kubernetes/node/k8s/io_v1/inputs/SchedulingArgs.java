// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.node.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.TolerationArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
 * 
 */
public final class SchedulingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingArgs Empty = new SchedulingArgs();

    /**
     * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
     * 
     */
    @Import(name="nodeSelector")
      private final @Nullable Output<Map<String,String>> nodeSelector;

    public Output<Map<String,String>> nodeSelector() {
        return this.nodeSelector == null ? Codegen.empty() : this.nodeSelector;
    }

    /**
     * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
     * 
     */
    @Import(name="tolerations")
      private final @Nullable Output<List<TolerationArgs>> tolerations;

    public Output<List<TolerationArgs>> tolerations() {
        return this.tolerations == null ? Codegen.empty() : this.tolerations;
    }

    public SchedulingArgs(
        @Nullable Output<Map<String,String>> nodeSelector,
        @Nullable Output<List<TolerationArgs>> tolerations) {
        this.nodeSelector = nodeSelector;
        this.tolerations = tolerations;
    }

    private SchedulingArgs() {
        this.nodeSelector = Codegen.empty();
        this.tolerations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> nodeSelector;
        private @Nullable Output<List<TolerationArgs>> tolerations;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.tolerations = defaults.tolerations;
        }

        public Builder nodeSelector(@Nullable Output<Map<String,String>> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }
        public Builder nodeSelector(@Nullable Map<String,String> nodeSelector) {
            this.nodeSelector = Codegen.ofNullable(nodeSelector);
            return this;
        }
        public Builder tolerations(@Nullable Output<List<TolerationArgs>> tolerations) {
            this.tolerations = tolerations;
            return this;
        }
        public Builder tolerations(@Nullable List<TolerationArgs> tolerations) {
            this.tolerations = Codegen.ofNullable(tolerations);
            return this;
        }
        public Builder tolerations(TolerationArgs... tolerations) {
            return tolerations(List.of(tolerations));
        }        public SchedulingArgs build() {
            return new SchedulingArgs(nodeSelector, tolerations);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.node.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.Toleration;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class Scheduling {
    /**
     * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
     * 
     */
    private final @Nullable Map<String,String> nodeSelector;
    /**
     * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
     * 
     */
    private final @Nullable List<Toleration> tolerations;

    @OutputCustomType.Constructor({"nodeSelector","tolerations"})
    private Scheduling(
        @Nullable Map<String,String> nodeSelector,
        @Nullable List<Toleration> tolerations) {
        this.nodeSelector = nodeSelector;
        this.tolerations = tolerations;
    }

    /**
     * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
     * 
     */
    public Map<String,String> getNodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }
    /**
     * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
     * 
     */
    public List<Toleration> getTolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Scheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> nodeSelector;
        private @Nullable List<Toleration> tolerations;

        public Builder() {
    	      // Empty
        }

        public Builder(Scheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.tolerations = defaults.tolerations;
        }

        public Builder setNodeSelector(@Nullable Map<String,String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        public Builder setTolerations(@Nullable List<Toleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }

        public Scheduling build() {
            return new Scheduling(nodeSelector, tolerations);
        }
    }
}

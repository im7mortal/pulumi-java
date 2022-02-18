// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.FlowSchemaCondition;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowSchemaStatus {
    /**
     * `conditions` is a list of the current states of FlowSchema.
     * 
     */
    private final @Nullable List<FlowSchemaCondition> conditions;

    @OutputCustomType.Constructor({"conditions"})
    private FlowSchemaStatus(@Nullable List<FlowSchemaCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * `conditions` is a list of the current states of FlowSchema.
     * 
     */
    public List<FlowSchemaCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FlowSchemaCondition> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSchemaStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder setConditions(@Nullable List<FlowSchemaCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public FlowSchemaStatus build() {
            return new FlowSchemaStatus(conditions);
        }
    }
}

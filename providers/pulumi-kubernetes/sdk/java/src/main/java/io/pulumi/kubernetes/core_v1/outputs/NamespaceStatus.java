// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.NamespaceCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NamespaceStatus {
    /**
     * Represents the latest available observations of a namespace's current state.
     * 
     */
    private final @Nullable List<NamespaceCondition> conditions;
    /**
     * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     * Possible enum values:
     *  - `"Active"` means the namespace is available for use in the system
     *  - `"Terminating"` means the namespace is undergoing graceful termination
     * 
     */
    private final @Nullable String phase;

    @OutputCustomType.Constructor({"conditions","phase"})
    private NamespaceStatus(
        @Nullable List<NamespaceCondition> conditions,
        @Nullable String phase) {
        this.conditions = conditions;
        this.phase = phase;
    }

    /**
     * Represents the latest available observations of a namespace's current state.
     * 
    */
    public List<NamespaceCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     * Possible enum values:
     *  - `"Active"` means the namespace is available for use in the system
     *  - `"Terminating"` means the namespace is undergoing graceful termination
     * 
    */
    public Optional<String> getPhase() {
        return Optional.ofNullable(this.phase);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NamespaceCondition> conditions;
        private @Nullable String phase;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.phase = defaults.phase;
        }

        public Builder setConditions(@Nullable List<NamespaceCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setPhase(@Nullable String phase) {
            this.phase = phase;
            return this;
        }
        public NamespaceStatus build() {
            return new NamespaceStatus(conditions, phase);
        }
    }
}

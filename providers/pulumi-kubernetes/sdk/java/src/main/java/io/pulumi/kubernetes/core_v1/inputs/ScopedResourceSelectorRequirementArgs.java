// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
 * 
 */
public final class ScopedResourceSelectorRequirementArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScopedResourceSelectorRequirementArgs Empty = new ScopedResourceSelectorRequirementArgs();

    /**
     * Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
     * 
     * Possible enum values:
     *  - `"DoesNotExist"`
     *  - `"Exists"`
     *  - `"In"`
     *  - `"NotIn"`
     * 
     */
    @Import(name="operator", required=true)
      private final Output<String> operator;

    public Output<String> operator() {
        return this.operator;
    }

    /**
     * The name of the scope that the selector applies to.
     * 
     * Possible enum values:
     *  - `"BestEffort"` Match all pod objects that have best effort quality of service
     *  - `"CrossNamespacePodAffinity"` Match all pod objects that have cross-namespace pod (anti)affinity mentioned. This is a beta feature enabled by the PodAffinityNamespaceSelector feature flag.
     *  - `"NotBestEffort"` Match all pod objects that do not have best effort quality of service
     *  - `"NotTerminating"` Match all pod objects where spec.activeDeadlineSeconds is nil
     *  - `"PriorityClass"` Match all pod objects that have priority class mentioned
     *  - `"Terminating"` Match all pod objects where spec.activeDeadlineSeconds >=0
     * 
     */
    @Import(name="scopeName", required=true)
      private final Output<String> scopeName;

    public Output<String> scopeName() {
        return this.scopeName;
    }

    /**
     * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public ScopedResourceSelectorRequirementArgs(
        Output<String> operator,
        Output<String> scopeName,
        @Nullable Output<List<String>> values) {
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.scopeName = Objects.requireNonNull(scopeName, "expected parameter 'scopeName' to be non-null");
        this.values = values;
    }

    private ScopedResourceSelectorRequirementArgs() {
        this.operator = Codegen.empty();
        this.scopeName = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopedResourceSelectorRequirementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> operator;
        private Output<String> scopeName;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopedResourceSelectorRequirementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.scopeName = defaults.scopeName;
    	      this.values = defaults.values;
        }

        public Builder operator(Output<String> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Output.of(Objects.requireNonNull(operator));
            return this;
        }
        public Builder scopeName(Output<String> scopeName) {
            this.scopeName = Objects.requireNonNull(scopeName);
            return this;
        }
        public Builder scopeName(String scopeName) {
            this.scopeName = Output.of(Objects.requireNonNull(scopeName));
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ScopedResourceSelectorRequirementArgs build() {
            return new ScopedResourceSelectorRequirementArgs(operator, scopeName, values);
        }
    }
}

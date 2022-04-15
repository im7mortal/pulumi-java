// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
 * 
 */
public final class PodAffinityTermArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodAffinityTermArgs Empty = new PodAffinityTermArgs();

    /**
     * A label query over a set of resources, in this case pods.
     * 
     */
    @Import(name="labelSelector")
      private final @Nullable Output<LabelSelectorArgs> labelSelector;

    public Output<LabelSelectorArgs> labelSelector() {
        return this.labelSelector == null ? Codegen.empty() : this.labelSelector;
    }

    /**
     * A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means "this pod's namespace". An empty selector ({}) matches all namespaces. This field is beta-level and is only honored when PodAffinityNamespaceSelector feature is enabled.
     * 
     */
    @Import(name="namespaceSelector")
      private final @Nullable Output<LabelSelectorArgs> namespaceSelector;

    public Output<LabelSelectorArgs> namespaceSelector() {
        return this.namespaceSelector == null ? Codegen.empty() : this.namespaceSelector;
    }

    /**
     * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace"
     * 
     */
    @Import(name="namespaces")
      private final @Nullable Output<List<String>> namespaces;

    public Output<List<String>> namespaces() {
        return this.namespaces == null ? Codegen.empty() : this.namespaces;
    }

    /**
     * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * 
     */
    @Import(name="topologyKey", required=true)
      private final Output<String> topologyKey;

    public Output<String> topologyKey() {
        return this.topologyKey;
    }

    public PodAffinityTermArgs(
        @Nullable Output<LabelSelectorArgs> labelSelector,
        @Nullable Output<LabelSelectorArgs> namespaceSelector,
        @Nullable Output<List<String>> namespaces,
        Output<String> topologyKey) {
        this.labelSelector = labelSelector;
        this.namespaceSelector = namespaceSelector;
        this.namespaces = namespaces;
        this.topologyKey = Objects.requireNonNull(topologyKey, "expected parameter 'topologyKey' to be non-null");
    }

    private PodAffinityTermArgs() {
        this.labelSelector = Codegen.empty();
        this.namespaceSelector = Codegen.empty();
        this.namespaces = Codegen.empty();
        this.topologyKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodAffinityTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LabelSelectorArgs> labelSelector;
        private @Nullable Output<LabelSelectorArgs> namespaceSelector;
        private @Nullable Output<List<String>> namespaces;
        private Output<String> topologyKey;

        public Builder() {
    	      // Empty
        }

        public Builder(PodAffinityTermArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelector = defaults.labelSelector;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.namespaces = defaults.namespaces;
    	      this.topologyKey = defaults.topologyKey;
        }

        public Builder labelSelector(@Nullable Output<LabelSelectorArgs> labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }
        public Builder labelSelector(@Nullable LabelSelectorArgs labelSelector) {
            this.labelSelector = Codegen.ofNullable(labelSelector);
            return this;
        }
        public Builder namespaceSelector(@Nullable Output<LabelSelectorArgs> namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }
        public Builder namespaceSelector(@Nullable LabelSelectorArgs namespaceSelector) {
            this.namespaceSelector = Codegen.ofNullable(namespaceSelector);
            return this;
        }
        public Builder namespaces(@Nullable Output<List<String>> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public Builder namespaces(@Nullable List<String> namespaces) {
            this.namespaces = Codegen.ofNullable(namespaces);
            return this;
        }
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }
        public Builder topologyKey(Output<String> topologyKey) {
            this.topologyKey = Objects.requireNonNull(topologyKey);
            return this;
        }
        public Builder topologyKey(String topologyKey) {
            this.topologyKey = Output.of(Objects.requireNonNull(topologyKey));
            return this;
        }        public PodAffinityTermArgs build() {
            return new PodAffinityTermArgs(labelSelector, namespaceSelector, namespaces, topologyKey);
        }
    }
}

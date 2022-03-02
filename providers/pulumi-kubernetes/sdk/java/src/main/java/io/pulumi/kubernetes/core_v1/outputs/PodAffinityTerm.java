// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodAffinityTerm {
    /**
     * A label query over a set of resources, in this case pods.
     * 
     */
    private final @Nullable LabelSelector labelSelector;
    /**
     * A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means "this pod's namespace". An empty selector ({}) matches all namespaces. This field is beta-level and is only honored when PodAffinityNamespaceSelector feature is enabled.
     * 
     */
    private final @Nullable LabelSelector namespaceSelector;
    /**
     * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace"
     * 
     */
    private final @Nullable List<String> namespaces;
    /**
     * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * 
     */
    private final String topologyKey;

    @OutputCustomType.Constructor({"labelSelector","namespaceSelector","namespaces","topologyKey"})
    private PodAffinityTerm(
        @Nullable LabelSelector labelSelector,
        @Nullable LabelSelector namespaceSelector,
        @Nullable List<String> namespaces,
        String topologyKey) {
        this.labelSelector = labelSelector;
        this.namespaceSelector = namespaceSelector;
        this.namespaces = namespaces;
        this.topologyKey = Objects.requireNonNull(topologyKey);
    }

    /**
     * A label query over a set of resources, in this case pods.
     * 
    */
    public Optional<LabelSelector> getLabelSelector() {
        return Optional.ofNullable(this.labelSelector);
    }
    /**
     * A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means "this pod's namespace". An empty selector ({}) matches all namespaces. This field is beta-level and is only honored when PodAffinityNamespaceSelector feature is enabled.
     * 
    */
    public Optional<LabelSelector> getNamespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }
    /**
     * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace"
     * 
    */
    public List<String> getNamespaces() {
        return this.namespaces == null ? List.of() : this.namespaces;
    }
    /**
     * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * 
    */
    public String getTopologyKey() {
        return this.topologyKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodAffinityTerm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LabelSelector labelSelector;
        private @Nullable LabelSelector namespaceSelector;
        private @Nullable List<String> namespaces;
        private String topologyKey;

        public Builder() {
    	      // Empty
        }

        public Builder(PodAffinityTerm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelector = defaults.labelSelector;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.namespaces = defaults.namespaces;
    	      this.topologyKey = defaults.topologyKey;
        }

        public Builder setLabelSelector(@Nullable LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        public Builder setNamespaceSelector(@Nullable LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        public Builder setNamespaces(@Nullable List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        public Builder setTopologyKey(String topologyKey) {
            this.topologyKey = Objects.requireNonNull(topologyKey);
            return this;
        }
        public PodAffinityTerm build() {
            return new PodAffinityTerm(labelSelector, namespaceSelector, namespaces, topologyKey);
        }
    }
}

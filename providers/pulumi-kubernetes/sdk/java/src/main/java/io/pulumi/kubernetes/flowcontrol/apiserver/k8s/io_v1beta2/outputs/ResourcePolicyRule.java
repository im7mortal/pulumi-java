// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourcePolicyRule {
    /**
     * `apiGroups` is a list of matching API groups and may not be empty. "*" matches all API groups and, if present, must be the only entry. Required.
     * 
     */
    private final List<String> apiGroups;
    /**
     * `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
     * 
     */
    private final @Nullable Boolean clusterScope;
    /**
     * `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains "*".  Note that "*" matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
     * 
     */
    private final @Nullable List<String> namespaces;
    /**
     * `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ "services", "nodes/status" ].  This list may not be empty. "*" matches all resources and, if present, must be the only entry. Required.
     * 
     */
    private final List<String> resources;
    /**
     * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs and, if present, must be the only entry. Required.
     * 
     */
    private final List<String> verbs;

    @OutputCustomType.Constructor({"apiGroups","clusterScope","namespaces","resources","verbs"})
    private ResourcePolicyRule(
        List<String> apiGroups,
        @Nullable Boolean clusterScope,
        @Nullable List<String> namespaces,
        List<String> resources,
        List<String> verbs) {
        this.apiGroups = Objects.requireNonNull(apiGroups);
        this.clusterScope = clusterScope;
        this.namespaces = namespaces;
        this.resources = Objects.requireNonNull(resources);
        this.verbs = Objects.requireNonNull(verbs);
    }

    /**
     * `apiGroups` is a list of matching API groups and may not be empty. "*" matches all API groups and, if present, must be the only entry. Required.
     * 
    */
    public List<String> getApiGroups() {
        return this.apiGroups;
    }
    /**
     * `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
     * 
    */
    public Optional<Boolean> getClusterScope() {
        return Optional.ofNullable(this.clusterScope);
    }
    /**
     * `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains "*".  Note that "*" matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
     * 
    */
    public List<String> getNamespaces() {
        return this.namespaces == null ? List.of() : this.namespaces;
    }
    /**
     * `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ "services", "nodes/status" ].  This list may not be empty. "*" matches all resources and, if present, must be the only entry. Required.
     * 
    */
    public List<String> getResources() {
        return this.resources;
    }
    /**
     * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs and, if present, must be the only entry. Required.
     * 
    */
    public List<String> getVerbs() {
        return this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> apiGroups;
        private @Nullable Boolean clusterScope;
        private @Nullable List<String> namespaces;
        private List<String> resources;
        private List<String> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.clusterScope = defaults.clusterScope;
    	      this.namespaces = defaults.namespaces;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        public Builder setApiGroups(List<String> apiGroups) {
            this.apiGroups = Objects.requireNonNull(apiGroups);
            return this;
        }

        public Builder setClusterScope(@Nullable Boolean clusterScope) {
            this.clusterScope = clusterScope;
            return this;
        }

        public Builder setNamespaces(@Nullable List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        public Builder setResources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setVerbs(List<String> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }
        public ResourcePolicyRule build() {
            return new ResourcePolicyRule(apiGroups, clusterScope, namespaces, resources, verbs);
        }
    }
}

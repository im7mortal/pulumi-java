// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceAttributes {
    /**
     * Group is the API Group of the Resource.  "*" means all.
     * 
     */
    private final @Nullable String group;
    /**
     * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
     * 
     */
    private final @Nullable String name;
    /**
     * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * 
     */
    private final @Nullable String namespace;
    /**
     * Resource is one of the existing resource types.  "*" means all.
     * 
     */
    private final @Nullable String resource;
    /**
     * Subresource is one of the existing resource types.  "" means none.
     * 
     */
    private final @Nullable String subresource;
    /**
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * 
     */
    private final @Nullable String verb;
    /**
     * Version is the API Version of the Resource.  "*" means all.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"group","name","namespace","resource","subresource","verb","version"})
    private ResourceAttributes(
        @Nullable String group,
        @Nullable String name,
        @Nullable String namespace,
        @Nullable String resource,
        @Nullable String subresource,
        @Nullable String verb,
        @Nullable String version) {
        this.group = group;
        this.name = name;
        this.namespace = namespace;
        this.resource = resource;
        this.subresource = subresource;
        this.verb = verb;
        this.version = version;
    }

    /**
     * Group is the API Group of the Resource.  "*" means all.
     * 
    */
    public Optional<String> getGroup() {
        return Optional.ofNullable(this.group);
    }
    /**
     * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * 
    */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * Resource is one of the existing resource types.  "*" means all.
     * 
    */
    public Optional<String> getResource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * Subresource is one of the existing resource types.  "" means none.
     * 
    */
    public Optional<String> getSubresource() {
        return Optional.ofNullable(this.subresource);
    }
    /**
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * 
    */
    public Optional<String> getVerb() {
        return Optional.ofNullable(this.verb);
    }
    /**
     * Version is the API Version of the Resource.  "*" means all.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String group;
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable String resource;
        private @Nullable String subresource;
        private @Nullable String verb;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resource = defaults.resource;
    	      this.subresource = defaults.subresource;
    	      this.verb = defaults.verb;
    	      this.version = defaults.version;
        }

        public Builder setGroup(@Nullable String group) {
            this.group = group;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setResource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }

        public Builder setSubresource(@Nullable String subresource) {
            this.subresource = subresource;
            return this;
        }

        public Builder setVerb(@Nullable String verb) {
            this.verb = verb;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ResourceAttributes build() {
            return new ResourceAttributes(group, name, namespace, resource, subresource, verb, version);
        }
    }
}

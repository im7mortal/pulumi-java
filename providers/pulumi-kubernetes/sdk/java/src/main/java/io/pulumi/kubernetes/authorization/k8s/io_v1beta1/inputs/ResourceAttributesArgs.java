// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
 * 
 */
public final class ResourceAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceAttributesArgs Empty = new ResourceAttributesArgs();

    /**
     * Group is the API Group of the Resource.  "*" means all.
     * 
     */
    @InputImport(name="group")
    private final @Nullable Input<String> group;

    public Input<String> getGroup() {
        return this.group == null ? Input.empty() : this.group;
    }

    /**
     * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    /**
     * Resource is one of the existing resource types.  "*" means all.
     * 
     */
    @InputImport(name="resource")
    private final @Nullable Input<String> resource;

    public Input<String> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    /**
     * Subresource is one of the existing resource types.  "" means none.
     * 
     */
    @InputImport(name="subresource")
    private final @Nullable Input<String> subresource;

    public Input<String> getSubresource() {
        return this.subresource == null ? Input.empty() : this.subresource;
    }

    /**
     * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
     * 
     */
    @InputImport(name="verb")
    private final @Nullable Input<String> verb;

    public Input<String> getVerb() {
        return this.verb == null ? Input.empty() : this.verb;
    }

    /**
     * Version is the API Version of the Resource.  "*" means all.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ResourceAttributesArgs(
        @Nullable Input<String> group,
        @Nullable Input<String> name,
        @Nullable Input<String> namespace,
        @Nullable Input<String> resource,
        @Nullable Input<String> subresource,
        @Nullable Input<String> verb,
        @Nullable Input<String> version) {
        this.group = group;
        this.name = name;
        this.namespace = namespace;
        this.resource = resource;
        this.subresource = subresource;
        this.verb = verb;
        this.version = version;
    }

    private ResourceAttributesArgs() {
        this.group = Input.empty();
        this.name = Input.empty();
        this.namespace = Input.empty();
        this.resource = Input.empty();
        this.subresource = Input.empty();
        this.verb = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> group;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namespace;
        private @Nullable Input<String> resource;
        private @Nullable Input<String> subresource;
        private @Nullable Input<String> verb;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resource = defaults.resource;
    	      this.subresource = defaults.subresource;
    	      this.verb = defaults.verb;
    	      this.version = defaults.version;
        }

        public Builder setGroup(@Nullable Input<String> group) {
            this.group = group;
            return this;
        }

        public Builder setGroup(@Nullable String group) {
            this.group = Input.ofNullable(group);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder setResource(@Nullable Input<String> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable String resource) {
            this.resource = Input.ofNullable(resource);
            return this;
        }

        public Builder setSubresource(@Nullable Input<String> subresource) {
            this.subresource = subresource;
            return this;
        }

        public Builder setSubresource(@Nullable String subresource) {
            this.subresource = Input.ofNullable(subresource);
            return this;
        }

        public Builder setVerb(@Nullable Input<String> verb) {
            this.verb = verb;
            return this;
        }

        public Builder setVerb(@Nullable String verb) {
            this.verb = Input.ofNullable(verb);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public ResourceAttributesArgs build() {
            return new ResourceAttributesArgs(group, name, namespace, resource, subresource, verb, version);
        }
    }
}

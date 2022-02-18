// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.inputs.RoleRefArgs;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.inputs.SubjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleBindingArgs Empty = new RoleBindingArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Standard object's metadata.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
     */
    @InputImport(name="roleRef", required=true)
    private final Input<RoleRefArgs> roleRef;

    public Input<RoleRefArgs> getRoleRef() {
        return this.roleRef;
    }

    /**
     * Subjects holds references to the objects the role applies to.
     * 
     */
    @InputImport(name="subjects")
    private final @Nullable Input<List<SubjectArgs>> subjects;

    public Input<List<SubjectArgs>> getSubjects() {
        return this.subjects == null ? Input.empty() : this.subjects;
    }

    public RoleBindingArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        Input<RoleRefArgs> roleRef,
        @Nullable Input<List<SubjectArgs>> subjects) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.roleRef = Objects.requireNonNull(roleRef, "expected parameter 'roleRef' to be non-null");
        this.subjects = subjects;
    }

    private RoleBindingArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.roleRef = Input.empty();
        this.subjects = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private Input<RoleRefArgs> roleRef;
        private @Nullable Input<List<SubjectArgs>> subjects;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.roleRef = defaults.roleRef;
    	      this.subjects = defaults.subjects;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setRoleRef(Input<RoleRefArgs> roleRef) {
            this.roleRef = Objects.requireNonNull(roleRef);
            return this;
        }

        public Builder setRoleRef(RoleRefArgs roleRef) {
            this.roleRef = Input.of(Objects.requireNonNull(roleRef));
            return this;
        }

        public Builder setSubjects(@Nullable Input<List<SubjectArgs>> subjects) {
            this.subjects = subjects;
            return this;
        }

        public Builder setSubjects(@Nullable List<SubjectArgs> subjects) {
            this.subjects = Input.ofNullable(subjects);
            return this;
        }

        public RoleBindingArgs build() {
            return new RoleBindingArgs(apiVersion, kind, metadata, roleRef, subjects);
        }
    }
}

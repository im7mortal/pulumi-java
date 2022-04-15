// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> apiVersion() {
        return this.apiVersion == null ? Codegen.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Standard object's metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
     */
    @Import(name="roleRef", required=true)
      private final Output<RoleRefArgs> roleRef;

    public Output<RoleRefArgs> roleRef() {
        return this.roleRef;
    }

    /**
     * Subjects holds references to the objects the role applies to.
     * 
     */
    @Import(name="subjects")
      private final @Nullable Output<List<SubjectArgs>> subjects;

    public Output<List<SubjectArgs>> subjects() {
        return this.subjects == null ? Codegen.empty() : this.subjects;
    }

    public RoleBindingArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        Output<RoleRefArgs> roleRef,
        @Nullable Output<List<SubjectArgs>> subjects) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.roleRef = Objects.requireNonNull(roleRef, "expected parameter 'roleRef' to be non-null");
        this.subjects = subjects;
    }

    private RoleBindingArgs() {
        this.apiVersion = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.roleRef = Codegen.empty();
        this.subjects = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private Output<RoleRefArgs> roleRef;
        private @Nullable Output<List<SubjectArgs>> subjects;

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

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder roleRef(Output<RoleRefArgs> roleRef) {
            this.roleRef = Objects.requireNonNull(roleRef);
            return this;
        }
        public Builder roleRef(RoleRefArgs roleRef) {
            this.roleRef = Output.of(Objects.requireNonNull(roleRef));
            return this;
        }
        public Builder subjects(@Nullable Output<List<SubjectArgs>> subjects) {
            this.subjects = subjects;
            return this;
        }
        public Builder subjects(@Nullable List<SubjectArgs> subjects) {
            this.subjects = Codegen.ofNullable(subjects);
            return this;
        }
        public Builder subjects(SubjectArgs... subjects) {
            return subjects(List.of(subjects));
        }        public RoleBindingArgs build() {
            return new RoleBindingArgs(apiVersion, kind, metadata, roleRef, subjects);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultObjectAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultObjectAccessControlArgs Empty = new DefaultObjectAccessControlArgs();

    /**
     * The name of the bucket.
     * 
     */
    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * The entity holding the permission, in one of the following forms:
     * * user-{{userId}}
     * * user-{{email}} (such as "user-liz@example.com")
     * * group-{{groupId}}
     * * group-{{email}} (such as "group-example@googlegroups.com")
     * * domain-{{domain}} (such as "domain-example.com")
     * * project-team-{{projectId}}
     * * allUsers
     * * allAuthenticatedUsers
     * 
     */
    @InputImport(name="entity", required=true)
    private final Input<String> entity;

    public Input<String> getEntity() {
        return this.entity;
    }

    /**
     * The name of the object, if applied to an object.
     * 
     */
    @InputImport(name="object")
    private final @Nullable Input<String> object;

    public Input<String> getObject() {
        return this.object == null ? Input.empty() : this.object;
    }

    /**
     * The access permission for the entity.
     * Possible values are `OWNER` and `READER`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public DefaultObjectAccessControlArgs(
        Input<String> bucket,
        Input<String> entity,
        @Nullable Input<String> object,
        Input<String> role) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.entity = Objects.requireNonNull(entity, "expected parameter 'entity' to be non-null");
        this.object = object;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private DefaultObjectAccessControlArgs() {
        this.bucket = Input.empty();
        this.entity = Input.empty();
        this.object = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultObjectAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<String> entity;
        private @Nullable Input<String> object;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultObjectAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.entity = defaults.entity;
    	      this.object = defaults.object;
    	      this.role = defaults.role;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setEntity(Input<String> entity) {
            this.entity = Objects.requireNonNull(entity);
            return this;
        }

        public Builder setEntity(String entity) {
            this.entity = Input.of(Objects.requireNonNull(entity));
            return this;
        }

        public Builder setObject(@Nullable Input<String> object) {
            this.object = object;
            return this;
        }

        public Builder setObject(@Nullable String object) {
            this.object = Input.ofNullable(object);
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public DefaultObjectAccessControlArgs build() {
            return new DefaultObjectAccessControlArgs(bucket, entity, object, role);
        }
    }
}
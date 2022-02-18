// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketIAMBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketIAMBindingArgs Empty = new BucketIAMBindingArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<BucketIAMBindingConditionArgs> condition;

    public Input<BucketIAMBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Identities that will be granted the privilege in `role`.
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
     * * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
     * * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
     * 
     */
    @InputImport(name="members", required=true)
    private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.storage.BucketIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public BucketIAMBindingArgs(
        Input<String> bucket,
        @Nullable Input<BucketIAMBindingConditionArgs> condition,
        Input<List<String>> members,
        Input<String> role) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private BucketIAMBindingArgs() {
        this.bucket = Input.empty();
        this.condition = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIAMBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<BucketIAMBindingConditionArgs> condition;
        private Input<List<String>> members;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIAMBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
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

        public Builder setCondition(@Nullable Input<BucketIAMBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable BucketIAMBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
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

        public BucketIAMBindingArgs build() {
            return new BucketIAMBindingArgs(bucket, condition, members, role);
        }
    }
}
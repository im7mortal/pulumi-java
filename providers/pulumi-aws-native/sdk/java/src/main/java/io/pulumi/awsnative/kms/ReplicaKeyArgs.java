// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kms;

import io.pulumi.awsnative.kms.inputs.ReplicaKeyTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicaKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicaKeyArgs Empty = new ReplicaKeyArgs();

    /**
     * A description of the CMK. Use a description that helps you to distinguish this CMK from others in the account, such as its intended use.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies whether the customer master key (CMK) is enabled. Disabled CMKs cannot be used in cryptographic operations.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The key policy that authorizes use of the CMK. The key policy must observe the following rules.
     * 
     */
    @InputImport(name="keyPolicy", required=true)
    private final Input<Object> keyPolicy;

    public Input<Object> getKeyPolicy() {
        return this.keyPolicy;
    }

    /**
     * Specifies the number of days in the waiting period before AWS KMS deletes a CMK that has been removed from a CloudFormation stack. Enter a value between 7 and 30 days. The default value is 30 days.
     * 
     */
    @InputImport(name="pendingWindowInDays")
    private final @Nullable Input<Integer> pendingWindowInDays;

    public Input<Integer> getPendingWindowInDays() {
        return this.pendingWindowInDays == null ? Input.empty() : this.pendingWindowInDays;
    }

    /**
     * Identifies the primary CMK to create a replica of. Specify the Amazon Resource Name (ARN) of the CMK. You cannot specify an alias or key ID. For help finding the ARN, see Finding the Key ID and ARN in the AWS Key Management Service Developer Guide.
     * 
     */
    @InputImport(name="primaryKeyArn", required=true)
    private final Input<String> primaryKeyArn;

    public Input<String> getPrimaryKeyArn() {
        return this.primaryKeyArn;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<ReplicaKeyTagArgs>> tags;

    public Input<List<ReplicaKeyTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ReplicaKeyArgs(
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enabled,
        Input<Object> keyPolicy,
        @Nullable Input<Integer> pendingWindowInDays,
        Input<String> primaryKeyArn,
        @Nullable Input<List<ReplicaKeyTagArgs>> tags) {
        this.description = description;
        this.enabled = enabled;
        this.keyPolicy = Objects.requireNonNull(keyPolicy, "expected parameter 'keyPolicy' to be non-null");
        this.pendingWindowInDays = pendingWindowInDays;
        this.primaryKeyArn = Objects.requireNonNull(primaryKeyArn, "expected parameter 'primaryKeyArn' to be non-null");
        this.tags = tags;
    }

    private ReplicaKeyArgs() {
        this.description = Input.empty();
        this.enabled = Input.empty();
        this.keyPolicy = Input.empty();
        this.pendingWindowInDays = Input.empty();
        this.primaryKeyArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enabled;
        private Input<Object> keyPolicy;
        private @Nullable Input<Integer> pendingWindowInDays;
        private Input<String> primaryKeyArn;
        private @Nullable Input<List<ReplicaKeyTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.keyPolicy = defaults.keyPolicy;
    	      this.pendingWindowInDays = defaults.pendingWindowInDays;
    	      this.primaryKeyArn = defaults.primaryKeyArn;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setKeyPolicy(Input<Object> keyPolicy) {
            this.keyPolicy = Objects.requireNonNull(keyPolicy);
            return this;
        }

        public Builder setKeyPolicy(Object keyPolicy) {
            this.keyPolicy = Input.of(Objects.requireNonNull(keyPolicy));
            return this;
        }

        public Builder setPendingWindowInDays(@Nullable Input<Integer> pendingWindowInDays) {
            this.pendingWindowInDays = pendingWindowInDays;
            return this;
        }

        public Builder setPendingWindowInDays(@Nullable Integer pendingWindowInDays) {
            this.pendingWindowInDays = Input.ofNullable(pendingWindowInDays);
            return this;
        }

        public Builder setPrimaryKeyArn(Input<String> primaryKeyArn) {
            this.primaryKeyArn = Objects.requireNonNull(primaryKeyArn);
            return this;
        }

        public Builder setPrimaryKeyArn(String primaryKeyArn) {
            this.primaryKeyArn = Input.of(Objects.requireNonNull(primaryKeyArn));
            return this;
        }

        public Builder setTags(@Nullable Input<List<ReplicaKeyTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ReplicaKeyTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ReplicaKeyArgs build() {
            return new ReplicaKeyArgs(description, enabled, keyPolicy, pendingWindowInDays, primaryKeyArn, tags);
        }
    }
}

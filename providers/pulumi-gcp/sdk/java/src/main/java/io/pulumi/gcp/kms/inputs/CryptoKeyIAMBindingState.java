// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CryptoKeyIAMBindingState extends io.pulumi.resources.ResourceArgs {

    public static final CryptoKeyIAMBindingState Empty = new CryptoKeyIAMBindingState();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<CryptoKeyIAMBindingConditionGetArgs> condition;

    public Input<CryptoKeyIAMBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider's project setting will be used as a fallback.
     * 
     */
    @InputImport(name="cryptoKeyId")
    private final @Nullable Input<String> cryptoKeyId;

    public Input<String> getCryptoKeyId() {
        return this.cryptoKeyId == null ? Input.empty() : this.cryptoKeyId;
    }

    /**
     * (Computed) The etag of the project's IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="members")
    private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The role that should be applied. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public CryptoKeyIAMBindingState(
        @Nullable Input<CryptoKeyIAMBindingConditionGetArgs> condition,
        @Nullable Input<String> cryptoKeyId,
        @Nullable Input<String> etag,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.cryptoKeyId = cryptoKeyId;
        this.etag = etag;
        this.members = members;
        this.role = role;
    }

    private CryptoKeyIAMBindingState() {
        this.condition = Input.empty();
        this.cryptoKeyId = Input.empty();
        this.etag = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyIAMBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CryptoKeyIAMBindingConditionGetArgs> condition;
        private @Nullable Input<String> cryptoKeyId;
        private @Nullable Input<String> etag;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyIAMBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.cryptoKeyId = defaults.cryptoKeyId;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<CryptoKeyIAMBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable CryptoKeyIAMBindingConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setCryptoKeyId(@Nullable Input<String> cryptoKeyId) {
            this.cryptoKeyId = cryptoKeyId;
            return this;
        }

        public Builder setCryptoKeyId(@Nullable String cryptoKeyId) {
            this.cryptoKeyId = Input.ofNullable(cryptoKeyId);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public CryptoKeyIAMBindingState build() {
            return new CryptoKeyIAMBindingState(condition, cryptoKeyId, etag, members, role);
        }
    }
}
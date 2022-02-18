// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.signer;

import io.pulumi.awsnative.signer.enums.SigningProfilePlatformId;
import io.pulumi.awsnative.signer.inputs.SigningProfileSignatureValidityPeriodArgs;
import io.pulumi.awsnative.signer.inputs.SigningProfileTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningProfileArgs Empty = new SigningProfileArgs();

    /**
     * The ID of the target signing platform.
     * 
     */
    @InputImport(name="platformId", required=true)
    private final Input<SigningProfilePlatformId> platformId;

    public Input<SigningProfilePlatformId> getPlatformId() {
        return this.platformId;
    }

    /**
     * Signature validity period of the profile.
     * 
     */
    @InputImport(name="signatureValidityPeriod")
    private final @Nullable Input<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;

    public Input<SigningProfileSignatureValidityPeriodArgs> getSignatureValidityPeriod() {
        return this.signatureValidityPeriod == null ? Input.empty() : this.signatureValidityPeriod;
    }

    /**
     * A list of tags associated with the signing profile.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<SigningProfileTagArgs>> tags;

    public Input<List<SigningProfileTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SigningProfileArgs(
        Input<SigningProfilePlatformId> platformId,
        @Nullable Input<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod,
        @Nullable Input<List<SigningProfileTagArgs>> tags) {
        this.platformId = Objects.requireNonNull(platformId, "expected parameter 'platformId' to be non-null");
        this.signatureValidityPeriod = signatureValidityPeriod;
        this.tags = tags;
    }

    private SigningProfileArgs() {
        this.platformId = Input.empty();
        this.signatureValidityPeriod = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SigningProfilePlatformId> platformId;
        private @Nullable Input<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;
        private @Nullable Input<List<SigningProfileTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.platformId = defaults.platformId;
    	      this.signatureValidityPeriod = defaults.signatureValidityPeriod;
    	      this.tags = defaults.tags;
        }

        public Builder setPlatformId(Input<SigningProfilePlatformId> platformId) {
            this.platformId = Objects.requireNonNull(platformId);
            return this;
        }

        public Builder setPlatformId(SigningProfilePlatformId platformId) {
            this.platformId = Input.of(Objects.requireNonNull(platformId));
            return this;
        }

        public Builder setSignatureValidityPeriod(@Nullable Input<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod) {
            this.signatureValidityPeriod = signatureValidityPeriod;
            return this;
        }

        public Builder setSignatureValidityPeriod(@Nullable SigningProfileSignatureValidityPeriodArgs signatureValidityPeriod) {
            this.signatureValidityPeriod = Input.ofNullable(signatureValidityPeriod);
            return this;
        }

        public Builder setTags(@Nullable Input<List<SigningProfileTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<SigningProfileTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public SigningProfileArgs build() {
            return new SigningProfileArgs(platformId, signatureValidityPeriod, tags);
        }
    }
}

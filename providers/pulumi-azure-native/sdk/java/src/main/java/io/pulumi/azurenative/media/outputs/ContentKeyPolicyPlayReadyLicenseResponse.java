// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse;
import io.pulumi.azurenative.media.outputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse;
import io.pulumi.azurenative.media.outputs.ContentKeyPolicyPlayReadyPlayRightResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContentKeyPolicyPlayReadyLicenseResponse {
    /**
     * A flag indicating whether test devices can use the license.
     * 
     */
    private final Boolean allowTestDevices;
    /**
     * The begin date of license
     * 
     */
    private final @Nullable String beginDate;
    /**
     * The content key location.
     * 
     */
    private final Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation;
    /**
     * The PlayReady content type.
     * 
     */
    private final String contentType;
    /**
     * The expiration date of license.
     * 
     */
    private final @Nullable String expirationDate;
    /**
     * The grace period of license.
     * 
     */
    private final @Nullable String gracePeriod;
    /**
     * The license type.
     * 
     */
    private final String licenseType;
    /**
     * The license PlayRight
     * 
     */
    private final @Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight;
    /**
     * The relative begin date of license.
     * 
     */
    private final @Nullable String relativeBeginDate;
    /**
     * The relative expiration date of license.
     * 
     */
    private final @Nullable String relativeExpirationDate;

    @OutputCustomType.Constructor({"allowTestDevices","beginDate","contentKeyLocation","contentType","expirationDate","gracePeriod","licenseType","playRight","relativeBeginDate","relativeExpirationDate"})
    private ContentKeyPolicyPlayReadyLicenseResponse(
        Boolean allowTestDevices,
        @Nullable String beginDate,
        Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation,
        String contentType,
        @Nullable String expirationDate,
        @Nullable String gracePeriod,
        String licenseType,
        @Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight,
        @Nullable String relativeBeginDate,
        @Nullable String relativeExpirationDate) {
        this.allowTestDevices = Objects.requireNonNull(allowTestDevices);
        this.beginDate = beginDate;
        this.contentKeyLocation = Objects.requireNonNull(contentKeyLocation);
        this.contentType = Objects.requireNonNull(contentType);
        this.expirationDate = expirationDate;
        this.gracePeriod = gracePeriod;
        this.licenseType = Objects.requireNonNull(licenseType);
        this.playRight = playRight;
        this.relativeBeginDate = relativeBeginDate;
        this.relativeExpirationDate = relativeExpirationDate;
    }

    /**
     * A flag indicating whether test devices can use the license.
     * 
    */
    public Boolean getAllowTestDevices() {
        return this.allowTestDevices;
    }
    /**
     * The begin date of license
     * 
    */
    public Optional<String> getBeginDate() {
        return Optional.ofNullable(this.beginDate);
    }
    /**
     * The content key location.
     * 
    */
    public Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> getContentKeyLocation() {
        return this.contentKeyLocation;
    }
    /**
     * The PlayReady content type.
     * 
    */
    public String getContentType() {
        return this.contentType;
    }
    /**
     * The expiration date of license.
     * 
    */
    public Optional<String> getExpirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * The grace period of license.
     * 
    */
    public Optional<String> getGracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }
    /**
     * The license type.
     * 
    */
    public String getLicenseType() {
        return this.licenseType;
    }
    /**
     * The license PlayRight
     * 
    */
    public Optional<ContentKeyPolicyPlayReadyPlayRightResponse> getPlayRight() {
        return Optional.ofNullable(this.playRight);
    }
    /**
     * The relative begin date of license.
     * 
    */
    public Optional<String> getRelativeBeginDate() {
        return Optional.ofNullable(this.relativeBeginDate);
    }
    /**
     * The relative expiration date of license.
     * 
    */
    public Optional<String> getRelativeExpirationDate() {
        return Optional.ofNullable(this.relativeExpirationDate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyLicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowTestDevices;
        private @Nullable String beginDate;
        private Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation;
        private String contentType;
        private @Nullable String expirationDate;
        private @Nullable String gracePeriod;
        private String licenseType;
        private @Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight;
        private @Nullable String relativeBeginDate;
        private @Nullable String relativeExpirationDate;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyLicenseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTestDevices = defaults.allowTestDevices;
    	      this.beginDate = defaults.beginDate;
    	      this.contentKeyLocation = defaults.contentKeyLocation;
    	      this.contentType = defaults.contentType;
    	      this.expirationDate = defaults.expirationDate;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.licenseType = defaults.licenseType;
    	      this.playRight = defaults.playRight;
    	      this.relativeBeginDate = defaults.relativeBeginDate;
    	      this.relativeExpirationDate = defaults.relativeExpirationDate;
        }

        public Builder setAllowTestDevices(Boolean allowTestDevices) {
            this.allowTestDevices = Objects.requireNonNull(allowTestDevices);
            return this;
        }

        public Builder setBeginDate(@Nullable String beginDate) {
            this.beginDate = beginDate;
            return this;
        }

        public Builder setContentKeyLocation(Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation) {
            this.contentKeyLocation = Objects.requireNonNull(contentKeyLocation);
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setGracePeriod(@Nullable String gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }

        public Builder setLicenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }

        public Builder setPlayRight(@Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight) {
            this.playRight = playRight;
            return this;
        }

        public Builder setRelativeBeginDate(@Nullable String relativeBeginDate) {
            this.relativeBeginDate = relativeBeginDate;
            return this;
        }

        public Builder setRelativeExpirationDate(@Nullable String relativeExpirationDate) {
            this.relativeExpirationDate = relativeExpirationDate;
            return this;
        }
        public ContentKeyPolicyPlayReadyLicenseResponse build() {
            return new ContentKeyPolicyPlayReadyLicenseResponse(allowTestDevices, beginDate, contentKeyLocation, contentType, expirationDate, gracePeriod, licenseType, playRight, relativeBeginDate, relativeExpirationDate);
        }
    }
}

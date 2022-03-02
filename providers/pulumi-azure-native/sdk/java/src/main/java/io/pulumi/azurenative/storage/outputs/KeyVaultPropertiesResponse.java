// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultPropertiesResponse {
    /**
     * The object identifier of the current versioned Key Vault Key in use.
     * 
     */
    private final String currentVersionedKeyIdentifier;
    /**
     * The name of KeyVault key.
     * 
     */
    private final @Nullable String keyName;
    /**
     * The Uri of KeyVault.
     * 
     */
    private final @Nullable String keyVaultUri;
    /**
     * The version of KeyVault key.
     * 
     */
    private final @Nullable String keyVersion;
    /**
     * Timestamp of last rotation of the Key Vault Key.
     * 
     */
    private final String lastKeyRotationTimestamp;

    @OutputCustomType.Constructor({"currentVersionedKeyIdentifier","keyName","keyVaultUri","keyVersion","lastKeyRotationTimestamp"})
    private KeyVaultPropertiesResponse(
        String currentVersionedKeyIdentifier,
        @Nullable String keyName,
        @Nullable String keyVaultUri,
        @Nullable String keyVersion,
        String lastKeyRotationTimestamp) {
        this.currentVersionedKeyIdentifier = Objects.requireNonNull(currentVersionedKeyIdentifier);
        this.keyName = keyName;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
        this.lastKeyRotationTimestamp = Objects.requireNonNull(lastKeyRotationTimestamp);
    }

    /**
     * The object identifier of the current versioned Key Vault Key in use.
     * 
    */
    public String getCurrentVersionedKeyIdentifier() {
        return this.currentVersionedKeyIdentifier;
    }
    /**
     * The name of KeyVault key.
     * 
    */
    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * The Uri of KeyVault.
     * 
    */
    public Optional<String> getKeyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }
    /**
     * The version of KeyVault key.
     * 
    */
    public Optional<String> getKeyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }
    /**
     * Timestamp of last rotation of the Key Vault Key.
     * 
    */
    public String getLastKeyRotationTimestamp() {
        return this.lastKeyRotationTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentVersionedKeyIdentifier;
        private @Nullable String keyName;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;
        private String lastKeyRotationTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentVersionedKeyIdentifier = defaults.currentVersionedKeyIdentifier;
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
    	      this.lastKeyRotationTimestamp = defaults.lastKeyRotationTimestamp;
        }

        public Builder setCurrentVersionedKeyIdentifier(String currentVersionedKeyIdentifier) {
            this.currentVersionedKeyIdentifier = Objects.requireNonNull(currentVersionedKeyIdentifier);
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder setLastKeyRotationTimestamp(String lastKeyRotationTimestamp) {
            this.lastKeyRotationTimestamp = Objects.requireNonNull(lastKeyRotationTimestamp);
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(currentVersionedKeyIdentifier, keyName, keyVaultUri, keyVersion, lastKeyRotationTimestamp);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultPropertiesResponse {
    /**
     * The name of the key associated with the Log Analytics cluster.
     * 
     */
    private final @Nullable String keyName;
    /**
     * Selected key minimum required size.
     * 
     */
    private final @Nullable Integer keyRsaSize;
    /**
     * The Key Vault uri which holds they key associated with the Log Analytics cluster.
     * 
     */
    private final @Nullable String keyVaultUri;
    /**
     * The version of the key associated with the Log Analytics cluster.
     * 
     */
    private final @Nullable String keyVersion;

    @OutputCustomType.Constructor({"keyName","keyRsaSize","keyVaultUri","keyVersion"})
    private KeyVaultPropertiesResponse(
        @Nullable String keyName,
        @Nullable Integer keyRsaSize,
        @Nullable String keyVaultUri,
        @Nullable String keyVersion) {
        this.keyName = keyName;
        this.keyRsaSize = keyRsaSize;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    /**
     * The name of the key associated with the Log Analytics cluster.
     * 
    */
    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * Selected key minimum required size.
     * 
    */
    public Optional<Integer> getKeyRsaSize() {
        return Optional.ofNullable(this.keyRsaSize);
    }
    /**
     * The Key Vault uri which holds they key associated with the Log Analytics cluster.
     * 
    */
    public Optional<String> getKeyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }
    /**
     * The version of the key associated with the Log Analytics cluster.
     * 
    */
    public Optional<String> getKeyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable Integer keyRsaSize;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyRsaSize = defaults.keyRsaSize;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyRsaSize(@Nullable Integer keyRsaSize) {
            this.keyRsaSize = keyRsaSize;
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
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyName, keyRsaSize, keyVaultUri, keyVersion);
        }
    }
}

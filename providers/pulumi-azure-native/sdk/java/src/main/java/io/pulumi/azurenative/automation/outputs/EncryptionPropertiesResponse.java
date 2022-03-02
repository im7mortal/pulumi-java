// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.EncryptionPropertiesResponseIdentity;
import io.pulumi.azurenative.automation.outputs.KeyVaultPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionPropertiesResponse {
    /**
     * User identity used for CMK.
     * 
     */
    private final @Nullable EncryptionPropertiesResponseIdentity identity;
    /**
     * Encryption Key Source
     * 
     */
    private final @Nullable String keySource;
    /**
     * Key vault properties.
     * 
     */
    private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    @OutputCustomType.Constructor({"identity","keySource","keyVaultProperties"})
    private EncryptionPropertiesResponse(
        @Nullable EncryptionPropertiesResponseIdentity identity,
        @Nullable String keySource,
        @Nullable KeyVaultPropertiesResponse keyVaultProperties) {
        this.identity = identity;
        this.keySource = keySource;
        this.keyVaultProperties = keyVaultProperties;
    }

    /**
     * User identity used for CMK.
     * 
    */
    public Optional<EncryptionPropertiesResponseIdentity> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Encryption Key Source
     * 
    */
    public Optional<String> getKeySource() {
        return Optional.ofNullable(this.keySource);
    }
    /**
     * Key vault properties.
     * 
    */
    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EncryptionPropertiesResponseIdentity identity;
        private @Nullable String keySource;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder setIdentity(@Nullable EncryptionPropertiesResponseIdentity identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKeySource(@Nullable String keySource) {
            this.keySource = keySource;
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public EncryptionPropertiesResponse build() {
            return new EncryptionPropertiesResponse(identity, keySource, keyVaultProperties);
        }
    }
}

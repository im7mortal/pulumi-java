// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultPropertiesResponse {
    /**
     * Full path to the versioned secret. Example https://mykeyvault.vault.azure.net/keys/testkey/6e34a81fef704045975661e297a4c053. To be usable the following prerequisites must be met:
     * 
     *  The Batch Account has a System Assigned identity
     *  The account identity has been granted Key/Get, Key/Unwrap and Key/Wrap permissions
     *  The KeyVault has soft-delete and purge protection enabled
     * 
     */
    private final @Nullable String keyIdentifier;

    @OutputCustomType.Constructor({"keyIdentifier"})
    private KeyVaultPropertiesResponse(@Nullable String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    /**
     * Full path to the versioned secret. Example https://mykeyvault.vault.azure.net/keys/testkey/6e34a81fef704045975661e297a4c053. To be usable the following prerequisites must be met:
     * 
     *  The Batch Account has a System Assigned identity
     *  The account identity has been granted Key/Get, Key/Unwrap and Key/Wrap permissions
     *  The KeyVault has soft-delete and purge protection enabled
     * 
    */
    public Optional<String> getKeyIdentifier() {
        return Optional.ofNullable(this.keyIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyIdentifier = defaults.keyIdentifier;
        }

        public Builder setKeyIdentifier(@Nullable String keyIdentifier) {
            this.keyIdentifier = keyIdentifier;
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyIdentifier);
        }
    }
}

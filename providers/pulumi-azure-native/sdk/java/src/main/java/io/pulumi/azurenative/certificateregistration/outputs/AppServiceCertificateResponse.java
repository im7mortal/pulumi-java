// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AppServiceCertificateResponse {
    /**
     * Key Vault resource Id.
     * 
     */
    private final @Nullable String keyVaultId;
    /**
     * Key Vault secret name.
     * 
     */
    private final @Nullable String keyVaultSecretName;
    /**
     * Status of the Key Vault secret.
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"keyVaultId","keyVaultSecretName","provisioningState"})
    private AppServiceCertificateResponse(
        @Nullable String keyVaultId,
        @Nullable String keyVaultSecretName,
        String provisioningState) {
        this.keyVaultId = keyVaultId;
        this.keyVaultSecretName = keyVaultSecretName;
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * Key Vault resource Id.
     * 
    */
    public Optional<String> getKeyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }
    /**
     * Key Vault secret name.
     * 
    */
    public Optional<String> getKeyVaultSecretName() {
        return Optional.ofNullable(this.keyVaultSecretName);
    }
    /**
     * Status of the Key Vault secret.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServiceCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyVaultId;
        private @Nullable String keyVaultSecretName;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServiceCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultSecretName = defaults.keyVaultSecretName;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setKeyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder setKeyVaultSecretName(@Nullable String keyVaultSecretName) {
            this.keyVaultSecretName = keyVaultSecretName;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public AppServiceCertificateResponse build() {
            return new AppServiceCertificateResponse(keyVaultId, keyVaultSecretName, provisioningState);
        }
    }
}

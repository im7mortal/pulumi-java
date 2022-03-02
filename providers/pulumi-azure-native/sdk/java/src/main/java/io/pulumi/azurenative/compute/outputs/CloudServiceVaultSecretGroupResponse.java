// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CloudServiceVaultCertificateResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudServiceVaultSecretGroupResponse {
    /**
     * The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
     */
    private final @Nullable SubResourceResponse sourceVault;
    /**
     * The list of key vault references in SourceVault which contain certificates.
     * 
     */
    private final @Nullable List<CloudServiceVaultCertificateResponse> vaultCertificates;

    @OutputCustomType.Constructor({"sourceVault","vaultCertificates"})
    private CloudServiceVaultSecretGroupResponse(
        @Nullable SubResourceResponse sourceVault,
        @Nullable List<CloudServiceVaultCertificateResponse> vaultCertificates) {
        this.sourceVault = sourceVault;
        this.vaultCertificates = vaultCertificates;
    }

    /**
     * The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
    */
    public Optional<SubResourceResponse> getSourceVault() {
        return Optional.ofNullable(this.sourceVault);
    }
    /**
     * The list of key vault references in SourceVault which contain certificates.
     * 
    */
    public List<CloudServiceVaultCertificateResponse> getVaultCertificates() {
        return this.vaultCertificates == null ? List.of() : this.vaultCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceVaultSecretGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse sourceVault;
        private @Nullable List<CloudServiceVaultCertificateResponse> vaultCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceVaultSecretGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceVault = defaults.sourceVault;
    	      this.vaultCertificates = defaults.vaultCertificates;
        }

        public Builder setSourceVault(@Nullable SubResourceResponse sourceVault) {
            this.sourceVault = sourceVault;
            return this;
        }

        public Builder setVaultCertificates(@Nullable List<CloudServiceVaultCertificateResponse> vaultCertificates) {
            this.vaultCertificates = vaultCertificates;
            return this;
        }
        public CloudServiceVaultSecretGroupResponse build() {
            return new CloudServiceVaultSecretGroupResponse(sourceVault, vaultCertificates);
        }
    }
}

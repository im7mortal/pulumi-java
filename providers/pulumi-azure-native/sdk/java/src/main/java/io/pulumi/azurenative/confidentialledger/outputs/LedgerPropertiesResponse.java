// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confidentialledger.outputs;

import io.pulumi.azurenative.confidentialledger.outputs.AADBasedSecurityPrincipalResponse;
import io.pulumi.azurenative.confidentialledger.outputs.CertBasedSecurityPrincipalResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LedgerPropertiesResponse {
    /**
     * Array of all AAD based Security Principals.
     * 
     */
    private final @Nullable List<AADBasedSecurityPrincipalResponse> aadBasedSecurityPrincipals;
    /**
     * Array of all cert based Security Principals.
     * 
     */
    private final @Nullable List<CertBasedSecurityPrincipalResponse> certBasedSecurityPrincipals;
    /**
     * Endpoint for accessing network identity.
     * 
     */
    private final String identityServiceUri;
    /**
     * Internal namespace for the Ledger
     * 
     */
    private final String ledgerInternalNamespace;
    /**
     * Unique name for the Confidential Ledger.
     * 
     */
    private final String ledgerName;
    /**
     * Name of the Blob Storage Account for saving ledger files
     * 
     */
    private final @Nullable String ledgerStorageAccount;
    /**
     * Type of Confidential Ledger
     * 
     */
    private final @Nullable String ledgerType;
    /**
     * Endpoint for calling Ledger Service.
     * 
     */
    private final String ledgerUri;
    /**
     * Provisioning state of Ledger Resource
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"aadBasedSecurityPrincipals","certBasedSecurityPrincipals","identityServiceUri","ledgerInternalNamespace","ledgerName","ledgerStorageAccount","ledgerType","ledgerUri","provisioningState"})
    private LedgerPropertiesResponse(
        @Nullable List<AADBasedSecurityPrincipalResponse> aadBasedSecurityPrincipals,
        @Nullable List<CertBasedSecurityPrincipalResponse> certBasedSecurityPrincipals,
        String identityServiceUri,
        String ledgerInternalNamespace,
        String ledgerName,
        @Nullable String ledgerStorageAccount,
        @Nullable String ledgerType,
        String ledgerUri,
        String provisioningState) {
        this.aadBasedSecurityPrincipals = aadBasedSecurityPrincipals;
        this.certBasedSecurityPrincipals = certBasedSecurityPrincipals;
        this.identityServiceUri = Objects.requireNonNull(identityServiceUri);
        this.ledgerInternalNamespace = Objects.requireNonNull(ledgerInternalNamespace);
        this.ledgerName = Objects.requireNonNull(ledgerName);
        this.ledgerStorageAccount = ledgerStorageAccount;
        this.ledgerType = ledgerType;
        this.ledgerUri = Objects.requireNonNull(ledgerUri);
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * Array of all AAD based Security Principals.
     * 
    */
    public List<AADBasedSecurityPrincipalResponse> getAadBasedSecurityPrincipals() {
        return this.aadBasedSecurityPrincipals == null ? List.of() : this.aadBasedSecurityPrincipals;
    }
    /**
     * Array of all cert based Security Principals.
     * 
    */
    public List<CertBasedSecurityPrincipalResponse> getCertBasedSecurityPrincipals() {
        return this.certBasedSecurityPrincipals == null ? List.of() : this.certBasedSecurityPrincipals;
    }
    /**
     * Endpoint for accessing network identity.
     * 
    */
    public String getIdentityServiceUri() {
        return this.identityServiceUri;
    }
    /**
     * Internal namespace for the Ledger
     * 
    */
    public String getLedgerInternalNamespace() {
        return this.ledgerInternalNamespace;
    }
    /**
     * Unique name for the Confidential Ledger.
     * 
    */
    public String getLedgerName() {
        return this.ledgerName;
    }
    /**
     * Name of the Blob Storage Account for saving ledger files
     * 
    */
    public Optional<String> getLedgerStorageAccount() {
        return Optional.ofNullable(this.ledgerStorageAccount);
    }
    /**
     * Type of Confidential Ledger
     * 
    */
    public Optional<String> getLedgerType() {
        return Optional.ofNullable(this.ledgerType);
    }
    /**
     * Endpoint for calling Ledger Service.
     * 
    */
    public String getLedgerUri() {
        return this.ledgerUri;
    }
    /**
     * Provisioning state of Ledger Resource
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LedgerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AADBasedSecurityPrincipalResponse> aadBasedSecurityPrincipals;
        private @Nullable List<CertBasedSecurityPrincipalResponse> certBasedSecurityPrincipals;
        private String identityServiceUri;
        private String ledgerInternalNamespace;
        private String ledgerName;
        private @Nullable String ledgerStorageAccount;
        private @Nullable String ledgerType;
        private String ledgerUri;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(LedgerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadBasedSecurityPrincipals = defaults.aadBasedSecurityPrincipals;
    	      this.certBasedSecurityPrincipals = defaults.certBasedSecurityPrincipals;
    	      this.identityServiceUri = defaults.identityServiceUri;
    	      this.ledgerInternalNamespace = defaults.ledgerInternalNamespace;
    	      this.ledgerName = defaults.ledgerName;
    	      this.ledgerStorageAccount = defaults.ledgerStorageAccount;
    	      this.ledgerType = defaults.ledgerType;
    	      this.ledgerUri = defaults.ledgerUri;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setAadBasedSecurityPrincipals(@Nullable List<AADBasedSecurityPrincipalResponse> aadBasedSecurityPrincipals) {
            this.aadBasedSecurityPrincipals = aadBasedSecurityPrincipals;
            return this;
        }

        public Builder setCertBasedSecurityPrincipals(@Nullable List<CertBasedSecurityPrincipalResponse> certBasedSecurityPrincipals) {
            this.certBasedSecurityPrincipals = certBasedSecurityPrincipals;
            return this;
        }

        public Builder setIdentityServiceUri(String identityServiceUri) {
            this.identityServiceUri = Objects.requireNonNull(identityServiceUri);
            return this;
        }

        public Builder setLedgerInternalNamespace(String ledgerInternalNamespace) {
            this.ledgerInternalNamespace = Objects.requireNonNull(ledgerInternalNamespace);
            return this;
        }

        public Builder setLedgerName(String ledgerName) {
            this.ledgerName = Objects.requireNonNull(ledgerName);
            return this;
        }

        public Builder setLedgerStorageAccount(@Nullable String ledgerStorageAccount) {
            this.ledgerStorageAccount = ledgerStorageAccount;
            return this;
        }

        public Builder setLedgerType(@Nullable String ledgerType) {
            this.ledgerType = ledgerType;
            return this;
        }

        public Builder setLedgerUri(String ledgerUri) {
            this.ledgerUri = Objects.requireNonNull(ledgerUri);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public LedgerPropertiesResponse build() {
            return new LedgerPropertiesResponse(aadBasedSecurityPrincipals, certBasedSecurityPrincipals, identityServiceUri, ledgerInternalNamespace, ledgerName, ledgerStorageAccount, ledgerType, ledgerUri, provisioningState);
        }
    }
}

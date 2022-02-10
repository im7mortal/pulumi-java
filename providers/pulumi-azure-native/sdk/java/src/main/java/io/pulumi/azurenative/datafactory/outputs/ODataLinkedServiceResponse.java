// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ODataLinkedServiceResponse {
    private final @Nullable Object aadResourceId;
    private final @Nullable String aadServicePrincipalCredentialType;
    private final @Nullable List<Object> annotations;
    private final @Nullable Object authHeaders;
    private final @Nullable String authenticationType;
    private final @Nullable Object azureCloudType;
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    private final @Nullable String description;
    private final @Nullable Object encryptedCredential;
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCert;
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCertPassword;
    private final @Nullable Object servicePrincipalId;
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    private final @Nullable Object tenant;
    private final String type;
    private final Object url;
    private final @Nullable Object userName;

    @OutputCustomType.Constructor({"aadResourceId","aadServicePrincipalCredentialType","annotations","authHeaders","authenticationType","azureCloudType","connectVia","description","encryptedCredential","parameters","password","servicePrincipalEmbeddedCert","servicePrincipalEmbeddedCertPassword","servicePrincipalId","servicePrincipalKey","tenant","type","url","userName"})
    private ODataLinkedServiceResponse(
        @Nullable Object aadResourceId,
        @Nullable String aadServicePrincipalCredentialType,
        @Nullable List<Object> annotations,
        @Nullable Object authHeaders,
        @Nullable String authenticationType,
        @Nullable Object azureCloudType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCert,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCertPassword,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object tenant,
        String type,
        Object url,
        @Nullable Object userName) {
        this.aadResourceId = aadResourceId;
        this.aadServicePrincipalCredentialType = aadServicePrincipalCredentialType;
        this.annotations = annotations;
        this.authHeaders = authHeaders;
        this.authenticationType = authenticationType;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.servicePrincipalEmbeddedCert = servicePrincipalEmbeddedCert;
        this.servicePrincipalEmbeddedCertPassword = servicePrincipalEmbeddedCertPassword;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type);
        this.url = Objects.requireNonNull(url);
        this.userName = userName;
    }

    public Optional<Object> getAadResourceId() {
        return Optional.ofNullable(this.aadResourceId);
    }
    public Optional<String> getAadServicePrincipalCredentialType() {
        return Optional.ofNullable(this.aadServicePrincipalCredentialType);
    }
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public Optional<Object> getAuthHeaders() {
        return Optional.ofNullable(this.authHeaders);
    }
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    public Optional<Object> getAzureCloudType() {
        return Optional.ofNullable(this.azureCloudType);
    }
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalEmbeddedCert() {
        return Optional.ofNullable(this.servicePrincipalEmbeddedCert);
    }
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalEmbeddedCertPassword() {
        return Optional.ofNullable(this.servicePrincipalEmbeddedCertPassword);
    }
    public Optional<Object> getServicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }
    public Optional<Object> getTenant() {
        return Optional.ofNullable(this.tenant);
    }
    public String getType() {
        return this.type;
    }
    public Object getUrl() {
        return this.url;
    }
    public Optional<Object> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ODataLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object aadResourceId;
        private @Nullable String aadServicePrincipalCredentialType;
        private @Nullable List<Object> annotations;
        private @Nullable Object authHeaders;
        private @Nullable String authenticationType;
        private @Nullable Object azureCloudType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCert;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCertPassword;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object tenant;
        private String type;
        private Object url;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ODataLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadResourceId = defaults.aadResourceId;
    	      this.aadServicePrincipalCredentialType = defaults.aadServicePrincipalCredentialType;
    	      this.annotations = defaults.annotations;
    	      this.authHeaders = defaults.authHeaders;
    	      this.authenticationType = defaults.authenticationType;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.servicePrincipalEmbeddedCert = defaults.servicePrincipalEmbeddedCert;
    	      this.servicePrincipalEmbeddedCertPassword = defaults.servicePrincipalEmbeddedCertPassword;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userName = defaults.userName;
        }

        public Builder setAadResourceId(@Nullable Object aadResourceId) {
            this.aadResourceId = aadResourceId;
            return this;
        }

        public Builder setAadServicePrincipalCredentialType(@Nullable String aadServicePrincipalCredentialType) {
            this.aadServicePrincipalCredentialType = aadServicePrincipalCredentialType;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthHeaders(@Nullable Object authHeaders) {
            this.authHeaders = authHeaders;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAzureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setServicePrincipalEmbeddedCert(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCert) {
            this.servicePrincipalEmbeddedCert = servicePrincipalEmbeddedCert;
            return this;
        }

        public Builder setServicePrincipalEmbeddedCertPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCertPassword) {
            this.servicePrincipalEmbeddedCertPassword = servicePrincipalEmbeddedCertPassword;
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder setTenant(@Nullable Object tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }

        public ODataLinkedServiceResponse build() {
            return new ODataLinkedServiceResponse(aadResourceId, aadServicePrincipalCredentialType, annotations, authHeaders, authenticationType, azureCloudType, connectVia, description, encryptedCredential, parameters, password, servicePrincipalEmbeddedCert, servicePrincipalEmbeddedCertPassword, servicePrincipalId, servicePrincipalKey, tenant, type, url, userName);
        }
    }
}
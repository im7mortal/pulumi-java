// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShopifyLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShopifyLinkedServiceResponse Empty = new ShopifyLinkedServiceResponse();

    @InputImport(name="accessToken")
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getAccessToken() {
        return this.accessToken == null ? null : this.accessToken;
    }

    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    @InputImport(name="connectVia")
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="encryptedCredential")
    private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    @InputImport(name="host", required=true)
    private final Object host;

    public Object getHost() {
        return this.host;
    }

    @InputImport(name="parameters")
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="useEncryptedEndpoints")
    private final @Nullable Object useEncryptedEndpoints;

    public Optional<Object> getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Optional.empty() : Optional.ofNullable(this.useEncryptedEndpoints);
    }

    @InputImport(name="useHostVerification")
    private final @Nullable Object useHostVerification;

    public Optional<Object> getUseHostVerification() {
        return this.useHostVerification == null ? Optional.empty() : Optional.ofNullable(this.useHostVerification);
    }

    @InputImport(name="usePeerVerification")
    private final @Nullable Object usePeerVerification;

    public Optional<Object> getUsePeerVerification() {
        return this.usePeerVerification == null ? Optional.empty() : Optional.ofNullable(this.usePeerVerification);
    }

    public ShopifyLinkedServiceResponse(
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken,
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        Object host,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        String type,
        @Nullable Object useEncryptedEndpoints,
        @Nullable Object useHostVerification,
        @Nullable Object usePeerVerification) {
        this.accessToken = accessToken;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    private ShopifyLinkedServiceResponse() {
        this.accessToken = null;
        this.annotations = List.of();
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.host = null;
        this.parameters = Map.of();
        this.type = null;
        this.useEncryptedEndpoints = null;
        this.useHostVerification = null;
        this.usePeerVerification = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShopifyLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object host;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private String type;
        private @Nullable Object useEncryptedEndpoints;
        private @Nullable Object useHostVerification;
        private @Nullable Object usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(ShopifyLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder setAccessToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
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

        public Builder setHost(Object host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder setUseHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }

        public Builder setUsePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }

        public ShopifyLinkedServiceResponse build() {
            return new ShopifyLinkedServiceResponse(accessToken, annotations, connectVia, description, encryptedCredential, host, parameters, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
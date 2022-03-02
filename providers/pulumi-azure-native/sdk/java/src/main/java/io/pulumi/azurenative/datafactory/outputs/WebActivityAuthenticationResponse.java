// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebActivityAuthenticationResponse {
    /**
     * The credential reference containing authentication information.
     * 
     */
    private final @Nullable CredentialReferenceResponse credential;
    /**
     * Password for the PFX file or basic authentication / Secret when used for ServicePrincipal
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * Base64-encoded contents of a PFX file or Certificate when used for ServicePrincipal
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx;
    /**
     * Resource for which Azure Auth token will be requested when using MSI Authentication. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object resource;
    /**
     * Web activity authentication (Basic/ClientCertificate/MSI/ServicePrincipal)
     * 
     */
    private final @Nullable String type;
    /**
     * TenantId for which Azure Auth token will be requested when using ServicePrincipal Authentication. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userTenant;
    /**
     * Web activity authentication user name for basic authentication or ClientID when used for ServicePrincipal. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object username;

    @OutputCustomType.Constructor({"credential","password","pfx","resource","type","userTenant","username"})
    private WebActivityAuthenticationResponse(
        @Nullable CredentialReferenceResponse credential,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx,
        @Nullable Object resource,
        @Nullable String type,
        @Nullable Object userTenant,
        @Nullable Object username) {
        this.credential = credential;
        this.password = password;
        this.pfx = pfx;
        this.resource = resource;
        this.type = type;
        this.userTenant = userTenant;
        this.username = username;
    }

    /**
     * The credential reference containing authentication information.
     * 
    */
    public Optional<CredentialReferenceResponse> getCredential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * Password for the PFX file or basic authentication / Secret when used for ServicePrincipal
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Base64-encoded contents of a PFX file or Certificate when used for ServicePrincipal
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPfx() {
        return Optional.ofNullable(this.pfx);
    }
    /**
     * Resource for which Azure Auth token will be requested when using MSI Authentication. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getResource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * Web activity authentication (Basic/ClientCertificate/MSI/ServicePrincipal)
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * TenantId for which Azure Auth token will be requested when using ServicePrincipal Authentication. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getUserTenant() {
        return Optional.ofNullable(this.userTenant);
    }
    /**
     * Web activity authentication user name for basic authentication or ClientID when used for ServicePrincipal. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebActivityAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx;
        private @Nullable Object resource;
        private @Nullable String type;
        private @Nullable Object userTenant;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(WebActivityAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.password = defaults.password;
    	      this.pfx = defaults.pfx;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
    	      this.userTenant = defaults.userTenant;
    	      this.username = defaults.username;
        }

        public Builder setCredential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setPfx(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx) {
            this.pfx = pfx;
            return this;
        }

        public Builder setResource(@Nullable Object resource) {
            this.resource = resource;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserTenant(@Nullable Object userTenant) {
            this.userTenant = userTenant;
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = username;
            return this;
        }
        public WebActivityAuthenticationResponse build() {
            return new WebActivityAuthenticationResponse(credential, password, pfx, resource, type, userTenant, username);
        }
    }
}

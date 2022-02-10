// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OpenShiftManagedClusterAADIdentityProviderResponse {
    private final @Nullable String clientId;
    private final @Nullable String customerAdminGroupId;
    private final String kind;
    private final @Nullable String secret;
    private final @Nullable String tenantId;

    @OutputCustomType.Constructor({"clientId","customerAdminGroupId","kind","secret","tenantId"})
    private OpenShiftManagedClusterAADIdentityProviderResponse(
        @Nullable String clientId,
        @Nullable String customerAdminGroupId,
        String kind,
        @Nullable String secret,
        @Nullable String tenantId) {
        this.clientId = clientId;
        this.customerAdminGroupId = customerAdminGroupId;
        this.kind = Objects.requireNonNull(kind);
        this.secret = secret;
        this.tenantId = tenantId;
    }

    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    public Optional<String> getCustomerAdminGroupId() {
        return Optional.ofNullable(this.customerAdminGroupId);
    }
    public String getKind() {
        return this.kind;
    }
    public Optional<String> getSecret() {
        return Optional.ofNullable(this.secret);
    }
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterAADIdentityProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String customerAdminGroupId;
        private String kind;
        private @Nullable String secret;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterAADIdentityProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.customerAdminGroupId = defaults.customerAdminGroupId;
    	      this.kind = defaults.kind;
    	      this.secret = defaults.secret;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setCustomerAdminGroupId(@Nullable String customerAdminGroupId) {
            this.customerAdminGroupId = customerAdminGroupId;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setSecret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public OpenShiftManagedClusterAADIdentityProviderResponse build() {
            return new OpenShiftManagedClusterAADIdentityProviderResponse(clientId, customerAdminGroupId, kind, secret, tenantId);
        }
    }
}
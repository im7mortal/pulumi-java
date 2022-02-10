// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.SecureStringResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationRuntimeSsisCatalogInfoResponse {
    private final @Nullable SecureStringResponse catalogAdminPassword;
    private final @Nullable String catalogAdminUserName;
    private final @Nullable String catalogPricingTier;
    private final @Nullable String catalogServerEndpoint;

    @OutputCustomType.Constructor({"catalogAdminPassword","catalogAdminUserName","catalogPricingTier","catalogServerEndpoint"})
    private IntegrationRuntimeSsisCatalogInfoResponse(
        @Nullable SecureStringResponse catalogAdminPassword,
        @Nullable String catalogAdminUserName,
        @Nullable String catalogPricingTier,
        @Nullable String catalogServerEndpoint) {
        this.catalogAdminPassword = catalogAdminPassword;
        this.catalogAdminUserName = catalogAdminUserName;
        this.catalogPricingTier = catalogPricingTier;
        this.catalogServerEndpoint = catalogServerEndpoint;
    }

    public Optional<SecureStringResponse> getCatalogAdminPassword() {
        return Optional.ofNullable(this.catalogAdminPassword);
    }
    public Optional<String> getCatalogAdminUserName() {
        return Optional.ofNullable(this.catalogAdminUserName);
    }
    public Optional<String> getCatalogPricingTier() {
        return Optional.ofNullable(this.catalogPricingTier);
    }
    public Optional<String> getCatalogServerEndpoint() {
        return Optional.ofNullable(this.catalogServerEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisCatalogInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecureStringResponse catalogAdminPassword;
        private @Nullable String catalogAdminUserName;
        private @Nullable String catalogPricingTier;
        private @Nullable String catalogServerEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisCatalogInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogAdminPassword = defaults.catalogAdminPassword;
    	      this.catalogAdminUserName = defaults.catalogAdminUserName;
    	      this.catalogPricingTier = defaults.catalogPricingTier;
    	      this.catalogServerEndpoint = defaults.catalogServerEndpoint;
        }

        public Builder setCatalogAdminPassword(@Nullable SecureStringResponse catalogAdminPassword) {
            this.catalogAdminPassword = catalogAdminPassword;
            return this;
        }

        public Builder setCatalogAdminUserName(@Nullable String catalogAdminUserName) {
            this.catalogAdminUserName = catalogAdminUserName;
            return this;
        }

        public Builder setCatalogPricingTier(@Nullable String catalogPricingTier) {
            this.catalogPricingTier = catalogPricingTier;
            return this;
        }

        public Builder setCatalogServerEndpoint(@Nullable String catalogServerEndpoint) {
            this.catalogServerEndpoint = catalogServerEndpoint;
            return this;
        }

        public IntegrationRuntimeSsisCatalogInfoResponse build() {
            return new IntegrationRuntimeSsisCatalogInfoResponse(catalogAdminPassword, catalogAdminUserName, catalogPricingTier, catalogServerEndpoint);
        }
    }
}
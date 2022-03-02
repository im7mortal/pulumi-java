// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DppIdentityDetailsResponse {
    /**
     * The object ID of the service principal object for the managed identity that is used to grant role-based access to an Azure resource.
     * 
     */
    private final String principalId;
    /**
     * A Globally Unique Identifier (GUID) that represents the Azure AD tenant where the resource is now a member.
     * 
     */
    private final String tenantId;
    /**
     * The identityType which can be either SystemAssigned or None
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"principalId","tenantId","type"})
    private DppIdentityDetailsResponse(
        String principalId,
        String tenantId,
        @Nullable String type) {
        this.principalId = Objects.requireNonNull(principalId);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = type;
    }

    /**
     * The object ID of the service principal object for the managed identity that is used to grant role-based access to an Azure resource.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * A Globally Unique Identifier (GUID) that represents the Azure AD tenant where the resource is now a member.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The identityType which can be either SystemAssigned or None
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DppIdentityDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DppIdentityDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DppIdentityDetailsResponse build() {
            return new DppIdentityDetailsResponse(principalId, tenantId, type);
        }
    }
}

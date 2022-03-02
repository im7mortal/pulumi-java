// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom {
    /**
     * A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
     */
    private final @Nullable List<String> identities;
    /**
     * Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
     * 
     */
    private final @Nullable String identityType;
    /**
     * Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource> sources;

    @OutputCustomType.Constructor({"identities","identityType","sources"})
    private ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom(
        @Nullable List<String> identities,
        @Nullable String identityType,
        @Nullable List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource> sources) {
        this.identities = identities;
        this.identityType = identityType;
        this.sources = sources;
    }

    /**
     * A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
    */
    public List<String> getIdentities() {
        return this.identities == null ? List.of() : this.identities;
    }
    /**
     * Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
     * 
    */
    public Optional<String> getIdentityType() {
        return Optional.ofNullable(this.identityType);
    }
    /**
     * Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * 
    */
    public List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource> getSources() {
        return this.sources == null ? List.of() : this.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> identities;
        private @Nullable String identityType;
        private @Nullable List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identities = defaults.identities;
    	      this.identityType = defaults.identityType;
    	      this.sources = defaults.sources;
        }

        public Builder setIdentities(@Nullable List<String> identities) {
            this.identities = identities;
            return this;
        }

        public Builder setIdentityType(@Nullable String identityType) {
            this.identityType = identityType;
            return this;
        }

        public Builder setSources(@Nullable List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource> sources) {
            this.sources = sources;
            return this;
        }
        public ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom build() {
            return new ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom(identities, identityType, sources);
        }
    }
}

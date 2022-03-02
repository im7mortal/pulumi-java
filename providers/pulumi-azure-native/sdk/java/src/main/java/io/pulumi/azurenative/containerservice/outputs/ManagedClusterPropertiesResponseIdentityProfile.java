// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterPropertiesResponseIdentityProfile {
    /**
     * The client id of the user assigned identity.
     * 
     */
    private final @Nullable String clientId;
    /**
     * The object id of the user assigned identity.
     * 
     */
    private final @Nullable String objectId;
    /**
     * The resource id of the user assigned identity.
     * 
     */
    private final @Nullable String resourceId;

    @OutputCustomType.Constructor({"clientId","objectId","resourceId"})
    private ManagedClusterPropertiesResponseIdentityProfile(
        @Nullable String clientId,
        @Nullable String objectId,
        @Nullable String resourceId) {
        this.clientId = clientId;
        this.objectId = objectId;
        this.resourceId = resourceId;
    }

    /**
     * The client id of the user assigned identity.
     * 
    */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The object id of the user assigned identity.
     * 
    */
    public Optional<String> getObjectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * The resource id of the user assigned identity.
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPropertiesResponseIdentityProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String objectId;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPropertiesResponseIdentityProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setObjectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public ManagedClusterPropertiesResponseIdentityProfile build() {
            return new ManagedClusterPropertiesResponseIdentityProfile(clientId, objectId, resourceId);
        }
    }
}

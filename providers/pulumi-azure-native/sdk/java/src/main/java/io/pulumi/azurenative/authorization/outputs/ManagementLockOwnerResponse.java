// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementLockOwnerResponse {
    /**
     * The application ID of the lock owner.
     * 
     */
    private final @Nullable String applicationId;

    @OutputCustomType.Constructor({"applicationId"})
    private ManagementLockOwnerResponse(@Nullable String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The application ID of the lock owner.
     * 
    */
    public Optional<String> getApplicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementLockOwnerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementLockOwnerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public ManagementLockOwnerResponse build() {
            return new ManagementLockOwnerResponse(applicationId);
        }
    }
}

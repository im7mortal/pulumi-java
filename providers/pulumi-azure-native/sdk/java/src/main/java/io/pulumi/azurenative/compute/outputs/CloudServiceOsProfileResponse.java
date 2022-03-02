// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CloudServiceVaultSecretGroupResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudServiceOsProfileResponse {
    /**
     * Specifies set of certificates that should be installed onto the role instances.
     * 
     */
    private final @Nullable List<CloudServiceVaultSecretGroupResponse> secrets;

    @OutputCustomType.Constructor({"secrets"})
    private CloudServiceOsProfileResponse(@Nullable List<CloudServiceVaultSecretGroupResponse> secrets) {
        this.secrets = secrets;
    }

    /**
     * Specifies set of certificates that should be installed onto the role instances.
     * 
    */
    public List<CloudServiceVaultSecretGroupResponse> getSecrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceOsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CloudServiceVaultSecretGroupResponse> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceOsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secrets = defaults.secrets;
        }

        public Builder setSecrets(@Nullable List<CloudServiceVaultSecretGroupResponse> secrets) {
            this.secrets = secrets;
            return this;
        }
        public CloudServiceOsProfileResponse build() {
            return new CloudServiceOsProfileResponse(secrets);
        }
    }
}

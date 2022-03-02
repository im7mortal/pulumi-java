// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.azurenative.storagecache.outputs.NfsAccessPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CacheSecuritySettingsResponse {
    /**
     * NFS access policies defined for this cache.
     * 
     */
    private final @Nullable List<NfsAccessPolicyResponse> accessPolicies;

    @OutputCustomType.Constructor({"accessPolicies"})
    private CacheSecuritySettingsResponse(@Nullable List<NfsAccessPolicyResponse> accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * NFS access policies defined for this cache.
     * 
    */
    public List<NfsAccessPolicyResponse> getAccessPolicies() {
        return this.accessPolicies == null ? List.of() : this.accessPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheSecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NfsAccessPolicyResponse> accessPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheSecuritySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
        }

        public Builder setAccessPolicies(@Nullable List<NfsAccessPolicyResponse> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }
        public CacheSecuritySettingsResponse build() {
            return new CacheSecuritySettingsResponse(accessPolicies);
        }
    }
}

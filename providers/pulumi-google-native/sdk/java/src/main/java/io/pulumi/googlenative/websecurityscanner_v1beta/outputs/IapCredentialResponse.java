// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.websecurityscanner_v1beta.outputs.IapTestServiceAccountInfoResponse;
import java.util.Objects;

@OutputCustomType
public final class IapCredentialResponse {
    /**
     * Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
     * 
     */
    private final IapTestServiceAccountInfoResponse iapTestServiceAccountInfo;

    @OutputCustomType.Constructor({"iapTestServiceAccountInfo"})
    private IapCredentialResponse(IapTestServiceAccountInfoResponse iapTestServiceAccountInfo) {
        this.iapTestServiceAccountInfo = Objects.requireNonNull(iapTestServiceAccountInfo);
    }

    /**
     * Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
     * 
    */
    public IapTestServiceAccountInfoResponse getIapTestServiceAccountInfo() {
        return this.iapTestServiceAccountInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IapCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IapTestServiceAccountInfoResponse iapTestServiceAccountInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(IapCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iapTestServiceAccountInfo = defaults.iapTestServiceAccountInfo;
        }

        public Builder setIapTestServiceAccountInfo(IapTestServiceAccountInfoResponse iapTestServiceAccountInfo) {
            this.iapTestServiceAccountInfo = Objects.requireNonNull(iapTestServiceAccountInfo);
            return this;
        }
        public IapCredentialResponse build() {
            return new IapCredentialResponse(iapTestServiceAccountInfo);
        }
    }
}

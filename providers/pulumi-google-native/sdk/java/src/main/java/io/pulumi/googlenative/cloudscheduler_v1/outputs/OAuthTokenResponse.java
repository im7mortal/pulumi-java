// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OAuthTokenResponse {
    /**
     * OAuth scope to be used for generating OAuth access token. If not specified, "https://www.googleapis.com/auth/cloud-platform" will be used.
     * 
     */
    private final String scope;
    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OAuth token. The service account must be within the same project as the job. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    private final String serviceAccountEmail;

    @OutputCustomType.Constructor({"scope","serviceAccountEmail"})
    private OAuthTokenResponse(
        String scope,
        String serviceAccountEmail) {
        this.scope = Objects.requireNonNull(scope);
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
    }

    /**
     * OAuth scope to be used for generating OAuth access token. If not specified, "https://www.googleapis.com/auth/cloud-platform" will be used.
     * 
    */
    public String getScope() {
        return this.scope;
    }
    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OAuth token. The service account must be within the same project as the job. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
    */
    public String getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuthTokenResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scope;
        private String serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuthTokenResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setServiceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        public OAuthTokenResponse build() {
            return new OAuthTokenResponse(scope, serviceAccountEmail);
        }
    }
}

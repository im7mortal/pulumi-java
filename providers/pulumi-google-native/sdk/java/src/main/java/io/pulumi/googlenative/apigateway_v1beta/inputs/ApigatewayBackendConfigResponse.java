// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ApigatewayBackendConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApigatewayBackendConfigResponse Empty = new ApigatewayBackendConfigResponse();

    @InputImport(name="googleServiceAccount", required=true)
    private final String googleServiceAccount;

    public String getGoogleServiceAccount() {
        return this.googleServiceAccount;
    }

    public ApigatewayBackendConfigResponse(String googleServiceAccount) {
        this.googleServiceAccount = Objects.requireNonNull(googleServiceAccount, "expected parameter 'googleServiceAccount' to be non-null");
    }

    private ApigatewayBackendConfigResponse() {
        this.googleServiceAccount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayBackendConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String googleServiceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayBackendConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleServiceAccount = defaults.googleServiceAccount;
        }

        public Builder setGoogleServiceAccount(String googleServiceAccount) {
            this.googleServiceAccount = Objects.requireNonNull(googleServiceAccount);
            return this;
        }

        public ApigatewayBackendConfigResponse build() {
            return new ApigatewayBackendConfigResponse(googleServiceAccount);
        }
    }
}
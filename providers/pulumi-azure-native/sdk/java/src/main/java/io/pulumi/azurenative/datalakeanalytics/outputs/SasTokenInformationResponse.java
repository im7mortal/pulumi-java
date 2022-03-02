// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SasTokenInformationResponse {
    /**
     * The access token for the associated Azure Storage Container.
     * 
     */
    private final String accessToken;

    @OutputCustomType.Constructor({"accessToken"})
    private SasTokenInformationResponse(String accessToken) {
        this.accessToken = Objects.requireNonNull(accessToken);
    }

    /**
     * The access token for the associated Azure Storage Container.
     * 
    */
    public String getAccessToken() {
        return this.accessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SasTokenInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessToken;

        public Builder() {
    	      // Empty
        }

        public Builder(SasTokenInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
        }

        public Builder setAccessToken(String accessToken) {
            this.accessToken = Objects.requireNonNull(accessToken);
            return this;
        }
        public SasTokenInformationResponse build() {
            return new SasTokenInformationResponse(accessToken);
        }
    }
}

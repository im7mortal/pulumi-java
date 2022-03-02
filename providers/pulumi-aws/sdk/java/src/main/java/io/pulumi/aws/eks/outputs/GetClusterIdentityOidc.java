// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterIdentityOidc {
    /**
     * Issuer URL for the OpenID Connect identity provider.
     * 
     */
    private final String issuer;

    @OutputCustomType.Constructor({"issuer"})
    private GetClusterIdentityOidc(String issuer) {
        this.issuer = Objects.requireNonNull(issuer);
    }

    /**
     * Issuer URL for the OpenID Connect identity provider.
     * 
    */
    public String getIssuer() {
        return this.issuer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterIdentityOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String issuer;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterIdentityOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuer = defaults.issuer;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public GetClusterIdentityOidc build() {
            return new GetClusterIdentityOidc(issuer);
        }
    }
}

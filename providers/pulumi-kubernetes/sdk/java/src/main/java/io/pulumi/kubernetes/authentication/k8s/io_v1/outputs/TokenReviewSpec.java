// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TokenReviewSpec {
    /**
     * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
     * 
     */
    private final @Nullable List<String> audiences;
    /**
     * Token is the opaque bearer token.
     * 
     */
    private final @Nullable String token;

    @OutputCustomType.Constructor({"audiences","token"})
    private TokenReviewSpec(
        @Nullable List<String> audiences,
        @Nullable String token) {
        this.audiences = audiences;
        this.token = token;
    }

    /**
     * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
     * 
    */
    public List<String> getAudiences() {
        return this.audiences == null ? List.of() : this.audiences;
    }
    /**
     * Token is the opaque bearer token.
     * 
    */
    public Optional<String> getToken() {
        return Optional.ofNullable(this.token);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenReviewSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> audiences;
        private @Nullable String token;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenReviewSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.token = defaults.token;
        }

        public Builder setAudiences(@Nullable List<String> audiences) {
            this.audiences = audiences;
            return this;
        }

        public Builder setToken(@Nullable String token) {
            this.token = token;
            return this;
        }
        public TokenReviewSpec build() {
            return new TokenReviewSpec(audiences, token);
        }
    }
}

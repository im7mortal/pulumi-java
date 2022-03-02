// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebhookAuthenticationConfiguration {
    /**
     * A valid CIDR block for `IP` filtering. Required for `IP`.
     * 
     */
    private final @Nullable String allowedIpRange;
    /**
     * The shared secret for the GitHub repository webhook. Set this as `secret` in your `github_repository_webhook`'s `configuration` block. Required for `GITHUB_HMAC`.
     * 
     */
    private final @Nullable String secretToken;

    @OutputCustomType.Constructor({"allowedIpRange","secretToken"})
    private WebhookAuthenticationConfiguration(
        @Nullable String allowedIpRange,
        @Nullable String secretToken) {
        this.allowedIpRange = allowedIpRange;
        this.secretToken = secretToken;
    }

    /**
     * A valid CIDR block for `IP` filtering. Required for `IP`.
     * 
    */
    public Optional<String> getAllowedIpRange() {
        return Optional.ofNullable(this.allowedIpRange);
    }
    /**
     * The shared secret for the GitHub repository webhook. Set this as `secret` in your `github_repository_webhook`'s `configuration` block. Required for `GITHUB_HMAC`.
     * 
    */
    public Optional<String> getSecretToken() {
        return Optional.ofNullable(this.secretToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookAuthenticationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allowedIpRange;
        private @Nullable String secretToken;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookAuthenticationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIpRange = defaults.allowedIpRange;
    	      this.secretToken = defaults.secretToken;
        }

        public Builder setAllowedIpRange(@Nullable String allowedIpRange) {
            this.allowedIpRange = allowedIpRange;
            return this;
        }

        public Builder setSecretToken(@Nullable String secretToken) {
            this.secretToken = secretToken;
            return this;
        }
        public WebhookAuthenticationConfiguration build() {
            return new WebhookAuthenticationConfiguration(allowedIpRange, secretToken);
        }
    }
}

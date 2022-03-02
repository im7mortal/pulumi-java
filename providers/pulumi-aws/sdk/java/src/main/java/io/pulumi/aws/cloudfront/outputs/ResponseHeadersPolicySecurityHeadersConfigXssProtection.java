// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResponseHeadersPolicySecurityHeadersConfigXssProtection {
    /**
     * A Boolean value that determines whether CloudFront includes the `mode=block` directive in the `X-XSS-Protection` header.
     * 
     */
    private final @Nullable Boolean modeBlock;
    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    private final Boolean override;
    /**
     * A Boolean value that determines the value of the `X-XSS-Protection` HTTP response header. When this setting is `true`, the value of the `X-XSS-Protection` header is `1`. When this setting is `false`, the value of the `X-XSS-Protection` header is `0`.
     * 
     */
    private final Boolean protection;
    /**
     * A reporting URI, which CloudFront uses as the value of the report directive in the `X-XSS-Protection` header. You cannot specify a `report_uri` when `mode_block` is `true`.
     * 
     */
    private final @Nullable String reportUri;

    @OutputCustomType.Constructor({"modeBlock","override","protection","reportUri"})
    private ResponseHeadersPolicySecurityHeadersConfigXssProtection(
        @Nullable Boolean modeBlock,
        Boolean override,
        Boolean protection,
        @Nullable String reportUri) {
        this.modeBlock = modeBlock;
        this.override = Objects.requireNonNull(override);
        this.protection = Objects.requireNonNull(protection);
        this.reportUri = reportUri;
    }

    /**
     * A Boolean value that determines whether CloudFront includes the `mode=block` directive in the `X-XSS-Protection` header.
     * 
    */
    public Optional<Boolean> getModeBlock() {
        return Optional.ofNullable(this.modeBlock);
    }
    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
    */
    public Boolean getOverride() {
        return this.override;
    }
    /**
     * A Boolean value that determines the value of the `X-XSS-Protection` HTTP response header. When this setting is `true`, the value of the `X-XSS-Protection` header is `1`. When this setting is `false`, the value of the `X-XSS-Protection` header is `0`.
     * 
    */
    public Boolean getProtection() {
        return this.protection;
    }
    /**
     * A reporting URI, which CloudFront uses as the value of the report directive in the `X-XSS-Protection` header. You cannot specify a `report_uri` when `mode_block` is `true`.
     * 
    */
    public Optional<String> getReportUri() {
        return Optional.ofNullable(this.reportUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigXssProtection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean modeBlock;
        private Boolean override;
        private Boolean protection;
        private @Nullable String reportUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigXssProtection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modeBlock = defaults.modeBlock;
    	      this.override = defaults.override;
    	      this.protection = defaults.protection;
    	      this.reportUri = defaults.reportUri;
        }

        public Builder setModeBlock(@Nullable Boolean modeBlock) {
            this.modeBlock = modeBlock;
            return this;
        }

        public Builder setOverride(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder setProtection(Boolean protection) {
            this.protection = Objects.requireNonNull(protection);
            return this;
        }

        public Builder setReportUri(@Nullable String reportUri) {
            this.reportUri = reportUri;
            return this;
        }
        public ResponseHeadersPolicySecurityHeadersConfigXssProtection build() {
            return new ResponseHeadersPolicySecurityHeadersConfigXssProtection(modeBlock, override, protection, reportUri);
        }
    }
}

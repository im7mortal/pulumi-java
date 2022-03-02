// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JwtClaimsResponse {
    /**
     * Value for the "aud" claim.
     * 
     */
    private final String audience;
    /**
     * Value for the "iss" claim.
     * 
     */
    private final String issuer;
    /**
     * Value for the "sub" claim.
     * 
     */
    private final String subject;

    @OutputCustomType.Constructor({"audience","issuer","subject"})
    private JwtClaimsResponse(
        String audience,
        String issuer,
        String subject) {
        this.audience = Objects.requireNonNull(audience);
        this.issuer = Objects.requireNonNull(issuer);
        this.subject = Objects.requireNonNull(subject);
    }

    /**
     * Value for the "aud" claim.
     * 
    */
    public String getAudience() {
        return this.audience;
    }
    /**
     * Value for the "iss" claim.
     * 
    */
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * Value for the "sub" claim.
     * 
    */
    public String getSubject() {
        return this.subject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtClaimsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audience;
        private String issuer;
        private String subject;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtClaimsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.issuer = defaults.issuer;
    	      this.subject = defaults.subject;
        }

        public Builder setAudience(String audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public JwtClaimsResponse build() {
            return new JwtClaimsResponse(audience, issuer, subject);
        }
    }
}

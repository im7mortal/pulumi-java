// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRuleRedirectOptionsResponse {
    /**
     * Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    private final String target;
    /**
     * Type of the redirect action.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"target","type"})
    private SecurityPolicyRuleRedirectOptionsResponse(
        String target,
        String type) {
        this.target = Objects.requireNonNull(target);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
    */
    public String getTarget() {
        return this.target;
    }
    /**
     * Type of the redirect action.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRedirectOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String target;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRedirectOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SecurityPolicyRuleRedirectOptionsResponse build() {
            return new SecurityPolicyRuleRedirectOptionsResponse(target, type);
        }
    }
}

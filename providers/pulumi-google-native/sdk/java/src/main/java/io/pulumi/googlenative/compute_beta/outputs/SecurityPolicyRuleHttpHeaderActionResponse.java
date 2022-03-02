// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRuleHttpHeaderActionResponse {
    /**
     * The list of request headers to add or overwrite if they're already present.
     * 
     */
    private final List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds;

    @OutputCustomType.Constructor({"requestHeadersToAdds"})
    private SecurityPolicyRuleHttpHeaderActionResponse(List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds) {
        this.requestHeadersToAdds = Objects.requireNonNull(requestHeadersToAdds);
    }

    /**
     * The list of request headers to add or overwrite if they're already present.
     * 
    */
    public List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> getRequestHeadersToAdds() {
        return this.requestHeadersToAdds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleHttpHeaderActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleHttpHeaderActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
        }

        public Builder setRequestHeadersToAdds(List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds) {
            this.requestHeadersToAdds = Objects.requireNonNull(requestHeadersToAdds);
            return this;
        }
        public SecurityPolicyRuleHttpHeaderActionResponse build() {
            return new SecurityPolicyRuleHttpHeaderActionResponse(requestHeadersToAdds);
        }
    }
}

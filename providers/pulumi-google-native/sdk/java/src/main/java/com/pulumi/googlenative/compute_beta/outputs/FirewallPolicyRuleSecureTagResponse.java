// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyRuleSecureTagResponse {
    /**
     * @return Name of the secure tag, created with TagManager&#39;s TagValue API.
     * 
     */
    private final String name;
    /**
     * @return State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private FirewallPolicyRuleSecureTagResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state) {
        this.name = name;
        this.state = state;
    }

    /**
     * @return Name of the secure tag, created with TagManager&#39;s TagValue API.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleSecureTagResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleSecureTagResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public FirewallPolicyRuleSecureTagResponse build() {
            return new FirewallPolicyRuleSecureTagResponse(name, state);
        }
    }
}

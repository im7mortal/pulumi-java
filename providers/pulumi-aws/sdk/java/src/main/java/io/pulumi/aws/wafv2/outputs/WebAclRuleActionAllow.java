// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleActionAllowCustomRequestHandling;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleActionAllow {
    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    private final @Nullable WebAclRuleActionAllowCustomRequestHandling customRequestHandling;

    @OutputCustomType.Constructor({"customRequestHandling"})
    private WebAclRuleActionAllow(@Nullable WebAclRuleActionAllowCustomRequestHandling customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
    */
    public Optional<WebAclRuleActionAllowCustomRequestHandling> getCustomRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionAllow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleActionAllowCustomRequestHandling customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionAllow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder setCustomRequestHandling(@Nullable WebAclRuleActionAllowCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public WebAclRuleActionAllow build() {
            return new WebAclRuleActionAllow(customRequestHandling);
        }
    }
}

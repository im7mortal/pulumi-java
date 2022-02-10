// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleRateLimitOptionsThresholdResponse;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleRedirectOptionsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyRuleRateLimitOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleRateLimitOptionsResponse Empty = new SecurityPolicyRuleRateLimitOptionsResponse();

    @InputImport(name="banDurationSec", required=true)
    private final Integer banDurationSec;

    public Integer getBanDurationSec() {
        return this.banDurationSec;
    }

    @InputImport(name="banThreshold", required=true)
    private final SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold;

    public SecurityPolicyRuleRateLimitOptionsThresholdResponse getBanThreshold() {
        return this.banThreshold;
    }

    @InputImport(name="conformAction", required=true)
    private final String conformAction;

    public String getConformAction() {
        return this.conformAction;
    }

    @InputImport(name="enforceOnKey", required=true)
    private final String enforceOnKey;

    public String getEnforceOnKey() {
        return this.enforceOnKey;
    }

    @InputImport(name="enforceOnKeyName", required=true)
    private final String enforceOnKeyName;

    public String getEnforceOnKeyName() {
        return this.enforceOnKeyName;
    }

    @InputImport(name="exceedAction", required=true)
    private final String exceedAction;

    public String getExceedAction() {
        return this.exceedAction;
    }

    @InputImport(name="exceedRedirectOptions", required=true)
    private final SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions;

    public SecurityPolicyRuleRedirectOptionsResponse getExceedRedirectOptions() {
        return this.exceedRedirectOptions;
    }

    @InputImport(name="rateLimitThreshold", required=true)
    private final SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold;

    public SecurityPolicyRuleRateLimitOptionsThresholdResponse getRateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    public SecurityPolicyRuleRateLimitOptionsResponse(
        Integer banDurationSec,
        SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold,
        String conformAction,
        String enforceOnKey,
        String enforceOnKeyName,
        String exceedAction,
        SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions,
        SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold) {
        this.banDurationSec = Objects.requireNonNull(banDurationSec, "expected parameter 'banDurationSec' to be non-null");
        this.banThreshold = Objects.requireNonNull(banThreshold, "expected parameter 'banThreshold' to be non-null");
        this.conformAction = Objects.requireNonNull(conformAction, "expected parameter 'conformAction' to be non-null");
        this.enforceOnKey = Objects.requireNonNull(enforceOnKey, "expected parameter 'enforceOnKey' to be non-null");
        this.enforceOnKeyName = Objects.requireNonNull(enforceOnKeyName, "expected parameter 'enforceOnKeyName' to be non-null");
        this.exceedAction = Objects.requireNonNull(exceedAction, "expected parameter 'exceedAction' to be non-null");
        this.exceedRedirectOptions = Objects.requireNonNull(exceedRedirectOptions, "expected parameter 'exceedRedirectOptions' to be non-null");
        this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold, "expected parameter 'rateLimitThreshold' to be non-null");
    }

    private SecurityPolicyRuleRateLimitOptionsResponse() {
        this.banDurationSec = null;
        this.banThreshold = null;
        this.conformAction = null;
        this.enforceOnKey = null;
        this.enforceOnKeyName = null;
        this.exceedAction = null;
        this.exceedRedirectOptions = null;
        this.rateLimitThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer banDurationSec;
        private SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold;
        private String conformAction;
        private String enforceOnKey;
        private String enforceOnKeyName;
        private String exceedAction;
        private SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions;
        private SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.banDurationSec = defaults.banDurationSec;
    	      this.banThreshold = defaults.banThreshold;
    	      this.conformAction = defaults.conformAction;
    	      this.enforceOnKey = defaults.enforceOnKey;
    	      this.enforceOnKeyName = defaults.enforceOnKeyName;
    	      this.exceedAction = defaults.exceedAction;
    	      this.exceedRedirectOptions = defaults.exceedRedirectOptions;
    	      this.rateLimitThreshold = defaults.rateLimitThreshold;
        }

        public Builder setBanDurationSec(Integer banDurationSec) {
            this.banDurationSec = Objects.requireNonNull(banDurationSec);
            return this;
        }

        public Builder setBanThreshold(SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold) {
            this.banThreshold = Objects.requireNonNull(banThreshold);
            return this;
        }

        public Builder setConformAction(String conformAction) {
            this.conformAction = Objects.requireNonNull(conformAction);
            return this;
        }

        public Builder setEnforceOnKey(String enforceOnKey) {
            this.enforceOnKey = Objects.requireNonNull(enforceOnKey);
            return this;
        }

        public Builder setEnforceOnKeyName(String enforceOnKeyName) {
            this.enforceOnKeyName = Objects.requireNonNull(enforceOnKeyName);
            return this;
        }

        public Builder setExceedAction(String exceedAction) {
            this.exceedAction = Objects.requireNonNull(exceedAction);
            return this;
        }

        public Builder setExceedRedirectOptions(SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions) {
            this.exceedRedirectOptions = Objects.requireNonNull(exceedRedirectOptions);
            return this;
        }

        public Builder setRateLimitThreshold(SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold) {
            this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
            return this;
        }

        public SecurityPolicyRuleRateLimitOptionsResponse build() {
            return new SecurityPolicyRuleRateLimitOptionsResponse(banDurationSec, banThreshold, conformAction, enforceOnKey, enforceOnKeyName, exceedAction, exceedRedirectOptions, rateLimitThreshold);
        }
    }
}
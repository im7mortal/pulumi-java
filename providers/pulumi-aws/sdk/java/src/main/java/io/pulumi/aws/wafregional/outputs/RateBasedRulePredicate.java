// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RateBasedRulePredicate {
    /**
     * A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
     * 
     */
    private final String dataId;
    /**
     * Set this to `false` if you want to allow, block, or count requests
     * based on the settings in the specified `ByteMatchSet`, `IPSet`, `SqlInjectionMatchSet`, `XssMatchSet`, or `SizeConstraintSet`.
     * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
     * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses _except_ `192.0.2.44`.
     * 
     */
    private final Boolean negated;
    /**
     * The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"dataId","negated","type"})
    private RateBasedRulePredicate(
        String dataId,
        Boolean negated,
        String type) {
        this.dataId = Objects.requireNonNull(dataId);
        this.negated = Objects.requireNonNull(negated);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
     * 
    */
    public String getDataId() {
        return this.dataId;
    }
    /**
     * Set this to `false` if you want to allow, block, or count requests
     * based on the settings in the specified `ByteMatchSet`, `IPSet`, `SqlInjectionMatchSet`, `XssMatchSet`, or `SizeConstraintSet`.
     * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
     * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses _except_ `192.0.2.44`.
     * 
    */
    public Boolean getNegated() {
        return this.negated;
    }
    /**
     * The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateBasedRulePredicate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataId;
        private Boolean negated;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RateBasedRulePredicate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataId = defaults.dataId;
    	      this.negated = defaults.negated;
    	      this.type = defaults.type;
        }

        public Builder setDataId(String dataId) {
            this.dataId = Objects.requireNonNull(dataId);
            return this;
        }

        public Builder setNegated(Boolean negated) {
            this.negated = Objects.requireNonNull(negated);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RateBasedRulePredicate build() {
            return new RateBasedRulePredicate(dataId, negated, type);
        }
    }
}

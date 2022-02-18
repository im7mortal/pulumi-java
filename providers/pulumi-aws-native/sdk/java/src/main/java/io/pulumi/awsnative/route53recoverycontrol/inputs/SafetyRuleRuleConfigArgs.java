// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.inputs;

import io.pulumi.awsnative.route53recoverycontrol.enums.SafetyRuleRuleType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * The rule configuration for an assertion rule or gating rule. This is the criteria that you set for specific assertion controls (routing controls) or gating controls. This configuration specifies how many controls must be enabled after a transaction completes.
 * 
 */
public final class SafetyRuleRuleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SafetyRuleRuleConfigArgs Empty = new SafetyRuleRuleConfigArgs();

    /**
     * Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice versa.
     * 
     */
    @InputImport(name="inverted", required=true)
    private final Input<Boolean> inverted;

    public Input<Boolean> getInverted() {
        return this.inverted;
    }

    /**
     * The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that must be set when you specify an ATLEAST type.
     * 
     */
    @InputImport(name="threshold", required=true)
    private final Input<Integer> threshold;

    public Input<Integer> getThreshold() {
        return this.threshold;
    }

    @InputImport(name="type", required=true)
    private final Input<SafetyRuleRuleType> type;

    public Input<SafetyRuleRuleType> getType() {
        return this.type;
    }

    public SafetyRuleRuleConfigArgs(
        Input<Boolean> inverted,
        Input<Integer> threshold,
        Input<SafetyRuleRuleType> type) {
        this.inverted = Objects.requireNonNull(inverted, "expected parameter 'inverted' to be non-null");
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SafetyRuleRuleConfigArgs() {
        this.inverted = Input.empty();
        this.threshold = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleRuleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> inverted;
        private Input<Integer> threshold;
        private Input<SafetyRuleRuleType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleRuleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inverted = defaults.inverted;
    	      this.threshold = defaults.threshold;
    	      this.type = defaults.type;
        }

        public Builder setInverted(Input<Boolean> inverted) {
            this.inverted = Objects.requireNonNull(inverted);
            return this;
        }

        public Builder setInverted(Boolean inverted) {
            this.inverted = Input.of(Objects.requireNonNull(inverted));
            return this;
        }

        public Builder setThreshold(Input<Integer> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder setThreshold(Integer threshold) {
            this.threshold = Input.of(Objects.requireNonNull(threshold));
            return this;
        }

        public Builder setType(Input<SafetyRuleRuleType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(SafetyRuleRuleType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public SafetyRuleRuleConfigArgs build() {
            return new SafetyRuleRuleConfigArgs(inverted, threshold, type);
        }
    }
}

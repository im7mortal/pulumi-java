// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Xss Match Statement.
 * 
 */
public final class RuleGroupXssMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupXssMatchStatementArgs Empty = new RuleGroupXssMatchStatementArgs();

    @InputImport(name="fieldToMatch", required=true)
    private final Input<RuleGroupFieldToMatchArgs> fieldToMatch;

    public Input<RuleGroupFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    @InputImport(name="textTransformations", required=true)
    private final Input<List<RuleGroupTextTransformationArgs>> textTransformations;

    public Input<List<RuleGroupTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupXssMatchStatementArgs(
        Input<RuleGroupFieldToMatchArgs> fieldToMatch,
        Input<List<RuleGroupTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupXssMatchStatementArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupXssMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RuleGroupFieldToMatchArgs> fieldToMatch;
        private Input<List<RuleGroupTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupXssMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(Input<RuleGroupFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setFieldToMatch(RuleGroupFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder setTextTransformations(Input<List<RuleGroupTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<RuleGroupTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }

        public RuleGroupXssMatchStatementArgs build() {
            return new RuleGroupXssMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}

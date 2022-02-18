// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupSizeConstraintStatementComparisonOperator;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


/**
 * Size Constraint statement.
 * 
 */
public final class RuleGroupSizeConstraintStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupSizeConstraintStatementArgs Empty = new RuleGroupSizeConstraintStatementArgs();

    @InputImport(name="comparisonOperator", required=true)
    private final Input<RuleGroupSizeConstraintStatementComparisonOperator> comparisonOperator;

    public Input<RuleGroupSizeConstraintStatementComparisonOperator> getComparisonOperator() {
        return this.comparisonOperator;
    }

    @InputImport(name="fieldToMatch", required=true)
    private final Input<RuleGroupFieldToMatchArgs> fieldToMatch;

    public Input<RuleGroupFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    @InputImport(name="size", required=true)
    private final Input<Double> size;

    public Input<Double> getSize() {
        return this.size;
    }

    @InputImport(name="textTransformations", required=true)
    private final Input<List<RuleGroupTextTransformationArgs>> textTransformations;

    public Input<List<RuleGroupTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupSizeConstraintStatementArgs(
        Input<RuleGroupSizeConstraintStatementComparisonOperator> comparisonOperator,
        Input<RuleGroupFieldToMatchArgs> fieldToMatch,
        Input<Double> size,
        Input<List<RuleGroupTextTransformationArgs>> textTransformations) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupSizeConstraintStatementArgs() {
        this.comparisonOperator = Input.empty();
        this.fieldToMatch = Input.empty();
        this.size = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupSizeConstraintStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RuleGroupSizeConstraintStatementComparisonOperator> comparisonOperator;
        private Input<RuleGroupFieldToMatchArgs> fieldToMatch;
        private Input<Double> size;
        private Input<List<RuleGroupTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupSizeConstraintStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setComparisonOperator(Input<RuleGroupSizeConstraintStatementComparisonOperator> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder setComparisonOperator(RuleGroupSizeConstraintStatementComparisonOperator comparisonOperator) {
            this.comparisonOperator = Input.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder setFieldToMatch(Input<RuleGroupFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setFieldToMatch(RuleGroupFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder setSize(Input<Double> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setSize(Double size) {
            this.size = Input.of(Objects.requireNonNull(size));
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

        public RuleGroupSizeConstraintStatementArgs build() {
            return new RuleGroupSizeConstraintStatementArgs(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
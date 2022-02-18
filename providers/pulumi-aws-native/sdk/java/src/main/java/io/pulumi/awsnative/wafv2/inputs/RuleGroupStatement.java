// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupAndStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupByteMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupGeoMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupIPSetReferenceStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupLabelMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupNotStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupOrStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRateBasedStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRegexMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRegexPatternSetReferenceStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupSizeConstraintStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupSqliMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupXssMatchStatement;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * First level statement that contains conditions, such as ByteMatch, SizeConstraint, etc
 * 
 */
public final class RuleGroupStatement extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupStatement Empty = new RuleGroupStatement();

    @InputImport(name="andStatement")
    private final @Nullable RuleGroupAndStatement andStatement;

    public Optional<RuleGroupAndStatement> getAndStatement() {
        return this.andStatement == null ? Optional.empty() : Optional.ofNullable(this.andStatement);
    }

    @InputImport(name="byteMatchStatement")
    private final @Nullable RuleGroupByteMatchStatement byteMatchStatement;

    public Optional<RuleGroupByteMatchStatement> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.byteMatchStatement);
    }

    @InputImport(name="geoMatchStatement")
    private final @Nullable RuleGroupGeoMatchStatement geoMatchStatement;

    public Optional<RuleGroupGeoMatchStatement> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.geoMatchStatement);
    }

    @InputImport(name="iPSetReferenceStatement")
    private final @Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement;

    public Optional<RuleGroupIPSetReferenceStatement> getIPSetReferenceStatement() {
        return this.iPSetReferenceStatement == null ? Optional.empty() : Optional.ofNullable(this.iPSetReferenceStatement);
    }

    @InputImport(name="labelMatchStatement")
    private final @Nullable RuleGroupLabelMatchStatement labelMatchStatement;

    public Optional<RuleGroupLabelMatchStatement> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.labelMatchStatement);
    }

    @InputImport(name="notStatement")
    private final @Nullable RuleGroupNotStatement notStatement;

    public Optional<RuleGroupNotStatement> getNotStatement() {
        return this.notStatement == null ? Optional.empty() : Optional.ofNullable(this.notStatement);
    }

    @InputImport(name="orStatement")
    private final @Nullable RuleGroupOrStatement orStatement;

    public Optional<RuleGroupOrStatement> getOrStatement() {
        return this.orStatement == null ? Optional.empty() : Optional.ofNullable(this.orStatement);
    }

    @InputImport(name="rateBasedStatement")
    private final @Nullable RuleGroupRateBasedStatement rateBasedStatement;

    public Optional<RuleGroupRateBasedStatement> getRateBasedStatement() {
        return this.rateBasedStatement == null ? Optional.empty() : Optional.ofNullable(this.rateBasedStatement);
    }

    @InputImport(name="regexMatchStatement")
    private final @Nullable RuleGroupRegexMatchStatement regexMatchStatement;

    public Optional<RuleGroupRegexMatchStatement> getRegexMatchStatement() {
        return this.regexMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.regexMatchStatement);
    }

    @InputImport(name="regexPatternSetReferenceStatement")
    private final @Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;

    public Optional<RuleGroupRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Optional.empty() : Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    @InputImport(name="sizeConstraintStatement")
    private final @Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement;

    public Optional<RuleGroupSizeConstraintStatement> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Optional.empty() : Optional.ofNullable(this.sizeConstraintStatement);
    }

    @InputImport(name="sqliMatchStatement")
    private final @Nullable RuleGroupSqliMatchStatement sqliMatchStatement;

    public Optional<RuleGroupSqliMatchStatement> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.sqliMatchStatement);
    }

    @InputImport(name="xssMatchStatement")
    private final @Nullable RuleGroupXssMatchStatement xssMatchStatement;

    public Optional<RuleGroupXssMatchStatement> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.xssMatchStatement);
    }

    public RuleGroupStatement(
        @Nullable RuleGroupAndStatement andStatement,
        @Nullable RuleGroupByteMatchStatement byteMatchStatement,
        @Nullable RuleGroupGeoMatchStatement geoMatchStatement,
        @Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement,
        @Nullable RuleGroupLabelMatchStatement labelMatchStatement,
        @Nullable RuleGroupNotStatement notStatement,
        @Nullable RuleGroupOrStatement orStatement,
        @Nullable RuleGroupRateBasedStatement rateBasedStatement,
        @Nullable RuleGroupRegexMatchStatement regexMatchStatement,
        @Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement,
        @Nullable RuleGroupSqliMatchStatement sqliMatchStatement,
        @Nullable RuleGroupXssMatchStatement xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.iPSetReferenceStatement = iPSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.rateBasedStatement = rateBasedStatement;
        this.regexMatchStatement = regexMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private RuleGroupStatement() {
        this.andStatement = null;
        this.byteMatchStatement = null;
        this.geoMatchStatement = null;
        this.iPSetReferenceStatement = null;
        this.labelMatchStatement = null;
        this.notStatement = null;
        this.orStatement = null;
        this.rateBasedStatement = null;
        this.regexMatchStatement = null;
        this.regexPatternSetReferenceStatement = null;
        this.sizeConstraintStatement = null;
        this.sqliMatchStatement = null;
        this.xssMatchStatement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupAndStatement andStatement;
        private @Nullable RuleGroupByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement;
        private @Nullable RuleGroupLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupNotStatement notStatement;
        private @Nullable RuleGroupOrStatement orStatement;
        private @Nullable RuleGroupRateBasedStatement rateBasedStatement;
        private @Nullable RuleGroupRegexMatchStatement regexMatchStatement;
        private @Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.iPSetReferenceStatement = defaults.iPSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.rateBasedStatement = defaults.rateBasedStatement;
    	      this.regexMatchStatement = defaults.regexMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder setAndStatement(@Nullable RuleGroupAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable RuleGroupByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable RuleGroupGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setIPSetReferenceStatement(@Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement) {
            this.iPSetReferenceStatement = iPSetReferenceStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable RuleGroupLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setNotStatement(@Nullable RuleGroupNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder setOrStatement(@Nullable RuleGroupOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder setRateBasedStatement(@Nullable RuleGroupRateBasedStatement rateBasedStatement) {
            this.rateBasedStatement = rateBasedStatement;
            return this;
        }

        public Builder setRegexMatchStatement(@Nullable RuleGroupRegexMatchStatement regexMatchStatement) {
            this.regexMatchStatement = regexMatchStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable RuleGroupSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable RuleGroupXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public RuleGroupStatement build() {
            return new RuleGroupStatement(andStatement, byteMatchStatement, geoMatchStatement, iPSetReferenceStatement, labelMatchStatement, notStatement, orStatement, rateBasedStatement, regexMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}

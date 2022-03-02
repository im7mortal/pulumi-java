// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.outputs;

import io.pulumi.aws.waf.outputs.ByteMatchSetByteMatchTupleFieldToMatch;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ByteMatchSetByteMatchTuple {
    /**
     * The part of a web request that you want to search, such as a specified header or a query string.
     * 
     */
    private final ByteMatchSetByteMatchTupleFieldToMatch fieldToMatch;
    /**
     * Within the portion of a web request that you want to search
     * (for example, in the query string, if any), specify where you want to search.
     * e.g., `CONTAINS`, `CONTAINS_WORD` or `EXACTLY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-PositionalConstraint)
     * for all supported values.
     * 
     */
    private final String positionalConstraint;
    /**
     * The value that you want to search forE.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TargetString)
     * for all supported values.
     * 
     */
    private final @Nullable String targetString;
    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `target_string` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    private final String textTransformation;

    @OutputCustomType.Constructor({"fieldToMatch","positionalConstraint","targetString","textTransformation"})
    private ByteMatchSetByteMatchTuple(
        ByteMatchSetByteMatchTupleFieldToMatch fieldToMatch,
        String positionalConstraint,
        @Nullable String targetString,
        String textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
        this.targetString = targetString;
        this.textTransformation = Objects.requireNonNull(textTransformation);
    }

    /**
     * The part of a web request that you want to search, such as a specified header or a query string.
     * 
    */
    public ByteMatchSetByteMatchTupleFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    /**
     * Within the portion of a web request that you want to search
     * (for example, in the query string, if any), specify where you want to search.
     * e.g., `CONTAINS`, `CONTAINS_WORD` or `EXACTLY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-PositionalConstraint)
     * for all supported values.
     * 
    */
    public String getPositionalConstraint() {
        return this.positionalConstraint;
    }
    /**
     * The value that you want to search forE.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TargetString)
     * for all supported values.
     * 
    */
    public Optional<String> getTargetString() {
        return Optional.ofNullable(this.targetString);
    }
    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `target_string` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
     * for all supported values.
     * 
    */
    public String getTextTransformation() {
        return this.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByteMatchSetByteMatchTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ByteMatchSetByteMatchTupleFieldToMatch fieldToMatch;
        private String positionalConstraint;
        private @Nullable String targetString;
        private String textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(ByteMatchSetByteMatchTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.targetString = defaults.targetString;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder setFieldToMatch(ByteMatchSetByteMatchTupleFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setPositionalConstraint(String positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }

        public Builder setTargetString(@Nullable String targetString) {
            this.targetString = targetString;
            return this;
        }

        public Builder setTextTransformation(String textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }
        public ByteMatchSetByteMatchTuple build() {
            return new ByteMatchSetByteMatchTuple(fieldToMatch, positionalConstraint, targetString, textTransformation);
        }
    }
}

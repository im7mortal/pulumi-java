// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatement {
    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    private final String arn;
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

    @OutputCustomType.Constructor({"arn","fieldToMatch","textTransformations"})
    private WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatement(
        String arn,
        @Nullable WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch,
        List<WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
        this.arn = Objects.requireNonNull(arn);
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations);
    }

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatement build() {
            return new WebAclRuleStatementNotStatementStatementRegexPatternSetReferenceStatement(arn, fieldToMatch, textTransformations);
        }
    }
}

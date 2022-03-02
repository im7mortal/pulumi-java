// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement {
    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    private final String arn;
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

    @OutputCustomType.Constructor({"arn","fieldToMatch","textTransformations"})
    private WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement(
        String arn,
        @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch,
        List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
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
    public Optional<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement build() {
            return new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement(arn, fieldToMatch, textTransformations);
        }
    }
}

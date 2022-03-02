// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement {
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

    @OutputCustomType.Constructor({"byteMatchStatement","geoMatchStatement","ipSetReferenceStatement","labelMatchStatement","regexPatternSetReferenceStatement","sizeConstraintStatement","sqliMatchStatement","xssMatchStatement"})
    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement(
        @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement,
        @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement,
        @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement,
        @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement,
        @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement> getByteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement> getGeoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement> getLabelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement> getSizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement> getSqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement> getXssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder setByteMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}

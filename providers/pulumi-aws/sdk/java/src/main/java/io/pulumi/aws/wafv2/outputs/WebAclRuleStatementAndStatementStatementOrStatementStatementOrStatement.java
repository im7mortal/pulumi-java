// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatement;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement {
    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatement> statements;

    @OutputCustomType.Constructor({"statements"})
    private WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement(List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatement> statements) {
        this.statements = Objects.requireNonNull(statements);
    }

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
    */
    public List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement(statements);
        }
    }
}

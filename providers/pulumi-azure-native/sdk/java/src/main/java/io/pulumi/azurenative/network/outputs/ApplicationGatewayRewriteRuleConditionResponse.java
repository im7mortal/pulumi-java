// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayRewriteRuleConditionResponse {
    /**
     * Setting this parameter to truth value with force the pattern to do a case in-sensitive comparison.
     * 
     */
    private final @Nullable Boolean ignoreCase;
    /**
     * Setting this value as truth will force to check the negation of the condition given by the user.
     * 
     */
    private final @Nullable Boolean negate;
    /**
     * The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
     * 
     */
    private final @Nullable String pattern;
    /**
     * The condition parameter of the RewriteRuleCondition.
     * 
     */
    private final @Nullable String variable;

    @OutputCustomType.Constructor({"ignoreCase","negate","pattern","variable"})
    private ApplicationGatewayRewriteRuleConditionResponse(
        @Nullable Boolean ignoreCase,
        @Nullable Boolean negate,
        @Nullable String pattern,
        @Nullable String variable) {
        this.ignoreCase = ignoreCase;
        this.negate = negate;
        this.pattern = pattern;
        this.variable = variable;
    }

    /**
     * Setting this parameter to truth value with force the pattern to do a case in-sensitive comparison.
     * 
    */
    public Optional<Boolean> getIgnoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }
    /**
     * Setting this value as truth will force to check the negation of the condition given by the user.
     * 
    */
    public Optional<Boolean> getNegate() {
        return Optional.ofNullable(this.negate);
    }
    /**
     * The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
     * 
    */
    public Optional<String> getPattern() {
        return Optional.ofNullable(this.pattern);
    }
    /**
     * The condition parameter of the RewriteRuleCondition.
     * 
    */
    public Optional<String> getVariable() {
        return Optional.ofNullable(this.variable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ignoreCase;
        private @Nullable Boolean negate;
        private @Nullable String pattern;
        private @Nullable String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.negate = defaults.negate;
    	      this.pattern = defaults.pattern;
    	      this.variable = defaults.variable;
        }

        public Builder setIgnoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }

        public Builder setNegate(@Nullable Boolean negate) {
            this.negate = negate;
            return this;
        }

        public Builder setPattern(@Nullable String pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder setVariable(@Nullable String variable) {
            this.variable = variable;
            return this;
        }
        public ApplicationGatewayRewriteRuleConditionResponse build() {
            return new ApplicationGatewayRewriteRuleConditionResponse(ignoreCase, negate, pattern, variable);
        }
    }
}

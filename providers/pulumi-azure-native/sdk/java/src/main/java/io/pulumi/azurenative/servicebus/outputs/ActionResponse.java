// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ActionResponse {
    /**
     * This property is reserved for future use. An integer value showing the compatibility level, currently hard-coded to 20.
     * 
     */
    private final @Nullable Integer compatibilityLevel;
    /**
     * Value that indicates whether the rule action requires preprocessing.
     * 
     */
    private final @Nullable Boolean requiresPreprocessing;
    /**
     * SQL expression. e.g. MyProperty='ABC'
     * 
     */
    private final @Nullable String sqlExpression;

    @OutputCustomType.Constructor({"compatibilityLevel","requiresPreprocessing","sqlExpression"})
    private ActionResponse(
        @Nullable Integer compatibilityLevel,
        @Nullable Boolean requiresPreprocessing,
        @Nullable String sqlExpression) {
        this.compatibilityLevel = compatibilityLevel;
        this.requiresPreprocessing = requiresPreprocessing;
        this.sqlExpression = sqlExpression;
    }

    /**
     * This property is reserved for future use. An integer value showing the compatibility level, currently hard-coded to 20.
     * 
    */
    public Optional<Integer> getCompatibilityLevel() {
        return Optional.ofNullable(this.compatibilityLevel);
    }
    /**
     * Value that indicates whether the rule action requires preprocessing.
     * 
    */
    public Optional<Boolean> getRequiresPreprocessing() {
        return Optional.ofNullable(this.requiresPreprocessing);
    }
    /**
     * SQL expression. e.g. MyProperty='ABC'
     * 
    */
    public Optional<String> getSqlExpression() {
        return Optional.ofNullable(this.sqlExpression);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer compatibilityLevel;
        private @Nullable Boolean requiresPreprocessing;
        private @Nullable String sqlExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.requiresPreprocessing = defaults.requiresPreprocessing;
    	      this.sqlExpression = defaults.sqlExpression;
        }

        public Builder setCompatibilityLevel(@Nullable Integer compatibilityLevel) {
            this.compatibilityLevel = compatibilityLevel;
            return this;
        }

        public Builder setRequiresPreprocessing(@Nullable Boolean requiresPreprocessing) {
            this.requiresPreprocessing = requiresPreprocessing;
            return this;
        }

        public Builder setSqlExpression(@Nullable String sqlExpression) {
            this.sqlExpression = sqlExpression;
            return this;
        }
        public ActionResponse build() {
            return new ActionResponse(compatibilityLevel, requiresPreprocessing, sqlExpression);
        }
    }
}

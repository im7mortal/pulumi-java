// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AppEngineVersionIamBindingCondition {
    /**
     * An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    private final @Nullable String description;
    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    private final String expression;
    /**
     * A title for the expression, i.e. a short string describing its purpose.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"description","expression","title"})
    private AppEngineVersionIamBindingCondition(
        @Nullable String description,
        String expression,
        String title) {
        this.description = description;
        this.expression = Objects.requireNonNull(expression);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
    */
    public String getExpression() {
        return this.expression;
    }
    /**
     * A title for the expression, i.e. a short string describing its purpose.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineVersionIamBindingCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineVersionIamBindingCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.title = defaults.title;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public AppEngineVersionIamBindingCondition build() {
            return new AppEngineVersionIamBindingCondition(description, expression, title);
        }
    }
}

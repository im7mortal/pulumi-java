// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleType__ExprResponse {
    /**
     * Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    private final String description;
    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    private final String expression;
    /**
     * Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    private final String location;
    /**
     * Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"description","expression","location","title"})
    private GoogleType__ExprResponse(
        String description,
        String expression,
        String location,
        String title) {
        this.description = Objects.requireNonNull(description);
        this.expression = Objects.requireNonNull(expression);
        this.location = Objects.requireNonNull(location);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
    */
    public String getExpression() {
        return this.expression;
    }
    /**
     * Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleType__ExprResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String expression;
        private String location;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleType__ExprResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleType__ExprResponse build() {
            return new GoogleType__ExprResponse(description, expression, location, title);
        }
    }
}

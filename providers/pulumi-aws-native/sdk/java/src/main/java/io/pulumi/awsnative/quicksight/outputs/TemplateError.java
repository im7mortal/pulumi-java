// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.TemplateErrorType;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TemplateError {
    /**
     * <p>Description of the error type.</p>
     * 
     */
    private final @Nullable String message;
    private final @Nullable TemplateErrorType type;

    @OutputCustomType.Constructor({"message","type"})
    private TemplateError(
        @Nullable String message,
        @Nullable TemplateErrorType type) {
        this.message = message;
        this.type = type;
    }

    /**
     * <p>Description of the error type.</p>
     * 
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<TemplateErrorType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable TemplateErrorType type;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setType(@Nullable TemplateErrorType type) {
            this.type = type;
            return this;
        }

        public TemplateError build() {
            return new TemplateError(message, type);
        }
    }
}
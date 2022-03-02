// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiErrorBaseResponse {
    /**
     * The error code.
     * 
     */
    private final @Nullable String code;
    /**
     * The error message.
     * 
     */
    private final @Nullable String message;
    /**
     * The target of the particular error.
     * 
     */
    private final @Nullable String target;

    @OutputCustomType.Constructor({"code","message","target"})
    private ApiErrorBaseResponse(
        @Nullable String code,
        @Nullable String message,
        @Nullable String target) {
        this.code = code;
        this.message = message;
        this.target = target;
    }

    /**
     * The error code.
     * 
    */
    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * The error message.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * The target of the particular error.
     * 
    */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiErrorBaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiErrorBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }
        public ApiErrorBaseResponse build() {
            return new ApiErrorBaseResponse(code, message, target);
        }
    }
}

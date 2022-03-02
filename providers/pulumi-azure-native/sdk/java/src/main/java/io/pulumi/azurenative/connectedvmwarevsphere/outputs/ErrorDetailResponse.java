// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ErrorDetailResponse {
    /**
     * The error's code.
     * 
     */
    private final String code;
    /**
     * Additional error details.
     * 
     */
    private final @Nullable List<ErrorDetailResponse> details;
    /**
     * A human readable error message.
     * 
     */
    private final String message;
    /**
     * Indicates which property in the request is responsible for the error.
     * 
     */
    private final @Nullable String target;

    @OutputCustomType.Constructor({"code","details","message","target"})
    private ErrorDetailResponse(
        String code,
        @Nullable List<ErrorDetailResponse> details,
        String message,
        @Nullable String target) {
        this.code = Objects.requireNonNull(code);
        this.details = details;
        this.message = Objects.requireNonNull(message);
        this.target = target;
    }

    /**
     * The error's code.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * Additional error details.
     * 
    */
    public List<ErrorDetailResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * A human readable error message.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * Indicates which property in the request is responsible for the error.
     * 
    */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<ErrorDetailResponse> details;
        private String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(@Nullable List<ErrorDetailResponse> details) {
            this.details = details;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }
        public ErrorDetailResponse build() {
            return new ErrorDetailResponse(code, details, message, target);
        }
    }
}

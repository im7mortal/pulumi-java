// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ErrorDetailResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ErrorResponseResponse {
    /**
     * Error code.
     * 
     */
    private final String code;
    /**
     * An array of error detail objects.
     * 
     */
    private final List<ErrorDetailResponse> details;
    /**
     * Error message.
     * 
     */
    private final String message;

    @OutputCustomType.Constructor({"code","details","message"})
    private ErrorResponseResponse(
        String code,
        List<ErrorDetailResponse> details,
        String message) {
        this.code = Objects.requireNonNull(code);
        this.details = Objects.requireNonNull(details);
        this.message = Objects.requireNonNull(message);
    }

    /**
     * Error code.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * An array of error detail objects.
     * 
    */
    public List<ErrorDetailResponse> getDetails() {
        return this.details;
    }
    /**
     * Error message.
     * 
    */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<ErrorDetailResponse> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(List<ErrorDetailResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public ErrorResponseResponse build() {
            return new ErrorResponseResponse(code, details, message);
        }
    }
}

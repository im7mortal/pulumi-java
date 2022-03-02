// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.outputs;

import io.pulumi.azurenative.policyinsights.outputs.TypedErrorInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ErrorDefinitionResponse {
    /**
     * Additional scenario specific error details.
     * 
     */
    private final List<TypedErrorInfoResponse> additionalInfo;
    /**
     * Service specific error code which serves as the substatus for the HTTP error code.
     * 
     */
    private final String code;
    /**
     * Internal error details.
     * 
     */
    private final List<ErrorDefinitionResponse> details;
    /**
     * Description of the error.
     * 
     */
    private final String message;
    /**
     * The target of the error.
     * 
     */
    private final String target;

    @OutputCustomType.Constructor({"additionalInfo","code","details","message","target"})
    private ErrorDefinitionResponse(
        List<TypedErrorInfoResponse> additionalInfo,
        String code,
        List<ErrorDefinitionResponse> details,
        String message,
        String target) {
        this.additionalInfo = Objects.requireNonNull(additionalInfo);
        this.code = Objects.requireNonNull(code);
        this.details = Objects.requireNonNull(details);
        this.message = Objects.requireNonNull(message);
        this.target = Objects.requireNonNull(target);
    }

    /**
     * Additional scenario specific error details.
     * 
    */
    public List<TypedErrorInfoResponse> getAdditionalInfo() {
        return this.additionalInfo;
    }
    /**
     * Service specific error code which serves as the substatus for the HTTP error code.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * Internal error details.
     * 
    */
    public List<ErrorDefinitionResponse> getDetails() {
        return this.details;
    }
    /**
     * Description of the error.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * The target of the error.
     * 
    */
    public String getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TypedErrorInfoResponse> additionalInfo;
        private String code;
        private List<ErrorDefinitionResponse> details;
        private String message;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setAdditionalInfo(List<TypedErrorInfoResponse> additionalInfo) {
            this.additionalInfo = Objects.requireNonNull(additionalInfo);
            return this;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(List<ErrorDefinitionResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public ErrorDefinitionResponse build() {
            return new ErrorDefinitionResponse(additionalInfo, code, details, message, target);
        }
    }
}

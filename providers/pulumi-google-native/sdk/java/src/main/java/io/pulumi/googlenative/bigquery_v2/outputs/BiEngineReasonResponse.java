// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BiEngineReasonResponse {
    /**
     * High-level BI Engine reason for partial or disabled acceleration.
     * 
     */
    private final String code;
    /**
     * Free form human-readable reason for partial or disabled acceleration.
     * 
     */
    private final String message;

    @OutputCustomType.Constructor({"code","message"})
    private BiEngineReasonResponse(
        String code,
        String message) {
        this.code = Objects.requireNonNull(code);
        this.message = Objects.requireNonNull(message);
    }

    /**
     * High-level BI Engine reason for partial or disabled acceleration.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * Free form human-readable reason for partial or disabled acceleration.
     * 
    */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BiEngineReasonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(BiEngineReasonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public BiEngineReasonResponse build() {
            return new BiEngineReasonResponse(code, message);
        }
    }
}

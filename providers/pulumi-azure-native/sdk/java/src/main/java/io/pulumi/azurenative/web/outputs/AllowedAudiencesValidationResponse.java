// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AllowedAudiencesValidationResponse {
    /**
     * The configuration settings of the allowed list of audiences from which to validate the JWT token.
     * 
     */
    private final @Nullable List<String> allowedAudiences;

    @OutputCustomType.Constructor({"allowedAudiences"})
    private AllowedAudiencesValidationResponse(@Nullable List<String> allowedAudiences) {
        this.allowedAudiences = allowedAudiences;
    }

    /**
     * The configuration settings of the allowed list of audiences from which to validate the JWT token.
     * 
    */
    public List<String> getAllowedAudiences() {
        return this.allowedAudiences == null ? List.of() : this.allowedAudiences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedAudiencesValidationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedAudiences;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedAudiencesValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
        }

        public Builder setAllowedAudiences(@Nullable List<String> allowedAudiences) {
            this.allowedAudiences = allowedAudiences;
            return this;
        }
        public AllowedAudiencesValidationResponse build() {
            return new AllowedAudiencesValidationResponse(allowedAudiences);
        }
    }
}

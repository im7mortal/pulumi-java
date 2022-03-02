// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FhirServiceAccessPolicyEntryResponse {
    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    private final String objectId;

    @OutputCustomType.Constructor({"objectId"})
    private FhirServiceAccessPolicyEntryResponse(String objectId) {
        this.objectId = Objects.requireNonNull(objectId);
    }

    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
    */
    public String getObjectId() {
        return this.objectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirServiceAccessPolicyEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirServiceAccessPolicyEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public FhirServiceAccessPolicyEntryResponse build() {
            return new FhirServiceAccessPolicyEntryResponse(objectId);
        }
    }
}

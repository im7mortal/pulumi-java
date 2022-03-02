// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.SecurityAssessmentMetadataPartnerDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityAssessmentMetadataPropertiesResponse {
    /**
     * BuiltIn if the assessment based on built-in Azure Policy definition, Custom if the assessment based on custom Azure Policy definition
     * 
     */
    private final String assessmentType;
    private final @Nullable List<String> categories;
    /**
     * Human readable description of the assessment
     * 
     */
    private final @Nullable String description;
    /**
     * User friendly display name of the assessment
     * 
     */
    private final String displayName;
    /**
     * The implementation effort required to remediate this assessment
     * 
     */
    private final @Nullable String implementationEffort;
    /**
     * Describes the partner that created the assessment
     * 
     */
    private final @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData;
    /**
     * Azure resource ID of the policy definition that turns this assessment calculation on
     * 
     */
    private final String policyDefinitionId;
    /**
     * True if this assessment is in preview release status
     * 
     */
    private final @Nullable Boolean preview;
    /**
     * Human readable description of what you should do to mitigate this security issue
     * 
     */
    private final @Nullable String remediationDescription;
    /**
     * The severity level of the assessment
     * 
     */
    private final String severity;
    private final @Nullable List<String> threats;
    /**
     * The user impact of the assessment
     * 
     */
    private final @Nullable String userImpact;

    @OutputCustomType.Constructor({"assessmentType","categories","description","displayName","implementationEffort","partnerData","policyDefinitionId","preview","remediationDescription","severity","threats","userImpact"})
    private SecurityAssessmentMetadataPropertiesResponse(
        String assessmentType,
        @Nullable List<String> categories,
        @Nullable String description,
        String displayName,
        @Nullable String implementationEffort,
        @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData,
        String policyDefinitionId,
        @Nullable Boolean preview,
        @Nullable String remediationDescription,
        String severity,
        @Nullable List<String> threats,
        @Nullable String userImpact) {
        this.assessmentType = Objects.requireNonNull(assessmentType);
        this.categories = categories;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName);
        this.implementationEffort = implementationEffort;
        this.partnerData = partnerData;
        this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId);
        this.preview = preview;
        this.remediationDescription = remediationDescription;
        this.severity = Objects.requireNonNull(severity);
        this.threats = threats;
        this.userImpact = userImpact;
    }

    /**
     * BuiltIn if the assessment based on built-in Azure Policy definition, Custom if the assessment based on custom Azure Policy definition
     * 
    */
    public String getAssessmentType() {
        return this.assessmentType;
    }
    public List<String> getCategories() {
        return this.categories == null ? List.of() : this.categories;
    }
    /**
     * Human readable description of the assessment
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * User friendly display name of the assessment
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The implementation effort required to remediate this assessment
     * 
    */
    public Optional<String> getImplementationEffort() {
        return Optional.ofNullable(this.implementationEffort);
    }
    /**
     * Describes the partner that created the assessment
     * 
    */
    public Optional<SecurityAssessmentMetadataPartnerDataResponse> getPartnerData() {
        return Optional.ofNullable(this.partnerData);
    }
    /**
     * Azure resource ID of the policy definition that turns this assessment calculation on
     * 
    */
    public String getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }
    /**
     * True if this assessment is in preview release status
     * 
    */
    public Optional<Boolean> getPreview() {
        return Optional.ofNullable(this.preview);
    }
    /**
     * Human readable description of what you should do to mitigate this security issue
     * 
    */
    public Optional<String> getRemediationDescription() {
        return Optional.ofNullable(this.remediationDescription);
    }
    /**
     * The severity level of the assessment
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    public List<String> getThreats() {
        return this.threats == null ? List.of() : this.threats;
    }
    /**
     * The user impact of the assessment
     * 
    */
    public Optional<String> getUserImpact() {
        return Optional.ofNullable(this.userImpact);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityAssessmentMetadataPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assessmentType;
        private @Nullable List<String> categories;
        private @Nullable String description;
        private String displayName;
        private @Nullable String implementationEffort;
        private @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData;
        private String policyDefinitionId;
        private @Nullable Boolean preview;
        private @Nullable String remediationDescription;
        private String severity;
        private @Nullable List<String> threats;
        private @Nullable String userImpact;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityAssessmentMetadataPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentType = defaults.assessmentType;
    	      this.categories = defaults.categories;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.implementationEffort = defaults.implementationEffort;
    	      this.partnerData = defaults.partnerData;
    	      this.policyDefinitionId = defaults.policyDefinitionId;
    	      this.preview = defaults.preview;
    	      this.remediationDescription = defaults.remediationDescription;
    	      this.severity = defaults.severity;
    	      this.threats = defaults.threats;
    	      this.userImpact = defaults.userImpact;
        }

        public Builder setAssessmentType(String assessmentType) {
            this.assessmentType = Objects.requireNonNull(assessmentType);
            return this;
        }

        public Builder setCategories(@Nullable List<String> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setImplementationEffort(@Nullable String implementationEffort) {
            this.implementationEffort = implementationEffort;
            return this;
        }

        public Builder setPartnerData(@Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData) {
            this.partnerData = partnerData;
            return this;
        }

        public Builder setPolicyDefinitionId(String policyDefinitionId) {
            this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId);
            return this;
        }

        public Builder setPreview(@Nullable Boolean preview) {
            this.preview = preview;
            return this;
        }

        public Builder setRemediationDescription(@Nullable String remediationDescription) {
            this.remediationDescription = remediationDescription;
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setThreats(@Nullable List<String> threats) {
            this.threats = threats;
            return this;
        }

        public Builder setUserImpact(@Nullable String userImpact) {
            this.userImpact = userImpact;
            return this;
        }
        public SecurityAssessmentMetadataPropertiesResponse build() {
            return new SecurityAssessmentMetadataPropertiesResponse(assessmentType, categories, description, displayName, implementationEffort, partnerData, policyDefinitionId, preview, remediationDescription, severity, threats, userImpact);
        }
    }
}

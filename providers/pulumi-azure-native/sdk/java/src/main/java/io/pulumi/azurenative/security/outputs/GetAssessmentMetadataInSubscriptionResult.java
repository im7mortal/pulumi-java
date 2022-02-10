// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.SecurityAssessmentMetadataPartnerDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAssessmentMetadataInSubscriptionResult {
    private final String assessmentType;
    private final @Nullable List<String> categories;
    private final @Nullable String description;
    private final String displayName;
    private final String id;
    private final @Nullable String implementationEffort;
    private final String name;
    private final @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData;
    private final String policyDefinitionId;
    private final @Nullable Boolean preview;
    private final @Nullable String remediationDescription;
    private final String severity;
    private final @Nullable List<String> threats;
    private final String type;
    private final @Nullable String userImpact;

    @OutputCustomType.Constructor({"assessmentType","categories","description","displayName","id","implementationEffort","name","partnerData","policyDefinitionId","preview","remediationDescription","severity","threats","type","userImpact"})
    private GetAssessmentMetadataInSubscriptionResult(
        String assessmentType,
        @Nullable List<String> categories,
        @Nullable String description,
        String displayName,
        String id,
        @Nullable String implementationEffort,
        String name,
        @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData,
        String policyDefinitionId,
        @Nullable Boolean preview,
        @Nullable String remediationDescription,
        String severity,
        @Nullable List<String> threats,
        String type,
        @Nullable String userImpact) {
        this.assessmentType = Objects.requireNonNull(assessmentType);
        this.categories = categories;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName);
        this.id = Objects.requireNonNull(id);
        this.implementationEffort = implementationEffort;
        this.name = Objects.requireNonNull(name);
        this.partnerData = partnerData;
        this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId);
        this.preview = preview;
        this.remediationDescription = remediationDescription;
        this.severity = Objects.requireNonNull(severity);
        this.threats = threats;
        this.type = Objects.requireNonNull(type);
        this.userImpact = userImpact;
    }

    public String getAssessmentType() {
        return this.assessmentType;
    }
    public List<String> getCategories() {
        return this.categories == null ? List.of() : this.categories;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getImplementationEffort() {
        return Optional.ofNullable(this.implementationEffort);
    }
    public String getName() {
        return this.name;
    }
    public Optional<SecurityAssessmentMetadataPartnerDataResponse> getPartnerData() {
        return Optional.ofNullable(this.partnerData);
    }
    public String getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }
    public Optional<Boolean> getPreview() {
        return Optional.ofNullable(this.preview);
    }
    public Optional<String> getRemediationDescription() {
        return Optional.ofNullable(this.remediationDescription);
    }
    public String getSeverity() {
        return this.severity;
    }
    public List<String> getThreats() {
        return this.threats == null ? List.of() : this.threats;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getUserImpact() {
        return Optional.ofNullable(this.userImpact);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssessmentMetadataInSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assessmentType;
        private @Nullable List<String> categories;
        private @Nullable String description;
        private String displayName;
        private String id;
        private @Nullable String implementationEffort;
        private String name;
        private @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData;
        private String policyDefinitionId;
        private @Nullable Boolean preview;
        private @Nullable String remediationDescription;
        private String severity;
        private @Nullable List<String> threats;
        private String type;
        private @Nullable String userImpact;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssessmentMetadataInSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentType = defaults.assessmentType;
    	      this.categories = defaults.categories;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.implementationEffort = defaults.implementationEffort;
    	      this.name = defaults.name;
    	      this.partnerData = defaults.partnerData;
    	      this.policyDefinitionId = defaults.policyDefinitionId;
    	      this.preview = defaults.preview;
    	      this.remediationDescription = defaults.remediationDescription;
    	      this.severity = defaults.severity;
    	      this.threats = defaults.threats;
    	      this.type = defaults.type;
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

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImplementationEffort(@Nullable String implementationEffort) {
            this.implementationEffort = implementationEffort;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserImpact(@Nullable String userImpact) {
            this.userImpact = userImpact;
            return this;
        }

        public GetAssessmentMetadataInSubscriptionResult build() {
            return new GetAssessmentMetadataInSubscriptionResult(assessmentType, categories, description, displayName, id, implementationEffort, name, partnerData, policyDefinitionId, preview, remediationDescription, severity, threats, type, userImpact);
        }
    }
}
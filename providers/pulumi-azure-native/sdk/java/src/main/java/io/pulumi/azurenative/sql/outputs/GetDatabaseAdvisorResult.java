// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.RecommendedActionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDatabaseAdvisorResult {
    /**
     * Gets the status of availability of this advisor to customers. Possible values are 'GA', 'PublicPreview', 'LimitedPublicPreview' and 'PrivatePreview'.
     * 
     */
    private final String advisorStatus;
    /**
     * Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'
     * 
     */
    private final String autoExecuteStatus;
    /**
     * Gets the resource from which current value of auto-execute status is inherited. Auto-execute status can be set on (and inherited from) different levels in the resource hierarchy. Possible values are 'Subscription', 'Server', 'ElasticPool', 'Database' and 'Default' (when status is not explicitly set on any level).
     * 
     */
    private final String autoExecuteStatusInheritedFrom;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource kind.
     * 
     */
    private final String kind;
    /**
     * Gets the time when the current resource was analyzed for recommendations by this advisor.
     * 
     */
    private final String lastChecked;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Gets that status of recommendations for this advisor and reason for not having any recommendations. Possible values include, but are not limited to, 'Ok' (Recommendations available),LowActivity (not enough workload to analyze), 'DbSeemsTuned' (Database is doing well), etc.
     * 
     */
    private final String recommendationsStatus;
    /**
     * Gets the recommended actions for this advisor.
     * 
     */
    private final List<RecommendedActionResponse> recommendedActions;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"advisorStatus","autoExecuteStatus","autoExecuteStatusInheritedFrom","id","kind","lastChecked","location","name","recommendationsStatus","recommendedActions","type"})
    private GetDatabaseAdvisorResult(
        String advisorStatus,
        String autoExecuteStatus,
        String autoExecuteStatusInheritedFrom,
        String id,
        String kind,
        String lastChecked,
        String location,
        String name,
        String recommendationsStatus,
        List<RecommendedActionResponse> recommendedActions,
        String type) {
        this.advisorStatus = Objects.requireNonNull(advisorStatus);
        this.autoExecuteStatus = Objects.requireNonNull(autoExecuteStatus);
        this.autoExecuteStatusInheritedFrom = Objects.requireNonNull(autoExecuteStatusInheritedFrom);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.lastChecked = Objects.requireNonNull(lastChecked);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.recommendationsStatus = Objects.requireNonNull(recommendationsStatus);
        this.recommendedActions = Objects.requireNonNull(recommendedActions);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Gets the status of availability of this advisor to customers. Possible values are 'GA', 'PublicPreview', 'LimitedPublicPreview' and 'PrivatePreview'.
     * 
    */
    public String getAdvisorStatus() {
        return this.advisorStatus;
    }
    /**
     * Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'
     * 
    */
    public String getAutoExecuteStatus() {
        return this.autoExecuteStatus;
    }
    /**
     * Gets the resource from which current value of auto-execute status is inherited. Auto-execute status can be set on (and inherited from) different levels in the resource hierarchy. Possible values are 'Subscription', 'Server', 'ElasticPool', 'Database' and 'Default' (when status is not explicitly set on any level).
     * 
    */
    public String getAutoExecuteStatusInheritedFrom() {
        return this.autoExecuteStatusInheritedFrom;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource kind.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Gets the time when the current resource was analyzed for recommendations by this advisor.
     * 
    */
    public String getLastChecked() {
        return this.lastChecked;
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets that status of recommendations for this advisor and reason for not having any recommendations. Possible values include, but are not limited to, 'Ok' (Recommendations available),LowActivity (not enough workload to analyze), 'DbSeemsTuned' (Database is doing well), etc.
     * 
    */
    public String getRecommendationsStatus() {
        return this.recommendationsStatus;
    }
    /**
     * Gets the recommended actions for this advisor.
     * 
    */
    public List<RecommendedActionResponse> getRecommendedActions() {
        return this.recommendedActions;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseAdvisorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String advisorStatus;
        private String autoExecuteStatus;
        private String autoExecuteStatusInheritedFrom;
        private String id;
        private String kind;
        private String lastChecked;
        private String location;
        private String name;
        private String recommendationsStatus;
        private List<RecommendedActionResponse> recommendedActions;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseAdvisorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advisorStatus = defaults.advisorStatus;
    	      this.autoExecuteStatus = defaults.autoExecuteStatus;
    	      this.autoExecuteStatusInheritedFrom = defaults.autoExecuteStatusInheritedFrom;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastChecked = defaults.lastChecked;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.recommendationsStatus = defaults.recommendationsStatus;
    	      this.recommendedActions = defaults.recommendedActions;
    	      this.type = defaults.type;
        }

        public Builder setAdvisorStatus(String advisorStatus) {
            this.advisorStatus = Objects.requireNonNull(advisorStatus);
            return this;
        }

        public Builder setAutoExecuteStatus(String autoExecuteStatus) {
            this.autoExecuteStatus = Objects.requireNonNull(autoExecuteStatus);
            return this;
        }

        public Builder setAutoExecuteStatusInheritedFrom(String autoExecuteStatusInheritedFrom) {
            this.autoExecuteStatusInheritedFrom = Objects.requireNonNull(autoExecuteStatusInheritedFrom);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLastChecked(String lastChecked) {
            this.lastChecked = Objects.requireNonNull(lastChecked);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRecommendationsStatus(String recommendationsStatus) {
            this.recommendationsStatus = Objects.requireNonNull(recommendationsStatus);
            return this;
        }

        public Builder setRecommendedActions(List<RecommendedActionResponse> recommendedActions) {
            this.recommendedActions = Objects.requireNonNull(recommendedActions);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDatabaseAdvisorResult build() {
            return new GetDatabaseAdvisorResult(advisorStatus, autoExecuteStatus, autoExecuteStatusInheritedFrom, id, kind, lastChecked, location, name, recommendationsStatus, recommendedActions, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScheduledAlertRuleResult {
    /**
     * The Name of the alert rule template used to create this rule.
     * 
     */
    private final @Nullable String alertRuleTemplateName;
    /**
     * The description of the alert rule.
     * 
     */
    private final @Nullable String description;
    /**
     * The display name for alerts created by this alert rule.
     * 
     */
    private final String displayName;
    /**
     * Determines whether this alert rule is enabled or disabled.
     * 
     */
    private final Boolean enabled;
    /**
     * Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * The kind of the alert rule
     * Expected value is 'Scheduled'.
     * 
     */
    private final String kind;
    /**
     * The last time that this alert rule has been modified.
     * 
     */
    private final String lastModifiedUtc;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * The query that creates alerts for this rule.
     * 
     */
    private final String query;
    /**
     * The frequency (in ISO 8601 duration format) for this alert rule to run.
     * 
     */
    private final String queryFrequency;
    /**
     * The period (in ISO 8601 duration format) that this alert rule looks at.
     * 
     */
    private final String queryPeriod;
    /**
     * The severity for alerts created by this alert rule.
     * 
     */
    private final String severity;
    /**
     * The suppression (in ISO 8601 duration format) to wait since last time this alert rule been triggered.
     * 
     */
    private final String suppressionDuration;
    /**
     * Determines whether the suppression for this alert rule is enabled or disabled.
     * 
     */
    private final Boolean suppressionEnabled;
    /**
     * The tactics of the alert rule
     * 
     */
    private final @Nullable List<String> tactics;
    /**
     * The operation against the threshold that triggers alert rule.
     * 
     */
    private final String triggerOperator;
    /**
     * The threshold triggers this alert rule.
     * 
     */
    private final Integer triggerThreshold;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"alertRuleTemplateName","description","displayName","enabled","etag","id","kind","lastModifiedUtc","name","query","queryFrequency","queryPeriod","severity","suppressionDuration","suppressionEnabled","tactics","triggerOperator","triggerThreshold","type"})
    private GetScheduledAlertRuleResult(
        @Nullable String alertRuleTemplateName,
        @Nullable String description,
        String displayName,
        Boolean enabled,
        @Nullable String etag,
        String id,
        String kind,
        String lastModifiedUtc,
        String name,
        String query,
        String queryFrequency,
        String queryPeriod,
        String severity,
        String suppressionDuration,
        Boolean suppressionEnabled,
        @Nullable List<String> tactics,
        String triggerOperator,
        Integer triggerThreshold,
        String type) {
        this.alertRuleTemplateName = alertRuleTemplateName;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName);
        this.enabled = Objects.requireNonNull(enabled);
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.lastModifiedUtc = Objects.requireNonNull(lastModifiedUtc);
        this.name = Objects.requireNonNull(name);
        this.query = Objects.requireNonNull(query);
        this.queryFrequency = Objects.requireNonNull(queryFrequency);
        this.queryPeriod = Objects.requireNonNull(queryPeriod);
        this.severity = Objects.requireNonNull(severity);
        this.suppressionDuration = Objects.requireNonNull(suppressionDuration);
        this.suppressionEnabled = Objects.requireNonNull(suppressionEnabled);
        this.tactics = tactics;
        this.triggerOperator = Objects.requireNonNull(triggerOperator);
        this.triggerThreshold = Objects.requireNonNull(triggerThreshold);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The Name of the alert rule template used to create this rule.
     * 
    */
    public Optional<String> getAlertRuleTemplateName() {
        return Optional.ofNullable(this.alertRuleTemplateName);
    }
    /**
     * The description of the alert rule.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name for alerts created by this alert rule.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Determines whether this alert rule is enabled or disabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Etag of the azure resource
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The kind of the alert rule
     * Expected value is 'Scheduled'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The last time that this alert rule has been modified.
     * 
    */
    public String getLastModifiedUtc() {
        return this.lastModifiedUtc;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The query that creates alerts for this rule.
     * 
    */
    public String getQuery() {
        return this.query;
    }
    /**
     * The frequency (in ISO 8601 duration format) for this alert rule to run.
     * 
    */
    public String getQueryFrequency() {
        return this.queryFrequency;
    }
    /**
     * The period (in ISO 8601 duration format) that this alert rule looks at.
     * 
    */
    public String getQueryPeriod() {
        return this.queryPeriod;
    }
    /**
     * The severity for alerts created by this alert rule.
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    /**
     * The suppression (in ISO 8601 duration format) to wait since last time this alert rule been triggered.
     * 
    */
    public String getSuppressionDuration() {
        return this.suppressionDuration;
    }
    /**
     * Determines whether the suppression for this alert rule is enabled or disabled.
     * 
    */
    public Boolean getSuppressionEnabled() {
        return this.suppressionEnabled;
    }
    /**
     * The tactics of the alert rule
     * 
    */
    public List<String> getTactics() {
        return this.tactics == null ? List.of() : this.tactics;
    }
    /**
     * The operation against the threshold that triggers alert rule.
     * 
    */
    public String getTriggerOperator() {
        return this.triggerOperator;
    }
    /**
     * The threshold triggers this alert rule.
     * 
    */
    public Integer getTriggerThreshold() {
        return this.triggerThreshold;
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledAlertRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alertRuleTemplateName;
        private @Nullable String description;
        private String displayName;
        private Boolean enabled;
        private @Nullable String etag;
        private String id;
        private String kind;
        private String lastModifiedUtc;
        private String name;
        private String query;
        private String queryFrequency;
        private String queryPeriod;
        private String severity;
        private String suppressionDuration;
        private Boolean suppressionEnabled;
        private @Nullable List<String> tactics;
        private String triggerOperator;
        private Integer triggerThreshold;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledAlertRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertRuleTemplateName = defaults.alertRuleTemplateName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastModifiedUtc = defaults.lastModifiedUtc;
    	      this.name = defaults.name;
    	      this.query = defaults.query;
    	      this.queryFrequency = defaults.queryFrequency;
    	      this.queryPeriod = defaults.queryPeriod;
    	      this.severity = defaults.severity;
    	      this.suppressionDuration = defaults.suppressionDuration;
    	      this.suppressionEnabled = defaults.suppressionEnabled;
    	      this.tactics = defaults.tactics;
    	      this.triggerOperator = defaults.triggerOperator;
    	      this.triggerThreshold = defaults.triggerThreshold;
    	      this.type = defaults.type;
        }

        public Builder setAlertRuleTemplateName(@Nullable String alertRuleTemplateName) {
            this.alertRuleTemplateName = alertRuleTemplateName;
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

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
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

        public Builder setLastModifiedUtc(String lastModifiedUtc) {
            this.lastModifiedUtc = Objects.requireNonNull(lastModifiedUtc);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setQueryFrequency(String queryFrequency) {
            this.queryFrequency = Objects.requireNonNull(queryFrequency);
            return this;
        }

        public Builder setQueryPeriod(String queryPeriod) {
            this.queryPeriod = Objects.requireNonNull(queryPeriod);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setSuppressionDuration(String suppressionDuration) {
            this.suppressionDuration = Objects.requireNonNull(suppressionDuration);
            return this;
        }

        public Builder setSuppressionEnabled(Boolean suppressionEnabled) {
            this.suppressionEnabled = Objects.requireNonNull(suppressionEnabled);
            return this;
        }

        public Builder setTactics(@Nullable List<String> tactics) {
            this.tactics = tactics;
            return this;
        }

        public Builder setTriggerOperator(String triggerOperator) {
            this.triggerOperator = Objects.requireNonNull(triggerOperator);
            return this;
        }

        public Builder setTriggerThreshold(Integer triggerThreshold) {
            this.triggerThreshold = Objects.requireNonNull(triggerThreshold);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetScheduledAlertRuleResult build() {
            return new GetScheduledAlertRuleResult(alertRuleTemplateName, description, displayName, enabled, etag, id, kind, lastModifiedUtc, name, query, queryFrequency, queryPeriod, severity, suppressionDuration, suppressionEnabled, tactics, triggerOperator, triggerThreshold, type);
        }
    }
}

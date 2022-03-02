// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3FormParameterFillBehaviorResponse;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3FormParameterResponse {
    /**
     * The default value of an optional parameter. If the parameter is required, the default value will be ignored.
     * 
     */
    private final Object defaultValue;
    /**
     * The human-readable name of the parameter, unique within the form.
     * 
     */
    private final String displayName;
    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
     */
    private final String entityType;
    /**
     * Defines fill behavior for the parameter.
     * 
     */
    private final GoogleCloudDialogflowCxV3FormParameterFillBehaviorResponse fillBehavior;
    /**
     * Indicates whether the parameter represents a list of values.
     * 
     */
    private final Boolean isList;
    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    private final Boolean redact;
    /**
     * Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
     * 
     */
    private final Boolean required;

    @OutputCustomType.Constructor({"defaultValue","displayName","entityType","fillBehavior","isList","redact","required"})
    private GoogleCloudDialogflowCxV3FormParameterResponse(
        Object defaultValue,
        String displayName,
        String entityType,
        GoogleCloudDialogflowCxV3FormParameterFillBehaviorResponse fillBehavior,
        Boolean isList,
        Boolean redact,
        Boolean required) {
        this.defaultValue = Objects.requireNonNull(defaultValue);
        this.displayName = Objects.requireNonNull(displayName);
        this.entityType = Objects.requireNonNull(entityType);
        this.fillBehavior = Objects.requireNonNull(fillBehavior);
        this.isList = Objects.requireNonNull(isList);
        this.redact = Objects.requireNonNull(redact);
        this.required = Objects.requireNonNull(required);
    }

    /**
     * The default value of an optional parameter. If the parameter is required, the default value will be ignored.
     * 
    */
    public Object getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * The human-readable name of the parameter, unique within the form.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
    */
    public String getEntityType() {
        return this.entityType;
    }
    /**
     * Defines fill behavior for the parameter.
     * 
    */
    public GoogleCloudDialogflowCxV3FormParameterFillBehaviorResponse getFillBehavior() {
        return this.fillBehavior;
    }
    /**
     * Indicates whether the parameter represents a list of values.
     * 
    */
    public Boolean getIsList() {
        return this.isList;
    }
    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
    */
    public Boolean getRedact() {
        return this.redact;
    }
    /**
     * Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
     * 
    */
    public Boolean getRequired() {
        return this.required;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FormParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object defaultValue;
        private String displayName;
        private String entityType;
        private GoogleCloudDialogflowCxV3FormParameterFillBehaviorResponse fillBehavior;
        private Boolean isList;
        private Boolean redact;
        private Boolean required;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FormParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.fillBehavior = defaults.fillBehavior;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
    	      this.required = defaults.required;
        }

        public Builder setDefaultValue(Object defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEntityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }

        public Builder setFillBehavior(GoogleCloudDialogflowCxV3FormParameterFillBehaviorResponse fillBehavior) {
            this.fillBehavior = Objects.requireNonNull(fillBehavior);
            return this;
        }

        public Builder setIsList(Boolean isList) {
            this.isList = Objects.requireNonNull(isList);
            return this;
        }

        public Builder setRedact(Boolean redact) {
            this.redact = Objects.requireNonNull(redact);
            return this;
        }

        public Builder setRequired(Boolean required) {
            this.required = Objects.requireNonNull(required);
            return this;
        }
        public GoogleCloudDialogflowCxV3FormParameterResponse build() {
            return new GoogleCloudDialogflowCxV3FormParameterResponse(defaultValue, displayName, entityType, fillBehavior, isList, redact, required);
        }
    }
}

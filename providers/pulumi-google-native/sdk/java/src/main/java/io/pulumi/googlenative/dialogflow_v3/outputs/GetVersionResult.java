// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3NluSettingsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetVersionResult {
    /**
     * Create time of the version.
     * 
     */
    private final String createTime;
    /**
     * The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    private final String description;
    /**
     * The human-readable name of the version. Limit of 64 characters.
     * 
     */
    private final String displayName;
    /**
     * Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
     * 
     */
    private final String name;
    /**
     * The NLU settings of the flow at version creation.
     * 
     */
    private final GoogleCloudDialogflowCxV3NluSettingsResponse nluSettings;
    /**
     * The state of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"createTime","description","displayName","name","nluSettings","state"})
    private GetVersionResult(
        String createTime,
        String description,
        String displayName,
        String name,
        GoogleCloudDialogflowCxV3NluSettingsResponse nluSettings,
        String state) {
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
        this.nluSettings = Objects.requireNonNull(nluSettings);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * Create time of the version.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the version. Limit of 64 characters.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The NLU settings of the flow at version creation.
     * 
    */
    public GoogleCloudDialogflowCxV3NluSettingsResponse getNluSettings() {
        return this.nluSettings;
    }
    /**
     * The state of this version. This field is read-only and cannot be set by create and update methods.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private String name;
        private GoogleCloudDialogflowCxV3NluSettingsResponse nluSettings;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.nluSettings = defaults.nluSettings;
    	      this.state = defaults.state;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNluSettings(GoogleCloudDialogflowCxV3NluSettingsResponse nluSettings) {
            this.nluSettings = Objects.requireNonNull(nluSettings);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetVersionResult build() {
            return new GetVersionResult(createTime, description, displayName, name, nluSettings, state);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3AdvancedSettingsResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetAgentResult {
    /**
     * Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     * 
     */
    private final GoogleCloudDialogflowCxV3AdvancedSettingsResponse advancedSettings;
    /**
     * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo) integration.
     * 
     */
    private final String avatarUri;
    /**
     * Immutable. The default language of the agent as a language tag. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
     * 
     */
    private final String defaultLanguageCode;
    /**
     * The description of the agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    private final String description;
    /**
     * The human-readable name of the agent, unique within the location.
     * 
     */
    private final String displayName;
    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    private final Boolean enableSpellCorrection;
    /**
     * Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings instead.
     * 
     */
    private final Boolean enableStackdriverLogging;
    /**
     * The unique identifier of the agent. Required for the Agents.UpdateAgent method. Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
     * 
     */
    private final String name;
    /**
     * Name of the SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    private final String securitySettings;
    /**
     * Speech recognition related settings.
     * 
     */
    private final GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse speechToTextSettings;
    /**
     * Immutable. Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: `projects//locations//agents//flows/`.
     * 
     */
    private final String startFlow;
    /**
     * The list of all languages supported by the agent (except for the `default_language_code`).
     * 
     */
    private final List<String> supportedLanguageCodes;
    /**
     * The time zone of the agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris.
     * 
     */
    private final String timeZone;

    @OutputCustomType.Constructor({"advancedSettings","avatarUri","defaultLanguageCode","description","displayName","enableSpellCorrection","enableStackdriverLogging","name","securitySettings","speechToTextSettings","startFlow","supportedLanguageCodes","timeZone"})
    private GetAgentResult(
        GoogleCloudDialogflowCxV3AdvancedSettingsResponse advancedSettings,
        String avatarUri,
        String defaultLanguageCode,
        String description,
        String displayName,
        Boolean enableSpellCorrection,
        Boolean enableStackdriverLogging,
        String name,
        String securitySettings,
        GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse speechToTextSettings,
        String startFlow,
        List<String> supportedLanguageCodes,
        String timeZone) {
        this.advancedSettings = Objects.requireNonNull(advancedSettings);
        this.avatarUri = Objects.requireNonNull(avatarUri);
        this.defaultLanguageCode = Objects.requireNonNull(defaultLanguageCode);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.enableSpellCorrection = Objects.requireNonNull(enableSpellCorrection);
        this.enableStackdriverLogging = Objects.requireNonNull(enableStackdriverLogging);
        this.name = Objects.requireNonNull(name);
        this.securitySettings = Objects.requireNonNull(securitySettings);
        this.speechToTextSettings = Objects.requireNonNull(speechToTextSettings);
        this.startFlow = Objects.requireNonNull(startFlow);
        this.supportedLanguageCodes = Objects.requireNonNull(supportedLanguageCodes);
        this.timeZone = Objects.requireNonNull(timeZone);
    }

    /**
     * Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     * 
    */
    public GoogleCloudDialogflowCxV3AdvancedSettingsResponse getAdvancedSettings() {
        return this.advancedSettings;
    }
    /**
     * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo) integration.
     * 
    */
    public String getAvatarUri() {
        return this.avatarUri;
    }
    /**
     * Immutable. The default language of the agent as a language tag. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
     * 
    */
    public String getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }
    /**
     * The description of the agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the agent, unique within the location.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
    */
    public Boolean getEnableSpellCorrection() {
        return this.enableSpellCorrection;
    }
    /**
     * Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings instead.
     * 
    */
    public Boolean getEnableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }
    /**
     * The unique identifier of the agent. Required for the Agents.UpdateAgent method. Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Name of the SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
    */
    public String getSecuritySettings() {
        return this.securitySettings;
    }
    /**
     * Speech recognition related settings.
     * 
    */
    public GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse getSpeechToTextSettings() {
        return this.speechToTextSettings;
    }
    /**
     * Immutable. Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: `projects//locations//agents//flows/`.
     * 
    */
    public String getStartFlow() {
        return this.startFlow;
    }
    /**
     * The list of all languages supported by the agent (except for the `default_language_code`).
     * 
    */
    public List<String> getSupportedLanguageCodes() {
        return this.supportedLanguageCodes;
    }
    /**
     * The time zone of the agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris.
     * 
    */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAgentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3AdvancedSettingsResponse advancedSettings;
        private String avatarUri;
        private String defaultLanguageCode;
        private String description;
        private String displayName;
        private Boolean enableSpellCorrection;
        private Boolean enableStackdriverLogging;
        private String name;
        private String securitySettings;
        private GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse speechToTextSettings;
        private String startFlow;
        private List<String> supportedLanguageCodes;
        private String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAgentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedSettings = defaults.advancedSettings;
    	      this.avatarUri = defaults.avatarUri;
    	      this.defaultLanguageCode = defaults.defaultLanguageCode;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enableSpellCorrection = defaults.enableSpellCorrection;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
    	      this.name = defaults.name;
    	      this.securitySettings = defaults.securitySettings;
    	      this.speechToTextSettings = defaults.speechToTextSettings;
    	      this.startFlow = defaults.startFlow;
    	      this.supportedLanguageCodes = defaults.supportedLanguageCodes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setAdvancedSettings(GoogleCloudDialogflowCxV3AdvancedSettingsResponse advancedSettings) {
            this.advancedSettings = Objects.requireNonNull(advancedSettings);
            return this;
        }

        public Builder setAvatarUri(String avatarUri) {
            this.avatarUri = Objects.requireNonNull(avatarUri);
            return this;
        }

        public Builder setDefaultLanguageCode(String defaultLanguageCode) {
            this.defaultLanguageCode = Objects.requireNonNull(defaultLanguageCode);
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

        public Builder setEnableSpellCorrection(Boolean enableSpellCorrection) {
            this.enableSpellCorrection = Objects.requireNonNull(enableSpellCorrection);
            return this;
        }

        public Builder setEnableStackdriverLogging(Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Objects.requireNonNull(enableStackdriverLogging);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecuritySettings(String securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }

        public Builder setSpeechToTextSettings(GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse speechToTextSettings) {
            this.speechToTextSettings = Objects.requireNonNull(speechToTextSettings);
            return this;
        }

        public Builder setStartFlow(String startFlow) {
            this.startFlow = Objects.requireNonNull(startFlow);
            return this;
        }

        public Builder setSupportedLanguageCodes(List<String> supportedLanguageCodes) {
            this.supportedLanguageCodes = Objects.requireNonNull(supportedLanguageCodes);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public GetAgentResult build() {
            return new GetAgentResult(advancedSettings, avatarUri, defaultLanguageCode, description, displayName, enableSpellCorrection, enableStackdriverLogging, name, securitySettings, speechToTextSettings, startFlow, supportedLanguageCodes, timeZone);
        }
    }
}

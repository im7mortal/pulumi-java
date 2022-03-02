// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AlexaChannelPropertiesResponse {
    /**
     * The Alexa skill Id
     * 
     */
    private final String alexaSkillId;
    /**
     * Whether this channel is enabled for the bot
     * 
     */
    private final Boolean isEnabled;
    /**
     * Full Uri used to configured the skill in Alexa
     * 
     */
    private final String serviceEndpointUri;
    /**
     * Url fragment used in part of the Uri configured in Alexa
     * 
     */
    private final String urlFragment;

    @OutputCustomType.Constructor({"alexaSkillId","isEnabled","serviceEndpointUri","urlFragment"})
    private AlexaChannelPropertiesResponse(
        String alexaSkillId,
        Boolean isEnabled,
        String serviceEndpointUri,
        String urlFragment) {
        this.alexaSkillId = Objects.requireNonNull(alexaSkillId);
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.serviceEndpointUri = Objects.requireNonNull(serviceEndpointUri);
        this.urlFragment = Objects.requireNonNull(urlFragment);
    }

    /**
     * The Alexa skill Id
     * 
    */
    public String getAlexaSkillId() {
        return this.alexaSkillId;
    }
    /**
     * Whether this channel is enabled for the bot
     * 
    */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Full Uri used to configured the skill in Alexa
     * 
    */
    public String getServiceEndpointUri() {
        return this.serviceEndpointUri;
    }
    /**
     * Url fragment used in part of the Uri configured in Alexa
     * 
    */
    public String getUrlFragment() {
        return this.urlFragment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlexaChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alexaSkillId;
        private Boolean isEnabled;
        private String serviceEndpointUri;
        private String urlFragment;

        public Builder() {
    	      // Empty
        }

        public Builder(AlexaChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alexaSkillId = defaults.alexaSkillId;
    	      this.isEnabled = defaults.isEnabled;
    	      this.serviceEndpointUri = defaults.serviceEndpointUri;
    	      this.urlFragment = defaults.urlFragment;
        }

        public Builder setAlexaSkillId(String alexaSkillId) {
            this.alexaSkillId = Objects.requireNonNull(alexaSkillId);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setServiceEndpointUri(String serviceEndpointUri) {
            this.serviceEndpointUri = Objects.requireNonNull(serviceEndpointUri);
            return this;
        }

        public Builder setUrlFragment(String urlFragment) {
            this.urlFragment = Objects.requireNonNull(urlFragment);
            return this;
        }
        public AlexaChannelPropertiesResponse build() {
            return new AlexaChannelPropertiesResponse(alexaSkillId, isEnabled, serviceEndpointUri, urlFragment);
        }
    }
}

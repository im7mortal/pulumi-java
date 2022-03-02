// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VoiceConnectorGroupConnector {
    /**
     * The priority associated with the Amazon Chime Voice Connector, with 1 being the highest priority. Higher priority Amazon Chime Voice Connectors are attempted first.
     * 
     */
    private final Integer priority;
    /**
     * The Amazon Chime Voice Connector ID.
     * 
     */
    private final String voiceConnectorId;

    @OutputCustomType.Constructor({"priority","voiceConnectorId"})
    private VoiceConnectorGroupConnector(
        Integer priority,
        String voiceConnectorId) {
        this.priority = Objects.requireNonNull(priority);
        this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId);
    }

    /**
     * The priority associated with the Amazon Chime Voice Connector, with 1 being the highest priority. Higher priority Amazon Chime Voice Connectors are attempted first.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The Amazon Chime Voice Connector ID.
     * 
    */
    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorGroupConnector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private String voiceConnectorId;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorGroupConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.voiceConnectorId = defaults.voiceConnectorId;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setVoiceConnectorId(String voiceConnectorId) {
            this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId);
            return this;
        }
        public VoiceConnectorGroupConnector build() {
            return new VoiceConnectorGroupConnector(priority, voiceConnectorId);
        }
    }
}

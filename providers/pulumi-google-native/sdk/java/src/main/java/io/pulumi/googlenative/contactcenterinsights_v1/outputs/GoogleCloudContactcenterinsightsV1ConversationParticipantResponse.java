// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1ConversationParticipantResponse {
    /**
     * The name of the participant provided by Dialogflow. Format: projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
     * 
     */
    private final String dialogflowParticipantName;
    /**
     * Obfuscated user ID from Dialogflow.
     * 
     */
    private final String obfuscatedExternalUserId;
    /**
     * The role of the participant.
     * 
     */
    private final String role;
    /**
     * A user-specified ID representing the participant.
     * 
     */
    private final String userId;

    @OutputCustomType.Constructor({"dialogflowParticipantName","obfuscatedExternalUserId","role","userId"})
    private GoogleCloudContactcenterinsightsV1ConversationParticipantResponse(
        String dialogflowParticipantName,
        String obfuscatedExternalUserId,
        String role,
        String userId) {
        this.dialogflowParticipantName = Objects.requireNonNull(dialogflowParticipantName);
        this.obfuscatedExternalUserId = Objects.requireNonNull(obfuscatedExternalUserId);
        this.role = Objects.requireNonNull(role);
        this.userId = Objects.requireNonNull(userId);
    }

    /**
     * The name of the participant provided by Dialogflow. Format: projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
     * 
    */
    public String getDialogflowParticipantName() {
        return this.dialogflowParticipantName;
    }
    /**
     * Obfuscated user ID from Dialogflow.
     * 
    */
    public String getObfuscatedExternalUserId() {
        return this.obfuscatedExternalUserId;
    }
    /**
     * The role of the participant.
     * 
    */
    public String getRole() {
        return this.role;
    }
    /**
     * A user-specified ID representing the participant.
     * 
    */
    public String getUserId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationParticipantResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dialogflowParticipantName;
        private String obfuscatedExternalUserId;
        private String role;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationParticipantResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dialogflowParticipantName = defaults.dialogflowParticipantName;
    	      this.obfuscatedExternalUserId = defaults.obfuscatedExternalUserId;
    	      this.role = defaults.role;
    	      this.userId = defaults.userId;
        }

        public Builder setDialogflowParticipantName(String dialogflowParticipantName) {
            this.dialogflowParticipantName = Objects.requireNonNull(dialogflowParticipantName);
            return this;
        }

        public Builder setObfuscatedExternalUserId(String obfuscatedExternalUserId) {
            this.obfuscatedExternalUserId = Objects.requireNonNull(obfuscatedExternalUserId);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1ConversationParticipantResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationParticipantResponse(dialogflowParticipantName, obfuscatedExternalUserId, role, userId);
        }
    }
}

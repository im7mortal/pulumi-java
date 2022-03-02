// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1AnalysisResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetConversationResult {
    /**
     * An opaque, user-specified string representing the human agent who handled the conversation.
     * 
     */
    private final String agentId;
    /**
     * Call-specific metadata.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse callMetadata;
    /**
     * The time at which the conversation was created.
     * 
     */
    private final String createTime;
    /**
     * The source of the audio and transcription for the conversation.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse dataSource;
    /**
     * All the matched Dialogflow intents in the call. The key corresponds to a Dialogflow intent, format: projects/{project}/agent/{agent}/intents/{intent}
     * 
     */
    private final Map<String,String> dialogflowIntents;
    /**
     * The duration of the conversation.
     * 
     */
    private final String duration;
    /**
     * The time at which this conversation should expire. After this time, the conversation data and any associated analyses will be deleted.
     * 
     */
    private final String expireTime;
    /**
     * A map for the user to specify any custom fields. A maximum of 20 labels per conversation is allowed, with a maximum of 256 characters per entry.
     * 
     */
    private final Map<String,String> labels;
    /**
     * A user-specified language code for the conversation.
     * 
     */
    private final String languageCode;
    /**
     * The conversation's latest analysis, if one exists.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1AnalysisResponse latestAnalysis;
    /**
     * Immutable. The conversation medium, if unspecified will default to PHONE_CALL.
     * 
     */
    private final String medium;
    /**
     * Immutable. The resource name of the conversation. Format: projects/{project}/locations/{location}/conversations/{conversation}
     * 
     */
    private final String name;
    /**
     * Obfuscated user ID which the customer sent to us.
     * 
     */
    private final String obfuscatedUserId;
    /**
     * The annotations that were generated during the customer and agent interaction.
     * 
     */
    private final List<GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse> runtimeAnnotations;
    /**
     * The time at which the conversation started.
     * 
     */
    private final String startTime;
    /**
     * The conversation transcript.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse transcript;
    /**
     * Input only. The TTL for this resource. If specified, then this TTL will be used to calculate the expire time.
     * 
     */
    private final String ttl;
    /**
     * The number of turns in the conversation.
     * 
     */
    private final Integer turnCount;
    /**
     * The most recent time at which the conversation was updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"agentId","callMetadata","createTime","dataSource","dialogflowIntents","duration","expireTime","labels","languageCode","latestAnalysis","medium","name","obfuscatedUserId","runtimeAnnotations","startTime","transcript","ttl","turnCount","updateTime"})
    private GetConversationResult(
        String agentId,
        GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse callMetadata,
        String createTime,
        GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse dataSource,
        Map<String,String> dialogflowIntents,
        String duration,
        String expireTime,
        Map<String,String> labels,
        String languageCode,
        GoogleCloudContactcenterinsightsV1AnalysisResponse latestAnalysis,
        String medium,
        String name,
        String obfuscatedUserId,
        List<GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse> runtimeAnnotations,
        String startTime,
        GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse transcript,
        String ttl,
        Integer turnCount,
        String updateTime) {
        this.agentId = Objects.requireNonNull(agentId);
        this.callMetadata = Objects.requireNonNull(callMetadata);
        this.createTime = Objects.requireNonNull(createTime);
        this.dataSource = Objects.requireNonNull(dataSource);
        this.dialogflowIntents = Objects.requireNonNull(dialogflowIntents);
        this.duration = Objects.requireNonNull(duration);
        this.expireTime = Objects.requireNonNull(expireTime);
        this.labels = Objects.requireNonNull(labels);
        this.languageCode = Objects.requireNonNull(languageCode);
        this.latestAnalysis = Objects.requireNonNull(latestAnalysis);
        this.medium = Objects.requireNonNull(medium);
        this.name = Objects.requireNonNull(name);
        this.obfuscatedUserId = Objects.requireNonNull(obfuscatedUserId);
        this.runtimeAnnotations = Objects.requireNonNull(runtimeAnnotations);
        this.startTime = Objects.requireNonNull(startTime);
        this.transcript = Objects.requireNonNull(transcript);
        this.ttl = Objects.requireNonNull(ttl);
        this.turnCount = Objects.requireNonNull(turnCount);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * An opaque, user-specified string representing the human agent who handled the conversation.
     * 
    */
    public String getAgentId() {
        return this.agentId;
    }
    /**
     * Call-specific metadata.
     * 
    */
    public GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse getCallMetadata() {
        return this.callMetadata;
    }
    /**
     * The time at which the conversation was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The source of the audio and transcription for the conversation.
     * 
    */
    public GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse getDataSource() {
        return this.dataSource;
    }
    /**
     * All the matched Dialogflow intents in the call. The key corresponds to a Dialogflow intent, format: projects/{project}/agent/{agent}/intents/{intent}
     * 
    */
    public Map<String,String> getDialogflowIntents() {
        return this.dialogflowIntents;
    }
    /**
     * The duration of the conversation.
     * 
    */
    public String getDuration() {
        return this.duration;
    }
    /**
     * The time at which this conversation should expire. After this time, the conversation data and any associated analyses will be deleted.
     * 
    */
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * A map for the user to specify any custom fields. A maximum of 20 labels per conversation is allowed, with a maximum of 256 characters per entry.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * A user-specified language code for the conversation.
     * 
    */
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * The conversation's latest analysis, if one exists.
     * 
    */
    public GoogleCloudContactcenterinsightsV1AnalysisResponse getLatestAnalysis() {
        return this.latestAnalysis;
    }
    /**
     * Immutable. The conversation medium, if unspecified will default to PHONE_CALL.
     * 
    */
    public String getMedium() {
        return this.medium;
    }
    /**
     * Immutable. The resource name of the conversation. Format: projects/{project}/locations/{location}/conversations/{conversation}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Obfuscated user ID which the customer sent to us.
     * 
    */
    public String getObfuscatedUserId() {
        return this.obfuscatedUserId;
    }
    /**
     * The annotations that were generated during the customer and agent interaction.
     * 
    */
    public List<GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse> getRuntimeAnnotations() {
        return this.runtimeAnnotations;
    }
    /**
     * The time at which the conversation started.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The conversation transcript.
     * 
    */
    public GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse getTranscript() {
        return this.transcript;
    }
    /**
     * Input only. The TTL for this resource. If specified, then this TTL will be used to calculate the expire time.
     * 
    */
    public String getTtl() {
        return this.ttl;
    }
    /**
     * The number of turns in the conversation.
     * 
    */
    public Integer getTurnCount() {
        return this.turnCount;
    }
    /**
     * The most recent time at which the conversation was updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConversationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse callMetadata;
        private String createTime;
        private GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse dataSource;
        private Map<String,String> dialogflowIntents;
        private String duration;
        private String expireTime;
        private Map<String,String> labels;
        private String languageCode;
        private GoogleCloudContactcenterinsightsV1AnalysisResponse latestAnalysis;
        private String medium;
        private String name;
        private String obfuscatedUserId;
        private List<GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse> runtimeAnnotations;
        private String startTime;
        private GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse transcript;
        private String ttl;
        private Integer turnCount;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConversationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.callMetadata = defaults.callMetadata;
    	      this.createTime = defaults.createTime;
    	      this.dataSource = defaults.dataSource;
    	      this.dialogflowIntents = defaults.dialogflowIntents;
    	      this.duration = defaults.duration;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.languageCode = defaults.languageCode;
    	      this.latestAnalysis = defaults.latestAnalysis;
    	      this.medium = defaults.medium;
    	      this.name = defaults.name;
    	      this.obfuscatedUserId = defaults.obfuscatedUserId;
    	      this.runtimeAnnotations = defaults.runtimeAnnotations;
    	      this.startTime = defaults.startTime;
    	      this.transcript = defaults.transcript;
    	      this.ttl = defaults.ttl;
    	      this.turnCount = defaults.turnCount;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setAgentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder setCallMetadata(GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse callMetadata) {
            this.callMetadata = Objects.requireNonNull(callMetadata);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDataSource(GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }

        public Builder setDialogflowIntents(Map<String,String> dialogflowIntents) {
            this.dialogflowIntents = Objects.requireNonNull(dialogflowIntents);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLanguageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder setLatestAnalysis(GoogleCloudContactcenterinsightsV1AnalysisResponse latestAnalysis) {
            this.latestAnalysis = Objects.requireNonNull(latestAnalysis);
            return this;
        }

        public Builder setMedium(String medium) {
            this.medium = Objects.requireNonNull(medium);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setObfuscatedUserId(String obfuscatedUserId) {
            this.obfuscatedUserId = Objects.requireNonNull(obfuscatedUserId);
            return this;
        }

        public Builder setRuntimeAnnotations(List<GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse> runtimeAnnotations) {
            this.runtimeAnnotations = Objects.requireNonNull(runtimeAnnotations);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTranscript(GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse transcript) {
            this.transcript = Objects.requireNonNull(transcript);
            return this;
        }

        public Builder setTtl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public Builder setTurnCount(Integer turnCount) {
            this.turnCount = Objects.requireNonNull(turnCount);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetConversationResult build() {
            return new GetConversationResult(agentId, callMetadata, createTime, dataSource, dialogflowIntents, duration, expireTime, labels, languageCode, latestAnalysis, medium, name, obfuscatedUserId, runtimeAnnotations, startTime, transcript, ttl, turnCount, updateTime);
        }
    }
}

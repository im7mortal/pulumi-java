// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse {
    /**
     * The piece of text from the `source` knowledge base document.
     * 
     */
    private final String answer;
    /**
     * The system's confidence score that this answer is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    private final Double confidenceScore;
    /**
     * Map that contains metadata about the FAQ answer and the document that it originates from.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}.
     * 
     */
    private final String queryRecord;
    /**
     * The corresponding FAQ question.
     * 
     */
    private final String question;
    /**
     * The knowledge document that this answer was extracted from. Format: projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}.
     * 
     */
    private final String source;

    @OutputCustomType.Constructor({"answer","confidenceScore","metadata","queryRecord","question","source"})
    private GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse(
        String answer,
        Double confidenceScore,
        Map<String,String> metadata,
        String queryRecord,
        String question,
        String source) {
        this.answer = Objects.requireNonNull(answer);
        this.confidenceScore = Objects.requireNonNull(confidenceScore);
        this.metadata = Objects.requireNonNull(metadata);
        this.queryRecord = Objects.requireNonNull(queryRecord);
        this.question = Objects.requireNonNull(question);
        this.source = Objects.requireNonNull(source);
    }

    /**
     * The piece of text from the `source` knowledge base document.
     * 
    */
    public String getAnswer() {
        return this.answer;
    }
    /**
     * The system's confidence score that this answer is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
    */
    public Double getConfidenceScore() {
        return this.confidenceScore;
    }
    /**
     * Map that contains metadata about the FAQ answer and the document that it originates from.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}.
     * 
    */
    public String getQueryRecord() {
        return this.queryRecord;
    }
    /**
     * The corresponding FAQ question.
     * 
    */
    public String getQuestion() {
        return this.question;
    }
    /**
     * The knowledge document that this answer was extracted from. Format: projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}.
     * 
    */
    public String getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String answer;
        private Double confidenceScore;
        private Map<String,String> metadata;
        private String queryRecord;
        private String question;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.answer = defaults.answer;
    	      this.confidenceScore = defaults.confidenceScore;
    	      this.metadata = defaults.metadata;
    	      this.queryRecord = defaults.queryRecord;
    	      this.question = defaults.question;
    	      this.source = defaults.source;
        }

        public Builder setAnswer(String answer) {
            this.answer = Objects.requireNonNull(answer);
            return this;
        }

        public Builder setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = Objects.requireNonNull(confidenceScore);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setQueryRecord(String queryRecord) {
            this.queryRecord = Objects.requireNonNull(queryRecord);
            return this;
        }

        public Builder setQuestion(String question) {
            this.question = Objects.requireNonNull(question);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse(answer, confidenceScore, metadata, queryRecord, question, source);
        }
    }
}

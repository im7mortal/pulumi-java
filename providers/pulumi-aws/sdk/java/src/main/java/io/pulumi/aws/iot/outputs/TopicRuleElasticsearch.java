// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TopicRuleElasticsearch {
    /**
     * The endpoint of your Elasticsearch domain.
     * 
     */
    private final String endpoint;
    /**
     * The unique identifier for the document you are storing.
     * 
     */
    private final String id;
    /**
     * The Elasticsearch index where you want to store your data.
     * 
     */
    private final String index;
    /**
     * The IAM role ARN that has access to Elasticsearch.
     * 
     */
    private final String roleArn;
    /**
     * The type of document you are storing.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"endpoint","id","index","roleArn","type"})
    private TopicRuleElasticsearch(
        String endpoint,
        String id,
        String index,
        String roleArn,
        String type) {
        this.endpoint = Objects.requireNonNull(endpoint);
        this.id = Objects.requireNonNull(id);
        this.index = Objects.requireNonNull(index);
        this.roleArn = Objects.requireNonNull(roleArn);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The endpoint of your Elasticsearch domain.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The unique identifier for the document you are storing.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The Elasticsearch index where you want to store your data.
     * 
    */
    public String getIndex() {
        return this.index;
    }
    /**
     * The IAM role ARN that has access to Elasticsearch.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The type of document you are storing.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleElasticsearch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String id;
        private String index;
        private String roleArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleElasticsearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.index = defaults.index;
    	      this.roleArn = defaults.roleArn;
    	      this.type = defaults.type;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIndex(String index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TopicRuleElasticsearch build() {
            return new TopicRuleElasticsearch(endpoint, id, index, roleArn, type);
        }
    }
}

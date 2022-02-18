// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleKafkaActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleKafkaActionArgs Empty = new TopicRuleKafkaActionArgs();

    @InputImport(name="clientProperties", required=true)
    private final Input<Object> clientProperties;

    public Input<Object> getClientProperties() {
        return this.clientProperties;
    }

    @InputImport(name="destinationArn", required=true)
    private final Input<String> destinationArn;

    public Input<String> getDestinationArn() {
        return this.destinationArn;
    }

    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    @InputImport(name="partition")
    private final @Nullable Input<String> partition;

    public Input<String> getPartition() {
        return this.partition == null ? Input.empty() : this.partition;
    }

    @InputImport(name="topic", required=true)
    private final Input<String> topic;

    public Input<String> getTopic() {
        return this.topic;
    }

    public TopicRuleKafkaActionArgs(
        Input<Object> clientProperties,
        Input<String> destinationArn,
        @Nullable Input<String> key,
        @Nullable Input<String> partition,
        Input<String> topic) {
        this.clientProperties = Objects.requireNonNull(clientProperties, "expected parameter 'clientProperties' to be non-null");
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
        this.key = key;
        this.partition = partition;
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private TopicRuleKafkaActionArgs() {
        this.clientProperties = Input.empty();
        this.destinationArn = Input.empty();
        this.key = Input.empty();
        this.partition = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleKafkaActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> clientProperties;
        private Input<String> destinationArn;
        private @Nullable Input<String> key;
        private @Nullable Input<String> partition;
        private Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleKafkaActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientProperties = defaults.clientProperties;
    	      this.destinationArn = defaults.destinationArn;
    	      this.key = defaults.key;
    	      this.partition = defaults.partition;
    	      this.topic = defaults.topic;
        }

        public Builder setClientProperties(Input<Object> clientProperties) {
            this.clientProperties = Objects.requireNonNull(clientProperties);
            return this;
        }

        public Builder setClientProperties(Object clientProperties) {
            this.clientProperties = Input.of(Objects.requireNonNull(clientProperties));
            return this;
        }

        public Builder setDestinationArn(Input<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }

        public Builder setDestinationArn(String destinationArn) {
            this.destinationArn = Input.of(Objects.requireNonNull(destinationArn));
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setPartition(@Nullable Input<String> partition) {
            this.partition = partition;
            return this;
        }

        public Builder setPartition(@Nullable String partition) {
            this.partition = Input.ofNullable(partition);
            return this;
        }

        public Builder setTopic(Input<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Input.of(Objects.requireNonNull(topic));
            return this;
        }

        public TopicRuleKafkaActionArgs build() {
            return new TopicRuleKafkaActionArgs(clientProperties, destinationArn, key, partition, topic);
        }
    }
}
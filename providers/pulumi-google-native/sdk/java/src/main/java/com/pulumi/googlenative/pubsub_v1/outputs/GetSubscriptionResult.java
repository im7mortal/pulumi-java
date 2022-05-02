// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.pubsub_v1.outputs.DeadLetterPolicyResponse;
import com.pulumi.googlenative.pubsub_v1.outputs.ExpirationPolicyResponse;
import com.pulumi.googlenative.pubsub_v1.outputs.PushConfigResponse;
import com.pulumi.googlenative.pubsub_v1.outputs.RetryPolicyResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSubscriptionResult {
    /**
     * @return The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
     * 
     */
    private final Integer ackDeadlineSeconds;
    /**
     * @return A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service account associated with this subscriptions&#39;s parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on this subscription.
     * 
     */
    private final DeadLetterPolicyResponse deadLetterPolicy;
    /**
     * @return Indicates whether the subscription is detached from its topic. Detached subscriptions don&#39;t receive messages from their topic and don&#39;t retain any backlog. `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
     * 
     */
    private final Boolean detached;
    /**
     * @return If true, Pub/Sub provides the following guarantees for the delivery of a message with a given value of `message_id` on this subscription: * The message sent to a subscriber is guaranteed not to be resent before the message&#39;s acknowledgement deadline expires. * An acknowledged message will not be resent to a subscriber. Note that subscribers may still receive multiple copies of a message when `enable_exactly_once_delivery` is true if the message was published multiple times by a publisher client. These copies are considered distinct by Pub/Sub and have distinct `message_id` values.
     * 
     */
    private final Boolean enableExactlyOnceDelivery;
    /**
     * @return If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they may be delivered in any order.
     * 
     */
    private final Boolean enableMessageOrdering;
    /**
     * @return A policy that specifies the conditions for this subscription&#39;s expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but `expiration_policy.ttl` is not set, the subscription never expires.
     * 
     */
    private final ExpirationPolicyResponse expirationPolicy;
    /**
     * @return An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the filter are delivered on this subscription. If empty, then no messages are filtered out.
     * 
     */
    private final String filter;
    /**
     * @return See Creating and managing labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return How long to retain unacknowledged messages in the subscription&#39;s backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
     * 
     */
    private final String messageRetentionDuration;
    /**
     * @return The name of the subscription. It must have the format `&#34;projects/{project}/subscriptions/{subscription}&#34;`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    private final String name;
    /**
     * @return If push delivery is used with this subscription, this field is used to configure it. At most one of `pushConfig` and `bigQueryConfig` can be set. If both are empty, then the subscriber will pull and ack messages using API methods.
     * 
     */
    private final PushConfigResponse pushConfig;
    /**
     * @return Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription&#39;s backlog, even if they are acknowledged, until they fall out of the `message_retention_duration` window. This must be true if you would like to [`Seek` to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to replay previously-acknowledged messages.
     * 
     */
    private final Boolean retainAckedMessages;
    /**
     * @return A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
     * 
     */
    private final RetryPolicyResponse retryPolicy;
    /**
     * @return An output-only field indicating whether or not the subscription can receive messages.
     * 
     */
    private final String state;
    /**
     * @return The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    private final String topic;
    /**
     * @return Indicates the minimum duration for which a message is retained after it is published to the subscription&#39;s topic. If this field is set, messages published to the subscription&#39;s topic in the last `topic_message_retention_duration` are always available to subscribers. See the `message_retention_duration` field in `Topic`. This field is set only in responses from the server; it is ignored if it is set in any requests.
     * 
     */
    private final String topicMessageRetentionDuration;

    @CustomType.Constructor
    private GetSubscriptionResult(
        @CustomType.Parameter("ackDeadlineSeconds") Integer ackDeadlineSeconds,
        @CustomType.Parameter("deadLetterPolicy") DeadLetterPolicyResponse deadLetterPolicy,
        @CustomType.Parameter("detached") Boolean detached,
        @CustomType.Parameter("enableExactlyOnceDelivery") Boolean enableExactlyOnceDelivery,
        @CustomType.Parameter("enableMessageOrdering") Boolean enableMessageOrdering,
        @CustomType.Parameter("expirationPolicy") ExpirationPolicyResponse expirationPolicy,
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("messageRetentionDuration") String messageRetentionDuration,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pushConfig") PushConfigResponse pushConfig,
        @CustomType.Parameter("retainAckedMessages") Boolean retainAckedMessages,
        @CustomType.Parameter("retryPolicy") RetryPolicyResponse retryPolicy,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("topic") String topic,
        @CustomType.Parameter("topicMessageRetentionDuration") String topicMessageRetentionDuration) {
        this.ackDeadlineSeconds = ackDeadlineSeconds;
        this.deadLetterPolicy = deadLetterPolicy;
        this.detached = detached;
        this.enableExactlyOnceDelivery = enableExactlyOnceDelivery;
        this.enableMessageOrdering = enableMessageOrdering;
        this.expirationPolicy = expirationPolicy;
        this.filter = filter;
        this.labels = labels;
        this.messageRetentionDuration = messageRetentionDuration;
        this.name = name;
        this.pushConfig = pushConfig;
        this.retainAckedMessages = retainAckedMessages;
        this.retryPolicy = retryPolicy;
        this.state = state;
        this.topic = topic;
        this.topicMessageRetentionDuration = topicMessageRetentionDuration;
    }

    /**
     * @return The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
     * 
     */
    public Integer ackDeadlineSeconds() {
        return this.ackDeadlineSeconds;
    }
    /**
     * @return A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service account associated with this subscriptions&#39;s parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on this subscription.
     * 
     */
    public DeadLetterPolicyResponse deadLetterPolicy() {
        return this.deadLetterPolicy;
    }
    /**
     * @return Indicates whether the subscription is detached from its topic. Detached subscriptions don&#39;t receive messages from their topic and don&#39;t retain any backlog. `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
     * 
     */
    public Boolean detached() {
        return this.detached;
    }
    /**
     * @return If true, Pub/Sub provides the following guarantees for the delivery of a message with a given value of `message_id` on this subscription: * The message sent to a subscriber is guaranteed not to be resent before the message&#39;s acknowledgement deadline expires. * An acknowledged message will not be resent to a subscriber. Note that subscribers may still receive multiple copies of a message when `enable_exactly_once_delivery` is true if the message was published multiple times by a publisher client. These copies are considered distinct by Pub/Sub and have distinct `message_id` values.
     * 
     */
    public Boolean enableExactlyOnceDelivery() {
        return this.enableExactlyOnceDelivery;
    }
    /**
     * @return If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they may be delivered in any order.
     * 
     */
    public Boolean enableMessageOrdering() {
        return this.enableMessageOrdering;
    }
    /**
     * @return A policy that specifies the conditions for this subscription&#39;s expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but `expiration_policy.ttl` is not set, the subscription never expires.
     * 
     */
    public ExpirationPolicyResponse expirationPolicy() {
        return this.expirationPolicy;
    }
    /**
     * @return An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the filter are delivered on this subscription. If empty, then no messages are filtered out.
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return See Creating and managing labels.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return How long to retain unacknowledged messages in the subscription&#39;s backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
     * 
     */
    public String messageRetentionDuration() {
        return this.messageRetentionDuration;
    }
    /**
     * @return The name of the subscription. It must have the format `&#34;projects/{project}/subscriptions/{subscription}&#34;`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return If push delivery is used with this subscription, this field is used to configure it. At most one of `pushConfig` and `bigQueryConfig` can be set. If both are empty, then the subscriber will pull and ack messages using API methods.
     * 
     */
    public PushConfigResponse pushConfig() {
        return this.pushConfig;
    }
    /**
     * @return Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription&#39;s backlog, even if they are acknowledged, until they fall out of the `message_retention_duration` window. This must be true if you would like to [`Seek` to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to replay previously-acknowledged messages.
     * 
     */
    public Boolean retainAckedMessages() {
        return this.retainAckedMessages;
    }
    /**
     * @return A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
     * 
     */
    public RetryPolicyResponse retryPolicy() {
        return this.retryPolicy;
    }
    /**
     * @return An output-only field indicating whether or not the subscription can receive messages.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    public String topic() {
        return this.topic;
    }
    /**
     * @return Indicates the minimum duration for which a message is retained after it is published to the subscription&#39;s topic. If this field is set, messages published to the subscription&#39;s topic in the last `topic_message_retention_duration` are always available to subscribers. See the `message_retention_duration` field in `Topic`. This field is set only in responses from the server; it is ignored if it is set in any requests.
     * 
     */
    public String topicMessageRetentionDuration() {
        return this.topicMessageRetentionDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer ackDeadlineSeconds;
        private DeadLetterPolicyResponse deadLetterPolicy;
        private Boolean detached;
        private Boolean enableExactlyOnceDelivery;
        private Boolean enableMessageOrdering;
        private ExpirationPolicyResponse expirationPolicy;
        private String filter;
        private Map<String,String> labels;
        private String messageRetentionDuration;
        private String name;
        private PushConfigResponse pushConfig;
        private Boolean retainAckedMessages;
        private RetryPolicyResponse retryPolicy;
        private String state;
        private String topic;
        private String topicMessageRetentionDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ackDeadlineSeconds = defaults.ackDeadlineSeconds;
    	      this.deadLetterPolicy = defaults.deadLetterPolicy;
    	      this.detached = defaults.detached;
    	      this.enableExactlyOnceDelivery = defaults.enableExactlyOnceDelivery;
    	      this.enableMessageOrdering = defaults.enableMessageOrdering;
    	      this.expirationPolicy = defaults.expirationPolicy;
    	      this.filter = defaults.filter;
    	      this.labels = defaults.labels;
    	      this.messageRetentionDuration = defaults.messageRetentionDuration;
    	      this.name = defaults.name;
    	      this.pushConfig = defaults.pushConfig;
    	      this.retainAckedMessages = defaults.retainAckedMessages;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.state = defaults.state;
    	      this.topic = defaults.topic;
    	      this.topicMessageRetentionDuration = defaults.topicMessageRetentionDuration;
        }

        public Builder ackDeadlineSeconds(Integer ackDeadlineSeconds) {
            this.ackDeadlineSeconds = Objects.requireNonNull(ackDeadlineSeconds);
            return this;
        }
        public Builder deadLetterPolicy(DeadLetterPolicyResponse deadLetterPolicy) {
            this.deadLetterPolicy = Objects.requireNonNull(deadLetterPolicy);
            return this;
        }
        public Builder detached(Boolean detached) {
            this.detached = Objects.requireNonNull(detached);
            return this;
        }
        public Builder enableExactlyOnceDelivery(Boolean enableExactlyOnceDelivery) {
            this.enableExactlyOnceDelivery = Objects.requireNonNull(enableExactlyOnceDelivery);
            return this;
        }
        public Builder enableMessageOrdering(Boolean enableMessageOrdering) {
            this.enableMessageOrdering = Objects.requireNonNull(enableMessageOrdering);
            return this;
        }
        public Builder expirationPolicy(ExpirationPolicyResponse expirationPolicy) {
            this.expirationPolicy = Objects.requireNonNull(expirationPolicy);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder messageRetentionDuration(String messageRetentionDuration) {
            this.messageRetentionDuration = Objects.requireNonNull(messageRetentionDuration);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pushConfig(PushConfigResponse pushConfig) {
            this.pushConfig = Objects.requireNonNull(pushConfig);
            return this;
        }
        public Builder retainAckedMessages(Boolean retainAckedMessages) {
            this.retainAckedMessages = Objects.requireNonNull(retainAckedMessages);
            return this;
        }
        public Builder retryPolicy(RetryPolicyResponse retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public Builder topicMessageRetentionDuration(String topicMessageRetentionDuration) {
            this.topicMessageRetentionDuration = Objects.requireNonNull(topicMessageRetentionDuration);
            return this;
        }        public GetSubscriptionResult build() {
            return new GetSubscriptionResult(ackDeadlineSeconds, deadLetterPolicy, detached, enableExactlyOnceDelivery, enableMessageOrdering, expirationPolicy, filter, labels, messageRetentionDuration, name, pushConfig, retainAckedMessages, retryPolicy, state, topic, topicMessageRetentionDuration);
        }
    }
}

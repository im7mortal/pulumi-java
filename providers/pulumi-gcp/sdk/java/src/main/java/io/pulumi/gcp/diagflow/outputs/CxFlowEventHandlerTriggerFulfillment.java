// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.diagflow.outputs.CxFlowEventHandlerTriggerFulfillmentMessage;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxFlowEventHandlerTriggerFulfillment {
    /**
     * The list of rich message responses to present to the user.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CxFlowEventHandlerTriggerFulfillmentMessage> messages;
    /**
     * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    private final @Nullable Boolean returnPartialResponses;
    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
     * 
     */
    private final @Nullable String tag;
    /**
     * The webhook to call. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/webhooks/<Webhook ID>.
     * 
     */
    private final @Nullable String webhook;

    @OutputCustomType.Constructor({"messages","returnPartialResponses","tag","webhook"})
    private CxFlowEventHandlerTriggerFulfillment(
        @Nullable List<CxFlowEventHandlerTriggerFulfillmentMessage> messages,
        @Nullable Boolean returnPartialResponses,
        @Nullable String tag,
        @Nullable String webhook) {
        this.messages = messages;
        this.returnPartialResponses = returnPartialResponses;
        this.tag = tag;
        this.webhook = webhook;
    }

    /**
     * The list of rich message responses to present to the user.
     * Structure is documented below.
     * 
    */
    public List<CxFlowEventHandlerTriggerFulfillmentMessage> getMessages() {
        return this.messages == null ? List.of() : this.messages;
    }
    /**
     * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
    */
    public Optional<Boolean> getReturnPartialResponses() {
        return Optional.ofNullable(this.returnPartialResponses);
    }
    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
     * 
    */
    public Optional<String> getTag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * The webhook to call. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/webhooks/<Webhook ID>.
     * 
    */
    public Optional<String> getWebhook() {
        return Optional.ofNullable(this.webhook);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowEventHandlerTriggerFulfillment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CxFlowEventHandlerTriggerFulfillmentMessage> messages;
        private @Nullable Boolean returnPartialResponses;
        private @Nullable String tag;
        private @Nullable String webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowEventHandlerTriggerFulfillment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder setMessages(@Nullable List<CxFlowEventHandlerTriggerFulfillmentMessage> messages) {
            this.messages = messages;
            return this;
        }

        public Builder setReturnPartialResponses(@Nullable Boolean returnPartialResponses) {
            this.returnPartialResponses = returnPartialResponses;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }

        public Builder setWebhook(@Nullable String webhook) {
            this.webhook = webhook;
            return this;
        }
        public CxFlowEventHandlerTriggerFulfillment build() {
            return new CxFlowEventHandlerTriggerFulfillment(messages, returnPartialResponses, tag, webhook);
        }
    }
}

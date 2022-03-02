// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EventHandlerResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse {
    /**
     * The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1FulfillmentResponse initialPromptFulfillment;
    /**
     * The handlers for parameter-level events, used to provide reprompt for the parameter or transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys.no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first prompt for the parameter. If the user's response does not fill the parameter, a no-match/no-input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys.no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys.no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on. A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following no-match/no-input events after all numbered no-match/no-input handlers for the parameter are consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the parameter values have been `invalidated` by webhook. For example, if the user's response fill the parameter, however the parameter was invalidated by webhook, the fulfillment associated with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If the event handler for the corresponding event can't be found on the parameter, `initial_prompt_fulfillment` will be re-prompted.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> repromptEventHandlers;

    @OutputCustomType.Constructor({"initialPromptFulfillment","repromptEventHandlers"})
    private GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse(
        GoogleCloudDialogflowCxV3beta1FulfillmentResponse initialPromptFulfillment,
        List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> repromptEventHandlers) {
        this.initialPromptFulfillment = Objects.requireNonNull(initialPromptFulfillment);
        this.repromptEventHandlers = Objects.requireNonNull(repromptEventHandlers);
    }

    /**
     * The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1FulfillmentResponse getInitialPromptFulfillment() {
        return this.initialPromptFulfillment;
    }
    /**
     * The handlers for parameter-level events, used to provide reprompt for the parameter or transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys.no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first prompt for the parameter. If the user's response does not fill the parameter, a no-match/no-input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys.no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys.no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on. A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following no-match/no-input events after all numbered no-match/no-input handlers for the parameter are consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the parameter values have been `invalidated` by webhook. For example, if the user's response fill the parameter, however the parameter was invalidated by webhook, the fulfillment associated with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If the event handler for the corresponding event can't be found on the parameter, `initial_prompt_fulfillment` will be re-prompted.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> getRepromptEventHandlers() {
        return this.repromptEventHandlers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1FulfillmentResponse initialPromptFulfillment;
        private List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> repromptEventHandlers;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialPromptFulfillment = defaults.initialPromptFulfillment;
    	      this.repromptEventHandlers = defaults.repromptEventHandlers;
        }

        public Builder setInitialPromptFulfillment(GoogleCloudDialogflowCxV3beta1FulfillmentResponse initialPromptFulfillment) {
            this.initialPromptFulfillment = Objects.requireNonNull(initialPromptFulfillment);
            return this;
        }

        public Builder setRepromptEventHandlers(List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> repromptEventHandlers) {
            this.repromptEventHandlers = Objects.requireNonNull(repromptEventHandlers);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse(initialPromptFulfillment, repromptEventHandlers);
        }
    }
}

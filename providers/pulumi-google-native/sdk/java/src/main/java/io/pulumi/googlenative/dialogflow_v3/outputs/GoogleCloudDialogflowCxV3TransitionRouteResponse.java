// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3FulfillmentResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3TransitionRouteResponse {
    /**
     * The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    private final String condition;
    /**
     * The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    private final String intent;
    /**
     * The unique identifier of this transition route.
     * 
     */
    private final String name;
    /**
     * The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    private final String targetFlow;
    /**
     * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    private final String targetPage;
    /**
     * The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
     * 
     */
    private final GoogleCloudDialogflowCxV3FulfillmentResponse triggerFulfillment;

    @OutputCustomType.Constructor({"condition","intent","name","targetFlow","targetPage","triggerFulfillment"})
    private GoogleCloudDialogflowCxV3TransitionRouteResponse(
        String condition,
        String intent,
        String name,
        String targetFlow,
        String targetPage,
        GoogleCloudDialogflowCxV3FulfillmentResponse triggerFulfillment) {
        this.condition = Objects.requireNonNull(condition);
        this.intent = Objects.requireNonNull(intent);
        this.name = Objects.requireNonNull(name);
        this.targetFlow = Objects.requireNonNull(targetFlow);
        this.targetPage = Objects.requireNonNull(targetPage);
        this.triggerFulfillment = Objects.requireNonNull(triggerFulfillment);
    }

    /**
     * The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
    */
    public String getCondition() {
        return this.condition;
    }
    /**
     * The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
    */
    public String getIntent() {
        return this.intent;
    }
    /**
     * The unique identifier of this transition route.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
    */
    public String getTargetFlow() {
        return this.targetFlow;
    }
    /**
     * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
    */
    public String getTargetPage() {
        return this.targetPage;
    }
    /**
     * The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
     * 
    */
    public GoogleCloudDialogflowCxV3FulfillmentResponse getTriggerFulfillment() {
        return this.triggerFulfillment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3TransitionRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String condition;
        private String intent;
        private String name;
        private String targetFlow;
        private String targetPage;
        private GoogleCloudDialogflowCxV3FulfillmentResponse triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3TransitionRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.intent = defaults.intent;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder setCondition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setIntent(String intent) {
            this.intent = Objects.requireNonNull(intent);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTargetFlow(String targetFlow) {
            this.targetFlow = Objects.requireNonNull(targetFlow);
            return this;
        }

        public Builder setTargetPage(String targetPage) {
            this.targetPage = Objects.requireNonNull(targetPage);
            return this;
        }

        public Builder setTriggerFulfillment(GoogleCloudDialogflowCxV3FulfillmentResponse triggerFulfillment) {
            this.triggerFulfillment = Objects.requireNonNull(triggerFulfillment);
            return this;
        }
        public GoogleCloudDialogflowCxV3TransitionRouteResponse build() {
            return new GoogleCloudDialogflowCxV3TransitionRouteResponse(condition, intent, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}

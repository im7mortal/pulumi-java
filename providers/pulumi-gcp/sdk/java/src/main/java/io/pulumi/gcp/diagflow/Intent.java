// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.diagflow.IntentArgs;
import io.pulumi.gcp.diagflow.inputs.IntentState;
import io.pulumi.gcp.diagflow.outputs.IntentFollowupIntentInfo;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a Dialogflow intent. Intents convert a number of user expressions or patterns into an action. An action
 * is an extraction of a user command or sentence semantics.
 * 
 * To get more information about Intent, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/docs/reference/rest/v2/projects.agent.intents)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Intent can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/intent:Intent default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/intent:Intent")
public class Intent extends io.pulumi.resources.CustomResource {
    /**
     * The name of the action associated with the intent.
     * Note: The action name must not contain whitespaces.
     * 
     */
    @OutputExport(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return The name of the action associated with the intent.
     * Note: The action name must not contain whitespaces.
     * 
     */
    public Output<String> getAction() {
        return this.action;
    }
    /**
     * The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED
     * (i.e. default platform).
     * Each value may be one of `FACEBOOK`, `SLACK`, `TELEGRAM`, `KIK`, `SKYPE`, `LINE`, `VIBER`, `ACTIONS_ON_GOOGLE`, and `GOOGLE_HANGOUTS`.
     * 
     */
    @OutputExport(name="defaultResponsePlatforms", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> defaultResponsePlatforms;

    /**
     * @return The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED
     * (i.e. default platform).
     * Each value may be one of `FACEBOOK`, `SLACK`, `TELEGRAM`, `KIK`, `SKYPE`, `LINE`, `VIBER`, `ACTIONS_ON_GOOGLE`, and `GOOGLE_HANGOUTS`.
     * 
     */
    public Output</* @Nullable */ List<String>> getDefaultResponsePlatforms() {
        return this.defaultResponsePlatforms;
    }
    /**
     * The name of this intent to be displayed on the console.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The name of this intent to be displayed on the console.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of
     * the contexts must be present in the active user session for an event to trigger this intent. See the
     * [events reference](https://cloud.google.com/dialogflow/docs/events-overview) for more details.
     * 
     */
    @OutputExport(name="events", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> events;

    /**
     * @return The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of
     * the contexts must be present in the active user session for an event to trigger this intent. See the
     * [events reference](https://cloud.google.com/dialogflow/docs/events-overview) for more details.
     * 
     */
    public Output</* @Nullable */ List<String>> getEvents() {
        return this.events;
    }
    /**
     * Information about all followup intents that have this intent as a direct or indirect parent. We populate this field only
     * in the output.
     * 
     */
    @OutputExport(name="followupIntentInfos", type=List.class, parameters={IntentFollowupIntentInfo.class})
    private Output<List<IntentFollowupIntentInfo>> followupIntentInfos;

    /**
     * @return Information about all followup intents that have this intent as a direct or indirect parent. We populate this field only
     * in the output.
     * 
     */
    public Output<List<IntentFollowupIntentInfo>> getFollowupIntentInfos() {
        return this.followupIntentInfos;
    }
    /**
     * The list of context names required for this intent to be triggered.
     * Format: projects/<Project ID>/agent/sessions/-/contexts/<Context ID>.
     * 
     */
    @OutputExport(name="inputContextNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> inputContextNames;

    /**
     * @return The list of context names required for this intent to be triggered.
     * Format: projects/<Project ID>/agent/sessions/-/contexts/<Context ID>.
     * 
     */
    public Output</* @Nullable */ List<String>> getInputContextNames() {
        return this.inputContextNames;
    }
    /**
     * Indicates whether this is a fallback intent.
     * 
     */
    @OutputExport(name="isFallback", type=Boolean.class, parameters={})
    private Output<Boolean> isFallback;

    /**
     * @return Indicates whether this is a fallback intent.
     * 
     */
    public Output<Boolean> getIsFallback() {
        return this.isFallback;
    }
    /**
     * Indicates whether Machine Learning is disabled for the intent.
     * Note: If mlDisabled setting is set to true, then this intent is not taken into account during inference in ML
     * ONLY match mode. Also, auto-markup in the UI is turned off.
     * 
     */
    @OutputExport(name="mlDisabled", type=Boolean.class, parameters={})
    private Output<Boolean> mlDisabled;

    /**
     * @return Indicates whether Machine Learning is disabled for the intent.
     * Note: If mlDisabled setting is set to true, then this intent is not taken into account during inference in ML
     * ONLY match mode. Also, auto-markup in the UI is turned off.
     * 
     */
    public Output<Boolean> getMlDisabled() {
        return this.mlDisabled;
    }
    /**
     * The unique identifier of this intent. Format: projects/<Project ID>/agent/intents/<Intent ID>.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of this intent. Format: projects/<Project ID>/agent/intents/<Intent ID>.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The unique identifier of the parent intent in the chain of followup intents.
     * Format: projects/<Project ID>/agent/intents/<Intent ID>.
     * 
     */
    @OutputExport(name="parentFollowupIntentName", type=String.class, parameters={})
    private Output<String> parentFollowupIntentName;

    /**
     * @return The unique identifier of the parent intent in the chain of followup intents.
     * Format: projects/<Project ID>/agent/intents/<Intent ID>.
     * 
     */
    public Output<String> getParentFollowupIntentName() {
        return this.parentFollowupIntentName;
    }
    /**
     * The priority of this intent. Higher numbers represent higher priorities.
     * - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds
     *   to the Normal priority in the console.
     * - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The priority of this intent. Higher numbers represent higher priorities.
     * - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds
     *   to the Normal priority in the console.
     * - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    public Output<Integer> getPriority() {
        return this.priority;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Indicates whether to delete all contexts in the current session when this intent is matched.
     * 
     */
    @OutputExport(name="resetContexts", type=Boolean.class, parameters={})
    private Output<Boolean> resetContexts;

    /**
     * @return Indicates whether to delete all contexts in the current session when this intent is matched.
     * 
     */
    public Output<Boolean> getResetContexts() {
        return this.resetContexts;
    }
    /**
     * The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup intents
     * chain for this intent. Format: projects/<Project ID>/agent/intents/<Intent ID>.
     * 
     */
    @OutputExport(name="rootFollowupIntentName", type=String.class, parameters={})
    private Output<String> rootFollowupIntentName;

    /**
     * @return The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup intents
     * chain for this intent. Format: projects/<Project ID>/agent/intents/<Intent ID>.
     * 
     */
    public Output<String> getRootFollowupIntentName() {
        return this.rootFollowupIntentName;
    }
    /**
     * Indicates whether webhooks are enabled for the intent.
     * * WEBHOOK_STATE_ENABLED: Webhook is enabled in the agent and in the intent.
     * * WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: Webhook is enabled in the agent and in the intent. Also, each slot
     *   filling prompt is forwarded to the webhook.
     *   Possible values are `WEBHOOK_STATE_ENABLED` and `WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING`.
     * 
     */
    @OutputExport(name="webhookState", type=String.class, parameters={})
    private Output<String> webhookState;

    /**
     * @return Indicates whether webhooks are enabled for the intent.
     * * WEBHOOK_STATE_ENABLED: Webhook is enabled in the agent and in the intent.
     * * WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: Webhook is enabled in the agent and in the intent. Also, each slot
     *   filling prompt is forwarded to the webhook.
     *   Possible values are `WEBHOOK_STATE_ENABLED` and `WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING`.
     * 
     */
    public Output<String> getWebhookState() {
        return this.webhookState;
    }

    public interface BuilderApplicator {
        public void apply(IntentArgs.Builder a);
    }
    private static io.pulumi.gcp.diagflow.IntentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.diagflow.IntentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Intent(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Intent(String name) {
        this(name, IntentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Intent(String name, IntentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Intent(String name, IntentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/intent:Intent", name, args == null ? IntentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Intent(String name, Input<String> id, @Nullable IntentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/intent:Intent", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Intent get(String name, Input<String> id, @Nullable IntentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Intent(name, id, state, options);
    }
}

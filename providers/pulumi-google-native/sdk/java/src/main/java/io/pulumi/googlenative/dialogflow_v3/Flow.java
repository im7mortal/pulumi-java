// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3.FlowArgs;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3EventHandlerResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3NluSettingsResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3TransitionRouteResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a flow in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
 * 
 */
@ResourceType(type="google-native:dialogflow/v3:Flow")
public class Flow extends io.pulumi.resources.CustomResource {
    /**
     * The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the flow.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the flow.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * A flow's event handlers serve two purposes: * They are responsible for handling events (e.g. no match, webhook errors) in the flow. * They are inherited by every page's event handlers, which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow. Unlike transition_routes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * 
     */
    @OutputExport(name="eventHandlers", type=List.class, parameters={GoogleCloudDialogflowCxV3EventHandlerResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3EventHandlerResponse>> eventHandlers;

    /**
     * @return A flow's event handlers serve two purposes: * They are responsible for handling events (e.g. no match, webhook errors) in the flow. * They are inherited by every page's event handlers, which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow. Unlike transition_routes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3EventHandlerResponse>> getEventHandlers() {
        return this.eventHandlers;
    }
    /**
     * The unique identifier of the flow. Format: `projects//locations//agents//flows/`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the flow. Format: `projects//locations//agents//flows/`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * NLU related settings of the flow.
     * 
     */
    @OutputExport(name="nluSettings", type=GoogleCloudDialogflowCxV3NluSettingsResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3NluSettingsResponse> nluSettings;

    /**
     * @return NLU related settings of the flow.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3NluSettingsResponse> getNluSettings() {
        return this.nluSettings;
    }
    /**
     * A flow's transition route group serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition route groups. Transition route groups defined in the page have higher priority than those defined in the flow. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @OutputExport(name="transitionRouteGroups", type=List.class, parameters={String.class})
    private Output<List<String>> transitionRouteGroups;

    /**
     * @return A flow's transition route group serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition route groups. Transition route groups defined in the page have higher priority than those defined in the flow. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    public Output<List<String>> getTransitionRouteGroups() {
        return this.transitionRouteGroups;
    }
    /**
     * A flow's transition routes serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition routes and can support use cases such as the user saying "help" or "can I talk to a human?", which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow. TransitionRoutes are evalauted in the following order: * TransitionRoutes with intent specified.. * TransitionRoutes with only condition specified. TransitionRoutes with intent specified are inherited by pages in the flow.
     * 
     */
    @OutputExport(name="transitionRoutes", type=List.class, parameters={GoogleCloudDialogflowCxV3TransitionRouteResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3TransitionRouteResponse>> transitionRoutes;

    /**
     * @return A flow's transition routes serve two purposes: * They are responsible for matching the user's first utterances in the flow. * They are inherited by every page's transition routes and can support use cases such as the user saying "help" or "can I talk to a human?", which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow. TransitionRoutes are evalauted in the following order: * TransitionRoutes with intent specified.. * TransitionRoutes with only condition specified. TransitionRoutes with intent specified are inherited by pages in the flow.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3TransitionRouteResponse>> getTransitionRoutes() {
        return this.transitionRoutes;
    }

    public interface BuilderApplicator {
        public void apply(FlowArgs.Builder a);
    }
    private static io.pulumi.googlenative.dialogflow_v3.FlowArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.dialogflow_v3.FlowArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Flow(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Flow(String name) {
        this(name, FlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Flow(String name, FlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Flow(String name, FlowArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:Flow", name, args == null ? FlowArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Flow(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:Flow", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Flow get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Flow(name, id, options);
    }
}

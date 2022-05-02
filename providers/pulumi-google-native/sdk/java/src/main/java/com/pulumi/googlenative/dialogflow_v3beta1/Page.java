// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow_v3beta1.PageArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EventHandlerResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FormResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1TransitionRouteResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a page in the specified flow.
 * 
 */
@ResourceType(type="google-native:dialogflow/v3beta1:Page")
public class Page extends com.pulumi.resources.CustomResource {
    /**
     * The human-readable name of the page, unique within the flow.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the page, unique within the flow.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The fulfillment to call when the session is entering the page.
     * 
     */
    @Export(name="entryFulfillment", type=GoogleCloudDialogflowCxV3beta1FulfillmentResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3beta1FulfillmentResponse> entryFulfillment;

    /**
     * @return The fulfillment to call when the session is entering the page.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1FulfillmentResponse> entryFulfillment() {
        return this.entryFulfillment;
    }
    /**
     * Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * 
     */
    @Export(name="eventHandlers", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1EventHandlerResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse>> eventHandlers;

    /**
     * @return Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse>> eventHandlers() {
        return this.eventHandlers;
    }
    /**
     * The form associated with the page, used for collecting parameters relevant to the page.
     * 
     */
    @Export(name="form", type=GoogleCloudDialogflowCxV3beta1FormResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3beta1FormResponse> form;

    /**
     * @return The form associated with the page, used for collecting parameters relevant to the page.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1FormResponse> form() {
        return this.form;
    }
    /**
     * The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Ordered list of `TransitionRouteGroups` associated with the page. Transition route groups must be unique within a page. * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page&#39;s transition route -&gt; page&#39;s transition route group -&gt; flow&#39;s transition routes. * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @Export(name="transitionRouteGroups", type=List.class, parameters={String.class})
    private Output<List<String>> transitionRouteGroups;

    /**
     * @return Ordered list of `TransitionRouteGroups` associated with the page. Transition route groups must be unique within a page. * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page&#39;s transition route -&gt; page&#39;s transition route group -&gt; flow&#39;s transition routes. * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    public Output<List<String>> transitionRouteGroups() {
        return this.transitionRouteGroups;
    }
    /**
     * A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow. When we are in a certain page, the TransitionRoutes are evalauted in the following order: * TransitionRoutes defined in the page with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in the page with only condition specified. * TransitionRoutes defined in the transition route groups with only condition specified.
     * 
     */
    @Export(name="transitionRoutes", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1TransitionRouteResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse>> transitionRoutes;

    /**
     * @return A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow. When we are in a certain page, the TransitionRoutes are evalauted in the following order: * TransitionRoutes defined in the page with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in the page with only condition specified. * TransitionRoutes defined in the transition route groups with only condition specified.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse>> transitionRoutes() {
        return this.transitionRoutes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Page(String name) {
        this(name, PageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Page(String name, PageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Page(String name, PageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:Page", name, args == null ? PageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Page(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:Page", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Page get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Page(name, id, options);
    }
}

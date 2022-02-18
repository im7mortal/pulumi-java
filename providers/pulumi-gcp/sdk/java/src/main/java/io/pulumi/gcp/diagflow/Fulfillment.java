// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.diagflow.FulfillmentArgs;
import io.pulumi.gcp.diagflow.inputs.FulfillmentState;
import io.pulumi.gcp.diagflow.outputs.FulfillmentFeature;
import io.pulumi.gcp.diagflow.outputs.FulfillmentGenericWebService;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * By default, your agent responds to a matched intent with a static response. If you're using one of the integration options, you can provide a more dynamic response by using fulfillment. When you enable fulfillment for an intent, Dialogflow responds to that intent by calling a service that you define. For example, if an end-user wants to schedule a haircut on Friday, your service can check your database and respond to the end-user with availability information for Friday.
 * 
 * To get more information about Fulfillment, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent/getFulfillment)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/es/docs/fulfillment-overview)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Fulfillment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/fulfillment:Fulfillment default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/fulfillment:Fulfillment")
public class Fulfillment extends io.pulumi.resources.CustomResource {
    /**
     * The human-readable name of the fulfillment, unique within the agent.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the fulfillment, unique within the agent.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Whether fulfillment is enabled.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether fulfillment is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * The field defines whether the fulfillment is enabled for certain features.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="features", type=List.class, parameters={FulfillmentFeature.class})
    private Output</* @Nullable */ List<FulfillmentFeature>> features;

    /**
     * @return The field defines whether the fulfillment is enabled for certain features.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<FulfillmentFeature>> getFeatures() {
        return this.features;
    }
    /**
     * Represents configuration for a generic web service. Dialogflow supports two mechanisms for authentications: - Basic authentication with username and password. - Authentication with additional authentication headers.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="genericWebService", type=FulfillmentGenericWebService.class, parameters={})
    private Output</* @Nullable */ FulfillmentGenericWebService> genericWebService;

    /**
     * @return Represents configuration for a generic web service. Dialogflow supports two mechanisms for authentications: - Basic authentication with username and password. - Authentication with additional authentication headers.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ FulfillmentGenericWebService> getGenericWebService() {
        return this.genericWebService;
    }
    /**
     * The unique identifier of the fulfillment. Format: projects/<Project ID>/agent/fulfillment - projects/<Project
     * ID>/locations/<Location ID>/agent/fulfillment
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the fulfillment. Format: projects/<Project ID>/agent/fulfillment - projects/<Project
     * ID>/locations/<Location ID>/agent/fulfillment
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Fulfillment(String name, FulfillmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/fulfillment:Fulfillment", name, args == null ? FulfillmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Fulfillment(String name, Input<String> id, @Nullable FulfillmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/fulfillment:Fulfillment", name, state, makeResourceOptions(options, id));
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
    public static Fulfillment get(String name, Input<String> id, @Nullable FulfillmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Fulfillment(name, id, state, options);
    }
}
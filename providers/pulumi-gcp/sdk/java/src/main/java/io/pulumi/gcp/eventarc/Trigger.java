// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.eventarc.TriggerArgs;
import io.pulumi.gcp.eventarc.inputs.TriggerState;
import io.pulumi.gcp.eventarc.outputs.TriggerDestination;
import io.pulumi.gcp.eventarc.outputs.TriggerMatchingCriteria;
import io.pulumi.gcp.eventarc.outputs.TriggerTransport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The Eventarc Trigger resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Trigger can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:eventarc/trigger:Trigger default projects/{{project}}/locations/{{location}}/triggers/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:eventarc/trigger:Trigger default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:eventarc/trigger:Trigger default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:eventarc/trigger:Trigger")
public class Trigger extends io.pulumi.resources.CustomResource {
    /**
     * Output only. The creation time.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. The creation time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Required. Destination specifies where the events should be sent to.
     * 
     */
    @OutputExport(name="destination", type=TriggerDestination.class, parameters={})
    private Output<TriggerDestination> destination;

    /**
     * @return Required. Destination specifies where the events should be sent to.
     * 
     */
    public Output<TriggerDestination> getDestination() {
        return this.destination;
    }
    /**
     * Output only. This checksum is computed by the server based on the value of other fields, and may be sent only on create
     * requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Output only. This checksum is computed by the server based on the value of other fields, and may be sent only on create
     * requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The location for the resource
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     * 
     */
    @OutputExport(name="matchingCriterias", type=List.class, parameters={TriggerMatchingCriteria.class})
    private Output<List<TriggerMatchingCriteria>> matchingCriterias;

    /**
     * @return Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     * 
     */
    public Output<List<TriggerMatchingCriteria>> getMatchingCriterias() {
        return this.matchingCriterias;
    }
    /**
     * Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    @OutputExport(name="serviceAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceAccount;

    /**
     * @return Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    public Output</* @Nullable */ String> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    @OutputExport(name="transports", type=List.class, parameters={TriggerTransport.class})
    private Output<List<TriggerTransport>> transports;

    /**
     * @return Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    public Output<List<TriggerTransport>> getTransports() {
        return this.transports;
    }
    /**
     * Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain
     * unchanged until the resource is deleted.
     * 
     */
    @OutputExport(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain
     * unchanged until the resource is deleted.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }
    /**
     * Output only. The last-modified time.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. The last-modified time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(TriggerArgs.Builder a);
    }
    private static io.pulumi.gcp.eventarc.TriggerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.eventarc.TriggerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Trigger(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Trigger(String name) {
        this(name, TriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Trigger(String name, TriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Trigger(String name, TriggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:eventarc/trigger:Trigger", name, args == null ? TriggerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Trigger(String name, Input<String> id, @Nullable TriggerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:eventarc/trigger:Trigger", name, state, makeResourceOptions(options, id));
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
    public static Trigger get(String name, Input<String> id, @Nullable TriggerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Trigger(name, id, state, options);
    }
}

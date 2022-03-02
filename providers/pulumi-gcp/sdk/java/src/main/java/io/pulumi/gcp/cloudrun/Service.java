// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.cloudrun.ServiceArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceState;
import io.pulumi.gcp.cloudrun.outputs.ServiceMetadata;
import io.pulumi.gcp.cloudrun.outputs.ServiceStatus;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplate;
import io.pulumi.gcp.cloudrun.outputs.ServiceTraffic;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Service acts as a top-level container that manages a set of Routes and
 * Configurations which implement a network service. Service exists to provide a
 * singular abstraction which can be access controlled, reasoned about, and
 * which encapsulates software lifecycle decisions such as rollout policy and
 * team resource ownership. Service acts only as an orchestrator of the
 * underlying Routes and Configurations (much as a kubernetes Deployment
 * orchestrates ReplicaSets).
 * 
 * The Service's controller will track the statuses of its owned Configuration
 * and Route, reflecting their statuses and conditions as its own.
 * 
 * See also:
 * https://github.com/knative/specs/blob/main/specs/serving/overview.md
 * 
 * To get more information about Service, see:
 * 
 * * [API documentation](https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/run/docs/)
 * 
 * > **Warning:** `google_cloudrun_service` creates a Managed Google Cloud Run Service. If you need to create
 * a Cloud Run Service on Anthos(GKE/VMWare) then you will need to create it using the kubernetes alpha provider.
 * Have a look at the Cloud Run Anthos example below.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Service can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:cloudrun/service:Service default locations/{{location}}/namespaces/{{project}}/services/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudrun/service:Service default {{location}}/{{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudrun/service:Service default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:cloudrun/service:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * If set to `true`, the revision name (template.metadata.name) will be omitted and
     * autogenerated by Cloud Run. This cannot be set to `true` while `template.metadata.name`
     * is also set.
     * (For legacy support, if `template.metadata.name` is unset in state while
     * this field is set to false, the revision name will still autogenerate.)
     * 
     */
    @OutputExport(name="autogenerateRevisionName", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autogenerateRevisionName;

    /**
     * @return If set to `true`, the revision name (template.metadata.name) will be omitted and
     * autogenerated by Cloud Run. This cannot be set to `true` while `template.metadata.name`
     * is also set.
     * (For legacy support, if `template.metadata.name` is unset in state while
     * this field is set to false, the revision name will still autogenerate.)
     * 
     */
    public Output</* @Nullable */ Boolean> getAutogenerateRevisionName() {
        return this.autogenerateRevisionName;
    }
    /**
     * The location of the cloud run instance. eg us-central1
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the cloud run instance. eg us-central1
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Metadata associated with this Service, including name, namespace, labels,
     * and annotations.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="metadata", type=ServiceMetadata.class, parameters={})
    private Output<ServiceMetadata> metadata;

    /**
     * @return Metadata associated with this Service, including name, namespace, labels,
     * and annotations.
     * Structure is documented below.
     * 
     */
    public Output<ServiceMetadata> getMetadata() {
        return this.metadata;
    }
    /**
     * Volume's name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Volume's name.
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
     * The current status of the Service.
     * 
     */
    @OutputExport(name="statuses", type=List.class, parameters={ServiceStatus.class})
    private Output<List<ServiceStatus>> statuses;

    /**
     * @return The current status of the Service.
     * 
     */
    public Output<List<ServiceStatus>> getStatuses() {
        return this.statuses;
    }
    /**
     * template holds the latest specification for the Revision to
     * be stamped out. The template references the container image, and may also
     * include labels and annotations that should be attached to the Revision.
     * To correlate a Revision, and/or to force a Revision to be created when the
     * spec doesn't otherwise change, a nonce label may be provided in the
     * template metadata. For more details, see:
     * https://github.com/knative/serving/blob/master/docs/client-conventions.md#associate-modifications-with-revisions
     * Cloud Run does not currently support referencing a build that is
     * responsible for materializing the container image from source.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="template", type=ServiceTemplate.class, parameters={})
    private Output</* @Nullable */ ServiceTemplate> template;

    /**
     * @return template holds the latest specification for the Revision to
     * be stamped out. The template references the container image, and may also
     * include labels and annotations that should be attached to the Revision.
     * To correlate a Revision, and/or to force a Revision to be created when the
     * spec doesn't otherwise change, a nonce label may be provided in the
     * template metadata. For more details, see:
     * https://github.com/knative/serving/blob/master/docs/client-conventions.md#associate-modifications-with-revisions
     * Cloud Run does not currently support referencing a build that is
     * responsible for materializing the container image from source.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ServiceTemplate> getTemplate() {
        return this.template;
    }
    /**
     * Traffic specifies how to distribute traffic over a collection of Knative Revisions
     * and Configurations
     * Structure is documented below.
     * 
     */
    @OutputExport(name="traffics", type=List.class, parameters={ServiceTraffic.class})
    private Output<List<ServiceTraffic>> traffics;

    /**
     * @return Traffic specifies how to distribute traffic over a collection of Knative Revisions
     * and Configurations
     * Structure is documented below.
     * 
     */
    public Output<List<ServiceTraffic>> getTraffics() {
        return this.traffics;
    }

    public interface BuilderApplicator {
        public void apply(ServiceArgs.Builder a);
    }
    private static io.pulumi.gcp.cloudrun.ServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.cloudrun.ServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Service(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudrun/service:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Service(String name, Input<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudrun/service:Service", name, state, makeResourceOptions(options, id));
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
    public static Service get(String name, Input<String> id, @Nullable ServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}

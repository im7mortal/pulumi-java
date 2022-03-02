// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.apigee.EnvGroupAttachmentArgs;
import io.pulumi.gcp.apigee.inputs.EnvGroupAttachmentState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An `Environment Group attachment` in Apigee.
 * 
 * To get more information about EnvgroupAttachment, see:
 * 
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.envgroups.attachments/create)
 * * How-to Guides
 *     * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EnvgroupAttachment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/envGroupAttachment:EnvGroupAttachment default {{envgroup_id}}/attachments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/envGroupAttachment:EnvGroupAttachment default {{envgroup_id}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigee/envGroupAttachment:EnvGroupAttachment")
public class EnvGroupAttachment extends io.pulumi.resources.CustomResource {
    /**
     * The Apigee environment group associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/envgroups/{{envgroup_name}}`.
     * 
     */
    @OutputExport(name="envgroupId", type=String.class, parameters={})
    private Output<String> envgroupId;

    /**
     * @return The Apigee environment group associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/envgroups/{{envgroup_name}}`.
     * 
     */
    public Output<String> getEnvgroupId() {
        return this.envgroupId;
    }
    /**
     * The resource ID of the environment.
     * 
     */
    @OutputExport(name="environment", type=String.class, parameters={})
    private Output<String> environment;

    /**
     * @return The resource ID of the environment.
     * 
     */
    public Output<String> getEnvironment() {
        return this.environment;
    }
    /**
     * The name of the newly created attachment (output parameter).
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the newly created attachment (output parameter).
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(EnvGroupAttachmentArgs.Builder a);
    }
    private static io.pulumi.gcp.apigee.EnvGroupAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.apigee.EnvGroupAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EnvGroupAttachment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnvGroupAttachment(String name) {
        this(name, EnvGroupAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnvGroupAttachment(String name, EnvGroupAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvGroupAttachment(String name, EnvGroupAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/envGroupAttachment:EnvGroupAttachment", name, args == null ? EnvGroupAttachmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EnvGroupAttachment(String name, Input<String> id, @Nullable EnvGroupAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/envGroupAttachment:EnvGroupAttachment", name, state, makeResourceOptions(options, id));
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
    public static EnvGroupAttachment get(String name, Input<String> id, @Nullable EnvGroupAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EnvGroupAttachment(name, id, state, options);
    }
}

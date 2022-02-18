// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.projects.UsageExportBucketArgs;
import io.pulumi.gcp.projects.inputs.UsageExportBucketState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows creation and management of a Google Cloud Platform project.
 * 
 * Projects created with this resource must be associated with an Organization.
 * See the [Organization documentation](https://cloud.google.com/resource-manager/docs/quickstarts) for more details.
 * 
 * The user or service account that is running this provider when creating a `gcp.organizations.Project`
 * resource must have `roles/resourcemanager.projectCreator` on the specified organization. See the
 * [Access Control for Organizations Using IAM](https://cloud.google.com/resource-manager/docs/access-control-org)
 * doc for more information.
 * 
 * > This resource reads the specified billing account on every provider apply and plan operation so you must have permissions on the specified billing account.
 * 
 * To get more information about projects, see:
 * 
 * * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v1/projects)
 * * How-to Guides
 *     * [Creating and managing projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Projects can be imported using the `project_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:projects/usageExportBucket:UsageExportBucket my_project your-project-id
 * ```
 * 
 */
@ResourceType(type="gcp:projects/usageExportBucket:UsageExportBucket")
public class UsageExportBucket extends io.pulumi.resources.CustomResource {
    /**
     * The bucket to store reports in.
     * 
     */
    @OutputExport(name="bucketName", type=String.class, parameters={})
    private Output<String> bucketName;

    /**
     * @return The bucket to store reports in.
     * 
     */
    public Output<String> getBucketName() {
        return this.bucketName;
    }
    /**
     * A prefix for the reports, for instance, the project name.
     * 
     */
    @OutputExport(name="prefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> prefix;

    /**
     * @return A prefix for the reports, for instance, the project name.
     * 
     */
    public Output</* @Nullable */ String> getPrefix() {
        return this.prefix;
    }
    /**
     * The project to set the export bucket on. If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project to set the export bucket on. If it is not provided, the provider project is used.
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
    public UsageExportBucket(String name, UsageExportBucketArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/usageExportBucket:UsageExportBucket", name, args == null ? UsageExportBucketArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private UsageExportBucket(String name, Input<String> id, @Nullable UsageExportBucketState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/usageExportBucket:UsageExportBucket", name, state, makeResourceOptions(options, id));
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
    public static UsageExportBucket get(String name, Input<String> id, @Nullable UsageExportBucketState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UsageExportBucket(name, id, state, options);
    }
}
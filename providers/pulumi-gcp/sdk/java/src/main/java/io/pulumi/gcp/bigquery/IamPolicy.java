// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigquery.IamPolicyArgs;
import io.pulumi.gcp.bigquery.inputs.IamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for BigQuery Table. Each of these resources serves a different use case:
 * 
 * * `gcp.bigquery.IamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
 * * `gcp.bigquery.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
 * * `gcp.bigquery.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.
 * 
 * > **Note:** `gcp.bigquery.IamPolicy` **cannot** be used in conjunction with `gcp.bigquery.IamBinding` and `gcp.bigquery.IamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.bigquery.IamBinding` resources **can be** used in conjunction with `gcp.bigquery.IamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_bigquery\_table\_iam\_policy
 * 
 * With IAM Conditions:
 * ## google\_bigquery\_table\_iam\_binding
 * 
 * With IAM Conditions:
 * ## google\_bigquery\_table\_iam\_member
 * 
 * With IAM Conditions:
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} * {{project}}/{{dataset_id}}/{{table_id}} * {{dataset_id}}/{{table_id}} * {{table_id}} Any variables not passed in the import command will be taken from the provider configuration. BigQuery table IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/iamPolicy:IamPolicy editor "projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} roles/bigquery.dataOwner user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/iamPolicy:IamPolicy editor "projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} roles/bigquery.dataOwner"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/iamPolicy:IamPolicy editor projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:bigquery/iamPolicy:IamPolicy")
public class IamPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="datasetId", type=String.class, parameters={})
    private Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> getPolicyData() {
        return this.policyData;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="tableId", type=String.class, parameters={})
    private Output<String> tableId;

    public Output<String> getTableId() {
        return this.tableId;
    }

    public interface BuilderApplicator {
        public void apply(IamPolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.bigquery.IamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.bigquery.IamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IamPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IamPolicy(String name) {
        this(name, IamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IamPolicy(String name, IamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IamPolicy(String name, IamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/iamPolicy:IamPolicy", name, args == null ? IamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IamPolicy(String name, Input<String> id, @Nullable IamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/iamPolicy:IamPolicy", name, state, makeResourceOptions(options, id));
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
    public static IamPolicy get(String name, Input<String> id, @Nullable IamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IamPolicy(name, id, state, options);
    }
}

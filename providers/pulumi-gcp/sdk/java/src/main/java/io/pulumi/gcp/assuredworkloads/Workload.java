// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.assuredworkloads;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.assuredworkloads.WorkloadArgs;
import io.pulumi.gcp.assuredworkloads.inputs.WorkloadState;
import io.pulumi.gcp.assuredworkloads.outputs.WorkloadKmsSettings;
import io.pulumi.gcp.assuredworkloads.outputs.WorkloadResource;
import io.pulumi.gcp.assuredworkloads.outputs.WorkloadResourceSetting;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The AssuredWorkloads Workload resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Workload can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:assuredworkloads/workload:Workload default organizations/{{organization}}/locations/{{location}}/workloads/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:assuredworkloads/workload:Workload default {{organization}}/{{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:assuredworkloads/workload:Workload")
public class Workload extends io.pulumi.resources.CustomResource {
    /**
     * Required. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, 'billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    @OutputExport(name="billingAccount", type=String.class, parameters={})
    private Output<String> billingAccount;

    /**
     * @return Required. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, 'billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    public Output<String> getBillingAccount() {
        return this.billingAccount;
    }
    /**
     * Required. Immutable. Compliance Regime associated with this workload. Possible values: COMPLIANCE_REGIME_UNSPECIFIED, IL4, CJIS, FEDRAMP_HIGH, FEDRAMP_MODERATE, US_REGIONAL_ACCESS
     * 
     */
    @OutputExport(name="complianceRegime", type=String.class, parameters={})
    private Output<String> complianceRegime;

    /**
     * @return Required. Immutable. Compliance Regime associated with this workload. Possible values: COMPLIANCE_REGIME_UNSPECIFIED, IL4, CJIS, FEDRAMP_HIGH, FEDRAMP_MODERATE, US_REGIONAL_ACCESS
     * 
     */
    public Output<String> getComplianceRegime() {
        return this.complianceRegime;
    }
    /**
     * Output only. Immutable. The Workload creation timestamp.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. Immutable. The Workload creation timestamp.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     * 
     */
    @OutputExport(name="kmsSettings", type=WorkloadKmsSettings.class, parameters={})
    private Output</* @Nullable */ WorkloadKmsSettings> kmsSettings;

    /**
     * @return Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     * 
     */
    public Output</* @Nullable */ WorkloadKmsSettings> getKmsSettings() {
        return this.kmsSettings;
    }
    /**
     * Optional. Labels applied to the workload.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Optional. Labels applied to the workload.
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
     * Output only. The resource name of the workload.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Output only. The resource name of the workload.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The organization for the resource
     * 
     */
    @OutputExport(name="organization", type=String.class, parameters={})
    private Output<String> organization;

    /**
     * @return The organization for the resource
     * 
     */
    public Output<String> getOrganization() {
        return this.organization;
    }
    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either an organization or a folder. Must be the same or a child of the Workload parent. If not specified all resources are created under the Workload parent. Formats: folders/{folder_id}, organizations/{organization_id}
     * 
     */
    @OutputExport(name="provisionedResourcesParent", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisionedResourcesParent;

    /**
     * @return Input only. The parent resource for the resources managed by this Assured Workload. May be either an organization or a folder. Must be the same or a child of the Workload parent. If not specified all resources are created under the Workload parent. Formats: folders/{folder_id}, organizations/{organization_id}
     * 
     */
    public Output</* @Nullable */ String> getProvisionedResourcesParent() {
        return this.provisionedResourcesParent;
    }
    /**
     * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    @OutputExport(name="resourceSettings", type=List.class, parameters={WorkloadResourceSetting.class})
    private Output</* @Nullable */ List<WorkloadResourceSetting>> resourceSettings;

    /**
     * @return Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    public Output</* @Nullable */ List<WorkloadResourceSetting>> getResourceSettings() {
        return this.resourceSettings;
    }
    /**
     * Output only. The resources associated with this workload. These resources will be created when creating the workload. If
     * any of the projects already exist, the workload creation will fail. Always read only.
     * 
     */
    @OutputExport(name="resources", type=List.class, parameters={WorkloadResource.class})
    private Output<List<WorkloadResource>> resources;

    /**
     * @return Output only. The resources associated with this workload. These resources will be created when creating the workload. If
     * any of the projects already exist, the workload creation will fail. Always read only.
     * 
     */
    public Output<List<WorkloadResource>> getResources() {
        return this.resources;
    }

    public interface BuilderApplicator {
        public void apply(WorkloadArgs.Builder a);
    }
    private static io.pulumi.gcp.assuredworkloads.WorkloadArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.assuredworkloads.WorkloadArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Workload(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workload(String name) {
        this(name, WorkloadArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workload(String name, WorkloadArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workload(String name, WorkloadArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:assuredworkloads/workload:Workload", name, args == null ? WorkloadArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Workload(String name, Input<String> id, @Nullable WorkloadState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:assuredworkloads/workload:Workload", name, state, makeResourceOptions(options, id));
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
    public static Workload get(String name, Input<String> id, @Nullable WorkloadState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workload(name, id, state, options);
    }
}

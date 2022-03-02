// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.assuredworkloads_v1.WorkloadArgs;
import io.pulumi.googlenative.assuredworkloads_v1.outputs.GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse;
import io.pulumi.googlenative.assuredworkloads_v1.outputs.GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse;
import io.pulumi.googlenative.assuredworkloads_v1.outputs.GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse;
import io.pulumi.googlenative.assuredworkloads_v1.outputs.GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates Assured Workload.
 * 
 */
@ResourceType(type="google-native:assuredworkloads/v1:Workload")
public class Workload extends io.pulumi.resources.CustomResource {
    /**
     * Optional. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    @OutputExport(name="billingAccount", type=String.class, parameters={})
    private Output<String> billingAccount;

    /**
     * @return Optional. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    public Output<String> getBillingAccount() {
        return this.billingAccount;
    }
    /**
     * Immutable. Compliance Regime associated with this workload.
     * 
     */
    @OutputExport(name="complianceRegime", type=String.class, parameters={})
    private Output<String> complianceRegime;

    /**
     * @return Immutable. Compliance Regime associated with this workload.
     * 
     */
    public Output<String> getComplianceRegime() {
        return this.complianceRegime;
    }
    /**
     * Immutable. The Workload creation timestamp.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Immutable. The Workload creation timestamp.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
     * 
     */
    @OutputExport(name="enableSovereignControls", type=Boolean.class, parameters={})
    private Output<Boolean> enableSovereignControls;

    /**
     * @return Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
     * 
     */
    public Output<Boolean> getEnableSovereignControls() {
        return this.enableSovereignControls;
    }
    /**
     * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update & Delete operations.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update & Delete operations.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Represents the KAJ enrollment state of the given workload.
     * 
     */
    @OutputExport(name="kajEnrollmentState", type=String.class, parameters={})
    private Output<String> kajEnrollmentState;

    /**
     * @return Represents the KAJ enrollment state of the given workload.
     * 
     */
    public Output<String> getKajEnrollmentState() {
        return this.kajEnrollmentState;
    }
    /**
     * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     * 
     */
    @OutputExport(name="kmsSettings", type=GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse.class, parameters={})
    private Output<GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse> kmsSettings;

    /**
     * @return Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     * 
     */
    public Output<GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse> getKmsSettings() {
        return this.kmsSettings;
    }
    /**
     * Optional. Labels applied to the workload.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels applied to the workload.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
     * 
     */
    @OutputExport(name="provisionedResourcesParent", type=String.class, parameters={})
    private Output<String> provisionedResourcesParent;

    /**
     * @return Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
     * 
     */
    public Output<String> getProvisionedResourcesParent() {
        return this.provisionedResourcesParent;
    }
    /**
     * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    @OutputExport(name="resourceSettings", type=List.class, parameters={GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse.class})
    private Output<List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse>> resourceSettings;

    /**
     * @return Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    public Output<List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse>> getResourceSettings() {
        return this.resourceSettings;
    }
    /**
     * The resources associated with this workload. These resources will be created when creating the workload. If any of the projects already exist, the workload creation will fail. Always read only.
     * 
     */
    @OutputExport(name="resources", type=List.class, parameters={GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse.class})
    private Output<List<GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse>> resources;

    /**
     * @return The resources associated with this workload. These resources will be created when creating the workload. If any of the projects already exist, the workload creation will fail. Always read only.
     * 
     */
    public Output<List<GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse>> getResources() {
        return this.resources;
    }
    /**
     * Represents the SAA enrollment response of the given workload. SAA enrollment response is queried during GetWorkload call. In failure cases, user friendly error message is shown in SAA details page.
     * 
     */
    @OutputExport(name="saaEnrollmentResponse", type=GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse.class, parameters={})
    private Output<GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse> saaEnrollmentResponse;

    /**
     * @return Represents the SAA enrollment response of the given workload. SAA enrollment response is queried during GetWorkload call. In failure cases, user friendly error message is shown in SAA details page.
     * 
     */
    public Output<GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponseResponse> getSaaEnrollmentResponse() {
        return this.saaEnrollmentResponse;
    }

    public interface BuilderApplicator {
        public void apply(WorkloadArgs.Builder a);
    }
    private static io.pulumi.googlenative.assuredworkloads_v1.WorkloadArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.assuredworkloads_v1.WorkloadArgs.builder();
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
        super("google-native:assuredworkloads/v1:Workload", name, args == null ? WorkloadArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Workload(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:assuredworkloads/v1:Workload", name, null, makeResourceOptions(options, id));
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
    public static Workload get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workload(name, id, options);
    }
}

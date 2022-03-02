// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.DicomStoreIamMemberArgs;
import io.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberState;
import io.pulumi.gcp.healthcare.outputs.DicomStoreIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Healthcare DICOM store. Each of these resources serves a different use case:
 * 
 * * `gcp.healthcare.DicomStoreIamPolicy`: Authoritative. Sets the IAM policy for the DICOM store and replaces any existing policy already attached.
 * * `gcp.healthcare.DicomStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the DICOM store are preserved.
 * * `gcp.healthcare.DicomStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the DICOM store are preserved.
 * 
 * > **Note:** `gcp.healthcare.DicomStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DicomStoreIamBinding` and `gcp.healthcare.DicomStoreIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.healthcare.DicomStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DicomStoreIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_healthcare\_dicom\_store\_iam\_policy
 * 
 * ## google\_healthcare\_dicom\_store\_iam\_binding
 * 
 * ## google\_healthcare\_dicom\_store\_iam\_member
 * 
 * ## Import
 * 
 * IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
 * 
 * This member resource can be imported using the `dicom_store_id`, role, and account e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember dicom_store_iam "your-project-id/location-name/dataset-name/dicom-store-name roles/viewer user:foo@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role.
 * 
 * This binding resource can be imported using the `dicom_store_id` and role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember dicom_store_iam "your-project-id/location-name/dataset-name/dicom-store-name roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question.
 * 
 * This policy resource can be imported using the `dicom_store_id`, role, and account e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember dicom_store_iam your-project-id/location-name/dataset-name/dicom-store-name
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember")
public class DicomStoreIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=DicomStoreIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ DicomStoreIamMemberCondition> condition;

    public Output</* @Nullable */ DicomStoreIamMemberCondition> getCondition() {
        return this.condition;
    }
    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @OutputExport(name="dicomStoreId", type=String.class, parameters={})
    private Output<String> dicomStoreId;

    /**
     * @return The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    public Output<String> getDicomStoreId() {
        return this.dicomStoreId;
    }
    /**
     * (Computed) The etag of the DICOM store's IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the DICOM store's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    public interface BuilderApplicator {
        public void apply(DicomStoreIamMemberArgs.Builder a);
    }
    private static io.pulumi.gcp.healthcare.DicomStoreIamMemberArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.healthcare.DicomStoreIamMemberArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DicomStoreIamMember(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DicomStoreIamMember(String name) {
        this(name, DicomStoreIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DicomStoreIamMember(String name, DicomStoreIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DicomStoreIamMember(String name, DicomStoreIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember", name, args == null ? DicomStoreIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DicomStoreIamMember(String name, Input<String> id, @Nullable DicomStoreIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember", name, state, makeResourceOptions(options, id));
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
    public static DicomStoreIamMember get(String name, Input<String> id, @Nullable DicomStoreIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DicomStoreIamMember(name, id, state, options);
    }
}

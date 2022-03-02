// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.HybridIdentityMetadatumArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.IdentityResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Defines the HybridIdentityMetadata.
 * API Version: 2020-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:connectedvmwarevsphere:HybridIdentityMetadatum testItem /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VitualMachines/ContosoVm/hybridIdentityMetadatas/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:connectedvmwarevsphere:HybridIdentityMetadatum")
public class HybridIdentityMetadatum extends io.pulumi.resources.CustomResource {
    /**
     * The identity of the resource.
     * 
     */
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output<IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output<IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the Public Key.
     * 
     */
    @OutputExport(name="publicKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicKey;

    /**
     * @return Gets or sets the Public Key.
     * 
     */
    public Output</* @Nullable */ String> getPublicKey() {
        return this.publicKey;
    }
    /**
     * The system data.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Gets or sets the Vm Id.
     * 
     */
    @OutputExport(name="vmId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmId;

    /**
     * @return Gets or sets the Vm Id.
     * 
     */
    public Output</* @Nullable */ String> getVmId() {
        return this.vmId;
    }

    public interface BuilderApplicator {
        public void apply(HybridIdentityMetadatumArgs.Builder a);
    }
    private static io.pulumi.azurenative.connectedvmwarevsphere.HybridIdentityMetadatumArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.connectedvmwarevsphere.HybridIdentityMetadatumArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HybridIdentityMetadatum(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HybridIdentityMetadatum(String name) {
        this(name, HybridIdentityMetadatumArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HybridIdentityMetadatum(String name, HybridIdentityMetadatumArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HybridIdentityMetadatum(String name, HybridIdentityMetadatumArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:HybridIdentityMetadatum", name, args == null ? HybridIdentityMetadatumArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private HybridIdentityMetadatum(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:HybridIdentityMetadatum", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:connectedvmwarevsphere/v20201001preview:HybridIdentityMetadatum").build())
            ))
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
    public static HybridIdentityMetadatum get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HybridIdentityMetadatum(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.MECRoleArgs;
import io.pulumi.azurenative.databoxedge.outputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * MEC role.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:MECRole IoTRole1 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/roles/IoTRole1 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:MECRole")
public class MECRole extends io.pulumi.resources.CustomResource {
    /**
     * Activation key of the MEC.
     * 
     */
    @OutputExport(name="connectionString", type=AsymmetricEncryptedSecretResponse.class, parameters={})
    private Output</* @Nullable */ AsymmetricEncryptedSecretResponse> connectionString;

    /**
     * @return Activation key of the MEC.
     * 
     */
    public Output</* @Nullable */ AsymmetricEncryptedSecretResponse> getConnectionString() {
        return this.connectionString;
    }
    /**
     * Role type.
     * Expected value is 'MEC'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Role type.
     * Expected value is 'MEC'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The object name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Role status.
     * 
     */
    @OutputExport(name="roleStatus", type=String.class, parameters={})
    private Output<String> roleStatus;

    /**
     * @return Role status.
     * 
     */
    public Output<String> getRoleStatus() {
        return this.roleStatus;
    }
    /**
     * Role configured on ASE resource
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Role configured on ASE resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(MECRoleArgs.Builder a);
    }
    private static io.pulumi.azurenative.databoxedge.MECRoleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.databoxedge.MECRoleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MECRole(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MECRole(String name) {
        this(name, MECRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MECRole(String name, MECRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MECRole(String name, MECRoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:MECRole", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private MECRole(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:MECRole", name, null, makeResourceOptions(options, id));
    }

    private static MECRoleArgs makeArgs(MECRoleArgs args) {
        var builder = args == null ? MECRoleArgs.builder() : MECRoleArgs.builder(args);
        return builder
            .setKind("MEC")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190301:MECRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190701:MECRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190801:MECRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200501preview:MECRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901:MECRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:MECRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20201201:MECRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201:MECRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:MECRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601:MECRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:MECRole").build())
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
    public static MECRole get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MECRole(name, id, options);
    }
}

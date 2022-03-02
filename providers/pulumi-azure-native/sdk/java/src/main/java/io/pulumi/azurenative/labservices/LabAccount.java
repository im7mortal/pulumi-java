// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.LabAccountArgs;
import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.azurenative.labservices.outputs.SizeConfigurationPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a lab account.
 * API Version: 2018-10-15.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:labservices:LabAccount myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.LabServices/labaccounts/{labAccountName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:labservices:LabAccount")
public class LabAccount extends io.pulumi.resources.CustomResource {
    /**
     * Represents if region selection is enabled
     * 
     */
    @OutputExport(name="enabledRegionSelection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabledRegionSelection;

    /**
     * @return Represents if region selection is enabled
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabledRegionSelection() {
        return this.enabledRegionSelection;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    @OutputExport(name="latestOperationResult", type=LatestOperationResultResponse.class, parameters={})
    private Output<LatestOperationResultResponse> latestOperationResult;

    /**
     * @return The details of the latest operation. ex: status, error
     * 
     */
    public Output<LatestOperationResultResponse> getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Represents the size configuration under the lab account
     * 
     */
    @OutputExport(name="sizeConfiguration", type=SizeConfigurationPropertiesResponse.class, parameters={})
    private Output<SizeConfigurationPropertiesResponse> sizeConfiguration;

    /**
     * @return Represents the size configuration under the lab account
     * 
     */
    public Output<SizeConfigurationPropertiesResponse> getSizeConfiguration() {
        return this.sizeConfiguration;
    }
    /**
     * The tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output</* @Nullable */ String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public interface BuilderApplicator {
        public void apply(LabAccountArgs.Builder a);
    }
    private static io.pulumi.azurenative.labservices.LabAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.labservices.LabAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LabAccount(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LabAccount(String name) {
        this(name, LabAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LabAccount(String name, LabAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LabAccount(String name, LabAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:LabAccount", name, args == null ? LabAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LabAccount(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:LabAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:labservices/v20181015:LabAccount").build())
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
    public static LabAccount get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LabAccount(name, id, options);
    }
}

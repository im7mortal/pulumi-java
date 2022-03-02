// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.VaultArgs;
import io.pulumi.azurenative.recoveryservices.outputs.IdentityDataResponse;
import io.pulumi.azurenative.recoveryservices.outputs.SkuResponse;
import io.pulumi.azurenative.recoveryservices.outputs.SystemDataResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VaultPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Resource information, as returned by the resource provider.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:recoveryservices:Vault swaggerExample /subscriptions/77777777-b0c6-47a2-b37c-d8e65a629c18/resourceGroups/Default-RecoveryServices-ResourceGroup/providers/Microsoft.RecoveryServices/vaults/swaggerExample 
 * ```
 * 
 */
@ResourceType(type="azure-native:recoveryservices:Vault")
public class Vault extends io.pulumi.resources.CustomResource {
    /**
     * Optional ETag.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Optional ETag.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Identity for the resource.
     * 
     */
    @OutputExport(name="identity", type=IdentityDataResponse.class, parameters={})
    private Output</* @Nullable */ IdentityDataResponse> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Output</* @Nullable */ IdentityDataResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name associated with the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name associated with the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties of the vault.
     * 
     */
    @OutputExport(name="properties", type=VaultPropertiesResponse.class, parameters={})
    private Output<VaultPropertiesResponse> properties;

    /**
     * @return Properties of the vault.
     * 
     */
    public Output<VaultPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Identifies the unique system identifier for each Azure resource.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Identifies the unique system identifier for each Azure resource.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(VaultArgs.Builder a);
    }
    private static io.pulumi.azurenative.recoveryservices.VaultArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.recoveryservices.VaultArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Vault(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vault(String name) {
        this(name, VaultArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vault(String name, VaultArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vault(String name, VaultArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:Vault", name, args == null ? VaultArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Vault(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:Vault", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20160601:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20200202:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20201001:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210101:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210210:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210301:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210401:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210601:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210701:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210801:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20211101preview:Vault").build())
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
    public static Vault get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Vault(name, id, options);
    }
}

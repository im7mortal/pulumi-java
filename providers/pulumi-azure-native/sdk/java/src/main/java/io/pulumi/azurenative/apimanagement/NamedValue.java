// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.NamedValueArgs;
import io.pulumi.azurenative.apimanagement.outputs.KeyVaultContractPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * NamedValue details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:NamedValue testprop6 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/namedValues/testprop6 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:NamedValue")
public class NamedValue extends io.pulumi.resources.CustomResource {
    /**
     * Unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * KeyVault location details of the namedValue.
     * 
     */
    @OutputExport(name="keyVault", type=KeyVaultContractPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ KeyVaultContractPropertiesResponse> keyVault;

    /**
     * @return KeyVault location details of the namedValue.
     * 
     */
    public Output</* @Nullable */ KeyVaultContractPropertiesResponse> getKeyVault() {
        return this.keyVault;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
     */
    @OutputExport(name="secret", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> secret;

    /**
     * @return Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
     */
    public Output</* @Nullable */ Boolean> getSecret() {
        return this.secret;
    }
    /**
     * Optional tags that when provided can be used to filter the NamedValue list.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Optional tags that when provided can be used to filter the NamedValue list.
     * 
     */
    public Output</* @Nullable */ List<String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return Value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    public Output</* @Nullable */ String> getValue() {
        return this.value;
    }

    public interface BuilderApplicator {
        public void apply(NamedValueArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.NamedValueArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.NamedValueArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NamedValue(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamedValue(String name) {
        this(name, NamedValueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamedValue(String name, NamedValueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamedValue(String name, NamedValueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:NamedValue", name, args == null ? NamedValueArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NamedValue(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:NamedValue", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:NamedValue").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:NamedValue").build())
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
    public static NamedValue get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NamedValue(name, id, options);
    }
}

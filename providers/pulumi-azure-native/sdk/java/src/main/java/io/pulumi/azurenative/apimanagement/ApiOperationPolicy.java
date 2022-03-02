// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ApiOperationPolicyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Policy Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiOperationPolicy policy /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/5600b57e7e8880006a040001/operations/5600b57e7e8880006a080001/policies/policy 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiOperationPolicy")
public class ApiOperationPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Format of the policyContent.
     * 
     */
    @OutputExport(name="format", type=String.class, parameters={})
    private Output</* @Nullable */ String> format;

    /**
     * @return Format of the policyContent.
     * 
     */
    public Output</* @Nullable */ String> getFormat() {
        return this.format;
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
     * Contents of the Policy as defined by the format.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Contents of the Policy as defined by the format.
     * 
     */
    public Output<String> getValue() {
        return this.value;
    }

    public interface BuilderApplicator {
        public void apply(ApiOperationPolicyArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.ApiOperationPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.ApiOperationPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApiOperationPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiOperationPolicy(String name) {
        this(name, ApiOperationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiOperationPolicy(String name, ApiOperationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiOperationPolicy(String name, ApiOperationPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiOperationPolicy", name, args == null ? ApiOperationPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiOperationPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiOperationPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:ApiOperationPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:ApiOperationPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:ApiOperationPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:ApiOperationPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ApiOperationPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:ApiOperationPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ApiOperationPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ApiOperationPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ApiOperationPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ApiOperationPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ApiOperationPolicy").build())
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
    public static ApiOperationPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiOperationPolicy(name, id, options);
    }
}

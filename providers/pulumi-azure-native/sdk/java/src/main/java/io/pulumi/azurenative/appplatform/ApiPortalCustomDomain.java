// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.ApiPortalCustomDomainArgs;
import io.pulumi.azurenative.appplatform.outputs.ApiPortalCustomDomainPropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Custom domain of the API portal
 * API Version: 2022-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:appplatform:ApiPortalCustomDomain myDomainName /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/apiPortals/default/domains/myDomainName 
 * ```
 * 
 */
@ResourceType(type="azure-native:appplatform:ApiPortalCustomDomain")
public class ApiPortalCustomDomain extends io.pulumi.resources.CustomResource {
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
     * The properties of custom domain for API portal
     * 
     */
    @OutputExport(name="properties", type=ApiPortalCustomDomainPropertiesResponse.class, parameters={})
    private Output<ApiPortalCustomDomainPropertiesResponse> properties;

    /**
     * @return The properties of custom domain for API portal
     * 
     */
    public Output<ApiPortalCustomDomainPropertiesResponse> getProperties() {
        return this.properties;
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

    public interface BuilderApplicator {
        public void apply(ApiPortalCustomDomainArgs.Builder a);
    }
    private static io.pulumi.azurenative.appplatform.ApiPortalCustomDomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.appplatform.ApiPortalCustomDomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApiPortalCustomDomain(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiPortalCustomDomain(String name) {
        this(name, ApiPortalCustomDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiPortalCustomDomain(String name, ApiPortalCustomDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiPortalCustomDomain(String name, ApiPortalCustomDomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:ApiPortalCustomDomain", name, args == null ? ApiPortalCustomDomainArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiPortalCustomDomain(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:ApiPortalCustomDomain", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:appplatform/v20220101preview:ApiPortalCustomDomain").build())
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
    public static ApiPortalCustomDomain get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiPortalCustomDomain(name, id, options);
    }
}

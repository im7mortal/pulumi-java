// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Static Site User Provided Function App ARM resource.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSiteBuild testFunctionApp /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.Web/staticSites/testStaticSite0/builds/default/userProvidedFunctionApps/testFunctionApp 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSiteBuild")
public class StaticSiteUserProvidedFunctionAppForStaticSiteBuild extends io.pulumi.resources.CustomResource {
    /**
     * The date and time on which the function app was registered with the static site.
     * 
     */
    @OutputExport(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The date and time on which the function app was registered with the static site.
     * 
     */
    public Output<String> getCreatedOn() {
        return this.createdOn;
    }
    /**
     * The region of the function app registered with the static site
     * 
     */
    @OutputExport(name="functionAppRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> functionAppRegion;

    /**
     * @return The region of the function app registered with the static site
     * 
     */
    public Output</* @Nullable */ String> getFunctionAppRegion() {
        return this.functionAppRegion;
    }
    /**
     * The resource id of the function app registered with the static site
     * 
     */
    @OutputExport(name="functionAppResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> functionAppResourceId;

    /**
     * @return The resource id of the function app registered with the static site
     * 
     */
    public Output</* @Nullable */ String> getFunctionAppResourceId() {
        return this.functionAppResourceId;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StaticSiteUserProvidedFunctionAppForStaticSiteBuild(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StaticSiteUserProvidedFunctionAppForStaticSiteBuild(String name) {
        this(name, StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticSiteUserProvidedFunctionAppForStaticSiteBuild(String name, StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticSiteUserProvidedFunctionAppForStaticSiteBuild(String name, StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSiteBuild", name, args == null ? StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StaticSiteUserProvidedFunctionAppForStaticSiteBuild(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSiteBuild", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20201201:StaticSiteUserProvidedFunctionAppForStaticSiteBuild").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:StaticSiteUserProvidedFunctionAppForStaticSiteBuild").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:StaticSiteUserProvidedFunctionAppForStaticSiteBuild").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:StaticSiteUserProvidedFunctionAppForStaticSiteBuild").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:StaticSiteUserProvidedFunctionAppForStaticSiteBuild").build())
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
    public static StaticSiteUserProvidedFunctionAppForStaticSiteBuild get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StaticSiteUserProvidedFunctionAppForStaticSiteBuild(name, id, options);
    }
}

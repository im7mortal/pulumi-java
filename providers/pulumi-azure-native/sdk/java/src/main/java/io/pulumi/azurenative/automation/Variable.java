// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.VariableArgs;
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
 * Definition of the variable.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:Variable sampleVariable /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/sampleAccount9/variables/sampleVariable 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:Variable")
public class Variable extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets the creation time.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    /**
     * @return Gets or sets the creation time.
     * 
     */
    public Output</* @Nullable */ String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Gets or sets the description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Gets or sets the encrypted flag of the variable.
     * 
     */
    @OutputExport(name="isEncrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isEncrypted;

    /**
     * @return Gets or sets the encrypted flag of the variable.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsEncrypted() {
        return this.isEncrypted;
    }
    /**
     * Gets or sets the last modified time.
     * 
     */
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedTime() {
        return this.lastModifiedTime;
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
     * Gets or sets the value of the variable.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return Gets or sets the value of the variable.
     * 
     */
    public Output</* @Nullable */ String> getValue() {
        return this.value;
    }

    public interface BuilderApplicator {
        public void apply(VariableArgs.Builder a);
    }
    private static io.pulumi.azurenative.automation.VariableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.automation.VariableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Variable(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Variable(String name) {
        this(name, VariableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Variable(String name, VariableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Variable(String name, VariableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Variable", name, args == null ? VariableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Variable(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Variable", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:automation/v20151031:Variable").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20190601:Variable").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20200113preview:Variable").build())
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
    public static Variable get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Variable(name, id, options);
    }
}

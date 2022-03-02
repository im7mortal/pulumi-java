// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.PolicyDefinitionAtManagementGroupArgs;
import io.pulumi.azurenative.authorization.outputs.ParameterDefinitionsValueResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The policy definition.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:authorization:PolicyDefinitionAtManagementGroup ResourceNaming /providers/Microsoft.Management/managementgroups/MyManagementGroup/providers/Microsoft.Authorization/policyDefinitions/ResourceNaming 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:PolicyDefinitionAtManagementGroup")
public class PolicyDefinitionAtManagementGroup extends io.pulumi.resources.CustomResource {
    /**
     * The policy definition description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The policy definition description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The display name of the policy definition.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name of the policy definition.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @OutputExport(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    public Output</* @Nullable */ Object> getMetadata() {
        return this.metadata;
    }
    /**
     * The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     * 
     */
    @OutputExport(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     * 
     */
    public Output</* @Nullable */ String> getMode() {
        return this.mode;
    }
    /**
     * The name of the policy definition.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the policy definition.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     * 
     */
    @OutputExport(name="parameters", type=Map.class, parameters={String.class, ParameterDefinitionsValueResponse.class})
    private Output</* @Nullable */ Map<String,ParameterDefinitionsValueResponse>> parameters;

    /**
     * @return The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     * 
     */
    public Output</* @Nullable */ Map<String,ParameterDefinitionsValueResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * The policy rule.
     * 
     */
    @OutputExport(name="policyRule", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> policyRule;

    /**
     * @return The policy rule.
     * 
     */
    public Output</* @Nullable */ Object> getPolicyRule() {
        return this.policyRule;
    }
    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    @OutputExport(name="policyType", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyType;

    /**
     * @return The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    public Output</* @Nullable */ String> getPolicyType() {
        return this.policyType;
    }
    /**
     * The type of the resource (Microsoft.Authorization/policyDefinitions).
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource (Microsoft.Authorization/policyDefinitions).
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(PolicyDefinitionAtManagementGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.authorization.PolicyDefinitionAtManagementGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.authorization.PolicyDefinitionAtManagementGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PolicyDefinitionAtManagementGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyDefinitionAtManagementGroup(String name) {
        this(name, PolicyDefinitionAtManagementGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyDefinitionAtManagementGroup(String name, PolicyDefinitionAtManagementGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyDefinitionAtManagementGroup(String name, PolicyDefinitionAtManagementGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:PolicyDefinitionAtManagementGroup", name, args == null ? PolicyDefinitionAtManagementGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PolicyDefinitionAtManagementGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:PolicyDefinitionAtManagementGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:authorization/v20161201:PolicyDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20180301:PolicyDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20180501:PolicyDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20190101:PolicyDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20190601:PolicyDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20190901:PolicyDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20200301:PolicyDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20200901:PolicyDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20210601:PolicyDefinitionAtManagementGroup").build())
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
    public static PolicyDefinitionAtManagementGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PolicyDefinitionAtManagementGroup(name, id, options);
    }
}

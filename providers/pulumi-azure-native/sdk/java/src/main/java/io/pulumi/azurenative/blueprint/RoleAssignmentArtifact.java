// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blueprint.RoleAssignmentArtifactArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Blueprint artifact that applies a Role assignment.
 * API Version: 2018-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:blueprint:RoleAssignmentArtifact ownerAssignment /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Blueprint/blueprints/simpleBlueprint/artifacts/ownerAssignment 
 * ```
 * 
 */
@ResourceType(type="azure-native:blueprint:RoleAssignmentArtifact")
public class RoleAssignmentArtifact extends io.pulumi.resources.CustomResource {
    /**
     * Artifacts which need to be deployed before the specified artifact.
     * 
     */
    @OutputExport(name="dependsOn", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> dependsOn;

    /**
     * @return Artifacts which need to be deployed before the specified artifact.
     * 
     */
    public Output</* @Nullable */ List<String>> getDependsOn() {
        return this.dependsOn;
    }
    /**
     * Multi-line explain this resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Multi-line explain this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * One-liner string explain this resource.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return One-liner string explain this resource.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Specifies the kind of blueprint artifact.
     * Expected value is 'roleAssignment'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Specifies the kind of blueprint artifact.
     * Expected value is 'roleAssignment'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of this resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Array of user or group identities in Azure Active Directory. The roleDefinition will apply to each identity.
     * 
     */
    @OutputExport(name="principalIds", type=Object.class, parameters={})
    private Output<Object> principalIds;

    /**
     * @return Array of user or group identities in Azure Active Directory. The roleDefinition will apply to each identity.
     * 
     */
    public Output<Object> getPrincipalIds() {
        return this.principalIds;
    }
    /**
     * RoleAssignment will be scope to this resourceGroup. If empty, it scopes to the subscription.
     * 
     */
    @OutputExport(name="resourceGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroup;

    /**
     * @return RoleAssignment will be scope to this resourceGroup. If empty, it scopes to the subscription.
     * 
     */
    public Output</* @Nullable */ String> getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Azure resource ID of the RoleDefinition.
     * 
     */
    @OutputExport(name="roleDefinitionId", type=String.class, parameters={})
    private Output<String> roleDefinitionId;

    /**
     * @return Azure resource ID of the RoleDefinition.
     * 
     */
    public Output<String> getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * Type of this resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(RoleAssignmentArtifactArgs.Builder a);
    }
    private static io.pulumi.azurenative.blueprint.RoleAssignmentArtifactArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.blueprint.RoleAssignmentArtifactArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RoleAssignmentArtifact(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleAssignmentArtifact(String name) {
        this(name, RoleAssignmentArtifactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleAssignmentArtifact(String name, RoleAssignmentArtifactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleAssignmentArtifact(String name, RoleAssignmentArtifactArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:RoleAssignmentArtifact", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private RoleAssignmentArtifact(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:RoleAssignmentArtifact", name, null, makeResourceOptions(options, id));
    }

    private static RoleAssignmentArtifactArgs makeArgs(RoleAssignmentArtifactArgs args) {
        var builder = args == null ? RoleAssignmentArtifactArgs.builder() : RoleAssignmentArtifactArgs.builder(args);
        return builder
            .setKind("roleAssignment")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:blueprint/v20181101preview:RoleAssignmentArtifact").build())
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
    public static RoleAssignmentArtifact get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RoleAssignmentArtifact(name, id, options);
    }
}

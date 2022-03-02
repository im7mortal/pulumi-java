// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.RelationshipLinkArgs;
import io.pulumi.azurenative.customerinsights.outputs.ParticipantProfilePropertyReferenceResponse;
import io.pulumi.azurenative.customerinsights.outputs.RelationshipLinkFieldMappingResponse;
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
 * The relationship link resource format.
 * API Version: 2017-04-26.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:customerinsights:RelationshipLink sdkTestHub/Somelink /subscriptions/c909e979-ef71-4def-a970-bc7c154db8c5/resourceGroups/TestHubRG/providers/Microsoft.CustomerInsights/hubs/sdkTestHub/relationshipLinks/Somelink 
 * ```
 * 
 */
@ResourceType(type="azure-native:customerinsights:RelationshipLink")
public class RelationshipLink extends io.pulumi.resources.CustomResource {
    /**
     * Localized descriptions for the Relationship Link.
     * 
     */
    @OutputExport(name="description", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> description;

    /**
     * @return Localized descriptions for the Relationship Link.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getDescription() {
        return this.description;
    }
    /**
     * Localized display name for the Relationship Link.
     * 
     */
    @OutputExport(name="displayName", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> displayName;

    /**
     * @return Localized display name for the Relationship Link.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getDisplayName() {
        return this.displayName;
    }
    /**
     * The InteractionType associated with the Relationship Link.
     * 
     */
    @OutputExport(name="interactionType", type=String.class, parameters={})
    private Output<String> interactionType;

    /**
     * @return The InteractionType associated with the Relationship Link.
     * 
     */
    public Output<String> getInteractionType() {
        return this.interactionType;
    }
    /**
     * The name of the Relationship Link.
     * 
     */
    @OutputExport(name="linkName", type=String.class, parameters={})
    private Output<String> linkName;

    /**
     * @return The name of the Relationship Link.
     * 
     */
    public Output<String> getLinkName() {
        return this.linkName;
    }
    /**
     * The mappings between Interaction and Relationship fields.
     * 
     */
    @OutputExport(name="mappings", type=List.class, parameters={RelationshipLinkFieldMappingResponse.class})
    private Output</* @Nullable */ List<RelationshipLinkFieldMappingResponse>> mappings;

    /**
     * @return The mappings between Interaction and Relationship fields.
     * 
     */
    public Output</* @Nullable */ List<RelationshipLinkFieldMappingResponse>> getMappings() {
        return this.mappings;
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
     * The property references for the Profile of the Relationship.
     * 
     */
    @OutputExport(name="profilePropertyReferences", type=List.class, parameters={ParticipantProfilePropertyReferenceResponse.class})
    private Output<List<ParticipantProfilePropertyReferenceResponse>> profilePropertyReferences;

    /**
     * @return The property references for the Profile of the Relationship.
     * 
     */
    public Output<List<ParticipantProfilePropertyReferenceResponse>> getProfilePropertyReferences() {
        return this.profilePropertyReferences;
    }
    /**
     * Provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The property references for the Related Profile of the Relationship.
     * 
     */
    @OutputExport(name="relatedProfilePropertyReferences", type=List.class, parameters={ParticipantProfilePropertyReferenceResponse.class})
    private Output<List<ParticipantProfilePropertyReferenceResponse>> relatedProfilePropertyReferences;

    /**
     * @return The property references for the Related Profile of the Relationship.
     * 
     */
    public Output<List<ParticipantProfilePropertyReferenceResponse>> getRelatedProfilePropertyReferences() {
        return this.relatedProfilePropertyReferences;
    }
    /**
     * The relationship guid id.
     * 
     */
    @OutputExport(name="relationshipGuidId", type=String.class, parameters={})
    private Output<String> relationshipGuidId;

    /**
     * @return The relationship guid id.
     * 
     */
    public Output<String> getRelationshipGuidId() {
        return this.relationshipGuidId;
    }
    /**
     * The Relationship associated with the Link.
     * 
     */
    @OutputExport(name="relationshipName", type=String.class, parameters={})
    private Output<String> relationshipName;

    /**
     * @return The Relationship associated with the Link.
     * 
     */
    public Output<String> getRelationshipName() {
        return this.relationshipName;
    }
    /**
     * The hub name.
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The hub name.
     * 
     */
    public Output<String> getTenantId() {
        return this.tenantId;
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
        public void apply(RelationshipLinkArgs.Builder a);
    }
    private static io.pulumi.azurenative.customerinsights.RelationshipLinkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.customerinsights.RelationshipLinkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RelationshipLink(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RelationshipLink(String name) {
        this(name, RelationshipLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RelationshipLink(String name, RelationshipLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RelationshipLink(String name, RelationshipLinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:RelationshipLink", name, args == null ? RelationshipLinkArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RelationshipLink(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:RelationshipLink", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:customerinsights/v20170101:RelationshipLink").build()),
                Input.of(Alias.builder().setType("azure-native:customerinsights/v20170426:RelationshipLink").build())
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
    public static RelationshipLink get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RelationshipLink(name, id, options);
    }
}

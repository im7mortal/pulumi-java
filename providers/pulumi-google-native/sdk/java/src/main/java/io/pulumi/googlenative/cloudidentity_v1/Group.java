// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudidentity_v1.GroupArgs;
import io.pulumi.googlenative.cloudidentity_v1.outputs.DynamicGroupMetadataResponse;
import io.pulumi.googlenative.cloudidentity_v1.outputs.EntityKeyResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a Group.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudidentity/v1:Group")
public class Group extends io.pulumi.resources.CustomResource {
    /**
     * The time when the `Group` was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the `Group` was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * An extended description to help users determine the purpose of a `Group`. Must not be longer than 4,096 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An extended description to help users determine the purpose of a `Group`. Must not be longer than 4,096 characters.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The display name of the `Group`.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the `Group`.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Dynamic group metadata like queries and status.
     * 
     */
    @OutputExport(name="dynamicGroupMetadata", type=DynamicGroupMetadataResponse.class, parameters={})
    private Output<DynamicGroupMetadataResponse> dynamicGroupMetadata;

    /**
     * @return Optional. Dynamic group metadata like queries and status.
     * 
     */
    public Output<DynamicGroupMetadataResponse> getDynamicGroupMetadata() {
        return this.dynamicGroupMetadata;
    }
    /**
     * The `EntityKey` of the `Group`.
     * 
     */
    @OutputExport(name="groupKey", type=EntityKeyResponse.class, parameters={})
    private Output<EntityKeyResponse> groupKey;

    /**
     * @return The `EntityKey` of the `Group`.
     * 
     */
    public Output<EntityKeyResponse> getGroupKey() {
        return this.groupKey;
    }
    /**
     * One or more label entries that apply to the Group. Currently supported labels contain a key with an empty value. Google Groups are the default type of group and have a label with a key of `cloudidentity.googleapis.com/groups.discussion_forum` and an empty value. Existing Google Groups can have an additional label with a key of `cloudidentity.googleapis.com/groups.security` and an empty value added to them. **This is an immutable change and the security label cannot be removed once added.** Dynamic groups have a label with a key of `cloudidentity.googleapis.com/groups.dynamic`. Identity-mapped groups for Cloud Search have a label with a key of `system/groups/external` and an empty value.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return One or more label entries that apply to the Group. Currently supported labels contain a key with an empty value. Google Groups are the default type of group and have a label with a key of `cloudidentity.googleapis.com/groups.discussion_forum` and an empty value. Existing Google Groups can have an additional label with a key of `cloudidentity.googleapis.com/groups.security` and an empty value added to them. **This is an immutable change and the security label cannot be removed once added.** Dynamic groups have a label with a key of `cloudidentity.googleapis.com/groups.dynamic`. Identity-mapped groups for Cloud Search have a label with a key of `system/groups/external` and an empty value.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Group`. Shall be of the form `groups/{group}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Group`. Shall be of the form `groups/{group}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Immutable. The resource name of the entity under which this `Group` resides in the Cloud Identity resource hierarchy. Must be of the form `identitysources/{identity_source}` for external- identity-mapped groups or `customers/{customer}` for Google Groups. The `customer` must begin with "C" (for example, 'C046psxkn').
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return Immutable. The resource name of the entity under which this `Group` resides in the Cloud Identity resource hierarchy. Must be of the form `identitysources/{identity_source}` for external- identity-mapped groups or `customers/{customer}` for Google Groups. The `customer` must begin with "C" (for example, 'C046psxkn').
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * The time when the `Group` was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the `Group` was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(GroupArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudidentity_v1.GroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudidentity_v1.GroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Group(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Group(String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(String name, GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, GroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudidentity/v1:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Group(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudidentity/v1:Group", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Group get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, options);
    }
}

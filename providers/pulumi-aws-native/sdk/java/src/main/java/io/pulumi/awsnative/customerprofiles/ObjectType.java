// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.customerprofiles.ObjectTypeArgs;
import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeFieldMap;
import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeKeyMap;
import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An ObjectType resource of Amazon Connect Customer Profiles
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:customerprofiles:ObjectType")
public class ObjectType extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether a profile should be created when data is received.
     * 
     */
    @OutputExport(name="allowProfileCreation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowProfileCreation;

    /**
     * @return Indicates whether a profile should be created when data is received.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowProfileCreation() {
        return this.allowProfileCreation;
    }
    /**
     * The time of this integration got created.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time of this integration got created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Description of the profile object type.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the profile object type.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The unique name of the domain.
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The unique name of the domain.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The default encryption key
     * 
     */
    @OutputExport(name="encryptionKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionKey;

    /**
     * @return The default encryption key
     * 
     */
    public Output</* @Nullable */ String> getEncryptionKey() {
        return this.encryptionKey;
    }
    /**
     * The default number of days until the data within the domain expires.
     * 
     */
    @OutputExport(name="expirationDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> expirationDays;

    /**
     * @return The default number of days until the data within the domain expires.
     * 
     */
    public Output</* @Nullable */ Integer> getExpirationDays() {
        return this.expirationDays;
    }
    /**
     * A list of the name and ObjectType field.
     * 
     */
    @OutputExport(name="fields", type=List.class, parameters={ObjectTypeFieldMap.class})
    private Output</* @Nullable */ List<ObjectTypeFieldMap>> fields;

    /**
     * @return A list of the name and ObjectType field.
     * 
     */
    public Output</* @Nullable */ List<ObjectTypeFieldMap>> getFields() {
        return this.fields;
    }
    /**
     * A list of unique keys that can be used to map data to the profile.
     * 
     */
    @OutputExport(name="keys", type=List.class, parameters={ObjectTypeKeyMap.class})
    private Output</* @Nullable */ List<ObjectTypeKeyMap>> keys;

    /**
     * @return A list of unique keys that can be used to map data to the profile.
     * 
     */
    public Output</* @Nullable */ List<ObjectTypeKeyMap>> getKeys() {
        return this.keys;
    }
    /**
     * The time of this integration got last updated at.
     * 
     */
    @OutputExport(name="lastUpdatedAt", type=String.class, parameters={})
    private Output<String> lastUpdatedAt;

    /**
     * @return The time of this integration got last updated at.
     * 
     */
    public Output<String> getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }
    /**
     * The name of the profile object type.
     * 
     */
    @OutputExport(name="objectTypeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> objectTypeName;

    /**
     * @return The name of the profile object type.
     * 
     */
    public Output</* @Nullable */ String> getObjectTypeName() {
        return this.objectTypeName;
    }
    /**
     * The tags (keys and values) associated with the integration.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ObjectTypeTag.class})
    private Output</* @Nullable */ List<ObjectTypeTag>> tags;

    /**
     * @return The tags (keys and values) associated with the integration.
     * 
     */
    public Output</* @Nullable */ List<ObjectTypeTag>> getTags() {
        return this.tags;
    }
    /**
     * A unique identifier for the object template.
     * 
     */
    @OutputExport(name="templateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateId;

    /**
     * @return A unique identifier for the object template.
     * 
     */
    public Output</* @Nullable */ String> getTemplateId() {
        return this.templateId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectType(String name, ObjectTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:customerprofiles:ObjectType", name, args == null ? ObjectTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ObjectType(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:customerprofiles:ObjectType", name, null, makeResourceOptions(options, id));
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
    public static ObjectType get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ObjectType(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotsitewise.AssetArgs;
import io.pulumi.awsnative.iotsitewise.outputs.AssetHierarchy;
import io.pulumi.awsnative.iotsitewise.outputs.AssetProperty;
import io.pulumi.awsnative.iotsitewise.outputs.AssetTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::IoTSiteWise::Asset
 * 
 */
@ResourceType(type="aws-native:iotsitewise:Asset")
public class Asset extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the asset
     * 
     */
    @OutputExport(name="assetArn", type=String.class, parameters={})
    private Output<String> assetArn;

    /**
     * @return The ARN of the asset
     * 
     */
    public Output<String> getAssetArn() {
        return this.assetArn;
    }
    @OutputExport(name="assetHierarchies", type=List.class, parameters={AssetHierarchy.class})
    private Output</* @Nullable */ List<AssetHierarchy>> assetHierarchies;

    public Output</* @Nullable */ List<AssetHierarchy>> getAssetHierarchies() {
        return this.assetHierarchies;
    }
    /**
     * The ID of the asset
     * 
     */
    @OutputExport(name="assetId", type=String.class, parameters={})
    private Output<String> assetId;

    /**
     * @return The ID of the asset
     * 
     */
    public Output<String> getAssetId() {
        return this.assetId;
    }
    /**
     * The ID of the asset model from which to create the asset.
     * 
     */
    @OutputExport(name="assetModelId", type=String.class, parameters={})
    private Output<String> assetModelId;

    /**
     * @return The ID of the asset model from which to create the asset.
     * 
     */
    public Output<String> getAssetModelId() {
        return this.assetModelId;
    }
    /**
     * A unique, friendly name for the asset.
     * 
     */
    @OutputExport(name="assetName", type=String.class, parameters={})
    private Output<String> assetName;

    /**
     * @return A unique, friendly name for the asset.
     * 
     */
    public Output<String> getAssetName() {
        return this.assetName;
    }
    @OutputExport(name="assetProperties", type=List.class, parameters={AssetProperty.class})
    private Output</* @Nullable */ List<AssetProperty>> assetProperties;

    public Output</* @Nullable */ List<AssetProperty>> getAssetProperties() {
        return this.assetProperties;
    }
    /**
     * A list of key-value pairs that contain metadata for the asset.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={AssetTag.class})
    private Output</* @Nullable */ List<AssetTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset.
     * 
     */
    public Output</* @Nullable */ List<AssetTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Asset(String name, AssetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Asset", name, args == null ? AssetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Asset(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Asset", name, null, makeResourceOptions(options, id));
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
    public static Asset get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Asset(name, id, options);
    }
}

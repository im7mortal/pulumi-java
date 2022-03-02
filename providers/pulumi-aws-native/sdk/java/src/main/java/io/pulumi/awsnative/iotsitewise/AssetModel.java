// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotsitewise.AssetModelArgs;
import io.pulumi.awsnative.iotsitewise.outputs.AssetModelCompositeModel;
import io.pulumi.awsnative.iotsitewise.outputs.AssetModelHierarchy;
import io.pulumi.awsnative.iotsitewise.outputs.AssetModelProperty;
import io.pulumi.awsnative.iotsitewise.outputs.AssetModelTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::IoTSiteWise::AssetModel
 * 
 */
@ResourceType(type="aws-native:iotsitewise:AssetModel")
public class AssetModel extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the asset model, which has the following format.
     * 
     */
    @OutputExport(name="assetModelArn", type=String.class, parameters={})
    private Output<String> assetModelArn;

    /**
     * @return The ARN of the asset model, which has the following format.
     * 
     */
    public Output<String> getAssetModelArn() {
        return this.assetModelArn;
    }
    /**
     * The composite asset models that are part of this asset model. Composite asset models are asset models that contain specific properties.
     * 
     */
    @OutputExport(name="assetModelCompositeModels", type=List.class, parameters={AssetModelCompositeModel.class})
    private Output</* @Nullable */ List<AssetModelCompositeModel>> assetModelCompositeModels;

    /**
     * @return The composite asset models that are part of this asset model. Composite asset models are asset models that contain specific properties.
     * 
     */
    public Output</* @Nullable */ List<AssetModelCompositeModel>> getAssetModelCompositeModels() {
        return this.assetModelCompositeModels;
    }
    /**
     * A description for the asset model.
     * 
     */
    @OutputExport(name="assetModelDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> assetModelDescription;

    /**
     * @return A description for the asset model.
     * 
     */
    public Output</* @Nullable */ String> getAssetModelDescription() {
        return this.assetModelDescription;
    }
    /**
     * The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be children of any other assets created from this asset model. You can specify up to 10 hierarchies per asset model.
     * 
     */
    @OutputExport(name="assetModelHierarchies", type=List.class, parameters={AssetModelHierarchy.class})
    private Output</* @Nullable */ List<AssetModelHierarchy>> assetModelHierarchies;

    /**
     * @return The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be children of any other assets created from this asset model. You can specify up to 10 hierarchies per asset model.
     * 
     */
    public Output</* @Nullable */ List<AssetModelHierarchy>> getAssetModelHierarchies() {
        return this.assetModelHierarchies;
    }
    /**
     * The ID of the asset model.
     * 
     */
    @OutputExport(name="assetModelId", type=String.class, parameters={})
    private Output<String> assetModelId;

    /**
     * @return The ID of the asset model.
     * 
     */
    public Output<String> getAssetModelId() {
        return this.assetModelId;
    }
    /**
     * A unique, friendly name for the asset model.
     * 
     */
    @OutputExport(name="assetModelName", type=String.class, parameters={})
    private Output<String> assetModelName;

    /**
     * @return A unique, friendly name for the asset model.
     * 
     */
    public Output<String> getAssetModelName() {
        return this.assetModelName;
    }
    /**
     * The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    @OutputExport(name="assetModelProperties", type=List.class, parameters={AssetModelProperty.class})
    private Output</* @Nullable */ List<AssetModelProperty>> assetModelProperties;

    /**
     * @return The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    public Output</* @Nullable */ List<AssetModelProperty>> getAssetModelProperties() {
        return this.assetModelProperties;
    }
    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={AssetModelTag.class})
    private Output</* @Nullable */ List<AssetModelTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public Output</* @Nullable */ List<AssetModelTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable AssetModelArgs.Builder a);
    }
    private static io.pulumi.awsnative.iotsitewise.AssetModelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iotsitewise.AssetModelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AssetModel(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AssetModel(String name) {
        this(name, AssetModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AssetModel(String name, @Nullable AssetModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AssetModel(String name, @Nullable AssetModelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:AssetModel", name, args == null ? AssetModelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AssetModel(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:AssetModel", name, null, makeResourceOptions(options, id));
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
    public static AssetModel get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AssetModel(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.recommendationengine_v1beta1.CatalogItemArgs;
import io.pulumi.googlenative.recommendationengine_v1beta1.outputs.GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse;
import io.pulumi.googlenative.recommendationengine_v1beta1.outputs.GoogleCloudRecommendationengineV1beta1FeatureMapResponse;
import io.pulumi.googlenative.recommendationengine_v1beta1.outputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a catalog item.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:recommendationengine/v1beta1:CatalogItem")
public class CatalogItem extends io.pulumi.resources.CustomResource {
    /**
     * Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both ["Shoes & Accessories" -> "Shoes"] and ["Sports & Fitness" -> "Athletic Clothing" -> "Shoes"], it could be represented as: "categoryHierarchies": [ { "categories": ["Shoes & Accessories", "Shoes"]}, { "categories": ["Sports & Fitness", "Athletic Clothing", "Shoes"] } ]
     * 
     */
    @OutputExport(name="categoryHierarchies", type=List.class, parameters={GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse.class})
    private Output<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse>> categoryHierarchies;

    /**
     * @return Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both ["Shoes & Accessories" -> "Shoes"] and ["Sports & Fitness" -> "Athletic Clothing" -> "Shoes"], it could be represented as: "categoryHierarchies": [ { "categories": ["Shoes & Accessories", "Shoes"]}, { "categories": ["Sports & Fitness", "Athletic Clothing", "Shoes"] } ]
     * 
     */
    public Output<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse>> getCategoryHierarchies() {
        return this.categoryHierarchies;
    }
    /**
     * Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
     * 
     */
    @OutputExport(name="itemAttributes", type=GoogleCloudRecommendationengineV1beta1FeatureMapResponse.class, parameters={})
    private Output<GoogleCloudRecommendationengineV1beta1FeatureMapResponse> itemAttributes;

    /**
     * @return Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
     * 
     */
    public Output<GoogleCloudRecommendationengineV1beta1FeatureMapResponse> getItemAttributes() {
        return this.itemAttributes;
    }
    /**
     * Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
     * 
     */
    @OutputExport(name="itemGroupId", type=String.class, parameters={})
    private Output<String> itemGroupId;

    /**
     * @return Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
     * 
     */
    public Output<String> getItemGroupId() {
        return this.itemGroupId;
    }
    /**
     * Optional. Metadata specific to retail products.
     * 
     */
    @OutputExport(name="productMetadata", type=GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse.class, parameters={})
    private Output<GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse> productMetadata;

    /**
     * @return Optional. Metadata specific to retail products.
     * 
     */
    public Output<GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse> getProductMetadata() {
        return this.productMetadata;
    }
    /**
     * Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output<List<String>> tags;

    /**
     * @return Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
     * 
     */
    public Output<List<String>> getTags() {
        return this.tags;
    }
    /**
     * Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
     * 
     */
    @OutputExport(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
     * 
     */
    public Output<String> getTitle() {
        return this.title;
    }

    public interface BuilderApplicator {
        public void apply(CatalogItemArgs.Builder a);
    }
    private static io.pulumi.googlenative.recommendationengine_v1beta1.CatalogItemArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.recommendationengine_v1beta1.CatalogItemArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CatalogItem(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CatalogItem(String name) {
        this(name, CatalogItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CatalogItem(String name, CatalogItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CatalogItem(String name, CatalogItemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:recommendationengine/v1beta1:CatalogItem", name, args == null ? CatalogItemArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CatalogItem(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:recommendationengine/v1beta1:CatalogItem", name, null, makeResourceOptions(options, id));
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
    public static CatalogItem get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CatalogItem(name, id, options);
    }
}

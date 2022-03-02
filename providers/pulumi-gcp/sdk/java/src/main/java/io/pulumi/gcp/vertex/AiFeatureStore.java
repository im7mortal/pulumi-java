// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.vertex.AiFeatureStoreArgs;
import io.pulumi.gcp.vertex.inputs.AiFeatureStoreState;
import io.pulumi.gcp.vertex.outputs.AiFeatureStoreOnlineServingConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Featurestore can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:vertex/aiFeatureStore:AiFeatureStore default projects/{{project}}/locations/{{region}}/featurestores/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vertex/aiFeatureStore:AiFeatureStore default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vertex/aiFeatureStore:AiFeatureStore default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vertex/aiFeatureStore:AiFeatureStore default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:vertex/aiFeatureStore:AiFeatureStore")
public class AiFeatureStore extends io.pulumi.resources.CustomResource {
    /**
     * The timestamp of when the featurestore was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp of when the featurestore was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Used to perform consistent read-modify-write updates.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Used to perform consistent read-modify-write updates.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * If set to true, any EntityTypes and Features for this Featurestore will also be deleted
     * 
     */
    @OutputExport(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return If set to true, any EntityTypes and Features for this Featurestore will also be deleted
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * A set of key/value label pairs to assign to this Featurestore.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this Featurestore.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name of the Featurestore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Featurestore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Config for online serving resources.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="onlineServingConfig", type=AiFeatureStoreOnlineServingConfig.class, parameters={})
    private Output</* @Nullable */ AiFeatureStoreOnlineServingConfig> onlineServingConfig;

    /**
     * @return Config for online serving resources.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AiFeatureStoreOnlineServingConfig> getOnlineServingConfig() {
        return this.onlineServingConfig;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The region of the dataset. eg us-central1
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region of the dataset. eg us-central1
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The timestamp of when the featurestore was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up
     * to nine fractional digits.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp of when the featurestore was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up
     * to nine fractional digits.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable AiFeatureStoreArgs.Builder a);
    }
    private static io.pulumi.gcp.vertex.AiFeatureStoreArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.vertex.AiFeatureStoreArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AiFeatureStore(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AiFeatureStore(String name) {
        this(name, AiFeatureStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AiFeatureStore(String name, @Nullable AiFeatureStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AiFeatureStore(String name, @Nullable AiFeatureStoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiFeatureStore:AiFeatureStore", name, args == null ? AiFeatureStoreArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AiFeatureStore(String name, Input<String> id, @Nullable AiFeatureStoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiFeatureStore:AiFeatureStore", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AiFeatureStore get(String name, Input<String> id, @Nullable AiFeatureStoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AiFeatureStore(name, id, state, options);
    }
}

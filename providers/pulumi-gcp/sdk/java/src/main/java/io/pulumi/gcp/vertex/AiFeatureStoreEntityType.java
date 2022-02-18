// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.vertex.AiFeatureStoreEntityTypeArgs;
import io.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeState;
import io.pulumi.gcp.vertex.outputs.AiFeatureStoreEntityTypeMonitoringConfig;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * FeaturestoreEntitytype can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:vertex/aiFeatureStoreEntityType:AiFeatureStoreEntityType default {{featurestore}}/entityTypes/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:vertex/aiFeatureStoreEntityType:AiFeatureStoreEntityType")
public class AiFeatureStoreEntityType extends io.pulumi.resources.CustomResource {
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
     * The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}.
     * 
     */
    @OutputExport(name="featurestore", type=String.class, parameters={})
    private Output<String> featurestore;

    /**
     * @return The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}.
     * 
     */
    public Output<String> getFeaturestore() {
        return this.featurestore;
    }
    /**
     * A set of key/value label pairs to assign to this EntityType.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this EntityType.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The default monitoring configuration for all Features under this EntityType.
     * If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="monitoringConfig", type=AiFeatureStoreEntityTypeMonitoringConfig.class, parameters={})
    private Output</* @Nullable */ AiFeatureStoreEntityTypeMonitoringConfig> monitoringConfig;

    /**
     * @return The default monitoring configuration for all Features under this EntityType.
     * If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AiFeatureStoreEntityTypeMonitoringConfig> getMonitoringConfig() {
        return this.monitoringConfig;
    }
    /**
     * The name of the EntityType. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the EntityType. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    public Output<String> getName() {
        return this.name;
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

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AiFeatureStoreEntityType(String name, AiFeatureStoreEntityTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiFeatureStoreEntityType:AiFeatureStoreEntityType", name, args == null ? AiFeatureStoreEntityTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AiFeatureStoreEntityType(String name, Input<String> id, @Nullable AiFeatureStoreEntityTypeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiFeatureStoreEntityType:AiFeatureStoreEntityType", name, state, makeResourceOptions(options, id));
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
    public static AiFeatureStoreEntityType get(String name, Input<String> id, @Nullable AiFeatureStoreEntityTypeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AiFeatureStoreEntityType(name, id, state, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gameservices_v1.ConfigArgs;
import io.pulumi.googlenative.gameservices_v1.outputs.FleetConfigResponse;
import io.pulumi.googlenative.gameservices_v1.outputs.ScalingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new game server config in a given project, location, and game server deployment. Game server configs are immutable, and are not applied until referenced in the game server deployment rollout resource.
 * 
 */
@ResourceType(type="google-native:gameservices/v1:Config")
public class Config extends io.pulumi.resources.CustomResource {
    /**
     * The creation time.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The description of the game server config.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the game server config.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
     * 
     */
    @OutputExport(name="fleetConfigs", type=List.class, parameters={FleetConfigResponse.class})
    private Output<List<FleetConfigResponse>> fleetConfigs;

    /**
     * @return FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
     * 
     */
    public Output<List<FleetConfigResponse>> getFleetConfigs() {
        return this.fleetConfigs;
    }
    /**
     * The labels associated with this game server config. Each label is a key-value pair.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this game server config. Each label is a key-value pair.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the game server config, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the game server config, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The autoscaling settings.
     * 
     */
    @OutputExport(name="scalingConfigs", type=List.class, parameters={ScalingConfigResponse.class})
    private Output<List<ScalingConfigResponse>> scalingConfigs;

    /**
     * @return The autoscaling settings.
     * 
     */
    public Output<List<ScalingConfigResponse>> getScalingConfigs() {
        return this.scalingConfigs;
    }
    /**
     * The last-modified time.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last-modified time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(ConfigArgs.Builder a);
    }
    private static io.pulumi.googlenative.gameservices_v1.ConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.gameservices_v1.ConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Config(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Config(String name) {
        this(name, ConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Config(String name, ConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Config(String name, ConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1:Config", name, args == null ? ConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Config(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1:Config", name, null, makeResourceOptions(options, id));
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
    public static Config get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Config(name, id, options);
    }
}

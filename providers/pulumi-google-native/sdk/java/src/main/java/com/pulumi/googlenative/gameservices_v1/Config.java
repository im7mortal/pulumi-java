// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.gameservices_v1.ConfigArgs;
import com.pulumi.googlenative.gameservices_v1.outputs.FleetConfigResponse;
import com.pulumi.googlenative.gameservices_v1.outputs.ScalingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new game server config in a given project, location, and game server deployment. Game server configs are immutable, and are not applied until referenced in the game server deployment rollout resource.
 * 
 */
@ResourceType(type="google-native:gameservices/v1:Config")
public class Config extends com.pulumi.resources.CustomResource {
    /**
     * The creation time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of the game server config.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the game server config.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
     * 
     */
    @Export(name="fleetConfigs", type=List.class, parameters={FleetConfigResponse.class})
    private Output<List<FleetConfigResponse>> fleetConfigs;

    /**
     * @return FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
     * 
     */
    public Output<List<FleetConfigResponse>> fleetConfigs() {
        return this.fleetConfigs;
    }
    /**
     * The labels associated with this game server config. Each label is a key-value pair.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this game server config. Each label is a key-value pair.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The resource name of the game server config, in the following form: `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}/configs/{configId}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the game server config, in the following form: `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}/configs/{configId}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The autoscaling settings.
     * 
     */
    @Export(name="scalingConfigs", type=List.class, parameters={ScalingConfigResponse.class})
    private Output<List<ScalingConfigResponse>> scalingConfigs;

    /**
     * @return The autoscaling settings.
     * 
     */
    public Output<List<ScalingConfigResponse>> scalingConfigs() {
        return this.scalingConfigs;
    }
    /**
     * The last-modified time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last-modified time.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
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
    public Config(String name, ConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1:Config", name, args == null ? ConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Config(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1:Config", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Config get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Config(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.gameservices.GameServerDeploymentArgs;
import io.pulumi.gcp.gameservices.inputs.GameServerDeploymentState;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A game server deployment resource.
 * 
 * To get more information about GameServerDeployment, see:
 * 
 * * [API documentation](https://cloud.google.com/game-servers/docs/reference/rest/v1beta/projects.locations.gameServerDeployments)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/game-servers/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GameServerDeployment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerDeployment:GameServerDeployment default projects/{{project}}/locations/{{location}}/gameServerDeployments/{{deployment_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerDeployment:GameServerDeployment default {{project}}/{{location}}/{{deployment_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerDeployment:GameServerDeployment default {{location}}/{{deployment_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:gameservices/gameServerDeployment:GameServerDeployment")
public class GameServerDeployment extends io.pulumi.resources.CustomResource {
    /**
     * A unique id for the deployment.
     * 
     */
    @OutputExport(name="deploymentId", type=String.class, parameters={})
    private Output<String> deploymentId;

    /**
     * @return A unique id for the deployment.
     * 
     */
    public Output<String> getDeploymentId() {
        return this.deploymentId;
    }
    /**
     * Human readable description of the game server deployment.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Human readable description of the game server deployment.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The labels associated with this game server deployment. Each label is a
     * key-value pair.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The labels associated with this game server deployment. Each label is a
     * key-value pair.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Location of the Deployment.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the Deployment.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The resource id of the game server deployment, eg:
     * 'projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}'. For example,
     * 'projects/my-project/locations/{location}/gameServerDeployments/my-deployment'.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource id of the game server deployment, eg:
     * 'projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}'. For example,
     * 'projects/my-project/locations/{location}/gameServerDeployments/my-deployment'.
     * 
     */
    public Output<String> getName() {
        return this.name;
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

    public interface BuilderApplicator {
        public void apply(GameServerDeploymentArgs.Builder a);
    }
    private static io.pulumi.gcp.gameservices.GameServerDeploymentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.gameservices.GameServerDeploymentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public GameServerDeployment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GameServerDeployment(String name) {
        this(name, GameServerDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GameServerDeployment(String name, GameServerDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GameServerDeployment(String name, GameServerDeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gameservices/gameServerDeployment:GameServerDeployment", name, args == null ? GameServerDeploymentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GameServerDeployment(String name, Input<String> id, @Nullable GameServerDeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gameservices/gameServerDeployment:GameServerDeployment", name, state, makeResourceOptions(options, id));
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
    public static GameServerDeployment get(String name, Input<String> id, @Nullable GameServerDeploymentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GameServerDeployment(name, id, state, options);
    }
}

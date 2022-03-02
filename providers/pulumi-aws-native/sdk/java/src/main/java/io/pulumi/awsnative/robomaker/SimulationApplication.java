// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.robomaker.SimulationApplicationArgs;
import io.pulumi.awsnative.robomaker.outputs.SimulationApplicationRenderingEngine;
import io.pulumi.awsnative.robomaker.outputs.SimulationApplicationRobotSoftwareSuite;
import io.pulumi.awsnative.robomaker.outputs.SimulationApplicationSimulationSoftwareSuite;
import io.pulumi.awsnative.robomaker.outputs.SimulationApplicationSourceConfig;
import io.pulumi.awsnative.robomaker.outputs.SimulationApplicationTags;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:robomaker:SimulationApplication")
public class SimulationApplication extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The current revision id.
     * 
     */
    @OutputExport(name="currentRevisionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> currentRevisionId;

    /**
     * @return The current revision id.
     * 
     */
    public Output</* @Nullable */ String> getCurrentRevisionId() {
        return this.currentRevisionId;
    }
    /**
     * The URI of the Docker image for the robot application.
     * 
     */
    @OutputExport(name="environment", type=String.class, parameters={})
    private Output</* @Nullable */ String> environment;

    /**
     * @return The URI of the Docker image for the robot application.
     * 
     */
    public Output</* @Nullable */ String> getEnvironment() {
        return this.environment;
    }
    /**
     * The name of the simulation application.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the simulation application.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The rendering engine for the simulation application.
     * 
     */
    @OutputExport(name="renderingEngine", type=SimulationApplicationRenderingEngine.class, parameters={})
    private Output</* @Nullable */ SimulationApplicationRenderingEngine> renderingEngine;

    /**
     * @return The rendering engine for the simulation application.
     * 
     */
    public Output</* @Nullable */ SimulationApplicationRenderingEngine> getRenderingEngine() {
        return this.renderingEngine;
    }
    /**
     * The robot software suite used by the simulation application.
     * 
     */
    @OutputExport(name="robotSoftwareSuite", type=SimulationApplicationRobotSoftwareSuite.class, parameters={})
    private Output<SimulationApplicationRobotSoftwareSuite> robotSoftwareSuite;

    /**
     * @return The robot software suite used by the simulation application.
     * 
     */
    public Output<SimulationApplicationRobotSoftwareSuite> getRobotSoftwareSuite() {
        return this.robotSoftwareSuite;
    }
    /**
     * The simulation software suite used by the simulation application.
     * 
     */
    @OutputExport(name="simulationSoftwareSuite", type=SimulationApplicationSimulationSoftwareSuite.class, parameters={})
    private Output<SimulationApplicationSimulationSoftwareSuite> simulationSoftwareSuite;

    /**
     * @return The simulation software suite used by the simulation application.
     * 
     */
    public Output<SimulationApplicationSimulationSoftwareSuite> getSimulationSoftwareSuite() {
        return this.simulationSoftwareSuite;
    }
    /**
     * The sources of the simulation application.
     * 
     */
    @OutputExport(name="sources", type=List.class, parameters={SimulationApplicationSourceConfig.class})
    private Output</* @Nullable */ List<SimulationApplicationSourceConfig>> sources;

    /**
     * @return The sources of the simulation application.
     * 
     */
    public Output</* @Nullable */ List<SimulationApplicationSourceConfig>> getSources() {
        return this.sources;
    }
    @OutputExport(name="tags", type=SimulationApplicationTags.class, parameters={})
    private Output</* @Nullable */ SimulationApplicationTags> tags;

    public Output</* @Nullable */ SimulationApplicationTags> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(SimulationApplicationArgs.Builder a);
    }
    private static io.pulumi.awsnative.robomaker.SimulationApplicationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.robomaker.SimulationApplicationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SimulationApplication(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SimulationApplication(String name) {
        this(name, SimulationApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SimulationApplication(String name, SimulationApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SimulationApplication(String name, SimulationApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:SimulationApplication", name, args == null ? SimulationApplicationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SimulationApplication(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:SimulationApplication", name, null, makeResourceOptions(options, id));
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
    public static SimulationApplication get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SimulationApplication(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.robomaker.RobotApplicationArgs;
import io.pulumi.awsnative.robomaker.outputs.RobotApplicationRobotSoftwareSuite;
import io.pulumi.awsnative.robomaker.outputs.RobotApplicationSourceConfig;
import io.pulumi.awsnative.robomaker.outputs.RobotApplicationTags;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:robomaker:RobotApplication")
public class RobotApplication extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The revision ID of robot application.
     * 
     */
    @OutputExport(name="currentRevisionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> currentRevisionId;

    /**
     * @return The revision ID of robot application.
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
     * The name of the robot application.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the robot application.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="robotSoftwareSuite", type=RobotApplicationRobotSoftwareSuite.class, parameters={})
    private Output<RobotApplicationRobotSoftwareSuite> robotSoftwareSuite;

    public Output<RobotApplicationRobotSoftwareSuite> getRobotSoftwareSuite() {
        return this.robotSoftwareSuite;
    }
    /**
     * The sources of the robot application.
     * 
     */
    @OutputExport(name="sources", type=List.class, parameters={RobotApplicationSourceConfig.class})
    private Output</* @Nullable */ List<RobotApplicationSourceConfig>> sources;

    /**
     * @return The sources of the robot application.
     * 
     */
    public Output</* @Nullable */ List<RobotApplicationSourceConfig>> getSources() {
        return this.sources;
    }
    @OutputExport(name="tags", type=RobotApplicationTags.class, parameters={})
    private Output</* @Nullable */ RobotApplicationTags> tags;

    public Output</* @Nullable */ RobotApplicationTags> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RobotApplication(String name, RobotApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:RobotApplication", name, args == null ? RobotApplicationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RobotApplication(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:RobotApplication", name, null, makeResourceOptions(options, id));
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
    public static RobotApplication get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RobotApplication(name, id, options);
    }
}
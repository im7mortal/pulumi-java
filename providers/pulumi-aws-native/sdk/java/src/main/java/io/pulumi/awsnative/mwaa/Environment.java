// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.mwaa.EnvironmentArgs;
import io.pulumi.awsnative.mwaa.enums.EnvironmentWebserverAccessMode;
import io.pulumi.awsnative.mwaa.outputs.EnvironmentLoggingConfiguration;
import io.pulumi.awsnative.mwaa.outputs.EnvironmentNetworkConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::MWAA::Environment
 * 
 */
@ResourceType(type="aws-native:mwaa:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    /**
     * Key/value pairs representing Airflow configuration variables.
     *     Keys are prefixed by their section:
     * 
     *     [core]
     *     dags_folder={AIRFLOW_HOME}/dags
     *     
     *     Would be represented as
     *     
     *     "core.dags_folder": "{AIRFLOW_HOME}/dags"
     * 
     */
    @OutputExport(name="airflowConfigurationOptions", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> airflowConfigurationOptions;

    /**
     * @return Key/value pairs representing Airflow configuration variables.
     *     Keys are prefixed by their section:
     * 
     *     [core]
     *     dags_folder={AIRFLOW_HOME}/dags
     *     
     *     Would be represented as
     *     
     *     "core.dags_folder": "{AIRFLOW_HOME}/dags"
     * 
     */
    public Output</* @Nullable */ Object> getAirflowConfigurationOptions() {
        return this.airflowConfigurationOptions;
    }
    @OutputExport(name="airflowVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> airflowVersion;

    public Output</* @Nullable */ String> getAirflowVersion() {
        return this.airflowVersion;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="dagS3Path", type=String.class, parameters={})
    private Output</* @Nullable */ String> dagS3Path;

    public Output</* @Nullable */ String> getDagS3Path() {
        return this.dagS3Path;
    }
    @OutputExport(name="environmentClass", type=String.class, parameters={})
    private Output</* @Nullable */ String> environmentClass;

    public Output</* @Nullable */ String> getEnvironmentClass() {
        return this.environmentClass;
    }
    @OutputExport(name="executionRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> executionRoleArn;

    public Output</* @Nullable */ String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }
    @OutputExport(name="kmsKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKey;

    public Output</* @Nullable */ String> getKmsKey() {
        return this.kmsKey;
    }
    @OutputExport(name="loggingConfiguration", type=EnvironmentLoggingConfiguration.class, parameters={})
    private Output</* @Nullable */ EnvironmentLoggingConfiguration> loggingConfiguration;

    public Output</* @Nullable */ EnvironmentLoggingConfiguration> getLoggingConfiguration() {
        return this.loggingConfiguration;
    }
    @OutputExport(name="maxWorkers", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxWorkers;

    public Output</* @Nullable */ Integer> getMaxWorkers() {
        return this.maxWorkers;
    }
    @OutputExport(name="minWorkers", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minWorkers;

    public Output</* @Nullable */ Integer> getMinWorkers() {
        return this.minWorkers;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="networkConfiguration", type=EnvironmentNetworkConfiguration.class, parameters={})
    private Output</* @Nullable */ EnvironmentNetworkConfiguration> networkConfiguration;

    public Output</* @Nullable */ EnvironmentNetworkConfiguration> getNetworkConfiguration() {
        return this.networkConfiguration;
    }
    @OutputExport(name="pluginsS3ObjectVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> pluginsS3ObjectVersion;

    public Output</* @Nullable */ String> getPluginsS3ObjectVersion() {
        return this.pluginsS3ObjectVersion;
    }
    @OutputExport(name="pluginsS3Path", type=String.class, parameters={})
    private Output</* @Nullable */ String> pluginsS3Path;

    public Output</* @Nullable */ String> getPluginsS3Path() {
        return this.pluginsS3Path;
    }
    @OutputExport(name="requirementsS3ObjectVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> requirementsS3ObjectVersion;

    public Output</* @Nullable */ String> getRequirementsS3ObjectVersion() {
        return this.requirementsS3ObjectVersion;
    }
    @OutputExport(name="requirementsS3Path", type=String.class, parameters={})
    private Output</* @Nullable */ String> requirementsS3Path;

    public Output</* @Nullable */ String> getRequirementsS3Path() {
        return this.requirementsS3Path;
    }
    @OutputExport(name="schedulers", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> schedulers;

    public Output</* @Nullable */ Integer> getSchedulers() {
        return this.schedulers;
    }
    @OutputExport(name="sourceBucketArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceBucketArn;

    public Output</* @Nullable */ String> getSourceBucketArn() {
        return this.sourceBucketArn;
    }
    /**
     * A map of tags for the environment.
     * 
     */
    @OutputExport(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    /**
     * @return A map of tags for the environment.
     * 
     */
    public Output</* @Nullable */ Object> getTags() {
        return this.tags;
    }
    @OutputExport(name="webserverAccessMode", type=EnvironmentWebserverAccessMode.class, parameters={})
    private Output</* @Nullable */ EnvironmentWebserverAccessMode> webserverAccessMode;

    public Output</* @Nullable */ EnvironmentWebserverAccessMode> getWebserverAccessMode() {
        return this.webserverAccessMode;
    }
    @OutputExport(name="webserverUrl", type=String.class, parameters={})
    private Output<String> webserverUrl;

    public Output<String> getWebserverUrl() {
        return this.webserverUrl;
    }
    @OutputExport(name="weeklyMaintenanceWindowStart", type=String.class, parameters={})
    private Output</* @Nullable */ String> weeklyMaintenanceWindowStart;

    public Output</* @Nullable */ String> getWeeklyMaintenanceWindowStart() {
        return this.weeklyMaintenanceWindowStart;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable EnvironmentArgs.Builder a);
    }
    private static io.pulumi.awsnative.mwaa.EnvironmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.mwaa.EnvironmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Environment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Environment(String name) {
        this(name, EnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Environment(String name, @Nullable EnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, @Nullable EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:mwaa:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Environment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:mwaa:Environment", name, null, makeResourceOptions(options, id));
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
    public static Environment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, options);
    }
}

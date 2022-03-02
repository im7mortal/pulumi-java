// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.MonitoringConfigArgs;
import io.pulumi.azurenative.databoxedge.outputs.MetricConfigurationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The metric setting details for the role
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:MonitoringConfig myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/{deviceName}/roles/{roleName}/monitoringConfig/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:MonitoringConfig")
public class MonitoringConfig extends io.pulumi.resources.CustomResource {
    /**
     * The metrics configuration details
     * 
     */
    @OutputExport(name="metricConfigurations", type=List.class, parameters={MetricConfigurationResponse.class})
    private Output<List<MetricConfigurationResponse>> metricConfigurations;

    /**
     * @return The metrics configuration details
     * 
     */
    public Output<List<MetricConfigurationResponse>> getMetricConfigurations() {
        return this.metricConfigurations;
    }
    /**
     * The object name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(MonitoringConfigArgs.Builder a);
    }
    private static io.pulumi.azurenative.databoxedge.MonitoringConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.databoxedge.MonitoringConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MonitoringConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MonitoringConfig(String name) {
        this(name, MonitoringConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MonitoringConfig(String name, MonitoringConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MonitoringConfig(String name, MonitoringConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:MonitoringConfig", name, args == null ? MonitoringConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MonitoringConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:MonitoringConfig", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901:MonitoringConfig").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:MonitoringConfig").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20201201:MonitoringConfig").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201:MonitoringConfig").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:MonitoringConfig").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601:MonitoringConfig").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:MonitoringConfig").build())
            ))
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
    public static MonitoringConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MonitoringConfig(name, id, options);
    }
}

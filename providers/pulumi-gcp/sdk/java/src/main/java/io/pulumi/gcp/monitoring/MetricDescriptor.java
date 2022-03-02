// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.monitoring.MetricDescriptorArgs;
import io.pulumi.gcp.monitoring.inputs.MetricDescriptorState;
import io.pulumi.gcp.monitoring.outputs.MetricDescriptorLabel;
import io.pulumi.gcp.monitoring.outputs.MetricDescriptorMetadata;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Defines a metric type and its schema. Once a metric descriptor is created, deleting or altering it stops data collection and makes the metric type's existing data unusable.
 * 
 * To get more information about MetricDescriptor, see:
 * 
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/monitoring/custom-metrics/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * MetricDescriptor can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:monitoring/metricDescriptor:MetricDescriptor default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:monitoring/metricDescriptor:MetricDescriptor")
public class MetricDescriptor extends io.pulumi.resources.CustomResource {
    /**
     * A human-readable description for the label.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A human-readable description for the label.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example "Request count".
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example "Request count".
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="labels", type=List.class, parameters={MetricDescriptorLabel.class})
    private Output</* @Nullable */ List<MetricDescriptorLabel>> labels;

    /**
     * @return The set of labels that can be used to describe a specific instance of this metric type. In order to delete a label, the entire resource must be deleted, then created with the desired labels.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<MetricDescriptorLabel>> getLabels() {
        return this.labels;
    }
    /**
     * The launch stage of the metric definition.
     * Possible values are `LAUNCH_STAGE_UNSPECIFIED`, `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
     * 
     */
    @OutputExport(name="launchStage", type=String.class, parameters={})
    private Output</* @Nullable */ String> launchStage;

    /**
     * @return The launch stage of the metric definition.
     * Possible values are `LAUNCH_STAGE_UNSPECIFIED`, `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
     * 
     */
    public Output</* @Nullable */ String> getLaunchStage() {
        return this.launchStage;
    }
    /**
     * Metadata which can be used to guide usage of the metric.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="metadata", type=MetricDescriptorMetadata.class, parameters={})
    private Output</* @Nullable */ MetricDescriptorMetadata> metadata;

    /**
     * @return Metadata which can be used to guide usage of the metric.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ MetricDescriptorMetadata> getMetadata() {
        return this.metadata;
    }
    /**
     * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metricKind and valueType might not be supported.
     * Possible values are `METRIC_KIND_UNSPECIFIED`, `GAUGE`, `DELTA`, and `CUMULATIVE`.
     * 
     */
    @OutputExport(name="metricKind", type=String.class, parameters={})
    private Output<String> metricKind;

    /**
     * @return Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metricKind and valueType might not be supported.
     * Possible values are `METRIC_KIND_UNSPECIFIED`, `GAUGE`, `DELTA`, and `CUMULATIVE`.
     * 
     */
    public Output<String> getMetricKind() {
        return this.metricKind;
    }
    /**
     * If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that
     * is associated with this metric type can only be associated with one of the monitored resource types listed here. This
     * field allows time series to be associated with the intersection of this metric type and the monitored resource types in
     * this list.
     * 
     */
    @OutputExport(name="monitoredResourceTypes", type=List.class, parameters={String.class})
    private Output<List<String>> monitoredResourceTypes;

    /**
     * @return If present, then a time series, which is identified partially by a metric type and a MonitoredResourceDescriptor, that
     * is associated with this metric type can only be associated with one of the monitored resource types listed here. This
     * field allows time series to be associated with the intersection of this metric type and the monitored resource types in
     * this list.
     * 
     */
    public Output<List<String>> getMonitoredResourceTypes() {
        return this.monitoredResourceTypes;
    }
    /**
     * The resource name of the metric descriptor.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the metric descriptor.
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
    /**
     * The metric type, including its DNS name prefix. The type is not URL-encoded. All service defined metrics must be prefixed with the service name, in the format of {service name}/{relative metric name}, such as cloudsql.googleapis.com/database/cpu/utilization. The relative metric name must have only upper and lower-case letters, digits, '/' and underscores '_' are allowed. Additionally, the maximum number of characters allowed for the relative_metric_name is 100. All user-defined metric types have the DNS name custom.googleapis.com, external.googleapis.com, or logging.googleapis.com/user/.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The metric type, including its DNS name prefix. The type is not URL-encoded. All service defined metrics must be prefixed with the service name, in the format of {service name}/{relative metric name}, such as cloudsql.googleapis.com/database/cpu/utilization. The relative metric name must have only upper and lower-case letters, digits, '/' and underscores '_' are allowed. Additionally, the maximum number of characters allowed for the relative_metric_name is 100. All user-defined metric types have the DNS name custom.googleapis.com, external.googleapis.com, or logging.googleapis.com/user/.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The units in which the metric value is reported. It is only applicable if the
     * valueType is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of
     * the stored metric values.
     * Different systems may scale the values to be more easily displayed (so a value of
     * 0.02KBy might be displayed as 20By, and a value of 3523KBy might be displayed as
     * 3.5MBy). However, if the unit is KBy, then the value of the metric is always in
     * thousands of bytes, no matter how it may be displayed.
     * If you want a custom metric to record the exact number of CPU-seconds used by a job,
     * you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently
     * 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as
     * 12005.
     * Alternatively, if you want a custom metric to record data in a more granular way, you
     * can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value
     * 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).
     * The supported units are a subset of The Unified Code for Units of Measure standard.
     * More info can be found in the API documentation
     * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors).
     * 
     */
    @OutputExport(name="unit", type=String.class, parameters={})
    private Output</* @Nullable */ String> unit;

    /**
     * @return The units in which the metric value is reported. It is only applicable if the
     * valueType is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of
     * the stored metric values.
     * Different systems may scale the values to be more easily displayed (so a value of
     * 0.02KBy might be displayed as 20By, and a value of 3523KBy might be displayed as
     * 3.5MBy). However, if the unit is KBy, then the value of the metric is always in
     * thousands of bytes, no matter how it may be displayed.
     * If you want a custom metric to record the exact number of CPU-seconds used by a job,
     * you can create an INT64 CUMULATIVE metric whose unit is s{CPU} (or equivalently
     * 1s{CPU} or just s). If the job uses 12,005 CPU-seconds, then the value is written as
     * 12005.
     * Alternatively, if you want a custom metric to record data in a more granular way, you
     * can create a DOUBLE CUMULATIVE metric whose unit is ks{CPU}, and then write the value
     * 12.005 (which is 12005/1000), or use Kis{CPU} and write 11.723 (which is 12005/1024).
     * The supported units are a subset of The Unified Code for Units of Measure standard.
     * More info can be found in the API documentation
     * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors).
     * 
     */
    public Output</* @Nullable */ String> getUnit() {
        return this.unit;
    }
    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    @OutputExport(name="valueType", type=String.class, parameters={})
    private Output<String> valueType;

    /**
     * @return The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    public Output<String> getValueType() {
        return this.valueType;
    }

    public interface BuilderApplicator {
        public void apply(MetricDescriptorArgs.Builder a);
    }
    private static io.pulumi.gcp.monitoring.MetricDescriptorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.monitoring.MetricDescriptorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MetricDescriptor(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetricDescriptor(String name) {
        this(name, MetricDescriptorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetricDescriptor(String name, MetricDescriptorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetricDescriptor(String name, MetricDescriptorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/metricDescriptor:MetricDescriptor", name, args == null ? MetricDescriptorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MetricDescriptor(String name, Input<String> id, @Nullable MetricDescriptorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/metricDescriptor:MetricDescriptor", name, state, makeResourceOptions(options, id));
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
    public static MetricDescriptor get(String name, Input<String> id, @Nullable MetricDescriptorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MetricDescriptor(name, id, state, options);
    }
}

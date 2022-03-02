// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.BandwidthScheduleArgs;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The bandwidth schedule details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:BandwidthSchedule bandwidth-1 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/bandwidthSchedules/bandwidth-1 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:BandwidthSchedule")
public class BandwidthSchedule extends io.pulumi.resources.CustomResource {
    /**
     * The days of the week when this schedule is applicable.
     * 
     */
    @OutputExport(name="days", type=List.class, parameters={String.class})
    private Output<List<String>> days;

    /**
     * @return The days of the week when this schedule is applicable.
     * 
     */
    public Output<List<String>> getDays() {
        return this.days;
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
     * The bandwidth rate in Mbps.
     * 
     */
    @OutputExport(name="rateInMbps", type=Integer.class, parameters={})
    private Output<Integer> rateInMbps;

    /**
     * @return The bandwidth rate in Mbps.
     * 
     */
    public Output<Integer> getRateInMbps() {
        return this.rateInMbps;
    }
    /**
     * The start time of the schedule in UTC.
     * 
     */
    @OutputExport(name="start", type=String.class, parameters={})
    private Output<String> start;

    /**
     * @return The start time of the schedule in UTC.
     * 
     */
    public Output<String> getStart() {
        return this.start;
    }
    /**
     * The stop time of the schedule in UTC.
     * 
     */
    @OutputExport(name="stop", type=String.class, parameters={})
    private Output<String> stop;

    /**
     * @return The stop time of the schedule in UTC.
     * 
     */
    public Output<String> getStop() {
        return this.stop;
    }
    /**
     * Bandwidth object related to ASE resource
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Bandwidth object related to ASE resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
        public void apply(BandwidthScheduleArgs.Builder a);
    }
    private static io.pulumi.azurenative.databoxedge.BandwidthScheduleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.databoxedge.BandwidthScheduleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BandwidthSchedule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BandwidthSchedule(String name) {
        this(name, BandwidthScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BandwidthSchedule(String name, BandwidthScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BandwidthSchedule(String name, BandwidthScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:BandwidthSchedule", name, args == null ? BandwidthScheduleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BandwidthSchedule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:BandwidthSchedule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190301:BandwidthSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190701:BandwidthSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190801:BandwidthSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200501preview:BandwidthSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901:BandwidthSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:BandwidthSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20201201:BandwidthSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201:BandwidthSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:BandwidthSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601:BandwidthSchedule").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:BandwidthSchedule").build())
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
    public static BandwidthSchedule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BandwidthSchedule(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.SpotFleetRequestArgs;
import io.pulumi.aws.ec2.inputs.SpotFleetRequestState;
import io.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchSpecification;
import io.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchTemplateConfig;
import io.pulumi.aws.ec2.outputs.SpotFleetRequestSpotMaintenanceStrategies;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Spot Fleet Requests can be imported using `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/spotFleetRequest:SpotFleetRequest fleet sfr-005e9ec8-5546-4c31-b317-31a62325411e
 * ```
 * 
 */
@ResourceType(type="aws:ec2/spotFleetRequest:SpotFleetRequest")
public class SpotFleetRequest extends io.pulumi.resources.CustomResource {
    /**
     * Indicates how to allocate the target capacity across
     * the Spot pools specified by the Spot fleet request. The default is
     * `lowestPrice`.
     * 
     */
    @OutputExport(name="allocationStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> allocationStrategy;

    /**
     * @return Indicates how to allocate the target capacity across
     * the Spot pools specified by the Spot fleet request. The default is
     * `lowestPrice`.
     * 
     */
    public Output</* @Nullable */ String> getAllocationStrategy() {
        return this.allocationStrategy;
    }
    @OutputExport(name="clientToken", type=String.class, parameters={})
    private Output<String> clientToken;

    public Output<String> getClientToken() {
        return this.clientToken;
    }
    /**
     * Indicates whether running Spot
     * instances should be terminated if the target capacity of the Spot fleet
     * request is decreased below the current size of the Spot fleet.
     * 
     */
    @OutputExport(name="excessCapacityTerminationPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> excessCapacityTerminationPolicy;

    /**
     * @return Indicates whether running Spot
     * instances should be terminated if the target capacity of the Spot fleet
     * request is decreased below the current size of the Spot fleet.
     * 
     */
    public Output</* @Nullable */ String> getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }
    /**
     * The type of fleet request. Indicates whether the Spot Fleet only requests the target
     * capacity or also attempts to maintain it. Default is `maintain`.
     * 
     */
    @OutputExport(name="fleetType", type=String.class, parameters={})
    private Output</* @Nullable */ String> fleetType;

    /**
     * @return The type of fleet request. Indicates whether the Spot Fleet only requests the target
     * capacity or also attempts to maintain it. Default is `maintain`.
     * 
     */
    public Output</* @Nullable */ String> getFleetType() {
        return this.fleetType;
    }
    /**
     * Grants the Spot fleet permission to terminate
     * Spot instances on your behalf when you cancel its Spot fleet request using
     * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
     * terminateInstancesWithExpiration.
     * 
     */
    @OutputExport(name="iamFleetRole", type=String.class, parameters={})
    private Output<String> iamFleetRole;

    /**
     * @return Grants the Spot fleet permission to terminate
     * Spot instances on your behalf when you cancel its Spot fleet request using
     * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
     * terminateInstancesWithExpiration.
     * 
     */
    public Output<String> getIamFleetRole() {
        return this.iamFleetRole;
    }
    /**
     * Indicates whether a Spot
     * instance stops or terminates when it is interrupted. Default is
     * `terminate`.
     * 
     */
    @OutputExport(name="instanceInterruptionBehaviour", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceInterruptionBehaviour;

    /**
     * @return Indicates whether a Spot
     * instance stops or terminates when it is interrupted. Default is
     * `terminate`.
     * 
     */
    public Output</* @Nullable */ String> getInstanceInterruptionBehaviour() {
        return this.instanceInterruptionBehaviour;
    }
    /**
     * The number of Spot pools across which to allocate your target Spot capacity.
     * Valid only when `allocation_strategy` is set to `lowestPrice`. Spot Fleet selects
     * the cheapest Spot pools and evenly allocates your target Spot capacity across
     * the number of Spot pools that you specify.
     * 
     */
    @OutputExport(name="instancePoolsToUseCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instancePoolsToUseCount;

    /**
     * @return The number of Spot pools across which to allocate your target Spot capacity.
     * Valid only when `allocation_strategy` is set to `lowestPrice`. Spot Fleet selects
     * the cheapest Spot pools and evenly allocates your target Spot capacity across
     * the number of Spot pools that you specify.
     * 
     */
    public Output</* @Nullable */ Integer> getInstancePoolsToUseCount() {
        return this.instancePoolsToUseCount;
    }
    /**
     * Used to define the launch configuration of the
     * spot-fleet request. Can be specified multiple times to define different bids
     * across different markets and instance types. Conflicts with `launch_template_config`. At least one of `launch_specification` or `launch_template_config` is required.
     * 
     */
    @OutputExport(name="launchSpecifications", type=List.class, parameters={SpotFleetRequestLaunchSpecification.class})
    private Output</* @Nullable */ List<SpotFleetRequestLaunchSpecification>> launchSpecifications;

    /**
     * @return Used to define the launch configuration of the
     * spot-fleet request. Can be specified multiple times to define different bids
     * across different markets and instance types. Conflicts with `launch_template_config`. At least one of `launch_specification` or `launch_template_config` is required.
     * 
     */
    public Output</* @Nullable */ List<SpotFleetRequestLaunchSpecification>> getLaunchSpecifications() {
        return this.launchSpecifications;
    }
    /**
     * Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launch_specification`. At least one of `launch_specification` or `launch_template_config` is required.
     * 
     */
    @OutputExport(name="launchTemplateConfigs", type=List.class, parameters={SpotFleetRequestLaunchTemplateConfig.class})
    private Output</* @Nullable */ List<SpotFleetRequestLaunchTemplateConfig>> launchTemplateConfigs;

    /**
     * @return Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launch_specification`. At least one of `launch_specification` or `launch_template_config` is required.
     * 
     */
    public Output</* @Nullable */ List<SpotFleetRequestLaunchTemplateConfig>> getLaunchTemplateConfigs() {
        return this.launchTemplateConfigs;
    }
    /**
     * A list of elastic load balancer names to add to the Spot fleet.
     * 
     */
    @OutputExport(name="loadBalancers", type=List.class, parameters={String.class})
    private Output<List<String>> loadBalancers;

    /**
     * @return A list of elastic load balancer names to add to the Spot fleet.
     * 
     */
    public Output<List<String>> getLoadBalancers() {
        return this.loadBalancers;
    }
    /**
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. the possible values are: `lowestPrice` and `prioritized`. the default is `lowestPrice`.
     * 
     */
    @OutputExport(name="onDemandAllocationStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> onDemandAllocationStrategy;

    /**
     * @return The order of the launch template overrides to use in fulfilling On-Demand capacity. the possible values are: `lowestPrice` and `prioritized`. the default is `lowestPrice`.
     * 
     */
    public Output</* @Nullable */ String> getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy;
    }
    /**
     * The maximum amount per hour for On-Demand Instances that you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
     * 
     */
    @OutputExport(name="onDemandMaxTotalPrice", type=String.class, parameters={})
    private Output</* @Nullable */ String> onDemandMaxTotalPrice;

    /**
     * @return The maximum amount per hour for On-Demand Instances that you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
     * 
     */
    public Output</* @Nullable */ String> getOnDemandMaxTotalPrice() {
        return this.onDemandMaxTotalPrice;
    }
    /**
     * The number of On-Demand units to request. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
     * 
     */
    @OutputExport(name="onDemandTargetCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> onDemandTargetCapacity;

    /**
     * @return The number of On-Demand units to request. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
     * 
     */
    public Output</* @Nullable */ Integer> getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity;
    }
    /**
     * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
     * 
     */
    @OutputExport(name="replaceUnhealthyInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> replaceUnhealthyInstances;

    /**
     * @return Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances;
    }
    /**
     * Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * 
     */
    @OutputExport(name="spotMaintenanceStrategies", type=SpotFleetRequestSpotMaintenanceStrategies.class, parameters={})
    private Output</* @Nullable */ SpotFleetRequestSpotMaintenanceStrategies> spotMaintenanceStrategies;

    /**
     * @return Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * 
     */
    public Output</* @Nullable */ SpotFleetRequestSpotMaintenanceStrategies> getSpotMaintenanceStrategies() {
        return this.spotMaintenanceStrategies;
    }
    /**
     * The maximum spot bid for this override request.
     * 
     */
    @OutputExport(name="spotPrice", type=String.class, parameters={})
    private Output</* @Nullable */ String> spotPrice;

    /**
     * @return The maximum spot bid for this override request.
     * 
     */
    public Output</* @Nullable */ String> getSpotPrice() {
        return this.spotPrice;
    }
    /**
     * The state of the Spot fleet request.
     * 
     */
    @OutputExport(name="spotRequestState", type=String.class, parameters={})
    private Output<String> spotRequestState;

    /**
     * @return The state of the Spot fleet request.
     * 
     */
    public Output<String> getSpotRequestState() {
        return this.spotRequestState;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The number of units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     * 
     */
    @OutputExport(name="targetCapacity", type=Integer.class, parameters={})
    private Output<Integer> targetCapacity;

    /**
     * @return The number of units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     * 
     */
    public Output<Integer> getTargetCapacity() {
        return this.targetCapacity;
    }
    /**
     * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     * 
     */
    @OutputExport(name="targetGroupArns", type=List.class, parameters={String.class})
    private Output<List<String>> targetGroupArns;

    /**
     * @return A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     * 
     */
    public Output<List<String>> getTargetGroupArns() {
        return this.targetGroupArns;
    }
    /**
     * Indicates whether running Spot
     * instances should be terminated when the Spot fleet request expires.
     * 
     */
    @OutputExport(name="terminateInstancesWithExpiration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminateInstancesWithExpiration;

    /**
     * @return Indicates whether running Spot
     * instances should be terminated when the Spot fleet request expires.
     * 
     */
    public Output</* @Nullable */ Boolean> getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }
    /**
     * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
     * 
     */
    @OutputExport(name="validFrom", type=String.class, parameters={})
    private Output</* @Nullable */ String> validFrom;

    /**
     * @return The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
     * 
     */
    public Output</* @Nullable */ String> getValidFrom() {
        return this.validFrom;
    }
    /**
     * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
     * 
     */
    @OutputExport(name="validUntil", type=String.class, parameters={})
    private Output</* @Nullable */ String> validUntil;

    /**
     * @return The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
     * 
     */
    public Output</* @Nullable */ String> getValidUntil() {
        return this.validUntil;
    }
    /**
     * If set, this provider will
     * wait for the Spot Request to be fulfilled, and will throw an error if the
     * timeout of 10m is reached.
     * 
     */
    @OutputExport(name="waitForFulfillment", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> waitForFulfillment;

    /**
     * @return If set, this provider will
     * wait for the Spot Request to be fulfilled, and will throw an error if the
     * timeout of 10m is reached.
     * 
     */
    public Output</* @Nullable */ Boolean> getWaitForFulfillment() {
        return this.waitForFulfillment;
    }

    public interface BuilderApplicator {
        public void apply(SpotFleetRequestArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.SpotFleetRequestArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.SpotFleetRequestArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SpotFleetRequest(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpotFleetRequest(String name) {
        this(name, SpotFleetRequestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpotFleetRequest(String name, SpotFleetRequestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpotFleetRequest(String name, SpotFleetRequestArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/spotFleetRequest:SpotFleetRequest", name, args == null ? SpotFleetRequestArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SpotFleetRequest(String name, Input<String> id, @Nullable SpotFleetRequestState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/spotFleetRequest:SpotFleetRequest", name, state, makeResourceOptions(options, id));
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
    public static SpotFleetRequest get(String name, Input<String> id, @Nullable SpotFleetRequestState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SpotFleetRequest(name, id, state, options);
    }
}

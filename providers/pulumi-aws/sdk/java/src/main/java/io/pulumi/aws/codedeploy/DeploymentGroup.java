// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codedeploy.DeploymentGroupArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupState;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupAlarmConfiguration;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupAutoRollbackConfiguration;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupBlueGreenDeploymentConfig;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupDeploymentStyle;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupEc2TagFilter;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupEc2TagSet;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupEcsService;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfo;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupOnPremisesInstanceTagFilter;
import io.pulumi.aws.codedeploy.outputs.DeploymentGroupTriggerConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a CodeDeploy Deployment Group for a CodeDeploy Application
 * 
 * > **NOTE on blue/green deployments:** When using `green_fleet_provisioning_option` with the `COPY_AUTO_SCALING_GROUP` action, CodeDeploy will create a new ASG with a different name. This ASG is _not_ managed by this provider and will conflict with existing configuration and state. You may want to use a different approach to managing deployments that involve multiple ASG, such as `DISCOVER_EXISTING` with separate blue and green ASG.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodeDeploy Deployment Groups can be imported by their `app_name`, a colon, and `deployment_group_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codedeploy/deploymentGroup:DeploymentGroup example my-application:my-deployment-group
 * ```
 * 
 *  [1]http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html
 * 
 */
@ResourceType(type="aws:codedeploy/deploymentGroup:DeploymentGroup")
public class DeploymentGroup extends io.pulumi.resources.CustomResource {
    /**
     * Configuration block of alarms associated with the deployment group (documented below).
     * 
     */
    @OutputExport(name="alarmConfiguration", type=DeploymentGroupAlarmConfiguration.class, parameters={})
    private Output</* @Nullable */ DeploymentGroupAlarmConfiguration> alarmConfiguration;

    /**
     * @return Configuration block of alarms associated with the deployment group (documented below).
     * 
     */
    public Output</* @Nullable */ DeploymentGroupAlarmConfiguration> getAlarmConfiguration() {
        return this.alarmConfiguration;
    }
    /**
     * The name of the application.
     * 
     */
    @OutputExport(name="appName", type=String.class, parameters={})
    private Output<String> appName;

    /**
     * @return The name of the application.
     * 
     */
    public Output<String> getAppName() {
        return this.appName;
    }
    /**
     * The ARN of the CodeDeploy deployment group.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the CodeDeploy deployment group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
     * 
     */
    @OutputExport(name="autoRollbackConfiguration", type=DeploymentGroupAutoRollbackConfiguration.class, parameters={})
    private Output</* @Nullable */ DeploymentGroupAutoRollbackConfiguration> autoRollbackConfiguration;

    /**
     * @return Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
     * 
     */
    public Output</* @Nullable */ DeploymentGroupAutoRollbackConfiguration> getAutoRollbackConfiguration() {
        return this.autoRollbackConfiguration;
    }
    /**
     * Autoscaling groups associated with the deployment group.
     * 
     */
    @OutputExport(name="autoscalingGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> autoscalingGroups;

    /**
     * @return Autoscaling groups associated with the deployment group.
     * 
     */
    public Output</* @Nullable */ List<String>> getAutoscalingGroups() {
        return this.autoscalingGroups;
    }
    /**
     * Configuration block of the blue/green deployment options for a deployment group (documented below).
     * 
     */
    @OutputExport(name="blueGreenDeploymentConfig", type=DeploymentGroupBlueGreenDeploymentConfig.class, parameters={})
    private Output<DeploymentGroupBlueGreenDeploymentConfig> blueGreenDeploymentConfig;

    /**
     * @return Configuration block of the blue/green deployment options for a deployment group (documented below).
     * 
     */
    public Output<DeploymentGroupBlueGreenDeploymentConfig> getBlueGreenDeploymentConfig() {
        return this.blueGreenDeploymentConfig;
    }
    /**
     * The destination platform type for the deployment.
     * 
     */
    @OutputExport(name="computePlatform", type=String.class, parameters={})
    private Output<String> computePlatform;

    /**
     * @return The destination platform type for the deployment.
     * 
     */
    public Output<String> getComputePlatform() {
        return this.computePlatform;
    }
    /**
     * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
     * 
     */
    @OutputExport(name="deploymentConfigName", type=String.class, parameters={})
    private Output</* @Nullable */ String> deploymentConfigName;

    /**
     * @return The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
     * 
     */
    public Output</* @Nullable */ String> getDeploymentConfigName() {
        return this.deploymentConfigName;
    }
    /**
     * The ID of the CodeDeploy deployment group.
     * 
     */
    @OutputExport(name="deploymentGroupId", type=String.class, parameters={})
    private Output<String> deploymentGroupId;

    /**
     * @return The ID of the CodeDeploy deployment group.
     * 
     */
    public Output<String> getDeploymentGroupId() {
        return this.deploymentGroupId;
    }
    /**
     * The name of the deployment group.
     * 
     */
    @OutputExport(name="deploymentGroupName", type=String.class, parameters={})
    private Output<String> deploymentGroupName;

    /**
     * @return The name of the deployment group.
     * 
     */
    public Output<String> getDeploymentGroupName() {
        return this.deploymentGroupName;
    }
    /**
     * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
     * 
     */
    @OutputExport(name="deploymentStyle", type=DeploymentGroupDeploymentStyle.class, parameters={})
    private Output</* @Nullable */ DeploymentGroupDeploymentStyle> deploymentStyle;

    /**
     * @return Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
     * 
     */
    public Output</* @Nullable */ DeploymentGroupDeploymentStyle> getDeploymentStyle() {
        return this.deploymentStyle;
    }
    /**
     * Tag filters associated with the deployment group. See the AWS docs for details.
     * 
     */
    @OutputExport(name="ec2TagFilters", type=List.class, parameters={DeploymentGroupEc2TagFilter.class})
    private Output</* @Nullable */ List<DeploymentGroupEc2TagFilter>> ec2TagFilters;

    /**
     * @return Tag filters associated with the deployment group. See the AWS docs for details.
     * 
     */
    public Output</* @Nullable */ List<DeploymentGroupEc2TagFilter>> getEc2TagFilters() {
        return this.ec2TagFilters;
    }
    /**
     * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
     * 
     */
    @OutputExport(name="ec2TagSets", type=List.class, parameters={DeploymentGroupEc2TagSet.class})
    private Output</* @Nullable */ List<DeploymentGroupEc2TagSet>> ec2TagSets;

    /**
     * @return Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
     * 
     */
    public Output</* @Nullable */ List<DeploymentGroupEc2TagSet>> getEc2TagSets() {
        return this.ec2TagSets;
    }
    /**
     * Configuration block(s) of the ECS services for a deployment group (documented below).
     * 
     */
    @OutputExport(name="ecsService", type=DeploymentGroupEcsService.class, parameters={})
    private Output</* @Nullable */ DeploymentGroupEcsService> ecsService;

    /**
     * @return Configuration block(s) of the ECS services for a deployment group (documented below).
     * 
     */
    public Output</* @Nullable */ DeploymentGroupEcsService> getEcsService() {
        return this.ecsService;
    }
    /**
     * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
     * 
     */
    @OutputExport(name="loadBalancerInfo", type=DeploymentGroupLoadBalancerInfo.class, parameters={})
    private Output</* @Nullable */ DeploymentGroupLoadBalancerInfo> loadBalancerInfo;

    /**
     * @return Single configuration block of the load balancer to use in a blue/green deployment (documented below).
     * 
     */
    public Output</* @Nullable */ DeploymentGroupLoadBalancerInfo> getLoadBalancerInfo() {
        return this.loadBalancerInfo;
    }
    /**
     * On premise tag filters associated with the group. See the AWS docs for details.
     * 
     */
    @OutputExport(name="onPremisesInstanceTagFilters", type=List.class, parameters={DeploymentGroupOnPremisesInstanceTagFilter.class})
    private Output</* @Nullable */ List<DeploymentGroupOnPremisesInstanceTagFilter>> onPremisesInstanceTagFilters;

    /**
     * @return On premise tag filters associated with the group. See the AWS docs for details.
     * 
     */
    public Output</* @Nullable */ List<DeploymentGroupOnPremisesInstanceTagFilter>> getOnPremisesInstanceTagFilters() {
        return this.onPremisesInstanceTagFilters;
    }
    /**
     * The service role ARN that allows deployments.
     * 
     */
    @OutputExport(name="serviceRoleArn", type=String.class, parameters={})
    private Output<String> serviceRoleArn;

    /**
     * @return The service role ARN that allows deployments.
     * 
     */
    public Output<String> getServiceRoleArn() {
        return this.serviceRoleArn;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Configuration block(s) of the triggers for the deployment group (documented below).
     * 
     */
    @OutputExport(name="triggerConfigurations", type=List.class, parameters={DeploymentGroupTriggerConfiguration.class})
    private Output</* @Nullable */ List<DeploymentGroupTriggerConfiguration>> triggerConfigurations;

    /**
     * @return Configuration block(s) of the triggers for the deployment group (documented below).
     * 
     */
    public Output</* @Nullable */ List<DeploymentGroupTriggerConfiguration>> getTriggerConfigurations() {
        return this.triggerConfigurations;
    }

    public interface BuilderApplicator {
        public void apply(DeploymentGroupArgs.Builder a);
    }
    private static io.pulumi.aws.codedeploy.DeploymentGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.codedeploy.DeploymentGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DeploymentGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentGroup(String name) {
        this(name, DeploymentGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentGroup(String name, DeploymentGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentGroup(String name, DeploymentGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codedeploy/deploymentGroup:DeploymentGroup", name, args == null ? DeploymentGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DeploymentGroup(String name, Input<String> id, @Nullable DeploymentGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codedeploy/deploymentGroup:DeploymentGroup", name, state, makeResourceOptions(options, id));
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
    public static DeploymentGroup get(String name, Input<String> id, @Nullable DeploymentGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentGroup(name, id, state, options);
    }
}

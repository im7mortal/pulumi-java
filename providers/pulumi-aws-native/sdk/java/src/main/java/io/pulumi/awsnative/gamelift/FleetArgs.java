// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift;

import io.pulumi.awsnative.gamelift.enums.FleetNewGameSessionProtectionPolicy;
import io.pulumi.awsnative.gamelift.enums.FleetType;
import io.pulumi.awsnative.gamelift.inputs.FleetCertificateConfigurationArgs;
import io.pulumi.awsnative.gamelift.inputs.FleetIpPermissionArgs;
import io.pulumi.awsnative.gamelift.inputs.FleetLocationConfigurationArgs;
import io.pulumi.awsnative.gamelift.inputs.FleetResourceCreationLimitPolicyArgs;
import io.pulumi.awsnative.gamelift.inputs.FleetRuntimeConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetArgs Empty = new FleetArgs();

    /**
     * A unique identifier for a build to be deployed on the new fleet. If you are deploying the fleet with a custom game build, you must specify this property. The build must have been successfully uploaded to Amazon GameLift and be in a READY status. This fleet setting cannot be changed once the fleet is created.
     * 
     */
    @InputImport(name="buildId")
    private final @Nullable Input<String> buildId;

    public Input<String> getBuildId() {
        return this.buildId == null ? Input.empty() : this.buildId;
    }

    /**
     * Indicates whether to generate a TLS/SSL certificate for the new fleet. TLS certificates are used for encrypting traffic between game clients and game servers running on GameLift. If this parameter is not set, certificate generation is disabled. This fleet setting cannot be changed once the fleet is created.
     * 
     */
    @InputImport(name="certificateConfiguration")
    private final @Nullable Input<FleetCertificateConfigurationArgs> certificateConfiguration;

    public Input<FleetCertificateConfigurationArgs> getCertificateConfiguration() {
        return this.certificateConfiguration == null ? Input.empty() : this.certificateConfiguration;
    }

    /**
     * A human-readable description of a fleet.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * [DEPRECATED] The number of EC2 instances that you want this fleet to host. When creating a new fleet, GameLift automatically sets this value to "1" and initiates a single instance. Once the fleet is active, update this value to trigger GameLift to add or remove instances from the fleet.
     * 
     */
    @InputImport(name="desiredEC2Instances")
    private final @Nullable Input<Integer> desiredEC2Instances;

    public Input<Integer> getDesiredEC2Instances() {
        return this.desiredEC2Instances == null ? Input.empty() : this.desiredEC2Instances;
    }

    /**
     * A range of IP addresses and port settings that allow inbound traffic to connect to server processes on an Amazon GameLift server.
     * 
     */
    @InputImport(name="eC2InboundPermissions")
    private final @Nullable Input<List<FleetIpPermissionArgs>> eC2InboundPermissions;

    public Input<List<FleetIpPermissionArgs>> getEC2InboundPermissions() {
        return this.eC2InboundPermissions == null ? Input.empty() : this.eC2InboundPermissions;
    }

    /**
     * The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
     * 
     */
    @InputImport(name="eC2InstanceType")
    private final @Nullable Input<String> eC2InstanceType;

    public Input<String> getEC2InstanceType() {
        return this.eC2InstanceType == null ? Input.empty() : this.eC2InstanceType;
    }

    /**
     * Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is ON_DEMAND. Both categories of instances use identical hardware and configurations based on the instance type selected for this fleet.
     * 
     */
    @InputImport(name="fleetType")
    private final @Nullable Input<FleetType> fleetType;

    public Input<FleetType> getFleetType() {
        return this.fleetType == null ? Input.empty() : this.fleetType;
    }

    /**
     * A unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set, any application that runs on an instance in this fleet can assume the role, including install scripts, server processes, and daemons (background processes). Create a role or look up a role's ARN from the IAM dashboard in the AWS Management Console.
     * 
     */
    @InputImport(name="instanceRoleARN")
    private final @Nullable Input<String> instanceRoleARN;

    public Input<String> getInstanceRoleARN() {
        return this.instanceRoleARN == null ? Input.empty() : this.instanceRoleARN;
    }

    @InputImport(name="locations")
    private final @Nullable Input<List<FleetLocationConfigurationArgs>> locations;

    public Input<List<FleetLocationConfigurationArgs>> getLocations() {
        return this.locations == null ? Input.empty() : this.locations;
    }

    /**
     * This parameter is no longer used. When hosting a custom game build, specify where Amazon GameLift should store log files using the Amazon GameLift server API call ProcessReady()
     * 
     */
    @InputImport(name="logPaths")
    private final @Nullable Input<List<String>> logPaths;

    public Input<List<String>> getLogPaths() {
        return this.logPaths == null ? Input.empty() : this.logPaths;
    }

    /**
     * [DEPRECATED] The maximum value that is allowed for the fleet's instance count. When creating a new fleet, GameLift automatically sets this value to "1". Once the fleet is active, you can change this value.
     * 
     */
    @InputImport(name="maxSize")
    private final @Nullable Input<Integer> maxSize;

    public Input<Integer> getMaxSize() {
        return this.maxSize == null ? Input.empty() : this.maxSize;
    }

    /**
     * The name of an Amazon CloudWatch metric group. A metric group aggregates the metrics for all fleets in the group. Specify a string containing the metric group name. You can use an existing name or use a new name to create a new metric group. Currently, this parameter can have only one string.
     * 
     */
    @InputImport(name="metricGroups")
    private final @Nullable Input<List<String>> metricGroups;

    public Input<List<String>> getMetricGroups() {
        return this.metricGroups == null ? Input.empty() : this.metricGroups;
    }

    /**
     * [DEPRECATED] The minimum value allowed for the fleet's instance count. When creating a new fleet, GameLift automatically sets this value to "0". After the fleet is active, you can change this value.
     * 
     */
    @InputImport(name="minSize")
    private final @Nullable Input<Integer> minSize;

    public Input<Integer> getMinSize() {
        return this.minSize == null ? Input.empty() : this.minSize;
    }

    /**
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A game session protection policy to apply to all game sessions hosted on instances in this fleet. When protected, active game sessions cannot be terminated during a scale-down event. If this parameter is not set, instances in this fleet default to no protection. You can change a fleet's protection policy to affect future game sessions on the fleet. You can also set protection for individual game sessions.
     * 
     */
    @InputImport(name="newGameSessionProtectionPolicy")
    private final @Nullable Input<FleetNewGameSessionProtectionPolicy> newGameSessionProtectionPolicy;

    public Input<FleetNewGameSessionProtectionPolicy> getNewGameSessionProtectionPolicy() {
        return this.newGameSessionProtectionPolicy == null ? Input.empty() : this.newGameSessionProtectionPolicy;
    }

    /**
     * A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can find your account ID in the AWS Management Console under account settings.
     * 
     */
    @InputImport(name="peerVpcAwsAccountId")
    private final @Nullable Input<String> peerVpcAwsAccountId;

    public Input<String> getPeerVpcAwsAccountId() {
        return this.peerVpcAwsAccountId == null ? Input.empty() : this.peerVpcAwsAccountId;
    }

    /**
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same Region as your fleet. To look up a VPC ID, use the VPC Dashboard in the AWS Management Console.
     * 
     */
    @InputImport(name="peerVpcId")
    private final @Nullable Input<String> peerVpcId;

    public Input<String> getPeerVpcId() {
        return this.peerVpcId == null ? Input.empty() : this.peerVpcId;
    }

    /**
     * A policy that limits the number of game sessions an individual player can create over a span of time for this fleet.
     * 
     */
    @InputImport(name="resourceCreationLimitPolicy")
    private final @Nullable Input<FleetResourceCreationLimitPolicyArgs> resourceCreationLimitPolicy;

    public Input<FleetResourceCreationLimitPolicyArgs> getResourceCreationLimitPolicy() {
        return this.resourceCreationLimitPolicy == null ? Input.empty() : this.resourceCreationLimitPolicy;
    }

    /**
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom game build executable or a Realtime script. The runtime configuration defines the server executables or launch script file, launch parameters, and the number of processes to run concurrently on each instance. When creating a fleet, the runtime configuration must have at least one server process configuration; otherwise the request fails with an invalid request exception.
     * 
     * This parameter is required unless the parameters ServerLaunchPath and ServerLaunchParameters are defined. Runtime configuration has replaced these parameters, but fleets that use them will continue to work.
     * 
     */
    @InputImport(name="runtimeConfiguration")
    private final @Nullable Input<FleetRuntimeConfigurationArgs> runtimeConfiguration;

    public Input<FleetRuntimeConfigurationArgs> getRuntimeConfiguration() {
        return this.runtimeConfiguration == null ? Input.empty() : this.runtimeConfiguration;
    }

    /**
     * A unique identifier for a Realtime script to be deployed on a new Realtime Servers fleet. The script must have been successfully uploaded to Amazon GameLift. This fleet setting cannot be changed once the fleet is created.
     * 
     * Note: It is not currently possible to use the !Ref command to reference a script created with a CloudFormation template for the fleet property ScriptId. Instead, use Fn::GetAtt Script.Arn or Fn::GetAtt Script.Id to retrieve either of these properties as input for ScriptId. Alternatively, enter a ScriptId string manually.
     * 
     */
    @InputImport(name="scriptId")
    private final @Nullable Input<String> scriptId;

    public Input<String> getScriptId() {
        return this.scriptId == null ? Input.empty() : this.scriptId;
    }

    /**
     * This parameter is no longer used but is retained for backward compatibility. Instead, specify server launch parameters in the RuntimeConfiguration parameter. A request must specify either a runtime configuration or values for both ServerLaunchParameters and ServerLaunchPath.
     * 
     */
    @InputImport(name="serverLaunchParameters")
    private final @Nullable Input<String> serverLaunchParameters;

    public Input<String> getServerLaunchParameters() {
        return this.serverLaunchParameters == null ? Input.empty() : this.serverLaunchParameters;
    }

    /**
     * This parameter is no longer used. Instead, specify a server launch path using the RuntimeConfiguration parameter. Requests that specify a server launch path and launch parameters instead of a runtime configuration will continue to work.
     * 
     */
    @InputImport(name="serverLaunchPath")
    private final @Nullable Input<String> serverLaunchPath;

    public Input<String> getServerLaunchPath() {
        return this.serverLaunchPath == null ? Input.empty() : this.serverLaunchPath;
    }

    public FleetArgs(
        @Nullable Input<String> buildId,
        @Nullable Input<FleetCertificateConfigurationArgs> certificateConfiguration,
        @Nullable Input<String> description,
        @Nullable Input<Integer> desiredEC2Instances,
        @Nullable Input<List<FleetIpPermissionArgs>> eC2InboundPermissions,
        @Nullable Input<String> eC2InstanceType,
        @Nullable Input<FleetType> fleetType,
        @Nullable Input<String> instanceRoleARN,
        @Nullable Input<List<FleetLocationConfigurationArgs>> locations,
        @Nullable Input<List<String>> logPaths,
        @Nullable Input<Integer> maxSize,
        @Nullable Input<List<String>> metricGroups,
        @Nullable Input<Integer> minSize,
        @Nullable Input<String> name,
        @Nullable Input<FleetNewGameSessionProtectionPolicy> newGameSessionProtectionPolicy,
        @Nullable Input<String> peerVpcAwsAccountId,
        @Nullable Input<String> peerVpcId,
        @Nullable Input<FleetResourceCreationLimitPolicyArgs> resourceCreationLimitPolicy,
        @Nullable Input<FleetRuntimeConfigurationArgs> runtimeConfiguration,
        @Nullable Input<String> scriptId,
        @Nullable Input<String> serverLaunchParameters,
        @Nullable Input<String> serverLaunchPath) {
        this.buildId = buildId;
        this.certificateConfiguration = certificateConfiguration;
        this.description = description;
        this.desiredEC2Instances = desiredEC2Instances;
        this.eC2InboundPermissions = eC2InboundPermissions;
        this.eC2InstanceType = eC2InstanceType;
        this.fleetType = fleetType;
        this.instanceRoleARN = instanceRoleARN;
        this.locations = locations;
        this.logPaths = logPaths;
        this.maxSize = maxSize;
        this.metricGroups = metricGroups;
        this.minSize = minSize;
        this.name = name;
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
        this.peerVpcAwsAccountId = peerVpcAwsAccountId;
        this.peerVpcId = peerVpcId;
        this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
        this.runtimeConfiguration = runtimeConfiguration;
        this.scriptId = scriptId;
        this.serverLaunchParameters = serverLaunchParameters;
        this.serverLaunchPath = serverLaunchPath;
    }

    private FleetArgs() {
        this.buildId = Input.empty();
        this.certificateConfiguration = Input.empty();
        this.description = Input.empty();
        this.desiredEC2Instances = Input.empty();
        this.eC2InboundPermissions = Input.empty();
        this.eC2InstanceType = Input.empty();
        this.fleetType = Input.empty();
        this.instanceRoleARN = Input.empty();
        this.locations = Input.empty();
        this.logPaths = Input.empty();
        this.maxSize = Input.empty();
        this.metricGroups = Input.empty();
        this.minSize = Input.empty();
        this.name = Input.empty();
        this.newGameSessionProtectionPolicy = Input.empty();
        this.peerVpcAwsAccountId = Input.empty();
        this.peerVpcId = Input.empty();
        this.resourceCreationLimitPolicy = Input.empty();
        this.runtimeConfiguration = Input.empty();
        this.scriptId = Input.empty();
        this.serverLaunchParameters = Input.empty();
        this.serverLaunchPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> buildId;
        private @Nullable Input<FleetCertificateConfigurationArgs> certificateConfiguration;
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> desiredEC2Instances;
        private @Nullable Input<List<FleetIpPermissionArgs>> eC2InboundPermissions;
        private @Nullable Input<String> eC2InstanceType;
        private @Nullable Input<FleetType> fleetType;
        private @Nullable Input<String> instanceRoleARN;
        private @Nullable Input<List<FleetLocationConfigurationArgs>> locations;
        private @Nullable Input<List<String>> logPaths;
        private @Nullable Input<Integer> maxSize;
        private @Nullable Input<List<String>> metricGroups;
        private @Nullable Input<Integer> minSize;
        private @Nullable Input<String> name;
        private @Nullable Input<FleetNewGameSessionProtectionPolicy> newGameSessionProtectionPolicy;
        private @Nullable Input<String> peerVpcAwsAccountId;
        private @Nullable Input<String> peerVpcId;
        private @Nullable Input<FleetResourceCreationLimitPolicyArgs> resourceCreationLimitPolicy;
        private @Nullable Input<FleetRuntimeConfigurationArgs> runtimeConfiguration;
        private @Nullable Input<String> scriptId;
        private @Nullable Input<String> serverLaunchParameters;
        private @Nullable Input<String> serverLaunchPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildId = defaults.buildId;
    	      this.certificateConfiguration = defaults.certificateConfiguration;
    	      this.description = defaults.description;
    	      this.desiredEC2Instances = defaults.desiredEC2Instances;
    	      this.eC2InboundPermissions = defaults.eC2InboundPermissions;
    	      this.eC2InstanceType = defaults.eC2InstanceType;
    	      this.fleetType = defaults.fleetType;
    	      this.instanceRoleARN = defaults.instanceRoleARN;
    	      this.locations = defaults.locations;
    	      this.logPaths = defaults.logPaths;
    	      this.maxSize = defaults.maxSize;
    	      this.metricGroups = defaults.metricGroups;
    	      this.minSize = defaults.minSize;
    	      this.name = defaults.name;
    	      this.newGameSessionProtectionPolicy = defaults.newGameSessionProtectionPolicy;
    	      this.peerVpcAwsAccountId = defaults.peerVpcAwsAccountId;
    	      this.peerVpcId = defaults.peerVpcId;
    	      this.resourceCreationLimitPolicy = defaults.resourceCreationLimitPolicy;
    	      this.runtimeConfiguration = defaults.runtimeConfiguration;
    	      this.scriptId = defaults.scriptId;
    	      this.serverLaunchParameters = defaults.serverLaunchParameters;
    	      this.serverLaunchPath = defaults.serverLaunchPath;
        }

        public Builder setBuildId(@Nullable Input<String> buildId) {
            this.buildId = buildId;
            return this;
        }

        public Builder setBuildId(@Nullable String buildId) {
            this.buildId = Input.ofNullable(buildId);
            return this;
        }

        public Builder setCertificateConfiguration(@Nullable Input<FleetCertificateConfigurationArgs> certificateConfiguration) {
            this.certificateConfiguration = certificateConfiguration;
            return this;
        }

        public Builder setCertificateConfiguration(@Nullable FleetCertificateConfigurationArgs certificateConfiguration) {
            this.certificateConfiguration = Input.ofNullable(certificateConfiguration);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDesiredEC2Instances(@Nullable Input<Integer> desiredEC2Instances) {
            this.desiredEC2Instances = desiredEC2Instances;
            return this;
        }

        public Builder setDesiredEC2Instances(@Nullable Integer desiredEC2Instances) {
            this.desiredEC2Instances = Input.ofNullable(desiredEC2Instances);
            return this;
        }

        public Builder setEC2InboundPermissions(@Nullable Input<List<FleetIpPermissionArgs>> eC2InboundPermissions) {
            this.eC2InboundPermissions = eC2InboundPermissions;
            return this;
        }

        public Builder setEC2InboundPermissions(@Nullable List<FleetIpPermissionArgs> eC2InboundPermissions) {
            this.eC2InboundPermissions = Input.ofNullable(eC2InboundPermissions);
            return this;
        }

        public Builder setEC2InstanceType(@Nullable Input<String> eC2InstanceType) {
            this.eC2InstanceType = eC2InstanceType;
            return this;
        }

        public Builder setEC2InstanceType(@Nullable String eC2InstanceType) {
            this.eC2InstanceType = Input.ofNullable(eC2InstanceType);
            return this;
        }

        public Builder setFleetType(@Nullable Input<FleetType> fleetType) {
            this.fleetType = fleetType;
            return this;
        }

        public Builder setFleetType(@Nullable FleetType fleetType) {
            this.fleetType = Input.ofNullable(fleetType);
            return this;
        }

        public Builder setInstanceRoleARN(@Nullable Input<String> instanceRoleARN) {
            this.instanceRoleARN = instanceRoleARN;
            return this;
        }

        public Builder setInstanceRoleARN(@Nullable String instanceRoleARN) {
            this.instanceRoleARN = Input.ofNullable(instanceRoleARN);
            return this;
        }

        public Builder setLocations(@Nullable Input<List<FleetLocationConfigurationArgs>> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setLocations(@Nullable List<FleetLocationConfigurationArgs> locations) {
            this.locations = Input.ofNullable(locations);
            return this;
        }

        public Builder setLogPaths(@Nullable Input<List<String>> logPaths) {
            this.logPaths = logPaths;
            return this;
        }

        public Builder setLogPaths(@Nullable List<String> logPaths) {
            this.logPaths = Input.ofNullable(logPaths);
            return this;
        }

        public Builder setMaxSize(@Nullable Input<Integer> maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        public Builder setMaxSize(@Nullable Integer maxSize) {
            this.maxSize = Input.ofNullable(maxSize);
            return this;
        }

        public Builder setMetricGroups(@Nullable Input<List<String>> metricGroups) {
            this.metricGroups = metricGroups;
            return this;
        }

        public Builder setMetricGroups(@Nullable List<String> metricGroups) {
            this.metricGroups = Input.ofNullable(metricGroups);
            return this;
        }

        public Builder setMinSize(@Nullable Input<Integer> minSize) {
            this.minSize = minSize;
            return this;
        }

        public Builder setMinSize(@Nullable Integer minSize) {
            this.minSize = Input.ofNullable(minSize);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNewGameSessionProtectionPolicy(@Nullable Input<FleetNewGameSessionProtectionPolicy> newGameSessionProtectionPolicy) {
            this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
            return this;
        }

        public Builder setNewGameSessionProtectionPolicy(@Nullable FleetNewGameSessionProtectionPolicy newGameSessionProtectionPolicy) {
            this.newGameSessionProtectionPolicy = Input.ofNullable(newGameSessionProtectionPolicy);
            return this;
        }

        public Builder setPeerVpcAwsAccountId(@Nullable Input<String> peerVpcAwsAccountId) {
            this.peerVpcAwsAccountId = peerVpcAwsAccountId;
            return this;
        }

        public Builder setPeerVpcAwsAccountId(@Nullable String peerVpcAwsAccountId) {
            this.peerVpcAwsAccountId = Input.ofNullable(peerVpcAwsAccountId);
            return this;
        }

        public Builder setPeerVpcId(@Nullable Input<String> peerVpcId) {
            this.peerVpcId = peerVpcId;
            return this;
        }

        public Builder setPeerVpcId(@Nullable String peerVpcId) {
            this.peerVpcId = Input.ofNullable(peerVpcId);
            return this;
        }

        public Builder setResourceCreationLimitPolicy(@Nullable Input<FleetResourceCreationLimitPolicyArgs> resourceCreationLimitPolicy) {
            this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
            return this;
        }

        public Builder setResourceCreationLimitPolicy(@Nullable FleetResourceCreationLimitPolicyArgs resourceCreationLimitPolicy) {
            this.resourceCreationLimitPolicy = Input.ofNullable(resourceCreationLimitPolicy);
            return this;
        }

        public Builder setRuntimeConfiguration(@Nullable Input<FleetRuntimeConfigurationArgs> runtimeConfiguration) {
            this.runtimeConfiguration = runtimeConfiguration;
            return this;
        }

        public Builder setRuntimeConfiguration(@Nullable FleetRuntimeConfigurationArgs runtimeConfiguration) {
            this.runtimeConfiguration = Input.ofNullable(runtimeConfiguration);
            return this;
        }

        public Builder setScriptId(@Nullable Input<String> scriptId) {
            this.scriptId = scriptId;
            return this;
        }

        public Builder setScriptId(@Nullable String scriptId) {
            this.scriptId = Input.ofNullable(scriptId);
            return this;
        }

        public Builder setServerLaunchParameters(@Nullable Input<String> serverLaunchParameters) {
            this.serverLaunchParameters = serverLaunchParameters;
            return this;
        }

        public Builder setServerLaunchParameters(@Nullable String serverLaunchParameters) {
            this.serverLaunchParameters = Input.ofNullable(serverLaunchParameters);
            return this;
        }

        public Builder setServerLaunchPath(@Nullable Input<String> serverLaunchPath) {
            this.serverLaunchPath = serverLaunchPath;
            return this;
        }

        public Builder setServerLaunchPath(@Nullable String serverLaunchPath) {
            this.serverLaunchPath = Input.ofNullable(serverLaunchPath);
            return this;
        }

        public FleetArgs build() {
            return new FleetArgs(buildId, certificateConfiguration, description, desiredEC2Instances, eC2InboundPermissions, eC2InstanceType, fleetType, instanceRoleARN, locations, logPaths, maxSize, metricGroups, minSize, name, newGameSessionProtectionPolicy, peerVpcAwsAccountId, peerVpcId, resourceCreationLimitPolicy, runtimeConfiguration, scriptId, serverLaunchParameters, serverLaunchPath);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling;

import io.pulumi.awsnative.autoscaling.inputs.LaunchConfigurationBlockDeviceMappingArgs;
import io.pulumi.awsnative.autoscaling.inputs.LaunchConfigurationMetadataOptionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationArgs Empty = new LaunchConfigurationArgs();

    /**
     * For Auto Scaling groups that are running in a virtual private cloud (VPC), specifies whether to assign a public IP address to the group's instances.
     * 
     */
    @InputImport(name="associatePublicIpAddress")
    private final @Nullable Input<Boolean> associatePublicIpAddress;

    public Input<Boolean> getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress == null ? Input.empty() : this.associatePublicIpAddress;
    }

    /**
     * Specifies how block devices are exposed to the instance. You can specify virtual devices and EBS volumes.
     * 
     */
    @InputImport(name="blockDeviceMappings")
    private final @Nullable Input<List<LaunchConfigurationBlockDeviceMappingArgs>> blockDeviceMappings;

    public Input<List<LaunchConfigurationBlockDeviceMappingArgs>> getBlockDeviceMappings() {
        return this.blockDeviceMappings == null ? Input.empty() : this.blockDeviceMappings;
    }

    /**
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to.
     * 
     */
    @InputImport(name="classicLinkVPCId")
    private final @Nullable Input<String> classicLinkVPCId;

    public Input<String> getClassicLinkVPCId() {
        return this.classicLinkVPCId == null ? Input.empty() : this.classicLinkVPCId;
    }

    /**
     * The IDs of one or more security groups for the VPC that you specified in the ClassicLinkVPCId property.
     * 
     */
    @InputImport(name="classicLinkVPCSecurityGroups")
    private final @Nullable Input<List<String>> classicLinkVPCSecurityGroups;

    public Input<List<String>> getClassicLinkVPCSecurityGroups() {
        return this.classicLinkVPCSecurityGroups == null ? Input.empty() : this.classicLinkVPCSecurityGroups;
    }

    /**
     * Specifies whether the launch configuration is optimized for EBS I/O (true) or not (false).
     * 
     */
    @InputImport(name="ebsOptimized")
    private final @Nullable Input<Boolean> ebsOptimized;

    public Input<Boolean> getEbsOptimized() {
        return this.ebsOptimized == null ? Input.empty() : this.ebsOptimized;
    }

    /**
     * Provides the name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role.
     * 
     */
    @InputImport(name="iamInstanceProfile")
    private final @Nullable Input<String> iamInstanceProfile;

    public Input<String> getIamInstanceProfile() {
        return this.iamInstanceProfile == null ? Input.empty() : this.iamInstanceProfile;
    }

    /**
     * Provides the unique ID of the Amazon Machine Image (AMI) that was assigned during registration.
     * 
     */
    @InputImport(name="imageId", required=true)
    private final Input<String> imageId;

    public Input<String> getImageId() {
        return this.imageId;
    }

    /**
     * The ID of the Amazon EC2 instance you want to use to create the launch configuration.
     * 
     */
    @InputImport(name="instanceId")
    private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    /**
     * Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring.
     * 
     */
    @InputImport(name="instanceMonitoring")
    private final @Nullable Input<Boolean> instanceMonitoring;

    public Input<Boolean> getInstanceMonitoring() {
        return this.instanceMonitoring == null ? Input.empty() : this.instanceMonitoring;
    }

    /**
     * Specifies the instance type of the EC2 instance.
     * 
     */
    @InputImport(name="instanceType", required=true)
    private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * Provides the ID of the kernel associated with the EC2 AMI.
     * 
     */
    @InputImport(name="kernelId")
    private final @Nullable Input<String> kernelId;

    public Input<String> getKernelId() {
        return this.kernelId == null ? Input.empty() : this.kernelId;
    }

    /**
     * Provides the name of the EC2 key pair.
     * 
     */
    @InputImport(name="keyName")
    private final @Nullable Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName == null ? Input.empty() : this.keyName;
    }

    /**
     * The name of the launch configuration. This name must be unique per Region per account.
     * 
     */
    @InputImport(name="launchConfigurationName")
    private final @Nullable Input<String> launchConfigurationName;

    public Input<String> getLaunchConfigurationName() {
        return this.launchConfigurationName == null ? Input.empty() : this.launchConfigurationName;
    }

    /**
     * The metadata options for the instances.
     * 
     */
    @InputImport(name="metadataOptions")
    private final @Nullable Input<LaunchConfigurationMetadataOptionsArgs> metadataOptions;

    public Input<LaunchConfigurationMetadataOptionsArgs> getMetadataOptions() {
        return this.metadataOptions == null ? Input.empty() : this.metadataOptions;
    }

    /**
     * The tenancy of the instance, either default or dedicated.
     * 
     */
    @InputImport(name="placementTenancy")
    private final @Nullable Input<String> placementTenancy;

    public Input<String> getPlacementTenancy() {
        return this.placementTenancy == null ? Input.empty() : this.placementTenancy;
    }

    /**
     * The ID of the RAM disk to select.
     * 
     */
    @InputImport(name="ramDiskId")
    private final @Nullable Input<String> ramDiskId;

    public Input<String> getRamDiskId() {
        return this.ramDiskId == null ? Input.empty() : this.ramDiskId;
    }

    /**
     * A list that contains the security groups to assign to the instances in the Auto Scaling group.
     * 
     */
    @InputImport(name="securityGroups")
    private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * The maximum hourly price you are willing to pay for any Spot Instances launched to fulfill the request.
     * 
     */
    @InputImport(name="spotPrice")
    private final @Nullable Input<String> spotPrice;

    public Input<String> getSpotPrice() {
        return this.spotPrice == null ? Input.empty() : this.spotPrice;
    }

    /**
     * The Base64-encoded user data to make available to the launched EC2 instances.
     * 
     */
    @InputImport(name="userData")
    private final @Nullable Input<String> userData;

    public Input<String> getUserData() {
        return this.userData == null ? Input.empty() : this.userData;
    }

    public LaunchConfigurationArgs(
        @Nullable Input<Boolean> associatePublicIpAddress,
        @Nullable Input<List<LaunchConfigurationBlockDeviceMappingArgs>> blockDeviceMappings,
        @Nullable Input<String> classicLinkVPCId,
        @Nullable Input<List<String>> classicLinkVPCSecurityGroups,
        @Nullable Input<Boolean> ebsOptimized,
        @Nullable Input<String> iamInstanceProfile,
        Input<String> imageId,
        @Nullable Input<String> instanceId,
        @Nullable Input<Boolean> instanceMonitoring,
        Input<String> instanceType,
        @Nullable Input<String> kernelId,
        @Nullable Input<String> keyName,
        @Nullable Input<String> launchConfigurationName,
        @Nullable Input<LaunchConfigurationMetadataOptionsArgs> metadataOptions,
        @Nullable Input<String> placementTenancy,
        @Nullable Input<String> ramDiskId,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<String> spotPrice,
        @Nullable Input<String> userData) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        this.blockDeviceMappings = blockDeviceMappings;
        this.classicLinkVPCId = classicLinkVPCId;
        this.classicLinkVPCSecurityGroups = classicLinkVPCSecurityGroups;
        this.ebsOptimized = ebsOptimized;
        this.iamInstanceProfile = iamInstanceProfile;
        this.imageId = Objects.requireNonNull(imageId, "expected parameter 'imageId' to be non-null");
        this.instanceId = instanceId;
        this.instanceMonitoring = instanceMonitoring;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.kernelId = kernelId;
        this.keyName = keyName;
        this.launchConfigurationName = launchConfigurationName;
        this.metadataOptions = metadataOptions;
        this.placementTenancy = placementTenancy;
        this.ramDiskId = ramDiskId;
        this.securityGroups = securityGroups;
        this.spotPrice = spotPrice;
        this.userData = userData;
    }

    private LaunchConfigurationArgs() {
        this.associatePublicIpAddress = Input.empty();
        this.blockDeviceMappings = Input.empty();
        this.classicLinkVPCId = Input.empty();
        this.classicLinkVPCSecurityGroups = Input.empty();
        this.ebsOptimized = Input.empty();
        this.iamInstanceProfile = Input.empty();
        this.imageId = Input.empty();
        this.instanceId = Input.empty();
        this.instanceMonitoring = Input.empty();
        this.instanceType = Input.empty();
        this.kernelId = Input.empty();
        this.keyName = Input.empty();
        this.launchConfigurationName = Input.empty();
        this.metadataOptions = Input.empty();
        this.placementTenancy = Input.empty();
        this.ramDiskId = Input.empty();
        this.securityGroups = Input.empty();
        this.spotPrice = Input.empty();
        this.userData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> associatePublicIpAddress;
        private @Nullable Input<List<LaunchConfigurationBlockDeviceMappingArgs>> blockDeviceMappings;
        private @Nullable Input<String> classicLinkVPCId;
        private @Nullable Input<List<String>> classicLinkVPCSecurityGroups;
        private @Nullable Input<Boolean> ebsOptimized;
        private @Nullable Input<String> iamInstanceProfile;
        private Input<String> imageId;
        private @Nullable Input<String> instanceId;
        private @Nullable Input<Boolean> instanceMonitoring;
        private Input<String> instanceType;
        private @Nullable Input<String> kernelId;
        private @Nullable Input<String> keyName;
        private @Nullable Input<String> launchConfigurationName;
        private @Nullable Input<LaunchConfigurationMetadataOptionsArgs> metadataOptions;
        private @Nullable Input<String> placementTenancy;
        private @Nullable Input<String> ramDiskId;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<String> spotPrice;
        private @Nullable Input<String> userData;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.classicLinkVPCId = defaults.classicLinkVPCId;
    	      this.classicLinkVPCSecurityGroups = defaults.classicLinkVPCSecurityGroups;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.imageId = defaults.imageId;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceMonitoring = defaults.instanceMonitoring;
    	      this.instanceType = defaults.instanceType;
    	      this.kernelId = defaults.kernelId;
    	      this.keyName = defaults.keyName;
    	      this.launchConfigurationName = defaults.launchConfigurationName;
    	      this.metadataOptions = defaults.metadataOptions;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.ramDiskId = defaults.ramDiskId;
    	      this.securityGroups = defaults.securityGroups;
    	      this.spotPrice = defaults.spotPrice;
    	      this.userData = defaults.userData;
        }

        public Builder setAssociatePublicIpAddress(@Nullable Input<Boolean> associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        public Builder setAssociatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = Input.ofNullable(associatePublicIpAddress);
            return this;
        }

        public Builder setBlockDeviceMappings(@Nullable Input<List<LaunchConfigurationBlockDeviceMappingArgs>> blockDeviceMappings) {
            this.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        public Builder setBlockDeviceMappings(@Nullable List<LaunchConfigurationBlockDeviceMappingArgs> blockDeviceMappings) {
            this.blockDeviceMappings = Input.ofNullable(blockDeviceMappings);
            return this;
        }

        public Builder setClassicLinkVPCId(@Nullable Input<String> classicLinkVPCId) {
            this.classicLinkVPCId = classicLinkVPCId;
            return this;
        }

        public Builder setClassicLinkVPCId(@Nullable String classicLinkVPCId) {
            this.classicLinkVPCId = Input.ofNullable(classicLinkVPCId);
            return this;
        }

        public Builder setClassicLinkVPCSecurityGroups(@Nullable Input<List<String>> classicLinkVPCSecurityGroups) {
            this.classicLinkVPCSecurityGroups = classicLinkVPCSecurityGroups;
            return this;
        }

        public Builder setClassicLinkVPCSecurityGroups(@Nullable List<String> classicLinkVPCSecurityGroups) {
            this.classicLinkVPCSecurityGroups = Input.ofNullable(classicLinkVPCSecurityGroups);
            return this;
        }

        public Builder setEbsOptimized(@Nullable Input<Boolean> ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        public Builder setEbsOptimized(@Nullable Boolean ebsOptimized) {
            this.ebsOptimized = Input.ofNullable(ebsOptimized);
            return this;
        }

        public Builder setIamInstanceProfile(@Nullable Input<String> iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        public Builder setIamInstanceProfile(@Nullable String iamInstanceProfile) {
            this.iamInstanceProfile = Input.ofNullable(iamInstanceProfile);
            return this;
        }

        public Builder setImageId(Input<String> imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }

        public Builder setImageId(String imageId) {
            this.imageId = Input.of(Objects.requireNonNull(imageId));
            return this;
        }

        public Builder setInstanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
            return this;
        }

        public Builder setInstanceMonitoring(@Nullable Input<Boolean> instanceMonitoring) {
            this.instanceMonitoring = instanceMonitoring;
            return this;
        }

        public Builder setInstanceMonitoring(@Nullable Boolean instanceMonitoring) {
            this.instanceMonitoring = Input.ofNullable(instanceMonitoring);
            return this;
        }

        public Builder setInstanceType(Input<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Input.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder setKernelId(@Nullable Input<String> kernelId) {
            this.kernelId = kernelId;
            return this;
        }

        public Builder setKernelId(@Nullable String kernelId) {
            this.kernelId = Input.ofNullable(kernelId);
            return this;
        }

        public Builder setKeyName(@Nullable Input<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = Input.ofNullable(keyName);
            return this;
        }

        public Builder setLaunchConfigurationName(@Nullable Input<String> launchConfigurationName) {
            this.launchConfigurationName = launchConfigurationName;
            return this;
        }

        public Builder setLaunchConfigurationName(@Nullable String launchConfigurationName) {
            this.launchConfigurationName = Input.ofNullable(launchConfigurationName);
            return this;
        }

        public Builder setMetadataOptions(@Nullable Input<LaunchConfigurationMetadataOptionsArgs> metadataOptions) {
            this.metadataOptions = metadataOptions;
            return this;
        }

        public Builder setMetadataOptions(@Nullable LaunchConfigurationMetadataOptionsArgs metadataOptions) {
            this.metadataOptions = Input.ofNullable(metadataOptions);
            return this;
        }

        public Builder setPlacementTenancy(@Nullable Input<String> placementTenancy) {
            this.placementTenancy = placementTenancy;
            return this;
        }

        public Builder setPlacementTenancy(@Nullable String placementTenancy) {
            this.placementTenancy = Input.ofNullable(placementTenancy);
            return this;
        }

        public Builder setRamDiskId(@Nullable Input<String> ramDiskId) {
            this.ramDiskId = ramDiskId;
            return this;
        }

        public Builder setRamDiskId(@Nullable String ramDiskId) {
            this.ramDiskId = Input.ofNullable(ramDiskId);
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSpotPrice(@Nullable Input<String> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        public Builder setSpotPrice(@Nullable String spotPrice) {
            this.spotPrice = Input.ofNullable(spotPrice);
            return this;
        }

        public Builder setUserData(@Nullable Input<String> userData) {
            this.userData = userData;
            return this;
        }

        public Builder setUserData(@Nullable String userData) {
            this.userData = Input.ofNullable(userData);
            return this;
        }

        public LaunchConfigurationArgs build() {
            return new LaunchConfigurationArgs(associatePublicIpAddress, blockDeviceMappings, classicLinkVPCId, classicLinkVPCSecurityGroups, ebsOptimized, iamInstanceProfile, imageId, instanceId, instanceMonitoring, instanceType, kernelId, keyName, launchConfigurationName, metadataOptions, placementTenancy, ramDiskId, securityGroups, spotPrice, userData);
        }
    }
}

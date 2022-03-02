// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetLaunchConfigurationEbsBlockDevice;
import io.pulumi.aws.ec2.outputs.GetLaunchConfigurationEphemeralBlockDevice;
import io.pulumi.aws.ec2.outputs.GetLaunchConfigurationMetadataOption;
import io.pulumi.aws.ec2.outputs.GetLaunchConfigurationRootBlockDevice;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetLaunchConfigurationResult {
    /**
     * The Amazon Resource Name of the launch configuration.
     * 
     */
    private final String arn;
    /**
     * Whether a Public IP address is associated with the instance.
     * 
     */
    private final Boolean associatePublicIpAddress;
    /**
     * The EBS Block Devices attached to the instance.
     * 
     */
    private final List<GetLaunchConfigurationEbsBlockDevice> ebsBlockDevices;
    /**
     * Whether the launched EC2 instance will be EBS-optimized.
     * 
     */
    private final Boolean ebsOptimized;
    /**
     * Whether Detailed Monitoring is Enabled.
     * 
     */
    private final Boolean enableMonitoring;
    /**
     * The Ephemeral volumes on the instance.
     * 
     */
    private final List<GetLaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevices;
    /**
     * The IAM Instance Profile to associate with launched instances.
     * 
     */
    private final String iamInstanceProfile;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The EC2 Image ID of the instance.
     * 
     */
    private final String imageId;
    /**
     * The Instance Type of the instance to launch.
     * 
     */
    private final String instanceType;
    /**
     * The Key Name that should be used for the instance.
     * 
     */
    private final String keyName;
    /**
     * The metadata options for the instance.
     * 
     */
    private final List<GetLaunchConfigurationMetadataOption> metadataOptions;
    /**
     * The Name of the launch configuration.
     * 
     */
    private final String name;
    /**
     * The Tenancy of the instance.
     * 
     */
    private final String placementTenancy;
    /**
     * The Root Block Device of the instance.
     * 
     */
    private final List<GetLaunchConfigurationRootBlockDevice> rootBlockDevices;
    /**
     * A list of associated Security Group IDS.
     * 
     */
    private final List<String> securityGroups;
    /**
     * The Price to use for reserving Spot instances.
     * 
     */
    private final String spotPrice;
    /**
     * The User Data of the instance.
     * 
     */
    private final String userData;
    /**
     * The ID of a ClassicLink-enabled VPC.
     * 
     */
    private final String vpcClassicLinkId;
    /**
     * The IDs of one or more Security Groups for the specified ClassicLink-enabled VPC.
     * 
     */
    private final List<String> vpcClassicLinkSecurityGroups;

    @OutputCustomType.Constructor({"arn","associatePublicIpAddress","ebsBlockDevices","ebsOptimized","enableMonitoring","ephemeralBlockDevices","iamInstanceProfile","id","imageId","instanceType","keyName","metadataOptions","name","placementTenancy","rootBlockDevices","securityGroups","spotPrice","userData","vpcClassicLinkId","vpcClassicLinkSecurityGroups"})
    private GetLaunchConfigurationResult(
        String arn,
        Boolean associatePublicIpAddress,
        List<GetLaunchConfigurationEbsBlockDevice> ebsBlockDevices,
        Boolean ebsOptimized,
        Boolean enableMonitoring,
        List<GetLaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevices,
        String iamInstanceProfile,
        String id,
        String imageId,
        String instanceType,
        String keyName,
        List<GetLaunchConfigurationMetadataOption> metadataOptions,
        String name,
        String placementTenancy,
        List<GetLaunchConfigurationRootBlockDevice> rootBlockDevices,
        List<String> securityGroups,
        String spotPrice,
        String userData,
        String vpcClassicLinkId,
        List<String> vpcClassicLinkSecurityGroups) {
        this.arn = Objects.requireNonNull(arn);
        this.associatePublicIpAddress = Objects.requireNonNull(associatePublicIpAddress);
        this.ebsBlockDevices = Objects.requireNonNull(ebsBlockDevices);
        this.ebsOptimized = Objects.requireNonNull(ebsOptimized);
        this.enableMonitoring = Objects.requireNonNull(enableMonitoring);
        this.ephemeralBlockDevices = Objects.requireNonNull(ephemeralBlockDevices);
        this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
        this.id = Objects.requireNonNull(id);
        this.imageId = Objects.requireNonNull(imageId);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.keyName = Objects.requireNonNull(keyName);
        this.metadataOptions = Objects.requireNonNull(metadataOptions);
        this.name = Objects.requireNonNull(name);
        this.placementTenancy = Objects.requireNonNull(placementTenancy);
        this.rootBlockDevices = Objects.requireNonNull(rootBlockDevices);
        this.securityGroups = Objects.requireNonNull(securityGroups);
        this.spotPrice = Objects.requireNonNull(spotPrice);
        this.userData = Objects.requireNonNull(userData);
        this.vpcClassicLinkId = Objects.requireNonNull(vpcClassicLinkId);
        this.vpcClassicLinkSecurityGroups = Objects.requireNonNull(vpcClassicLinkSecurityGroups);
    }

    /**
     * The Amazon Resource Name of the launch configuration.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Whether a Public IP address is associated with the instance.
     * 
    */
    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }
    /**
     * The EBS Block Devices attached to the instance.
     * 
    */
    public List<GetLaunchConfigurationEbsBlockDevice> getEbsBlockDevices() {
        return this.ebsBlockDevices;
    }
    /**
     * Whether the launched EC2 instance will be EBS-optimized.
     * 
    */
    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }
    /**
     * Whether Detailed Monitoring is Enabled.
     * 
    */
    public Boolean getEnableMonitoring() {
        return this.enableMonitoring;
    }
    /**
     * The Ephemeral volumes on the instance.
     * 
    */
    public List<GetLaunchConfigurationEphemeralBlockDevice> getEphemeralBlockDevices() {
        return this.ephemeralBlockDevices;
    }
    /**
     * The IAM Instance Profile to associate with launched instances.
     * 
    */
    public String getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The EC2 Image ID of the instance.
     * 
    */
    public String getImageId() {
        return this.imageId;
    }
    /**
     * The Instance Type of the instance to launch.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The Key Name that should be used for the instance.
     * 
    */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * The metadata options for the instance.
     * 
    */
    public List<GetLaunchConfigurationMetadataOption> getMetadataOptions() {
        return this.metadataOptions;
    }
    /**
     * The Name of the launch configuration.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Tenancy of the instance.
     * 
    */
    public String getPlacementTenancy() {
        return this.placementTenancy;
    }
    /**
     * The Root Block Device of the instance.
     * 
    */
    public List<GetLaunchConfigurationRootBlockDevice> getRootBlockDevices() {
        return this.rootBlockDevices;
    }
    /**
     * A list of associated Security Group IDS.
     * 
    */
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * The Price to use for reserving Spot instances.
     * 
    */
    public String getSpotPrice() {
        return this.spotPrice;
    }
    /**
     * The User Data of the instance.
     * 
    */
    public String getUserData() {
        return this.userData;
    }
    /**
     * The ID of a ClassicLink-enabled VPC.
     * 
    */
    public String getVpcClassicLinkId() {
        return this.vpcClassicLinkId;
    }
    /**
     * The IDs of one or more Security Groups for the specified ClassicLink-enabled VPC.
     * 
    */
    public List<String> getVpcClassicLinkSecurityGroups() {
        return this.vpcClassicLinkSecurityGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Boolean associatePublicIpAddress;
        private List<GetLaunchConfigurationEbsBlockDevice> ebsBlockDevices;
        private Boolean ebsOptimized;
        private Boolean enableMonitoring;
        private List<GetLaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevices;
        private String iamInstanceProfile;
        private String id;
        private String imageId;
        private String instanceType;
        private String keyName;
        private List<GetLaunchConfigurationMetadataOption> metadataOptions;
        private String name;
        private String placementTenancy;
        private List<GetLaunchConfigurationRootBlockDevice> rootBlockDevices;
        private List<String> securityGroups;
        private String spotPrice;
        private String userData;
        private String vpcClassicLinkId;
        private List<String> vpcClassicLinkSecurityGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.enableMonitoring = defaults.enableMonitoring;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.metadataOptions = defaults.metadataOptions;
    	      this.name = defaults.name;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.rootBlockDevices = defaults.rootBlockDevices;
    	      this.securityGroups = defaults.securityGroups;
    	      this.spotPrice = defaults.spotPrice;
    	      this.userData = defaults.userData;
    	      this.vpcClassicLinkId = defaults.vpcClassicLinkId;
    	      this.vpcClassicLinkSecurityGroups = defaults.vpcClassicLinkSecurityGroups;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = Objects.requireNonNull(associatePublicIpAddress);
            return this;
        }

        public Builder setEbsBlockDevices(List<GetLaunchConfigurationEbsBlockDevice> ebsBlockDevices) {
            this.ebsBlockDevices = Objects.requireNonNull(ebsBlockDevices);
            return this;
        }

        public Builder setEbsOptimized(Boolean ebsOptimized) {
            this.ebsOptimized = Objects.requireNonNull(ebsOptimized);
            return this;
        }

        public Builder setEnableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = Objects.requireNonNull(enableMonitoring);
            return this;
        }

        public Builder setEphemeralBlockDevices(List<GetLaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Objects.requireNonNull(ephemeralBlockDevices);
            return this;
        }

        public Builder setIamInstanceProfile(String iamInstanceProfile) {
            this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setMetadataOptions(List<GetLaunchConfigurationMetadataOption> metadataOptions) {
            this.metadataOptions = Objects.requireNonNull(metadataOptions);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlacementTenancy(String placementTenancy) {
            this.placementTenancy = Objects.requireNonNull(placementTenancy);
            return this;
        }

        public Builder setRootBlockDevices(List<GetLaunchConfigurationRootBlockDevice> rootBlockDevices) {
            this.rootBlockDevices = Objects.requireNonNull(rootBlockDevices);
            return this;
        }

        public Builder setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder setSpotPrice(String spotPrice) {
            this.spotPrice = Objects.requireNonNull(spotPrice);
            return this;
        }

        public Builder setUserData(String userData) {
            this.userData = Objects.requireNonNull(userData);
            return this;
        }

        public Builder setVpcClassicLinkId(String vpcClassicLinkId) {
            this.vpcClassicLinkId = Objects.requireNonNull(vpcClassicLinkId);
            return this;
        }

        public Builder setVpcClassicLinkSecurityGroups(List<String> vpcClassicLinkSecurityGroups) {
            this.vpcClassicLinkSecurityGroups = Objects.requireNonNull(vpcClassicLinkSecurityGroups);
            return this;
        }
        public GetLaunchConfigurationResult build() {
            return new GetLaunchConfigurationResult(arn, associatePublicIpAddress, ebsBlockDevices, ebsOptimized, enableMonitoring, ephemeralBlockDevices, iamInstanceProfile, id, imageId, instanceType, keyName, metadataOptions, name, placementTenancy, rootBlockDevices, securityGroups, spotPrice, userData, vpcClassicLinkId, vpcClassicLinkSecurityGroups);
        }
    }
}

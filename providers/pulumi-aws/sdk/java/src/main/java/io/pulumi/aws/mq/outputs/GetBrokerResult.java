// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.outputs;

import io.pulumi.aws.mq.outputs.GetBrokerConfiguration;
import io.pulumi.aws.mq.outputs.GetBrokerEncryptionOption;
import io.pulumi.aws.mq.outputs.GetBrokerInstance;
import io.pulumi.aws.mq.outputs.GetBrokerLdapServerMetadata;
import io.pulumi.aws.mq.outputs.GetBrokerLogs;
import io.pulumi.aws.mq.outputs.GetBrokerMaintenanceWindowStartTime;
import io.pulumi.aws.mq.outputs.GetBrokerUser;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetBrokerResult {
    private final String arn;
    private final String authenticationStrategy;
    private final Boolean autoMinorVersionUpgrade;
    private final String brokerId;
    private final String brokerName;
    private final GetBrokerConfiguration configuration;
    private final String deploymentMode;
    private final List<GetBrokerEncryptionOption> encryptionOptions;
    private final String engineType;
    private final String engineVersion;
    private final String hostInstanceType;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<GetBrokerInstance> instances;
    private final List<GetBrokerLdapServerMetadata> ldapServerMetadatas;
    private final GetBrokerLogs logs;
    private final GetBrokerMaintenanceWindowStartTime maintenanceWindowStartTime;
    private final Boolean publiclyAccessible;
    private final List<String> securityGroups;
    private final String storageType;
    private final List<String> subnetIds;
    private final Map<String,String> tags;
    private final List<GetBrokerUser> users;

    @OutputCustomType.Constructor({"arn","authenticationStrategy","autoMinorVersionUpgrade","brokerId","brokerName","configuration","deploymentMode","encryptionOptions","engineType","engineVersion","hostInstanceType","id","instances","ldapServerMetadatas","logs","maintenanceWindowStartTime","publiclyAccessible","securityGroups","storageType","subnetIds","tags","users"})
    private GetBrokerResult(
        String arn,
        String authenticationStrategy,
        Boolean autoMinorVersionUpgrade,
        String brokerId,
        String brokerName,
        GetBrokerConfiguration configuration,
        String deploymentMode,
        List<GetBrokerEncryptionOption> encryptionOptions,
        String engineType,
        String engineVersion,
        String hostInstanceType,
        String id,
        List<GetBrokerInstance> instances,
        List<GetBrokerLdapServerMetadata> ldapServerMetadatas,
        GetBrokerLogs logs,
        GetBrokerMaintenanceWindowStartTime maintenanceWindowStartTime,
        Boolean publiclyAccessible,
        List<String> securityGroups,
        String storageType,
        List<String> subnetIds,
        Map<String,String> tags,
        List<GetBrokerUser> users) {
        this.arn = Objects.requireNonNull(arn);
        this.authenticationStrategy = Objects.requireNonNull(authenticationStrategy);
        this.autoMinorVersionUpgrade = Objects.requireNonNull(autoMinorVersionUpgrade);
        this.brokerId = Objects.requireNonNull(brokerId);
        this.brokerName = Objects.requireNonNull(brokerName);
        this.configuration = Objects.requireNonNull(configuration);
        this.deploymentMode = Objects.requireNonNull(deploymentMode);
        this.encryptionOptions = Objects.requireNonNull(encryptionOptions);
        this.engineType = Objects.requireNonNull(engineType);
        this.engineVersion = Objects.requireNonNull(engineVersion);
        this.hostInstanceType = Objects.requireNonNull(hostInstanceType);
        this.id = Objects.requireNonNull(id);
        this.instances = Objects.requireNonNull(instances);
        this.ldapServerMetadatas = Objects.requireNonNull(ldapServerMetadatas);
        this.logs = Objects.requireNonNull(logs);
        this.maintenanceWindowStartTime = Objects.requireNonNull(maintenanceWindowStartTime);
        this.publiclyAccessible = Objects.requireNonNull(publiclyAccessible);
        this.securityGroups = Objects.requireNonNull(securityGroups);
        this.storageType = Objects.requireNonNull(storageType);
        this.subnetIds = Objects.requireNonNull(subnetIds);
        this.tags = Objects.requireNonNull(tags);
        this.users = Objects.requireNonNull(users);
    }

    public String getArn() {
        return this.arn;
    }
    public String getAuthenticationStrategy() {
        return this.authenticationStrategy;
    }
    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    public String getBrokerId() {
        return this.brokerId;
    }
    public String getBrokerName() {
        return this.brokerName;
    }
    public GetBrokerConfiguration getConfiguration() {
        return this.configuration;
    }
    public String getDeploymentMode() {
        return this.deploymentMode;
    }
    public List<GetBrokerEncryptionOption> getEncryptionOptions() {
        return this.encryptionOptions;
    }
    public String getEngineType() {
        return this.engineType;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }
    public String getHostInstanceType() {
        return this.hostInstanceType;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public List<GetBrokerInstance> getInstances() {
        return this.instances;
    }
    public List<GetBrokerLdapServerMetadata> getLdapServerMetadatas() {
        return this.ldapServerMetadatas;
    }
    public GetBrokerLogs getLogs() {
        return this.logs;
    }
    public GetBrokerMaintenanceWindowStartTime getMaintenanceWindowStartTime() {
        return this.maintenanceWindowStartTime;
    }
    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }
    public String getStorageType() {
        return this.storageType;
    }
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public List<GetBrokerUser> getUsers() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String authenticationStrategy;
        private Boolean autoMinorVersionUpgrade;
        private String brokerId;
        private String brokerName;
        private GetBrokerConfiguration configuration;
        private String deploymentMode;
        private List<GetBrokerEncryptionOption> encryptionOptions;
        private String engineType;
        private String engineVersion;
        private String hostInstanceType;
        private String id;
        private List<GetBrokerInstance> instances;
        private List<GetBrokerLdapServerMetadata> ldapServerMetadatas;
        private GetBrokerLogs logs;
        private GetBrokerMaintenanceWindowStartTime maintenanceWindowStartTime;
        private Boolean publiclyAccessible;
        private List<String> securityGroups;
        private String storageType;
        private List<String> subnetIds;
        private Map<String,String> tags;
        private List<GetBrokerUser> users;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authenticationStrategy = defaults.authenticationStrategy;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.brokerId = defaults.brokerId;
    	      this.brokerName = defaults.brokerName;
    	      this.configuration = defaults.configuration;
    	      this.deploymentMode = defaults.deploymentMode;
    	      this.encryptionOptions = defaults.encryptionOptions;
    	      this.engineType = defaults.engineType;
    	      this.engineVersion = defaults.engineVersion;
    	      this.hostInstanceType = defaults.hostInstanceType;
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.ldapServerMetadatas = defaults.ldapServerMetadatas;
    	      this.logs = defaults.logs;
    	      this.maintenanceWindowStartTime = defaults.maintenanceWindowStartTime;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.securityGroups = defaults.securityGroups;
    	      this.storageType = defaults.storageType;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.users = defaults.users;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAuthenticationStrategy(String authenticationStrategy) {
            this.authenticationStrategy = Objects.requireNonNull(authenticationStrategy);
            return this;
        }

        public Builder setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = Objects.requireNonNull(autoMinorVersionUpgrade);
            return this;
        }

        public Builder setBrokerId(String brokerId) {
            this.brokerId = Objects.requireNonNull(brokerId);
            return this;
        }

        public Builder setBrokerName(String brokerName) {
            this.brokerName = Objects.requireNonNull(brokerName);
            return this;
        }

        public Builder setConfiguration(GetBrokerConfiguration configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }

        public Builder setDeploymentMode(String deploymentMode) {
            this.deploymentMode = Objects.requireNonNull(deploymentMode);
            return this;
        }

        public Builder setEncryptionOptions(List<GetBrokerEncryptionOption> encryptionOptions) {
            this.encryptionOptions = Objects.requireNonNull(encryptionOptions);
            return this;
        }

        public Builder setEngineType(String engineType) {
            this.engineType = Objects.requireNonNull(engineType);
            return this;
        }

        public Builder setEngineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }

        public Builder setHostInstanceType(String hostInstanceType) {
            this.hostInstanceType = Objects.requireNonNull(hostInstanceType);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstances(List<GetBrokerInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setLdapServerMetadatas(List<GetBrokerLdapServerMetadata> ldapServerMetadatas) {
            this.ldapServerMetadatas = Objects.requireNonNull(ldapServerMetadatas);
            return this;
        }

        public Builder setLogs(GetBrokerLogs logs) {
            this.logs = Objects.requireNonNull(logs);
            return this;
        }

        public Builder setMaintenanceWindowStartTime(GetBrokerMaintenanceWindowStartTime maintenanceWindowStartTime) {
            this.maintenanceWindowStartTime = Objects.requireNonNull(maintenanceWindowStartTime);
            return this;
        }

        public Builder setPubliclyAccessible(Boolean publiclyAccessible) {
            this.publiclyAccessible = Objects.requireNonNull(publiclyAccessible);
            return this;
        }

        public Builder setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder setStorageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setUsers(List<GetBrokerUser> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public GetBrokerResult build() {
            return new GetBrokerResult(arn, authenticationStrategy, autoMinorVersionUpgrade, brokerId, brokerName, configuration, deploymentMode, encryptionOptions, engineType, engineVersion, hostInstanceType, id, instances, ldapServerMetadatas, logs, maintenanceWindowStartTime, publiclyAccessible, securityGroups, storageType, subnetIds, tags, users);
        }
    }
}

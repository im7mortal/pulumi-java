// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datafusion_v1beta1.outputs.AcceleratorResponse;
import com.pulumi.googlenative.datafusion_v1beta1.outputs.CryptoKeyConfigResponse;
import com.pulumi.googlenative.datafusion_v1beta1.outputs.NetworkConfigResponse;
import com.pulumi.googlenative.datafusion_v1beta1.outputs.VersionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstanceResult {
    /**
     * @return List of accelerators enabled for this CDF instance.
     * 
     */
    private final List<AcceleratorResponse> accelerators;
    /**
     * @return Endpoint on which the REST APIs is accessible.
     * 
     */
    private final String apiEndpoint;
    /**
     * @return Available versions that the instance can be upgraded to using UpdateInstanceRequest.
     * 
     */
    private final List<VersionResponse> availableVersion;
    /**
     * @return The time the instance was created.
     * 
     */
    private final String createTime;
    /**
     * @return The crypto key configuration. This field is used by the Customer-Managed Encryption Keys (CMEK) feature.
     * 
     */
    private final CryptoKeyConfigResponse cryptoKeyConfig;
    /**
     * @return User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines. This allows users to have fine-grained access control on Dataproc&#39;s accesses to cloud resources.
     * 
     */
    private final String dataprocServiceAccount;
    /**
     * @return A description of this instance.
     * 
     */
    private final String description;
    /**
     * @return If the instance state is DISABLED, the reason for disabling the instance.
     * 
     */
    private final List<String> disabledReason;
    /**
     * @return Display name for an instance.
     * 
     */
    private final String displayName;
    /**
     * @return Option to enable granular role-based access control.
     * 
     */
    private final Boolean enableRbac;
    /**
     * @return Option to enable Stackdriver Logging.
     * 
     */
    private final Boolean enableStackdriverLogging;
    /**
     * @return Option to enable Stackdriver Monitoring.
     * 
     */
    private final Boolean enableStackdriverMonitoring;
    /**
     * @return Cloud Storage bucket generated by Data Fusion in the customer project.
     * 
     */
    private final String gcsBucket;
    /**
     * @return The resource labels for instance to use to annotate any related underlying resources such as Compute Engine VMs. The character &#39;=&#39; is not allowed to be used within the labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The name of this instance is in the form of projects/{project}/locations/{location}/instances/{instance}.
     * 
     */
    private final String name;
    /**
     * @return Network configuration options. These are required when a private Data Fusion instance is to be created.
     * 
     */
    private final NetworkConfigResponse networkConfig;
    /**
     * @return Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    private final Map<String,String> options;
    /**
     * @return P4 service account for the customer project.
     * 
     */
    private final String p4ServiceAccount;
    /**
     * @return Specifies whether the Data Fusion instance should be private. If set to true, all Data Fusion nodes will have private IP addresses and will not be able to access the public internet.
     * 
     */
    private final Boolean privateInstance;
    /**
     * @return Deprecated. Use tenant_project_id instead to extract the tenant project ID.
     * 
     * @deprecated
     * Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID.
     * 
     */
    @Deprecated /* Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID. */
    private final String serviceAccount;
    /**
     * @return Endpoint on which the Data Fusion UI is accessible.
     * 
     */
    private final String serviceEndpoint;
    /**
     * @return The current state of this Data Fusion instance.
     * 
     */
    private final String state;
    /**
     * @return Additional information about the current state of this Data Fusion instance if available.
     * 
     */
    private final String stateMessage;
    /**
     * @return The name of the tenant project.
     * 
     */
    private final String tenantProjectId;
    /**
     * @return Instance type.
     * 
     */
    private final String type;
    /**
     * @return The time the instance was last updated.
     * 
     */
    private final String updateTime;
    /**
     * @return Current version of Data Fusion.
     * 
     */
    private final String version;
    /**
     * @return Name of the zone in which the Data Fusion instance will be created. Only DEVELOPER instances use this field.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetInstanceResult(
        @CustomType.Parameter("accelerators") List<AcceleratorResponse> accelerators,
        @CustomType.Parameter("apiEndpoint") String apiEndpoint,
        @CustomType.Parameter("availableVersion") List<VersionResponse> availableVersion,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("cryptoKeyConfig") CryptoKeyConfigResponse cryptoKeyConfig,
        @CustomType.Parameter("dataprocServiceAccount") String dataprocServiceAccount,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("disabledReason") List<String> disabledReason,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("enableRbac") Boolean enableRbac,
        @CustomType.Parameter("enableStackdriverLogging") Boolean enableStackdriverLogging,
        @CustomType.Parameter("enableStackdriverMonitoring") Boolean enableStackdriverMonitoring,
        @CustomType.Parameter("gcsBucket") String gcsBucket,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkConfig") NetworkConfigResponse networkConfig,
        @CustomType.Parameter("options") Map<String,String> options,
        @CustomType.Parameter("p4ServiceAccount") String p4ServiceAccount,
        @CustomType.Parameter("privateInstance") Boolean privateInstance,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("serviceEndpoint") String serviceEndpoint,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateMessage") String stateMessage,
        @CustomType.Parameter("tenantProjectId") String tenantProjectId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("zone") String zone) {
        this.accelerators = accelerators;
        this.apiEndpoint = apiEndpoint;
        this.availableVersion = availableVersion;
        this.createTime = createTime;
        this.cryptoKeyConfig = cryptoKeyConfig;
        this.dataprocServiceAccount = dataprocServiceAccount;
        this.description = description;
        this.disabledReason = disabledReason;
        this.displayName = displayName;
        this.enableRbac = enableRbac;
        this.enableStackdriverLogging = enableStackdriverLogging;
        this.enableStackdriverMonitoring = enableStackdriverMonitoring;
        this.gcsBucket = gcsBucket;
        this.labels = labels;
        this.name = name;
        this.networkConfig = networkConfig;
        this.options = options;
        this.p4ServiceAccount = p4ServiceAccount;
        this.privateInstance = privateInstance;
        this.serviceAccount = serviceAccount;
        this.serviceEndpoint = serviceEndpoint;
        this.state = state;
        this.stateMessage = stateMessage;
        this.tenantProjectId = tenantProjectId;
        this.type = type;
        this.updateTime = updateTime;
        this.version = version;
        this.zone = zone;
    }

    /**
     * @return List of accelerators enabled for this CDF instance.
     * 
     */
    public List<AcceleratorResponse> accelerators() {
        return this.accelerators;
    }
    /**
     * @return Endpoint on which the REST APIs is accessible.
     * 
     */
    public String apiEndpoint() {
        return this.apiEndpoint;
    }
    /**
     * @return Available versions that the instance can be upgraded to using UpdateInstanceRequest.
     * 
     */
    public List<VersionResponse> availableVersion() {
        return this.availableVersion;
    }
    /**
     * @return The time the instance was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The crypto key configuration. This field is used by the Customer-Managed Encryption Keys (CMEK) feature.
     * 
     */
    public CryptoKeyConfigResponse cryptoKeyConfig() {
        return this.cryptoKeyConfig;
    }
    /**
     * @return User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines. This allows users to have fine-grained access control on Dataproc&#39;s accesses to cloud resources.
     * 
     */
    public String dataprocServiceAccount() {
        return this.dataprocServiceAccount;
    }
    /**
     * @return A description of this instance.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return If the instance state is DISABLED, the reason for disabling the instance.
     * 
     */
    public List<String> disabledReason() {
        return this.disabledReason;
    }
    /**
     * @return Display name for an instance.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Option to enable granular role-based access control.
     * 
     */
    public Boolean enableRbac() {
        return this.enableRbac;
    }
    /**
     * @return Option to enable Stackdriver Logging.
     * 
     */
    public Boolean enableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }
    /**
     * @return Option to enable Stackdriver Monitoring.
     * 
     */
    public Boolean enableStackdriverMonitoring() {
        return this.enableStackdriverMonitoring;
    }
    /**
     * @return Cloud Storage bucket generated by Data Fusion in the customer project.
     * 
     */
    public String gcsBucket() {
        return this.gcsBucket;
    }
    /**
     * @return The resource labels for instance to use to annotate any related underlying resources such as Compute Engine VMs. The character &#39;=&#39; is not allowed to be used within the labels.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The name of this instance is in the form of projects/{project}/locations/{location}/instances/{instance}.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Network configuration options. These are required when a private Data Fusion instance is to be created.
     * 
     */
    public NetworkConfigResponse networkConfig() {
        return this.networkConfig;
    }
    /**
     * @return Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    public Map<String,String> options() {
        return this.options;
    }
    /**
     * @return P4 service account for the customer project.
     * 
     */
    public String p4ServiceAccount() {
        return this.p4ServiceAccount;
    }
    /**
     * @return Specifies whether the Data Fusion instance should be private. If set to true, all Data Fusion nodes will have private IP addresses and will not be able to access the public internet.
     * 
     */
    public Boolean privateInstance() {
        return this.privateInstance;
    }
    /**
     * @return Deprecated. Use tenant_project_id instead to extract the tenant project ID.
     * 
     * @deprecated
     * Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID.
     * 
     */
    @Deprecated /* Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID. */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Endpoint on which the Data Fusion UI is accessible.
     * 
     */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }
    /**
     * @return The current state of this Data Fusion instance.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Additional information about the current state of this Data Fusion instance if available.
     * 
     */
    public String stateMessage() {
        return this.stateMessage;
    }
    /**
     * @return The name of the tenant project.
     * 
     */
    public String tenantProjectId() {
        return this.tenantProjectId;
    }
    /**
     * @return Instance type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The time the instance was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return Current version of Data Fusion.
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return Name of the zone in which the Data Fusion instance will be created. Only DEVELOPER instances use this field.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AcceleratorResponse> accelerators;
        private String apiEndpoint;
        private List<VersionResponse> availableVersion;
        private String createTime;
        private CryptoKeyConfigResponse cryptoKeyConfig;
        private String dataprocServiceAccount;
        private String description;
        private List<String> disabledReason;
        private String displayName;
        private Boolean enableRbac;
        private Boolean enableStackdriverLogging;
        private Boolean enableStackdriverMonitoring;
        private String gcsBucket;
        private Map<String,String> labels;
        private String name;
        private NetworkConfigResponse networkConfig;
        private Map<String,String> options;
        private String p4ServiceAccount;
        private Boolean privateInstance;
        private String serviceAccount;
        private String serviceEndpoint;
        private String state;
        private String stateMessage;
        private String tenantProjectId;
        private String type;
        private String updateTime;
        private String version;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.apiEndpoint = defaults.apiEndpoint;
    	      this.availableVersion = defaults.availableVersion;
    	      this.createTime = defaults.createTime;
    	      this.cryptoKeyConfig = defaults.cryptoKeyConfig;
    	      this.dataprocServiceAccount = defaults.dataprocServiceAccount;
    	      this.description = defaults.description;
    	      this.disabledReason = defaults.disabledReason;
    	      this.displayName = defaults.displayName;
    	      this.enableRbac = defaults.enableRbac;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
    	      this.enableStackdriverMonitoring = defaults.enableStackdriverMonitoring;
    	      this.gcsBucket = defaults.gcsBucket;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.networkConfig = defaults.networkConfig;
    	      this.options = defaults.options;
    	      this.p4ServiceAccount = defaults.p4ServiceAccount;
    	      this.privateInstance = defaults.privateInstance;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.tenantProjectId = defaults.tenantProjectId;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
    	      this.version = defaults.version;
    	      this.zone = defaults.zone;
        }

        public Builder accelerators(List<AcceleratorResponse> accelerators) {
            this.accelerators = Objects.requireNonNull(accelerators);
            return this;
        }
        public Builder accelerators(AcceleratorResponse... accelerators) {
            return accelerators(List.of(accelerators));
        }
        public Builder apiEndpoint(String apiEndpoint) {
            this.apiEndpoint = Objects.requireNonNull(apiEndpoint);
            return this;
        }
        public Builder availableVersion(List<VersionResponse> availableVersion) {
            this.availableVersion = Objects.requireNonNull(availableVersion);
            return this;
        }
        public Builder availableVersion(VersionResponse... availableVersion) {
            return availableVersion(List.of(availableVersion));
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder cryptoKeyConfig(CryptoKeyConfigResponse cryptoKeyConfig) {
            this.cryptoKeyConfig = Objects.requireNonNull(cryptoKeyConfig);
            return this;
        }
        public Builder dataprocServiceAccount(String dataprocServiceAccount) {
            this.dataprocServiceAccount = Objects.requireNonNull(dataprocServiceAccount);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder disabledReason(List<String> disabledReason) {
            this.disabledReason = Objects.requireNonNull(disabledReason);
            return this;
        }
        public Builder disabledReason(String... disabledReason) {
            return disabledReason(List.of(disabledReason));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder enableRbac(Boolean enableRbac) {
            this.enableRbac = Objects.requireNonNull(enableRbac);
            return this;
        }
        public Builder enableStackdriverLogging(Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Objects.requireNonNull(enableStackdriverLogging);
            return this;
        }
        public Builder enableStackdriverMonitoring(Boolean enableStackdriverMonitoring) {
            this.enableStackdriverMonitoring = Objects.requireNonNull(enableStackdriverMonitoring);
            return this;
        }
        public Builder gcsBucket(String gcsBucket) {
            this.gcsBucket = Objects.requireNonNull(gcsBucket);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkConfig(NetworkConfigResponse networkConfig) {
            this.networkConfig = Objects.requireNonNull(networkConfig);
            return this;
        }
        public Builder options(Map<String,String> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder p4ServiceAccount(String p4ServiceAccount) {
            this.p4ServiceAccount = Objects.requireNonNull(p4ServiceAccount);
            return this;
        }
        public Builder privateInstance(Boolean privateInstance) {
            this.privateInstance = Objects.requireNonNull(privateInstance);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder serviceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }
        public Builder tenantProjectId(String tenantProjectId) {
            this.tenantProjectId = Objects.requireNonNull(tenantProjectId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetInstanceResult build() {
            return new GetInstanceResult(accelerators, apiEndpoint, availableVersion, createTime, cryptoKeyConfig, dataprocServiceAccount, description, disabledReason, displayName, enableRbac, enableStackdriverLogging, enableStackdriverMonitoring, gcsBucket, labels, name, networkConfig, options, p4ServiceAccount, privateInstance, serviceAccount, serviceEndpoint, state, stateMessage, tenantProjectId, type, updateTime, version, zone);
        }
    }
}

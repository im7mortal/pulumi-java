// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.ContainerConfigurationResponse;
import io.pulumi.azurenative.resources.outputs.EnvironmentVariableResponse;
import io.pulumi.azurenative.resources.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.resources.outputs.ScriptStatusResponse;
import io.pulumi.azurenative.resources.outputs.StorageAccountConfigurationResponse;
import io.pulumi.azurenative.resources.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAzureCliScriptResult {
    /**
     * Command line arguments to pass to the script. Arguments are separated by spaces. ex: -Name blue* -Location 'West US 2'
     * 
     */
    private final @Nullable String arguments;
    /**
     * Azure CLI module version to be used.
     * 
     */
    private final String azCliVersion;
    /**
     * The clean up preference when the script execution gets in a terminal state. Default setting is 'Always'.
     * 
     */
    private final @Nullable String cleanupPreference;
    /**
     * Container settings.
     * 
     */
    private final @Nullable ContainerConfigurationResponse containerSettings;
    /**
     * The environment variables to pass over to the script.
     * 
     */
    private final @Nullable List<EnvironmentVariableResponse> environmentVariables;
    /**
     * Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID.
     * 
     */
    private final @Nullable String forceUpdateTag;
    /**
     * String Id used to locate any resource on Azure.
     * 
     */
    private final String id;
    /**
     * Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * Type of the script.
     * Expected value is 'AzureCLI'.
     * 
     */
    private final String kind;
    /**
     * The location of the ACI and the storage account for the deployment script.
     * 
     */
    private final String location;
    /**
     * Name of this resource.
     * 
     */
    private final String name;
    /**
     * List of script outputs.
     * 
     */
    private final Map<String,Object> outputs;
    /**
     * Uri for the script. This is the entry point for the external script.
     * 
     */
    private final @Nullable String primaryScriptUri;
    /**
     * State of the script execution. This only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. Duration is based on ISO 8601 pattern (for example P1D means one day).
     * 
     */
    private final String retentionInterval;
    /**
     * Script body.
     * 
     */
    private final @Nullable String scriptContent;
    /**
     * Contains the results of script execution.
     * 
     */
    private final ScriptStatusResponse status;
    /**
     * Storage Account settings.
     * 
     */
    private final @Nullable StorageAccountConfigurationResponse storageAccountSettings;
    /**
     * Supporting files for the external script.
     * 
     */
    private final @Nullable List<String> supportingScriptUris;
    /**
     * The system metadata related to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Maximum allowed script execution time specified in ISO 8601 format. Default value is P1D
     * 
     */
    private final @Nullable String timeout;
    /**
     * Type of this resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"arguments","azCliVersion","cleanupPreference","containerSettings","environmentVariables","forceUpdateTag","id","identity","kind","location","name","outputs","primaryScriptUri","provisioningState","retentionInterval","scriptContent","status","storageAccountSettings","supportingScriptUris","systemData","tags","timeout","type"})
    private GetAzureCliScriptResult(
        @Nullable String arguments,
        String azCliVersion,
        @Nullable String cleanupPreference,
        @Nullable ContainerConfigurationResponse containerSettings,
        @Nullable List<EnvironmentVariableResponse> environmentVariables,
        @Nullable String forceUpdateTag,
        String id,
        @Nullable ManagedServiceIdentityResponse identity,
        String kind,
        String location,
        String name,
        Map<String,Object> outputs,
        @Nullable String primaryScriptUri,
        String provisioningState,
        String retentionInterval,
        @Nullable String scriptContent,
        ScriptStatusResponse status,
        @Nullable StorageAccountConfigurationResponse storageAccountSettings,
        @Nullable List<String> supportingScriptUris,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        @Nullable String timeout,
        String type) {
        this.arguments = arguments;
        this.azCliVersion = Objects.requireNonNull(azCliVersion);
        this.cleanupPreference = cleanupPreference;
        this.containerSettings = containerSettings;
        this.environmentVariables = environmentVariables;
        this.forceUpdateTag = forceUpdateTag;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.outputs = Objects.requireNonNull(outputs);
        this.primaryScriptUri = primaryScriptUri;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.retentionInterval = Objects.requireNonNull(retentionInterval);
        this.scriptContent = scriptContent;
        this.status = Objects.requireNonNull(status);
        this.storageAccountSettings = storageAccountSettings;
        this.supportingScriptUris = supportingScriptUris;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Command line arguments to pass to the script. Arguments are separated by spaces. ex: -Name blue* -Location 'West US 2'
     * 
    */
    public Optional<String> getArguments() {
        return Optional.ofNullable(this.arguments);
    }
    /**
     * Azure CLI module version to be used.
     * 
    */
    public String getAzCliVersion() {
        return this.azCliVersion;
    }
    /**
     * The clean up preference when the script execution gets in a terminal state. Default setting is 'Always'.
     * 
    */
    public Optional<String> getCleanupPreference() {
        return Optional.ofNullable(this.cleanupPreference);
    }
    /**
     * Container settings.
     * 
    */
    public Optional<ContainerConfigurationResponse> getContainerSettings() {
        return Optional.ofNullable(this.containerSettings);
    }
    /**
     * The environment variables to pass over to the script.
     * 
    */
    public List<EnvironmentVariableResponse> getEnvironmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }
    /**
     * Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID.
     * 
    */
    public Optional<String> getForceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * String Id used to locate any resource on Azure.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
    */
    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Type of the script.
     * Expected value is 'AzureCLI'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The location of the ACI and the storage account for the deployment script.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Name of this resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of script outputs.
     * 
    */
    public Map<String,Object> getOutputs() {
        return this.outputs;
    }
    /**
     * Uri for the script. This is the entry point for the external script.
     * 
    */
    public Optional<String> getPrimaryScriptUri() {
        return Optional.ofNullable(this.primaryScriptUri);
    }
    /**
     * State of the script execution. This only appears in the response.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. Duration is based on ISO 8601 pattern (for example P1D means one day).
     * 
    */
    public String getRetentionInterval() {
        return this.retentionInterval;
    }
    /**
     * Script body.
     * 
    */
    public Optional<String> getScriptContent() {
        return Optional.ofNullable(this.scriptContent);
    }
    /**
     * Contains the results of script execution.
     * 
    */
    public ScriptStatusResponse getStatus() {
        return this.status;
    }
    /**
     * Storage Account settings.
     * 
    */
    public Optional<StorageAccountConfigurationResponse> getStorageAccountSettings() {
        return Optional.ofNullable(this.storageAccountSettings);
    }
    /**
     * Supporting files for the external script.
     * 
    */
    public List<String> getSupportingScriptUris() {
        return this.supportingScriptUris == null ? List.of() : this.supportingScriptUris;
    }
    /**
     * The system metadata related to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Maximum allowed script execution time specified in ISO 8601 format. Default value is P1D
     * 
    */
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Type of this resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzureCliScriptResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arguments;
        private String azCliVersion;
        private @Nullable String cleanupPreference;
        private @Nullable ContainerConfigurationResponse containerSettings;
        private @Nullable List<EnvironmentVariableResponse> environmentVariables;
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private String kind;
        private String location;
        private String name;
        private Map<String,Object> outputs;
        private @Nullable String primaryScriptUri;
        private String provisioningState;
        private String retentionInterval;
        private @Nullable String scriptContent;
        private ScriptStatusResponse status;
        private @Nullable StorageAccountConfigurationResponse storageAccountSettings;
        private @Nullable List<String> supportingScriptUris;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable String timeout;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAzureCliScriptResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.azCliVersion = defaults.azCliVersion;
    	      this.cleanupPreference = defaults.cleanupPreference;
    	      this.containerSettings = defaults.containerSettings;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.primaryScriptUri = defaults.primaryScriptUri;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retentionInterval = defaults.retentionInterval;
    	      this.scriptContent = defaults.scriptContent;
    	      this.status = defaults.status;
    	      this.storageAccountSettings = defaults.storageAccountSettings;
    	      this.supportingScriptUris = defaults.supportingScriptUris;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
        }

        public Builder setArguments(@Nullable String arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setAzCliVersion(String azCliVersion) {
            this.azCliVersion = Objects.requireNonNull(azCliVersion);
            return this;
        }

        public Builder setCleanupPreference(@Nullable String cleanupPreference) {
            this.cleanupPreference = cleanupPreference;
            return this;
        }

        public Builder setContainerSettings(@Nullable ContainerConfigurationResponse containerSettings) {
            this.containerSettings = containerSettings;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable List<EnvironmentVariableResponse> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputs(Map<String,Object> outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }

        public Builder setPrimaryScriptUri(@Nullable String primaryScriptUri) {
            this.primaryScriptUri = primaryScriptUri;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRetentionInterval(String retentionInterval) {
            this.retentionInterval = Objects.requireNonNull(retentionInterval);
            return this;
        }

        public Builder setScriptContent(@Nullable String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }

        public Builder setStatus(ScriptStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStorageAccountSettings(@Nullable StorageAccountConfigurationResponse storageAccountSettings) {
            this.storageAccountSettings = storageAccountSettings;
            return this;
        }

        public Builder setSupportingScriptUris(@Nullable List<String> supportingScriptUris) {
            this.supportingScriptUris = supportingScriptUris;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAzureCliScriptResult build() {
            return new GetAzureCliScriptResult(arguments, azCliVersion, cleanupPreference, containerSettings, environmentVariables, forceUpdateTag, id, identity, kind, location, name, outputs, primaryScriptUri, provisioningState, retentionInterval, scriptContent, status, storageAccountSettings, supportingScriptUris, systemData, tags, timeout, type);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonS3CompatibleReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonS3ReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFileStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.BinaryReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.DelimitedTextReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.FileServerReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.FtpReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleCloudStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.HdfsReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.HttpReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.JsonReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleCloudStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.SftpReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.outputs.XmlReadSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMetadataActivityResponse {
    /**
     * GetMetadata activity dataset reference.
     * 
     */
    private final DatasetReferenceResponse dataset;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Fields of metadata to get from dataset.
     * 
     */
    private final @Nullable List<Object> fieldList;
    /**
     * GetMetadata activity format settings.
     * 
     */
    private final @Nullable Object formatSettings;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * GetMetadata activity store settings.
     * 
     */
    private final @Nullable Object storeSettings;
    /**
     * Type of activity.
     * Expected value is 'GetMetadata'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"dataset","dependsOn","description","fieldList","formatSettings","linkedServiceName","name","policy","storeSettings","type","userProperties"})
    private GetMetadataActivityResponse(
        DatasetReferenceResponse dataset,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable List<Object> fieldList,
        @Nullable Object formatSettings,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        @Nullable ActivityPolicyResponse policy,
        @Nullable Object storeSettings,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.dataset = Objects.requireNonNull(dataset);
        this.dependsOn = dependsOn;
        this.description = description;
        this.fieldList = fieldList;
        this.formatSettings = formatSettings;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name);
        this.policy = policy;
        this.storeSettings = storeSettings;
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
    }

    /**
     * GetMetadata activity dataset reference.
     * 
    */
    public DatasetReferenceResponse getDataset() {
        return this.dataset;
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Fields of metadata to get from dataset.
     * 
    */
    public List<Object> getFieldList() {
        return this.fieldList == null ? List.of() : this.fieldList;
    }
    /**
     * GetMetadata activity format settings.
     * 
    */
    public Optional<Object> getFormatSettings() {
        return Optional.ofNullable(this.formatSettings);
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * GetMetadata activity store settings.
     * 
    */
    public Optional<Object> getStoreSettings() {
        return Optional.ofNullable(this.storeSettings);
    }
    /**
     * Type of activity.
     * Expected value is 'GetMetadata'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetReferenceResponse dataset;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable List<Object> fieldList;
        private @Nullable Object formatSettings;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable Object storeSettings;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetadataActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.fieldList = defaults.fieldList;
    	      this.formatSettings = defaults.formatSettings;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setDataset(DatasetReferenceResponse dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFieldList(@Nullable List<Object> fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        public Builder setFormatSettings(@Nullable Object formatSettings) {
            this.formatSettings = formatSettings;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setStoreSettings(@Nullable Object storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public GetMetadataActivityResponse build() {
            return new GetMetadataActivityResponse(dataset, dependsOn, description, fieldList, formatSettings, linkedServiceName, name, policy, storeSettings, type, userProperties);
        }
    }
}

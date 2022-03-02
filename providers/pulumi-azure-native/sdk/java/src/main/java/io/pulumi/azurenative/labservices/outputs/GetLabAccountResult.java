// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.azurenative.labservices.outputs.SizeConfigurationPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLabAccountResult {
    /**
     * Represents if region selection is enabled
     * 
     */
    private final @Nullable Boolean enabledRegionSelection;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    private final LatestOperationResultResponse latestOperationResult;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Represents the size configuration under the lab account
     * 
     */
    private final SizeConfigurationPropertiesResponse sizeConfiguration;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final @Nullable String uniqueIdentifier;

    @OutputCustomType.Constructor({"enabledRegionSelection","id","latestOperationResult","location","name","provisioningState","sizeConfiguration","tags","type","uniqueIdentifier"})
    private GetLabAccountResult(
        @Nullable Boolean enabledRegionSelection,
        String id,
        LatestOperationResultResponse latestOperationResult,
        @Nullable String location,
        String name,
        @Nullable String provisioningState,
        SizeConfigurationPropertiesResponse sizeConfiguration,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String uniqueIdentifier) {
        this.enabledRegionSelection = enabledRegionSelection;
        this.id = Objects.requireNonNull(id);
        this.latestOperationResult = Objects.requireNonNull(latestOperationResult);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = provisioningState;
        this.sizeConfiguration = Objects.requireNonNull(sizeConfiguration);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * Represents if region selection is enabled
     * 
    */
    public Optional<Boolean> getEnabledRegionSelection() {
        return Optional.ofNullable(this.enabledRegionSelection);
    }
    /**
     * The identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
    */
    public LatestOperationResultResponse getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Represents the size configuration under the lab account
     * 
    */
    public SizeConfigurationPropertiesResponse getSizeConfiguration() {
        return this.sizeConfiguration;
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public Optional<String> getUniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLabAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabledRegionSelection;
        private String id;
        private LatestOperationResultResponse latestOperationResult;
        private @Nullable String location;
        private String name;
        private @Nullable String provisioningState;
        private SizeConfigurationPropertiesResponse sizeConfiguration;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLabAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledRegionSelection = defaults.enabledRegionSelection;
    	      this.id = defaults.id;
    	      this.latestOperationResult = defaults.latestOperationResult;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sizeConfiguration = defaults.sizeConfiguration;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder setEnabledRegionSelection(@Nullable Boolean enabledRegionSelection) {
            this.enabledRegionSelection = enabledRegionSelection;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLatestOperationResult(LatestOperationResultResponse latestOperationResult) {
            this.latestOperationResult = Objects.requireNonNull(latestOperationResult);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSizeConfiguration(SizeConfigurationPropertiesResponse sizeConfiguration) {
            this.sizeConfiguration = Objects.requireNonNull(sizeConfiguration);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }
        public GetLabAccountResult build() {
            return new GetLabAccountResult(enabledRegionSelection, id, latestOperationResult, location, name, provisioningState, sizeConfiguration, tags, type, uniqueIdentifier);
        }
    }
}

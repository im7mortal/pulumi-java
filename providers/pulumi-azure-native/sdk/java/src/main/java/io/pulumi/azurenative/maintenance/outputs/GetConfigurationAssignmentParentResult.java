// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance.outputs;

import io.pulumi.azurenative.maintenance.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConfigurationAssignmentParentResult {
    /**
     * Fully qualified identifier of the resource
     * 
     */
    private final String id;
    /**
     * Location of the resource
     * 
     */
    private final @Nullable String location;
    /**
     * The maintenance configuration Id
     * 
     */
    private final @Nullable String maintenanceConfigurationId;
    /**
     * Name of the resource
     * 
     */
    private final String name;
    /**
     * The unique resourceId
     * 
     */
    private final @Nullable String resourceId;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the resource
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","maintenanceConfigurationId","name","resourceId","systemData","type"})
    private GetConfigurationAssignmentParentResult(
        String id,
        @Nullable String location,
        @Nullable String maintenanceConfigurationId,
        String name,
        @Nullable String resourceId,
        SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        this.name = Objects.requireNonNull(name);
        this.resourceId = resourceId;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Fully qualified identifier of the resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Location of the resource
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The maintenance configuration Id
     * 
    */
    public Optional<String> getMaintenanceConfigurationId() {
        return Optional.ofNullable(this.maintenanceConfigurationId);
    }
    /**
     * Name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The unique resourceId
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the resource
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationAssignmentParentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private @Nullable String maintenanceConfigurationId;
        private String name;
        private @Nullable String resourceId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationAssignmentParentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMaintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConfigurationAssignmentParentResult build() {
            return new GetConfigurationAssignmentParentResult(id, location, maintenanceConfigurationId, name, resourceId, systemData, type);
        }
    }
}

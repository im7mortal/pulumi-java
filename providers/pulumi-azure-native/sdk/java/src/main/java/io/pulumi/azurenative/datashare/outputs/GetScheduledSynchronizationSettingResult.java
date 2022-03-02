// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetScheduledSynchronizationSettingResult {
    /**
     * Time at which the synchronization setting was created.
     * 
     */
    private final String createdAt;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of synchronization setting.
     * Expected value is 'ScheduleBased'.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Gets or sets the provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * Recurrence Interval
     * 
     */
    private final String recurrenceInterval;
    /**
     * Synchronization time
     * 
     */
    private final String synchronizationTime;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;
    /**
     * Name of the user who created the synchronization setting.
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"createdAt","id","kind","name","provisioningState","recurrenceInterval","synchronizationTime","systemData","type","userName"})
    private GetScheduledSynchronizationSettingResult(
        String createdAt,
        String id,
        String kind,
        String name,
        String provisioningState,
        String recurrenceInterval,
        String synchronizationTime,
        SystemDataResponse systemData,
        String type,
        String userName) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.recurrenceInterval = Objects.requireNonNull(recurrenceInterval);
        this.synchronizationTime = Objects.requireNonNull(synchronizationTime);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
        this.userName = Objects.requireNonNull(userName);
    }

    /**
     * Time at which the synchronization setting was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of synchronization setting.
     * Expected value is 'ScheduleBased'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Recurrence Interval
     * 
    */
    public String getRecurrenceInterval() {
        return this.recurrenceInterval;
    }
    /**
     * Synchronization time
     * 
    */
    public String getSynchronizationTime() {
        return this.synchronizationTime;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Name of the user who created the synchronization setting.
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledSynchronizationSettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private String kind;
        private String name;
        private String provisioningState;
        private String recurrenceInterval;
        private String synchronizationTime;
        private SystemDataResponse systemData;
        private String type;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledSynchronizationSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.recurrenceInterval = defaults.recurrenceInterval;
    	      this.synchronizationTime = defaults.synchronizationTime;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRecurrenceInterval(String recurrenceInterval) {
            this.recurrenceInterval = Objects.requireNonNull(recurrenceInterval);
            return this;
        }

        public Builder setSynchronizationTime(String synchronizationTime) {
            this.synchronizationTime = Objects.requireNonNull(synchronizationTime);
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

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetScheduledSynchronizationSettingResult build() {
            return new GetScheduledSynchronizationSettingResult(createdAt, id, kind, name, provisioningState, recurrenceInterval, synchronizationTime, systemData, type, userName);
        }
    }
}

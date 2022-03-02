// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.RecurrencePatternResponse;
import io.pulumi.azurenative.labservices.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScheduleResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Notes for this schedule.
     * 
     */
    private final @Nullable String notes;
    /**
     * Current provisioning state of the schedule.
     * 
     */
    private final String provisioningState;
    /**
     * The recurrence pattern of the scheduled actions.
     * 
     */
    private final @Nullable RecurrencePatternResponse recurrencePattern;
    /**
     * When lab user virtual machines will be started. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    private final @Nullable String startAt;
    /**
     * When lab user virtual machines will be stopped. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    private final String stopAt;
    /**
     * Metadata pertaining to creation and last modification of the schedule.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The IANA timezone id for the schedule.
     * 
     */
    private final String timeZoneId;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","notes","provisioningState","recurrencePattern","startAt","stopAt","systemData","timeZoneId","type"})
    private GetScheduleResult(
        String id,
        String name,
        @Nullable String notes,
        String provisioningState,
        @Nullable RecurrencePatternResponse recurrencePattern,
        @Nullable String startAt,
        String stopAt,
        SystemDataResponse systemData,
        String timeZoneId,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.notes = notes;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.recurrencePattern = recurrencePattern;
        this.startAt = startAt;
        this.stopAt = Objects.requireNonNull(stopAt);
        this.systemData = Objects.requireNonNull(systemData);
        this.timeZoneId = Objects.requireNonNull(timeZoneId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Notes for this schedule.
     * 
    */
    public Optional<String> getNotes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * Current provisioning state of the schedule.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The recurrence pattern of the scheduled actions.
     * 
    */
    public Optional<RecurrencePatternResponse> getRecurrencePattern() {
        return Optional.ofNullable(this.recurrencePattern);
    }
    /**
     * When lab user virtual machines will be started. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
    */
    public Optional<String> getStartAt() {
        return Optional.ofNullable(this.startAt);
    }
    /**
     * When lab user virtual machines will be stopped. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
    */
    public String getStopAt() {
        return this.stopAt;
    }
    /**
     * Metadata pertaining to creation and last modification of the schedule.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The IANA timezone id for the schedule.
     * 
    */
    public String getTimeZoneId() {
        return this.timeZoneId;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable String notes;
        private String provisioningState;
        private @Nullable RecurrencePatternResponse recurrencePattern;
        private @Nullable String startAt;
        private String stopAt;
        private SystemDataResponse systemData;
        private String timeZoneId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.recurrencePattern = defaults.recurrencePattern;
    	      this.startAt = defaults.startAt;
    	      this.stopAt = defaults.stopAt;
    	      this.systemData = defaults.systemData;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotes(@Nullable String notes) {
            this.notes = notes;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRecurrencePattern(@Nullable RecurrencePatternResponse recurrencePattern) {
            this.recurrencePattern = recurrencePattern;
            return this;
        }

        public Builder setStartAt(@Nullable String startAt) {
            this.startAt = startAt;
            return this;
        }

        public Builder setStopAt(String stopAt) {
            this.stopAt = Objects.requireNonNull(stopAt);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTimeZoneId(String timeZoneId) {
            this.timeZoneId = Objects.requireNonNull(timeZoneId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetScheduleResult build() {
            return new GetScheduleResult(id, name, notes, provisioningState, recurrencePattern, startAt, stopAt, systemData, timeZoneId, type);
        }
    }
}

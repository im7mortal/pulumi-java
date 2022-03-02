// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerservice.outputs.TimeInWeekResponse;
import io.pulumi.azurenative.containerservice.outputs.TimeSpanResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMaintenanceConfigurationResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final String name;
    /**
     * Time slots on which upgrade is not allowed.
     * 
     */
    private final @Nullable List<TimeSpanResponse> notAllowedTime;
    /**
     * The system meta data relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Weekday time slots allowed to upgrade.
     * 
     */
    private final @Nullable List<TimeInWeekResponse> timeInWeek;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","notAllowedTime","systemData","timeInWeek","type"})
    private GetMaintenanceConfigurationResult(
        String id,
        String name,
        @Nullable List<TimeSpanResponse> notAllowedTime,
        SystemDataResponse systemData,
        @Nullable List<TimeInWeekResponse> timeInWeek,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.notAllowedTime = notAllowedTime;
        this.systemData = Objects.requireNonNull(systemData);
        this.timeInWeek = timeInWeek;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Time slots on which upgrade is not allowed.
     * 
    */
    public List<TimeSpanResponse> getNotAllowedTime() {
        return this.notAllowedTime == null ? List.of() : this.notAllowedTime;
    }
    /**
     * The system meta data relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Weekday time slots allowed to upgrade.
     * 
    */
    public List<TimeInWeekResponse> getTimeInWeek() {
        return this.timeInWeek == null ? List.of() : this.timeInWeek;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaintenanceConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable List<TimeSpanResponse> notAllowedTime;
        private SystemDataResponse systemData;
        private @Nullable List<TimeInWeekResponse> timeInWeek;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaintenanceConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.notAllowedTime = defaults.notAllowedTime;
    	      this.systemData = defaults.systemData;
    	      this.timeInWeek = defaults.timeInWeek;
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

        public Builder setNotAllowedTime(@Nullable List<TimeSpanResponse> notAllowedTime) {
            this.notAllowedTime = notAllowedTime;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTimeInWeek(@Nullable List<TimeInWeekResponse> timeInWeek) {
            this.timeInWeek = timeInWeek;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetMaintenanceConfigurationResult build() {
            return new GetMaintenanceConfigurationResult(id, name, notAllowedTime, systemData, timeInWeek, type);
        }
    }
}

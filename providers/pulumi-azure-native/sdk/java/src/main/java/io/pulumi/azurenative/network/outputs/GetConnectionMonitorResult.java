// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ConnectionMonitorDestinationResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorEndpointResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorOutputResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorSourceResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorTestConfigurationResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorTestGroupResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectionMonitorResult {
    /**
     * Determines if the connection monitor will start automatically once created.
     * 
     */
    private final @Nullable Boolean autoStart;
    /**
     * Type of connection monitor.
     * 
     */
    private final String connectionMonitorType;
    /**
     * Describes the destination of connection monitor.
     * 
     */
    private final @Nullable ConnectionMonitorDestinationResponse destination;
    /**
     * List of connection monitor endpoints.
     * 
     */
    private final @Nullable List<ConnectionMonitorEndpointResponse> endpoints;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * ID of the connection monitor.
     * 
     */
    private final String id;
    /**
     * Connection monitor location.
     * 
     */
    private final @Nullable String location;
    /**
     * Monitoring interval in seconds.
     * 
     */
    private final @Nullable Integer monitoringIntervalInSeconds;
    /**
     * The monitoring status of the connection monitor.
     * 
     */
    private final String monitoringStatus;
    /**
     * Name of the connection monitor.
     * 
     */
    private final String name;
    /**
     * Optional notes to be associated with the connection monitor.
     * 
     */
    private final @Nullable String notes;
    /**
     * List of connection monitor outputs.
     * 
     */
    private final @Nullable List<ConnectionMonitorOutputResponse> outputs;
    /**
     * The provisioning state of the connection monitor.
     * 
     */
    private final String provisioningState;
    /**
     * Describes the source of connection monitor.
     * 
     */
    private final @Nullable ConnectionMonitorSourceResponse source;
    /**
     * The date and time when the connection monitor was started.
     * 
     */
    private final String startTime;
    /**
     * Connection monitor tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * List of connection monitor test configurations.
     * 
     */
    private final @Nullable List<ConnectionMonitorTestConfigurationResponse> testConfigurations;
    /**
     * List of connection monitor test groups.
     * 
     */
    private final @Nullable List<ConnectionMonitorTestGroupResponse> testGroups;
    /**
     * Connection monitor type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"autoStart","connectionMonitorType","destination","endpoints","etag","id","location","monitoringIntervalInSeconds","monitoringStatus","name","notes","outputs","provisioningState","source","startTime","tags","testConfigurations","testGroups","type"})
    private GetConnectionMonitorResult(
        @Nullable Boolean autoStart,
        String connectionMonitorType,
        @Nullable ConnectionMonitorDestinationResponse destination,
        @Nullable List<ConnectionMonitorEndpointResponse> endpoints,
        String etag,
        String id,
        @Nullable String location,
        @Nullable Integer monitoringIntervalInSeconds,
        String monitoringStatus,
        String name,
        @Nullable String notes,
        @Nullable List<ConnectionMonitorOutputResponse> outputs,
        String provisioningState,
        @Nullable ConnectionMonitorSourceResponse source,
        String startTime,
        @Nullable Map<String,String> tags,
        @Nullable List<ConnectionMonitorTestConfigurationResponse> testConfigurations,
        @Nullable List<ConnectionMonitorTestGroupResponse> testGroups,
        String type) {
        this.autoStart = autoStart;
        this.connectionMonitorType = Objects.requireNonNull(connectionMonitorType);
        this.destination = destination;
        this.endpoints = endpoints;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
        this.monitoringStatus = Objects.requireNonNull(monitoringStatus);
        this.name = Objects.requireNonNull(name);
        this.notes = notes;
        this.outputs = outputs;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.source = source;
        this.startTime = Objects.requireNonNull(startTime);
        this.tags = tags;
        this.testConfigurations = testConfigurations;
        this.testGroups = testGroups;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Determines if the connection monitor will start automatically once created.
     * 
    */
    public Optional<Boolean> getAutoStart() {
        return Optional.ofNullable(this.autoStart);
    }
    /**
     * Type of connection monitor.
     * 
    */
    public String getConnectionMonitorType() {
        return this.connectionMonitorType;
    }
    /**
     * Describes the destination of connection monitor.
     * 
    */
    public Optional<ConnectionMonitorDestinationResponse> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * List of connection monitor endpoints.
     * 
    */
    public List<ConnectionMonitorEndpointResponse> getEndpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * ID of the connection monitor.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Connection monitor location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Monitoring interval in seconds.
     * 
    */
    public Optional<Integer> getMonitoringIntervalInSeconds() {
        return Optional.ofNullable(this.monitoringIntervalInSeconds);
    }
    /**
     * The monitoring status of the connection monitor.
     * 
    */
    public String getMonitoringStatus() {
        return this.monitoringStatus;
    }
    /**
     * Name of the connection monitor.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional notes to be associated with the connection monitor.
     * 
    */
    public Optional<String> getNotes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * List of connection monitor outputs.
     * 
    */
    public List<ConnectionMonitorOutputResponse> getOutputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }
    /**
     * The provisioning state of the connection monitor.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes the source of connection monitor.
     * 
    */
    public Optional<ConnectionMonitorSourceResponse> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The date and time when the connection monitor was started.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Connection monitor tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * List of connection monitor test configurations.
     * 
    */
    public List<ConnectionMonitorTestConfigurationResponse> getTestConfigurations() {
        return this.testConfigurations == null ? List.of() : this.testConfigurations;
    }
    /**
     * List of connection monitor test groups.
     * 
    */
    public List<ConnectionMonitorTestGroupResponse> getTestGroups() {
        return this.testGroups == null ? List.of() : this.testGroups;
    }
    /**
     * Connection monitor type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionMonitorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoStart;
        private String connectionMonitorType;
        private @Nullable ConnectionMonitorDestinationResponse destination;
        private @Nullable List<ConnectionMonitorEndpointResponse> endpoints;
        private String etag;
        private String id;
        private @Nullable String location;
        private @Nullable Integer monitoringIntervalInSeconds;
        private String monitoringStatus;
        private String name;
        private @Nullable String notes;
        private @Nullable List<ConnectionMonitorOutputResponse> outputs;
        private String provisioningState;
        private @Nullable ConnectionMonitorSourceResponse source;
        private String startTime;
        private @Nullable Map<String,String> tags;
        private @Nullable List<ConnectionMonitorTestConfigurationResponse> testConfigurations;
        private @Nullable List<ConnectionMonitorTestGroupResponse> testGroups;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionMonitorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoStart = defaults.autoStart;
    	      this.connectionMonitorType = defaults.connectionMonitorType;
    	      this.destination = defaults.destination;
    	      this.endpoints = defaults.endpoints;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.monitoringIntervalInSeconds = defaults.monitoringIntervalInSeconds;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.outputs = defaults.outputs;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.startTime = defaults.startTime;
    	      this.tags = defaults.tags;
    	      this.testConfigurations = defaults.testConfigurations;
    	      this.testGroups = defaults.testGroups;
    	      this.type = defaults.type;
        }

        public Builder setAutoStart(@Nullable Boolean autoStart) {
            this.autoStart = autoStart;
            return this;
        }

        public Builder setConnectionMonitorType(String connectionMonitorType) {
            this.connectionMonitorType = Objects.requireNonNull(connectionMonitorType);
            return this;
        }

        public Builder setDestination(@Nullable ConnectionMonitorDestinationResponse destination) {
            this.destination = destination;
            return this;
        }

        public Builder setEndpoints(@Nullable List<ConnectionMonitorEndpointResponse> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMonitoringIntervalInSeconds(@Nullable Integer monitoringIntervalInSeconds) {
            this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
            return this;
        }

        public Builder setMonitoringStatus(String monitoringStatus) {
            this.monitoringStatus = Objects.requireNonNull(monitoringStatus);
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

        public Builder setOutputs(@Nullable List<ConnectionMonitorOutputResponse> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSource(@Nullable ConnectionMonitorSourceResponse source) {
            this.source = source;
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTestConfigurations(@Nullable List<ConnectionMonitorTestConfigurationResponse> testConfigurations) {
            this.testConfigurations = testConfigurations;
            return this;
        }

        public Builder setTestGroups(@Nullable List<ConnectionMonitorTestGroupResponse> testGroups) {
            this.testGroups = testGroups;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConnectionMonitorResult build() {
            return new GetConnectionMonitorResult(autoStart, connectionMonitorType, destination, endpoints, etag, id, location, monitoringIntervalInSeconds, monitoringStatus, name, notes, outputs, provisioningState, source, startTime, tags, testConfigurations, testGroups, type);
        }
    }
}

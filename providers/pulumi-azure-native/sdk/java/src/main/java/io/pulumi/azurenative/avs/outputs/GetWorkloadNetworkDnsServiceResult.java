// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkloadNetworkDnsServiceResult {
    /**
     * Default DNS zone of the DNS Service.
     * 
     */
    private final @Nullable String defaultDnsZone;
    /**
     * Display name of the DNS Service.
     * 
     */
    private final @Nullable String displayName;
    /**
     * DNS service IP of the DNS Service.
     * 
     */
    private final @Nullable String dnsServiceIp;
    /**
     * FQDN zones of the DNS Service.
     * 
     */
    private final @Nullable List<String> fqdnZones;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * DNS Service log level.
     * 
     */
    private final @Nullable String logLevel;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * NSX revision number.
     * 
     */
    private final @Nullable Double revision;
    /**
     * DNS Service status.
     * 
     */
    private final String status;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"defaultDnsZone","displayName","dnsServiceIp","fqdnZones","id","logLevel","name","provisioningState","revision","status","type"})
    private GetWorkloadNetworkDnsServiceResult(
        @Nullable String defaultDnsZone,
        @Nullable String displayName,
        @Nullable String dnsServiceIp,
        @Nullable List<String> fqdnZones,
        String id,
        @Nullable String logLevel,
        String name,
        String provisioningState,
        @Nullable Double revision,
        String status,
        String type) {
        this.defaultDnsZone = defaultDnsZone;
        this.displayName = displayName;
        this.dnsServiceIp = dnsServiceIp;
        this.fqdnZones = fqdnZones;
        this.id = Objects.requireNonNull(id);
        this.logLevel = logLevel;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.revision = revision;
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Default DNS zone of the DNS Service.
     * 
    */
    public Optional<String> getDefaultDnsZone() {
        return Optional.ofNullable(this.defaultDnsZone);
    }
    /**
     * Display name of the DNS Service.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * DNS service IP of the DNS Service.
     * 
    */
    public Optional<String> getDnsServiceIp() {
        return Optional.ofNullable(this.dnsServiceIp);
    }
    /**
     * FQDN zones of the DNS Service.
     * 
    */
    public List<String> getFqdnZones() {
        return this.fqdnZones == null ? List.of() : this.fqdnZones;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * DNS Service log level.
     * 
    */
    public Optional<String> getLogLevel() {
        return Optional.ofNullable(this.logLevel);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * NSX revision number.
     * 
    */
    public Optional<Double> getRevision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * DNS Service status.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkDnsServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultDnsZone;
        private @Nullable String displayName;
        private @Nullable String dnsServiceIp;
        private @Nullable List<String> fqdnZones;
        private String id;
        private @Nullable String logLevel;
        private String name;
        private String provisioningState;
        private @Nullable Double revision;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkDnsServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultDnsZone = defaults.defaultDnsZone;
    	      this.displayName = defaults.displayName;
    	      this.dnsServiceIp = defaults.dnsServiceIp;
    	      this.fqdnZones = defaults.fqdnZones;
    	      this.id = defaults.id;
    	      this.logLevel = defaults.logLevel;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.revision = defaults.revision;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setDefaultDnsZone(@Nullable String defaultDnsZone) {
            this.defaultDnsZone = defaultDnsZone;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDnsServiceIp(@Nullable String dnsServiceIp) {
            this.dnsServiceIp = dnsServiceIp;
            return this;
        }

        public Builder setFqdnZones(@Nullable List<String> fqdnZones) {
            this.fqdnZones = fqdnZones;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLogLevel(@Nullable String logLevel) {
            this.logLevel = logLevel;
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

        public Builder setRevision(@Nullable Double revision) {
            this.revision = revision;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWorkloadNetworkDnsServiceResult build() {
            return new GetWorkloadNetworkDnsServiceResult(defaultDnsZone, displayName, dnsServiceIp, fqdnZones, id, logLevel, name, provisioningState, revision, status, type);
        }
    }
}

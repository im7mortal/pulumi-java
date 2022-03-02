// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecordSetResponse {
    /**
     * Fqdn that resolves to private endpoint ip address.
     * 
     */
    private final @Nullable String fqdn;
    /**
     * The private ip address of the private endpoint.
     * 
     */
    private final @Nullable List<String> ipAddresses;
    /**
     * The provisioning state of the recordset.
     * 
     */
    private final String provisioningState;
    /**
     * Recordset name.
     * 
     */
    private final @Nullable String recordSetName;
    /**
     * Resource record type.
     * 
     */
    private final @Nullable String recordType;
    /**
     * Recordset time to live.
     * 
     */
    private final @Nullable Integer ttl;

    @OutputCustomType.Constructor({"fqdn","ipAddresses","provisioningState","recordSetName","recordType","ttl"})
    private RecordSetResponse(
        @Nullable String fqdn,
        @Nullable List<String> ipAddresses,
        String provisioningState,
        @Nullable String recordSetName,
        @Nullable String recordType,
        @Nullable Integer ttl) {
        this.fqdn = fqdn;
        this.ipAddresses = ipAddresses;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.recordSetName = recordSetName;
        this.recordType = recordType;
        this.ttl = ttl;
    }

    /**
     * Fqdn that resolves to private endpoint ip address.
     * 
    */
    public Optional<String> getFqdn() {
        return Optional.ofNullable(this.fqdn);
    }
    /**
     * The private ip address of the private endpoint.
     * 
    */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * The provisioning state of the recordset.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Recordset name.
     * 
    */
    public Optional<String> getRecordSetName() {
        return Optional.ofNullable(this.recordSetName);
    }
    /**
     * Resource record type.
     * 
    */
    public Optional<String> getRecordType() {
        return Optional.ofNullable(this.recordType);
    }
    /**
     * Recordset time to live.
     * 
    */
    public Optional<Integer> getTtl() {
        return Optional.ofNullable(this.ttl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fqdn;
        private @Nullable List<String> ipAddresses;
        private String provisioningState;
        private @Nullable String recordSetName;
        private @Nullable String recordType;
        private @Nullable Integer ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.provisioningState = defaults.provisioningState;
    	      this.recordSetName = defaults.recordSetName;
    	      this.recordType = defaults.recordType;
    	      this.ttl = defaults.ttl;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRecordSetName(@Nullable String recordSetName) {
            this.recordSetName = recordSetName;
            return this;
        }

        public Builder setRecordType(@Nullable String recordType) {
            this.recordType = recordType;
            return this;
        }

        public Builder setTtl(@Nullable Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public RecordSetResponse build() {
            return new RecordSetResponse(fqdn, ipAddresses, provisioningState, recordSetName, recordType, ttl);
        }
    }
}

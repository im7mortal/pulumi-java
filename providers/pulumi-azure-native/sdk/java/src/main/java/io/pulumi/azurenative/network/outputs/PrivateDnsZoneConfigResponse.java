// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.RecordSetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateDnsZoneConfigResponse {
    /**
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The resource id of the private dns zone.
     * 
     */
    private final @Nullable String privateDnsZoneId;
    /**
     * A collection of information regarding a recordSet, holding information to identify private resources.
     * 
     */
    private final List<RecordSetResponse> recordSets;

    @OutputCustomType.Constructor({"name","privateDnsZoneId","recordSets"})
    private PrivateDnsZoneConfigResponse(
        @Nullable String name,
        @Nullable String privateDnsZoneId,
        List<RecordSetResponse> recordSets) {
        this.name = name;
        this.privateDnsZoneId = privateDnsZoneId;
        this.recordSets = Objects.requireNonNull(recordSets);
    }

    /**
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The resource id of the private dns zone.
     * 
    */
    public Optional<String> getPrivateDnsZoneId() {
        return Optional.ofNullable(this.privateDnsZoneId);
    }
    /**
     * A collection of information regarding a recordSet, holding information to identify private resources.
     * 
    */
    public List<RecordSetResponse> getRecordSets() {
        return this.recordSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateDnsZoneConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String privateDnsZoneId;
        private List<RecordSetResponse> recordSets;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateDnsZoneConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateDnsZoneId = defaults.privateDnsZoneId;
    	      this.recordSets = defaults.recordSets;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPrivateDnsZoneId(@Nullable String privateDnsZoneId) {
            this.privateDnsZoneId = privateDnsZoneId;
            return this;
        }

        public Builder setRecordSets(List<RecordSetResponse> recordSets) {
            this.recordSets = Objects.requireNonNull(recordSets);
            return this;
        }
        public PrivateDnsZoneConfigResponse build() {
            return new PrivateDnsZoneConfigResponse(name, privateDnsZoneId, recordSets);
        }
    }
}

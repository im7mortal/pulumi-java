// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.azurenative.avs.outputs.DiskPoolVolumeResponse;
import io.pulumi.azurenative.avs.outputs.NetAppVolumeResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDatastoreResult {
    /**
     * An iSCSI volume
     * 
     */
    private final @Nullable DiskPoolVolumeResponse diskPoolVolume;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * An Azure NetApp Files volume
     * 
     */
    private final @Nullable NetAppVolumeResponse netAppVolume;
    /**
     * The state of the datastore provisioning
     * 
     */
    private final String provisioningState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"diskPoolVolume","id","name","netAppVolume","provisioningState","type"})
    private GetDatastoreResult(
        @Nullable DiskPoolVolumeResponse diskPoolVolume,
        String id,
        String name,
        @Nullable NetAppVolumeResponse netAppVolume,
        String provisioningState,
        String type) {
        this.diskPoolVolume = diskPoolVolume;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.netAppVolume = netAppVolume;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * An iSCSI volume
     * 
    */
    public Optional<DiskPoolVolumeResponse> getDiskPoolVolume() {
        return Optional.ofNullable(this.diskPoolVolume);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * An Azure NetApp Files volume
     * 
    */
    public Optional<NetAppVolumeResponse> getNetAppVolume() {
        return Optional.ofNullable(this.netAppVolume);
    }
    /**
     * The state of the datastore provisioning
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
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

    public static Builder builder(GetDatastoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DiskPoolVolumeResponse diskPoolVolume;
        private String id;
        private String name;
        private @Nullable NetAppVolumeResponse netAppVolume;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatastoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskPoolVolume = defaults.diskPoolVolume;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.netAppVolume = defaults.netAppVolume;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setDiskPoolVolume(@Nullable DiskPoolVolumeResponse diskPoolVolume) {
            this.diskPoolVolume = diskPoolVolume;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetAppVolume(@Nullable NetAppVolumeResponse netAppVolume) {
            this.netAppVolume = netAppVolume;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDatastoreResult build() {
            return new GetDatastoreResult(diskPoolVolume, id, name, netAppVolume, provisioningState, type);
        }
    }
}

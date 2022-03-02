// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSnapshotResult {
    /**
     * The creation date of the snapshot
     * 
     */
    private final String created;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Azure lifecycle management
     * 
     */
    private final String provisioningState;
    /**
     * UUID v4 used to identify the Snapshot
     * 
     */
    private final String snapshotId;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"created","id","location","name","provisioningState","snapshotId","type"})
    private GetSnapshotResult(
        String created,
        String id,
        String location,
        String name,
        String provisioningState,
        String snapshotId,
        String type) {
        this.created = Objects.requireNonNull(created);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.snapshotId = Objects.requireNonNull(snapshotId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The creation date of the snapshot
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Azure lifecycle management
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * UUID v4 used to identify the Snapshot
     * 
    */
    public String getSnapshotId() {
        return this.snapshotId;
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

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private String snapshotId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.snapshotId = defaults.snapshotId;
    	      this.type = defaults.type;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
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

        public Builder setSnapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSnapshotResult build() {
            return new GetSnapshotResult(created, id, location, name, provisioningState, snapshotId, type);
        }
    }
}

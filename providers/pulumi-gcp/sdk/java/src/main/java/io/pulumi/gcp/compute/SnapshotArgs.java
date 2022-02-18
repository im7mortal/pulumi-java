// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SnapshotSnapshotEncryptionKeyArgs;
import io.pulumi.gcp.compute.inputs.SnapshotSourceDiskEncryptionKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Labels to apply to this Snapshot.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The customer-supplied encryption key of the snapshot. Required if the
     * source snapshot is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    @InputImport(name="snapshotEncryptionKey")
    private final @Nullable Input<SnapshotSnapshotEncryptionKeyArgs> snapshotEncryptionKey;

    public Input<SnapshotSnapshotEncryptionKeyArgs> getSnapshotEncryptionKey() {
        return this.snapshotEncryptionKey == null ? Input.empty() : this.snapshotEncryptionKey;
    }

    /**
     * A reference to the disk used to create this snapshot.
     * 
     */
    @InputImport(name="sourceDisk", required=true)
    private final Input<String> sourceDisk;

    public Input<String> getSourceDisk() {
        return this.sourceDisk;
    }

    /**
     * The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    @InputImport(name="sourceDiskEncryptionKey")
    private final @Nullable Input<SnapshotSourceDiskEncryptionKeyArgs> sourceDiskEncryptionKey;

    public Input<SnapshotSourceDiskEncryptionKeyArgs> getSourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey == null ? Input.empty() : this.sourceDiskEncryptionKey;
    }

    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    @InputImport(name="storageLocations")
    private final @Nullable Input<List<String>> storageLocations;

    public Input<List<String>> getStorageLocations() {
        return this.storageLocations == null ? Input.empty() : this.storageLocations;
    }

    /**
     * A reference to the zone where the disk is hosted.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public SnapshotArgs(
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<SnapshotSnapshotEncryptionKeyArgs> snapshotEncryptionKey,
        Input<String> sourceDisk,
        @Nullable Input<SnapshotSourceDiskEncryptionKeyArgs> sourceDiskEncryptionKey,
        @Nullable Input<List<String>> storageLocations,
        @Nullable Input<String> zone) {
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.snapshotEncryptionKey = snapshotEncryptionKey;
        this.sourceDisk = Objects.requireNonNull(sourceDisk, "expected parameter 'sourceDisk' to be non-null");
        this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
        this.storageLocations = storageLocations;
        this.zone = zone;
    }

    private SnapshotArgs() {
        this.description = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.snapshotEncryptionKey = Input.empty();
        this.sourceDisk = Input.empty();
        this.sourceDiskEncryptionKey = Input.empty();
        this.storageLocations = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<SnapshotSnapshotEncryptionKeyArgs> snapshotEncryptionKey;
        private Input<String> sourceDisk;
        private @Nullable Input<SnapshotSourceDiskEncryptionKeyArgs> sourceDiskEncryptionKey;
        private @Nullable Input<List<String>> storageLocations;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.snapshotEncryptionKey = defaults.snapshotEncryptionKey;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskEncryptionKey = defaults.sourceDiskEncryptionKey;
    	      this.storageLocations = defaults.storageLocations;
    	      this.zone = defaults.zone;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSnapshotEncryptionKey(@Nullable Input<SnapshotSnapshotEncryptionKeyArgs> snapshotEncryptionKey) {
            this.snapshotEncryptionKey = snapshotEncryptionKey;
            return this;
        }

        public Builder setSnapshotEncryptionKey(@Nullable SnapshotSnapshotEncryptionKeyArgs snapshotEncryptionKey) {
            this.snapshotEncryptionKey = Input.ofNullable(snapshotEncryptionKey);
            return this;
        }

        public Builder setSourceDisk(Input<String> sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }

        public Builder setSourceDisk(String sourceDisk) {
            this.sourceDisk = Input.of(Objects.requireNonNull(sourceDisk));
            return this;
        }

        public Builder setSourceDiskEncryptionKey(@Nullable Input<SnapshotSourceDiskEncryptionKeyArgs> sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
            return this;
        }

        public Builder setSourceDiskEncryptionKey(@Nullable SnapshotSourceDiskEncryptionKeyArgs sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = Input.ofNullable(sourceDiskEncryptionKey);
            return this;
        }

        public Builder setStorageLocations(@Nullable Input<List<String>> storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }

        public Builder setStorageLocations(@Nullable List<String> storageLocations) {
            this.storageLocations = Input.ofNullable(storageLocations);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public SnapshotArgs build() {
            return new SnapshotArgs(description, labels, name, project, snapshotEncryptionKey, sourceDisk, sourceDiskEncryptionKey, storageLocations, zone);
        }
    }
}
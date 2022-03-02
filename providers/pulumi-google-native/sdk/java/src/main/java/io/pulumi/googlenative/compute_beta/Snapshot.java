// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.SnapshotArgs;
import io.pulumi.googlenative.compute_beta.outputs.CustomerEncryptionKeyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a snapshot in the specified project using the data included in the request. For regular snapshot creation, consider using this method instead of disks.createSnapshot, as this method supports more features, such as creating snapshots in a project different from the source disk project.
 * 
 */
@ResourceType(type="google-native:compute/beta:Snapshot")
public class Snapshot extends io.pulumi.resources.CustomResource {
    /**
     * Set to true if snapshots are automatically created by applying resource policy on the target disk.
     * 
     */
    @OutputExport(name="autoCreated", type=Boolean.class, parameters={})
    private Output<Boolean> autoCreated;

    /**
     * @return Set to true if snapshots are automatically created by applying resource policy on the target disk.
     * 
     */
    public Output<Boolean> getAutoCreated() {
        return this.autoCreated;
    }
    /**
     * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
     * 
     */
    @OutputExport(name="chainName", type=String.class, parameters={})
    private Output<String> chainName;

    /**
     * @return Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
     * 
     */
    public Output<String> getChainName() {
        return this.chainName;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Size of the source disk, specified in GB.
     * 
     */
    @OutputExport(name="diskSizeGb", type=String.class, parameters={})
    private Output<String> diskSizeGb;

    /**
     * @return Size of the source disk, specified in GB.
     * 
     */
    public Output<String> getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Number of bytes downloaded to restore a snapshot to a disk.
     * 
     */
    @OutputExport(name="downloadBytes", type=String.class, parameters={})
    private Output<String> downloadBytes;

    /**
     * @return Number of bytes downloaded to restore a snapshot to a disk.
     * 
     */
    public Output<String> getDownloadBytes() {
        return this.downloadBytes;
    }
    /**
     * [Input Only] Whether to attempt an application consistent snapshot by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    @OutputExport(name="guestFlush", type=Boolean.class, parameters={})
    private Output<Boolean> guestFlush;

    /**
     * @return [Input Only] Whether to attempt an application consistent snapshot by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    public Output<Boolean> getGuestFlush() {
        return this.guestFlush;
    }
    /**
     * Type of the resource. Always compute#snapshot for Snapshot resources.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#snapshot for Snapshot resources.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a snapshot.
     * 
     */
    @OutputExport(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a snapshot.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Integer license codes indicating which licenses are attached to this snapshot.
     * 
     */
    @OutputExport(name="licenseCodes", type=List.class, parameters={String.class})
    private Output<List<String>> licenseCodes;

    /**
     * @return Integer license codes indicating which licenses are attached to this snapshot.
     * 
     */
    public Output<List<String>> getLicenseCodes() {
        return this.licenseCodes;
    }
    /**
     * A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a Windows image).
     * 
     */
    @OutputExport(name="licenses", type=List.class, parameters={String.class})
    private Output<List<String>> licenses;

    /**
     * @return A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a Windows image).
     * 
     */
    public Output<List<String>> getLicenses() {
        return this.licenses;
    }
    /**
     * An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @OutputExport(name="locationHint", type=String.class, parameters={})
    private Output<String> locationHint;

    /**
     * @return An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    public Output<String> getLocationHint() {
        return this.locationHint;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Reserved for future use.
     * 
     */
    @OutputExport(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
     * 
     */
    @OutputExport(name="snapshotEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> snapshotEncryptionKey;

    /**
     * @return Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> getSnapshotEncryptionKey() {
        return this.snapshotEncryptionKey;
    }
    /**
     * The source disk used to create this snapshot.
     * 
     */
    @OutputExport(name="sourceDisk", type=String.class, parameters={})
    private Output<String> sourceDisk;

    /**
     * @return The source disk used to create this snapshot.
     * 
     */
    public Output<String> getSourceDisk() {
        return this.sourceDisk;
    }
    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @OutputExport(name="sourceDiskEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceDiskEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> getSourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey;
    }
    /**
     * The ID value of the disk used to create this snapshot. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given disk name.
     * 
     */
    @OutputExport(name="sourceDiskId", type=String.class, parameters={})
    private Output<String> sourceDiskId;

    /**
     * @return The ID value of the disk used to create this snapshot. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given disk name.
     * 
     */
    public Output<String> getSourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or UPLOADING.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or UPLOADING.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot creation/deletion.
     * 
     */
    @OutputExport(name="storageBytes", type=String.class, parameters={})
    private Output<String> storageBytes;

    /**
     * @return A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot creation/deletion.
     * 
     */
    public Output<String> getStorageBytes() {
        return this.storageBytes;
    }
    /**
     * An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    @OutputExport(name="storageBytesStatus", type=String.class, parameters={})
    private Output<String> storageBytesStatus;

    /**
     * @return An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    public Output<String> getStorageBytesStatus() {
        return this.storageBytesStatus;
    }
    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    @OutputExport(name="storageLocations", type=List.class, parameters={String.class})
    private Output<List<String>> storageLocations;

    /**
     * @return Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    public Output<List<String>> getStorageLocations() {
        return this.storageLocations;
    }
    /**
     * A list of user provided licenses represented by a list of URLs to the license resource.
     * 
     */
    @OutputExport(name="userLicenses", type=List.class, parameters={String.class})
    private Output<List<String>> userLicenses;

    /**
     * @return A list of user provided licenses represented by a list of URLs to the license resource.
     * 
     */
    public Output<List<String>> getUserLicenses() {
        return this.userLicenses;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable SnapshotArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_beta.SnapshotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_beta.SnapshotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Snapshot(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, @Nullable SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, @Nullable SnapshotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Snapshot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Snapshot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Snapshot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, options);
    }
}

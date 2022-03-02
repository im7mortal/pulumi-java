// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.file_v1beta1.BackupArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a backup.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:file/v1beta1:Backup")
public class Backup extends io.pulumi.resources.CustomResource {
    /**
     * Capacity of the source file share when the backup was created.
     * 
     */
    @OutputExport(name="capacityGb", type=String.class, parameters={})
    private Output<String> capacityGb;

    /**
     * @return Capacity of the source file share when the backup was created.
     * 
     */
    public Output<String> getCapacityGb() {
        return this.capacityGb;
    }
    /**
     * The time when the backup was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the backup was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Amount of bytes that will be downloaded if the backup is restored
     * 
     */
    @OutputExport(name="downloadBytes", type=String.class, parameters={})
    private Output<String> downloadBytes;

    /**
     * @return Amount of bytes that will be downloaded if the backup is restored
     * 
     */
    public Output<String> getDownloadBytes() {
        return this.downloadBytes;
    }
    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the backup, in the format `projects/{project_id}/locations/{location_id}/backups/{backup_id}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the backup, in the format `projects/{project_id}/locations/{location_id}/backups/{backup_id}`.
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
     * Name of the file share in the source Cloud Filestore instance that the backup is created from.
     * 
     */
    @OutputExport(name="sourceFileShare", type=String.class, parameters={})
    private Output<String> sourceFileShare;

    /**
     * @return Name of the file share in the source Cloud Filestore instance that the backup is created from.
     * 
     */
    public Output<String> getSourceFileShare() {
        return this.sourceFileShare;
    }
    /**
     * The resource name of the source Cloud Filestore instance, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}`, used to create this backup.
     * 
     */
    @OutputExport(name="sourceInstance", type=String.class, parameters={})
    private Output<String> sourceInstance;

    /**
     * @return The resource name of the source Cloud Filestore instance, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}`, used to create this backup.
     * 
     */
    public Output<String> getSourceInstance() {
        return this.sourceInstance;
    }
    /**
     * The service tier of the source Cloud Filestore instance that this backup is created from.
     * 
     */
    @OutputExport(name="sourceInstanceTier", type=String.class, parameters={})
    private Output<String> sourceInstanceTier;

    /**
     * @return The service tier of the source Cloud Filestore instance that this backup is created from.
     * 
     */
    public Output<String> getSourceInstanceTier() {
        return this.sourceInstanceTier;
    }
    /**
     * The backup state.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The backup state.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
     * 
     */
    @OutputExport(name="storageBytes", type=String.class, parameters={})
    private Output<String> storageBytes;

    /**
     * @return The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
     * 
     */
    public Output<String> getStorageBytes() {
        return this.storageBytes;
    }

    public interface BuilderApplicator {
        public void apply(BackupArgs.Builder a);
    }
    private static io.pulumi.googlenative.file_v1beta1.BackupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.file_v1beta1.BackupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Backup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Backup(String name) {
        this(name, BackupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Backup(String name, BackupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Backup(String name, BackupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:file/v1beta1:Backup", name, args == null ? BackupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Backup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:file/v1beta1:Backup", name, null, makeResourceOptions(options, id));
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
    public static Backup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Backup(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.sqladmin_v1beta4.BackupRunArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.DiskEncryptionConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.DiskEncryptionStatusResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.OperationErrorResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new backup run on demand.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:sqladmin/v1beta4:BackupRun")
public class BackupRun extends io.pulumi.resources.CustomResource {
    /**
     * Specifies the kind of backup, PHYSICAL or DEFAULT_SNAPSHOT.
     * 
     */
    @OutputExport(name="backupKind", type=String.class, parameters={})
    private Output<String> backupKind;

    /**
     * @return Specifies the kind of backup, PHYSICAL or DEFAULT_SNAPSHOT.
     * 
     */
    public Output<String> getBackupKind() {
        return this.backupKind;
    }
    /**
     * The description of this run, only applicable to on-demand backups.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of this run, only applicable to on-demand backups.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Encryption configuration specific to a backup.
     * 
     */
    @OutputExport(name="diskEncryptionConfiguration", type=DiskEncryptionConfigurationResponse.class, parameters={})
    private Output<DiskEncryptionConfigurationResponse> diskEncryptionConfiguration;

    /**
     * @return Encryption configuration specific to a backup.
     * 
     */
    public Output<DiskEncryptionConfigurationResponse> getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }
    /**
     * Encryption status specific to a backup.
     * 
     */
    @OutputExport(name="diskEncryptionStatus", type=DiskEncryptionStatusResponse.class, parameters={})
    private Output<DiskEncryptionStatusResponse> diskEncryptionStatus;

    /**
     * @return Encryption status specific to a backup.
     * 
     */
    public Output<DiskEncryptionStatusResponse> getDiskEncryptionStatus() {
        return this.diskEncryptionStatus;
    }
    /**
     * The time the backup operation completed in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @OutputExport(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The time the backup operation completed in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * The time the run was enqueued in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @OutputExport(name="enqueuedTime", type=String.class, parameters={})
    private Output<String> enqueuedTime;

    /**
     * @return The time the run was enqueued in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> getEnqueuedTime() {
        return this.enqueuedTime;
    }
    /**
     * Information about why the backup operation failed. This is only present if the run has the FAILED status.
     * 
     */
    @OutputExport(name="error", type=OperationErrorResponse.class, parameters={})
    private Output<OperationErrorResponse> error;

    /**
     * @return Information about why the backup operation failed. This is only present if the run has the FAILED status.
     * 
     */
    public Output<OperationErrorResponse> getError() {
        return this.error;
    }
    /**
     * Name of the database instance.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return Name of the database instance.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    /**
     * This is always `sql#backupRun`.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return This is always `sql#backupRun`.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Location of the backups.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the backups.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The URI of this resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of this resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The time the backup operation actually started in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return The time the backup operation actually started in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * The status of this run.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of this run.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The type of this run; can be either "AUTOMATED" or "ON_DEMAND". This field defaults to "ON_DEMAND" and is ignored, when specified for insert requests.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of this run; can be either "AUTOMATED" or "ON_DEMAND". This field defaults to "ON_DEMAND" and is ignored, when specified for insert requests.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The start time of the backup window during which this the backup was attempted in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @OutputExport(name="windowStartTime", type=String.class, parameters={})
    private Output<String> windowStartTime;

    /**
     * @return The start time of the backup window during which this the backup was attempted in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> getWindowStartTime() {
        return this.windowStartTime;
    }

    public interface BuilderApplicator {
        public void apply(BackupRunArgs.Builder a);
    }
    private static io.pulumi.googlenative.sqladmin_v1beta4.BackupRunArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.sqladmin_v1beta4.BackupRunArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BackupRun(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupRun(String name) {
        this(name, BackupRunArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupRun(String name, BackupRunArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupRun(String name, BackupRunArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1beta4:BackupRun", name, args == null ? BackupRunArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackupRun(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1beta4:BackupRun", name, null, makeResourceOptions(options, id));
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
    public static BackupRun get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackupRun(name, id, options);
    }
}

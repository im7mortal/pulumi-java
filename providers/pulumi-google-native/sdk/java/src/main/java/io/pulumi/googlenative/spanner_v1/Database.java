// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.spanner_v1.DatabaseArgs;
import io.pulumi.googlenative.spanner_v1.outputs.EncryptionConfigResponse;
import io.pulumi.googlenative.spanner_v1.outputs.EncryptionInfoResponse;
import io.pulumi.googlenative.spanner_v1.outputs.RestoreInfoResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Cloud Spanner database and starts to prepare it for serving. The returned long-running operation will have a name of the format `/operations/` and can be used to track preparation of the database. The metadata field type is CreateDatabaseMetadata. The response field type is Database, if successful.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:spanner/v1:Database")
public class Database extends io.pulumi.resources.CustomResource {
    /**
     * If exists, the time at which the database creation started.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return If exists, the time at which the database creation started.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The dialect of the Cloud Spanner Database.
     * 
     */
    @OutputExport(name="databaseDialect", type=String.class, parameters={})
    private Output<String> databaseDialect;

    /**
     * @return The dialect of the Cloud Spanner Database.
     * 
     */
    public Output<String> getDatabaseDialect() {
        return this.databaseDialect;
    }
    /**
     * The read-write region which contains the database's leader replicas. This is the same as the value of default_leader database option set using DatabaseAdmin.CreateDatabase or DatabaseAdmin.UpdateDatabaseDdl. If not explicitly set, this is empty.
     * 
     */
    @OutputExport(name="defaultLeader", type=String.class, parameters={})
    private Output<String> defaultLeader;

    /**
     * @return The read-write region which contains the database's leader replicas. This is the same as the value of default_leader database option set using DatabaseAdmin.CreateDatabase or DatabaseAdmin.UpdateDatabaseDdl. If not explicitly set, this is empty.
     * 
     */
    public Output<String> getDefaultLeader() {
        return this.defaultLeader;
    }
    /**
     * Earliest timestamp at which older versions of the data can be read. This value is continuously updated by Cloud Spanner and becomes stale the moment it is queried. If you are using this value to recover data, make sure to account for the time from the moment when the value is queried to the moment when you initiate the recovery.
     * 
     */
    @OutputExport(name="earliestVersionTime", type=String.class, parameters={})
    private Output<String> earliestVersionTime;

    /**
     * @return Earliest timestamp at which older versions of the data can be read. This value is continuously updated by Cloud Spanner and becomes stale the moment it is queried. If you are using this value to recover data, make sure to account for the time from the moment when the value is queried to the moment when you initiate the recovery.
     * 
     */
    public Output<String> getEarliestVersionTime() {
        return this.earliestVersionTime;
    }
    /**
     * For databases that are using customer managed encryption, this field contains the encryption configuration for the database. For databases that are using Google default or other types of encryption, this field is empty.
     * 
     */
    @OutputExport(name="encryptionConfig", type=EncryptionConfigResponse.class, parameters={})
    private Output<EncryptionConfigResponse> encryptionConfig;

    /**
     * @return For databases that are using customer managed encryption, this field contains the encryption configuration for the database. For databases that are using Google default or other types of encryption, this field is empty.
     * 
     */
    public Output<EncryptionConfigResponse> getEncryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * For databases that are using customer managed encryption, this field contains the encryption information for the database, such as encryption state and the Cloud KMS key versions that are in use. For databases that are using Google default or other types of encryption, this field is empty. This field is propagated lazily from the backend. There might be a delay from when a key version is being used and when it appears in this field.
     * 
     */
    @OutputExport(name="encryptionInfo", type=List.class, parameters={EncryptionInfoResponse.class})
    private Output<List<EncryptionInfoResponse>> encryptionInfo;

    /**
     * @return For databases that are using customer managed encryption, this field contains the encryption information for the database, such as encryption state and the Cloud KMS key versions that are in use. For databases that are using Google default or other types of encryption, this field is empty. This field is propagated lazily from the backend. There might be a delay from when a key version is being used and when it appears in this field.
     * 
     */
    public Output<List<EncryptionInfoResponse>> getEncryptionInfo() {
        return this.encryptionInfo;
    }
    /**
     * The name of the database. Values are of the form `projects//instances//databases/`, where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to other API methods to identify the database.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database. Values are of the form `projects//instances//databases/`, where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to other API methods to identify the database.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Applicable only for restored databases. Contains information about the restore source.
     * 
     */
    @OutputExport(name="restoreInfo", type=RestoreInfoResponse.class, parameters={})
    private Output<RestoreInfoResponse> restoreInfo;

    /**
     * @return Applicable only for restored databases. Contains information about the restore source.
     * 
     */
    public Output<RestoreInfoResponse> getRestoreInfo() {
        return this.restoreInfo;
    }
    /**
     * The current database state.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current database state.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The period in which Cloud Spanner retains all versions of data for the database. This is the same as the value of version_retention_period database option set using UpdateDatabaseDdl. Defaults to 1 hour, if not set.
     * 
     */
    @OutputExport(name="versionRetentionPeriod", type=String.class, parameters={})
    private Output<String> versionRetentionPeriod;

    /**
     * @return The period in which Cloud Spanner retains all versions of data for the database. This is the same as the value of version_retention_period database option set using UpdateDatabaseDdl. Defaults to 1 hour, if not set.
     * 
     */
    public Output<String> getVersionRetentionPeriod() {
        return this.versionRetentionPeriod;
    }

    public interface BuilderApplicator {
        public void apply(DatabaseArgs.Builder a);
    }
    private static io.pulumi.googlenative.spanner_v1.DatabaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.spanner_v1.DatabaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Database(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:spanner/v1:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Database(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:spanner/v1:Database", name, null, makeResourceOptions(options, id));
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
    public static Database get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, options);
    }
}

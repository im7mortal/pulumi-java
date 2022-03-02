// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.sql.DatabaseInstanceArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceState;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceClone;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceIpAddress;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceReplicaConfiguration;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceRestoreBackupContext;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceServerCaCert;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceSettings;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Google SQL Database Instance. For more information, see the [official documentation](https://cloud.google.com/sql/),
 * or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/instances).
 * 
 * > **NOTE on `gcp.sql.DatabaseInstance`:** - Second-generation instances include a
 * default 'root'@'%' user with no password. This user will be deleted by the provider on
 * instance creation. You should use `gcp.sql.User` to define a custom user with
 * a restricted host and strong password.
 * 
 * > **Note**: On newer versions of the provider, you must explicitly set `deletion_protection=false`
 * (and run `pulumi update` to write the field to state) in order to destroy an instance.
 * It is recommended to not set this field (or set it to true) until you're ready to destroy the instance and its databases.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Database instances can be imported using one of any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:sql/databaseInstance:DatabaseInstance master projects/{{project}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:sql/databaseInstance:DatabaseInstance master {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:sql/databaseInstance:DatabaseInstance master {{name}}
 * ```
 * 
 *  config and set on the server. When importing, double-check that your config has all the fields set that you expect- just seeing no diff isn't sufficient to know that your config could reproduce the imported resource.
 * 
 */
@ResourceType(type="gcp:sql/databaseInstance:DatabaseInstance")
public class DatabaseInstance extends io.pulumi.resources.CustomResource {
    /**
     * The context needed to create this instance as a clone of another instance. When this field is set during
     * resource creation, this provider will attempt to clone another instance as indicated in the context. The
     * configuration is detailed below.
     * 
     */
    @OutputExport(name="clone", type=DatabaseInstanceClone.class, parameters={})
    private Output</* @Nullable */ DatabaseInstanceClone> clone;

    /**
     * @return The context needed to create this instance as a clone of another instance. When this field is set during
     * resource creation, this provider will attempt to clone another instance as indicated in the context. The
     * configuration is detailed below.
     * 
     */
    public Output</* @Nullable */ DatabaseInstanceClone> getClone() {
        return this.clone;
    }
    /**
     * The connection name of the instance to be used in
     * connection strings. For example, when connecting with [Cloud SQL Proxy](https://cloud.google.com/sql/docs/mysql/connect-admin-proxy).
     * 
     */
    @OutputExport(name="connectionName", type=String.class, parameters={})
    private Output<String> connectionName;

    /**
     * @return The connection name of the instance to be used in
     * connection strings. For example, when connecting with [Cloud SQL Proxy](https://cloud.google.com/sql/docs/mysql/connect-admin-proxy).
     * 
     */
    public Output<String> getConnectionName() {
        return this.connectionName;
    }
    /**
     * The MySQL, PostgreSQL or
     * SQL Server version to use. Supported values include `MYSQL_5_6`,
     * `MYSQL_5_7`, `MYSQL_8_0`, `POSTGRES_9_6`,`POSTGRES_10`, `POSTGRES_11`,
     * `POSTGRES_12`, `POSTGRES_13`, `SQLSERVER_2017_STANDARD`,
     * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`.
     * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`,
     * `SQLSERVER_2019_WEB`.
     * [Database Version Policies](https://cloud.google.com/sql/docs/db-versions)
     * includes an up-to-date reference of supported versions.
     * 
     */
    @OutputExport(name="databaseVersion", type=String.class, parameters={})
    private Output<String> databaseVersion;

    /**
     * @return The MySQL, PostgreSQL or
     * SQL Server version to use. Supported values include `MYSQL_5_6`,
     * `MYSQL_5_7`, `MYSQL_8_0`, `POSTGRES_9_6`,`POSTGRES_10`, `POSTGRES_11`,
     * `POSTGRES_12`, `POSTGRES_13`, `SQLSERVER_2017_STANDARD`,
     * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`.
     * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`,
     * `SQLSERVER_2019_WEB`.
     * [Database Version Policies](https://cloud.google.com/sql/docs/db-versions)
     * includes an up-to-date reference of supported versions.
     * 
     */
    public Output<String> getDatabaseVersion() {
        return this.databaseVersion;
    }
    /**
     * Whether or not to allow he provider to destroy the instance. Unless this field is set to false
     * in state, a `destroy` or `update` command that deletes the instance will fail.
     * 
     */
    @OutputExport(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return Whether or not to allow he provider to destroy the instance. Unless this field is set to false
     * in state, a `destroy` or `update` command that deletes the instance will fail.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * The full path to the encryption key used for the CMEK disk encryption.  Setting
     * up disk encryption currently requires manual steps outside of this provider.
     * The provided key must be in the same region as the SQL instance.  In order
     * to use this feature, a special kind of service account must be created and
     * granted permission on this key.  This step can currently only be done
     * manually, please see [this step](https://cloud.google.com/sql/docs/mysql/configure-cmek#service-account).
     * That service account needs the `Cloud KMS > Cloud KMS CryptoKey Encrypter/Decrypter` role on your
     * key - please see [this step](https://cloud.google.com/sql/docs/mysql/configure-cmek#grantkey).
     * 
     */
    @OutputExport(name="encryptionKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionKeyName;

    /**
     * @return The full path to the encryption key used for the CMEK disk encryption.  Setting
     * up disk encryption currently requires manual steps outside of this provider.
     * The provided key must be in the same region as the SQL instance.  In order
     * to use this feature, a special kind of service account must be created and
     * granted permission on this key.  This step can currently only be done
     * manually, please see [this step](https://cloud.google.com/sql/docs/mysql/configure-cmek#service-account).
     * That service account needs the `Cloud KMS > Cloud KMS CryptoKey Encrypter/Decrypter` role on your
     * key - please see [this step](https://cloud.google.com/sql/docs/mysql/configure-cmek#grantkey).
     * 
     */
    public Output</* @Nullable */ String> getEncryptionKeyName() {
        return this.encryptionKeyName;
    }
    /**
     * The first IPv4 address of any type assigned.
     * 
     */
    @OutputExport(name="firstIpAddress", type=String.class, parameters={})
    private Output<String> firstIpAddress;

    /**
     * @return The first IPv4 address of any type assigned.
     * 
     */
    public Output<String> getFirstIpAddress() {
        return this.firstIpAddress;
    }
    @OutputExport(name="ipAddresses", type=List.class, parameters={DatabaseInstanceIpAddress.class})
    private Output<List<DatabaseInstanceIpAddress>> ipAddresses;

    public Output<List<DatabaseInstanceIpAddress>> getIpAddresses() {
        return this.ipAddresses;
    }
    /**
     * The name of the existing instance that will
     * act as the master in the replication setup. Note, this requires the master to
     * have `binary_log_enabled` set, as well as existing backups.
     * 
     */
    @OutputExport(name="masterInstanceName", type=String.class, parameters={})
    private Output<String> masterInstanceName;

    /**
     * @return The name of the existing instance that will
     * act as the master in the replication setup. Note, this requires the master to
     * have `binary_log_enabled` set, as well as existing backups.
     * 
     */
    public Output<String> getMasterInstanceName() {
        return this.masterInstanceName;
    }
    /**
     * A name for this whitelist entry.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for this whitelist entry.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The first private (`PRIVATE`) IPv4 address assigned.
     * 
     */
    @OutputExport(name="privateIpAddress", type=String.class, parameters={})
    private Output<String> privateIpAddress;

    /**
     * @return The first private (`PRIVATE`) IPv4 address assigned.
     * 
     */
    public Output<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * The full project ID of the source instance.`
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The full project ID of the source instance.`
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The first public (`PRIMARY`) IPv4 address assigned.
     * 
     */
    @OutputExport(name="publicIpAddress", type=String.class, parameters={})
    private Output<String> publicIpAddress;

    /**
     * @return The first public (`PRIMARY`) IPv4 address assigned.
     * 
     */
    public Output<String> getPublicIpAddress() {
        return this.publicIpAddress;
    }
    /**
     * The region the instance will sit in. Note, Cloud SQL is not
     * available in all regions - choose from one of the options listed [here](https://cloud.google.com/sql/docs/mysql/instance-locations).
     * A valid region must be provided to use this resource. If a region is not provided in the resource definition,
     * the provider region will be used instead, but this will be an apply-time error for instances if the provider
     * region is not supported with Cloud SQL. If you choose not to provide the `region` argument for this resource,
     * make sure you understand this.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region the instance will sit in. Note, Cloud SQL is not
     * available in all regions - choose from one of the options listed [here](https://cloud.google.com/sql/docs/mysql/instance-locations).
     * A valid region must be provided to use this resource. If a region is not provided in the resource definition,
     * the provider region will be used instead, but this will be an apply-time error for instances if the provider
     * region is not supported with Cloud SQL. If you choose not to provide the `region` argument for this resource,
     * make sure you understand this.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The configuration for replication. The
     * configuration is detailed below. Valid only for MySQL instances.
     * 
     */
    @OutputExport(name="replicaConfiguration", type=DatabaseInstanceReplicaConfiguration.class, parameters={})
    private Output<DatabaseInstanceReplicaConfiguration> replicaConfiguration;

    /**
     * @return The configuration for replication. The
     * configuration is detailed below. Valid only for MySQL instances.
     * 
     */
    public Output<DatabaseInstanceReplicaConfiguration> getReplicaConfiguration() {
        return this.replicaConfiguration;
    }
    /**
     * The context needed to restore the database to a backup run. This field will
     * cause the provider to trigger the database to restore from the backup run indicated. The configuration is detailed below.
     * **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     * block during resource creation/update will trigger the restore action after the resource is created/updated.
     * 
     */
    @OutputExport(name="restoreBackupContext", type=DatabaseInstanceRestoreBackupContext.class, parameters={})
    private Output</* @Nullable */ DatabaseInstanceRestoreBackupContext> restoreBackupContext;

    /**
     * @return The context needed to restore the database to a backup run. This field will
     * cause the provider to trigger the database to restore from the backup run indicated. The configuration is detailed below.
     * **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     * block during resource creation/update will trigger the restore action after the resource is created/updated.
     * 
     */
    public Output</* @Nullable */ DatabaseInstanceRestoreBackupContext> getRestoreBackupContext() {
        return this.restoreBackupContext;
    }
    /**
     * Initial root password. Required for MS SQL Server, ignored by MySQL and PostgreSQL.
     * 
     */
    @OutputExport(name="rootPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> rootPassword;

    /**
     * @return Initial root password. Required for MS SQL Server, ignored by MySQL and PostgreSQL.
     * 
     */
    public Output</* @Nullable */ String> getRootPassword() {
        return this.rootPassword;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="serverCaCerts", type=List.class, parameters={DatabaseInstanceServerCaCert.class})
    private Output<List<DatabaseInstanceServerCaCert>> serverCaCerts;

    public Output<List<DatabaseInstanceServerCaCert>> getServerCaCerts() {
        return this.serverCaCerts;
    }
    /**
     * The service account email address assigned to the
     * instance.
     * 
     */
    @OutputExport(name="serviceAccountEmailAddress", type=String.class, parameters={})
    private Output<String> serviceAccountEmailAddress;

    /**
     * @return The service account email address assigned to the
     * instance.
     * 
     */
    public Output<String> getServiceAccountEmailAddress() {
        return this.serviceAccountEmailAddress;
    }
    /**
     * The settings to use for the database. The
     * configuration is detailed below. Required if `clone` is not set.
     * 
     */
    @OutputExport(name="settings", type=DatabaseInstanceSettings.class, parameters={})
    private Output<DatabaseInstanceSettings> settings;

    /**
     * @return The settings to use for the database. The
     * configuration is detailed below. Required if `clone` is not set.
     * 
     */
    public Output<DatabaseInstanceSettings> getSettings() {
        return this.settings;
    }

    public interface BuilderApplicator {
        public void apply(DatabaseInstanceArgs.Builder a);
    }
    private static io.pulumi.gcp.sql.DatabaseInstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.sql.DatabaseInstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DatabaseInstance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseInstance(String name) {
        this(name, DatabaseInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseInstance(String name, DatabaseInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseInstance(String name, DatabaseInstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sql/databaseInstance:DatabaseInstance", name, args == null ? DatabaseInstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DatabaseInstance(String name, Input<String> id, @Nullable DatabaseInstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sql/databaseInstance:DatabaseInstance", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DatabaseInstance get(String name, Input<String> id, @Nullable DatabaseInstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseInstance(name, id, state, options);
    }
}

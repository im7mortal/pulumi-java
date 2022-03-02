// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.sql.DatabaseArgs;
import io.pulumi.gcp.sql.inputs.DatabaseState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Represents a SQL database inside the Cloud SQL instance, hosted in
 * Google's cloud.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Database can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:sql/database:Database default projects/{{project}}/instances/{{instance}}/databases/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:sql/database:Database default instances/{{instance}}/databases/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:sql/database:Database default {{project}}/{{instance}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:sql/database:Database default {{instance}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:sql/database:Database default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:sql/database:Database")
public class Database extends io.pulumi.resources.CustomResource {
    /**
     * The charset value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
     * for more details and supported values. Postgres databases only support
     * a value of `UTF8` at creation time.
     * 
     */
    @OutputExport(name="charset", type=String.class, parameters={})
    private Output<String> charset;

    /**
     * @return The charset value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
     * for more details and supported values. Postgres databases only support
     * a value of `UTF8` at creation time.
     * 
     */
    public Output<String> getCharset() {
        return this.charset;
    }
    /**
     * The collation value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
     * for more details and supported values. Postgres databases only support
     * a value of `en_US.UTF8` at creation time.
     * 
     */
    @OutputExport(name="collation", type=String.class, parameters={})
    private Output<String> collation;

    /**
     * @return The collation value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
     * for more details and supported values. Postgres databases only support
     * a value of `en_US.UTF8` at creation time.
     * 
     */
    public Output<String> getCollation() {
        return this.collation;
    }
    /**
     * The name of the Cloud SQL instance. This does not include the project
     * ID.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The name of the Cloud SQL instance. This does not include the project
     * ID.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    /**
     * The name of the database in the Cloud SQL instance.
     * This does not include the project ID or instance name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database in the Cloud SQL instance.
     * This does not include the project ID or instance name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
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

    public interface BuilderApplicator {
        public void apply(DatabaseArgs.Builder a);
    }
    private static io.pulumi.gcp.sql.DatabaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.sql.DatabaseArgs.builder();
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
        super("gcp:sql/database:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Database(String name, Input<String> id, @Nullable DatabaseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sql/database:Database", name, state, makeResourceOptions(options, id));
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
    public static Database get(String name, Input<String> id, @Nullable DatabaseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}

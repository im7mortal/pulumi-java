// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.msk.ConfigurationArgs;
import io.pulumi.aws.msk.inputs.ConfigurationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages an Amazon Managed Streaming for Kafka configuration. More information can be found on the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * MSK configurations can be imported using the configuration ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:msk/configuration:Configuration example arn:aws:kafka:us-west-2:123456789012:configuration/example/279c0212-d057-4dba-9aa9-1c4e5a25bfc7-3
 * ```
 * 
 */
@ResourceType(type="aws:msk/configuration:Configuration")
public class Configuration extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the configuration.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the configuration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Description of the configuration.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the configuration.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * List of Apache Kafka versions which can use this configuration.
     * 
     */
    @OutputExport(name="kafkaVersions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> kafkaVersions;

    /**
     * @return List of Apache Kafka versions which can use this configuration.
     * 
     */
    public Output</* @Nullable */ List<String>> getKafkaVersions() {
        return this.kafkaVersions;
    }
    /**
     * Latest revision of the configuration.
     * 
     */
    @OutputExport(name="latestRevision", type=Integer.class, parameters={})
    private Output<Integer> latestRevision;

    /**
     * @return Latest revision of the configuration.
     * 
     */
    public Output<Integer> getLatestRevision() {
        return this.latestRevision;
    }
    /**
     * Name of the configuration.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the configuration.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
     * 
     */
    @OutputExport(name="serverProperties", type=String.class, parameters={})
    private Output<String> serverProperties;

    /**
     * @return Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
     * 
     */
    public Output<String> getServerProperties() {
        return this.serverProperties;
    }

    public interface BuilderApplicator {
        public void apply(ConfigurationArgs.Builder a);
    }
    private static io.pulumi.aws.msk.ConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.msk.ConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Configuration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Configuration(String name) {
        this(name, ConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Configuration(String name, ConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Configuration(String name, ConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/configuration:Configuration", name, args == null ? ConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Configuration(String name, Input<String> id, @Nullable ConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/configuration:Configuration", name, state, makeResourceOptions(options, id));
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
    public static Configuration get(String name, Input<String> id, @Nullable ConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Configuration(name, id, state, options);
    }
}

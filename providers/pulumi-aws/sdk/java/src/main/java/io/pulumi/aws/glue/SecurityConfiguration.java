// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.SecurityConfigurationArgs;
import io.pulumi.aws.glue.inputs.SecurityConfigurationState;
import io.pulumi.aws.glue.outputs.SecurityConfigurationEncryptionConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Glue Security Configuration.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glue Security Configurations can be imported using `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/securityConfiguration:SecurityConfiguration example example
 * ```
 * 
 */
@ResourceType(type="aws:glue/securityConfiguration:SecurityConfiguration")
public class SecurityConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Configuration block containing encryption configuration. Detailed below.
     * 
     */
    @OutputExport(name="encryptionConfiguration", type=SecurityConfigurationEncryptionConfiguration.class, parameters={})
    private Output<SecurityConfigurationEncryptionConfiguration> encryptionConfiguration;

    /**
     * @return Configuration block containing encryption configuration. Detailed below.
     * 
     */
    public Output<SecurityConfigurationEncryptionConfiguration> getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }
    /**
     * Name of the security configuration.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the security configuration.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(SecurityConfigurationArgs.Builder a);
    }
    private static io.pulumi.aws.glue.SecurityConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.glue.SecurityConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SecurityConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityConfiguration(String name) {
        this(name, SecurityConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityConfiguration(String name, SecurityConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityConfiguration(String name, SecurityConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/securityConfiguration:SecurityConfiguration", name, args == null ? SecurityConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecurityConfiguration(String name, Input<String> id, @Nullable SecurityConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/securityConfiguration:SecurityConfiguration", name, state, makeResourceOptions(options, id));
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
    public static SecurityConfiguration get(String name, Input<String> id, @Nullable SecurityConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityConfiguration(name, id, state, options);
    }
}

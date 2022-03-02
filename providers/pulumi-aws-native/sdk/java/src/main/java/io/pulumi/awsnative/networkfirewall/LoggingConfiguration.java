// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkfirewall.LoggingConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource type definition for AWS::NetworkFirewall::LoggingConfiguration
 * 
 */
@ResourceType(type="aws-native:networkfirewall:LoggingConfiguration")
public class LoggingConfiguration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="firewallArn", type=String.class, parameters={})
    private Output<String> firewallArn;

    public Output<String> getFirewallArn() {
        return this.firewallArn;
    }
    @OutputExport(name="firewallName", type=String.class, parameters={})
    private Output</* @Nullable */ String> firewallName;

    public Output</* @Nullable */ String> getFirewallName() {
        return this.firewallName;
    }
    @OutputExport(name="loggingConfiguration", type=io.pulumi.awsnative.networkfirewall.outputs.LoggingConfiguration.class, parameters={})
    private Output<io.pulumi.awsnative.networkfirewall.outputs.LoggingConfiguration> loggingConfiguration;

    public Output<io.pulumi.awsnative.networkfirewall.outputs.LoggingConfiguration> getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    public interface BuilderApplicator {
        public void apply(LoggingConfigurationArgs.Builder a);
    }
    private static io.pulumi.awsnative.networkfirewall.LoggingConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.networkfirewall.LoggingConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LoggingConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoggingConfiguration(String name) {
        this(name, LoggingConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoggingConfiguration(String name, LoggingConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoggingConfiguration(String name, LoggingConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkfirewall:LoggingConfiguration", name, args == null ? LoggingConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LoggingConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkfirewall:LoggingConfiguration", name, null, makeResourceOptions(options, id));
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
    public static LoggingConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LoggingConfiguration(name, id, options);
    }
}

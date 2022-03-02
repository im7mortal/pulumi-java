// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.chime.VoiceConnectorLoggingArgs;
import io.pulumi.aws.chime.inputs.VoiceConnectorLoggingState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Adds a logging configuration for the specified Amazon Chime Voice Connector. The logging configuration specifies whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Chime Voice Connector Logging can be imported using the `voice_connector_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:chime/voiceConnectorLogging:VoiceConnectorLogging default abcdef1ghij2klmno3pqr4
 * ```
 * 
 */
@ResourceType(type="aws:chime/voiceConnectorLogging:VoiceConnectorLogging")
public class VoiceConnectorLogging extends io.pulumi.resources.CustomResource {
    /**
     * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     * 
     */
    @OutputExport(name="enableSipLogs", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableSipLogs;

    /**
     * @return When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableSipLogs() {
        return this.enableSipLogs;
    }
    /**
     * The Amazon Chime Voice Connector ID.
     * 
     */
    @OutputExport(name="voiceConnectorId", type=String.class, parameters={})
    private Output<String> voiceConnectorId;

    /**
     * @return The Amazon Chime Voice Connector ID.
     * 
     */
    public Output<String> getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    public interface BuilderApplicator {
        public void apply(VoiceConnectorLoggingArgs.Builder a);
    }
    private static io.pulumi.aws.chime.VoiceConnectorLoggingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.chime.VoiceConnectorLoggingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VoiceConnectorLogging(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VoiceConnectorLogging(String name) {
        this(name, VoiceConnectorLoggingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VoiceConnectorLogging(String name, VoiceConnectorLoggingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VoiceConnectorLogging(String name, VoiceConnectorLoggingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnectorLogging:VoiceConnectorLogging", name, args == null ? VoiceConnectorLoggingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VoiceConnectorLogging(String name, Input<String> id, @Nullable VoiceConnectorLoggingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnectorLogging:VoiceConnectorLogging", name, state, makeResourceOptions(options, id));
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
    public static VoiceConnectorLogging get(String name, Input<String> id, @Nullable VoiceConnectorLoggingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VoiceConnectorLogging(name, id, state, options);
    }
}

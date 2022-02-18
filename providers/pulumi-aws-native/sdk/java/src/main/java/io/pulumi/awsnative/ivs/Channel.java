// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ivs.ChannelArgs;
import io.pulumi.awsnative.ivs.enums.ChannelLatencyMode;
import io.pulumi.awsnative.ivs.enums.ChannelType;
import io.pulumi.awsnative.ivs.outputs.ChannelTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IVS::Channel
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ivs:Channel")
public class Channel extends io.pulumi.resources.CustomResource {
    /**
     * Channel ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Channel ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Whether the channel is authorized.
     * 
     */
    @OutputExport(name="authorized", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> authorized;

    /**
     * @return Whether the channel is authorized.
     * 
     */
    public Output</* @Nullable */ Boolean> getAuthorized() {
        return this.authorized;
    }
    /**
     * Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming software.
     * 
     */
    @OutputExport(name="ingestEndpoint", type=String.class, parameters={})
    private Output<String> ingestEndpoint;

    /**
     * @return Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming software.
     * 
     */
    public Output<String> getIngestEndpoint() {
        return this.ingestEndpoint;
    }
    /**
     * Channel latency mode.
     * 
     */
    @OutputExport(name="latencyMode", type=ChannelLatencyMode.class, parameters={})
    private Output</* @Nullable */ ChannelLatencyMode> latencyMode;

    /**
     * @return Channel latency mode.
     * 
     */
    public Output</* @Nullable */ ChannelLatencyMode> getLatencyMode() {
        return this.latencyMode;
    }
    /**
     * Channel
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Channel
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Channel Playback URL.
     * 
     */
    @OutputExport(name="playbackUrl", type=String.class, parameters={})
    private Output<String> playbackUrl;

    /**
     * @return Channel Playback URL.
     * 
     */
    public Output<String> getPlaybackUrl() {
        return this.playbackUrl;
    }
    /**
     * Recording Configuration ARN. A value other than an empty string indicates that recording is enabled. Default: “” (recording is disabled).
     * 
     */
    @OutputExport(name="recordingConfigurationArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> recordingConfigurationArn;

    /**
     * @return Recording Configuration ARN. A value other than an empty string indicates that recording is enabled. Default: “” (recording is disabled).
     * 
     */
    public Output</* @Nullable */ String> getRecordingConfigurationArn() {
        return this.recordingConfigurationArn;
    }
    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ChannelTag.class})
    private Output</* @Nullable */ List<ChannelTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public Output</* @Nullable */ List<ChannelTag>> getTags() {
        return this.tags;
    }
    /**
     * Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately.
     * 
     */
    @OutputExport(name="type", type=ChannelType.class, parameters={})
    private Output</* @Nullable */ ChannelType> type;

    /**
     * @return Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately.
     * 
     */
    public Output</* @Nullable */ ChannelType> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Channel(String name, @Nullable ChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ivs:Channel", name, args == null ? ChannelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Channel(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ivs:Channel", name, null, makeResourceOptions(options, id));
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
    public static Channel get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Channel(name, id, options);
    }
}

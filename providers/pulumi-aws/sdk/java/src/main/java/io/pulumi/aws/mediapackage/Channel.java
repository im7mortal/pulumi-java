// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediapackage;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.mediapackage.ChannelArgs;
import io.pulumi.aws.mediapackage.inputs.ChannelState;
import io.pulumi.aws.mediapackage.outputs.ChannelHlsIngest;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Elemental MediaPackage Channel.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Media Package Channels can be imported via the channel ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:mediapackage/channel:Channel kittens kittens-channel
 * ```
 * 
 */
@ResourceType(type="aws:mediapackage/channel:Channel")
public class Channel extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the channel
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the channel
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A unique identifier describing the channel
     * 
     */
    @OutputExport(name="channelId", type=String.class, parameters={})
    private Output<String> channelId;

    /**
     * @return A unique identifier describing the channel
     * 
     */
    public Output<String> getChannelId() {
        return this.channelId;
    }
    /**
     * A description of the channel
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description of the channel
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * A single item list of HLS ingest information
     * 
     */
    @OutputExport(name="hlsIngests", type=List.class, parameters={ChannelHlsIngest.class})
    private Output<List<ChannelHlsIngest>> hlsIngests;

    /**
     * @return A single item list of HLS ingest information
     * 
     */
    public Output<List<ChannelHlsIngest>> getHlsIngests() {
        return this.hlsIngests;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(ChannelArgs.Builder a);
    }
    private static io.pulumi.aws.mediapackage.ChannelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.mediapackage.ChannelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Channel(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Channel(String name) {
        this(name, ChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Channel(String name, ChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Channel(String name, ChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:mediapackage/channel:Channel", name, args == null ? ChannelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Channel(String name, Input<String> id, @Nullable ChannelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:mediapackage/channel:Channel", name, state, makeResourceOptions(options, id));
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
    public static Channel get(String name, Input<String> id, @Nullable ChannelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Channel(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ivs.RecordingConfigurationArgs;
import io.pulumi.awsnative.ivs.enums.RecordingConfigurationState;
import io.pulumi.awsnative.ivs.outputs.RecordingConfigurationDestinationConfiguration;
import io.pulumi.awsnative.ivs.outputs.RecordingConfigurationTag;
import io.pulumi.awsnative.ivs.outputs.RecordingConfigurationThumbnailConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IVS::RecordingConfiguration
 * 
 */
@ResourceType(type="aws-native:ivs:RecordingConfiguration")
public class RecordingConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Recording Configuration ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Recording Configuration ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="destinationConfiguration", type=RecordingConfigurationDestinationConfiguration.class, parameters={})
    private Output<RecordingConfigurationDestinationConfiguration> destinationConfiguration;

    public Output<RecordingConfigurationDestinationConfiguration> getDestinationConfiguration() {
        return this.destinationConfiguration;
    }
    /**
     * Recording Configuration Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Recording Configuration Name.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Recording Configuration State.
     * 
     */
    @OutputExport(name="state", type=RecordingConfigurationState.class, parameters={})
    private Output<RecordingConfigurationState> state;

    /**
     * @return Recording Configuration State.
     * 
     */
    public Output<RecordingConfigurationState> getState() {
        return this.state;
    }
    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={RecordingConfigurationTag.class})
    private Output</* @Nullable */ List<RecordingConfigurationTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public Output</* @Nullable */ List<RecordingConfigurationTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="thumbnailConfiguration", type=RecordingConfigurationThumbnailConfiguration.class, parameters={})
    private Output</* @Nullable */ RecordingConfigurationThumbnailConfiguration> thumbnailConfiguration;

    public Output</* @Nullable */ RecordingConfigurationThumbnailConfiguration> getThumbnailConfiguration() {
        return this.thumbnailConfiguration;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RecordingConfiguration(String name, RecordingConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ivs:RecordingConfiguration", name, args == null ? RecordingConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RecordingConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ivs:RecordingConfiguration", name, null, makeResourceOptions(options, id));
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
    public static RecordingConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RecordingConfiguration(name, id, options);
    }
}

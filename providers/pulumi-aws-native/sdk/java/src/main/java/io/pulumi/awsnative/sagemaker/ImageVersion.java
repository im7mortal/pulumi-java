// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.ImageVersionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::ImageVersion
 * 
 */
@ResourceType(type="aws-native:sagemaker:ImageVersion")
public class ImageVersion extends io.pulumi.resources.CustomResource {
    @OutputExport(name="baseImage", type=String.class, parameters={})
    private Output<String> baseImage;

    public Output<String> getBaseImage() {
        return this.baseImage;
    }
    @OutputExport(name="containerImage", type=String.class, parameters={})
    private Output<String> containerImage;

    public Output<String> getContainerImage() {
        return this.containerImage;
    }
    @OutputExport(name="imageArn", type=String.class, parameters={})
    private Output<String> imageArn;

    public Output<String> getImageArn() {
        return this.imageArn;
    }
    @OutputExport(name="imageName", type=String.class, parameters={})
    private Output<String> imageName;

    public Output<String> getImageName() {
        return this.imageName;
    }
    @OutputExport(name="imageVersionArn", type=String.class, parameters={})
    private Output<String> imageVersionArn;

    public Output<String> getImageVersionArn() {
        return this.imageVersionArn;
    }
    @OutputExport(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImageVersion(String name, ImageVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ImageVersion", name, args == null ? ImageVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ImageVersion(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ImageVersion", name, null, makeResourceOptions(options, id));
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
    public static ImageVersion get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ImageVersion(name, id, options);
    }
}

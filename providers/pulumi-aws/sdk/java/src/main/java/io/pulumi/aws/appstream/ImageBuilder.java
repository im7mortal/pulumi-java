// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appstream.ImageBuilderArgs;
import io.pulumi.aws.appstream.inputs.ImageBuilderState;
import io.pulumi.aws.appstream.outputs.ImageBuilderAccessEndpoint;
import io.pulumi.aws.appstream.outputs.ImageBuilderDomainJoinInfo;
import io.pulumi.aws.appstream.outputs.ImageBuilderVpcConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AppStream image builder.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_appstream_image_builder` can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appstream/imageBuilder:ImageBuilder example imageBuilderExample
 * ```
 * 
 */
@ResourceType(type="aws:appstream/imageBuilder:ImageBuilder")
public class ImageBuilder extends io.pulumi.resources.CustomResource {
    /**
     * Set of interface VPC endpoint (interface endpoint) objects. Maximum of 4. See below.
     * 
     */
    @OutputExport(name="accessEndpoints", type=List.class, parameters={ImageBuilderAccessEndpoint.class})
    private Output</* @Nullable */ List<ImageBuilderAccessEndpoint>> accessEndpoints;

    /**
     * @return Set of interface VPC endpoint (interface endpoint) objects. Maximum of 4. See below.
     * 
     */
    public Output</* @Nullable */ List<ImageBuilderAccessEndpoint>> getAccessEndpoints() {
        return this.accessEndpoints;
    }
    /**
     * The version of the AppStream 2.0 agent to use for this image builder.
     * 
     */
    @OutputExport(name="appstreamAgentVersion", type=String.class, parameters={})
    private Output<String> appstreamAgentVersion;

    /**
     * @return The version of the AppStream 2.0 agent to use for this image builder.
     * 
     */
    public Output<String> getAppstreamAgentVersion() {
        return this.appstreamAgentVersion;
    }
    /**
     * ARN of the appstream image builder.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the appstream image builder.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Date and time, in UTC and extended RFC 3339 format, when the image builder was created.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Date and time, in UTC and extended RFC 3339 format, when the image builder was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Description to display.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description to display.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Human-readable friendly name for the AppStream image builder.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human-readable friendly name for the AppStream image builder.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. See below.
     * 
     */
    @OutputExport(name="domainJoinInfo", type=ImageBuilderDomainJoinInfo.class, parameters={})
    private Output<ImageBuilderDomainJoinInfo> domainJoinInfo;

    /**
     * @return Configuration block for the name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. See below.
     * 
     */
    public Output<ImageBuilderDomainJoinInfo> getDomainJoinInfo() {
        return this.domainJoinInfo;
    }
    /**
     * Enables or disables default internet access for the image builder.
     * 
     */
    @OutputExport(name="enableDefaultInternetAccess", type=Boolean.class, parameters={})
    private Output<Boolean> enableDefaultInternetAccess;

    /**
     * @return Enables or disables default internet access for the image builder.
     * 
     */
    public Output<Boolean> getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }
    /**
     * ARN of the IAM role to apply to the image builder.
     * 
     */
    @OutputExport(name="iamRoleArn", type=String.class, parameters={})
    private Output<String> iamRoleArn;

    /**
     * @return ARN of the IAM role to apply to the image builder.
     * 
     */
    public Output<String> getIamRoleArn() {
        return this.iamRoleArn;
    }
    /**
     * ARN of the public, private, or shared image to use.
     * 
     */
    @OutputExport(name="imageArn", type=String.class, parameters={})
    private Output<String> imageArn;

    /**
     * @return ARN of the public, private, or shared image to use.
     * 
     */
    public Output<String> getImageArn() {
        return this.imageArn;
    }
    /**
     * Name of the image used to create the image builder.
     * 
     */
    @OutputExport(name="imageName", type=String.class, parameters={})
    private Output<String> imageName;

    /**
     * @return Name of the image used to create the image builder.
     * 
     */
    public Output<String> getImageName() {
        return this.imageName;
    }
    /**
     * The instance type to use when launching the image builder.
     * 
     */
    @OutputExport(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return The instance type to use when launching the image builder.
     * 
     */
    public Output<String> getInstanceType() {
        return this.instanceType;
    }
    /**
     * Unique name for the image builder.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name for the image builder.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State of the image builder. Can be: `PENDING`, `UPDATING_AGENT`, `RUNNING`, `STOPPING`, `STOPPED`, `REBOOTING`, `SNAPSHOTTING`, `DELETING`, `FAILED`, `UPDATING`, `PENDING_QUALIFICATION`
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the image builder. Can be: `PENDING`, `UPDATING_AGENT`, `RUNNING`, `STOPPING`, `STOPPED`, `REBOOTING`, `SNAPSHOTTING`, `DELETING`, `FAILED`, `UPDATING`, `PENDING_QUALIFICATION`
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * A map of tags to assign to the instance. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the instance. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration block for the VPC configuration for the image builder. See below.
     * 
     */
    @OutputExport(name="vpcConfig", type=ImageBuilderVpcConfig.class, parameters={})
    private Output<ImageBuilderVpcConfig> vpcConfig;

    /**
     * @return Configuration block for the VPC configuration for the image builder. See below.
     * 
     */
    public Output<ImageBuilderVpcConfig> getVpcConfig() {
        return this.vpcConfig;
    }

    public interface BuilderApplicator {
        public void apply(ImageBuilderArgs.Builder a);
    }
    private static io.pulumi.aws.appstream.ImageBuilderArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appstream.ImageBuilderArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ImageBuilder(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImageBuilder(String name) {
        this(name, ImageBuilderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImageBuilder(String name, ImageBuilderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImageBuilder(String name, ImageBuilderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/imageBuilder:ImageBuilder", name, args == null ? ImageBuilderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ImageBuilder(String name, Input<String> id, @Nullable ImageBuilderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/imageBuilder:ImageBuilder", name, state, makeResourceOptions(options, id));
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
    public static ImageBuilder get(String name, Input<String> id, @Nullable ImageBuilderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ImageBuilder(name, id, state, options);
    }
}

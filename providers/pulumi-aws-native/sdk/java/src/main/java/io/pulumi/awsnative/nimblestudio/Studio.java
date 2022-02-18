// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.nimblestudio.StudioArgs;
import io.pulumi.awsnative.nimblestudio.outputs.StudioEncryptionConfiguration;
import io.pulumi.awsnative.nimblestudio.outputs.StudioTags;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Represents a studio that contains other Nimble Studio resources
 * 
 */
@ResourceType(type="aws-native:nimblestudio:Studio")
public class Studio extends io.pulumi.resources.CustomResource {
    /**
     * <p>The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.</p>
     * 
     */
    @OutputExport(name="adminRoleArn", type=String.class, parameters={})
    private Output<String> adminRoleArn;

    /**
     * @return <p>The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.</p>
     * 
     */
    public Output<String> getAdminRoleArn() {
        return this.adminRoleArn;
    }
    /**
     * <p>A friendly name for the studio.</p>
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return <p>A friendly name for the studio.</p>
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * <p>The Amazon Web Services Region where the studio resource is located.</p>
     * 
     */
    @OutputExport(name="homeRegion", type=String.class, parameters={})
    private Output<String> homeRegion;

    /**
     * @return <p>The Amazon Web Services Region where the studio resource is located.</p>
     * 
     */
    public Output<String> getHomeRegion() {
        return this.homeRegion;
    }
    /**
     * <p>The Amazon Web Services SSO application client ID used to integrate with Amazon Web Services SSO to enable Amazon Web Services SSO users to log in to Nimble Studio portal.</p>
     * 
     */
    @OutputExport(name="ssoClientId", type=String.class, parameters={})
    private Output<String> ssoClientId;

    /**
     * @return <p>The Amazon Web Services SSO application client ID used to integrate with Amazon Web Services SSO to enable Amazon Web Services SSO users to log in to Nimble Studio portal.</p>
     * 
     */
    public Output<String> getSsoClientId() {
        return this.ssoClientId;
    }
    @OutputExport(name="studioEncryptionConfiguration", type=StudioEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ StudioEncryptionConfiguration> studioEncryptionConfiguration;

    public Output</* @Nullable */ StudioEncryptionConfiguration> getStudioEncryptionConfiguration() {
        return this.studioEncryptionConfiguration;
    }
    @OutputExport(name="studioId", type=String.class, parameters={})
    private Output<String> studioId;

    public Output<String> getStudioId() {
        return this.studioId;
    }
    /**
     * <p>The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.</p>
     * 
     */
    @OutputExport(name="studioName", type=String.class, parameters={})
    private Output<String> studioName;

    /**
     * @return <p>The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.</p>
     * 
     */
    public Output<String> getStudioName() {
        return this.studioName;
    }
    /**
     * <p>The address of the web page for the studio.</p>
     * 
     */
    @OutputExport(name="studioUrl", type=String.class, parameters={})
    private Output<String> studioUrl;

    /**
     * @return <p>The address of the web page for the studio.</p>
     * 
     */
    public Output<String> getStudioUrl() {
        return this.studioUrl;
    }
    @OutputExport(name="tags", type=StudioTags.class, parameters={})
    private Output</* @Nullable */ StudioTags> tags;

    public Output</* @Nullable */ StudioTags> getTags() {
        return this.tags;
    }
    /**
     * <p>The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.</p>
     * 
     */
    @OutputExport(name="userRoleArn", type=String.class, parameters={})
    private Output<String> userRoleArn;

    /**
     * @return <p>The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.</p>
     * 
     */
    public Output<String> getUserRoleArn() {
        return this.userRoleArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Studio(String name, StudioArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:nimblestudio:Studio", name, args == null ? StudioArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Studio(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:nimblestudio:Studio", name, null, makeResourceOptions(options, id));
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
    public static Studio get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Studio(name, id, options);
    }
}

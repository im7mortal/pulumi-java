// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.UserProfileArgs;
import io.pulumi.awsnative.sagemaker.outputs.UserProfileTag;
import io.pulumi.awsnative.sagemaker.outputs.UserProfileUserSettings;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::UserProfile
 * 
 */
@ResourceType(type="aws-native:sagemaker:UserProfile")
public class UserProfile extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the associated Domain.
     * 
     */
    @OutputExport(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    /**
     * @return The ID of the associated Domain.
     * 
     */
    public Output<String> getDomainId() {
        return this.domainId;
    }
    /**
     * A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @OutputExport(name="singleSignOnUserIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> singleSignOnUserIdentifier;

    /**
     * @return A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    public Output</* @Nullable */ String> getSingleSignOnUserIdentifier() {
        return this.singleSignOnUserIdentifier;
    }
    /**
     * The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @OutputExport(name="singleSignOnUserValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> singleSignOnUserValue;

    /**
     * @return The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    public Output</* @Nullable */ String> getSingleSignOnUserValue() {
        return this.singleSignOnUserValue;
    }
    /**
     * A list of tags to apply to the user profile.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={UserProfileTag.class})
    private Output</* @Nullable */ List<UserProfileTag>> tags;

    /**
     * @return A list of tags to apply to the user profile.
     * 
     */
    public Output</* @Nullable */ List<UserProfileTag>> getTags() {
        return this.tags;
    }
    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    @OutputExport(name="userProfileArn", type=String.class, parameters={})
    private Output<String> userProfileArn;

    /**
     * @return The user profile Amazon Resource Name (ARN).
     * 
     */
    public Output<String> getUserProfileArn() {
        return this.userProfileArn;
    }
    /**
     * A name for the UserProfile.
     * 
     */
    @OutputExport(name="userProfileName", type=String.class, parameters={})
    private Output<String> userProfileName;

    /**
     * @return A name for the UserProfile.
     * 
     */
    public Output<String> getUserProfileName() {
        return this.userProfileName;
    }
    /**
     * A collection of settings.
     * 
     */
    @OutputExport(name="userSettings", type=UserProfileUserSettings.class, parameters={})
    private Output</* @Nullable */ UserProfileUserSettings> userSettings;

    /**
     * @return A collection of settings.
     * 
     */
    public Output</* @Nullable */ UserProfileUserSettings> getUserSettings() {
        return this.userSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserProfile(String name, UserProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:UserProfile", name, args == null ? UserProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private UserProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:UserProfile", name, null, makeResourceOptions(options, id));
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
    public static UserProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserProfile(name, id, options);
    }
}
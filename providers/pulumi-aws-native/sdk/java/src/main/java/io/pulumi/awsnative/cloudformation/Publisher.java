// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudformation.PublisherArgs;
import io.pulumi.awsnative.cloudformation.enums.PublisherIdentityProvider;
import io.pulumi.awsnative.cloudformation.enums.PublisherStatus;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Register as a publisher in the CloudFormation Registry.
 * 
 */
@ResourceType(type="aws-native:cloudformation:Publisher")
public class Publisher extends io.pulumi.resources.CustomResource {
    /**
     * Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You must accept the terms and conditions in order to publish public extensions to the CloudFormation registry. The terms and conditions can be found at https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf
     * 
     */
    @OutputExport(name="acceptTermsAndConditions", type=Boolean.class, parameters={})
    private Output<Boolean> acceptTermsAndConditions;

    /**
     * @return Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You must accept the terms and conditions in order to publish public extensions to the CloudFormation registry. The terms and conditions can be found at https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf
     * 
     */
    public Output<Boolean> getAcceptTermsAndConditions() {
        return this.acceptTermsAndConditions;
    }
    /**
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN) for your connection to that account.
     * 
     */
    @OutputExport(name="connectionArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionArn;

    /**
     * @return If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN) for your connection to that account.
     * 
     */
    public Output</* @Nullable */ String> getConnectionArn() {
        return this.connectionArn;
    }
    /**
     * The type of account used as the identity provider when registering this publisher with CloudFormation.
     * 
     */
    @OutputExport(name="identityProvider", type=PublisherIdentityProvider.class, parameters={})
    private Output<PublisherIdentityProvider> identityProvider;

    /**
     * @return The type of account used as the identity provider when registering this publisher with CloudFormation.
     * 
     */
    public Output<PublisherIdentityProvider> getIdentityProvider() {
        return this.identityProvider;
    }
    /**
     * The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    @OutputExport(name="publisherId", type=String.class, parameters={})
    private Output<String> publisherId;

    /**
     * @return The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    public Output<String> getPublisherId() {
        return this.publisherId;
    }
    /**
     * The URL to the publisher's profile with the identity provider.
     * 
     */
    @OutputExport(name="publisherProfile", type=String.class, parameters={})
    private Output<String> publisherProfile;

    /**
     * @return The URL to the publisher's profile with the identity provider.
     * 
     */
    public Output<String> getPublisherProfile() {
        return this.publisherProfile;
    }
    /**
     * Whether the publisher is verified.
     * 
     */
    @OutputExport(name="publisherStatus", type=PublisherStatus.class, parameters={})
    private Output<PublisherStatus> publisherStatus;

    /**
     * @return Whether the publisher is verified.
     * 
     */
    public Output<PublisherStatus> getPublisherStatus() {
        return this.publisherStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Publisher(String name, PublisherArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:Publisher", name, args == null ? PublisherArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Publisher(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:Publisher", name, null, makeResourceOptions(options, id));
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
    public static Publisher get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Publisher(name, id, options);
    }
}

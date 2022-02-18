// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appstream.ApplicationEntitlementAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::AppStream::ApplicationEntitlementAssociation
 * 
 */
@ResourceType(type="aws-native:appstream:ApplicationEntitlementAssociation")
public class ApplicationEntitlementAssociation extends io.pulumi.resources.CustomResource {
    @OutputExport(name="applicationIdentifier", type=String.class, parameters={})
    private Output<String> applicationIdentifier;

    public Output<String> getApplicationIdentifier() {
        return this.applicationIdentifier;
    }
    @OutputExport(name="entitlementName", type=String.class, parameters={})
    private Output<String> entitlementName;

    public Output<String> getEntitlementName() {
        return this.entitlementName;
    }
    @OutputExport(name="stackName", type=String.class, parameters={})
    private Output<String> stackName;

    public Output<String> getStackName() {
        return this.stackName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationEntitlementAssociation(String name, ApplicationEntitlementAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appstream:ApplicationEntitlementAssociation", name, args == null ? ApplicationEntitlementAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApplicationEntitlementAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appstream:ApplicationEntitlementAssociation", name, null, makeResourceOptions(options, id));
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
    public static ApplicationEntitlementAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationEntitlementAssociation(name, id, options);
    }
}

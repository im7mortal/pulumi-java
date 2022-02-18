// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.servicecatalogappregistry.AttributeGroupAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Schema for AWS::ServiceCatalogAppRegistry::AttributeGroupAssociation.
 * 
 */
@ResourceType(type="aws-native:servicecatalogappregistry:AttributeGroupAssociation")
public class AttributeGroupAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The name or the Id of the Application.
     * 
     */
    @OutputExport(name="application", type=String.class, parameters={})
    private Output<String> application;

    /**
     * @return The name or the Id of the Application.
     * 
     */
    public Output<String> getApplication() {
        return this.application;
    }
    @OutputExport(name="applicationArn", type=String.class, parameters={})
    private Output<String> applicationArn;

    public Output<String> getApplicationArn() {
        return this.applicationArn;
    }
    /**
     * The name or the Id of the AttributeGroup.
     * 
     */
    @OutputExport(name="attributeGroup", type=String.class, parameters={})
    private Output<String> attributeGroup;

    /**
     * @return The name or the Id of the AttributeGroup.
     * 
     */
    public Output<String> getAttributeGroup() {
        return this.attributeGroup;
    }
    @OutputExport(name="attributeGroupArn", type=String.class, parameters={})
    private Output<String> attributeGroupArn;

    public Output<String> getAttributeGroupArn() {
        return this.attributeGroupArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AttributeGroupAssociation(String name, AttributeGroupAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:servicecatalogappregistry:AttributeGroupAssociation", name, args == null ? AttributeGroupAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AttributeGroupAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:servicecatalogappregistry:AttributeGroupAssociation", name, null, makeResourceOptions(options, id));
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
    public static AttributeGroupAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AttributeGroupAssociation(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.refactorspaces.EnvironmentArgs;
import io.pulumi.awsnative.refactorspaces.enums.EnvironmentNetworkFabricType;
import io.pulumi.awsnative.refactorspaces.outputs.EnvironmentTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of AWS::RefactorSpaces::Environment Resource Type
 * 
 */
@ResourceType(type="aws-native:refactorspaces:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="environmentIdentifier", type=String.class, parameters={})
    private Output<String> environmentIdentifier;

    public Output<String> getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="networkFabricType", type=EnvironmentNetworkFabricType.class, parameters={})
    private Output</* @Nullable */ EnvironmentNetworkFabricType> networkFabricType;

    public Output</* @Nullable */ EnvironmentNetworkFabricType> getNetworkFabricType() {
        return this.networkFabricType;
    }
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={EnvironmentTag.class})
    private Output</* @Nullable */ List<EnvironmentTag>> tags;

    /**
     * @return Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    public Output</* @Nullable */ List<EnvironmentTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="transitGatewayId", type=String.class, parameters={})
    private Output<String> transitGatewayId;

    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, @Nullable EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:refactorspaces:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Environment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:refactorspaces:Environment", name, null, makeResourceOptions(options, id));
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
    public static Environment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, options);
    }
}

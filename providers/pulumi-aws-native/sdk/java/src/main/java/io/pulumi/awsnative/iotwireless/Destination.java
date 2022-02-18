// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotwireless.DestinationArgs;
import io.pulumi.awsnative.iotwireless.enums.DestinationExpressionType;
import io.pulumi.awsnative.iotwireless.outputs.DestinationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Destination's resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:iotwireless:Destination")
public class Destination extends io.pulumi.resources.CustomResource {
    /**
     * Destination arn. Returned after successful create.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Destination arn. Returned after successful create.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Destination description
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Destination description
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Destination expression
     * 
     */
    @OutputExport(name="expression", type=String.class, parameters={})
    private Output<String> expression;

    /**
     * @return Destination expression
     * 
     */
    public Output<String> getExpression() {
        return this.expression;
    }
    /**
     * Must be RuleName
     * 
     */
    @OutputExport(name="expressionType", type=DestinationExpressionType.class, parameters={})
    private Output<DestinationExpressionType> expressionType;

    /**
     * @return Must be RuleName
     * 
     */
    public Output<DestinationExpressionType> getExpressionType() {
        return this.expressionType;
    }
    /**
     * Unique name of destination
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name of destination
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * AWS role ARN that grants access
     * 
     */
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return AWS role ARN that grants access
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * A list of key-value pairs that contain metadata for the destination.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DestinationTag.class})
    private Output</* @Nullable */ List<DestinationTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the destination.
     * 
     */
    public Output</* @Nullable */ List<DestinationTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Destination(String name, DestinationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:Destination", name, args == null ? DestinationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Destination(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:Destination", name, null, makeResourceOptions(options, id));
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
    public static Destination get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Destination(name, id, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.waf.SizeConstraintSetArgs;
import io.pulumi.aws.waf.inputs.SizeConstraintSetState;
import io.pulumi.aws.waf.outputs.SizeConstraintSetSizeConstraint;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a WAF Size Constraint Set Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AWS WAF Size Constraint Set can be imported using their ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:waf/sizeConstraintSet:SizeConstraintSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:waf/sizeConstraintSet:SizeConstraintSet")
public class SizeConstraintSet extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name or description of the Size Constraint Set.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the Size Constraint Set.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    @OutputExport(name="sizeConstraints", type=List.class, parameters={SizeConstraintSetSizeConstraint.class})
    private Output</* @Nullable */ List<SizeConstraintSetSizeConstraint>> sizeConstraints;

    /**
     * @return Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    public Output</* @Nullable */ List<SizeConstraintSetSizeConstraint>> getSizeConstraints() {
        return this.sizeConstraints;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable SizeConstraintSetArgs.Builder a);
    }
    private static io.pulumi.aws.waf.SizeConstraintSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.waf.SizeConstraintSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SizeConstraintSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SizeConstraintSet(String name) {
        this(name, SizeConstraintSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SizeConstraintSet(String name, @Nullable SizeConstraintSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SizeConstraintSet(String name, @Nullable SizeConstraintSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/sizeConstraintSet:SizeConstraintSet", name, args == null ? SizeConstraintSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SizeConstraintSet(String name, Input<String> id, @Nullable SizeConstraintSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/sizeConstraintSet:SizeConstraintSet", name, state, makeResourceOptions(options, id));
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
    public static SizeConstraintSet get(String name, Input<String> id, @Nullable SizeConstraintSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SizeConstraintSet(name, id, state, options);
    }
}

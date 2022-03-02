// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appstream.FleetStackAssociationArgs;
import io.pulumi.aws.appstream.inputs.FleetStackAssociationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an AppStream Fleet Stack association.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AppStream Stack Fleet Association can be imported by using the `fleet_name` and `stack_name` separated by a slash (`/`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appstream/fleetStackAssociation:FleetStackAssociation example fleetName/stackName
 * ```
 * 
 */
@ResourceType(type="aws:appstream/fleetStackAssociation:FleetStackAssociation")
public class FleetStackAssociation extends io.pulumi.resources.CustomResource {
    /**
     * Name of the fleet.
     * 
     */
    @OutputExport(name="fleetName", type=String.class, parameters={})
    private Output<String> fleetName;

    /**
     * @return Name of the fleet.
     * 
     */
    public Output<String> getFleetName() {
        return this.fleetName;
    }
    /**
     * Name of the stack.
     * 
     */
    @OutputExport(name="stackName", type=String.class, parameters={})
    private Output<String> stackName;

    /**
     * @return Name of the stack.
     * 
     */
    public Output<String> getStackName() {
        return this.stackName;
    }

    public interface BuilderApplicator {
        public void apply(FleetStackAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.appstream.FleetStackAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appstream.FleetStackAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FleetStackAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FleetStackAssociation(String name) {
        this(name, FleetStackAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FleetStackAssociation(String name, FleetStackAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FleetStackAssociation(String name, FleetStackAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/fleetStackAssociation:FleetStackAssociation", name, args == null ? FleetStackAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FleetStackAssociation(String name, Input<String> id, @Nullable FleetStackAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/fleetStackAssociation:FleetStackAssociation", name, state, makeResourceOptions(options, id));
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
    public static FleetStackAssociation get(String name, Input<String> id, @Nullable FleetStackAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FleetStackAssociation(name, id, state, options);
    }
}

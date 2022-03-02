// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.accesscontextmanager.AccessLevelsArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsState;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevel;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Replace all existing Access Levels in an Access Policy with the Access Levels provided. This is done atomically.
 * This is a bulk edit of all Access Levels and may override existing Access Levels created by `gcp.accesscontextmanager.AccessLevel`,
 * thus causing a permadiff if used alongside `gcp.accesscontextmanager.AccessLevel` on the same parent.
 * 
 * To get more information about AccessLevels, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AccessLevels can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/accessLevels:AccessLevels default {{parent}}/accessLevels
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/accessLevels:AccessLevels default {{parent}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/accessLevels:AccessLevels")
public class AccessLevels extends io.pulumi.resources.CustomResource {
    /**
     * The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="accessLevels", type=List.class, parameters={AccessLevelsAccessLevel.class})
    private Output</* @Nullable */ List<AccessLevelsAccessLevel>> accessLevels;

    /**
     * @return The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<AccessLevelsAccessLevel>> getAccessLevels() {
        return this.accessLevels;
    }
    /**
     * The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }

    public interface BuilderApplicator {
        public void apply(AccessLevelsArgs.Builder a);
    }
    private static io.pulumi.gcp.accesscontextmanager.AccessLevelsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.accesscontextmanager.AccessLevelsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AccessLevels(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessLevels(String name) {
        this(name, AccessLevelsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessLevels(String name, AccessLevelsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessLevels(String name, AccessLevelsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevels:AccessLevels", name, args == null ? AccessLevelsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AccessLevels(String name, Input<String> id, @Nullable AccessLevelsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevels:AccessLevels", name, state, makeResourceOptions(options, id));
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
    public static AccessLevels get(String name, Input<String> id, @Nullable AccessLevelsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessLevels(name, id, state, options);
    }
}

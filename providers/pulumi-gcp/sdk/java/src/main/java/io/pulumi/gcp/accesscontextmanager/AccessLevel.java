// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.accesscontextmanager.AccessLevelArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelState;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelBasic;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelCustom;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An AccessLevel is a label that can be applied to requests to GCP services,
 * along with a list of requirements necessary for the label to be applied.
 * 
 * To get more information about AccessLevel, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 * 
 * > **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the ACM API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AccessLevel can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/accessLevel:AccessLevel default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/accessLevel:AccessLevel")
public class AccessLevel extends io.pulumi.resources.CustomResource {
    /**
     * A set of predefined conditions for the access level and a combining function.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="basic", type=AccessLevelBasic.class, parameters={})
    private Output</* @Nullable */ AccessLevelBasic> basic;

    /**
     * @return A set of predefined conditions for the access level and a combining function.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AccessLevelBasic> getBasic() {
        return this.basic;
    }
    /**
     * Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     * See CEL spec at: https://github.com/google/cel-spec.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="custom", type=AccessLevelCustom.class, parameters={})
    private Output</* @Nullable */ AccessLevelCustom> custom;

    /**
     * @return Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     * See CEL spec at: https://github.com/google/cel-spec.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AccessLevelCustom> getCustom() {
        return this.custom;
    }
    /**
     * Description of the expression
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the expression
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Resource name for the Access Level. The short_name component must begin
     * with a letter and only include alphanumeric and '_'.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name for the Access Level. The short_name component must begin
     * with a letter and only include alphanumeric and '_'.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    public Output<String> getName() {
        return this.name;
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
    /**
     * Title for the expression, i.e. a short string describing its purpose.
     * 
     */
    @OutputExport(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return Title for the expression, i.e. a short string describing its purpose.
     * 
     */
    public Output<String> getTitle() {
        return this.title;
    }

    public interface BuilderApplicator {
        public void apply(AccessLevelArgs.Builder a);
    }
    private static io.pulumi.gcp.accesscontextmanager.AccessLevelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.accesscontextmanager.AccessLevelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AccessLevel(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessLevel(String name) {
        this(name, AccessLevelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessLevel(String name, AccessLevelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessLevel(String name, AccessLevelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevel:AccessLevel", name, args == null ? AccessLevelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AccessLevel(String name, Input<String> id, @Nullable AccessLevelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevel:AccessLevel", name, state, makeResourceOptions(options, id));
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
    public static AccessLevel get(String name, Input<String> id, @Nullable AccessLevelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessLevel(name, id, state, options);
    }
}

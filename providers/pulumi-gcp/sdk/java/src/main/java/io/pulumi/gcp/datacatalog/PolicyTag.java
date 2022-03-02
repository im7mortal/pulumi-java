// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datacatalog.PolicyTagArgs;
import io.pulumi.gcp.datacatalog.inputs.PolicyTagState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Denotes one policy tag in a taxonomy.
 * 
 * To get more information about PolicyTag, see:
 * 
 * * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1beta1/projects.locations.taxonomies.policyTags)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/data-catalog/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * PolicyTag can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/policyTag:PolicyTag default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:datacatalog/policyTag:PolicyTag")
public class PolicyTag extends io.pulumi.resources.CustomResource {
    /**
     * Resource names of child policy tags of this policy tag.
     * 
     */
    @OutputExport(name="childPolicyTags", type=List.class, parameters={String.class})
    private Output<List<String>> childPolicyTags;

    /**
     * @return Resource names of child policy tags of this policy tag.
     * 
     */
    public Output<List<String>> getChildPolicyTags() {
        return this.childPolicyTags;
    }
    /**
     * Description of this policy tag. It must: contain only unicode characters, tabs,
     * newlines, carriage returns and page breaks; and be at most 2000 bytes long when
     * encoded in UTF-8. If not set, defaults to an empty description.
     * If not set, defaults to an empty description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of this policy tag. It must: contain only unicode characters, tabs,
     * newlines, carriage returns and page breaks; and be at most 2000 bytes long when
     * encoded in UTF-8. If not set, defaults to an empty description.
     * If not set, defaults to an empty description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * User defined name of this policy tag. It must: be unique within the parent
     * taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces;
     * not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User defined name of this policy tag. It must: be unique within the parent
     * taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces;
     * not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name of this policy tag, whose format is:
     * "projects/{project}/locations/{region}/taxonomies/{taxonomy}/policyTags/{policytag}"
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of this policy tag, whose format is:
     * "projects/{project}/locations/{region}/taxonomies/{taxonomy}/policyTags/{policytag}"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource name of this policy tag's parent policy tag.
     * If empty, it means this policy tag is a top level policy tag.
     * If not set, defaults to an empty string.
     * 
     */
    @OutputExport(name="parentPolicyTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> parentPolicyTag;

    /**
     * @return Resource name of this policy tag's parent policy tag.
     * If empty, it means this policy tag is a top level policy tag.
     * If not set, defaults to an empty string.
     * 
     */
    public Output</* @Nullable */ String> getParentPolicyTag() {
        return this.parentPolicyTag;
    }
    /**
     * Taxonomy the policy tag is associated with
     * 
     */
    @OutputExport(name="taxonomy", type=String.class, parameters={})
    private Output<String> taxonomy;

    /**
     * @return Taxonomy the policy tag is associated with
     * 
     */
    public Output<String> getTaxonomy() {
        return this.taxonomy;
    }

    public interface BuilderApplicator {
        public void apply(PolicyTagArgs.Builder a);
    }
    private static io.pulumi.gcp.datacatalog.PolicyTagArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.datacatalog.PolicyTagArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PolicyTag(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyTag(String name) {
        this(name, PolicyTagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyTag(String name, PolicyTagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyTag(String name, PolicyTagArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/policyTag:PolicyTag", name, args == null ? PolicyTagArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PolicyTag(String name, Input<String> id, @Nullable PolicyTagState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/policyTag:PolicyTag", name, state, makeResourceOptions(options, id));
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
    public static PolicyTag get(String name, Input<String> id, @Nullable PolicyTagState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PolicyTag(name, id, state, options);
    }
}

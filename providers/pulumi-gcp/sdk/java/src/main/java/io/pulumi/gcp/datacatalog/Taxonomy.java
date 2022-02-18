// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datacatalog.TaxonomyArgs;
import io.pulumi.gcp.datacatalog.inputs.TaxonomyState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A collection of policy tags that classify data along a common axis.
 * 
 * To get more information about Taxonomy, see:
 * 
 * * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1beta1/projects.locations.taxonomies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/data-catalog/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Taxonomy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/taxonomy:Taxonomy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:datacatalog/taxonomy:Taxonomy")
public class Taxonomy extends io.pulumi.resources.CustomResource {
    /**
     * A list of policy types that are activated for this taxonomy. If not set,
     * defaults to an empty list.
     * Each value may be one of `POLICY_TYPE_UNSPECIFIED` and `FINE_GRAINED_ACCESS_CONTROL`.
     * 
     */
    @OutputExport(name="activatedPolicyTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> activatedPolicyTypes;

    /**
     * @return A list of policy types that are activated for this taxonomy. If not set,
     * defaults to an empty list.
     * Each value may be one of `POLICY_TYPE_UNSPECIFIED` and `FINE_GRAINED_ACCESS_CONTROL`.
     * 
     */
    public Output</* @Nullable */ List<String>> getActivatedPolicyTypes() {
        return this.activatedPolicyTypes;
    }
    /**
     * Description of this taxonomy. It must: contain only unicode characters,
     * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
     * long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of this taxonomy. It must: contain only unicode characters,
     * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
     * long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * User defined name of this taxonomy.
     * It must: contain only unicode letters, numbers, underscores, dashes
     * and spaces; not start or end with spaces; and be at most 200 bytes
     * long when encoded in UTF-8.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User defined name of this taxonomy.
     * It must: contain only unicode letters, numbers, underscores, dashes
     * and spaces; not start or end with spaces; and be at most 200 bytes
     * long when encoded in UTF-8.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name of this taxonomy, whose format is: "projects/{project}/locations/{region}/taxonomies/{taxonomy}".
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of this taxonomy, whose format is: "projects/{project}/locations/{region}/taxonomies/{taxonomy}".
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Taxonomy location region.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Taxonomy location region.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Taxonomy(String name, TaxonomyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/taxonomy:Taxonomy", name, args == null ? TaxonomyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Taxonomy(String name, Input<String> id, @Nullable TaxonomyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/taxonomy:Taxonomy", name, state, makeResourceOptions(options, id));
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
    public static Taxonomy get(String name, Input<String> id, @Nullable TaxonomyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Taxonomy(name, id, state, options);
    }
}
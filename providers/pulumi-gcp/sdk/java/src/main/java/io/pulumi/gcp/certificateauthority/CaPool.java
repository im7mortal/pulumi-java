// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.certificateauthority.CaPoolArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolState;
import io.pulumi.gcp.certificateauthority.outputs.CaPoolIssuancePolicy;
import io.pulumi.gcp.certificateauthority.outputs.CaPoolPublishingOptions;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A CaPool represents a group of CertificateAuthorities that form a trust anchor. A CaPool can be used to manage
 * issuance policies for one or more CertificateAuthority resources and to rotate CA certificates in and out of the
 * trust anchor.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CaPool can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/caPool:CaPool default projects/{{project}}/locations/{{location}}/caPools/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/caPool:CaPool default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/caPool:CaPool default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:certificateauthority/caPool:CaPool")
public class CaPool extends io.pulumi.resources.CustomResource {
    /**
     * The IssuancePolicy to control how Certificates will be issued from this CaPool.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="issuancePolicy", type=CaPoolIssuancePolicy.class, parameters={})
    private Output</* @Nullable */ CaPoolIssuancePolicy> issuancePolicy;

    /**
     * @return The IssuancePolicy to control how Certificates will be issued from this CaPool.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ CaPoolIssuancePolicy> getIssuancePolicy() {
        return this.issuancePolicy;
    }
    /**
     * Labels with user-defined metadata.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass":
     * "1.3kg", "count": "3" }.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels with user-defined metadata.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass":
     * "1.3kg", "count": "3" }.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name for this CaPool.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for this CaPool.
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
     * The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="publishingOptions", type=CaPoolPublishingOptions.class, parameters={})
    private Output</* @Nullable */ CaPoolPublishingOptions> publishingOptions;

    /**
     * @return The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ CaPoolPublishingOptions> getPublishingOptions() {
        return this.publishingOptions;
    }
    /**
     * The Tier of this CaPool.
     * Possible values are `ENTERPRISE` and `DEVOPS`.
     * 
     */
    @OutputExport(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return The Tier of this CaPool.
     * Possible values are `ENTERPRISE` and `DEVOPS`.
     * 
     */
    public Output<String> getTier() {
        return this.tier;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CaPool(String name, CaPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/caPool:CaPool", name, args == null ? CaPoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CaPool(String name, Input<String> id, @Nullable CaPoolState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/caPool:CaPool", name, state, makeResourceOptions(options, id));
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
    public static CaPool get(String name, Input<String> id, @Nullable CaPoolState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CaPool(name, id, state, options);
    }
}
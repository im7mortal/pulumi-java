// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3control.MultiRegionAccessPointArgs;
import io.pulumi.aws.s3control.inputs.MultiRegionAccessPointState;
import io.pulumi.aws.s3control.outputs.MultiRegionAccessPointDetails;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an S3 Multi-Region Access Point associated with specified buckets.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Multi-Region Access Points can be imported using the `account_id` and `name` of the Multi-Region Access Point separated by a colon (`:`), e.g.
 * 
 * ```sh
 *  $ pulumi import aws:s3control/multiRegionAccessPoint:MultiRegionAccessPoint example 123456789012:example
 * ```
 * 
 */
@ResourceType(type="aws:s3control/multiRegionAccessPoint:MultiRegionAccessPoint")
public class MultiRegionAccessPoint extends io.pulumi.resources.CustomResource {
    /**
     * The AWS account ID for the owner of the buckets for which you want to create a Multi-Region Access Point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The AWS account ID for the owner of the buckets for which you want to create a Multi-Region Access Point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * The alias for the Multi-Region Access Point.
     * 
     */
    @OutputExport(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return The alias for the Multi-Region Access Point.
     * 
     */
    public Output<String> getAlias() {
        return this.alias;
    }
    /**
     * Amazon Resource Name (ARN) of the Multi-Region Access Point.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Multi-Region Access Point.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A configuration block containing details about the Multi-Region Access Point. See Details Configuration Block below for more details
     * 
     */
    @OutputExport(name="details", type=MultiRegionAccessPointDetails.class, parameters={})
    private Output<MultiRegionAccessPointDetails> details;

    /**
     * @return A configuration block containing details about the Multi-Region Access Point. See Details Configuration Block below for more details
     * 
     */
    public Output<MultiRegionAccessPointDetails> getDetails() {
        return this.details;
    }
    /**
     * The DNS domain name of the S3 Multi-Region Access Point in the format _`alias`_.accesspoint.s3-global.amazonaws.com. For more information, see the documentation on [Multi-Region Access Point Requests](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRequests.html).
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The DNS domain name of the S3 Multi-Region Access Point in the format _`alias`_.accesspoint.s3-global.amazonaws.com. For more information, see the documentation on [Multi-Region Access Point Requests](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRequests.html).
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The current status of the Multi-Region Access Point. One of: `READY`, `INCONSISTENT_ACROSS_REGIONS`, `CREATING`, `PARTIALLY_CREATED`, `PARTIALLY_DELETED`, `DELETING`.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current status of the Multi-Region Access Point. One of: `READY`, `INCONSISTENT_ACROSS_REGIONS`, `CREATING`, `PARTIALLY_CREATED`, `PARTIALLY_DELETED`, `DELETING`.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(MultiRegionAccessPointArgs.Builder a);
    }
    private static io.pulumi.aws.s3control.MultiRegionAccessPointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.s3control.MultiRegionAccessPointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MultiRegionAccessPoint(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MultiRegionAccessPoint(String name) {
        this(name, MultiRegionAccessPointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MultiRegionAccessPoint(String name, MultiRegionAccessPointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MultiRegionAccessPoint(String name, MultiRegionAccessPointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/multiRegionAccessPoint:MultiRegionAccessPoint", name, args == null ? MultiRegionAccessPointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MultiRegionAccessPoint(String name, Input<String> id, @Nullable MultiRegionAccessPointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/multiRegionAccessPoint:MultiRegionAccessPoint", name, state, makeResourceOptions(options, id));
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
    public static MultiRegionAccessPoint get(String name, Input<String> id, @Nullable MultiRegionAccessPointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MultiRegionAccessPoint(name, id, state, options);
    }
}

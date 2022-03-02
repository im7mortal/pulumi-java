// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3control.BucketArgs;
import io.pulumi.aws.s3control.inputs.BucketState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an S3 Control Bucket.
 * 
 * > This functionality is for managing [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html). To manage S3 Buckets in an AWS Partition, see the `aws.s3.Bucket` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * S3 Control Buckets can be imported using Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3control/bucket:Bucket example arn:aws:s3-outposts:us-east-1:123456789012:outpost/op-12345678/bucket/example
 * ```
 * 
 */
@ResourceType(type="aws:s3control/bucket:Bucket")
public class Bucket extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the bucket.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the bucket.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name of the bucket.
     * 
     */
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return Name of the bucket.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * UTC creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return UTC creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * Identifier of the Outpost to contain this bucket.
     * 
     */
    @OutputExport(name="outpostId", type=String.class, parameters={})
    private Output<String> outpostId;

    /**
     * @return Identifier of the Outpost to contain this bucket.
     * 
     */
    public Output<String> getOutpostId() {
        return this.outpostId;
    }
    /**
     * Boolean whether Public Access Block is enabled.
     * 
     */
    @OutputExport(name="publicAccessBlockEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> publicAccessBlockEnabled;

    /**
     * @return Boolean whether Public Access Block is enabled.
     * 
     */
    public Output<Boolean> getPublicAccessBlockEnabled() {
        return this.publicAccessBlockEnabled;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(BucketArgs.Builder a);
    }
    private static io.pulumi.aws.s3control.BucketArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.s3control.BucketArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Bucket(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bucket(String name) {
        this(name, BucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bucket(String name, BucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bucket(String name, BucketArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/bucket:Bucket", name, args == null ? BucketArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Bucket(String name, Input<String> id, @Nullable BucketState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/bucket:Bucket", name, state, makeResourceOptions(options, id));
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
    public static Bucket get(String name, Input<String> id, @Nullable BucketState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Bucket(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.storage.BucketArgs;
import io.pulumi.gcp.storage.inputs.BucketState;
import io.pulumi.gcp.storage.outputs.BucketCor;
import io.pulumi.gcp.storage.outputs.BucketEncryption;
import io.pulumi.gcp.storage.outputs.BucketLifecycleRule;
import io.pulumi.gcp.storage.outputs.BucketLogging;
import io.pulumi.gcp.storage.outputs.BucketRetentionPolicy;
import io.pulumi.gcp.storage.outputs.BucketVersioning;
import io.pulumi.gcp.storage.outputs.BucketWebsite;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new bucket in Google cloud storage service (GCS).
 * Once a bucket has been created, its location can't be changed.
 * 
 * For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/overview)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).
 * 
 * **Note**: If the project id is not set on the resource or in the provider block it will be dynamically
 * determined which will require enabling the compute api.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Storage buckets can be imported using the `name` or
 * 
 * `project/name`. If the project is not passed to the import command it will be inferred from the provider block or environment variables. If it cannot be inferred it will be queried from the Compute API (this will fail if the API is not enabled). e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:storage/bucket:Bucket image-store image-store-bucket
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:storage/bucket:Bucket image-store tf-test-project/image-store-bucket
 * ```
 * 
 *  `false` in state. If you've set it to `true` in config, run `terraform apply` to update the value set in state. If you delete this resource before updating the value, objects in the bucket will not be destroyed.
 * 
 */
@ResourceType(type="gcp:storage/bucket:Bucket")
public class Bucket extends io.pulumi.resources.CustomResource {
    /**
     * The bucket's [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @OutputExport(name="cors", type=List.class, parameters={BucketCor.class})
    private Output</* @Nullable */ List<BucketCor>> cors;

    /**
     * @return The bucket's [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<BucketCor>> getCors() {
        return this.cors;
    }
    @OutputExport(name="defaultEventBasedHold", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> defaultEventBasedHold;

    public Output</* @Nullable */ Boolean> getDefaultEventBasedHold() {
        return this.defaultEventBasedHold;
    }
    /**
     * The bucket's encryption configuration. Structure is documented below.
     * 
     */
    @OutputExport(name="encryption", type=BucketEncryption.class, parameters={})
    private Output</* @Nullable */ BucketEncryption> encryption;

    /**
     * @return The bucket's encryption configuration. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BucketEncryption> getEncryption() {
        return this.encryption;
    }
    /**
     * When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, the provider will fail that run.
     * 
     */
    @OutputExport(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, the provider will fail that run.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * A map of key/value label pairs to assign to the bucket.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A map of key/value label pairs to assign to the bucket.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The bucket's [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @OutputExport(name="lifecycleRules", type=List.class, parameters={BucketLifecycleRule.class})
    private Output</* @Nullable */ List<BucketLifecycleRule>> lifecycleRules;

    /**
     * @return The bucket's [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<BucketLifecycleRule>> getLifecycleRules() {
        return this.lifecycleRules;
    }
    /**
     * The [GCS location](https://cloud.google.com/storage/docs/bucket-locations)
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The [GCS location](https://cloud.google.com/storage/docs/bucket-locations)
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The bucket's [Access & Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * 
     */
    @OutputExport(name="logging", type=BucketLogging.class, parameters={})
    private Output</* @Nullable */ BucketLogging> logging;

    /**
     * @return The bucket's [Access & Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BucketLogging> getLogging() {
        return this.logging;
    }
    /**
     * The name of the bucket.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Prevents public access to a bucket.
     * 
     */
    @OutputExport(name="publicAccessPrevention", type=String.class, parameters={})
    private Output<String> publicAccessPrevention;

    /**
     * @return Prevents public access to a bucket.
     * 
     */
    public Output<String> getPublicAccessPrevention() {
        return this.publicAccessPrevention;
    }
    /**
     * Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     * 
     */
    @OutputExport(name="requesterPays", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requesterPays;

    /**
     * @return Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     * 
     */
    public Output</* @Nullable */ Boolean> getRequesterPays() {
        return this.requesterPays;
    }
    /**
     * Configuration of the bucket's data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * 
     */
    @OutputExport(name="retentionPolicy", type=BucketRetentionPolicy.class, parameters={})
    private Output</* @Nullable */ BucketRetentionPolicy> retentionPolicy;

    /**
     * @return Configuration of the bucket's data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BucketRetentionPolicy> getRetentionPolicy() {
        return this.retentionPolicy;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The target [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects affected by this Lifecycle Rule. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
     * 
     */
    @OutputExport(name="storageClass", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageClass;

    /**
     * @return The target [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects affected by this Lifecycle Rule. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
     * 
     */
    public Output</* @Nullable */ String> getStorageClass() {
        return this.storageClass;
    }
    /**
     * Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
     * 
     */
    @OutputExport(name="uniformBucketLevelAccess", type=Boolean.class, parameters={})
    private Output<Boolean> uniformBucketLevelAccess;

    /**
     * @return Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
     * 
     */
    public Output<Boolean> getUniformBucketLevelAccess() {
        return this.uniformBucketLevelAccess;
    }
    /**
     * The base URL of the bucket, in the format `gs://<bucket-name>`.
     * 
     */
    @OutputExport(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The base URL of the bucket, in the format `gs://<bucket-name>`.
     * 
     */
    public Output<String> getUrl() {
        return this.url;
    }
    /**
     * The bucket's [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * 
     */
    @OutputExport(name="versioning", type=BucketVersioning.class, parameters={})
    private Output</* @Nullable */ BucketVersioning> versioning;

    /**
     * @return The bucket's [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BucketVersioning> getVersioning() {
        return this.versioning;
    }
    /**
     * Configuration if the bucket acts as a website. Structure is documented below.
     * 
     */
    @OutputExport(name="website", type=BucketWebsite.class, parameters={})
    private Output</* @Nullable */ BucketWebsite> website;

    /**
     * @return Configuration if the bucket acts as a website. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BucketWebsite> getWebsite() {
        return this.website;
    }

    public interface BuilderApplicator {
        public void apply(BucketArgs.Builder a);
    }
    private static io.pulumi.gcp.storage.BucketArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.storage.BucketArgs.builder();
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
        super("gcp:storage/bucket:Bucket", name, args == null ? BucketArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Bucket(String name, Input<String> id, @Nullable BucketState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucket:Bucket", name, state, makeResourceOptions(options, id));
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

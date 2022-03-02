// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ssm.ResourceDataSyncArgs;
import io.pulumi.awsnative.ssm.outputs.ResourceDataSyncS3Destination;
import io.pulumi.awsnative.ssm.outputs.ResourceDataSyncSyncSource;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SSM::ResourceDataSync
 * 
 */
@ResourceType(type="aws-native:ssm:ResourceDataSync")
public class ResourceDataSync extends io.pulumi.resources.CustomResource {
    @OutputExport(name="bucketName", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketName;

    public Output</* @Nullable */ String> getBucketName() {
        return this.bucketName;
    }
    @OutputExport(name="bucketPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketPrefix;

    public Output</* @Nullable */ String> getBucketPrefix() {
        return this.bucketPrefix;
    }
    @OutputExport(name="bucketRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketRegion;

    public Output</* @Nullable */ String> getBucketRegion() {
        return this.bucketRegion;
    }
    @OutputExport(name="kMSKeyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> kMSKeyArn;

    public Output</* @Nullable */ String> getKMSKeyArn() {
        return this.kMSKeyArn;
    }
    @OutputExport(name="s3Destination", type=ResourceDataSyncS3Destination.class, parameters={})
    private Output</* @Nullable */ ResourceDataSyncS3Destination> s3Destination;

    public Output</* @Nullable */ ResourceDataSyncS3Destination> getS3Destination() {
        return this.s3Destination;
    }
    @OutputExport(name="syncFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncFormat;

    public Output</* @Nullable */ String> getSyncFormat() {
        return this.syncFormat;
    }
    @OutputExport(name="syncName", type=String.class, parameters={})
    private Output<String> syncName;

    public Output<String> getSyncName() {
        return this.syncName;
    }
    @OutputExport(name="syncSource", type=ResourceDataSyncSyncSource.class, parameters={})
    private Output</* @Nullable */ ResourceDataSyncSyncSource> syncSource;

    public Output</* @Nullable */ ResourceDataSyncSyncSource> getSyncSource() {
        return this.syncSource;
    }
    @OutputExport(name="syncType", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncType;

    public Output</* @Nullable */ String> getSyncType() {
        return this.syncType;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ResourceDataSyncArgs.Builder a);
    }
    private static io.pulumi.awsnative.ssm.ResourceDataSyncArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ssm.ResourceDataSyncArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResourceDataSync(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceDataSync(String name) {
        this(name, ResourceDataSyncArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceDataSync(String name, @Nullable ResourceDataSyncArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceDataSync(String name, @Nullable ResourceDataSyncArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssm:ResourceDataSync", name, args == null ? ResourceDataSyncArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceDataSync(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssm:ResourceDataSync", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResourceDataSync get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceDataSync(name, id, options);
    }
}

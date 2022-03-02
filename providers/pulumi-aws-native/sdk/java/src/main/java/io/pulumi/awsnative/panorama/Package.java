// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.panorama.PackageArgs;
import io.pulumi.awsnative.panorama.outputs.PackageStorageLocation;
import io.pulumi.awsnative.panorama.outputs.PackageTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Schema for Package CloudFormation Resource
 * 
 */
@ResourceType(type="aws-native:panorama:Package")
public class Package extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="createdTime", type=Integer.class, parameters={})
    private Output<Integer> createdTime;

    public Output<Integer> getCreatedTime() {
        return this.createdTime;
    }
    @OutputExport(name="packageId", type=String.class, parameters={})
    private Output<String> packageId;

    public Output<String> getPackageId() {
        return this.packageId;
    }
    @OutputExport(name="packageName", type=String.class, parameters={})
    private Output<String> packageName;

    public Output<String> getPackageName() {
        return this.packageName;
    }
    @OutputExport(name="storageLocation", type=PackageStorageLocation.class, parameters={})
    private Output<PackageStorageLocation> storageLocation;

    public Output<PackageStorageLocation> getStorageLocation() {
        return this.storageLocation;
    }
    @OutputExport(name="tags", type=List.class, parameters={PackageTag.class})
    private Output</* @Nullable */ List<PackageTag>> tags;

    public Output</* @Nullable */ List<PackageTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable PackageArgs.Builder a);
    }
    private static io.pulumi.awsnative.panorama.PackageArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.panorama.PackageArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Package(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Package(String name) {
        this(name, PackageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Package(String name, @Nullable PackageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Package(String name, @Nullable PackageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:panorama:Package", name, args == null ? PackageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Package(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:panorama:Package", name, null, makeResourceOptions(options, id));
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
    public static Package get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Package(name, id, options);
    }
}

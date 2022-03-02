// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.efs.FileSystemArgs;
import io.pulumi.awsnative.efs.outputs.FileSystemBackupPolicy;
import io.pulumi.awsnative.efs.outputs.FileSystemElasticFileSystemTag;
import io.pulumi.awsnative.efs.outputs.FileSystemLifecyclePolicy;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EFS::FileSystem
 * 
 */
@ResourceType(type="aws-native:efs:FileSystem")
public class FileSystem extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="availabilityZoneName", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilityZoneName;

    public Output</* @Nullable */ String> getAvailabilityZoneName() {
        return this.availabilityZoneName;
    }
    @OutputExport(name="backupPolicy", type=FileSystemBackupPolicy.class, parameters={})
    private Output</* @Nullable */ FileSystemBackupPolicy> backupPolicy;

    public Output</* @Nullable */ FileSystemBackupPolicy> getBackupPolicy() {
        return this.backupPolicy;
    }
    /**
     * Whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request to be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. Defaults to false
     * 
     */
    @OutputExport(name="bypassPolicyLockoutSafetyCheck", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> bypassPolicyLockoutSafetyCheck;

    /**
     * @return Whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request to be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. Defaults to false
     * 
     */
    public Output</* @Nullable */ Boolean> getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }
    @OutputExport(name="encrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encrypted;

    public Output</* @Nullable */ Boolean> getEncrypted() {
        return this.encrypted;
    }
    @OutputExport(name="fileSystemId", type=String.class, parameters={})
    private Output<String> fileSystemId;

    public Output<String> getFileSystemId() {
        return this.fileSystemId;
    }
    @OutputExport(name="fileSystemPolicy", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> fileSystemPolicy;

    public Output</* @Nullable */ Object> getFileSystemPolicy() {
        return this.fileSystemPolicy;
    }
    @OutputExport(name="fileSystemTags", type=List.class, parameters={FileSystemElasticFileSystemTag.class})
    private Output</* @Nullable */ List<FileSystemElasticFileSystemTag>> fileSystemTags;

    public Output</* @Nullable */ List<FileSystemElasticFileSystemTag>> getFileSystemTags() {
        return this.fileSystemTags;
    }
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    @OutputExport(name="lifecyclePolicies", type=List.class, parameters={FileSystemLifecyclePolicy.class})
    private Output</* @Nullable */ List<FileSystemLifecyclePolicy>> lifecyclePolicies;

    public Output</* @Nullable */ List<FileSystemLifecyclePolicy>> getLifecyclePolicies() {
        return this.lifecyclePolicies;
    }
    @OutputExport(name="performanceMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> performanceMode;

    public Output</* @Nullable */ String> getPerformanceMode() {
        return this.performanceMode;
    }
    @OutputExport(name="provisionedThroughputInMibps", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> provisionedThroughputInMibps;

    public Output</* @Nullable */ Double> getProvisionedThroughputInMibps() {
        return this.provisionedThroughputInMibps;
    }
    @OutputExport(name="throughputMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> throughputMode;

    public Output</* @Nullable */ String> getThroughputMode() {
        return this.throughputMode;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable FileSystemArgs.Builder a);
    }
    private static io.pulumi.awsnative.efs.FileSystemArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.efs.FileSystemArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FileSystem(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileSystem(String name) {
        this(name, FileSystemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileSystem(String name, @Nullable FileSystemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileSystem(String name, @Nullable FileSystemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:efs:FileSystem", name, args == null ? FileSystemArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FileSystem(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:efs:FileSystem", name, null, makeResourceOptions(options, id));
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
    public static FileSystem get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FileSystem(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.file_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.file_v1beta1.InstanceArgs;
import com.pulumi.googlenative.file_v1beta1.outputs.FileShareConfigResponse;
import com.pulumi.googlenative.file_v1beta1.outputs.NetworkConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates an instance. When creating from a backup, the capacity of the new instance needs to be equal to or larger than the capacity of the backup (and also equal to or larger than the minimum capacity of the tier).
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:file/v1beta1:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * The time when the instance was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the instance was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of the instance (2048 characters or less).
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the instance (2048 characters or less).
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * File system shares on the instance. For this version, only a single file share is supported.
     * 
     */
    @Export(name="fileShares", type=List.class, parameters={FileShareConfigResponse.class})
    private Output<List<FileShareConfigResponse>> fileShares;

    /**
     * @return File system shares on the instance. For this version, only a single file share is supported.
     * 
     */
    public Output<List<FileShareConfigResponse>> fileShares() {
        return this.fileShares;
    }
    /**
     * KMS key name used for data encryption.
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output<String> kmsKeyName;

    /**
     * @return KMS key name used for data encryption.
     * 
     */
    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The resource name of the instance, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the instance, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * VPC networks to which the instance is connected. For this version, only a single network is supported.
     * 
     */
    @Export(name="networks", type=List.class, parameters={NetworkConfigResponse.class})
    private Output<List<NetworkConfigResponse>> networks;

    /**
     * @return VPC networks to which the instance is connected. For this version, only a single network is supported.
     * 
     */
    public Output<List<NetworkConfigResponse>> networks() {
        return this.networks;
    }
    /**
     * Reserved for future use.
     * 
     */
    @Export(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * The instance state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The instance state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Additional information about the instance state, if available.
     * 
     */
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return Additional information about the instance state, if available.
     * 
     */
    public Output<String> statusMessage() {
        return this.statusMessage;
    }
    /**
     * Field indicates all the reasons the instance is in &#34;SUSPENDED&#34; state.
     * 
     */
    @Export(name="suspensionReasons", type=List.class, parameters={String.class})
    private Output<List<String>> suspensionReasons;

    /**
     * @return Field indicates all the reasons the instance is in &#34;SUSPENDED&#34; state.
     * 
     */
    public Output<List<String>> suspensionReasons() {
        return this.suspensionReasons;
    }
    /**
     * The service tier of the instance.
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return The service tier of the instance.
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:file/v1beta1:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:file/v1beta1:Instance", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Instance get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.IPAMArgs;
import io.pulumi.awsnative.ec2.outputs.IPAMIpamOperatingRegion;
import io.pulumi.awsnative.ec2.outputs.IPAMTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Schema of AWS::EC2::IPAM Type
 * 
 */
@ResourceType(type="aws-native:ec2:IPAM")
public class IPAM extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the IPAM.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IPAM.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Id of the IPAM.
     * 
     */
    @OutputExport(name="ipamId", type=String.class, parameters={})
    private Output<String> ipamId;

    /**
     * @return Id of the IPAM.
     * 
     */
    public Output<String> getIpamId() {
        return this.ipamId;
    }
    /**
     * The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
     * 
     */
    @OutputExport(name="operatingRegions", type=List.class, parameters={IPAMIpamOperatingRegion.class})
    private Output</* @Nullable */ List<IPAMIpamOperatingRegion>> operatingRegions;

    /**
     * @return The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
     * 
     */
    public Output</* @Nullable */ List<IPAMIpamOperatingRegion>> getOperatingRegions() {
        return this.operatingRegions;
    }
    /**
     * The Id of the default scope for publicly routable IP space, created with this IPAM.
     * 
     */
    @OutputExport(name="privateDefaultScopeId", type=String.class, parameters={})
    private Output<String> privateDefaultScopeId;

    /**
     * @return The Id of the default scope for publicly routable IP space, created with this IPAM.
     * 
     */
    public Output<String> getPrivateDefaultScopeId() {
        return this.privateDefaultScopeId;
    }
    /**
     * The Id of the default scope for publicly routable IP space, created with this IPAM.
     * 
     */
    @OutputExport(name="publicDefaultScopeId", type=String.class, parameters={})
    private Output<String> publicDefaultScopeId;

    /**
     * @return The Id of the default scope for publicly routable IP space, created with this IPAM.
     * 
     */
    public Output<String> getPublicDefaultScopeId() {
        return this.publicDefaultScopeId;
    }
    /**
     * The number of scopes that currently exist in this IPAM.
     * 
     */
    @OutputExport(name="scopeCount", type=Integer.class, parameters={})
    private Output<Integer> scopeCount;

    /**
     * @return The number of scopes that currently exist in this IPAM.
     * 
     */
    public Output<Integer> getScopeCount() {
        return this.scopeCount;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={IPAMTag.class})
    private Output</* @Nullable */ List<IPAMTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<IPAMTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable IPAMArgs.Builder a);
    }
    private static io.pulumi.awsnative.ec2.IPAMArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ec2.IPAMArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IPAM(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IPAM(String name) {
        this(name, IPAMArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IPAM(String name, @Nullable IPAMArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IPAM(String name, @Nullable IPAMArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:IPAM", name, args == null ? IPAMArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IPAM(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:IPAM", name, null, makeResourceOptions(options, id));
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
    public static IPAM get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IPAM(name, id, options);
    }
}

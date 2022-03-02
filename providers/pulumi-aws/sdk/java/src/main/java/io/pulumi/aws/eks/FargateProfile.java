// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.eks.FargateProfileArgs;
import io.pulumi.aws.eks.inputs.FargateProfileState;
import io.pulumi.aws.eks.outputs.FargateProfileSelector;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an EKS Fargate Profile.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EKS Fargate Profiles can be imported using the `cluster_name` and `fargate_profile_name` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:eks/fargateProfile:FargateProfile my_fargate_profile my_cluster:my_fargate_profile
 * ```
 * 
 */
@ResourceType(type="aws:eks/fargateProfile:FargateProfile")
public class FargateProfile extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the EKS Fargate Profile.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the EKS Fargate Profile.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    public Output<String> getClusterName() {
        return this.clusterName;
    }
    /**
     * Name of the EKS Fargate Profile.
     * 
     */
    @OutputExport(name="fargateProfileName", type=String.class, parameters={})
    private Output<String> fargateProfileName;

    /**
     * @return Name of the EKS Fargate Profile.
     * 
     */
    public Output<String> getFargateProfileName() {
        return this.fargateProfileName;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
     * 
     */
    @OutputExport(name="podExecutionRoleArn", type=String.class, parameters={})
    private Output<String> podExecutionRoleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
     * 
     */
    public Output<String> getPodExecutionRoleArn() {
        return this.podExecutionRoleArn;
    }
    /**
     * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
     * 
     */
    @OutputExport(name="selectors", type=List.class, parameters={FargateProfileSelector.class})
    private Output<List<FargateProfileSelector>> selectors;

    /**
     * @return Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
     * 
     */
    public Output<List<FargateProfileSelector>> getSelectors() {
        return this.selectors;
    }
    /**
     * Status of the EKS Fargate Profile.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the EKS Fargate Profile.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     */
    @OutputExport(name="subnetIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> subnetIds;

    /**
     * @return Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     */
    public Output</* @Nullable */ List<String>> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(FargateProfileArgs.Builder a);
    }
    private static io.pulumi.aws.eks.FargateProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.eks.FargateProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FargateProfile(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FargateProfile(String name) {
        this(name, FargateProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FargateProfile(String name, FargateProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FargateProfile(String name, FargateProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/fargateProfile:FargateProfile", name, args == null ? FargateProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FargateProfile(String name, Input<String> id, @Nullable FargateProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/fargateProfile:FargateProfile", name, state, makeResourceOptions(options, id));
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
    public static FargateProfile get(String name, Input<String> id, @Nullable FargateProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FargateProfile(name, id, state, options);
    }
}

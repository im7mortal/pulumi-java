// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecr.LifecyclePolicyArgs;
import io.pulumi.aws.ecr.inputs.LifecyclePolicyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an ECR repository lifecycle policy.
 * 
 * > **NOTE:** Only one `aws.ecr.LifecyclePolicy` resource can be used with the same ECR repository. To apply multiple rules, they must be combined in the `policy` JSON.
 * 
 * > **NOTE:** The AWS ECR API seems to reorder rules based on `rulePriority`. If you define multiple rules that are not sorted in ascending `rulePriority` order in the this provider code, the resource will be flagged for recreation every deployment.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ECR Lifecycle Policy can be imported using the name of the repository, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecr/lifecyclePolicy:LifecyclePolicy example tf-example
 * ```
 * 
 */
@ResourceType(type="aws:ecr/lifecyclePolicy:LifecyclePolicy")
public class LifecyclePolicy extends io.pulumi.resources.CustomResource {
    /**
     * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
     * 
     */
    @OutputExport(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * The registry ID where the repository was created.
     * 
     */
    @OutputExport(name="registryId", type=String.class, parameters={})
    private Output<String> registryId;

    /**
     * @return The registry ID where the repository was created.
     * 
     */
    public Output<String> getRegistryId() {
        return this.registryId;
    }
    /**
     * Name of the repository to apply the policy.
     * 
     */
    @OutputExport(name="repository", type=String.class, parameters={})
    private Output<String> repository;

    /**
     * @return Name of the repository to apply the policy.
     * 
     */
    public Output<String> getRepository() {
        return this.repository;
    }

    public interface BuilderApplicator {
        public void apply(LifecyclePolicyArgs.Builder a);
    }
    private static io.pulumi.aws.ecr.LifecyclePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ecr.LifecyclePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LifecyclePolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LifecyclePolicy(String name) {
        this(name, LifecyclePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LifecyclePolicy(String name, LifecyclePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LifecyclePolicy(String name, LifecyclePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/lifecyclePolicy:LifecyclePolicy", name, args == null ? LifecyclePolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LifecyclePolicy(String name, Input<String> id, @Nullable LifecyclePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/lifecyclePolicy:LifecyclePolicy", name, state, makeResourceOptions(options, id));
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
    public static LifecyclePolicy get(String name, Input<String> id, @Nullable LifecyclePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LifecyclePolicy(name, id, state, options);
    }
}

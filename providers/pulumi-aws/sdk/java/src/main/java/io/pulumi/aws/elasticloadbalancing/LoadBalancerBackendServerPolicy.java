// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticloadbalancing.LoadBalancerBackendServerPolicyArgs;
import io.pulumi.aws.elasticloadbalancing.inputs.LoadBalancerBackendServerPolicyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Attaches a load balancer policy to an ELB backend server.
 * 
 * ## Example Usage
 * 
 * @Deprecated
 * aws.elasticloadbalancing.LoadBalancerBackendServerPolicy has been deprecated in favor of aws.elb.LoadBalancerBackendServerPolicy
 * 
 */
@Deprecated /* aws.elasticloadbalancing.LoadBalancerBackendServerPolicy has been deprecated in favor of aws.elb.LoadBalancerBackendServerPolicy */
@ResourceType(type="aws:elasticloadbalancing/loadBalancerBackendServerPolicy:LoadBalancerBackendServerPolicy")
public class LoadBalancerBackendServerPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The instance port to apply the policy to.
     * 
     */
    @OutputExport(name="instancePort", type=Integer.class, parameters={})
    private Output<Integer> instancePort;

    /**
     * @return The instance port to apply the policy to.
     * 
     */
    public Output<Integer> getInstancePort() {
        return this.instancePort;
    }
    /**
     * The load balancer to attach the policy to.
     * 
     */
    @OutputExport(name="loadBalancerName", type=String.class, parameters={})
    private Output<String> loadBalancerName;

    /**
     * @return The load balancer to attach the policy to.
     * 
     */
    public Output<String> getLoadBalancerName() {
        return this.loadBalancerName;
    }
    /**
     * List of Policy Names to apply to the backend server.
     * 
     */
    @OutputExport(name="policyNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> policyNames;

    /**
     * @return List of Policy Names to apply to the backend server.
     * 
     */
    public Output</* @Nullable */ List<String>> getPolicyNames() {
        return this.policyNames;
    }

    public interface BuilderApplicator {
        public void apply(LoadBalancerBackendServerPolicyArgs.Builder a);
    }
    private static io.pulumi.aws.elasticloadbalancing.LoadBalancerBackendServerPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.elasticloadbalancing.LoadBalancerBackendServerPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LoadBalancerBackendServerPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerBackendServerPolicy(String name) {
        this(name, LoadBalancerBackendServerPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerBackendServerPolicy(String name, LoadBalancerBackendServerPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerBackendServerPolicy(String name, LoadBalancerBackendServerPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticloadbalancing/loadBalancerBackendServerPolicy:LoadBalancerBackendServerPolicy", name, args == null ? LoadBalancerBackendServerPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LoadBalancerBackendServerPolicy(String name, Input<String> id, @Nullable LoadBalancerBackendServerPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticloadbalancing/loadBalancerBackendServerPolicy:LoadBalancerBackendServerPolicy", name, state, makeResourceOptions(options, id));
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
    public static LoadBalancerBackendServerPolicy get(String name, Input<String> id, @Nullable LoadBalancerBackendServerPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerBackendServerPolicy(name, id, state, options);
    }
}

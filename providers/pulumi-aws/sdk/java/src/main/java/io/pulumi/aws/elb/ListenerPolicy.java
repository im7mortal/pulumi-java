// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elb.ListenerPolicyArgs;
import io.pulumi.aws.elb.inputs.ListenerPolicyState;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Attaches a load balancer policy to an ELB Listener.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:elb/listenerPolicy:ListenerPolicy")
public class ListenerPolicy extends io.pulumi.resources.CustomResource {
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
     * The load balancer listener port to apply the policy to.
     * 
     */
    @OutputExport(name="loadBalancerPort", type=Integer.class, parameters={})
    private Output<Integer> loadBalancerPort;

    /**
     * @return The load balancer listener port to apply the policy to.
     * 
     */
    public Output<Integer> getLoadBalancerPort() {
        return this.loadBalancerPort;
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
        public void apply(ListenerPolicyArgs.Builder a);
    }
    private static io.pulumi.aws.elb.ListenerPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.elb.ListenerPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ListenerPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ListenerPolicy(String name) {
        this(name, ListenerPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ListenerPolicy(String name, ListenerPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListenerPolicy(String name, ListenerPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/listenerPolicy:ListenerPolicy", name, args == null ? ListenerPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ListenerPolicy(String name, Input<String> id, @Nullable ListenerPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/listenerPolicy:ListenerPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("aws:elasticloadbalancing/listenerPolicy:ListenerPolicy").build())
            ))
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
    public static ListenerPolicy get(String name, Input<String> id, @Nullable ListenerPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ListenerPolicy(name, id, state, options);
    }
}

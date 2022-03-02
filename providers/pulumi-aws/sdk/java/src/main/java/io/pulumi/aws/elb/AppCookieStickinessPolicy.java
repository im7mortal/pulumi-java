// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elb.AppCookieStickinessPolicyArgs;
import io.pulumi.aws.elb.inputs.AppCookieStickinessPolicyState;
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
 * Provides an application cookie stickiness policy, which allows an ELB to wed its sticky cookie's expiration to a cookie generated by your application.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Application cookie stickiness policies can be imported using the ELB name, port, and policy name separated by colons (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elb/appCookieStickinessPolicy:AppCookieStickinessPolicy example my-elb:80:my-policy
 * ```
 * 
 */
@ResourceType(type="aws:elb/appCookieStickinessPolicy:AppCookieStickinessPolicy")
public class AppCookieStickinessPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The application cookie whose lifetime the ELB's cookie should follow.
     * 
     */
    @OutputExport(name="cookieName", type=String.class, parameters={})
    private Output<String> cookieName;

    /**
     * @return The application cookie whose lifetime the ELB's cookie should follow.
     * 
     */
    public Output<String> getCookieName() {
        return this.cookieName;
    }
    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @OutputExport(name="lbPort", type=Integer.class, parameters={})
    private Output<Integer> lbPort;

    /**
     * @return The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    public Output<Integer> getLbPort() {
        return this.lbPort;
    }
    /**
     * The name of load balancer to which the policy
     * should be attached.
     * 
     */
    @OutputExport(name="loadBalancer", type=String.class, parameters={})
    private Output<String> loadBalancer;

    /**
     * @return The name of load balancer to which the policy
     * should be attached.
     * 
     */
    public Output<String> getLoadBalancer() {
        return this.loadBalancer;
    }
    /**
     * The name of the stickiness policy.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the stickiness policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(AppCookieStickinessPolicyArgs.Builder a);
    }
    private static io.pulumi.aws.elb.AppCookieStickinessPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.elb.AppCookieStickinessPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AppCookieStickinessPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppCookieStickinessPolicy(String name) {
        this(name, AppCookieStickinessPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppCookieStickinessPolicy(String name, AppCookieStickinessPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppCookieStickinessPolicy(String name, AppCookieStickinessPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/appCookieStickinessPolicy:AppCookieStickinessPolicy", name, args == null ? AppCookieStickinessPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AppCookieStickinessPolicy(String name, Input<String> id, @Nullable AppCookieStickinessPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/appCookieStickinessPolicy:AppCookieStickinessPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("aws:elasticloadbalancing/appCookieStickinessPolicy:AppCookieStickinessPolicy").build())
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
    public static AppCookieStickinessPolicy get(String name, Input<String> id, @Nullable AppCookieStickinessPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AppCookieStickinessPolicy(name, id, state, options);
    }
}

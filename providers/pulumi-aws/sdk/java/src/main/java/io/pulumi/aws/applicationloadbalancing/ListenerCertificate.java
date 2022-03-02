// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.applicationloadbalancing.ListenerCertificateArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerCertificateState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Load Balancer Listener Certificate resource.
 * 
 * This resource is for additional certificates and does not replace the default certificate on the listener.
 * 
 * > **Note:** `aws.alb.ListenerCertificate` is known as `aws.lb.ListenerCertificate`. The functionality is identical.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Listener Certificates can be imported using their id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:applicationloadbalancing/listenerCertificate:ListenerCertificate example arn:aws:elasticloadbalancing:us-west-2:123456789012:listener/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b_arn:aws:iam::123456789012:server-certificate/tf-acc-test-6453083910015726063
 * ```
 * 
 * @Deprecated
 * aws.applicationloadbalancing.ListenerCertificate has been deprecated in favor of aws.alb.ListenerCertificate
 * 
 */
@Deprecated /* aws.applicationloadbalancing.ListenerCertificate has been deprecated in favor of aws.alb.ListenerCertificate */
@ResourceType(type="aws:applicationloadbalancing/listenerCertificate:ListenerCertificate")
public class ListenerCertificate extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the certificate to attach to the listener.
     * 
     */
    @OutputExport(name="certificateArn", type=String.class, parameters={})
    private Output<String> certificateArn;

    /**
     * @return The ARN of the certificate to attach to the listener.
     * 
     */
    public Output<String> getCertificateArn() {
        return this.certificateArn;
    }
    /**
     * The ARN of the listener to which to attach the certificate.
     * 
     */
    @OutputExport(name="listenerArn", type=String.class, parameters={})
    private Output<String> listenerArn;

    /**
     * @return The ARN of the listener to which to attach the certificate.
     * 
     */
    public Output<String> getListenerArn() {
        return this.listenerArn;
    }

    public interface BuilderApplicator {
        public void apply(ListenerCertificateArgs.Builder a);
    }
    private static io.pulumi.aws.applicationloadbalancing.ListenerCertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.applicationloadbalancing.ListenerCertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ListenerCertificate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ListenerCertificate(String name) {
        this(name, ListenerCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ListenerCertificate(String name, ListenerCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListenerCertificate(String name, ListenerCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:applicationloadbalancing/listenerCertificate:ListenerCertificate", name, args == null ? ListenerCertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ListenerCertificate(String name, Input<String> id, @Nullable ListenerCertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:applicationloadbalancing/listenerCertificate:ListenerCertificate", name, state, makeResourceOptions(options, id));
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
    public static ListenerCertificate get(String name, Input<String> id, @Nullable ListenerCertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ListenerCertificate(name, id, state, options);
    }
}

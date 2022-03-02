// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.elasticloadbalancingv2.ListenerArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerAction;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerCertificate;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ElasticLoadBalancingV2::Listener
 * 
 */
@ResourceType(type="aws-native:elasticloadbalancingv2:Listener")
public class Listener extends io.pulumi.resources.CustomResource {
    @OutputExport(name="alpnPolicy", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> alpnPolicy;

    public Output</* @Nullable */ List<String>> getAlpnPolicy() {
        return this.alpnPolicy;
    }
    @OutputExport(name="certificates", type=List.class, parameters={ListenerCertificate.class})
    private Output</* @Nullable */ List<ListenerCertificate>> certificates;

    public Output</* @Nullable */ List<ListenerCertificate>> getCertificates() {
        return this.certificates;
    }
    @OutputExport(name="defaultActions", type=List.class, parameters={ListenerAction.class})
    private Output<List<ListenerAction>> defaultActions;

    public Output<List<ListenerAction>> getDefaultActions() {
        return this.defaultActions;
    }
    @OutputExport(name="listenerArn", type=String.class, parameters={})
    private Output<String> listenerArn;

    public Output<String> getListenerArn() {
        return this.listenerArn;
    }
    @OutputExport(name="loadBalancerArn", type=String.class, parameters={})
    private Output<String> loadBalancerArn;

    public Output<String> getLoadBalancerArn() {
        return this.loadBalancerArn;
    }
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    @OutputExport(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    public Output</* @Nullable */ String> getProtocol() {
        return this.protocol;
    }
    @OutputExport(name="sslPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslPolicy;

    public Output</* @Nullable */ String> getSslPolicy() {
        return this.sslPolicy;
    }

    public interface BuilderApplicator {
        public void apply(ListenerArgs.Builder a);
    }
    private static io.pulumi.awsnative.elasticloadbalancingv2.ListenerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.elasticloadbalancingv2.ListenerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Listener(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:elasticloadbalancingv2:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Listener(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:elasticloadbalancingv2:Listener", name, null, makeResourceOptions(options, id));
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
    public static Listener get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, options);
    }
}

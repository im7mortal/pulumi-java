// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssm.ActivationArgs;
import io.pulumi.aws.ssm.inputs.ActivationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Registers an on-premises server or virtual machine with Amazon EC2 so that it can be managed using Run Command.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AWS SSM Activation can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssm/activation:Activation example e488f2f6-e686-4afb-8a04-ef6dfEXAMPLE
 * ```
 * 
 */
@ResourceType(type="aws:ssm/activation:Activation")
public class Activation extends io.pulumi.resources.CustomResource {
    /**
     * The code the system generates when it processes the activation.
     * 
     */
    @OutputExport(name="activationCode", type=String.class, parameters={})
    private Output<String> activationCode;

    /**
     * @return The code the system generates when it processes the activation.
     * 
     */
    public Output<String> getActivationCode() {
        return this.activationCode;
    }
    /**
     * The description of the resource that you want to register.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the resource that you want to register.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @OutputExport(name="expirationDate", type=String.class, parameters={})
    private Output<String> expirationDate;

    /**
     * @return UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Output<String> getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * If the current activation has expired.
     * 
     */
    @OutputExport(name="expired", type=Boolean.class, parameters={})
    private Output<Boolean> expired;

    /**
     * @return If the current activation has expired.
     * 
     */
    public Output<Boolean> getExpired() {
        return this.expired;
    }
    /**
     * The IAM Role to attach to the managed instance.
     * 
     */
    @OutputExport(name="iamRole", type=String.class, parameters={})
    private Output<String> iamRole;

    /**
     * @return The IAM Role to attach to the managed instance.
     * 
     */
    public Output<String> getIamRole() {
        return this.iamRole;
    }
    /**
     * The default name of the registered managed instance.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The default name of the registered managed instance.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The number of managed instances that are currently registered using this activation.
     * 
     */
    @OutputExport(name="registrationCount", type=Integer.class, parameters={})
    private Output<Integer> registrationCount;

    /**
     * @return The number of managed instances that are currently registered using this activation.
     * 
     */
    public Output<Integer> getRegistrationCount() {
        return this.registrationCount;
    }
    /**
     * The maximum number of managed instances you want to register. The default value is 1 instance.
     * 
     */
    @OutputExport(name="registrationLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> registrationLimit;

    /**
     * @return The maximum number of managed instances you want to register. The default value is 1 instance.
     * 
     */
    public Output</* @Nullable */ Integer> getRegistrationLimit() {
        return this.registrationLimit;
    }
    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(ActivationArgs.Builder a);
    }
    private static io.pulumi.aws.ssm.ActivationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ssm.ActivationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Activation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Activation(String name) {
        this(name, ActivationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Activation(String name, ActivationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Activation(String name, ActivationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/activation:Activation", name, args == null ? ActivationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Activation(String name, Input<String> id, @Nullable ActivationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/activation:Activation", name, state, makeResourceOptions(options, id));
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
    public static Activation get(String name, Input<String> id, @Nullable ActivationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Activation(name, id, state, options);
    }
}

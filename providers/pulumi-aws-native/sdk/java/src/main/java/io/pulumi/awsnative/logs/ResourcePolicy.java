// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.logs.ResourcePolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The resource schema for AWSLogs ResourcePolicy
 * 
 */
@ResourceType(type="aws-native:logs:ResourcePolicy")
public class ResourcePolicy extends io.pulumi.resources.CustomResource {
    /**
     * The policy document
     * 
     */
    @OutputExport(name="policyDocument", type=String.class, parameters={})
    private Output<String> policyDocument;

    /**
     * @return The policy document
     * 
     */
    public Output<String> getPolicyDocument() {
        return this.policyDocument;
    }
    /**
     * A name for resource policy
     * 
     */
    @OutputExport(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    /**
     * @return A name for resource policy
     * 
     */
    public Output<String> getPolicyName() {
        return this.policyName;
    }

    public interface BuilderApplicator {
        public void apply(ResourcePolicyArgs.Builder a);
    }
    private static io.pulumi.awsnative.logs.ResourcePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.logs.ResourcePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResourcePolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePolicy(String name) {
        this(name, ResourcePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:logs:ResourcePolicy", name, args == null ? ResourcePolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourcePolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:logs:ResourcePolicy", name, null, makeResourceOptions(options, id));
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
    public static ResourcePolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicy(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.BackendServiceIamPolicyArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/backendServiceIamPolicy:BackendServiceIamPolicy")
public class BackendServiceIamPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public interface BuilderApplicator {
        public void apply(BackendServiceIamPolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.BackendServiceIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.BackendServiceIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BackendServiceIamPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackendServiceIamPolicy(String name) {
        this(name, BackendServiceIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackendServiceIamPolicy(String name, BackendServiceIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackendServiceIamPolicy(String name, BackendServiceIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendServiceIamPolicy:BackendServiceIamPolicy", name, args == null ? BackendServiceIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackendServiceIamPolicy(String name, Input<String> id, @Nullable BackendServiceIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendServiceIamPolicy:BackendServiceIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static BackendServiceIamPolicy get(String name, Input<String> id, @Nullable BackendServiceIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackendServiceIamPolicy(name, id, state, options);
    }
}

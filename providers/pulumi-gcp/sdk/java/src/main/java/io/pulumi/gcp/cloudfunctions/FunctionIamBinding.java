// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs;
import io.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingState;
import io.pulumi.gcp.cloudfunctions.outputs.FunctionIamBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:cloudfunctions/functionIamBinding:FunctionIamBinding")
public class FunctionIamBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="cloudFunction", type=String.class, parameters={})
    private Output<String> cloudFunction;

    public Output<String> getCloudFunction() {
        return this.cloudFunction;
    }
    @OutputExport(name="condition", type=FunctionIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ FunctionIamBindingCondition> condition;

    public Output</* @Nullable */ FunctionIamBindingCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FunctionIamBinding(String name, FunctionIamBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudfunctions/functionIamBinding:FunctionIamBinding", name, args == null ? FunctionIamBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FunctionIamBinding(String name, Input<String> id, @Nullable FunctionIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudfunctions/functionIamBinding:FunctionIamBinding", name, state, makeResourceOptions(options, id));
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
    public static FunctionIamBinding get(String name, Input<String> id, @Nullable FunctionIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FunctionIamBinding(name, id, state, options);
    }
}
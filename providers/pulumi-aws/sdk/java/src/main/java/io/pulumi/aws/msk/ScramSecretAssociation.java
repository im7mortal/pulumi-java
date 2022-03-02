// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.msk.ScramSecretAssociationArgs;
import io.pulumi.aws.msk.inputs.ScramSecretAssociationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * MSK SCRAM Secret Associations can be imported using the `id` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:msk/scramSecretAssociation:ScramSecretAssociation example arn:aws:kafka:us-west-2:123456789012:cluster/example/279c0212-d057-4dba-9aa9-1c4e5a25bfc7-3
 * ```
 * 
 */
@ResourceType(type="aws:msk/scramSecretAssociation:ScramSecretAssociation")
public class ScramSecretAssociation extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the MSK cluster.
     * 
     */
    @OutputExport(name="clusterArn", type=String.class, parameters={})
    private Output<String> clusterArn;

    /**
     * @return Amazon Resource Name (ARN) of the MSK cluster.
     * 
     */
    public Output<String> getClusterArn() {
        return this.clusterArn;
    }
    /**
     * List of AWS Secrets Manager secret ARNs.
     * 
     */
    @OutputExport(name="secretArnLists", type=List.class, parameters={String.class})
    private Output<List<String>> secretArnLists;

    /**
     * @return List of AWS Secrets Manager secret ARNs.
     * 
     */
    public Output<List<String>> getSecretArnLists() {
        return this.secretArnLists;
    }

    public interface BuilderApplicator {
        public void apply(ScramSecretAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.msk.ScramSecretAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.msk.ScramSecretAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ScramSecretAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScramSecretAssociation(String name) {
        this(name, ScramSecretAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScramSecretAssociation(String name, ScramSecretAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScramSecretAssociation(String name, ScramSecretAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/scramSecretAssociation:ScramSecretAssociation", name, args == null ? ScramSecretAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ScramSecretAssociation(String name, Input<String> id, @Nullable ScramSecretAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/scramSecretAssociation:ScramSecretAssociation", name, state, makeResourceOptions(options, id));
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
    public static ScramSecretAssociation get(String name, Input<String> id, @Nullable ScramSecretAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ScramSecretAssociation(name, id, state, options);
    }
}

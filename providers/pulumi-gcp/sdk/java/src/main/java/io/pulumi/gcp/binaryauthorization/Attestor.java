// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.binaryauthorization.AttestorArgs;
import io.pulumi.gcp.binaryauthorization.inputs.AttestorState;
import io.pulumi.gcp.binaryauthorization.outputs.AttestorAttestationAuthorityNote;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An attestor that attests to container image artifacts.
 * 
 * To get more information about Attestor, see:
 * 
 * * [API documentation](https://cloud.google.com/binary-authorization/docs/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/binary-authorization/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Attestor can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/attestor:Attestor default projects/{{project}}/attestors/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/attestor:Attestor default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/attestor:Attestor default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:binaryauthorization/attestor:Attestor")
public class Attestor extends io.pulumi.resources.CustomResource {
    /**
     * A Container Analysis ATTESTATION_AUTHORITY Note, created by the user.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="attestationAuthorityNote", type=AttestorAttestationAuthorityNote.class, parameters={})
    private Output<AttestorAttestationAuthorityNote> attestationAuthorityNote;

    /**
     * @return A Container Analysis ATTESTATION_AUTHORITY Note, created by the user.
     * Structure is documented below.
     * 
     */
    public Output<AttestorAttestationAuthorityNote> getAttestationAuthorityNote() {
        return this.attestationAuthorityNote;
    }
    /**
     * A descriptive comment. This field may be updated. The field may be
     * displayed in chooser dialogs.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A descriptive comment. This field may be updated. The field may be
     * displayed in chooser dialogs.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    public interface BuilderApplicator {
        public void apply(AttestorArgs.Builder a);
    }
    private static io.pulumi.gcp.binaryauthorization.AttestorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.binaryauthorization.AttestorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Attestor(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Attestor(String name) {
        this(name, AttestorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Attestor(String name, AttestorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Attestor(String name, AttestorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:binaryauthorization/attestor:Attestor", name, args == null ? AttestorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Attestor(String name, Input<String> id, @Nullable AttestorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:binaryauthorization/attestor:Attestor", name, state, makeResourceOptions(options, id));
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
    public static Attestor get(String name, Input<String> id, @Nullable AttestorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Attestor(name, id, state, options);
    }
}

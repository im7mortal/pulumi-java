// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appstream.DirectoryConfigArgs;
import io.pulumi.aws.appstream.inputs.DirectoryConfigState;
import io.pulumi.aws.appstream.outputs.DirectoryConfigServiceAccountCredentials;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an AppStream Directory Config.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_appstream_directory_config` can be imported using the id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appstream/directoryConfig:DirectoryConfig example directoryNameExample
 * ```
 * 
 */
@ResourceType(type="aws:appstream/directoryConfig:DirectoryConfig")
public class DirectoryConfig extends io.pulumi.resources.CustomResource {
    /**
     * Date and time, in UTC and extended RFC 3339 format, when the directory config was created.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Date and time, in UTC and extended RFC 3339 format, when the directory config was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Fully qualified name of the directory.
     * 
     */
    @OutputExport(name="directoryName", type=String.class, parameters={})
    private Output<String> directoryName;

    /**
     * @return Fully qualified name of the directory.
     * 
     */
    public Output<String> getDirectoryName() {
        return this.directoryName;
    }
    /**
     * Distinguished names of the organizational units for computer accounts.
     * 
     */
    @OutputExport(name="organizationalUnitDistinguishedNames", type=List.class, parameters={String.class})
    private Output<List<String>> organizationalUnitDistinguishedNames;

    /**
     * @return Distinguished names of the organizational units for computer accounts.
     * 
     */
    public Output<List<String>> getOrganizationalUnitDistinguishedNames() {
        return this.organizationalUnitDistinguishedNames;
    }
    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `service_account_credentials` below.
     * 
     */
    @OutputExport(name="serviceAccountCredentials", type=DirectoryConfigServiceAccountCredentials.class, parameters={})
    private Output<DirectoryConfigServiceAccountCredentials> serviceAccountCredentials;

    /**
     * @return Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `service_account_credentials` below.
     * 
     */
    public Output<DirectoryConfigServiceAccountCredentials> getServiceAccountCredentials() {
        return this.serviceAccountCredentials;
    }

    public interface BuilderApplicator {
        public void apply(DirectoryConfigArgs.Builder a);
    }
    private static io.pulumi.aws.appstream.DirectoryConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appstream.DirectoryConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DirectoryConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DirectoryConfig(String name) {
        this(name, DirectoryConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DirectoryConfig(String name, DirectoryConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DirectoryConfig(String name, DirectoryConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/directoryConfig:DirectoryConfig", name, args == null ? DirectoryConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DirectoryConfig(String name, Input<String> id, @Nullable DirectoryConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appstream/directoryConfig:DirectoryConfig", name, state, makeResourceOptions(options, id));
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
    public static DirectoryConfig get(String name, Input<String> id, @Nullable DirectoryConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DirectoryConfig(name, id, state, options);
    }
}

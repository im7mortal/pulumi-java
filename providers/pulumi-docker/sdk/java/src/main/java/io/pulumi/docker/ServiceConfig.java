// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.docker.ServiceConfigArgs;
import io.pulumi.docker.Utilities;
import io.pulumi.docker.inputs.ServiceConfigState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ### Example Assuming you created a `config` as follows #!/bin/bash printf '{"a":"b"}' | docker config create foo - # prints the id
 * 
 * 08c26c477474478d971139f750984775a7f019dbe8a2e7f09d66a187c009e66d you provide the definition for the resource as follows terraform resource "docker_config" "foo" {
 * 
 *  name = "foo"
 * 
 *  data = base64encode("{\"a\"\"b\"}") } then the import command is as follows #!/bin/bash
 * 
 * ```sh
 *  $ pulumi import docker:index/serviceConfig:ServiceConfig foo 08c26c477474478d971139f750984775a7f019dbe8a2e7f09d66a187c009e66d
 * ```
 * 
 */
@ResourceType(type="docker:index/serviceConfig:ServiceConfig")
public class ServiceConfig extends io.pulumi.resources.CustomResource {
    /**
     * Base64-url-safe-encoded config data
     * 
     */
    @OutputExport(name="data", type=String.class, parameters={})
    private Output<String> data;

    /**
     * @return Base64-url-safe-encoded config data
     * 
     */
    public Output<String> getData() {
        return this.data;
    }
    /**
     * User-defined name of the config
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User-defined name of the config
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(ServiceConfigArgs.Builder a);
    }
    private static io.pulumi.docker.ServiceConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.docker.ServiceConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServiceConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceConfig(String name) {
        this(name, ServiceConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceConfig(String name, ServiceConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceConfig(String name, ServiceConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/serviceConfig:ServiceConfig", name, args == null ? ServiceConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServiceConfig(String name, Input<String> id, @Nullable ServiceConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/serviceConfig:ServiceConfig", name, state, makeResourceOptions(options, id));
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
    public static ServiceConfig get(String name, Input<String> id, @Nullable ServiceConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceConfig(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiregistration.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.apiregistration.k8s.io_v1.APIServiceArgs;
import io.pulumi.kubernetes.apiregistration.k8s.io_v1.outputs.APIServiceSpec;
import io.pulumi.kubernetes.apiregistration.k8s.io_v1.outputs.APIServiceStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * APIService represents a server for a particular GroupVersion. Name must be "version.group".
 * 
 */
@ResourceType(type="kubernetes:apiregistration.k8s.io/v1:APIService")
public class APIService extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Spec contains information for locating and communicating with a server
     * 
     */
    @OutputExport(name="spec", type=APIServiceSpec.class, parameters={})
    private Output</* @Nullable */ APIServiceSpec> spec;

    /**
     * @return Spec contains information for locating and communicating with a server
     * 
     */
    public Output</* @Nullable */ APIServiceSpec> getSpec() {
        return this.spec;
    }
    /**
     * Status contains derived information about an API server
     * 
     */
    @OutputExport(name="status", type=APIServiceStatus.class, parameters={})
    private Output</* @Nullable */ APIServiceStatus> status;

    /**
     * @return Status contains derived information about an API server
     * 
     */
    public Output</* @Nullable */ APIServiceStatus> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable APIServiceArgs.Builder a);
    }
    private static io.pulumi.kubernetes.apiregistration.k8s.io_v1.APIServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.apiregistration.k8s.io_v1.APIServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public APIService(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public APIService(String name) {
        this(name, APIServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public APIService(String name, @Nullable APIServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public APIService(String name, @Nullable APIServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apiregistration.k8s.io/v1:APIService", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private APIService(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apiregistration.k8s.io/v1:APIService", name, null, makeResourceOptions(options, id));
    }

    private static APIServiceArgs makeArgs(@Nullable APIServiceArgs args) {
        var builder = args == null ? APIServiceArgs.builder() : APIServiceArgs.builder(args);
        return builder
            .setApiVersion("apiregistration.k8s.io/v1")
            .setKind("APIService")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:apiregistration.k8s.io/v1beta1:APIService").build()),
                Input.of(Alias.builder().setType("kubernetes:apiregistration/v1beta1:APIService").build()),
                Input.of(Alias.builder().setType("kubernetes:apiregistration/v1:APIService").build())
            ))
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
    public static APIService get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new APIService(name, id, options);
    }
}

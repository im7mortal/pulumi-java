// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.core_v1.SecretArgs;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
 * 
 * Note: While Pulumi automatically encrypts the 'data' and 'stringData'
 * fields, this encryption only applies to Pulumi's context, including the state file,
 * the Service, the CLI, etc. Kubernetes does not encrypt Secret resources by default,
 * and the contents are visible to users with access to the Secret in Kubernetes using
 * tools like 'kubectl'.
 * 
 * For more information on securing Kubernetes Secrets, see the following links:
 * https://kubernetes.io/docs/concepts/configuration/secret/#security-properties
 * https://kubernetes.io/docs/concepts/configuration/secret/#risks
 * 
 */
@ResourceType(type="kubernetes:core/v1:Secret")
public class Secret extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
     * 
     */
    @Export(name="data", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> data;

    /**
     * @return Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
     * 
     */
    public Output</* @Nullable */ Map<String,String>> data() {
        return this.data;
    }
    /**
     * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
     * 
     */
    @Export(name="immutable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> immutable;

    /**
     * @return Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
     * 
     */
    public Output</* @Nullable */ Boolean> immutable() {
        return this.immutable;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> metadata() {
        return this.metadata;
    }
    /**
     * stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
     * 
     */
    @Export(name="stringData", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> stringData;

    /**
     * @return stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> stringData() {
        return this.stringData;
    }
    /**
     * Used to facilitate programmatic handling of secret data. More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Used to facilitate programmatic handling of secret data. More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
     * 
     */
    public Output</* @Nullable */ String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Secret(String name) {
        this(name, SecretArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Secret(String name, @Nullable SecretArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Secret(String name, @Nullable SecretArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:Secret", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private Secret(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:Secret", name, null, makeResourceOptions(options, id));
    }

    private static SecretArgs makeArgs(@Nullable SecretArgs args) {
        var builder = args == null ? SecretArgs.builder() : SecretArgs.builder(args);
        return builder
            .apiVersion("v1")
            .kind("Secret")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "data",
                "stringData"
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
    public static Secret get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Secret(name, id, options);
    }
}

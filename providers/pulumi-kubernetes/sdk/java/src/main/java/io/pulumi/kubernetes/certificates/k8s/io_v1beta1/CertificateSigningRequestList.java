// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.certificates.k8s.io_v1beta1.CertificateSigningRequestListArgs;
import io.pulumi.kubernetes.certificates.k8s.io_v1beta1.outputs.CertificateSigningRequest;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:certificates.k8s.io/v1beta1:CertificateSigningRequestList")
public class CertificateSigningRequestList extends io.pulumi.resources.CustomResource {
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
    @Export(name="items", type=List.class, parameters={CertificateSigningRequest.class})
    private Output<List<CertificateSigningRequest>> items;

    public Output<List<CertificateSigningRequest>> items() {
        return this.items;
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
    @Export(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    public Output</* @Nullable */ ListMeta> metadata() {
        return this.metadata;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateSigningRequestList(String name) {
        this(name, CertificateSigningRequestListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateSigningRequestList(String name, CertificateSigningRequestListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateSigningRequestList(String name, CertificateSigningRequestListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:certificates.k8s.io/v1beta1:CertificateSigningRequestList", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateSigningRequestList(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:certificates.k8s.io/v1beta1:CertificateSigningRequestList", name, null, makeResourceOptions(options, id));
    }

    private static CertificateSigningRequestListArgs makeArgs(CertificateSigningRequestListArgs args) {
        var builder = args == null ? CertificateSigningRequestListArgs.builder() : CertificateSigningRequestListArgs.builder(args);
        return builder
            .apiVersion("certificates.k8s.io/v1beta1")
            .kind("CertificateSigningRequestList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static CertificateSigningRequestList get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CertificateSigningRequestList(name, id, options);
    }
}

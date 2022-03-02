// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.privateca_v1.CertificateTemplateArgs;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateExtensionConstraintsResponse;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateIdentityConstraintsResponse;
import io.pulumi.googlenative.privateca_v1.outputs.X509ParametersResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a new CertificateTemplate in a given Project and Location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:privateca/v1:CertificateTemplate")
public class CertificateTemplate extends io.pulumi.resources.CustomResource {
    /**
     * The time at which this CertificateTemplate was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this CertificateTemplate was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. A human-readable description of scenarios this template is intended for.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A human-readable description of scenarios this template is intended for.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate's identity.
     * 
     */
    @OutputExport(name="identityConstraints", type=CertificateIdentityConstraintsResponse.class, parameters={})
    private Output<CertificateIdentityConstraintsResponse> identityConstraints;

    /**
     * @return Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate's identity.
     * 
     */
    public Output<CertificateIdentityConstraintsResponse> getIdentityConstraints() {
        return this.identityConstraints;
    }
    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name for this CertificateTemplate in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this CertificateTemplate in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool's IssuancePolicy defines baseline_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate's predefined_values.
     * 
     */
    @OutputExport(name="passthroughExtensions", type=CertificateExtensionConstraintsResponse.class, parameters={})
    private Output<CertificateExtensionConstraintsResponse> passthroughExtensions;

    /**
     * @return Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool's IssuancePolicy defines baseline_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate's predefined_values.
     * 
     */
    public Output<CertificateExtensionConstraintsResponse> getPassthroughExtensions() {
        return this.passthroughExtensions;
    }
    /**
     * Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool's IssuancePolicy defines conflicting baseline_values for the same properties, the certificate issuance request will fail.
     * 
     */
    @OutputExport(name="predefinedValues", type=X509ParametersResponse.class, parameters={})
    private Output<X509ParametersResponse> predefinedValues;

    /**
     * @return Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool's IssuancePolicy defines conflicting baseline_values for the same properties, the certificate issuance request will fail.
     * 
     */
    public Output<X509ParametersResponse> getPredefinedValues() {
        return this.predefinedValues;
    }
    /**
     * The time at which this CertificateTemplate was updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time at which this CertificateTemplate was updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(CertificateTemplateArgs.Builder a);
    }
    private static io.pulumi.googlenative.privateca_v1.CertificateTemplateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.privateca_v1.CertificateTemplateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CertificateTemplate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateTemplate(String name) {
        this(name, CertificateTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateTemplate(String name, CertificateTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateTemplate(String name, CertificateTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:CertificateTemplate", name, args == null ? CertificateTemplateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CertificateTemplate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:CertificateTemplate", name, null, makeResourceOptions(options, id));
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
    public static CertificateTemplate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CertificateTemplate(name, id, options);
    }
}

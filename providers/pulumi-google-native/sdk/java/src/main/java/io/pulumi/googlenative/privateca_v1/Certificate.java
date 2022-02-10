// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.privateca_v1.CertificateArgs;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateConfigResponse;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateDescriptionResponse;
import io.pulumi.googlenative.privateca_v1.outputs.RevocationDetailsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:privateca/v1:Certificate")
public class Certificate extends io.pulumi.resources.CustomResource {
    @OutputExport(name="certificateDescription", type=CertificateDescriptionResponse.class, parameters={})
    private Output<CertificateDescriptionResponse> certificateDescription;

    public Output<CertificateDescriptionResponse> getCertificateDescription() {
        return this.certificateDescription;
    }
    @OutputExport(name="certificateTemplate", type=String.class, parameters={})
    private Output<String> certificateTemplate;

    public Output<String> getCertificateTemplate() {
        return this.certificateTemplate;
    }
    @OutputExport(name="config", type=CertificateConfigResponse.class, parameters={})
    private Output<CertificateConfigResponse> config;

    public Output<CertificateConfigResponse> getConfig() {
        return this.config;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="issuerCertificateAuthority", type=String.class, parameters={})
    private Output<String> issuerCertificateAuthority;

    public Output<String> getIssuerCertificateAuthority() {
        return this.issuerCertificateAuthority;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="lifetime", type=String.class, parameters={})
    private Output<String> lifetime;

    public Output<String> getLifetime() {
        return this.lifetime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="pemCertificate", type=String.class, parameters={})
    private Output<String> pemCertificate;

    public Output<String> getPemCertificate() {
        return this.pemCertificate;
    }
    @OutputExport(name="pemCertificateChain", type=List.class, parameters={String.class})
    private Output<List<String>> pemCertificateChain;

    public Output<List<String>> getPemCertificateChain() {
        return this.pemCertificateChain;
    }
    @OutputExport(name="pemCsr", type=String.class, parameters={})
    private Output<String> pemCsr;

    public Output<String> getPemCsr() {
        return this.pemCsr;
    }
    @OutputExport(name="revocationDetails", type=RevocationDetailsResponse.class, parameters={})
    private Output<RevocationDetailsResponse> revocationDetails;

    public Output<RevocationDetailsResponse> getRevocationDetails() {
        return this.revocationDetails;
    }
    @OutputExport(name="subjectMode", type=String.class, parameters={})
    private Output<String> subjectMode;

    public Output<String> getSubjectMode() {
        return this.subjectMode;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public Certificate(String name, CertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Certificate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:Certificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Certificate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, options);
    }
}
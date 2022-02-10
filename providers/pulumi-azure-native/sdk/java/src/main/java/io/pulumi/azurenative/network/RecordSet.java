// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.RecordSetArgs;
import io.pulumi.azurenative.network.outputs.ARecordResponse;
import io.pulumi.azurenative.network.outputs.AaaaRecordResponse;
import io.pulumi.azurenative.network.outputs.CaaRecordResponse;
import io.pulumi.azurenative.network.outputs.CnameRecordResponse;
import io.pulumi.azurenative.network.outputs.MxRecordResponse;
import io.pulumi.azurenative.network.outputs.NsRecordResponse;
import io.pulumi.azurenative.network.outputs.PtrRecordResponse;
import io.pulumi.azurenative.network.outputs.SoaRecordResponse;
import io.pulumi.azurenative.network.outputs.SrvRecordResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.TxtRecordResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:RecordSet")
public class RecordSet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="aRecords", type=List.class, parameters={ARecordResponse.class})
    private Output</* @Nullable */ List<ARecordResponse>> aRecords;

    public Output</* @Nullable */ List<ARecordResponse>> getARecords() {
        return this.aRecords;
    }
    @OutputExport(name="aaaaRecords", type=List.class, parameters={AaaaRecordResponse.class})
    private Output</* @Nullable */ List<AaaaRecordResponse>> aaaaRecords;

    public Output</* @Nullable */ List<AaaaRecordResponse>> getAaaaRecords() {
        return this.aaaaRecords;
    }
    @OutputExport(name="caaRecords", type=List.class, parameters={CaaRecordResponse.class})
    private Output</* @Nullable */ List<CaaRecordResponse>> caaRecords;

    public Output</* @Nullable */ List<CaaRecordResponse>> getCaaRecords() {
        return this.caaRecords;
    }
    @OutputExport(name="cnameRecord", type=CnameRecordResponse.class, parameters={})
    private Output</* @Nullable */ CnameRecordResponse> cnameRecord;

    public Output</* @Nullable */ CnameRecordResponse> getCnameRecord() {
        return this.cnameRecord;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    public Output<String> getFqdn() {
        return this.fqdn;
    }
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="mxRecords", type=List.class, parameters={MxRecordResponse.class})
    private Output</* @Nullable */ List<MxRecordResponse>> mxRecords;

    public Output</* @Nullable */ List<MxRecordResponse>> getMxRecords() {
        return this.mxRecords;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="nsRecords", type=List.class, parameters={NsRecordResponse.class})
    private Output</* @Nullable */ List<NsRecordResponse>> nsRecords;

    public Output</* @Nullable */ List<NsRecordResponse>> getNsRecords() {
        return this.nsRecords;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="ptrRecords", type=List.class, parameters={PtrRecordResponse.class})
    private Output</* @Nullable */ List<PtrRecordResponse>> ptrRecords;

    public Output</* @Nullable */ List<PtrRecordResponse>> getPtrRecords() {
        return this.ptrRecords;
    }
    @OutputExport(name="soaRecord", type=SoaRecordResponse.class, parameters={})
    private Output</* @Nullable */ SoaRecordResponse> soaRecord;

    public Output</* @Nullable */ SoaRecordResponse> getSoaRecord() {
        return this.soaRecord;
    }
    @OutputExport(name="srvRecords", type=List.class, parameters={SrvRecordResponse.class})
    private Output</* @Nullable */ List<SrvRecordResponse>> srvRecords;

    public Output</* @Nullable */ List<SrvRecordResponse>> getSrvRecords() {
        return this.srvRecords;
    }
    @OutputExport(name="targetResource", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> targetResource;

    public Output</* @Nullable */ SubResourceResponse> getTargetResource() {
        return this.targetResource;
    }
    @OutputExport(name="ttl", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> ttl;

    public Output</* @Nullable */ Double> getTtl() {
        return this.ttl;
    }
    @OutputExport(name="txtRecords", type=List.class, parameters={TxtRecordResponse.class})
    private Output</* @Nullable */ List<TxtRecordResponse>> txtRecords;

    public Output</* @Nullable */ List<TxtRecordResponse>> getTxtRecords() {
        return this.txtRecords;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public RecordSet(String name, RecordSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RecordSet", name, args == null ? RecordSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RecordSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RecordSet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20150504preview:RecordSet").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160401:RecordSet").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170901:RecordSet").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171001:RecordSet").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180301preview:RecordSet").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180501:RecordSet").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RecordSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RecordSet(name, id, options);
    }
}
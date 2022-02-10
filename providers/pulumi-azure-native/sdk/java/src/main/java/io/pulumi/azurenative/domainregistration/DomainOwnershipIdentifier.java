// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.domainregistration.DomainOwnershipIdentifierArgs;
import io.pulumi.azurenative.domainregistration.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:domainregistration:DomainOwnershipIdentifier")
public class DomainOwnershipIdentifier extends io.pulumi.resources.CustomResource {
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="ownershipId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownershipId;

    public Output</* @Nullable */ String> getOwnershipId() {
        return this.ownershipId;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DomainOwnershipIdentifier(String name, DomainOwnershipIdentifierArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:domainregistration:DomainOwnershipIdentifier", name, args == null ? DomainOwnershipIdentifierArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainOwnershipIdentifier(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:domainregistration:DomainOwnershipIdentifier", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20150401:DomainOwnershipIdentifier").build()),
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20180201:DomainOwnershipIdentifier").build()),
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20190801:DomainOwnershipIdentifier").build()),
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20200601:DomainOwnershipIdentifier").build()),
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20200901:DomainOwnershipIdentifier").build()),
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20201001:DomainOwnershipIdentifier").build()),
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20201201:DomainOwnershipIdentifier").build()),
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20210101:DomainOwnershipIdentifier").build()),
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20210115:DomainOwnershipIdentifier").build()),
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20210201:DomainOwnershipIdentifier").build()),
                Input.of(Alias.builder().setType("azure-native:domainregistration/v20210301:DomainOwnershipIdentifier").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DomainOwnershipIdentifier get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainOwnershipIdentifier(name, id, options);
    }
}
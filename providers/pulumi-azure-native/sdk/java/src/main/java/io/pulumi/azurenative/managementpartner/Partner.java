// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managementpartner;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.managementpartner.PartnerArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * this is the management partner operations response
 * API Version: 2018-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:managementpartner:Partner 123456 /providers/microsoft.managementpartner/partners/123456 
 * ```
 * 
 */
@ResourceType(type="azure-native:managementpartner:Partner")
public class Partner extends io.pulumi.resources.CustomResource {
    /**
     * This is the DateTime when the partner was created.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdTime;

    /**
     * @return This is the DateTime when the partner was created.
     * 
     */
    public Output</* @Nullable */ String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Type of the partner
     * 
     */
    @OutputExport(name="etag", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> etag;

    /**
     * @return Type of the partner
     * 
     */
    public Output</* @Nullable */ Integer> getEtag() {
        return this.etag;
    }
    /**
     * Name of the partner
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the partner
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * This is the object id.
     * 
     */
    @OutputExport(name="objectId", type=String.class, parameters={})
    private Output</* @Nullable */ String> objectId;

    /**
     * @return This is the object id.
     * 
     */
    public Output</* @Nullable */ String> getObjectId() {
        return this.objectId;
    }
    /**
     * This is the partner id
     * 
     */
    @OutputExport(name="partnerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerId;

    /**
     * @return This is the partner id
     * 
     */
    public Output</* @Nullable */ String> getPartnerId() {
        return this.partnerId;
    }
    /**
     * This is the partner name
     * 
     */
    @OutputExport(name="partnerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerName;

    /**
     * @return This is the partner name
     * 
     */
    public Output</* @Nullable */ String> getPartnerName() {
        return this.partnerName;
    }
    /**
     * This is the tenant id.
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return This is the tenant id.
     * 
     */
    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
    }
    /**
     * Type of resource. "Microsoft.ManagementPartner/partners"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of resource. "Microsoft.ManagementPartner/partners"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * This is the DateTime when the partner was updated.
     * 
     */
    @OutputExport(name="updatedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> updatedTime;

    /**
     * @return This is the DateTime when the partner was updated.
     * 
     */
    public Output</* @Nullable */ String> getUpdatedTime() {
        return this.updatedTime;
    }
    /**
     * This is the version.
     * 
     */
    @OutputExport(name="version", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> version;

    /**
     * @return This is the version.
     * 
     */
    public Output</* @Nullable */ Integer> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable PartnerArgs.Builder a);
    }
    private static io.pulumi.azurenative.managementpartner.PartnerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.managementpartner.PartnerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Partner(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Partner(String name) {
        this(name, PartnerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Partner(String name, @Nullable PartnerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Partner(String name, @Nullable PartnerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managementpartner:Partner", name, args == null ? PartnerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Partner(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managementpartner:Partner", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:managementpartner/v20180201:Partner").build())
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
    public static Partner get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Partner(name, id, options);
    }
}

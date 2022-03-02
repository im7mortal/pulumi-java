// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.BlobContainerArgs;
import io.pulumi.azurenative.storage.outputs.ImmutabilityPolicyPropertiesResponse;
import io.pulumi.azurenative.storage.outputs.LegalHoldPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Properties of the blob container, including Id, resource name, resource type, Etag.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:BlobContainer container6185 /subscriptions/{subscription-id}/resourceGroups/res3376/providers/Microsoft.Storage/storageAccounts/sto328/blobServices/default/containers/container6185 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:BlobContainer")
public class BlobContainer extends io.pulumi.resources.CustomResource {
    /**
     * Default the container to use specified encryption scope for all writes.
     * 
     */
    @OutputExport(name="defaultEncryptionScope", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultEncryptionScope;

    /**
     * @return Default the container to use specified encryption scope for all writes.
     * 
     */
    public Output</* @Nullable */ String> getDefaultEncryptionScope() {
        return this.defaultEncryptionScope;
    }
    /**
     * Indicates whether the blob container was deleted.
     * 
     */
    @OutputExport(name="deleted", type=Boolean.class, parameters={})
    private Output<Boolean> deleted;

    /**
     * @return Indicates whether the blob container was deleted.
     * 
     */
    public Output<Boolean> getDeleted() {
        return this.deleted;
    }
    /**
     * Blob container deletion time.
     * 
     */
    @OutputExport(name="deletedTime", type=String.class, parameters={})
    private Output<String> deletedTime;

    /**
     * @return Blob container deletion time.
     * 
     */
    public Output<String> getDeletedTime() {
        return this.deletedTime;
    }
    /**
     * Block override of encryption scope from the container default.
     * 
     */
    @OutputExport(name="denyEncryptionScopeOverride", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> denyEncryptionScopeOverride;

    /**
     * @return Block override of encryption scope from the container default.
     * 
     */
    public Output</* @Nullable */ Boolean> getDenyEncryptionScopeOverride() {
        return this.denyEncryptionScopeOverride;
    }
    /**
     * Resource Etag.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Resource Etag.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The hasImmutabilityPolicy public property is set to true by SRP if ImmutabilityPolicy has been created for this container. The hasImmutabilityPolicy public property is set to false by SRP if ImmutabilityPolicy has not been created for this container.
     * 
     */
    @OutputExport(name="hasImmutabilityPolicy", type=Boolean.class, parameters={})
    private Output<Boolean> hasImmutabilityPolicy;

    /**
     * @return The hasImmutabilityPolicy public property is set to true by SRP if ImmutabilityPolicy has been created for this container. The hasImmutabilityPolicy public property is set to false by SRP if ImmutabilityPolicy has not been created for this container.
     * 
     */
    public Output<Boolean> getHasImmutabilityPolicy() {
        return this.hasImmutabilityPolicy;
    }
    /**
     * The hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     * 
     */
    @OutputExport(name="hasLegalHold", type=Boolean.class, parameters={})
    private Output<Boolean> hasLegalHold;

    /**
     * @return The hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     * 
     */
    public Output<Boolean> getHasLegalHold() {
        return this.hasLegalHold;
    }
    /**
     * The ImmutabilityPolicy property of the container.
     * 
     */
    @OutputExport(name="immutabilityPolicy", type=ImmutabilityPolicyPropertiesResponse.class, parameters={})
    private Output<ImmutabilityPolicyPropertiesResponse> immutabilityPolicy;

    /**
     * @return The ImmutabilityPolicy property of the container.
     * 
     */
    public Output<ImmutabilityPolicyPropertiesResponse> getImmutabilityPolicy() {
        return this.immutabilityPolicy;
    }
    /**
     * Returns the date and time the container was last modified.
     * 
     */
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return Returns the date and time the container was last modified.
     * 
     */
    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Specifies whether the lease on a container is of infinite or fixed duration, only when the container is leased.
     * 
     */
    @OutputExport(name="leaseDuration", type=String.class, parameters={})
    private Output<String> leaseDuration;

    /**
     * @return Specifies whether the lease on a container is of infinite or fixed duration, only when the container is leased.
     * 
     */
    public Output<String> getLeaseDuration() {
        return this.leaseDuration;
    }
    /**
     * Lease state of the container.
     * 
     */
    @OutputExport(name="leaseState", type=String.class, parameters={})
    private Output<String> leaseState;

    /**
     * @return Lease state of the container.
     * 
     */
    public Output<String> getLeaseState() {
        return this.leaseState;
    }
    /**
     * The lease status of the container.
     * 
     */
    @OutputExport(name="leaseStatus", type=String.class, parameters={})
    private Output<String> leaseStatus;

    /**
     * @return The lease status of the container.
     * 
     */
    public Output<String> getLeaseStatus() {
        return this.leaseStatus;
    }
    /**
     * The LegalHold property of the container.
     * 
     */
    @OutputExport(name="legalHold", type=LegalHoldPropertiesResponse.class, parameters={})
    private Output<LegalHoldPropertiesResponse> legalHold;

    /**
     * @return The LegalHold property of the container.
     * 
     */
    public Output<LegalHoldPropertiesResponse> getLegalHold() {
        return this.legalHold;
    }
    /**
     * A name-value pair to associate with the container as metadata.
     * 
     */
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return A name-value pair to associate with the container as metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies whether data in the container may be accessed publicly and the level of access.
     * 
     */
    @OutputExport(name="publicAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicAccess;

    /**
     * @return Specifies whether data in the container may be accessed publicly and the level of access.
     * 
     */
    public Output</* @Nullable */ String> getPublicAccess() {
        return this.publicAccess;
    }
    /**
     * Remaining retention days for soft deleted blob container.
     * 
     */
    @OutputExport(name="remainingRetentionDays", type=Integer.class, parameters={})
    private Output<Integer> remainingRetentionDays;

    /**
     * @return Remaining retention days for soft deleted blob container.
     * 
     */
    public Output<Integer> getRemainingRetentionDays() {
        return this.remainingRetentionDays;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The version of the deleted blob container.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the deleted blob container.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(BlobContainerArgs.Builder a);
    }
    private static io.pulumi.azurenative.storage.BlobContainerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storage.BlobContainerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BlobContainer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BlobContainer(String name) {
        this(name, BlobContainerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BlobContainer(String name, BlobContainerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BlobContainer(String name, BlobContainerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:BlobContainer", name, args == null ? BlobContainerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BlobContainer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:BlobContainer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storage/v20180201:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20180301preview:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20180701:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20181101:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20190401:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20190601:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20200801preview:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210101:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210201:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210401:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210601:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210801:BlobContainer").build())
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
    public static BlobContainer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BlobContainer(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dataplex_v1.AssetArgs;
import com.pulumi.googlenative.dataplex_v1.outputs.GoogleCloudDataplexV1AssetDiscoverySpecResponse;
import com.pulumi.googlenative.dataplex_v1.outputs.GoogleCloudDataplexV1AssetDiscoveryStatusResponse;
import com.pulumi.googlenative.dataplex_v1.outputs.GoogleCloudDataplexV1AssetResourceSpecResponse;
import com.pulumi.googlenative.dataplex_v1.outputs.GoogleCloudDataplexV1AssetResourceStatusResponse;
import com.pulumi.googlenative.dataplex_v1.outputs.GoogleCloudDataplexV1AssetSecurityStatusResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates an asset resource.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dataplex/v1:Asset")
public class Asset extends com.pulumi.resources.CustomResource {
    /**
     * The time when the asset was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the asset was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. Description of the asset.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Description of the asset.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Optional. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
     * 
     */
    @Export(name="discoverySpec", type=GoogleCloudDataplexV1AssetDiscoverySpecResponse.class, parameters={})
    private Output<GoogleCloudDataplexV1AssetDiscoverySpecResponse> discoverySpec;

    /**
     * @return Optional. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
     * 
     */
    public Output<GoogleCloudDataplexV1AssetDiscoverySpecResponse> discoverySpec() {
        return this.discoverySpec;
    }
    /**
     * Status of the discovery feature applied to data referenced by this asset.
     * 
     */
    @Export(name="discoveryStatus", type=GoogleCloudDataplexV1AssetDiscoveryStatusResponse.class, parameters={})
    private Output<GoogleCloudDataplexV1AssetDiscoveryStatusResponse> discoveryStatus;

    /**
     * @return Status of the discovery feature applied to data referenced by this asset.
     * 
     */
    public Output<GoogleCloudDataplexV1AssetDiscoveryStatusResponse> discoveryStatus() {
        return this.discoveryStatus;
    }
    /**
     * Optional. User friendly display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. User friendly display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Optional. User defined labels for the asset.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. User defined labels for the asset.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The relative resource name of the asset, of the form: projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/assets/{asset_id}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The relative resource name of the asset, of the form: projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/assets/{asset_id}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specification of the resource that is referenced by this asset.
     * 
     */
    @Export(name="resourceSpec", type=GoogleCloudDataplexV1AssetResourceSpecResponse.class, parameters={})
    private Output<GoogleCloudDataplexV1AssetResourceSpecResponse> resourceSpec;

    /**
     * @return Specification of the resource that is referenced by this asset.
     * 
     */
    public Output<GoogleCloudDataplexV1AssetResourceSpecResponse> resourceSpec() {
        return this.resourceSpec;
    }
    /**
     * Status of the resource referenced by this asset.
     * 
     */
    @Export(name="resourceStatus", type=GoogleCloudDataplexV1AssetResourceStatusResponse.class, parameters={})
    private Output<GoogleCloudDataplexV1AssetResourceStatusResponse> resourceStatus;

    /**
     * @return Status of the resource referenced by this asset.
     * 
     */
    public Output<GoogleCloudDataplexV1AssetResourceStatusResponse> resourceStatus() {
        return this.resourceStatus;
    }
    /**
     * Status of the security policy applied to resource referenced by this asset.
     * 
     */
    @Export(name="securityStatus", type=GoogleCloudDataplexV1AssetSecurityStatusResponse.class, parameters={})
    private Output<GoogleCloudDataplexV1AssetSecurityStatusResponse> securityStatus;

    /**
     * @return Status of the security policy applied to resource referenced by this asset.
     * 
     */
    public Output<GoogleCloudDataplexV1AssetSecurityStatusResponse> securityStatus() {
        return this.securityStatus;
    }
    /**
     * Current state of the asset.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the asset.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * System generated globally unique ID for the asset. This ID will be different if the asset is deleted and re-created with the same name.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return System generated globally unique ID for the asset. This ID will be different if the asset is deleted and re-created with the same name.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * The time when the asset was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the asset was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Asset(String name) {
        this(name, AssetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Asset(String name, AssetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Asset(String name, AssetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataplex/v1:Asset", name, args == null ? AssetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Asset(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataplex/v1:Asset", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Asset get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Asset(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudkms_v1.CryptoKeyArgs;
import com.pulumi.googlenative.cloudkms_v1.outputs.CryptoKeyVersionResponse;
import com.pulumi.googlenative.cloudkms_v1.outputs.CryptoKeyVersionTemplateResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a new CryptoKey within a KeyRing. CryptoKey.purpose and CryptoKey.version_template.algorithm are required.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:cloudkms/v1:CryptoKey")
public class CryptoKey extends com.pulumi.resources.CustomResource {
    /**
     * The time at which this CryptoKey was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this CryptoKey was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Immutable. The resource name of the backend environment where the key material for all CryptoKeyVersions associated with this CryptoKey reside and where all related cryptographic operations are performed. Only applicable if CryptoKeyVersions have a ProtectionLevel of EXTERNAL_VPC, with the resource name in the format `projects/*{@literal /}locations/*{@literal /}ekmConnections/*`. Note, this list is non-exhaustive and may apply to additional ProtectionLevels in the future.
     * 
     */
    @Export(name="cryptoKeyBackend", type=String.class, parameters={})
    private Output<String> cryptoKeyBackend;

    /**
     * @return Immutable. The resource name of the backend environment where the key material for all CryptoKeyVersions associated with this CryptoKey reside and where all related cryptographic operations are performed. Only applicable if CryptoKeyVersions have a ProtectionLevel of EXTERNAL_VPC, with the resource name in the format `projects/*{@literal /}locations/*{@literal /}ekmConnections/*`. Note, this list is non-exhaustive and may apply to additional ProtectionLevels in the future.
     * 
     */
    public Output<String> cryptoKeyBackend() {
        return this.cryptoKeyBackend;
    }
    /**
     * Immutable. The period of time that versions of this key spend in the DESTROY_SCHEDULED state before transitioning to DESTROYED. If not specified at creation time, the default duration is 24 hours.
     * 
     */
    @Export(name="destroyScheduledDuration", type=String.class, parameters={})
    private Output<String> destroyScheduledDuration;

    /**
     * @return Immutable. The period of time that versions of this key spend in the DESTROY_SCHEDULED state before transitioning to DESTROYED. If not specified at creation time, the default duration is 24 hours.
     * 
     */
    public Output<String> destroyScheduledDuration() {
        return this.destroyScheduledDuration;
    }
    /**
     * Immutable. Whether this key may contain imported versions only.
     * 
     */
    @Export(name="importOnly", type=Boolean.class, parameters={})
    private Output<Boolean> importOnly;

    /**
     * @return Immutable. Whether this key may contain imported versions only.
     * 
     */
    public Output<Boolean> importOnly() {
        return this.importOnly;
    }
    /**
     * Labels with user-defined metadata. For more information, see [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys).
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels with user-defined metadata. For more information, see [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys).
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The resource name for this CryptoKey in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this CryptoKey in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * At next_rotation_time, the Key Management Service will automatically: 1. Create a new version of this CryptoKey. 2. Mark the new version as primary. Key rotations performed manually via CreateCryptoKeyVersion and UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
     * 
     */
    @Export(name="nextRotationTime", type=String.class, parameters={})
    private Output<String> nextRotationTime;

    /**
     * @return At next_rotation_time, the Key Management Service will automatically: 1. Create a new version of this CryptoKey. 2. Mark the new version as primary. Key rotations performed manually via CreateCryptoKeyVersion and UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
     * 
     */
    public Output<String> nextRotationTime() {
        return this.nextRotationTime;
    }
    /**
     * A copy of the &#34;primary&#34; CryptoKeyVersion that will be used by Encrypt when this CryptoKey is given in EncryptRequest.name. The CryptoKey&#39;s primary version can be updated via UpdateCryptoKeyPrimaryVersion. Keys with purpose ENCRYPT_DECRYPT may have a primary. For other keys, this field will be omitted.
     * 
     */
    @Export(name="primary", type=CryptoKeyVersionResponse.class, parameters={})
    private Output<CryptoKeyVersionResponse> primary;

    /**
     * @return A copy of the &#34;primary&#34; CryptoKeyVersion that will be used by Encrypt when this CryptoKey is given in EncryptRequest.name. The CryptoKey&#39;s primary version can be updated via UpdateCryptoKeyPrimaryVersion. Keys with purpose ENCRYPT_DECRYPT may have a primary. For other keys, this field will be omitted.
     * 
     */
    public Output<CryptoKeyVersionResponse> primary() {
        return this.primary;
    }
    /**
     * Immutable. The immutable purpose of this CryptoKey.
     * 
     */
    @Export(name="purpose", type=String.class, parameters={})
    private Output<String> purpose;

    /**
     * @return Immutable. The immutable purpose of this CryptoKey.
     * 
     */
    public Output<String> purpose() {
        return this.purpose;
    }
    /**
     * next_rotation_time will be advanced by this period when the service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours. If rotation_period is set, next_rotation_time must also be set. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
     * 
     */
    @Export(name="rotationPeriod", type=String.class, parameters={})
    private Output<String> rotationPeriod;

    /**
     * @return next_rotation_time will be advanced by this period when the service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours. If rotation_period is set, next_rotation_time must also be set. Keys with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this field must be omitted.
     * 
     */
    public Output<String> rotationPeriod() {
        return this.rotationPeriod;
    }
    /**
     * A template describing settings for new CryptoKeyVersion instances. The properties of new CryptoKeyVersion instances created by either CreateCryptoKeyVersion or auto-rotation are controlled by this template.
     * 
     */
    @Export(name="versionTemplate", type=CryptoKeyVersionTemplateResponse.class, parameters={})
    private Output<CryptoKeyVersionTemplateResponse> versionTemplate;

    /**
     * @return A template describing settings for new CryptoKeyVersion instances. The properties of new CryptoKeyVersion instances created by either CreateCryptoKeyVersion or auto-rotation are controlled by this template.
     * 
     */
    public Output<CryptoKeyVersionTemplateResponse> versionTemplate() {
        return this.versionTemplate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CryptoKey(String name) {
        this(name, CryptoKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CryptoKey(String name, CryptoKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CryptoKey(String name, CryptoKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudkms/v1:CryptoKey", name, args == null ? CryptoKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CryptoKey(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudkms/v1:CryptoKey", name, null, makeResourceOptions(options, id));
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
    public static CryptoKey get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CryptoKey(name, id, options);
    }
}

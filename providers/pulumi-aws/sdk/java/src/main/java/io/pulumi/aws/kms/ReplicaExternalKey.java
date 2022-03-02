// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kms.ReplicaExternalKeyArgs;
import io.pulumi.aws.kms.inputs.ReplicaExternalKeyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a KMS multi-Region replica key that uses external key material.
 * See the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-import.html) for more information on importing key material into multi-Region keys.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * KMS multi-Region replica keys can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kms/replicaExternalKey:ReplicaExternalKey example 1234abcd-12ab-34cd-56ef-1234567890ab
 * ```
 * 
 */
@ResourceType(type="aws:kms/replicaExternalKey:ReplicaExternalKey")
public class ReplicaExternalKey extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the replica key. The key ARNs of related multi-Region keys differ only in the Region value.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the replica key. The key ARNs of related multi-Region keys differ only in the Region value.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     * 
     */
    @OutputExport(name="bypassPolicyLockoutSafetyCheck", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> bypassPolicyLockoutSafetyCheck;

    /**
     * @return A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }
    /**
     * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * 
     */
    @OutputExport(name="deletionWindowInDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> deletionWindowInDays;

    /**
     * @return The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * 
     */
    public Output</* @Nullable */ Integer> getDeletionWindowInDays() {
        return this.deletionWindowInDays;
    }
    /**
     * A description of the KMS key.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the KMS key.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     * 
     */
    public Output<Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
     * 
     */
    @OutputExport(name="expirationModel", type=String.class, parameters={})
    private Output<String> expirationModel;

    /**
     * @return Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
     * 
     */
    public Output<String> getExpirationModel() {
        return this.expirationModel;
    }
    /**
     * The key ID of the replica key. Related multi-Region keys have the same key ID.
     * 
     */
    @OutputExport(name="keyId", type=String.class, parameters={})
    private Output<String> keyId;

    /**
     * @return The key ID of the replica key. Related multi-Region keys have the same key ID.
     * 
     */
    public Output<String> getKeyId() {
        return this.keyId;
    }
    /**
     * Base64 encoded 256-bit symmetric encryption key material to import. The KMS key is permanently associated with this key material. The same key material can be [reimported](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material), but you cannot import different key material.
     * 
     */
    @OutputExport(name="keyMaterialBase64", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyMaterialBase64;

    /**
     * @return Base64 encoded 256-bit symmetric encryption key material to import. The KMS key is permanently associated with this key material. The same key material can be [reimported](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material), but you cannot import different key material.
     * 
     */
    public Output</* @Nullable */ String> getKeyMaterialBase64() {
        return this.keyMaterialBase64;
    }
    /**
     * The state of the replica key.
     * 
     */
    @OutputExport(name="keyState", type=String.class, parameters={})
    private Output<String> keyState;

    /**
     * @return The state of the replica key.
     * 
     */
    public Output<String> getKeyState() {
        return this.keyState;
    }
    /**
     * The [cryptographic operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations) for which you can use the KMS key. This is a shared property of multi-Region keys.
     * 
     */
    @OutputExport(name="keyUsage", type=String.class, parameters={})
    private Output<String> keyUsage;

    /**
     * @return The [cryptographic operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations) for which you can use the KMS key. This is a shared property of multi-Region keys.
     * 
     */
    public Output<String> getKeyUsage() {
        return this.keyUsage;
    }
    @OutputExport(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
     * 
     */
    @OutputExport(name="primaryKeyArn", type=String.class, parameters={})
    private Output<String> primaryKeyArn;

    /**
     * @return The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
     * 
     */
    public Output<String> getPrimaryKeyArn() {
        return this.primaryKeyArn;
    }
    /**
     * A map of tags to assign to the replica key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the replica key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the key becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    @OutputExport(name="validTo", type=String.class, parameters={})
    private Output</* @Nullable */ String> validTo;

    /**
     * @return Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the key becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    public Output</* @Nullable */ String> getValidTo() {
        return this.validTo;
    }

    public interface BuilderApplicator {
        public void apply(ReplicaExternalKeyArgs.Builder a);
    }
    private static io.pulumi.aws.kms.ReplicaExternalKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.kms.ReplicaExternalKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ReplicaExternalKey(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicaExternalKey(String name) {
        this(name, ReplicaExternalKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicaExternalKey(String name, ReplicaExternalKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicaExternalKey(String name, ReplicaExternalKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/replicaExternalKey:ReplicaExternalKey", name, args == null ? ReplicaExternalKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ReplicaExternalKey(String name, Input<String> id, @Nullable ReplicaExternalKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/replicaExternalKey:ReplicaExternalKey", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ReplicaExternalKey get(String name, Input<String> id, @Nullable ReplicaExternalKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReplicaExternalKey(name, id, state, options);
    }
}

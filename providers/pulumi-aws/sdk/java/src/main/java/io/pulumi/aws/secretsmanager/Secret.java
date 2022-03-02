// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.secretsmanager.SecretArgs;
import io.pulumi.aws.secretsmanager.inputs.SecretState;
import io.pulumi.aws.secretsmanager.outputs.SecretReplica;
import io.pulumi.aws.secretsmanager.outputs.SecretRotationRules;
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
 * Provides a resource to manage AWS Secrets Manager secret metadata. To manage secret rotation, see the `aws.secretsmanager.SecretRotation` resource. To manage a secret value, see the `aws.secretsmanager.SecretVersion` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_secretsmanager_secret` can be imported by using the secret Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:secretsmanager/secret:Secret example arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456
 * ```
 * 
 */
@ResourceType(type="aws:secretsmanager/secret:Secret")
public class Secret extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the secret.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the secret.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Description of the secret.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the secret.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region.
     * 
     */
    @OutputExport(name="forceOverwriteReplicaSecret", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceOverwriteReplicaSecret;

    /**
     * @return Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceOverwriteReplicaSecret() {
        return this.forceOverwriteReplicaSecret;
    }
    /**
     * ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account's default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
     * 
     */
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account's default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `name_prefix`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `name_prefix`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = ""`) _will not_ delete the policy since it could have been set by `aws.secretsmanager.SecretPolicy`. To delete the `policy`, set it to `"{}"` (an empty JSON document).
     * 
     */
    @OutputExport(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = ""`) _will not_ delete the policy since it could have been set by `aws.secretsmanager.SecretPolicy`. To delete the `policy`, set it to `"{}"` (an empty JSON document).
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * Number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
     * 
     */
    @OutputExport(name="recoveryWindowInDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> recoveryWindowInDays;

    /**
     * @return Number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
     * 
     */
    public Output</* @Nullable */ Integer> getRecoveryWindowInDays() {
        return this.recoveryWindowInDays;
    }
    /**
     * Configuration block to support secret replication. See details below.
     * 
     */
    @OutputExport(name="replicas", type=List.class, parameters={SecretReplica.class})
    private Output<List<SecretReplica>> replicas;

    /**
     * @return Configuration block to support secret replication. See details below.
     * 
     */
    public Output<List<SecretReplica>> getReplicas() {
        return this.replicas;
    }
    /**
     * Whether automatic rotation is enabled for this secret.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation resource instead
     * 
     */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    @OutputExport(name="rotationEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> rotationEnabled;

    /**
     * @return Whether automatic rotation is enabled for this secret.
     * 
     */
    public Output<Boolean> getRotationEnabled() {
        return this.rotationEnabled;
    }
    /**
     * ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation resource instead
     * 
     */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    @OutputExport(name="rotationLambdaArn", type=String.class, parameters={})
    private Output<String> rotationLambdaArn;

    /**
     * @return ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
     * 
     */
    public Output<String> getRotationLambdaArn() {
        return this.rotationLambdaArn;
    }
    /**
     * Configuration block for the rotation configuration of this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
     * 
     * @Deprecated
     * Use the aws_secretsmanager_secret_rotation resource instead
     * 
     */
    @Deprecated /* Use the aws_secretsmanager_secret_rotation resource instead */
    @OutputExport(name="rotationRules", type=SecretRotationRules.class, parameters={})
    private Output<SecretRotationRules> rotationRules;

    /**
     * @return Configuration block for the rotation configuration of this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
     * 
     */
    public Output<SecretRotationRules> getRotationRules() {
        return this.rotationRules;
    }
    /**
     * Key-value map of user-defined tags that are attached to the secret. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of user-defined tags that are attached to the secret. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable SecretArgs.Builder a);
    }
    private static io.pulumi.aws.secretsmanager.SecretArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.secretsmanager.SecretArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Secret(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Secret(String name) {
        this(name, SecretArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Secret(String name, @Nullable SecretArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Secret(String name, @Nullable SecretArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:secretsmanager/secret:Secret", name, args == null ? SecretArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Secret(String name, Input<String> id, @Nullable SecretState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:secretsmanager/secret:Secret", name, state, makeResourceOptions(options, id));
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
    public static Secret get(String name, Input<String> id, @Nullable SecretState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Secret(name, id, state, options);
    }
}

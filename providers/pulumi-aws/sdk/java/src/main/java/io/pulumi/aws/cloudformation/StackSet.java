// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudformation.StackSetArgs;
import io.pulumi.aws.cloudformation.inputs.StackSetState;
import io.pulumi.aws.cloudformation.outputs.StackSetAutoDeployment;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a CloudFormation StackSet. StackSets allow CloudFormation templates to be easily deployed across multiple accounts and regions via StackSet Instances (`aws.cloudformation.StackSetInstance` resource). Additional information about StackSets can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/what-is-cfnstacksets.html).
 * 
 * > **NOTE:** All template parameters, including those with a `Default`, must be configured or ignored with the `lifecycle` configuration block `ignore_changes` argument.
 * 
 * > **NOTE:** All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignore_changes` argument.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CloudFormation StackSets can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudformation/stackSet:StackSet example example
 * ```
 * 
 */
@ResourceType(type="aws:cloudformation/stackSet:StackSet")
public class StackSet extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Number (ARN) of the IAM Role in the administrator account. This must be defined when using the `SELF_MANAGED` permission model.
     * 
     */
    @OutputExport(name="administrationRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> administrationRoleArn;

    /**
     * @return Amazon Resource Number (ARN) of the IAM Role in the administrator account. This must be defined when using the `SELF_MANAGED` permission model.
     * 
     */
    public Output</* @Nullable */ String> getAdministrationRoleArn() {
        return this.administrationRoleArn;
    }
    /**
     * Amazon Resource Name (ARN) of the StackSet.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the StackSet.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Configuration block containing the auto-deployment model for your StackSet. This can only be defined when using the `SERVICE_MANAGED` permission model.
     * 
     */
    @OutputExport(name="autoDeployment", type=StackSetAutoDeployment.class, parameters={})
    private Output</* @Nullable */ StackSetAutoDeployment> autoDeployment;

    /**
     * @return Configuration block containing the auto-deployment model for your StackSet. This can only be defined when using the `SERVICE_MANAGED` permission model.
     * 
     */
    public Output</* @Nullable */ StackSetAutoDeployment> getAutoDeployment() {
        return this.autoDeployment;
    }
    /**
     * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
     * 
     */
    @OutputExport(name="capabilities", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> capabilities;

    /**
     * @return A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
     * 
     */
    public Output</* @Nullable */ List<String>> getCapabilities() {
        return this.capabilities;
    }
    /**
     * Description of the StackSet.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the StackSet.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole` when using the `SELF_MANAGED` permission model. This should not be defined when using the `SERVICE_MANAGED` permission model.
     * 
     */
    @OutputExport(name="executionRoleName", type=String.class, parameters={})
    private Output<String> executionRoleName;

    /**
     * @return Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole` when using the `SELF_MANAGED` permission model. This should not be defined when using the `SERVICE_MANAGED` permission model.
     * 
     */
    public Output<String> getExecutionRoleName() {
        return this.executionRoleName;
    }
    /**
     * Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignore_changes` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignore_changes` argument.
     * 
     */
    @OutputExport(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignore_changes` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignore_changes` argument.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getParameters() {
        return this.parameters;
    }
    /**
     * Describes how the IAM roles required for your StackSet are created. Valid values: `SELF_MANAGED` (default), `SERVICE_MANAGED`.
     * 
     */
    @OutputExport(name="permissionModel", type=String.class, parameters={})
    private Output</* @Nullable */ String> permissionModel;

    /**
     * @return Describes how the IAM roles required for your StackSet are created. Valid values: `SELF_MANAGED` (default), `SERVICE_MANAGED`.
     * 
     */
    public Output</* @Nullable */ String> getPermissionModel() {
        return this.permissionModel;
    }
    /**
     * Unique identifier of the StackSet.
     * 
     */
    @OutputExport(name="stackSetId", type=String.class, parameters={})
    private Output<String> stackSetId;

    /**
     * @return Unique identifier of the StackSet.
     * 
     */
    public Output<String> getStackSetId() {
        return this.stackSetId;
    }
    /**
     * Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `template_url`.
     * 
     */
    @OutputExport(name="templateBody", type=String.class, parameters={})
    private Output<String> templateBody;

    /**
     * @return String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `template_url`.
     * 
     */
    public Output<String> getTemplateBody() {
        return this.templateBody;
    }
    /**
     * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `template_body`.
     * 
     */
    @OutputExport(name="templateUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateUrl;

    /**
     * @return String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `template_body`.
     * 
     */
    public Output</* @Nullable */ String> getTemplateUrl() {
        return this.templateUrl;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable StackSetArgs.Builder a);
    }
    private static io.pulumi.aws.cloudformation.StackSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudformation.StackSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StackSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StackSet(String name) {
        this(name, StackSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StackSet(String name, @Nullable StackSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StackSet(String name, @Nullable StackSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudformation/stackSet:StackSet", name, args == null ? StackSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StackSet(String name, Input<String> id, @Nullable StackSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudformation/stackSet:StackSet", name, state, makeResourceOptions(options, id));
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
    public static StackSet get(String name, Input<String> id, @Nullable StackSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StackSet(name, id, state, options);
    }
}

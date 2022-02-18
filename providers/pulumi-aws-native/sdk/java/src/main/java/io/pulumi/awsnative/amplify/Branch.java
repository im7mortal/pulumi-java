// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.amplify.BranchArgs;
import io.pulumi.awsnative.amplify.enums.BranchStage;
import io.pulumi.awsnative.amplify.outputs.BranchBasicAuthConfig;
import io.pulumi.awsnative.amplify.outputs.BranchEnvironmentVariable;
import io.pulumi.awsnative.amplify.outputs.BranchTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::Amplify::Branch resource creates a new branch within an app.
 * 
 */
@ResourceType(type="aws-native:amplify:Branch")
public class Branch extends io.pulumi.resources.CustomResource {
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="basicAuthConfig", type=BranchBasicAuthConfig.class, parameters={})
    private Output</* @Nullable */ BranchBasicAuthConfig> basicAuthConfig;

    public Output</* @Nullable */ BranchBasicAuthConfig> getBasicAuthConfig() {
        return this.basicAuthConfig;
    }
    @OutputExport(name="branchName", type=String.class, parameters={})
    private Output<String> branchName;

    public Output<String> getBranchName() {
        return this.branchName;
    }
    @OutputExport(name="buildSpec", type=String.class, parameters={})
    private Output</* @Nullable */ String> buildSpec;

    public Output</* @Nullable */ String> getBuildSpec() {
        return this.buildSpec;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="enableAutoBuild", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutoBuild;

    public Output</* @Nullable */ Boolean> getEnableAutoBuild() {
        return this.enableAutoBuild;
    }
    @OutputExport(name="enablePerformanceMode", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePerformanceMode;

    public Output</* @Nullable */ Boolean> getEnablePerformanceMode() {
        return this.enablePerformanceMode;
    }
    @OutputExport(name="enablePullRequestPreview", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePullRequestPreview;

    public Output</* @Nullable */ Boolean> getEnablePullRequestPreview() {
        return this.enablePullRequestPreview;
    }
    @OutputExport(name="environmentVariables", type=List.class, parameters={BranchEnvironmentVariable.class})
    private Output</* @Nullable */ List<BranchEnvironmentVariable>> environmentVariables;

    public Output</* @Nullable */ List<BranchEnvironmentVariable>> getEnvironmentVariables() {
        return this.environmentVariables;
    }
    @OutputExport(name="pullRequestEnvironmentName", type=String.class, parameters={})
    private Output</* @Nullable */ String> pullRequestEnvironmentName;

    public Output</* @Nullable */ String> getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName;
    }
    @OutputExport(name="stage", type=BranchStage.class, parameters={})
    private Output</* @Nullable */ BranchStage> stage;

    public Output</* @Nullable */ BranchStage> getStage() {
        return this.stage;
    }
    @OutputExport(name="tags", type=List.class, parameters={BranchTag.class})
    private Output</* @Nullable */ List<BranchTag>> tags;

    public Output</* @Nullable */ List<BranchTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Branch(String name, BranchArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplify:Branch", name, args == null ? BranchArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Branch(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplify:Branch", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Branch get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Branch(name, id, options);
    }
}

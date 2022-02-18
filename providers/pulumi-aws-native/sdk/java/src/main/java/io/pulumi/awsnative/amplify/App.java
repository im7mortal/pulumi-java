// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.amplify.AppArgs;
import io.pulumi.awsnative.amplify.outputs.AppAutoBranchCreationConfig;
import io.pulumi.awsnative.amplify.outputs.AppBasicAuthConfig;
import io.pulumi.awsnative.amplify.outputs.AppCustomRule;
import io.pulumi.awsnative.amplify.outputs.AppEnvironmentVariable;
import io.pulumi.awsnative.amplify.outputs.AppTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::Amplify::App resource creates Apps in the Amplify Console. An App is a collection of branches.
 * 
 */
@ResourceType(type="aws-native:amplify:App")
public class App extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessToken;

    public Output</* @Nullable */ String> getAccessToken() {
        return this.accessToken;
    }
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }
    @OutputExport(name="appName", type=String.class, parameters={})
    private Output<String> appName;

    public Output<String> getAppName() {
        return this.appName;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="autoBranchCreationConfig", type=AppAutoBranchCreationConfig.class, parameters={})
    private Output</* @Nullable */ AppAutoBranchCreationConfig> autoBranchCreationConfig;

    public Output</* @Nullable */ AppAutoBranchCreationConfig> getAutoBranchCreationConfig() {
        return this.autoBranchCreationConfig;
    }
    @OutputExport(name="basicAuthConfig", type=AppBasicAuthConfig.class, parameters={})
    private Output</* @Nullable */ AppBasicAuthConfig> basicAuthConfig;

    public Output</* @Nullable */ AppBasicAuthConfig> getBasicAuthConfig() {
        return this.basicAuthConfig;
    }
    @OutputExport(name="buildSpec", type=String.class, parameters={})
    private Output</* @Nullable */ String> buildSpec;

    public Output</* @Nullable */ String> getBuildSpec() {
        return this.buildSpec;
    }
    @OutputExport(name="customHeaders", type=String.class, parameters={})
    private Output</* @Nullable */ String> customHeaders;

    public Output</* @Nullable */ String> getCustomHeaders() {
        return this.customHeaders;
    }
    @OutputExport(name="customRules", type=List.class, parameters={AppCustomRule.class})
    private Output</* @Nullable */ List<AppCustomRule>> customRules;

    public Output</* @Nullable */ List<AppCustomRule>> getCustomRules() {
        return this.customRules;
    }
    @OutputExport(name="defaultDomain", type=String.class, parameters={})
    private Output<String> defaultDomain;

    public Output<String> getDefaultDomain() {
        return this.defaultDomain;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="enableBranchAutoDeletion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBranchAutoDeletion;

    public Output</* @Nullable */ Boolean> getEnableBranchAutoDeletion() {
        return this.enableBranchAutoDeletion;
    }
    @OutputExport(name="environmentVariables", type=List.class, parameters={AppEnvironmentVariable.class})
    private Output</* @Nullable */ List<AppEnvironmentVariable>> environmentVariables;

    public Output</* @Nullable */ List<AppEnvironmentVariable>> getEnvironmentVariables() {
        return this.environmentVariables;
    }
    @OutputExport(name="iAMServiceRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> iAMServiceRole;

    public Output</* @Nullable */ String> getIAMServiceRole() {
        return this.iAMServiceRole;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="oauthToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> oauthToken;

    public Output</* @Nullable */ String> getOauthToken() {
        return this.oauthToken;
    }
    @OutputExport(name="repository", type=String.class, parameters={})
    private Output</* @Nullable */ String> repository;

    public Output</* @Nullable */ String> getRepository() {
        return this.repository;
    }
    @OutputExport(name="tags", type=List.class, parameters={AppTag.class})
    private Output</* @Nullable */ List<AppTag>> tags;

    public Output</* @Nullable */ List<AppTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, @Nullable AppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplify:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private App(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplify:App", name, null, makeResourceOptions(options, id));
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
    public static App get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, options);
    }
}

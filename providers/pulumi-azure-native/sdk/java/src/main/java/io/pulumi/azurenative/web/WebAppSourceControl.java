// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppSourceControlArgs;
import io.pulumi.azurenative.web.outputs.GitHubActionConfigurationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Source control configuration for an app.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppSourceControl myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/sourcecontrols/web 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppSourceControl")
public class WebAppSourceControl extends io.pulumi.resources.CustomResource {
    /**
     * Name of branch to use for deployment.
     * 
     */
    @OutputExport(name="branch", type=String.class, parameters={})
    private Output</* @Nullable */ String> branch;

    /**
     * @return Name of branch to use for deployment.
     * 
     */
    public Output</* @Nullable */ String> getBranch() {
        return this.branch;
    }
    /**
     * <code>true</code> to enable deployment rollback; otherwise, <code>false</code>.
     * 
     */
    @OutputExport(name="deploymentRollbackEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deploymentRollbackEnabled;

    /**
     * @return <code>true</code> to enable deployment rollback; otherwise, <code>false</code>.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeploymentRollbackEnabled() {
        return this.deploymentRollbackEnabled;
    }
    /**
     * If GitHub Action is selected, than the associated configuration.
     * 
     */
    @OutputExport(name="gitHubActionConfiguration", type=GitHubActionConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ GitHubActionConfigurationResponse> gitHubActionConfiguration;

    /**
     * @return If GitHub Action is selected, than the associated configuration.
     * 
     */
    public Output</* @Nullable */ GitHubActionConfigurationResponse> getGitHubActionConfiguration() {
        return this.gitHubActionConfiguration;
    }
    /**
     * <code>true</code> if this is deployed via GitHub action.
     * 
     */
    @OutputExport(name="isGitHubAction", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isGitHubAction;

    /**
     * @return <code>true</code> if this is deployed via GitHub action.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsGitHubAction() {
        return this.isGitHubAction;
    }
    /**
     * <code>true</code> to limit to manual integration; <code>false</code> to enable continuous integration (which configures webhooks into online repos like GitHub).
     * 
     */
    @OutputExport(name="isManualIntegration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isManualIntegration;

    /**
     * @return <code>true</code> to limit to manual integration; <code>false</code> to enable continuous integration (which configures webhooks into online repos like GitHub).
     * 
     */
    public Output</* @Nullable */ Boolean> getIsManualIntegration() {
        return this.isManualIntegration;
    }
    /**
     * <code>true</code> for a Mercurial repository; <code>false</code> for a Git repository.
     * 
     */
    @OutputExport(name="isMercurial", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isMercurial;

    /**
     * @return <code>true</code> for a Mercurial repository; <code>false</code> for a Git repository.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsMercurial() {
        return this.isMercurial;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Repository or source control URL.
     * 
     */
    @OutputExport(name="repoUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> repoUrl;

    /**
     * @return Repository or source control URL.
     * 
     */
    public Output</* @Nullable */ String> getRepoUrl() {
        return this.repoUrl;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(WebAppSourceControlArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.WebAppSourceControlArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.WebAppSourceControlArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebAppSourceControl(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppSourceControl(String name) {
        this(name, WebAppSourceControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppSourceControl(String name, WebAppSourceControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppSourceControl(String name, WebAppSourceControlArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSourceControl", name, args == null ? WebAppSourceControlArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppSourceControl(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSourceControl", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppSourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppSourceControl").build())
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
    public static WebAppSourceControl get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppSourceControl(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebase_v1beta1.WebAppArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Requests the creation of a new WebApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:firebase/v1beta1:WebApp")
public class WebApp extends io.pulumi.resources.CustomResource {
    /**
     * Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    public Output<String> getAppId() {
        return this.appId;
    }
    /**
     * The URLs where the `WebApp` is hosted.
     * 
     */
    @OutputExport(name="appUrls", type=List.class, parameters={String.class})
    private Output<List<String>> appUrls;

    /**
     * @return The URLs where the `WebApp` is hosted.
     * 
     */
    public Output<List<String>> getAppUrls() {
        return this.appUrls;
    }
    /**
     * The user-assigned display name for the `WebApp`.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user-assigned display name for the `WebApp`.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The resource name of the WebApp, in the format: projects/PROJECT_IDENTIFIER /webApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.webApps#WebApp.FIELDS.app_id)).
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the WebApp, in the format: projects/PROJECT_IDENTIFIER /webApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.webApps#WebApp.FIELDS.app_id)).
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `WebApp`.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `WebApp`.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Immutable. A unique, Firebase-assigned identifier for the `WebApp`. This identifier is only used to populate the `namespace` value for the `WebApp`. For most use cases, use `appId` to identify or reference the App. The `webId` value is only unique within a `FirebaseProject` and its associated Apps.
     * 
     */
    @OutputExport(name="webId", type=String.class, parameters={})
    private Output<String> webId;

    /**
     * @return Immutable. A unique, Firebase-assigned identifier for the `WebApp`. This identifier is only used to populate the `namespace` value for the `WebApp`. For most use cases, use `appId` to identify or reference the App. The `webId` value is only unique within a `FirebaseProject` and its associated Apps.
     * 
     */
    public Output<String> getWebId() {
        return this.webId;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable WebAppArgs.Builder a);
    }
    private static io.pulumi.googlenative.firebase_v1beta1.WebAppArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.firebase_v1beta1.WebAppArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebApp(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebApp(String name) {
        this(name, WebAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebApp(String name, @Nullable WebAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebApp(String name, @Nullable WebAppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebase/v1beta1:WebApp", name, args == null ? WebAppArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebApp(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebase/v1beta1:WebApp", name, null, makeResourceOptions(options, id));
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
    public static WebApp get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebApp(name, id, options);
    }
}

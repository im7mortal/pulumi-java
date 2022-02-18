// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.resiliencehub.AppArgs;
import io.pulumi.awsnative.resiliencehub.outputs.AppResourceMapping;
import io.pulumi.awsnative.resiliencehub.outputs.AppTagMap;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type Definition for AWS::ResilienceHub::App.
 * 
 */
@ResourceType(type="aws-native:resiliencehub:App")
public class App extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the App.
     * 
     */
    @OutputExport(name="appArn", type=String.class, parameters={})
    private Output<String> appArn;

    /**
     * @return Amazon Resource Name (ARN) of the App.
     * 
     */
    public Output<String> getAppArn() {
        return this.appArn;
    }
    /**
     * A string containing full ResilienceHub app template body.
     * 
     */
    @OutputExport(name="appTemplateBody", type=String.class, parameters={})
    private Output<String> appTemplateBody;

    /**
     * @return A string containing full ResilienceHub app template body.
     * 
     */
    public Output<String> getAppTemplateBody() {
        return this.appTemplateBody;
    }
    /**
     * App description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return App description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the app.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the app.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Amazon Resource Name (ARN) of the Resiliency Policy.
     * 
     */
    @OutputExport(name="resiliencyPolicyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> resiliencyPolicyArn;

    /**
     * @return Amazon Resource Name (ARN) of the Resiliency Policy.
     * 
     */
    public Output</* @Nullable */ String> getResiliencyPolicyArn() {
        return this.resiliencyPolicyArn;
    }
    /**
     * An array of ResourceMapping objects.
     * 
     */
    @OutputExport(name="resourceMappings", type=List.class, parameters={AppResourceMapping.class})
    private Output<List<AppResourceMapping>> resourceMappings;

    /**
     * @return An array of ResourceMapping objects.
     * 
     */
    public Output<List<AppResourceMapping>> getResourceMappings() {
        return this.resourceMappings;
    }
    @OutputExport(name="tags", type=AppTagMap.class, parameters={})
    private Output</* @Nullable */ AppTagMap> tags;

    public Output</* @Nullable */ AppTagMap> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, AppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resiliencehub:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private App(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resiliencehub:App", name, null, makeResourceOptions(options, id));
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

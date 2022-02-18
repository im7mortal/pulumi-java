// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.wafv2.WebACLArgs;
import io.pulumi.awsnative.wafv2.enums.WebACLScope;
import io.pulumi.awsnative.wafv2.outputs.WebACLCaptchaConfig;
import io.pulumi.awsnative.wafv2.outputs.WebACLCustomResponseBodies;
import io.pulumi.awsnative.wafv2.outputs.WebACLDefaultAction;
import io.pulumi.awsnative.wafv2.outputs.WebACLRule;
import io.pulumi.awsnative.wafv2.outputs.WebACLTag;
import io.pulumi.awsnative.wafv2.outputs.WebACLVisibilityConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Contains the Rules that identify the requests that you want to allow, block, or count. In a WebACL, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a WebACL, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the WebACL with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a WebACL, a request needs to match only one of the specifications to be allowed, blocked, or counted.
 * 
 */
@ResourceType(type="aws-native:wafv2:WebACL")
public class WebACL extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="capacity", type=Integer.class, parameters={})
    private Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity;
    }
    @OutputExport(name="captchaConfig", type=WebACLCaptchaConfig.class, parameters={})
    private Output</* @Nullable */ WebACLCaptchaConfig> captchaConfig;

    public Output</* @Nullable */ WebACLCaptchaConfig> getCaptchaConfig() {
        return this.captchaConfig;
    }
    @OutputExport(name="customResponseBodies", type=WebACLCustomResponseBodies.class, parameters={})
    private Output</* @Nullable */ WebACLCustomResponseBodies> customResponseBodies;

    public Output</* @Nullable */ WebACLCustomResponseBodies> getCustomResponseBodies() {
        return this.customResponseBodies;
    }
    @OutputExport(name="defaultAction", type=WebACLDefaultAction.class, parameters={})
    private Output<WebACLDefaultAction> defaultAction;

    public Output<WebACLDefaultAction> getDefaultAction() {
        return this.defaultAction;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="labelNamespace", type=String.class, parameters={})
    private Output<String> labelNamespace;

    public Output<String> getLabelNamespace() {
        return this.labelNamespace;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Collection of Rules.
     * 
     */
    @OutputExport(name="rules", type=List.class, parameters={WebACLRule.class})
    private Output</* @Nullable */ List<WebACLRule>> rules;

    /**
     * @return Collection of Rules.
     * 
     */
    public Output</* @Nullable */ List<WebACLRule>> getRules() {
        return this.rules;
    }
    @OutputExport(name="scope", type=WebACLScope.class, parameters={})
    private Output<WebACLScope> scope;

    public Output<WebACLScope> getScope() {
        return this.scope;
    }
    @OutputExport(name="tags", type=List.class, parameters={WebACLTag.class})
    private Output</* @Nullable */ List<WebACLTag>> tags;

    public Output</* @Nullable */ List<WebACLTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="visibilityConfig", type=WebACLVisibilityConfig.class, parameters={})
    private Output<WebACLVisibilityConfig> visibilityConfig;

    public Output<WebACLVisibilityConfig> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebACL(String name, WebACLArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wafv2:WebACL", name, args == null ? WebACLArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebACL(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wafv2:WebACL", name, null, makeResourceOptions(options, id));
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
    public static WebACL get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebACL(name, id, options);
    }
}

// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.IamBlockedUserPropertiesArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.IamBlockedUserPropertiesState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/iamBlockedUserProperties:IamBlockedUserProperties")
public class IamBlockedUserProperties extends com.pulumi.resources.CustomResource {
    /**
     * List of properties to block for a user
     * 
     */
    @Export(name="blockedProperties", refs={List.class,Integer.class}, tree="[0,1]")
    private Output<List<Integer>> blockedProperties;

    /**
     * @return List of properties to block for a user
     * 
     */
    public Output<List<Integer>> blockedProperties() {
        return this.blockedProperties;
    }
    /**
     * A unique identifier for a group
     * 
     */
    @Export(name="groupId", refs={Integer.class}, tree="[0]")
    private Output<Integer> groupId;

    /**
     * @return A unique identifier for a group
     * 
     */
    public Output<Integer> groupId() {
        return this.groupId;
    }
    /**
     * A unique identifier for a user&#39;s profile, which corresponds to a user&#39;s actual profile or client ID
     * 
     */
    @Export(name="identityId", refs={String.class}, tree="[0]")
    private Output<String> identityId;

    /**
     * @return A unique identifier for a user&#39;s profile, which corresponds to a user&#39;s actual profile or client ID
     * 
     */
    public Output<String> identityId() {
        return this.identityId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IamBlockedUserProperties(java.lang.String name) {
        this(name, IamBlockedUserPropertiesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IamBlockedUserProperties(java.lang.String name, IamBlockedUserPropertiesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IamBlockedUserProperties(java.lang.String name, IamBlockedUserPropertiesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/iamBlockedUserProperties:IamBlockedUserProperties", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IamBlockedUserProperties(java.lang.String name, Output<java.lang.String> id, @Nullable IamBlockedUserPropertiesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/iamBlockedUserProperties:IamBlockedUserProperties", name, state, makeResourceOptions(options, id), false);
    }

    private static IamBlockedUserPropertiesArgs makeArgs(IamBlockedUserPropertiesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IamBlockedUserPropertiesArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IamBlockedUserProperties get(java.lang.String name, Output<java.lang.String> id, @Nullable IamBlockedUserPropertiesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IamBlockedUserProperties(name, id, state, options);
    }
}

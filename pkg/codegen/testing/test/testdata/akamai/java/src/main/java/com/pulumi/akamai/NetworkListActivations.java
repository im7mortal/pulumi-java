// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.NetworkListActivationsArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.NetworkListActivationsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/networkListActivations:NetworkListActivations")
public class NetworkListActivations extends com.pulumi.resources.CustomResource {
    /**
     * The Akamai network on which the list is activated: STAGING or PRODUCTION
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> network;

    /**
     * @return The Akamai network on which the list is activated: STAGING or PRODUCTION
     * 
     */
    public Output<Optional<String>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * Unique identifier of the network list
     * 
     */
    @Export(name="networkListId", refs={String.class}, tree="[0]")
    private Output<String> networkListId;

    /**
     * @return Unique identifier of the network list
     * 
     */
    public Output<String> networkListId() {
        return this.networkListId;
    }
    /**
     * Descriptive text to accompany the activation
     * 
     */
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notes;

    /**
     * @return Descriptive text to accompany the activation
     * 
     */
    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
    }
    /**
     * List of email addresses of Control Center users who receive an email when activation of this list is complete
     * 
     */
    @Export(name="notificationEmails", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> notificationEmails;

    /**
     * @return List of email addresses of Control Center users who receive an email when activation of this list is complete
     * 
     */
    public Output<List<String>> notificationEmails() {
        return this.notificationEmails;
    }
    /**
     * This network list&#39;s current activation status in the environment specified by the &#34;network&#34; attribute
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return This network list&#39;s current activation status in the environment specified by the &#34;network&#34; attribute
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Identifies the sync point of the network list to be activated
     * 
     */
    @Export(name="syncPoint", refs={Integer.class}, tree="[0]")
    private Output<Integer> syncPoint;

    /**
     * @return Identifies the sync point of the network list to be activated
     * 
     */
    public Output<Integer> syncPoint() {
        return this.syncPoint;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkListActivations(java.lang.String name) {
        this(name, NetworkListActivationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkListActivations(java.lang.String name, NetworkListActivationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkListActivations(java.lang.String name, NetworkListActivationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/networkListActivations:NetworkListActivations", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NetworkListActivations(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkListActivationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/networkListActivations:NetworkListActivations", name, state, makeResourceOptions(options, id), false);
    }

    private static NetworkListActivationsArgs makeArgs(NetworkListActivationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworkListActivationsArgs.Empty : args;
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
    public static NetworkListActivations get(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkListActivationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkListActivations(name, id, state, options);
    }
}

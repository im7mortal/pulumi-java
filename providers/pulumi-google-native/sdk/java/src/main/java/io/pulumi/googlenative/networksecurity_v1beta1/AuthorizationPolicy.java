// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networksecurity_v1beta1.AuthorizationPolicyArgs;
import io.pulumi.googlenative.networksecurity_v1beta1.outputs.RuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new AuthorizationPolicy in a given project and location.
 * 
 */
@ResourceType(type="google-native:networksecurity/v1beta1:AuthorizationPolicy")
public class AuthorizationPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The action to take when a rule match is found. Possible values are "ALLOW" or "DENY".
     * 
     */
    @OutputExport(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return The action to take when a rule match is found. Possible values are "ALLOW" or "DENY".
     * 
     */
    public Output<String> getAction() {
        return this.action;
    }
    /**
     * The timestamp when the resource was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Free-text description of the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Free-text description of the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Optional. Set of label tags associated with the AuthorizationPolicy resource.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Set of label tags associated with the AuthorizationPolicy resource.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Name of the AuthorizationPolicy resource. It matches pattern `projects/{project}/locations/{location}/authorizationPolicies/`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the AuthorizationPolicy resource. It matches pattern `projects/{project}/locations/{location}/authorizationPolicies/`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. List of rules to match. Note that at least one of the rules must match in order for the action specified in the 'action' field to be taken. A rule is a match if there is a matching source and destination. If left blank, the action specified in the `action` field will be applied on every request.
     * 
     */
    @OutputExport(name="rules", type=List.class, parameters={RuleResponse.class})
    private Output<List<RuleResponse>> rules;

    /**
     * @return Optional. List of rules to match. Note that at least one of the rules must match in order for the action specified in the 'action' field to be taken. A rule is a match if there is a matching source and destination. If left blank, the action specified in the `action` field will be applied on every request.
     * 
     */
    public Output<List<RuleResponse>> getRules() {
        return this.rules;
    }
    /**
     * The timestamp when the resource was updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(AuthorizationPolicyArgs.Builder a);
    }
    private static io.pulumi.googlenative.networksecurity_v1beta1.AuthorizationPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.networksecurity_v1beta1.AuthorizationPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AuthorizationPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthorizationPolicy(String name) {
        this(name, AuthorizationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthorizationPolicy(String name, AuthorizationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthorizationPolicy(String name, AuthorizationPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networksecurity/v1beta1:AuthorizationPolicy", name, args == null ? AuthorizationPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AuthorizationPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networksecurity/v1beta1:AuthorizationPolicy", name, null, makeResourceOptions(options, id));
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
    public static AuthorizationPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AuthorizationPolicy(name, id, options);
    }
}

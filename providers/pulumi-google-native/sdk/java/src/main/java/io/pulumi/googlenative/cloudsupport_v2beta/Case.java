// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsupport_v2beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudsupport_v2beta.CaseArgs;
import io.pulumi.googlenative.cloudsupport_v2beta.outputs.ActorResponse;
import io.pulumi.googlenative.cloudsupport_v2beta.outputs.CaseClassificationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create a new case and associate it with the given Cloud resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:cloudsupport/v2beta:Case")
public class Case extends io.pulumi.resources.CustomResource {
    /**
     * The issue classification applicable to this case.
     * 
     */
    @OutputExport(name="classification", type=CaseClassificationResponse.class, parameters={})
    private Output<CaseClassificationResponse> classification;

    /**
     * @return The issue classification applicable to this case.
     * 
     */
    public Output<CaseClassificationResponse> getClassification() {
        return this.classification;
    }
    /**
     * The time this case was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time this case was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The user who created the case. Note: The name and email will be obfuscated if the case was created by Google Support.
     * 
     */
    @OutputExport(name="creator", type=ActorResponse.class, parameters={})
    private Output<ActorResponse> creator;

    /**
     * @return The user who created the case. Note: The name and email will be obfuscated if the case was created by Google Support.
     * 
     */
    public Output<ActorResponse> getCreator() {
        return this.creator;
    }
    /**
     * A broad description of the issue.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A broad description of the issue.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The short summary of the issue reported in this case.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The short summary of the issue reported in this case.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Whether the case is currently escalated.
     * 
     */
    @OutputExport(name="escalated", type=Boolean.class, parameters={})
    private Output<Boolean> escalated;

    /**
     * @return Whether the case is currently escalated.
     * 
     */
    public Output<Boolean> getEscalated() {
        return this.escalated;
    }
    /**
     * The resource name for the case.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the case.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The priority of this case. If this is set, do not set severity.
     * 
     */
    @OutputExport(name="priority", type=String.class, parameters={})
    private Output<String> priority;

    /**
     * @return The priority of this case. If this is set, do not set severity.
     * 
     */
    public Output<String> getPriority() {
        return this.priority;
    }
    /**
     * The current status of the support case.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current status of the support case.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The email addresses to receive updates on this case.
     * 
     */
    @OutputExport(name="subscriberEmailAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> subscriberEmailAddresses;

    /**
     * @return The email addresses to receive updates on this case.
     * 
     */
    public Output<List<String>> getSubscriberEmailAddresses() {
        return this.subscriberEmailAddresses;
    }
    /**
     * Whether this case was created for internal API testing and should not be acted on by the support team.
     * 
     */
    @OutputExport(name="testCase", type=Boolean.class, parameters={})
    private Output<Boolean> testCase;

    /**
     * @return Whether this case was created for internal API testing and should not be acted on by the support team.
     * 
     */
    public Output<Boolean> getTestCase() {
        return this.testCase;
    }
    /**
     * The timezone of the user who created the support case. It should be in a format IANA recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
     * 
     */
    @OutputExport(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return The timezone of the user who created the support case. It should be in a format IANA recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }
    /**
     * The time this case was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time this case was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(CaseArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudsupport_v2beta.CaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudsupport_v2beta.CaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Case(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Case(String name) {
        this(name, CaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Case(String name, CaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Case(String name, CaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudsupport/v2beta:Case", name, args == null ? CaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Case(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudsupport/v2beta:Case", name, null, makeResourceOptions(options, id));
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
    public static Case get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Case(name, id, options);
    }
}

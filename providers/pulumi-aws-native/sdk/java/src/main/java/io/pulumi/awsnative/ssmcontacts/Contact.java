// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ssmcontacts.ContactArgs;
import io.pulumi.awsnative.ssmcontacts.enums.ContactType;
import io.pulumi.awsnative.ssmcontacts.outputs.ContactStage;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SSMContacts::Contact
 * 
 */
@ResourceType(type="aws-native:ssmcontacts:Contact")
public class Contact extends io.pulumi.resources.CustomResource {
    /**
     * Alias of the contact. String value with 20 to 256 characters. Only alphabetical, numeric characters, dash, or underscore allowed.
     * 
     */
    @OutputExport(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return Alias of the contact. String value with 20 to 256 characters. Only alphabetical, numeric characters, dash, or underscore allowed.
     * 
     */
    public Output<String> getAlias() {
        return this.alias;
    }
    /**
     * The Amazon Resource Name (ARN) of the contact.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the contact.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name of the contact. String value with 3 to 256 characters. Only alphabetical, space, numeric characters, dash, or underscore allowed.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Name of the contact. String value with 3 to 256 characters. Only alphabetical, space, numeric characters, dash, or underscore allowed.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The stages that an escalation plan or engagement plan engages contacts and contact methods in.
     * 
     */
    @OutputExport(name="plan", type=List.class, parameters={ContactStage.class})
    private Output<List<ContactStage>> plan;

    /**
     * @return The stages that an escalation plan or engagement plan engages contacts and contact methods in.
     * 
     */
    public Output<List<ContactStage>> getPlan() {
        return this.plan;
    }
    /**
     * Contact type, which specify type of contact. Currently supported values: “PERSONAL”, “SHARED”, “OTHER“.
     * 
     */
    @OutputExport(name="type", type=ContactType.class, parameters={})
    private Output<ContactType> type;

    /**
     * @return Contact type, which specify type of contact. Currently supported values: “PERSONAL”, “SHARED”, “OTHER“.
     * 
     */
    public Output<ContactType> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ContactArgs.Builder a);
    }
    private static io.pulumi.awsnative.ssmcontacts.ContactArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ssmcontacts.ContactArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Contact(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Contact(String name) {
        this(name, ContactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Contact(String name, ContactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Contact(String name, ContactArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssmcontacts:Contact", name, args == null ? ContactArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Contact(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssmcontacts:Contact", name, null, makeResourceOptions(options, id));
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
    public static Contact get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Contact(name, id, options);
    }
}

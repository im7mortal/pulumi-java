// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1beta1.Hl7V2StoreArgs;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.Hl7V2NotificationConfigResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.NotificationConfigResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.ParserConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new HL7v2 store within the parent dataset.
 * 
 */
@ResourceType(type="google-native:healthcare/v1beta1:Hl7V2Store")
public class Hl7V2Store extends io.pulumi.resources.CustomResource {
    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The notification destination all messages (both Ingest & Create) are published on. Only the message name is sent as part of the notification. If this is unset, no notifications are sent. Supplied by the client.
     * 
     */
    @OutputExport(name="notificationConfig", type=NotificationConfigResponse.class, parameters={})
    private Output<NotificationConfigResponse> notificationConfig;

    /**
     * @return The notification destination all messages (both Ingest & Create) are published on. Only the message name is sent as part of the notification. If this is unset, no notifications are sent. Supplied by the client.
     * 
     */
    public Output<NotificationConfigResponse> getNotificationConfig() {
        return this.notificationConfig;
    }
    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest & Create) on the corresponding notification destination. Only the message name is sent as part of the notification. Supplied by the client.
     * 
     */
    @OutputExport(name="notificationConfigs", type=List.class, parameters={Hl7V2NotificationConfigResponse.class})
    private Output<List<Hl7V2NotificationConfigResponse>> notificationConfigs;

    /**
     * @return A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest & Create) on the corresponding notification destination. Only the message name is sent as part of the notification. Supplied by the client.
     * 
     */
    public Output<List<Hl7V2NotificationConfigResponse>> getNotificationConfigs() {
        return this.notificationConfigs;
    }
    /**
     * The configuration for the parser. It determines how the server parses the messages.
     * 
     */
    @OutputExport(name="parserConfig", type=ParserConfigResponse.class, parameters={})
    private Output<ParserConfigResponse> parserConfig;

    /**
     * @return The configuration for the parser. It determines how the server parses the messages.
     * 
     */
    public Output<ParserConfigResponse> getParserConfig() {
        return this.parserConfig;
    }
    /**
     * Determines whether to reject duplicate messages. A duplicate message is a message with the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The default value is false, meaning that the store accepts the duplicate messages and it also returns the same ACK message in the IngestMessageResponse as has been returned previously. Note that only one resource is created in the store. When this field is set to true, CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store, and IngestMessageErrorDetail returns a NACK message upon rejection.
     * 
     */
    @OutputExport(name="rejectDuplicateMessage", type=Boolean.class, parameters={})
    private Output<Boolean> rejectDuplicateMessage;

    /**
     * @return Determines whether to reject duplicate messages. A duplicate message is a message with the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The default value is false, meaning that the store accepts the duplicate messages and it also returns the same ACK message in the IngestMessageResponse as has been returned previously. Note that only one resource is created in the store. When this field is set to true, CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store, and IngestMessageErrorDetail returns a NACK message upon rejection.
     * 
     */
    public Output<Boolean> getRejectDuplicateMessage() {
        return this.rejectDuplicateMessage;
    }

    public interface BuilderApplicator {
        public void apply(Hl7V2StoreArgs.Builder a);
    }
    private static io.pulumi.googlenative.healthcare_v1beta1.Hl7V2StoreArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.healthcare_v1beta1.Hl7V2StoreArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Hl7V2Store(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Hl7V2Store(String name) {
        this(name, Hl7V2StoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Hl7V2Store(String name, Hl7V2StoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Hl7V2Store(String name, Hl7V2StoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1beta1:Hl7V2Store", name, args == null ? Hl7V2StoreArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Hl7V2Store(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1beta1:Hl7V2Store", name, null, makeResourceOptions(options, id));
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
    public static Hl7V2Store get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Hl7V2Store(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.NamespaceArgs;
import io.pulumi.azurenative.eventhub.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Single Namespace item in List or Get Operation
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventhub:Namespace sdk-Namespace-5849 /subscriptions/5f750a97-50d9-4e36-8081-c9ee4c0210d4/resourceGroups/ArunMonocle/providers/Microsoft.EventHub/namespaces/sdk-Namespace-5849 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:Namespace")
public class Namespace extends io.pulumi.resources.CustomResource {
    /**
     * The time the Namespace was created.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time the Namespace was created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Value that indicates whether AutoInflate is enabled for eventhub namespace.
     * 
     */
    @OutputExport(name="isAutoInflateEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isAutoInflateEnabled;

    /**
     * @return Value that indicates whether AutoInflate is enabled for eventhub namespace.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsAutoInflateEnabled() {
        return this.isAutoInflateEnabled;
    }
    /**
     * Value that indicates whether Kafka is enabled for eventhub namespace.
     * 
     */
    @OutputExport(name="kafkaEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> kafkaEnabled;

    /**
     * @return Value that indicates whether Kafka is enabled for eventhub namespace.
     * 
     */
    public Output</* @Nullable */ Boolean> getKafkaEnabled() {
        return this.kafkaEnabled;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Upper limit of throughput units when AutoInflate is enabled, value should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true)
     * 
     */
    @OutputExport(name="maximumThroughputUnits", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumThroughputUnits;

    /**
     * @return Upper limit of throughput units when AutoInflate is enabled, value should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true)
     * 
     */
    public Output</* @Nullable */ Integer> getMaximumThroughputUnits() {
        return this.maximumThroughputUnits;
    }
    /**
     * Identifier for Azure Insights metrics.
     * 
     */
    @OutputExport(name="metricId", type=String.class, parameters={})
    private Output<String> metricId;

    /**
     * @return Identifier for Azure Insights metrics.
     * 
     */
    public Output<String> getMetricId() {
        return this.metricId;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state of the Namespace.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the Namespace.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Endpoint you can use to perform Service Bus operations.
     * 
     */
    @OutputExport(name="serviceBusEndpoint", type=String.class, parameters={})
    private Output<String> serviceBusEndpoint;

    /**
     * @return Endpoint you can use to perform Service Bus operations.
     * 
     */
    public Output<String> getServiceBusEndpoint() {
        return this.serviceBusEndpoint;
    }
    /**
     * Properties of sku resource
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Properties of sku resource
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The time the Namespace was updated.
     * 
     */
    @OutputExport(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The time the Namespace was updated.
     * 
     */
    public Output<String> getUpdatedAt() {
        return this.updatedAt;
    }

    public interface BuilderApplicator {
        public void apply(NamespaceArgs.Builder a);
    }
    private static io.pulumi.azurenative.eventhub.NamespaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.eventhub.NamespaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Namespace(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Namespace(String name) {
        this(name, NamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Namespace(String name, NamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Namespace(String name, NamespaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Namespace(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:Namespace", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:eventhub/v20140901:Namespace").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20150801:Namespace").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20170401:Namespace").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20180101preview:Namespace").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20210101preview:Namespace").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20210601preview:Namespace").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20211101:Namespace").build())
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
    public static Namespace get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, options);
    }
}

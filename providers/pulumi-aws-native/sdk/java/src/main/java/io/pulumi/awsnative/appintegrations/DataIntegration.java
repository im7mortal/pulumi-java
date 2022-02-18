// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appintegrations.DataIntegrationArgs;
import io.pulumi.awsnative.appintegrations.outputs.DataIntegrationScheduleConfig;
import io.pulumi.awsnative.appintegrations.outputs.DataIntegrationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::AppIntegrations::DataIntegration
 * 
 */
@ResourceType(type="aws-native:appintegrations:DataIntegration")
public class DataIntegration extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the data integration.
     * 
     */
    @OutputExport(name="dataIntegrationArn", type=String.class, parameters={})
    private Output<String> dataIntegrationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the data integration.
     * 
     */
    public Output<String> getDataIntegrationArn() {
        return this.dataIntegrationArn;
    }
    /**
     * The data integration description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The data integration description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The KMS key of the data integration.
     * 
     */
    @OutputExport(name="kmsKey", type=String.class, parameters={})
    private Output<String> kmsKey;

    /**
     * @return The KMS key of the data integration.
     * 
     */
    public Output<String> getKmsKey() {
        return this.kmsKey;
    }
    /**
     * The name of the data integration.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the data integration.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of the data and how often it should be pulled from the source.
     * 
     */
    @OutputExport(name="scheduleConfig", type=DataIntegrationScheduleConfig.class, parameters={})
    private Output<DataIntegrationScheduleConfig> scheduleConfig;

    /**
     * @return The name of the data and how often it should be pulled from the source.
     * 
     */
    public Output<DataIntegrationScheduleConfig> getScheduleConfig() {
        return this.scheduleConfig;
    }
    /**
     * The URI of the data source.
     * 
     */
    @OutputExport(name="sourceURI", type=String.class, parameters={})
    private Output<String> sourceURI;

    /**
     * @return The URI of the data source.
     * 
     */
    public Output<String> getSourceURI() {
        return this.sourceURI;
    }
    /**
     * The tags (keys and values) associated with the data integration.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DataIntegrationTag.class})
    private Output</* @Nullable */ List<DataIntegrationTag>> tags;

    /**
     * @return The tags (keys and values) associated with the data integration.
     * 
     */
    public Output</* @Nullable */ List<DataIntegrationTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataIntegration(String name, DataIntegrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appintegrations:DataIntegration", name, args == null ? DataIntegrationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataIntegration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appintegrations:DataIntegration", name, null, makeResourceOptions(options, id));
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
    public static DataIntegration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataIntegration(name, id, options);
    }
}

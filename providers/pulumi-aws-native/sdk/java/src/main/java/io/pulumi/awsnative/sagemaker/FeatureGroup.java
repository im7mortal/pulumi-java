// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.FeatureGroupArgs;
import io.pulumi.awsnative.sagemaker.outputs.FeatureGroupFeatureDefinition;
import io.pulumi.awsnative.sagemaker.outputs.FeatureGroupTag;
import io.pulumi.awsnative.sagemaker.outputs.OfflineStoreConfigProperties;
import io.pulumi.awsnative.sagemaker.outputs.OnlineStoreConfigProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::FeatureGroup
 * 
 */
@ResourceType(type="aws-native:sagemaker:FeatureGroup")
public class FeatureGroup extends io.pulumi.resources.CustomResource {
    /**
     * Description about the FeatureGroup.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description about the FeatureGroup.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The Event Time Feature Name.
     * 
     */
    @OutputExport(name="eventTimeFeatureName", type=String.class, parameters={})
    private Output<String> eventTimeFeatureName;

    /**
     * @return The Event Time Feature Name.
     * 
     */
    public Output<String> getEventTimeFeatureName() {
        return this.eventTimeFeatureName;
    }
    /**
     * An Array of Feature Definition
     * 
     */
    @OutputExport(name="featureDefinitions", type=List.class, parameters={FeatureGroupFeatureDefinition.class})
    private Output<List<FeatureGroupFeatureDefinition>> featureDefinitions;

    /**
     * @return An Array of Feature Definition
     * 
     */
    public Output<List<FeatureGroupFeatureDefinition>> getFeatureDefinitions() {
        return this.featureDefinitions;
    }
    /**
     * The Name of the FeatureGroup.
     * 
     */
    @OutputExport(name="featureGroupName", type=String.class, parameters={})
    private Output<String> featureGroupName;

    /**
     * @return The Name of the FeatureGroup.
     * 
     */
    public Output<String> getFeatureGroupName() {
        return this.featureGroupName;
    }
    @OutputExport(name="offlineStoreConfig", type=OfflineStoreConfigProperties.class, parameters={})
    private Output</* @Nullable */ OfflineStoreConfigProperties> offlineStoreConfig;

    public Output</* @Nullable */ OfflineStoreConfigProperties> getOfflineStoreConfig() {
        return this.offlineStoreConfig;
    }
    @OutputExport(name="onlineStoreConfig", type=OnlineStoreConfigProperties.class, parameters={})
    private Output</* @Nullable */ OnlineStoreConfigProperties> onlineStoreConfig;

    public Output</* @Nullable */ OnlineStoreConfigProperties> getOnlineStoreConfig() {
        return this.onlineStoreConfig;
    }
    /**
     * The Record Identifier Feature Name.
     * 
     */
    @OutputExport(name="recordIdentifierFeatureName", type=String.class, parameters={})
    private Output<String> recordIdentifierFeatureName;

    /**
     * @return The Record Identifier Feature Name.
     * 
     */
    public Output<String> getRecordIdentifierFeatureName() {
        return this.recordIdentifierFeatureName;
    }
    /**
     * Role Arn
     * 
     */
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return Role Arn
     * 
     */
    public Output</* @Nullable */ String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * An array of key-value pair to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={FeatureGroupTag.class})
    private Output</* @Nullable */ List<FeatureGroupTag>> tags;

    /**
     * @return An array of key-value pair to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<FeatureGroupTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(FeatureGroupArgs.Builder a);
    }
    private static io.pulumi.awsnative.sagemaker.FeatureGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.sagemaker.FeatureGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FeatureGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FeatureGroup(String name) {
        this(name, FeatureGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FeatureGroup(String name, FeatureGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FeatureGroup(String name, FeatureGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:FeatureGroup", name, args == null ? FeatureGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FeatureGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:FeatureGroup", name, null, makeResourceOptions(options, id));
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
    public static FeatureGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FeatureGroup(name, id, options);
    }
}

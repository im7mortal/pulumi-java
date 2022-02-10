// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.streamanalytics.StreamingJobArgs;
import io.pulumi.azurenative.streamanalytics.outputs.FunctionResponse;
import io.pulumi.azurenative.streamanalytics.outputs.InputResponse;
import io.pulumi.azurenative.streamanalytics.outputs.OutputResponse;
import io.pulumi.azurenative.streamanalytics.outputs.SkuResponse;
import io.pulumi.azurenative.streamanalytics.outputs.TransformationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:streamanalytics:StreamingJob")
public class StreamingJob extends io.pulumi.resources.CustomResource {
    @OutputExport(name="compatibilityLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> compatibilityLevel;

    public Output</* @Nullable */ String> getCompatibilityLevel() {
        return this.compatibilityLevel;
    }
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    @OutputExport(name="dataLocale", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataLocale;

    public Output</* @Nullable */ String> getDataLocale() {
        return this.dataLocale;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="eventsLateArrivalMaxDelayInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> eventsLateArrivalMaxDelayInSeconds;

    public Output</* @Nullable */ Integer> getEventsLateArrivalMaxDelayInSeconds() {
        return this.eventsLateArrivalMaxDelayInSeconds;
    }
    @OutputExport(name="eventsOutOfOrderMaxDelayInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> eventsOutOfOrderMaxDelayInSeconds;

    public Output</* @Nullable */ Integer> getEventsOutOfOrderMaxDelayInSeconds() {
        return this.eventsOutOfOrderMaxDelayInSeconds;
    }
    @OutputExport(name="eventsOutOfOrderPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventsOutOfOrderPolicy;

    public Output</* @Nullable */ String> getEventsOutOfOrderPolicy() {
        return this.eventsOutOfOrderPolicy;
    }
    @OutputExport(name="functions", type=List.class, parameters={FunctionResponse.class})
    private Output</* @Nullable */ List<FunctionResponse>> functions;

    public Output</* @Nullable */ List<FunctionResponse>> getFunctions() {
        return this.functions;
    }
    @OutputExport(name="inputs", type=List.class, parameters={InputResponse.class})
    private Output</* @Nullable */ List<InputResponse>> inputs;

    public Output</* @Nullable */ List<InputResponse>> getInputs() {
        return this.inputs;
    }
    @OutputExport(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId;
    }
    @OutputExport(name="jobState", type=String.class, parameters={})
    private Output<String> jobState;

    public Output<String> getJobState() {
        return this.jobState;
    }
    @OutputExport(name="lastOutputEventTime", type=String.class, parameters={})
    private Output<String> lastOutputEventTime;

    public Output<String> getLastOutputEventTime() {
        return this.lastOutputEventTime;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="outputErrorPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputErrorPolicy;

    public Output</* @Nullable */ String> getOutputErrorPolicy() {
        return this.outputErrorPolicy;
    }
    @OutputExport(name="outputStartMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputStartMode;

    public Output</* @Nullable */ String> getOutputStartMode() {
        return this.outputStartMode;
    }
    @OutputExport(name="outputStartTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputStartTime;

    public Output</* @Nullable */ String> getOutputStartTime() {
        return this.outputStartTime;
    }
    @OutputExport(name="outputs", type=List.class, parameters={OutputResponse.class})
    private Output</* @Nullable */ List<OutputResponse>> outputs;

    public Output</* @Nullable */ List<OutputResponse>> getOutputs() {
        return this.outputs;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="transformation", type=TransformationResponse.class, parameters={})
    private Output</* @Nullable */ TransformationResponse> transformation;

    public Output</* @Nullable */ TransformationResponse> getTransformation() {
        return this.transformation;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public StreamingJob(String name, StreamingJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:StreamingJob", name, args == null ? StreamingJobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StreamingJob(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:StreamingJob", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20160301:StreamingJob").build()),
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20170401preview:StreamingJob").build()),
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20200301:StreamingJob").build()),
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20211001preview:StreamingJob").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static StreamingJob get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StreamingJob(name, id, options);
    }
}
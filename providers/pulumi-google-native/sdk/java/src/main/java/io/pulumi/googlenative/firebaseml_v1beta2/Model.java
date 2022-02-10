// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseml_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebaseml_v1beta2.ModelArgs;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.ModelStateResponse;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.OperationResponse;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.TfLiteModelResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:firebaseml/v1beta2:Model")
public class Model extends io.pulumi.resources.CustomResource {
    @OutputExport(name="activeOperations", type=List.class, parameters={OperationResponse.class})
    private Output<List<OperationResponse>> activeOperations;

    public Output<List<OperationResponse>> getActiveOperations() {
        return this.activeOperations;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="modelHash", type=String.class, parameters={})
    private Output<String> modelHash;

    public Output<String> getModelHash() {
        return this.modelHash;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="state", type=ModelStateResponse.class, parameters={})
    private Output<ModelStateResponse> state;

    public Output<ModelStateResponse> getState() {
        return this.state;
    }
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tfliteModel", type=TfLiteModelResponse.class, parameters={})
    private Output<TfLiteModelResponse> tfliteModel;

    public Output<TfLiteModelResponse> getTfliteModel() {
        return this.tfliteModel;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public Model(String name, ModelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebaseml/v1beta2:Model", name, args == null ? ModelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Model(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebaseml/v1beta2:Model", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Model get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Model(name, id, options);
    }
}
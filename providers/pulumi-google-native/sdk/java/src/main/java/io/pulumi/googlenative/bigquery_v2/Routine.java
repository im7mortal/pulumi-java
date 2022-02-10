// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigquery_v2.RoutineArgs;
import io.pulumi.googlenative.bigquery_v2.outputs.ArgumentResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.RoutineReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.StandardSqlDataTypeResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.StandardSqlTableTypeResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:bigquery/v2:Routine")
public class Routine extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arguments", type=List.class, parameters={ArgumentResponse.class})
    private Output<List<ArgumentResponse>> arguments;

    public Output<List<ArgumentResponse>> getArguments() {
        return this.arguments;
    }
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="definitionBody", type=String.class, parameters={})
    private Output<String> definitionBody;

    public Output<String> getDefinitionBody() {
        return this.definitionBody;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="determinismLevel", type=String.class, parameters={})
    private Output<String> determinismLevel;

    public Output<String> getDeterminismLevel() {
        return this.determinismLevel;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="importedLibraries", type=List.class, parameters={String.class})
    private Output<List<String>> importedLibraries;

    public Output<List<String>> getImportedLibraries() {
        return this.importedLibraries;
    }
    @OutputExport(name="language", type=String.class, parameters={})
    private Output<String> language;

    public Output<String> getLanguage() {
        return this.language;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="returnTableType", type=StandardSqlTableTypeResponse.class, parameters={})
    private Output<StandardSqlTableTypeResponse> returnTableType;

    public Output<StandardSqlTableTypeResponse> getReturnTableType() {
        return this.returnTableType;
    }
    @OutputExport(name="returnType", type=StandardSqlDataTypeResponse.class, parameters={})
    private Output<StandardSqlDataTypeResponse> returnType;

    public Output<StandardSqlDataTypeResponse> getReturnType() {
        return this.returnType;
    }
    @OutputExport(name="routineReference", type=RoutineReferenceResponse.class, parameters={})
    private Output<RoutineReferenceResponse> routineReference;

    public Output<RoutineReferenceResponse> getRoutineReference() {
        return this.routineReference;
    }
    @OutputExport(name="routineType", type=String.class, parameters={})
    private Output<String> routineType;

    public Output<String> getRoutineType() {
        return this.routineType;
    }
    @OutputExport(name="strictMode", type=Boolean.class, parameters={})
    private Output<Boolean> strictMode;

    public Output<Boolean> getStrictMode() {
        return this.strictMode;
    }

    public Routine(String name, RoutineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquery/v2:Routine", name, args == null ? RoutineArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Routine(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquery/v2:Routine", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Routine get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Routine(name, id, options);
    }
}
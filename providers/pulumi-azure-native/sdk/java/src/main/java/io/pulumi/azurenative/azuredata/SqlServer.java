// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azuredata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azuredata.SqlServerArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:azuredata:SqlServer")
public class SqlServer extends io.pulumi.resources.CustomResource {
    @OutputExport(name="cores", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cores;

    public Output</* @Nullable */ Integer> getCores() {
        return this.cores;
    }
    @OutputExport(name="edition", type=String.class, parameters={})
    private Output</* @Nullable */ String> edition;

    public Output</* @Nullable */ String> getEdition() {
        return this.edition;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="propertyBag", type=String.class, parameters={})
    private Output</* @Nullable */ String> propertyBag;

    public Output</* @Nullable */ String> getPropertyBag() {
        return this.propertyBag;
    }
    @OutputExport(name="registrationID", type=String.class, parameters={})
    private Output</* @Nullable */ String> registrationID;

    public Output</* @Nullable */ String> getRegistrationID() {
        return this.registrationID;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    public SqlServer(String name, SqlServerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azuredata:SqlServer", name, args == null ? SqlServerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SqlServer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azuredata:SqlServer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:azuredata/v20170301preview:SqlServer").build()),
                Input.of(Alias.builder().setType("azure-native:azuredata/v20190724preview:SqlServer").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SqlServer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlServer(name, id, options);
    }
}
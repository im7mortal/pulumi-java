// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.ScheduleArgs;
import io.pulumi.azurenative.labservices.outputs.RecurrencePatternResponse;
import io.pulumi.azurenative.labservices.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:labservices:Schedule")
public class Schedule extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    public Output</* @Nullable */ String> getNotes() {
        return this.notes;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="recurrencePattern", type=RecurrencePatternResponse.class, parameters={})
    private Output</* @Nullable */ RecurrencePatternResponse> recurrencePattern;

    public Output</* @Nullable */ RecurrencePatternResponse> getRecurrencePattern() {
        return this.recurrencePattern;
    }
    @OutputExport(name="startAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> startAt;

    public Output</* @Nullable */ String> getStartAt() {
        return this.startAt;
    }
    @OutputExport(name="stopAt", type=String.class, parameters={})
    private Output<String> stopAt;

    public Output<String> getStopAt() {
        return this.stopAt;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="timeZoneId", type=String.class, parameters={})
    private Output<String> timeZoneId;

    public Output<String> getTimeZoneId() {
        return this.timeZoneId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Schedule(String name, ScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:Schedule", name, args == null ? ScheduleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Schedule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:Schedule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:labservices/v20211001preview:Schedule").build()),
                Input.of(Alias.builder().setType("azure-native:labservices/v20211115preview:Schedule").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Schedule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, options);
    }
}
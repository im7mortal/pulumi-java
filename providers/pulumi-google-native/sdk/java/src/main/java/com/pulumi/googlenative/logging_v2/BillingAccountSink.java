// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.logging_v2.BillingAccountSinkArgs;
import com.pulumi.googlenative.logging_v2.outputs.BigQueryOptionsResponse;
import com.pulumi.googlenative.logging_v2.outputs.LogExclusionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a sink that exports specified log entries to a destination. The export of newly-ingested log entries begins immediately, unless the sink&#39;s writer_identity is not permitted to write to the destination. A sink can export log entries only from the resource owning the sink.
 * 
 */
@ResourceType(type="google-native:logging/v2:BillingAccountSink")
public class BillingAccountSink extends com.pulumi.resources.CustomResource {
    /**
     * Optional. Options that affect sinks exporting data to BigQuery.
     * 
     */
    @Export(name="bigqueryOptions", type=BigQueryOptionsResponse.class, parameters={})
    private Output<BigQueryOptionsResponse> bigqueryOptions;

    /**
     * @return Optional. Options that affect sinks exporting data to BigQuery.
     * 
     */
    public Output<BigQueryOptionsResponse> bigqueryOptions() {
        return this.bigqueryOptions;
    }
    /**
     * The creation timestamp of the sink.This field may not be present for older sinks.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of the sink.This field may not be present for older sinks.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. A description of this sink.The maximum length of the description is 8000 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A description of this sink.The maximum length of the description is 8000 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The export destination: &#34;storage.googleapis.com/[GCS_BUCKET]&#34; &#34;bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]&#34; &#34;pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]&#34; The sink&#39;s writer_identity, set when the sink is created, must have permission to write to the destination or else the log entries are not exported. For more information, see Exporting Logs with Sinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).
     * 
     */
    @Export(name="destination", type=String.class, parameters={})
    private Output<String> destination;

    /**
     * @return The export destination: &#34;storage.googleapis.com/[GCS_BUCKET]&#34; &#34;bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]&#34; &#34;pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]&#34; The sink&#39;s writer_identity, set when the sink is created, must have permission to write to the destination or else the log entries are not exported. For more information, see Exporting Logs with Sinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).
     * 
     */
    public Output<String> destination() {
        return this.destination;
    }
    /**
     * Optional. If set to true, then this sink is disabled and it does not export any log entries.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return Optional. If set to true, then this sink is disabled and it does not export any log entries.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }
    /**
     * Optional. Log entries that match any of these exclusion filters will not be exported.If a log entry is matched by both filter and one of exclusion_filters it will not be exported.
     * 
     */
    @Export(name="exclusions", type=List.class, parameters={LogExclusionResponse.class})
    private Output<List<LogExclusionResponse>> exclusions;

    /**
     * @return Optional. Log entries that match any of these exclusion filters will not be exported.If a log entry is matched by both filter and one of exclusion_filters it will not be exported.
     * 
     */
    public Output<List<LogExclusionResponse>> exclusions() {
        return this.exclusions;
    }
    /**
     * Optional. An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries). The only exported log entries are those that are in the resource owning the sink and that match the filter.For example:logName=&#34;projects/[PROJECT_ID]/logs/[LOG_ID]&#34; AND severity&gt;=ERROR
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return Optional. An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries). The only exported log entries are those that are in the resource owning the sink and that match the filter.For example:logName=&#34;projects/[PROJECT_ID]/logs/[LOG_ID]&#34; AND severity&gt;=ERROR
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }
    /**
     * Optional. This field applies only to sinks owned by organizations and folders. If the field is false, the default, only the logs owned by the sink&#39;s parent resource are available for export. If the field is true, then log entries from all the projects, folders, and billing accounts contained in the sink&#39;s parent resource are also available for export. Whether a particular log entry from the children is exported depends on the sink&#39;s filter expression.For example, if this field is true, then the filter resource.type=gce_instance would export all Compute Engine VM instance log entries from all projects in the sink&#39;s parent.To only export entries from certain child projects, filter on the project part of the log name:logName:(&#34;projects/test-project1/&#34; OR &#34;projects/test-project2/&#34;) AND resource.type=gce_instance
     * 
     */
    @Export(name="includeChildren", type=Boolean.class, parameters={})
    private Output<Boolean> includeChildren;

    /**
     * @return Optional. This field applies only to sinks owned by organizations and folders. If the field is false, the default, only the logs owned by the sink&#39;s parent resource are available for export. If the field is true, then log entries from all the projects, folders, and billing accounts contained in the sink&#39;s parent resource are also available for export. Whether a particular log entry from the children is exported depends on the sink&#39;s filter expression.For example, if this field is true, then the filter resource.type=gce_instance would export all Compute Engine VM instance log entries from all projects in the sink&#39;s parent.To only export entries from certain child projects, filter on the project part of the log name:logName:(&#34;projects/test-project1/&#34; OR &#34;projects/test-project2/&#34;) AND resource.type=gce_instance
     * 
     */
    public Output<Boolean> includeChildren() {
        return this.includeChildren;
    }
    /**
     * The client-assigned sink identifier, unique within the project.For example: &#34;my-syslog-errors-to-pubsub&#34;. Sink identifiers are limited to 100 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The client-assigned sink identifier, unique within the project.For example: &#34;my-syslog-errors-to-pubsub&#34;. Sink identifiers are limited to 100 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Deprecated. This field is unused.
     * 
     * @deprecated
     * Deprecated. This field is unused.
     * 
     */
    @Deprecated /* Deprecated. This field is unused. */
    @Export(name="outputVersionFormat", type=String.class, parameters={})
    private Output<String> outputVersionFormat;

    /**
     * @return Deprecated. This field is unused.
     * 
     */
    public Output<String> outputVersionFormat() {
        return this.outputVersionFormat;
    }
    /**
     * The last update timestamp of the sink.This field may not be present for older sinks.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update timestamp of the sink.This field may not be present for older sinks.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * An IAM identity—a service account or group—under which Cloud Logging writes the exported log entries to the sink&#39;s destination. This field is set by sinks.create and sinks.update based on the value of unique_writer_identity in those methods.Until you grant this identity write-access to the destination, log entry exports from this sink will fail. For more information, see Granting Access for a Resource (https://cloud.google.com/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). Consult the destination service&#39;s documentation to determine the appropriate IAM roles to assign to the identity.Sinks that have a destination that is a log bucket in the same project as the sink do not have a writer_identity and no additional permissions are required.
     * 
     */
    @Export(name="writerIdentity", type=String.class, parameters={})
    private Output<String> writerIdentity;

    /**
     * @return An IAM identity—a service account or group—under which Cloud Logging writes the exported log entries to the sink&#39;s destination. This field is set by sinks.create and sinks.update based on the value of unique_writer_identity in those methods.Until you grant this identity write-access to the destination, log entry exports from this sink will fail. For more information, see Granting Access for a Resource (https://cloud.google.com/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). Consult the destination service&#39;s documentation to determine the appropriate IAM roles to assign to the identity.Sinks that have a destination that is a log bucket in the same project as the sink do not have a writer_identity and no additional permissions are required.
     * 
     */
    public Output<String> writerIdentity() {
        return this.writerIdentity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BillingAccountSink(String name) {
        this(name, BillingAccountSinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BillingAccountSink(String name, BillingAccountSinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BillingAccountSink(String name, BillingAccountSinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:logging/v2:BillingAccountSink", name, args == null ? BillingAccountSinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BillingAccountSink(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:logging/v2:BillingAccountSink", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BillingAccountSink get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BillingAccountSink(name, id, options);
    }
}

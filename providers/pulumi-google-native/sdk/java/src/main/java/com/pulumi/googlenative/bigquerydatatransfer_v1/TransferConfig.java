// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquerydatatransfer_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.bigquerydatatransfer_v1.TransferConfigArgs;
import com.pulumi.googlenative.bigquerydatatransfer_v1.outputs.EmailPreferencesResponse;
import com.pulumi.googlenative.bigquerydatatransfer_v1.outputs.ScheduleOptionsResponse;
import com.pulumi.googlenative.bigquerydatatransfer_v1.outputs.UserInfoResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new data transfer configuration.
 * 
 */
@ResourceType(type="google-native:bigquerydatatransfer/v1:TransferConfig")
public class TransferConfig extends com.pulumi.resources.CustomResource {
    /**
     * The number of days to look back to automatically refresh the data. For example, if `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10, today-1], rather than ingesting data for just [today-1]. Only valid if the data source supports the feature. Set the value to 0 to use the default value.
     * 
     */
    @Export(name="dataRefreshWindowDays", type=Integer.class, parameters={})
    private Output<Integer> dataRefreshWindowDays;

    /**
     * @return The number of days to look back to automatically refresh the data. For example, if `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10, today-1], rather than ingesting data for just [today-1]. Only valid if the data source supports the feature. Set the value to 0 to use the default value.
     * 
     */
    public Output<Integer> dataRefreshWindowDays() {
        return this.dataRefreshWindowDays;
    }
    /**
     * Data source id. Cannot be changed once data transfer is created.
     * 
     */
    @Export(name="dataSourceId", type=String.class, parameters={})
    private Output<String> dataSourceId;

    /**
     * @return Data source id. Cannot be changed once data transfer is created.
     * 
     */
    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Region in which BigQuery dataset is located.
     * 
     */
    @Export(name="datasetRegion", type=String.class, parameters={})
    private Output<String> datasetRegion;

    /**
     * @return Region in which BigQuery dataset is located.
     * 
     */
    public Output<String> datasetRegion() {
        return this.datasetRegion;
    }
    /**
     * The BigQuery target dataset id.
     * 
     */
    @Export(name="destinationDatasetId", type=String.class, parameters={})
    private Output<String> destinationDatasetId;

    /**
     * @return The BigQuery target dataset id.
     * 
     */
    public Output<String> destinationDatasetId() {
        return this.destinationDatasetId;
    }
    /**
     * Is this config disabled. When set to true, no runs are scheduled for a given transfer.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return Is this config disabled. When set to true, no runs are scheduled for a given transfer.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }
    /**
     * User specified display name for the data transfer.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User specified display name for the data transfer.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Email notifications will be sent according to these preferences to the email address of the user who owns this transfer config.
     * 
     */
    @Export(name="emailPreferences", type=EmailPreferencesResponse.class, parameters={})
    private Output<EmailPreferencesResponse> emailPreferences;

    /**
     * @return Email notifications will be sent according to these preferences to the email address of the user who owns this transfer config.
     * 
     */
    public Output<EmailPreferencesResponse> emailPreferences() {
        return this.emailPreferences;
    }
    /**
     * The resource name of the transfer config. Transfer config names have the form `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is usually a uuid, even though it is not guaranteed or required. The name is ignored when creating a transfer config.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the transfer config. Transfer config names have the form `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is usually a uuid, even though it is not guaranteed or required. The name is ignored when creating a transfer config.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Next time when data transfer will run.
     * 
     */
    @Export(name="nextRunTime", type=String.class, parameters={})
    private Output<String> nextRunTime;

    /**
     * @return Next time when data transfer will run.
     * 
     */
    public Output<String> nextRunTime() {
        return this.nextRunTime;
    }
    /**
     * Pub/Sub topic where notifications will be sent after transfer runs associated with this transfer config finish. The format for specifying a pubsub topic is: `projects/{project}/topics/{topic}`
     * 
     */
    @Export(name="notificationPubsubTopic", type=String.class, parameters={})
    private Output<String> notificationPubsubTopic;

    /**
     * @return Pub/Sub topic where notifications will be sent after transfer runs associated with this transfer config finish. The format for specifying a pubsub topic is: `projects/{project}/topics/{topic}`
     * 
     */
    public Output<String> notificationPubsubTopic() {
        return this.notificationPubsubTopic;
    }
    /**
     * Information about the user whose credentials are used to transfer data. Populated only for `transferConfigs.get` requests. In case the user information is not available, this field will not be populated.
     * 
     */
    @Export(name="ownerInfo", type=UserInfoResponse.class, parameters={})
    private Output<UserInfoResponse> ownerInfo;

    /**
     * @return Information about the user whose credentials are used to transfer data. Populated only for `transferConfigs.get` requests. In case the user information is not available, this field will not be populated.
     * 
     */
    public Output<UserInfoResponse> ownerInfo() {
        return this.ownerInfo;
    }
    /**
     * Parameters specific to each data source. For more information see the bq tab in the &#39;Setting up a data transfer&#39; section for each data source. For example the parameters for Cloud Storage transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    @Export(name="params", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> params;

    /**
     * @return Parameters specific to each data source. For more information see the bq tab in the &#39;Setting up a data transfer&#39; section for each data source. For example the parameters for Cloud Storage transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    public Output<Map<String,String>> params() {
        return this.params;
    }
    /**
     * Data transfer schedule. If the data source does not support a custom schedule, this should be empty. If it is empty, the default value for the data source will be used. The specified times are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation about the format here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format NOTE: The minimum interval time between recurring transfers depends on the data source; refer to the documentation for your data source.
     * 
     */
    @Export(name="schedule", type=String.class, parameters={})
    private Output<String> schedule;

    /**
     * @return Data transfer schedule. If the data source does not support a custom schedule, this should be empty. If it is empty, the default value for the data source will be used. The specified times are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation about the format here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format NOTE: The minimum interval time between recurring transfers depends on the data source; refer to the documentation for your data source.
     * 
     */
    public Output<String> schedule() {
        return this.schedule;
    }
    /**
     * Options customizing the data transfer schedule.
     * 
     */
    @Export(name="scheduleOptions", type=ScheduleOptionsResponse.class, parameters={})
    private Output<ScheduleOptionsResponse> scheduleOptions;

    /**
     * @return Options customizing the data transfer schedule.
     * 
     */
    public Output<ScheduleOptionsResponse> scheduleOptions() {
        return this.scheduleOptions;
    }
    /**
     * State of the most recently updated transfer run.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the most recently updated transfer run.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Data transfer modification time. Ignored by server on input.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Data transfer modification time. Ignored by server on input.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Deprecated. Unique ID of the user on whose behalf transfer is done.
     * 
     * @deprecated
     * Deprecated. Unique ID of the user on whose behalf transfer is done.
     * 
     */
    @Deprecated /* Deprecated. Unique ID of the user on whose behalf transfer is done. */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return Deprecated. Unique ID of the user on whose behalf transfer is done.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransferConfig(String name) {
        this(name, TransferConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransferConfig(String name, @Nullable TransferConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransferConfig(String name, @Nullable TransferConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquerydatatransfer/v1:TransferConfig", name, args == null ? TransferConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransferConfig(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquerydatatransfer/v1:TransferConfig", name, null, makeResourceOptions(options, id));
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
    public static TransferConfig get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransferConfig(name, id, options);
    }
}

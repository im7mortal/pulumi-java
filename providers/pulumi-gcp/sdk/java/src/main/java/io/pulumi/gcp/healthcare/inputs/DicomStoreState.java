// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigGetArgs;
import io.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DicomStoreState extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreState Empty = new DicomStoreState();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @InputImport(name="dataset")
    private final @Nullable Input<String> dataset;

    public Input<String> getDataset() {
        return this.dataset == null ? Input.empty() : this.dataset;
    }

    /**
     * User-supplied key-value pairs used to organize DICOM stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The resource name for the DicomStore.
     * ** Changing this property may recreate the Dicom store (removing all data) **
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="notificationConfig")
    private final @Nullable Input<DicomStoreNotificationConfigGetArgs> notificationConfig;

    public Input<DicomStoreNotificationConfigGetArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Input.empty() : this.notificationConfig;
    }

    /**
     * The fully qualified name of this dataset
     * 
     */
    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * 
     */
    @InputImport(name="streamConfigs")
    private final @Nullable Input<List<DicomStoreStreamConfigGetArgs>> streamConfigs;

    public Input<List<DicomStoreStreamConfigGetArgs>> getStreamConfigs() {
        return this.streamConfigs == null ? Input.empty() : this.streamConfigs;
    }

    public DicomStoreState(
        @Nullable Input<String> dataset,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<DicomStoreNotificationConfigGetArgs> notificationConfig,
        @Nullable Input<String> selfLink,
        @Nullable Input<List<DicomStoreStreamConfigGetArgs>> streamConfigs) {
        this.dataset = dataset;
        this.labels = labels;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.selfLink = selfLink;
        this.streamConfigs = streamConfigs;
    }

    private DicomStoreState() {
        this.dataset = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.notificationConfig = Input.empty();
        this.selfLink = Input.empty();
        this.streamConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataset;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<DicomStoreNotificationConfigGetArgs> notificationConfig;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<List<DicomStoreStreamConfigGetArgs>> streamConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.selfLink = defaults.selfLink;
    	      this.streamConfigs = defaults.streamConfigs;
        }

        public Builder setDataset(@Nullable Input<String> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder setDataset(@Nullable String dataset) {
            this.dataset = Input.ofNullable(dataset);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNotificationConfig(@Nullable Input<DicomStoreNotificationConfigGetArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder setNotificationConfig(@Nullable DicomStoreNotificationConfigGetArgs notificationConfig) {
            this.notificationConfig = Input.ofNullable(notificationConfig);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setStreamConfigs(@Nullable Input<List<DicomStoreStreamConfigGetArgs>> streamConfigs) {
            this.streamConfigs = streamConfigs;
            return this;
        }

        public Builder setStreamConfigs(@Nullable List<DicomStoreStreamConfigGetArgs> streamConfigs) {
            this.streamConfigs = Input.ofNullable(streamConfigs);
            return this;
        }

        public DicomStoreState build() {
            return new DicomStoreState(dataset, labels, name, notificationConfig, selfLink, streamConfigs);
        }
    }
}
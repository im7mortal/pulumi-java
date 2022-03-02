// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigGetArgs;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsGetArgs;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7StoreState extends io.pulumi.resources.ResourceArgs {

    public static final Hl7StoreState Empty = new Hl7StoreState();

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
     * User-supplied key-value pairs used to organize HL7v2 stores.
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
     * The resource name for the Hl7V2Store.
     * ** Changing this property may recreate the Hl7v2 store (removing all data) **
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * A nested object resource
     * Structure is documented below.
     * 
     * @Deprecated
     * This field has been replaced by notificationConfigs
     * 
     */
    @Deprecated /* This field has been replaced by notificationConfigs */
    @InputImport(name="notificationConfig")
      private final @Nullable Input<Hl7StoreNotificationConfigGetArgs> notificationConfig;

    @Deprecated /* This field has been replaced by notificationConfigs */
    public Input<Hl7StoreNotificationConfigGetArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Input.empty() : this.notificationConfig;
    }

    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest & Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * 
     */
    @InputImport(name="notificationConfigs")
      private final @Nullable Input<List<Hl7StoreNotificationConfigsGetArgs>> notificationConfigs;

    public Input<List<Hl7StoreNotificationConfigsGetArgs>> getNotificationConfigs() {
        return this.notificationConfigs == null ? Input.empty() : this.notificationConfigs;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="parserConfig")
      private final @Nullable Input<Hl7StoreParserConfigGetArgs> parserConfig;

    public Input<Hl7StoreParserConfigGetArgs> getParserConfig() {
        return this.parserConfig == null ? Input.empty() : this.parserConfig;
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

    public Hl7StoreState(
        @Nullable Input<String> dataset,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<Hl7StoreNotificationConfigGetArgs> notificationConfig,
        @Nullable Input<List<Hl7StoreNotificationConfigsGetArgs>> notificationConfigs,
        @Nullable Input<Hl7StoreParserConfigGetArgs> parserConfig,
        @Nullable Input<String> selfLink) {
        this.dataset = dataset;
        this.labels = labels;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.notificationConfigs = notificationConfigs;
        this.parserConfig = parserConfig;
        this.selfLink = selfLink;
    }

    private Hl7StoreState() {
        this.dataset = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.notificationConfig = Input.empty();
        this.notificationConfigs = Input.empty();
        this.parserConfig = Input.empty();
        this.selfLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataset;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<Hl7StoreNotificationConfigGetArgs> notificationConfig;
        private @Nullable Input<List<Hl7StoreNotificationConfigsGetArgs>> notificationConfigs;
        private @Nullable Input<Hl7StoreParserConfigGetArgs> parserConfig;
        private @Nullable Input<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.notificationConfigs = defaults.notificationConfigs;
    	      this.parserConfig = defaults.parserConfig;
    	      this.selfLink = defaults.selfLink;
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

        public Builder setNotificationConfig(@Nullable Input<Hl7StoreNotificationConfigGetArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder setNotificationConfig(@Nullable Hl7StoreNotificationConfigGetArgs notificationConfig) {
            this.notificationConfig = Input.ofNullable(notificationConfig);
            return this;
        }

        public Builder setNotificationConfigs(@Nullable Input<List<Hl7StoreNotificationConfigsGetArgs>> notificationConfigs) {
            this.notificationConfigs = notificationConfigs;
            return this;
        }

        public Builder setNotificationConfigs(@Nullable List<Hl7StoreNotificationConfigsGetArgs> notificationConfigs) {
            this.notificationConfigs = Input.ofNullable(notificationConfigs);
            return this;
        }

        public Builder setParserConfig(@Nullable Input<Hl7StoreParserConfigGetArgs> parserConfig) {
            this.parserConfig = parserConfig;
            return this;
        }

        public Builder setParserConfig(@Nullable Hl7StoreParserConfigGetArgs parserConfig) {
            this.parserConfig = Input.ofNullable(parserConfig);
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
        public Hl7StoreState build() {
            return new Hl7StoreState(dataset, labels, name, notificationConfig, notificationConfigs, parserConfig, selfLink);
        }
    }
}

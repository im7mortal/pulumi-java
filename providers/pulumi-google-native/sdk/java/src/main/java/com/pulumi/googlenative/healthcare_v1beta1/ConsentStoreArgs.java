// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConsentStoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsentStoreArgs Empty = new ConsentStoreArgs();

    /**
     * Required. The ID of the consent store to create. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`. Cannot be changed after creation.
     * 
     */
    @Import(name="consentStoreId", required=true)
    private Output<String> consentStoreId;

    /**
     * @return Required. The ID of the consent store to create. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`. Cannot be changed after creation.
     * 
     */
    public Output<String> consentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * Optional. Default time to live for Consents created in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
     * 
     */
    @Import(name="defaultConsentTtl")
    private @Nullable Output<String> defaultConsentTtl;

    /**
     * @return Optional. Default time to live for Consents created in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
     * 
     */
    public Optional<Output<String>> defaultConsentTtl() {
        return Optional.ofNullable(this.defaultConsentTtl);
    }

    /**
     * Optional. If `true`, UpdateConsent creates the Consent if it does not already exist. If unspecified, defaults to `false`.
     * 
     */
    @Import(name="enableConsentCreateOnUpdate")
    private @Nullable Output<Boolean> enableConsentCreateOnUpdate;

    /**
     * @return Optional. If `true`, UpdateConsent creates the Consent if it does not already exist. If unspecified, defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableConsentCreateOnUpdate() {
        return Optional.ofNullable(this.enableConsentCreateOnUpdate);
    }

    /**
     * Optional. User-supplied key-value pairs used to organize consent stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}. Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}. No more than 64 labels can be associated with a given store. For more information: https://cloud.google.com/healthcare/docs/how-tos/labeling-resources
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. User-supplied key-value pairs used to organize consent stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}. Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}. No more than 64 labels can be associated with a given store. For more information: https://cloud.google.com/healthcare/docs/how-tos/labeling-resources
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name of the consent store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}`. Cannot be changed after creation.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the consent store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}`. Cannot be changed after creation.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ConsentStoreArgs() {}

    private ConsentStoreArgs(ConsentStoreArgs $) {
        this.consentStoreId = $.consentStoreId;
        this.datasetId = $.datasetId;
        this.defaultConsentTtl = $.defaultConsentTtl;
        this.enableConsentCreateOnUpdate = $.enableConsentCreateOnUpdate;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsentStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsentStoreArgs $;

        public Builder() {
            $ = new ConsentStoreArgs();
        }

        public Builder(ConsentStoreArgs defaults) {
            $ = new ConsentStoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consentStoreId Required. The ID of the consent store to create. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`. Cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder consentStoreId(Output<String> consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        /**
         * @param consentStoreId Required. The ID of the consent store to create. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`. Cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder consentStoreId(String consentStoreId) {
            return consentStoreId(Output.of(consentStoreId));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param defaultConsentTtl Optional. Default time to live for Consents created in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
         * 
         * @return builder
         * 
         */
        public Builder defaultConsentTtl(@Nullable Output<String> defaultConsentTtl) {
            $.defaultConsentTtl = defaultConsentTtl;
            return this;
        }

        /**
         * @param defaultConsentTtl Optional. Default time to live for Consents created in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
         * 
         * @return builder
         * 
         */
        public Builder defaultConsentTtl(String defaultConsentTtl) {
            return defaultConsentTtl(Output.of(defaultConsentTtl));
        }

        /**
         * @param enableConsentCreateOnUpdate Optional. If `true`, UpdateConsent creates the Consent if it does not already exist. If unspecified, defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableConsentCreateOnUpdate(@Nullable Output<Boolean> enableConsentCreateOnUpdate) {
            $.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
            return this;
        }

        /**
         * @param enableConsentCreateOnUpdate Optional. If `true`, UpdateConsent creates the Consent if it does not already exist. If unspecified, defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableConsentCreateOnUpdate(Boolean enableConsentCreateOnUpdate) {
            return enableConsentCreateOnUpdate(Output.of(enableConsentCreateOnUpdate));
        }

        /**
         * @param labels Optional. User-supplied key-value pairs used to organize consent stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}. Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}. No more than 64 labels can be associated with a given store. For more information: https://cloud.google.com/healthcare/docs/how-tos/labeling-resources
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. User-supplied key-value pairs used to organize consent stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}. Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}. No more than 64 labels can be associated with a given store. For more information: https://cloud.google.com/healthcare/docs/how-tos/labeling-resources
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Resource name of the consent store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}`. Cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the consent store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}`. Cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ConsentStoreArgs build() {
            $.consentStoreId = Objects.requireNonNull($.consentStoreId, "expected parameter 'consentStoreId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            return $;
        }
    }

}

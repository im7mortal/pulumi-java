// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataplex_v1.enums.GoogleCloudDataplexV1StorageFormatCompressionFormat;
import com.pulumi.googlenative.dataplex_v1.inputs.GoogleCloudDataplexV1StorageFormatCsvOptionsArgs;
import com.pulumi.googlenative.dataplex_v1.inputs.GoogleCloudDataplexV1StorageFormatJsonOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the format of the data within its storage location.
 * 
 */
public final class GoogleCloudDataplexV1StorageFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1StorageFormatArgs Empty = new GoogleCloudDataplexV1StorageFormatArgs();

    /**
     * Optional. The compression type associated with the stored data. If unspecified, the data is uncompressed.
     * 
     */
    @Import(name="compressionFormat")
    private @Nullable Output<GoogleCloudDataplexV1StorageFormatCompressionFormat> compressionFormat;

    /**
     * @return Optional. The compression type associated with the stored data. If unspecified, the data is uncompressed.
     * 
     */
    public Optional<Output<GoogleCloudDataplexV1StorageFormatCompressionFormat>> compressionFormat() {
        return Optional.ofNullable(this.compressionFormat);
    }

    /**
     * Optional. Additional information about CSV formatted data.
     * 
     */
    @Import(name="csv")
    private @Nullable Output<GoogleCloudDataplexV1StorageFormatCsvOptionsArgs> csv;

    /**
     * @return Optional. Additional information about CSV formatted data.
     * 
     */
    public Optional<Output<GoogleCloudDataplexV1StorageFormatCsvOptionsArgs>> csv() {
        return Optional.ofNullable(this.csv);
    }

    /**
     * Optional. Additional information about CSV formatted data.
     * 
     */
    @Import(name="json")
    private @Nullable Output<GoogleCloudDataplexV1StorageFormatJsonOptionsArgs> json;

    /**
     * @return Optional. Additional information about CSV formatted data.
     * 
     */
    public Optional<Output<GoogleCloudDataplexV1StorageFormatJsonOptionsArgs>> json() {
        return Optional.ofNullable(this.json);
    }

    /**
     * The mime type descriptor for the data. Must match the pattern {type}/{subtype}. Supported values: application/x-parquet application/x-avro application/x-orc application/x-tfrecord application/json application/{subtypes} text/csv text/ image/{image subtype} video/{video subtype} audio/{audio subtype}
     * 
     */
    @Import(name="mimeType", required=true)
    private Output<String> mimeType;

    /**
     * @return The mime type descriptor for the data. Must match the pattern {type}/{subtype}. Supported values: application/x-parquet application/x-avro application/x-orc application/x-tfrecord application/json application/{subtypes} text/csv text/ image/{image subtype} video/{video subtype} audio/{audio subtype}
     * 
     */
    public Output<String> mimeType() {
        return this.mimeType;
    }

    private GoogleCloudDataplexV1StorageFormatArgs() {}

    private GoogleCloudDataplexV1StorageFormatArgs(GoogleCloudDataplexV1StorageFormatArgs $) {
        this.compressionFormat = $.compressionFormat;
        this.csv = $.csv;
        this.json = $.json;
        this.mimeType = $.mimeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1StorageFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1StorageFormatArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1StorageFormatArgs();
        }

        public Builder(GoogleCloudDataplexV1StorageFormatArgs defaults) {
            $ = new GoogleCloudDataplexV1StorageFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compressionFormat Optional. The compression type associated with the stored data. If unspecified, the data is uncompressed.
         * 
         * @return builder
         * 
         */
        public Builder compressionFormat(@Nullable Output<GoogleCloudDataplexV1StorageFormatCompressionFormat> compressionFormat) {
            $.compressionFormat = compressionFormat;
            return this;
        }

        /**
         * @param compressionFormat Optional. The compression type associated with the stored data. If unspecified, the data is uncompressed.
         * 
         * @return builder
         * 
         */
        public Builder compressionFormat(GoogleCloudDataplexV1StorageFormatCompressionFormat compressionFormat) {
            return compressionFormat(Output.of(compressionFormat));
        }

        /**
         * @param csv Optional. Additional information about CSV formatted data.
         * 
         * @return builder
         * 
         */
        public Builder csv(@Nullable Output<GoogleCloudDataplexV1StorageFormatCsvOptionsArgs> csv) {
            $.csv = csv;
            return this;
        }

        /**
         * @param csv Optional. Additional information about CSV formatted data.
         * 
         * @return builder
         * 
         */
        public Builder csv(GoogleCloudDataplexV1StorageFormatCsvOptionsArgs csv) {
            return csv(Output.of(csv));
        }

        /**
         * @param json Optional. Additional information about CSV formatted data.
         * 
         * @return builder
         * 
         */
        public Builder json(@Nullable Output<GoogleCloudDataplexV1StorageFormatJsonOptionsArgs> json) {
            $.json = json;
            return this;
        }

        /**
         * @param json Optional. Additional information about CSV formatted data.
         * 
         * @return builder
         * 
         */
        public Builder json(GoogleCloudDataplexV1StorageFormatJsonOptionsArgs json) {
            return json(Output.of(json));
        }

        /**
         * @param mimeType The mime type descriptor for the data. Must match the pattern {type}/{subtype}. Supported values: application/x-parquet application/x-avro application/x-orc application/x-tfrecord application/json application/{subtypes} text/csv text/ image/{image subtype} video/{video subtype} audio/{audio subtype}
         * 
         * @return builder
         * 
         */
        public Builder mimeType(Output<String> mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        /**
         * @param mimeType The mime type descriptor for the data. Must match the pattern {type}/{subtype}. Supported values: application/x-parquet application/x-avro application/x-orc application/x-tfrecord application/json application/{subtypes} text/csv text/ image/{image subtype} video/{video subtype} audio/{audio subtype}
         * 
         * @return builder
         * 
         */
        public Builder mimeType(String mimeType) {
            return mimeType(Output.of(mimeType));
        }

        public GoogleCloudDataplexV1StorageFormatArgs build() {
            $.mimeType = Objects.requireNonNull($.mimeType, "expected parameter 'mimeType' to be non-null");
            return $;
        }
    }

}

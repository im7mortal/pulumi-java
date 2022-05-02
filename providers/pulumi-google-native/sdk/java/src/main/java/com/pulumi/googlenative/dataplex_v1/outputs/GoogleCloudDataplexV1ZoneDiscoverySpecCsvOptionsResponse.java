// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse {
    /**
     * @return Optional. The delimiter being used to separate values. This defaults to &#39;,&#39;.
     * 
     */
    private final String delimiter;
    /**
     * @return Optional. Whether to disable the inference of data type for CSV data. If true, all columns will be registered as strings.
     * 
     */
    private final Boolean disableTypeInference;
    /**
     * @return Optional. The character encoding of the data. The default is UTF-8.
     * 
     */
    private final String encoding;
    /**
     * @return Optional. The number of rows to interpret as header rows that should be skipped when reading data rows.
     * 
     */
    private final Integer headerRows;

    @CustomType.Constructor
    private GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse(
        @CustomType.Parameter("delimiter") String delimiter,
        @CustomType.Parameter("disableTypeInference") Boolean disableTypeInference,
        @CustomType.Parameter("encoding") String encoding,
        @CustomType.Parameter("headerRows") Integer headerRows) {
        this.delimiter = delimiter;
        this.disableTypeInference = disableTypeInference;
        this.encoding = encoding;
        this.headerRows = headerRows;
    }

    /**
     * @return Optional. The delimiter being used to separate values. This defaults to &#39;,&#39;.
     * 
     */
    public String delimiter() {
        return this.delimiter;
    }
    /**
     * @return Optional. Whether to disable the inference of data type for CSV data. If true, all columns will be registered as strings.
     * 
     */
    public Boolean disableTypeInference() {
        return this.disableTypeInference;
    }
    /**
     * @return Optional. The character encoding of the data. The default is UTF-8.
     * 
     */
    public String encoding() {
        return this.encoding;
    }
    /**
     * @return Optional. The number of rows to interpret as header rows that should be skipped when reading data rows.
     * 
     */
    public Integer headerRows() {
        return this.headerRows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String delimiter;
        private Boolean disableTypeInference;
        private String encoding;
        private Integer headerRows;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
    	      this.disableTypeInference = defaults.disableTypeInference;
    	      this.encoding = defaults.encoding;
    	      this.headerRows = defaults.headerRows;
        }

        public Builder delimiter(String delimiter) {
            this.delimiter = Objects.requireNonNull(delimiter);
            return this;
        }
        public Builder disableTypeInference(Boolean disableTypeInference) {
            this.disableTypeInference = Objects.requireNonNull(disableTypeInference);
            return this;
        }
        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }
        public Builder headerRows(Integer headerRows) {
            this.headerRows = Objects.requireNonNull(headerRows);
            return this;
        }        public GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse build() {
            return new GoogleCloudDataplexV1ZoneDiscoverySpecCsvOptionsResponse(delimiter, disableTypeInference, encoding, headerRows);
        }
    }
}

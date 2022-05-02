// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1StorageFormatCsvOptionsResponse {
    /**
     * @return Optional. The delimiter used to separate values. Defaults to &#39;,&#39;.
     * 
     */
    private final String delimiter;
    /**
     * @return Optional. The character encoding of the data. Accepts &#34;US-ASCII&#34;, &#34;UTF-8&#34;, and &#34;ISO-8859-1&#34;. Defaults to UTF-8 if unspecified.
     * 
     */
    private final String encoding;
    /**
     * @return Optional. The number of rows to interpret as header rows that should be skipped when reading data rows. Defaults to 0.
     * 
     */
    private final Integer headerRows;
    /**
     * @return Optional. The character used to quote column values. Accepts &#39;&#34;&#39; (double quotation mark) or &#39;&#39;&#39; (single quotation mark). Defaults to &#39;&#34;&#39; (double quotation mark) if unspecified.
     * 
     */
    private final String quote;

    @CustomType.Constructor
    private GoogleCloudDataplexV1StorageFormatCsvOptionsResponse(
        @CustomType.Parameter("delimiter") String delimiter,
        @CustomType.Parameter("encoding") String encoding,
        @CustomType.Parameter("headerRows") Integer headerRows,
        @CustomType.Parameter("quote") String quote) {
        this.delimiter = delimiter;
        this.encoding = encoding;
        this.headerRows = headerRows;
        this.quote = quote;
    }

    /**
     * @return Optional. The delimiter used to separate values. Defaults to &#39;,&#39;.
     * 
     */
    public String delimiter() {
        return this.delimiter;
    }
    /**
     * @return Optional. The character encoding of the data. Accepts &#34;US-ASCII&#34;, &#34;UTF-8&#34;, and &#34;ISO-8859-1&#34;. Defaults to UTF-8 if unspecified.
     * 
     */
    public String encoding() {
        return this.encoding;
    }
    /**
     * @return Optional. The number of rows to interpret as header rows that should be skipped when reading data rows. Defaults to 0.
     * 
     */
    public Integer headerRows() {
        return this.headerRows;
    }
    /**
     * @return Optional. The character used to quote column values. Accepts &#39;&#34;&#39; (double quotation mark) or &#39;&#39;&#39; (single quotation mark). Defaults to &#39;&#34;&#39; (double quotation mark) if unspecified.
     * 
     */
    public String quote() {
        return this.quote;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1StorageFormatCsvOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String delimiter;
        private String encoding;
        private Integer headerRows;
        private String quote;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDataplexV1StorageFormatCsvOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
    	      this.encoding = defaults.encoding;
    	      this.headerRows = defaults.headerRows;
    	      this.quote = defaults.quote;
        }

        public Builder delimiter(String delimiter) {
            this.delimiter = Objects.requireNonNull(delimiter);
            return this;
        }
        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }
        public Builder headerRows(Integer headerRows) {
            this.headerRows = Objects.requireNonNull(headerRows);
            return this;
        }
        public Builder quote(String quote) {
            this.quote = Objects.requireNonNull(quote);
            return this;
        }        public GoogleCloudDataplexV1StorageFormatCsvOptionsResponse build() {
            return new GoogleCloudDataplexV1StorageFormatCsvOptionsResponse(delimiter, encoding, headerRows, quote);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1PhysicalSchemaResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1DataplexSpecResponse {
    /**
     * @return Fully qualified resource name of an asset in Dataplex, to which the underlying data source (Cloud Storage bucket or BigQuery dataset) of the entity is attached.
     * 
     */
    private final String asset;
    /**
     * @return Compression format of the data, e.g., zip, gzip etc.
     * 
     */
    private final String compressionFormat;
    /**
     * @return Format of the data.
     * 
     */
    private final GoogleCloudDatacatalogV1PhysicalSchemaResponse dataFormat;
    /**
     * @return Project ID of the underlying Cloud Storage or BigQuery data. Note that this may not be the same project as the correspondingly Dataplex lake / zone / asset.
     * 
     */
    private final String project;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1DataplexSpecResponse(
        @CustomType.Parameter("asset") String asset,
        @CustomType.Parameter("compressionFormat") String compressionFormat,
        @CustomType.Parameter("dataFormat") GoogleCloudDatacatalogV1PhysicalSchemaResponse dataFormat,
        @CustomType.Parameter("project") String project) {
        this.asset = asset;
        this.compressionFormat = compressionFormat;
        this.dataFormat = dataFormat;
        this.project = project;
    }

    /**
     * @return Fully qualified resource name of an asset in Dataplex, to which the underlying data source (Cloud Storage bucket or BigQuery dataset) of the entity is attached.
     * 
     */
    public String asset() {
        return this.asset;
    }
    /**
     * @return Compression format of the data, e.g., zip, gzip etc.
     * 
     */
    public String compressionFormat() {
        return this.compressionFormat;
    }
    /**
     * @return Format of the data.
     * 
     */
    public GoogleCloudDatacatalogV1PhysicalSchemaResponse dataFormat() {
        return this.dataFormat;
    }
    /**
     * @return Project ID of the underlying Cloud Storage or BigQuery data. Note that this may not be the same project as the correspondingly Dataplex lake / zone / asset.
     * 
     */
    public String project() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1DataplexSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String asset;
        private String compressionFormat;
        private GoogleCloudDatacatalogV1PhysicalSchemaResponse dataFormat;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1DataplexSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asset = defaults.asset;
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.dataFormat = defaults.dataFormat;
    	      this.project = defaults.project;
        }

        public Builder asset(String asset) {
            this.asset = Objects.requireNonNull(asset);
            return this;
        }
        public Builder compressionFormat(String compressionFormat) {
            this.compressionFormat = Objects.requireNonNull(compressionFormat);
            return this;
        }
        public Builder dataFormat(GoogleCloudDatacatalogV1PhysicalSchemaResponse dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }        public GoogleCloudDatacatalogV1DataplexSpecResponse build() {
            return new GoogleCloudDatacatalogV1DataplexSpecResponse(asset, compressionFormat, dataFormat, project);
        }
    }
}

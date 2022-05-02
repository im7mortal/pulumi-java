// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1StoragePropertiesResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1DataSourceResponse {
    /**
     * @return Full name of a resource as defined by the service. For example: `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
     * 
     */
    private final String resource;
    /**
     * @return Service that physically stores the data.
     * 
     */
    private final String service;
    /**
     * @return Data Catalog entry name, if applicable.
     * 
     */
    private final String sourceEntry;
    /**
     * @return Detailed properties of the underlying storage.
     * 
     */
    private final GoogleCloudDatacatalogV1StoragePropertiesResponse storageProperties;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1DataSourceResponse(
        @CustomType.Parameter("resource") String resource,
        @CustomType.Parameter("service") String service,
        @CustomType.Parameter("sourceEntry") String sourceEntry,
        @CustomType.Parameter("storageProperties") GoogleCloudDatacatalogV1StoragePropertiesResponse storageProperties) {
        this.resource = resource;
        this.service = service;
        this.sourceEntry = sourceEntry;
        this.storageProperties = storageProperties;
    }

    /**
     * @return Full name of a resource as defined by the service. For example: `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
     * 
     */
    public String resource() {
        return this.resource;
    }
    /**
     * @return Service that physically stores the data.
     * 
     */
    public String service() {
        return this.service;
    }
    /**
     * @return Data Catalog entry name, if applicable.
     * 
     */
    public String sourceEntry() {
        return this.sourceEntry;
    }
    /**
     * @return Detailed properties of the underlying storage.
     * 
     */
    public GoogleCloudDatacatalogV1StoragePropertiesResponse storageProperties() {
        return this.storageProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1DataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resource;
        private String service;
        private String sourceEntry;
        private GoogleCloudDatacatalogV1StoragePropertiesResponse storageProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1DataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.service = defaults.service;
    	      this.sourceEntry = defaults.sourceEntry;
    	      this.storageProperties = defaults.storageProperties;
        }

        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder sourceEntry(String sourceEntry) {
            this.sourceEntry = Objects.requireNonNull(sourceEntry);
            return this;
        }
        public Builder storageProperties(GoogleCloudDatacatalogV1StoragePropertiesResponse storageProperties) {
            this.storageProperties = Objects.requireNonNull(storageProperties);
            return this;
        }        public GoogleCloudDatacatalogV1DataSourceResponse build() {
            return new GoogleCloudDatacatalogV1DataSourceResponse(resource, service, sourceEntry, storageProperties);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaResponse {
    /**
     * @return JSON source of the Avro schema.
     * 
     */
    private final String text;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaResponse(@CustomType.Parameter("text") String text) {
        this.text = text;
    }

    /**
     * @return JSON source of the Avro schema.
     * 
     */
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaResponse build() {
            return new GoogleCloudDatacatalogV1PhysicalSchemaAvroSchemaResponse(text);
        }
    }
}

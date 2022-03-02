// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.aws.glue.outputs.CatalogTableStorageDescriptorSchemaReferenceSchemaId;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CatalogTableStorageDescriptorSchemaReference {
    /**
     * Configuration block that contains schema identity fields. Either this or the `schema_version_id` has to be provided. See `schema_id` below.
     * 
     */
    private final @Nullable CatalogTableStorageDescriptorSchemaReferenceSchemaId schemaId;
    /**
     * Unique ID assigned to a version of the schema. Either this or the `schema_id` has to be provided.
     * 
     */
    private final @Nullable String schemaVersionId;
    /**
     * Version number of the schema.
     * 
     */
    private final Integer schemaVersionNumber;

    @OutputCustomType.Constructor({"schemaId","schemaVersionId","schemaVersionNumber"})
    private CatalogTableStorageDescriptorSchemaReference(
        @Nullable CatalogTableStorageDescriptorSchemaReferenceSchemaId schemaId,
        @Nullable String schemaVersionId,
        Integer schemaVersionNumber) {
        this.schemaId = schemaId;
        this.schemaVersionId = schemaVersionId;
        this.schemaVersionNumber = Objects.requireNonNull(schemaVersionNumber);
    }

    /**
     * Configuration block that contains schema identity fields. Either this or the `schema_version_id` has to be provided. See `schema_id` below.
     * 
    */
    public Optional<CatalogTableStorageDescriptorSchemaReferenceSchemaId> getSchemaId() {
        return Optional.ofNullable(this.schemaId);
    }
    /**
     * Unique ID assigned to a version of the schema. Either this or the `schema_id` has to be provided.
     * 
    */
    public Optional<String> getSchemaVersionId() {
        return Optional.ofNullable(this.schemaVersionId);
    }
    /**
     * Version number of the schema.
     * 
    */
    public Integer getSchemaVersionNumber() {
        return this.schemaVersionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSchemaReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CatalogTableStorageDescriptorSchemaReferenceSchemaId schemaId;
        private @Nullable String schemaVersionId;
        private Integer schemaVersionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSchemaReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schemaId = defaults.schemaId;
    	      this.schemaVersionId = defaults.schemaVersionId;
    	      this.schemaVersionNumber = defaults.schemaVersionNumber;
        }

        public Builder setSchemaId(@Nullable CatalogTableStorageDescriptorSchemaReferenceSchemaId schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        public Builder setSchemaVersionId(@Nullable String schemaVersionId) {
            this.schemaVersionId = schemaVersionId;
            return this;
        }

        public Builder setSchemaVersionNumber(Integer schemaVersionNumber) {
            this.schemaVersionNumber = Objects.requireNonNull(schemaVersionNumber);
            return this;
        }
        public CatalogTableStorageDescriptorSchemaReference build() {
            return new CatalogTableStorageDescriptorSchemaReference(schemaId, schemaVersionId, schemaVersionNumber);
        }
    }
}

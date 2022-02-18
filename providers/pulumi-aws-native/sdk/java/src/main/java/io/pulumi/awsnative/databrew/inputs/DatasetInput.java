// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetDataCatalogInputDefinition;
import io.pulumi.awsnative.databrew.inputs.DatasetDatabaseInputDefinition;
import io.pulumi.awsnative.databrew.inputs.DatasetMetadata;
import io.pulumi.awsnative.databrew.inputs.DatasetS3Location;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input
 * 
 */
public final class DatasetInput extends io.pulumi.resources.InvokeArgs {

    public static final DatasetInput Empty = new DatasetInput();

    @InputImport(name="dataCatalogInputDefinition")
    private final @Nullable DatasetDataCatalogInputDefinition dataCatalogInputDefinition;

    public Optional<DatasetDataCatalogInputDefinition> getDataCatalogInputDefinition() {
        return this.dataCatalogInputDefinition == null ? Optional.empty() : Optional.ofNullable(this.dataCatalogInputDefinition);
    }

    @InputImport(name="databaseInputDefinition")
    private final @Nullable DatasetDatabaseInputDefinition databaseInputDefinition;

    public Optional<DatasetDatabaseInputDefinition> getDatabaseInputDefinition() {
        return this.databaseInputDefinition == null ? Optional.empty() : Optional.ofNullable(this.databaseInputDefinition);
    }

    @InputImport(name="metadata")
    private final @Nullable DatasetMetadata metadata;

    public Optional<DatasetMetadata> getMetadata() {
        return this.metadata == null ? Optional.empty() : Optional.ofNullable(this.metadata);
    }

    @InputImport(name="s3InputDefinition")
    private final @Nullable DatasetS3Location s3InputDefinition;

    public Optional<DatasetS3Location> getS3InputDefinition() {
        return this.s3InputDefinition == null ? Optional.empty() : Optional.ofNullable(this.s3InputDefinition);
    }

    public DatasetInput(
        @Nullable DatasetDataCatalogInputDefinition dataCatalogInputDefinition,
        @Nullable DatasetDatabaseInputDefinition databaseInputDefinition,
        @Nullable DatasetMetadata metadata,
        @Nullable DatasetS3Location s3InputDefinition) {
        this.dataCatalogInputDefinition = dataCatalogInputDefinition;
        this.databaseInputDefinition = databaseInputDefinition;
        this.metadata = metadata;
        this.s3InputDefinition = s3InputDefinition;
    }

    private DatasetInput() {
        this.dataCatalogInputDefinition = null;
        this.databaseInputDefinition = null;
        this.metadata = null;
        this.s3InputDefinition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetDataCatalogInputDefinition dataCatalogInputDefinition;
        private @Nullable DatasetDatabaseInputDefinition databaseInputDefinition;
        private @Nullable DatasetMetadata metadata;
        private @Nullable DatasetS3Location s3InputDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogInputDefinition = defaults.dataCatalogInputDefinition;
    	      this.databaseInputDefinition = defaults.databaseInputDefinition;
    	      this.metadata = defaults.metadata;
    	      this.s3InputDefinition = defaults.s3InputDefinition;
        }

        public Builder setDataCatalogInputDefinition(@Nullable DatasetDataCatalogInputDefinition dataCatalogInputDefinition) {
            this.dataCatalogInputDefinition = dataCatalogInputDefinition;
            return this;
        }

        public Builder setDatabaseInputDefinition(@Nullable DatasetDatabaseInputDefinition databaseInputDefinition) {
            this.databaseInputDefinition = databaseInputDefinition;
            return this;
        }

        public Builder setMetadata(@Nullable DatasetMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setS3InputDefinition(@Nullable DatasetS3Location s3InputDefinition) {
            this.s3InputDefinition = s3InputDefinition;
            return this;
        }

        public DatasetInput build() {
            return new DatasetInput(dataCatalogInputDefinition, databaseInputDefinition, metadata, s3InputDefinition);
        }
    }
}

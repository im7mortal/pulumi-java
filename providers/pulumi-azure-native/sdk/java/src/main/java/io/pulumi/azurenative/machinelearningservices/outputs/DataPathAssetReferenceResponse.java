// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataPathAssetReferenceResponse {
    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
     */
    private final @Nullable String datastoreId;
    /**
     * The path of the file/directory in the datastore.
     * 
     */
    private final @Nullable String path;
    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is 'DataPath'.
     * 
     */
    private final String referenceType;

    @OutputCustomType.Constructor({"datastoreId","path","referenceType"})
    private DataPathAssetReferenceResponse(
        @Nullable String datastoreId,
        @Nullable String path,
        String referenceType) {
        this.datastoreId = datastoreId;
        this.path = path;
        this.referenceType = Objects.requireNonNull(referenceType);
    }

    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
    */
    public Optional<String> getDatastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }
    /**
     * The path of the file/directory in the datastore.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is 'DataPath'.
     * 
    */
    public String getReferenceType() {
        return this.referenceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPathAssetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable String path;
        private String referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataPathAssetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.path = defaults.path;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder setDatastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setReferenceType(String referenceType) {
            this.referenceType = Objects.requireNonNull(referenceType);
            return this;
        }
        public DataPathAssetReferenceResponse build() {
            return new DataPathAssetReferenceResponse(datastoreId, path, referenceType);
        }
    }
}

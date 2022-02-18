// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelAssetPropertyValue;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelIotSiteWise {
    /**
     * The ID of the asset that has the specified property. You can specify an expression.
     * 
     */
    private final @Nullable String assetId;
    /**
     * A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in case of failure. The default is a new unique identifier. You can also specify an expression.
     * 
     */
    private final @Nullable String entryId;
    /**
     * The alias of the asset property. You can also specify an expression.
     * 
     */
    private final @Nullable String propertyAlias;
    /**
     * The ID of the asset property. You can specify an expression.
     * 
     */
    private final @Nullable String propertyId;
    private final DetectorModelAssetPropertyValue propertyValue;

    @OutputCustomType.Constructor({"assetId","entryId","propertyAlias","propertyId","propertyValue"})
    private DetectorModelIotSiteWise(
        @Nullable String assetId,
        @Nullable String entryId,
        @Nullable String propertyAlias,
        @Nullable String propertyId,
        DetectorModelAssetPropertyValue propertyValue) {
        this.assetId = assetId;
        this.entryId = entryId;
        this.propertyAlias = propertyAlias;
        this.propertyId = propertyId;
        this.propertyValue = Objects.requireNonNull(propertyValue);
    }

    /**
     * The ID of the asset that has the specified property. You can specify an expression.
     * 
     */
    public Optional<String> getAssetId() {
        return Optional.ofNullable(this.assetId);
    }
    /**
     * A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in case of failure. The default is a new unique identifier. You can also specify an expression.
     * 
     */
    public Optional<String> getEntryId() {
        return Optional.ofNullable(this.entryId);
    }
    /**
     * The alias of the asset property. You can also specify an expression.
     * 
     */
    public Optional<String> getPropertyAlias() {
        return Optional.ofNullable(this.propertyAlias);
    }
    /**
     * The ID of the asset property. You can specify an expression.
     * 
     */
    public Optional<String> getPropertyId() {
        return Optional.ofNullable(this.propertyId);
    }
    public DetectorModelAssetPropertyValue getPropertyValue() {
        return this.propertyValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelIotSiteWise defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assetId;
        private @Nullable String entryId;
        private @Nullable String propertyAlias;
        private @Nullable String propertyId;
        private DetectorModelAssetPropertyValue propertyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelIotSiteWise defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.entryId = defaults.entryId;
    	      this.propertyAlias = defaults.propertyAlias;
    	      this.propertyId = defaults.propertyId;
    	      this.propertyValue = defaults.propertyValue;
        }

        public Builder setAssetId(@Nullable String assetId) {
            this.assetId = assetId;
            return this;
        }

        public Builder setEntryId(@Nullable String entryId) {
            this.entryId = entryId;
            return this;
        }

        public Builder setPropertyAlias(@Nullable String propertyAlias) {
            this.propertyAlias = propertyAlias;
            return this;
        }

        public Builder setPropertyId(@Nullable String propertyId) {
            this.propertyId = propertyId;
            return this;
        }

        public Builder setPropertyValue(DetectorModelAssetPropertyValue propertyValue) {
            this.propertyValue = Objects.requireNonNull(propertyValue);
            return this;
        }

        public DetectorModelIotSiteWise build() {
            return new DetectorModelIotSiteWise(assetId, entryId, propertyAlias, propertyId, propertyValue);
        }
    }
}
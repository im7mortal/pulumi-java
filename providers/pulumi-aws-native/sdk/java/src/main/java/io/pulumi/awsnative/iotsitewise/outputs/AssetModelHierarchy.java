// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AssetModelHierarchy {
    /**
     * The ID of the asset model. All assets in this hierarchy must be instances of the child AssetModelId asset model.
     * 
     */
    private final String childAssetModelId;
    /**
     * Customer provided ID for hierarchy.
     * 
     */
    private final String logicalId;
    /**
     * The name of the asset model hierarchy.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"childAssetModelId","logicalId","name"})
    private AssetModelHierarchy(
        String childAssetModelId,
        String logicalId,
        String name) {
        this.childAssetModelId = Objects.requireNonNull(childAssetModelId);
        this.logicalId = Objects.requireNonNull(logicalId);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The ID of the asset model. All assets in this hierarchy must be instances of the child AssetModelId asset model.
     * 
     */
    public String getChildAssetModelId() {
        return this.childAssetModelId;
    }
    /**
     * Customer provided ID for hierarchy.
     * 
     */
    public String getLogicalId() {
        return this.logicalId;
    }
    /**
     * The name of the asset model hierarchy.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelHierarchy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String childAssetModelId;
        private String logicalId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelHierarchy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childAssetModelId = defaults.childAssetModelId;
    	      this.logicalId = defaults.logicalId;
    	      this.name = defaults.name;
        }

        public Builder setChildAssetModelId(String childAssetModelId) {
            this.childAssetModelId = Objects.requireNonNull(childAssetModelId);
            return this;
        }

        public Builder setLogicalId(String logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public AssetModelHierarchy build() {
            return new AssetModelHierarchy(childAssetModelId, logicalId, name);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness;

import io.pulumi.awsnative.route53recoveryreadiness.inputs.CellTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CellArgs extends io.pulumi.resources.ResourceArgs {

    public static final CellArgs Empty = new CellArgs();

    /**
     * The name of the cell to create.
     * 
     */
    @InputImport(name="cellName")
    private final @Nullable Input<String> cellName;

    public Input<String> getCellName() {
        return this.cellName == null ? Input.empty() : this.cellName;
    }

    /**
     * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested cells. For example, Availability Zones within specific Regions.
     * 
     */
    @InputImport(name="cells")
    private final @Nullable Input<List<String>> cells;

    public Input<List<String>> getCells() {
        return this.cells == null ? Input.empty() : this.cells;
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<CellTagArgs>> tags;

    public Input<List<CellTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public CellArgs(
        @Nullable Input<String> cellName,
        @Nullable Input<List<String>> cells,
        @Nullable Input<List<CellTagArgs>> tags) {
        this.cellName = cellName;
        this.cells = cells;
        this.tags = tags;
    }

    private CellArgs() {
        this.cellName = Input.empty();
        this.cells = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CellArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cellName;
        private @Nullable Input<List<String>> cells;
        private @Nullable Input<List<CellTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CellArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cellName = defaults.cellName;
    	      this.cells = defaults.cells;
    	      this.tags = defaults.tags;
        }

        public Builder setCellName(@Nullable Input<String> cellName) {
            this.cellName = cellName;
            return this;
        }

        public Builder setCellName(@Nullable String cellName) {
            this.cellName = Input.ofNullable(cellName);
            return this;
        }

        public Builder setCells(@Nullable Input<List<String>> cells) {
            this.cells = cells;
            return this;
        }

        public Builder setCells(@Nullable List<String> cells) {
            this.cells = Input.ofNullable(cells);
            return this;
        }

        public Builder setTags(@Nullable Input<List<CellTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<CellTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public CellArgs build() {
            return new CellArgs(cellName, cells, tags);
        }
    }
}

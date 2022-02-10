// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.inputs;

import io.pulumi.azurenative.consumption.inputs.BudgetComparisonExpressionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetFilterPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetFilterPropertiesArgs Empty = new BudgetFilterPropertiesArgs();

    @InputImport(name="dimensions")
    private final @Nullable Input<BudgetComparisonExpressionArgs> dimensions;

    public Input<BudgetComparisonExpressionArgs> getDimensions() {
        return this.dimensions == null ? Input.empty() : this.dimensions;
    }

    @InputImport(name="tags")
    private final @Nullable Input<BudgetComparisonExpressionArgs> tags;

    public Input<BudgetComparisonExpressionArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public BudgetFilterPropertiesArgs(
        @Nullable Input<BudgetComparisonExpressionArgs> dimensions,
        @Nullable Input<BudgetComparisonExpressionArgs> tags) {
        this.dimensions = dimensions;
        this.tags = tags;
    }

    private BudgetFilterPropertiesArgs() {
        this.dimensions = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetFilterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BudgetComparisonExpressionArgs> dimensions;
        private @Nullable Input<BudgetComparisonExpressionArgs> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetFilterPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.tags = defaults.tags;
        }

        public Builder setDimensions(@Nullable Input<BudgetComparisonExpressionArgs> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setDimensions(@Nullable BudgetComparisonExpressionArgs dimensions) {
            this.dimensions = Input.ofNullable(dimensions);
            return this;
        }

        public Builder setTags(@Nullable Input<BudgetComparisonExpressionArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable BudgetComparisonExpressionArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public BudgetFilterPropertiesArgs build() {
            return new BudgetFilterPropertiesArgs(dimensions, tags);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ReportComparisonExpressionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReportFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportFilterResponse Empty = new ReportFilterResponse();

    @InputImport(name="and")
    private final @Nullable List<ReportFilterResponse> and;

    public List<ReportFilterResponse> getAnd() {
        return this.and == null ? List.of() : this.and;
    }

    @InputImport(name="dimension")
    private final @Nullable ReportComparisonExpressionResponse dimension;

    public Optional<ReportComparisonExpressionResponse> getDimension() {
        return this.dimension == null ? Optional.empty() : Optional.ofNullable(this.dimension);
    }

    @InputImport(name="not")
    private final @Nullable ReportFilterResponse not;

    public Optional<ReportFilterResponse> getNot() {
        return this.not == null ? Optional.empty() : Optional.ofNullable(this.not);
    }

    @InputImport(name="or")
    private final @Nullable List<ReportFilterResponse> or;

    public List<ReportFilterResponse> getOr() {
        return this.or == null ? List.of() : this.or;
    }

    @InputImport(name="tag")
    private final @Nullable ReportComparisonExpressionResponse tag;

    public Optional<ReportComparisonExpressionResponse> getTag() {
        return this.tag == null ? Optional.empty() : Optional.ofNullable(this.tag);
    }

    public ReportFilterResponse(
        @Nullable List<ReportFilterResponse> and,
        @Nullable ReportComparisonExpressionResponse dimension,
        @Nullable ReportFilterResponse not,
        @Nullable List<ReportFilterResponse> or,
        @Nullable ReportComparisonExpressionResponse tag) {
        this.and = and;
        this.dimension = dimension;
        this.not = not;
        this.or = or;
        this.tag = tag;
    }

    private ReportFilterResponse() {
        this.and = List.of();
        this.dimension = null;
        this.not = null;
        this.or = List.of();
        this.tag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ReportFilterResponse> and;
        private @Nullable ReportComparisonExpressionResponse dimension;
        private @Nullable ReportFilterResponse not;
        private @Nullable List<ReportFilterResponse> or;
        private @Nullable ReportComparisonExpressionResponse tag;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.dimension = defaults.dimension;
    	      this.not = defaults.not;
    	      this.or = defaults.or;
    	      this.tag = defaults.tag;
        }

        public Builder setAnd(@Nullable List<ReportFilterResponse> and) {
            this.and = and;
            return this;
        }

        public Builder setDimension(@Nullable ReportComparisonExpressionResponse dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setNot(@Nullable ReportFilterResponse not) {
            this.not = not;
            return this;
        }

        public Builder setOr(@Nullable List<ReportFilterResponse> or) {
            this.or = or;
            return this;
        }

        public Builder setTag(@Nullable ReportComparisonExpressionResponse tag) {
            this.tag = tag;
            return this;
        }

        public ReportFilterResponse build() {
            return new ReportFilterResponse(and, dimension, not, or, tag);
        }
    }
}
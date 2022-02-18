// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.enums.DatasetFormat;
import io.pulumi.awsnative.databrew.outputs.DatasetFormatOptions;
import io.pulumi.awsnative.databrew.outputs.DatasetInput;
import io.pulumi.awsnative.databrew.outputs.DatasetPathOptions;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDatasetResult {
    /**
     * Dataset format
     * 
     */
    private final @Nullable DatasetFormat format;
    /**
     * Format options for dataset
     * 
     */
    private final @Nullable DatasetFormatOptions formatOptions;
    /**
     * Input
     * 
     */
    private final @Nullable DatasetInput input;
    /**
     * PathOptions
     * 
     */
    private final @Nullable DatasetPathOptions pathOptions;

    @OutputCustomType.Constructor({"format","formatOptions","input","pathOptions"})
    private GetDatasetResult(
        @Nullable DatasetFormat format,
        @Nullable DatasetFormatOptions formatOptions,
        @Nullable DatasetInput input,
        @Nullable DatasetPathOptions pathOptions) {
        this.format = format;
        this.formatOptions = formatOptions;
        this.input = input;
        this.pathOptions = pathOptions;
    }

    /**
     * Dataset format
     * 
     */
    public Optional<DatasetFormat> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Format options for dataset
     * 
     */
    public Optional<DatasetFormatOptions> getFormatOptions() {
        return Optional.ofNullable(this.formatOptions);
    }
    /**
     * Input
     * 
     */
    public Optional<DatasetInput> getInput() {
        return Optional.ofNullable(this.input);
    }
    /**
     * PathOptions
     * 
     */
    public Optional<DatasetPathOptions> getPathOptions() {
        return Optional.ofNullable(this.pathOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetFormat format;
        private @Nullable DatasetFormatOptions formatOptions;
        private @Nullable DatasetInput input;
        private @Nullable DatasetPathOptions pathOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.formatOptions = defaults.formatOptions;
    	      this.input = defaults.input;
    	      this.pathOptions = defaults.pathOptions;
        }

        public Builder setFormat(@Nullable DatasetFormat format) {
            this.format = format;
            return this;
        }

        public Builder setFormatOptions(@Nullable DatasetFormatOptions formatOptions) {
            this.formatOptions = formatOptions;
            return this;
        }

        public Builder setInput(@Nullable DatasetInput input) {
            this.input = input;
            return this;
        }

        public Builder setPathOptions(@Nullable DatasetPathOptions pathOptions) {
            this.pathOptions = pathOptions;
            return this;
        }

        public GetDatasetResult build() {
            return new GetDatasetResult(format, formatOptions, input, pathOptions);
        }
    }
}
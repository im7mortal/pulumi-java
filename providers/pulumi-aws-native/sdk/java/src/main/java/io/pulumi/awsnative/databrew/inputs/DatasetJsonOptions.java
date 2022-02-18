// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Json options
 * 
 */
public final class DatasetJsonOptions extends io.pulumi.resources.InvokeArgs {

    public static final DatasetJsonOptions Empty = new DatasetJsonOptions();

    @InputImport(name="multiLine")
    private final @Nullable Boolean multiLine;

    public Optional<Boolean> getMultiLine() {
        return this.multiLine == null ? Optional.empty() : Optional.ofNullable(this.multiLine);
    }

    public DatasetJsonOptions(@Nullable Boolean multiLine) {
        this.multiLine = multiLine;
    }

    private DatasetJsonOptions() {
        this.multiLine = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetJsonOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean multiLine;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetJsonOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiLine = defaults.multiLine;
        }

        public Builder setMultiLine(@Nullable Boolean multiLine) {
            this.multiLine = multiLine;
            return this;
        }

        public DatasetJsonOptions build() {
            return new DatasetJsonOptions(multiLine);
        }
    }
}
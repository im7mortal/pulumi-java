// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetMetadata extends io.pulumi.resources.InvokeArgs {

    public static final DatasetMetadata Empty = new DatasetMetadata();

    /**
     * Arn of the source of the dataset. For e.g.: AppFlow Flow ARN.
     * 
     */
    @InputImport(name="sourceArn")
    private final @Nullable String sourceArn;

    public Optional<String> getSourceArn() {
        return this.sourceArn == null ? Optional.empty() : Optional.ofNullable(this.sourceArn);
    }

    public DatasetMetadata(@Nullable String sourceArn) {
        this.sourceArn = sourceArn;
    }

    private DatasetMetadata() {
        this.sourceArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceArn = defaults.sourceArn;
        }

        public Builder setSourceArn(@Nullable String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        public DatasetMetadata build() {
            return new DatasetMetadata(sourceArn);
        }
    }
}

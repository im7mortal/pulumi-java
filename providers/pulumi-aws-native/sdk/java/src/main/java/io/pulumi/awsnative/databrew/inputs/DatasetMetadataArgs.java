// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetMetadataArgs Empty = new DatasetMetadataArgs();

    /**
     * Arn of the source of the dataset. For e.g.: AppFlow Flow ARN.
     * 
     */
    @InputImport(name="sourceArn")
    private final @Nullable Input<String> sourceArn;

    public Input<String> getSourceArn() {
        return this.sourceArn == null ? Input.empty() : this.sourceArn;
    }

    public DatasetMetadataArgs(@Nullable Input<String> sourceArn) {
        this.sourceArn = sourceArn;
    }

    private DatasetMetadataArgs() {
        this.sourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> sourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceArn = defaults.sourceArn;
        }

        public Builder setSourceArn(@Nullable Input<String> sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        public Builder setSourceArn(@Nullable String sourceArn) {
            this.sourceArn = Input.ofNullable(sourceArn);
            return this;
        }

        public DatasetMetadataArgs build() {
            return new DatasetMetadataArgs(sourceArn);
        }
    }
}

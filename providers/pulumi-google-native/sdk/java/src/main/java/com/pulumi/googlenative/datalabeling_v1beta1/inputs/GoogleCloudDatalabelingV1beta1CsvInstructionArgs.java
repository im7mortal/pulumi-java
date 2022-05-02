// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deprecated: this instruction format is not supported any more. Instruction from a CSV file.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1CsvInstructionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1CsvInstructionArgs Empty = new GoogleCloudDatalabelingV1beta1CsvInstructionArgs();

    /**
     * CSV file for the instruction. Only gcs path is allowed.
     * 
     */
    @Import(name="gcsFileUri")
    private @Nullable Output<String> gcsFileUri;

    /**
     * @return CSV file for the instruction. Only gcs path is allowed.
     * 
     */
    public Optional<Output<String>> gcsFileUri() {
        return Optional.ofNullable(this.gcsFileUri);
    }

    private GoogleCloudDatalabelingV1beta1CsvInstructionArgs() {}

    private GoogleCloudDatalabelingV1beta1CsvInstructionArgs(GoogleCloudDatalabelingV1beta1CsvInstructionArgs $) {
        this.gcsFileUri = $.gcsFileUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatalabelingV1beta1CsvInstructionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatalabelingV1beta1CsvInstructionArgs $;

        public Builder() {
            $ = new GoogleCloudDatalabelingV1beta1CsvInstructionArgs();
        }

        public Builder(GoogleCloudDatalabelingV1beta1CsvInstructionArgs defaults) {
            $ = new GoogleCloudDatalabelingV1beta1CsvInstructionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gcsFileUri CSV file for the instruction. Only gcs path is allowed.
         * 
         * @return builder
         * 
         */
        public Builder gcsFileUri(@Nullable Output<String> gcsFileUri) {
            $.gcsFileUri = gcsFileUri;
            return this;
        }

        /**
         * @param gcsFileUri CSV file for the instruction. Only gcs path is allowed.
         * 
         * @return builder
         * 
         */
        public Builder gcsFileUri(String gcsFileUri) {
            return gcsFileUri(Output.of(gcsFileUri));
        }

        public GoogleCloudDatalabelingV1beta1CsvInstructionArgs build() {
            return $;
        }
    }

}

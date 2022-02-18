// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.outputs;

import io.pulumi.awsnative.configuration.outputs.ConformancePackInputParameter;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConformancePackResult {
    /**
     * A list of ConformancePackInputParameter objects.
     * 
     */
    private final @Nullable List<ConformancePackInputParameter> conformancePackInputParameters;
    /**
     * AWS Config stores intermediate files while processing conformance pack template.
     * 
     */
    private final @Nullable String deliveryS3Bucket;
    /**
     * The prefix for delivery S3 bucket.
     * 
     */
    private final @Nullable String deliveryS3KeyPrefix;

    @OutputCustomType.Constructor({"conformancePackInputParameters","deliveryS3Bucket","deliveryS3KeyPrefix"})
    private GetConformancePackResult(
        @Nullable List<ConformancePackInputParameter> conformancePackInputParameters,
        @Nullable String deliveryS3Bucket,
        @Nullable String deliveryS3KeyPrefix) {
        this.conformancePackInputParameters = conformancePackInputParameters;
        this.deliveryS3Bucket = deliveryS3Bucket;
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
    }

    /**
     * A list of ConformancePackInputParameter objects.
     * 
     */
    public List<ConformancePackInputParameter> getConformancePackInputParameters() {
        return this.conformancePackInputParameters == null ? List.of() : this.conformancePackInputParameters;
    }
    /**
     * AWS Config stores intermediate files while processing conformance pack template.
     * 
     */
    public Optional<String> getDeliveryS3Bucket() {
        return Optional.ofNullable(this.deliveryS3Bucket);
    }
    /**
     * The prefix for delivery S3 bucket.
     * 
     */
    public Optional<String> getDeliveryS3KeyPrefix() {
        return Optional.ofNullable(this.deliveryS3KeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConformancePackResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConformancePackInputParameter> conformancePackInputParameters;
        private @Nullable String deliveryS3Bucket;
        private @Nullable String deliveryS3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConformancePackResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conformancePackInputParameters = defaults.conformancePackInputParameters;
    	      this.deliveryS3Bucket = defaults.deliveryS3Bucket;
    	      this.deliveryS3KeyPrefix = defaults.deliveryS3KeyPrefix;
        }

        public Builder setConformancePackInputParameters(@Nullable List<ConformancePackInputParameter> conformancePackInputParameters) {
            this.conformancePackInputParameters = conformancePackInputParameters;
            return this;
        }

        public Builder setDeliveryS3Bucket(@Nullable String deliveryS3Bucket) {
            this.deliveryS3Bucket = deliveryS3Bucket;
            return this;
        }

        public Builder setDeliveryS3KeyPrefix(@Nullable String deliveryS3KeyPrefix) {
            this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
            return this;
        }

        public GetConformancePackResult build() {
            return new GetConformancePackResult(conformancePackInputParameters, deliveryS3Bucket, deliveryS3KeyPrefix);
        }
    }
}

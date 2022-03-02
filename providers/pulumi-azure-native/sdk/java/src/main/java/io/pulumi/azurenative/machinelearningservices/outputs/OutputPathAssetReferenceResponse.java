// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OutputPathAssetReferenceResponse {
    /**
     * ARM resource ID of the job.
     * 
     */
    private final @Nullable String jobId;
    /**
     * The path of the file/directory in the job output.
     * 
     */
    private final @Nullable String path;
    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is 'OutputPath'.
     * 
     */
    private final String referenceType;

    @OutputCustomType.Constructor({"jobId","path","referenceType"})
    private OutputPathAssetReferenceResponse(
        @Nullable String jobId,
        @Nullable String path,
        String referenceType) {
        this.jobId = jobId;
        this.path = path;
        this.referenceType = Objects.requireNonNull(referenceType);
    }

    /**
     * ARM resource ID of the job.
     * 
    */
    public Optional<String> getJobId() {
        return Optional.ofNullable(this.jobId);
    }
    /**
     * The path of the file/directory in the job output.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is 'OutputPath'.
     * 
    */
    public String getReferenceType() {
        return this.referenceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputPathAssetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jobId;
        private @Nullable String path;
        private String referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputPathAssetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.path = defaults.path;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder setJobId(@Nullable String jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setReferenceType(String referenceType) {
            this.referenceType = Objects.requireNonNull(referenceType);
            return this;
        }
        public OutputPathAssetReferenceResponse build() {
            return new OutputPathAssetReferenceResponse(jobId, path, referenceType);
        }
    }
}

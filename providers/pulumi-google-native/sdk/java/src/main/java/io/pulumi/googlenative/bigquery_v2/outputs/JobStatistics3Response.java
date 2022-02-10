// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JobStatistics3Response {
    private final String badRecords;
    private final String inputFileBytes;
    private final String inputFiles;
    private final String outputBytes;
    private final String outputRows;

    @OutputCustomType.Constructor({"badRecords","inputFileBytes","inputFiles","outputBytes","outputRows"})
    private JobStatistics3Response(
        String badRecords,
        String inputFileBytes,
        String inputFiles,
        String outputBytes,
        String outputRows) {
        this.badRecords = Objects.requireNonNull(badRecords);
        this.inputFileBytes = Objects.requireNonNull(inputFileBytes);
        this.inputFiles = Objects.requireNonNull(inputFiles);
        this.outputBytes = Objects.requireNonNull(outputBytes);
        this.outputRows = Objects.requireNonNull(outputRows);
    }

    public String getBadRecords() {
        return this.badRecords;
    }
    public String getInputFileBytes() {
        return this.inputFileBytes;
    }
    public String getInputFiles() {
        return this.inputFiles;
    }
    public String getOutputBytes() {
        return this.outputBytes;
    }
    public String getOutputRows() {
        return this.outputRows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatistics3Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String badRecords;
        private String inputFileBytes;
        private String inputFiles;
        private String outputBytes;
        private String outputRows;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatistics3Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.badRecords = defaults.badRecords;
    	      this.inputFileBytes = defaults.inputFileBytes;
    	      this.inputFiles = defaults.inputFiles;
    	      this.outputBytes = defaults.outputBytes;
    	      this.outputRows = defaults.outputRows;
        }

        public Builder setBadRecords(String badRecords) {
            this.badRecords = Objects.requireNonNull(badRecords);
            return this;
        }

        public Builder setInputFileBytes(String inputFileBytes) {
            this.inputFileBytes = Objects.requireNonNull(inputFileBytes);
            return this;
        }

        public Builder setInputFiles(String inputFiles) {
            this.inputFiles = Objects.requireNonNull(inputFiles);
            return this;
        }

        public Builder setOutputBytes(String outputBytes) {
            this.outputBytes = Objects.requireNonNull(outputBytes);
            return this;
        }

        public Builder setOutputRows(String outputRows) {
            this.outputRows = Objects.requireNonNull(outputRows);
            return this;
        }

        public JobStatistics3Response build() {
            return new JobStatistics3Response(badRecords, inputFileBytes, inputFiles, outputBytes, outputRows);
        }
    }
}
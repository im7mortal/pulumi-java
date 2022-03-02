// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FileIODetailsResponse {
    /**
     * File Pattern used to access files by the connector.
     * 
     */
    private final String filePattern;

    @OutputCustomType.Constructor({"filePattern"})
    private FileIODetailsResponse(String filePattern) {
        this.filePattern = Objects.requireNonNull(filePattern);
    }

    /**
     * File Pattern used to access files by the connector.
     * 
    */
    public String getFilePattern() {
        return this.filePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileIODetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filePattern;

        public Builder() {
    	      // Empty
        }

        public Builder(FileIODetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePattern = defaults.filePattern;
        }

        public Builder setFilePattern(String filePattern) {
            this.filePattern = Objects.requireNonNull(filePattern);
            return this;
        }
        public FileIODetailsResponse build() {
            return new FileIODetailsResponse(filePattern);
        }
    }
}

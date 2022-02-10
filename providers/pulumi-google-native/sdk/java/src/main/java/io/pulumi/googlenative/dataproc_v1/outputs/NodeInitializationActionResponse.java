// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeInitializationActionResponse {
    private final String executableFile;
    private final String executionTimeout;

    @OutputCustomType.Constructor({"executableFile","executionTimeout"})
    private NodeInitializationActionResponse(
        String executableFile,
        String executionTimeout) {
        this.executableFile = Objects.requireNonNull(executableFile);
        this.executionTimeout = Objects.requireNonNull(executionTimeout);
    }

    public String getExecutableFile() {
        return this.executableFile;
    }
    public String getExecutionTimeout() {
        return this.executionTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInitializationActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executableFile;
        private String executionTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInitializationActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableFile = defaults.executableFile;
    	      this.executionTimeout = defaults.executionTimeout;
        }

        public Builder setExecutableFile(String executableFile) {
            this.executableFile = Objects.requireNonNull(executableFile);
            return this;
        }

        public Builder setExecutionTimeout(String executionTimeout) {
            this.executionTimeout = Objects.requireNonNull(executionTimeout);
            return this;
        }

        public NodeInitializationActionResponse build() {
            return new NodeInitializationActionResponse(executableFile, executionTimeout);
        }
    }
}
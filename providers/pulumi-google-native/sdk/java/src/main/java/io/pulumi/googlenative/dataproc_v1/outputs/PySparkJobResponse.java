// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.LoggingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class PySparkJobResponse {
    private final List<String> archiveUris;
    private final List<String> args;
    private final List<String> fileUris;
    private final List<String> jarFileUris;
    private final LoggingConfigResponse loggingConfig;
    private final String mainPythonFileUri;
    private final Map<String,String> properties;
    private final List<String> pythonFileUris;

    @OutputCustomType.Constructor({"archiveUris","args","fileUris","jarFileUris","loggingConfig","mainPythonFileUri","properties","pythonFileUris"})
    private PySparkJobResponse(
        List<String> archiveUris,
        List<String> args,
        List<String> fileUris,
        List<String> jarFileUris,
        LoggingConfigResponse loggingConfig,
        String mainPythonFileUri,
        Map<String,String> properties,
        List<String> pythonFileUris) {
        this.archiveUris = Objects.requireNonNull(archiveUris);
        this.args = Objects.requireNonNull(args);
        this.fileUris = Objects.requireNonNull(fileUris);
        this.jarFileUris = Objects.requireNonNull(jarFileUris);
        this.loggingConfig = Objects.requireNonNull(loggingConfig);
        this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri);
        this.properties = Objects.requireNonNull(properties);
        this.pythonFileUris = Objects.requireNonNull(pythonFileUris);
    }

    public List<String> getArchiveUris() {
        return this.archiveUris;
    }
    public List<String> getArgs() {
        return this.args;
    }
    public List<String> getFileUris() {
        return this.fileUris;
    }
    public List<String> getJarFileUris() {
        return this.jarFileUris;
    }
    public LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }
    public String getMainPythonFileUri() {
        return this.mainPythonFileUri;
    }
    public Map<String,String> getProperties() {
        return this.properties;
    }
    public List<String> getPythonFileUris() {
        return this.pythonFileUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PySparkJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private List<String> jarFileUris;
        private LoggingConfigResponse loggingConfig;
        private String mainPythonFileUri;
        private Map<String,String> properties;
        private List<String> pythonFileUris;

        public Builder() {
    	      // Empty
        }

        public Builder(PySparkJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainPythonFileUri = defaults.mainPythonFileUri;
    	      this.properties = defaults.properties;
    	      this.pythonFileUris = defaults.pythonFileUris;
        }

        public Builder setArchiveUris(List<String> archiveUris) {
            this.archiveUris = Objects.requireNonNull(archiveUris);
            return this;
        }

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setFileUris(List<String> fileUris) {
            this.fileUris = Objects.requireNonNull(fileUris);
            return this;
        }

        public Builder setJarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }

        public Builder setLoggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder setMainPythonFileUri(String mainPythonFileUri) {
            this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri);
            return this;
        }

        public Builder setProperties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setPythonFileUris(List<String> pythonFileUris) {
            this.pythonFileUris = Objects.requireNonNull(pythonFileUris);
            return this;
        }

        public PySparkJobResponse build() {
            return new PySparkJobResponse(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainPythonFileUri, properties, pythonFileUris);
        }
    }
}
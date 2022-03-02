// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.LoggingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class HadoopJobResponse {
    /**
     * Optional. HCFS URIs of archives to be extracted in the working directory of Hadoop drivers and tasks. Supported file types: .jar, .tar, .tar.gz, .tgz, or .zip.
     * 
     */
    private final List<String> archiveUris;
    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    private final List<String> args;
    /**
     * Optional. HCFS (Hadoop Compatible Filesystem) URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
     */
    private final List<String> fileUris;
    /**
     * Optional. Jar file URIs to add to the CLASSPATHs of the Hadoop driver and tasks.
     * 
     */
    private final List<String> jarFileUris;
    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    private final LoggingConfigResponse loggingConfig;
    /**
     * The name of the driver's main class. The jar file containing the class must be in the default CLASSPATH or specified in jar_file_uris.
     * 
     */
    private final String mainClass;
    /**
     * The HCFS URI of the jar file containing the main class. Examples: 'gs://foo-bucket/analytics-binaries/extract-useful-metrics-mr.jar' 'hdfs:/tmp/test-samples/custom-wordcount.jar' 'file:///home/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar'
     * 
     */
    private final String mainJarFileUri;
    /**
     * Optional. A mapping of property names to values, used to configure Hadoop. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site and classes in user code.
     * 
     */
    private final Map<String,String> properties;

    @OutputCustomType.Constructor({"archiveUris","args","fileUris","jarFileUris","loggingConfig","mainClass","mainJarFileUri","properties"})
    private HadoopJobResponse(
        List<String> archiveUris,
        List<String> args,
        List<String> fileUris,
        List<String> jarFileUris,
        LoggingConfigResponse loggingConfig,
        String mainClass,
        String mainJarFileUri,
        Map<String,String> properties) {
        this.archiveUris = Objects.requireNonNull(archiveUris);
        this.args = Objects.requireNonNull(args);
        this.fileUris = Objects.requireNonNull(fileUris);
        this.jarFileUris = Objects.requireNonNull(jarFileUris);
        this.loggingConfig = Objects.requireNonNull(loggingConfig);
        this.mainClass = Objects.requireNonNull(mainClass);
        this.mainJarFileUri = Objects.requireNonNull(mainJarFileUri);
        this.properties = Objects.requireNonNull(properties);
    }

    /**
     * Optional. HCFS URIs of archives to be extracted in the working directory of Hadoop drivers and tasks. Supported file types: .jar, .tar, .tar.gz, .tgz, or .zip.
     * 
    */
    public List<String> getArchiveUris() {
        return this.archiveUris;
    }
    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
    */
    public List<String> getArgs() {
        return this.args;
    }
    /**
     * Optional. HCFS (Hadoop Compatible Filesystem) URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
    */
    public List<String> getFileUris() {
        return this.fileUris;
    }
    /**
     * Optional. Jar file URIs to add to the CLASSPATHs of the Hadoop driver and tasks.
     * 
    */
    public List<String> getJarFileUris() {
        return this.jarFileUris;
    }
    /**
     * Optional. The runtime log config for job execution.
     * 
    */
    public LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }
    /**
     * The name of the driver's main class. The jar file containing the class must be in the default CLASSPATH or specified in jar_file_uris.
     * 
    */
    public String getMainClass() {
        return this.mainClass;
    }
    /**
     * The HCFS URI of the jar file containing the main class. Examples: 'gs://foo-bucket/analytics-binaries/extract-useful-metrics-mr.jar' 'hdfs:/tmp/test-samples/custom-wordcount.jar' 'file:///home/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar'
     * 
    */
    public String getMainJarFileUri() {
        return this.mainJarFileUri;
    }
    /**
     * Optional. A mapping of property names to values, used to configure Hadoop. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site and classes in user code.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HadoopJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private List<String> jarFileUris;
        private LoggingConfigResponse loggingConfig;
        private String mainClass;
        private String mainJarFileUri;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(HadoopJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainClass = defaults.mainClass;
    	      this.mainJarFileUri = defaults.mainJarFileUri;
    	      this.properties = defaults.properties;
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

        public Builder setMainClass(String mainClass) {
            this.mainClass = Objects.requireNonNull(mainClass);
            return this;
        }

        public Builder setMainJarFileUri(String mainJarFileUri) {
            this.mainJarFileUri = Objects.requireNonNull(mainJarFileUri);
            return this;
        }

        public Builder setProperties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public HadoopJobResponse build() {
            return new HadoopJobResponse(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainClass, mainJarFileUri, properties);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa;

import io.pulumi.awsnative.mwaa.enums.EnvironmentWebserverAccessMode;
import io.pulumi.awsnative.mwaa.inputs.EnvironmentLoggingConfigurationArgs;
import io.pulumi.awsnative.mwaa.inputs.EnvironmentNetworkConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Key/value pairs representing Airflow configuration variables.
     *     Keys are prefixed by their section:
     * 
     *     [core]
     *     dags_folder={AIRFLOW_HOME}/dags
     *     
     *     Would be represented as
     *     
     *     "core.dags_folder": "{AIRFLOW_HOME}/dags"
     * 
     */
    @InputImport(name="airflowConfigurationOptions")
    private final @Nullable Input<Object> airflowConfigurationOptions;

    public Input<Object> getAirflowConfigurationOptions() {
        return this.airflowConfigurationOptions == null ? Input.empty() : this.airflowConfigurationOptions;
    }

    @InputImport(name="airflowVersion")
    private final @Nullable Input<String> airflowVersion;

    public Input<String> getAirflowVersion() {
        return this.airflowVersion == null ? Input.empty() : this.airflowVersion;
    }

    @InputImport(name="dagS3Path")
    private final @Nullable Input<String> dagS3Path;

    public Input<String> getDagS3Path() {
        return this.dagS3Path == null ? Input.empty() : this.dagS3Path;
    }

    @InputImport(name="environmentClass")
    private final @Nullable Input<String> environmentClass;

    public Input<String> getEnvironmentClass() {
        return this.environmentClass == null ? Input.empty() : this.environmentClass;
    }

    @InputImport(name="executionRoleArn")
    private final @Nullable Input<String> executionRoleArn;

    public Input<String> getExecutionRoleArn() {
        return this.executionRoleArn == null ? Input.empty() : this.executionRoleArn;
    }

    @InputImport(name="kmsKey")
    private final @Nullable Input<String> kmsKey;

    public Input<String> getKmsKey() {
        return this.kmsKey == null ? Input.empty() : this.kmsKey;
    }

    @InputImport(name="loggingConfiguration")
    private final @Nullable Input<EnvironmentLoggingConfigurationArgs> loggingConfiguration;

    public Input<EnvironmentLoggingConfigurationArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Input.empty() : this.loggingConfiguration;
    }

    @InputImport(name="maxWorkers")
    private final @Nullable Input<Integer> maxWorkers;

    public Input<Integer> getMaxWorkers() {
        return this.maxWorkers == null ? Input.empty() : this.maxWorkers;
    }

    @InputImport(name="minWorkers")
    private final @Nullable Input<Integer> minWorkers;

    public Input<Integer> getMinWorkers() {
        return this.minWorkers == null ? Input.empty() : this.minWorkers;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="networkConfiguration")
    private final @Nullable Input<EnvironmentNetworkConfigurationArgs> networkConfiguration;

    public Input<EnvironmentNetworkConfigurationArgs> getNetworkConfiguration() {
        return this.networkConfiguration == null ? Input.empty() : this.networkConfiguration;
    }

    @InputImport(name="pluginsS3ObjectVersion")
    private final @Nullable Input<String> pluginsS3ObjectVersion;

    public Input<String> getPluginsS3ObjectVersion() {
        return this.pluginsS3ObjectVersion == null ? Input.empty() : this.pluginsS3ObjectVersion;
    }

    @InputImport(name="pluginsS3Path")
    private final @Nullable Input<String> pluginsS3Path;

    public Input<String> getPluginsS3Path() {
        return this.pluginsS3Path == null ? Input.empty() : this.pluginsS3Path;
    }

    @InputImport(name="requirementsS3ObjectVersion")
    private final @Nullable Input<String> requirementsS3ObjectVersion;

    public Input<String> getRequirementsS3ObjectVersion() {
        return this.requirementsS3ObjectVersion == null ? Input.empty() : this.requirementsS3ObjectVersion;
    }

    @InputImport(name="requirementsS3Path")
    private final @Nullable Input<String> requirementsS3Path;

    public Input<String> getRequirementsS3Path() {
        return this.requirementsS3Path == null ? Input.empty() : this.requirementsS3Path;
    }

    @InputImport(name="schedulers")
    private final @Nullable Input<Integer> schedulers;

    public Input<Integer> getSchedulers() {
        return this.schedulers == null ? Input.empty() : this.schedulers;
    }

    @InputImport(name="sourceBucketArn")
    private final @Nullable Input<String> sourceBucketArn;

    public Input<String> getSourceBucketArn() {
        return this.sourceBucketArn == null ? Input.empty() : this.sourceBucketArn;
    }

    /**
     * A map of tags for the environment.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Object> tags;

    public Input<Object> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="webserverAccessMode")
    private final @Nullable Input<EnvironmentWebserverAccessMode> webserverAccessMode;

    public Input<EnvironmentWebserverAccessMode> getWebserverAccessMode() {
        return this.webserverAccessMode == null ? Input.empty() : this.webserverAccessMode;
    }

    @InputImport(name="weeklyMaintenanceWindowStart")
    private final @Nullable Input<String> weeklyMaintenanceWindowStart;

    public Input<String> getWeeklyMaintenanceWindowStart() {
        return this.weeklyMaintenanceWindowStart == null ? Input.empty() : this.weeklyMaintenanceWindowStart;
    }

    public EnvironmentArgs(
        @Nullable Input<Object> airflowConfigurationOptions,
        @Nullable Input<String> airflowVersion,
        @Nullable Input<String> dagS3Path,
        @Nullable Input<String> environmentClass,
        @Nullable Input<String> executionRoleArn,
        @Nullable Input<String> kmsKey,
        @Nullable Input<EnvironmentLoggingConfigurationArgs> loggingConfiguration,
        @Nullable Input<Integer> maxWorkers,
        @Nullable Input<Integer> minWorkers,
        @Nullable Input<String> name,
        @Nullable Input<EnvironmentNetworkConfigurationArgs> networkConfiguration,
        @Nullable Input<String> pluginsS3ObjectVersion,
        @Nullable Input<String> pluginsS3Path,
        @Nullable Input<String> requirementsS3ObjectVersion,
        @Nullable Input<String> requirementsS3Path,
        @Nullable Input<Integer> schedulers,
        @Nullable Input<String> sourceBucketArn,
        @Nullable Input<Object> tags,
        @Nullable Input<EnvironmentWebserverAccessMode> webserverAccessMode,
        @Nullable Input<String> weeklyMaintenanceWindowStart) {
        this.airflowConfigurationOptions = airflowConfigurationOptions;
        this.airflowVersion = airflowVersion;
        this.dagS3Path = dagS3Path;
        this.environmentClass = environmentClass;
        this.executionRoleArn = executionRoleArn;
        this.kmsKey = kmsKey;
        this.loggingConfiguration = loggingConfiguration;
        this.maxWorkers = maxWorkers;
        this.minWorkers = minWorkers;
        this.name = name;
        this.networkConfiguration = networkConfiguration;
        this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
        this.pluginsS3Path = pluginsS3Path;
        this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
        this.requirementsS3Path = requirementsS3Path;
        this.schedulers = schedulers;
        this.sourceBucketArn = sourceBucketArn;
        this.tags = tags;
        this.webserverAccessMode = webserverAccessMode;
        this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
    }

    private EnvironmentArgs() {
        this.airflowConfigurationOptions = Input.empty();
        this.airflowVersion = Input.empty();
        this.dagS3Path = Input.empty();
        this.environmentClass = Input.empty();
        this.executionRoleArn = Input.empty();
        this.kmsKey = Input.empty();
        this.loggingConfiguration = Input.empty();
        this.maxWorkers = Input.empty();
        this.minWorkers = Input.empty();
        this.name = Input.empty();
        this.networkConfiguration = Input.empty();
        this.pluginsS3ObjectVersion = Input.empty();
        this.pluginsS3Path = Input.empty();
        this.requirementsS3ObjectVersion = Input.empty();
        this.requirementsS3Path = Input.empty();
        this.schedulers = Input.empty();
        this.sourceBucketArn = Input.empty();
        this.tags = Input.empty();
        this.webserverAccessMode = Input.empty();
        this.weeklyMaintenanceWindowStart = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> airflowConfigurationOptions;
        private @Nullable Input<String> airflowVersion;
        private @Nullable Input<String> dagS3Path;
        private @Nullable Input<String> environmentClass;
        private @Nullable Input<String> executionRoleArn;
        private @Nullable Input<String> kmsKey;
        private @Nullable Input<EnvironmentLoggingConfigurationArgs> loggingConfiguration;
        private @Nullable Input<Integer> maxWorkers;
        private @Nullable Input<Integer> minWorkers;
        private @Nullable Input<String> name;
        private @Nullable Input<EnvironmentNetworkConfigurationArgs> networkConfiguration;
        private @Nullable Input<String> pluginsS3ObjectVersion;
        private @Nullable Input<String> pluginsS3Path;
        private @Nullable Input<String> requirementsS3ObjectVersion;
        private @Nullable Input<String> requirementsS3Path;
        private @Nullable Input<Integer> schedulers;
        private @Nullable Input<String> sourceBucketArn;
        private @Nullable Input<Object> tags;
        private @Nullable Input<EnvironmentWebserverAccessMode> webserverAccessMode;
        private @Nullable Input<String> weeklyMaintenanceWindowStart;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigurationOptions = defaults.airflowConfigurationOptions;
    	      this.airflowVersion = defaults.airflowVersion;
    	      this.dagS3Path = defaults.dagS3Path;
    	      this.environmentClass = defaults.environmentClass;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.kmsKey = defaults.kmsKey;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.minWorkers = defaults.minWorkers;
    	      this.name = defaults.name;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.pluginsS3ObjectVersion = defaults.pluginsS3ObjectVersion;
    	      this.pluginsS3Path = defaults.pluginsS3Path;
    	      this.requirementsS3ObjectVersion = defaults.requirementsS3ObjectVersion;
    	      this.requirementsS3Path = defaults.requirementsS3Path;
    	      this.schedulers = defaults.schedulers;
    	      this.sourceBucketArn = defaults.sourceBucketArn;
    	      this.tags = defaults.tags;
    	      this.webserverAccessMode = defaults.webserverAccessMode;
    	      this.weeklyMaintenanceWindowStart = defaults.weeklyMaintenanceWindowStart;
        }

        public Builder setAirflowConfigurationOptions(@Nullable Input<Object> airflowConfigurationOptions) {
            this.airflowConfigurationOptions = airflowConfigurationOptions;
            return this;
        }

        public Builder setAirflowConfigurationOptions(@Nullable Object airflowConfigurationOptions) {
            this.airflowConfigurationOptions = Input.ofNullable(airflowConfigurationOptions);
            return this;
        }

        public Builder setAirflowVersion(@Nullable Input<String> airflowVersion) {
            this.airflowVersion = airflowVersion;
            return this;
        }

        public Builder setAirflowVersion(@Nullable String airflowVersion) {
            this.airflowVersion = Input.ofNullable(airflowVersion);
            return this;
        }

        public Builder setDagS3Path(@Nullable Input<String> dagS3Path) {
            this.dagS3Path = dagS3Path;
            return this;
        }

        public Builder setDagS3Path(@Nullable String dagS3Path) {
            this.dagS3Path = Input.ofNullable(dagS3Path);
            return this;
        }

        public Builder setEnvironmentClass(@Nullable Input<String> environmentClass) {
            this.environmentClass = environmentClass;
            return this;
        }

        public Builder setEnvironmentClass(@Nullable String environmentClass) {
            this.environmentClass = Input.ofNullable(environmentClass);
            return this;
        }

        public Builder setExecutionRoleArn(@Nullable Input<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder setExecutionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Input.ofNullable(executionRoleArn);
            return this;
        }

        public Builder setKmsKey(@Nullable Input<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder setKmsKey(@Nullable String kmsKey) {
            this.kmsKey = Input.ofNullable(kmsKey);
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable Input<EnvironmentLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable EnvironmentLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Input.ofNullable(loggingConfiguration);
            return this;
        }

        public Builder setMaxWorkers(@Nullable Input<Integer> maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }

        public Builder setMaxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = Input.ofNullable(maxWorkers);
            return this;
        }

        public Builder setMinWorkers(@Nullable Input<Integer> minWorkers) {
            this.minWorkers = minWorkers;
            return this;
        }

        public Builder setMinWorkers(@Nullable Integer minWorkers) {
            this.minWorkers = Input.ofNullable(minWorkers);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable Input<EnvironmentNetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable EnvironmentNetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Input.ofNullable(networkConfiguration);
            return this;
        }

        public Builder setPluginsS3ObjectVersion(@Nullable Input<String> pluginsS3ObjectVersion) {
            this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
            return this;
        }

        public Builder setPluginsS3ObjectVersion(@Nullable String pluginsS3ObjectVersion) {
            this.pluginsS3ObjectVersion = Input.ofNullable(pluginsS3ObjectVersion);
            return this;
        }

        public Builder setPluginsS3Path(@Nullable Input<String> pluginsS3Path) {
            this.pluginsS3Path = pluginsS3Path;
            return this;
        }

        public Builder setPluginsS3Path(@Nullable String pluginsS3Path) {
            this.pluginsS3Path = Input.ofNullable(pluginsS3Path);
            return this;
        }

        public Builder setRequirementsS3ObjectVersion(@Nullable Input<String> requirementsS3ObjectVersion) {
            this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
            return this;
        }

        public Builder setRequirementsS3ObjectVersion(@Nullable String requirementsS3ObjectVersion) {
            this.requirementsS3ObjectVersion = Input.ofNullable(requirementsS3ObjectVersion);
            return this;
        }

        public Builder setRequirementsS3Path(@Nullable Input<String> requirementsS3Path) {
            this.requirementsS3Path = requirementsS3Path;
            return this;
        }

        public Builder setRequirementsS3Path(@Nullable String requirementsS3Path) {
            this.requirementsS3Path = Input.ofNullable(requirementsS3Path);
            return this;
        }

        public Builder setSchedulers(@Nullable Input<Integer> schedulers) {
            this.schedulers = schedulers;
            return this;
        }

        public Builder setSchedulers(@Nullable Integer schedulers) {
            this.schedulers = Input.ofNullable(schedulers);
            return this;
        }

        public Builder setSourceBucketArn(@Nullable Input<String> sourceBucketArn) {
            this.sourceBucketArn = sourceBucketArn;
            return this;
        }

        public Builder setSourceBucketArn(@Nullable String sourceBucketArn) {
            this.sourceBucketArn = Input.ofNullable(sourceBucketArn);
            return this;
        }

        public Builder setTags(@Nullable Input<Object> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Object tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWebserverAccessMode(@Nullable Input<EnvironmentWebserverAccessMode> webserverAccessMode) {
            this.webserverAccessMode = webserverAccessMode;
            return this;
        }

        public Builder setWebserverAccessMode(@Nullable EnvironmentWebserverAccessMode webserverAccessMode) {
            this.webserverAccessMode = Input.ofNullable(webserverAccessMode);
            return this;
        }

        public Builder setWeeklyMaintenanceWindowStart(@Nullable Input<String> weeklyMaintenanceWindowStart) {
            this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
            return this;
        }

        public Builder setWeeklyMaintenanceWindowStart(@Nullable String weeklyMaintenanceWindowStart) {
            this.weeklyMaintenanceWindowStart = Input.ofNullable(weeklyMaintenanceWindowStart);
            return this;
        }

        public EnvironmentArgs build() {
            return new EnvironmentArgs(airflowConfigurationOptions, airflowVersion, dagS3Path, environmentClass, executionRoleArn, kmsKey, loggingConfiguration, maxWorkers, minWorkers, name, networkConfiguration, pluginsS3ObjectVersion, pluginsS3Path, requirementsS3ObjectVersion, requirementsS3Path, schedulers, sourceBucketArn, tags, webserverAccessMode, weeklyMaintenanceWindowStart);
        }
    }
}

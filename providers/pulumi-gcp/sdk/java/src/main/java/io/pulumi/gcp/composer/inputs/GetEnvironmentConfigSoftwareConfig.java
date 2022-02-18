// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetEnvironmentConfigSoftwareConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigSoftwareConfig Empty = new GetEnvironmentConfigSoftwareConfig();

    @InputImport(name="airflowConfigOverrides", required=true)
    private final Map<String,String> airflowConfigOverrides;

    public Map<String,String> getAirflowConfigOverrides() {
        return this.airflowConfigOverrides;
    }

    @InputImport(name="envVariables", required=true)
    private final Map<String,String> envVariables;

    public Map<String,String> getEnvVariables() {
        return this.envVariables;
    }

    @InputImport(name="imageVersion", required=true)
    private final String imageVersion;

    public String getImageVersion() {
        return this.imageVersion;
    }

    @InputImport(name="pypiPackages", required=true)
    private final Map<String,String> pypiPackages;

    public Map<String,String> getPypiPackages() {
        return this.pypiPackages;
    }

    @InputImport(name="pythonVersion", required=true)
    private final String pythonVersion;

    public String getPythonVersion() {
        return this.pythonVersion;
    }

    @InputImport(name="schedulerCount", required=true)
    private final Integer schedulerCount;

    public Integer getSchedulerCount() {
        return this.schedulerCount;
    }

    public GetEnvironmentConfigSoftwareConfig(
        Map<String,String> airflowConfigOverrides,
        Map<String,String> envVariables,
        String imageVersion,
        Map<String,String> pypiPackages,
        String pythonVersion,
        Integer schedulerCount) {
        this.airflowConfigOverrides = Objects.requireNonNull(airflowConfigOverrides, "expected parameter 'airflowConfigOverrides' to be non-null");
        this.envVariables = Objects.requireNonNull(envVariables, "expected parameter 'envVariables' to be non-null");
        this.imageVersion = Objects.requireNonNull(imageVersion, "expected parameter 'imageVersion' to be non-null");
        this.pypiPackages = Objects.requireNonNull(pypiPackages, "expected parameter 'pypiPackages' to be non-null");
        this.pythonVersion = Objects.requireNonNull(pythonVersion, "expected parameter 'pythonVersion' to be non-null");
        this.schedulerCount = Objects.requireNonNull(schedulerCount, "expected parameter 'schedulerCount' to be non-null");
    }

    private GetEnvironmentConfigSoftwareConfig() {
        this.airflowConfigOverrides = Map.of();
        this.envVariables = Map.of();
        this.imageVersion = null;
        this.pypiPackages = Map.of();
        this.pythonVersion = null;
        this.schedulerCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigSoftwareConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> airflowConfigOverrides;
        private Map<String,String> envVariables;
        private String imageVersion;
        private Map<String,String> pypiPackages;
        private String pythonVersion;
        private Integer schedulerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigSoftwareConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigOverrides = defaults.airflowConfigOverrides;
    	      this.envVariables = defaults.envVariables;
    	      this.imageVersion = defaults.imageVersion;
    	      this.pypiPackages = defaults.pypiPackages;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.schedulerCount = defaults.schedulerCount;
        }

        public Builder setAirflowConfigOverrides(Map<String,String> airflowConfigOverrides) {
            this.airflowConfigOverrides = Objects.requireNonNull(airflowConfigOverrides);
            return this;
        }

        public Builder setEnvVariables(Map<String,String> envVariables) {
            this.envVariables = Objects.requireNonNull(envVariables);
            return this;
        }

        public Builder setImageVersion(String imageVersion) {
            this.imageVersion = Objects.requireNonNull(imageVersion);
            return this;
        }

        public Builder setPypiPackages(Map<String,String> pypiPackages) {
            this.pypiPackages = Objects.requireNonNull(pypiPackages);
            return this;
        }

        public Builder setPythonVersion(String pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }

        public Builder setSchedulerCount(Integer schedulerCount) {
            this.schedulerCount = Objects.requireNonNull(schedulerCount);
            return this;
        }

        public GetEnvironmentConfigSoftwareConfig build() {
            return new GetEnvironmentConfigSoftwareConfig(airflowConfigOverrides, envVariables, imageVersion, pypiPackages, pythonVersion, schedulerCount);
        }
    }
}
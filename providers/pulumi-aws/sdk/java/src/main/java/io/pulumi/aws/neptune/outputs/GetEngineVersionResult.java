// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEngineVersionResult {
    private final @Nullable String engine;
    /**
     * The description of the database engine.
     * 
     */
    private final String engineDescription;
    /**
     * Set of log types that the database engine has available for export to CloudWatch Logs.
     * 
     */
    private final List<String> exportableLogTypes;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String parameterGroupFamily;
    private final @Nullable List<String> preferredVersions;
    /**
     * Set of the time zones supported by this engine.
     * 
     */
    private final List<String> supportedTimezones;
    /**
     * Indicates whether the engine version supports exporting the log types specified by `exportable_log_types` to CloudWatch Logs.
     * 
     */
    private final Boolean supportsLogExportsToCloudwatch;
    /**
     * Indicates whether the database engine version supports read replicas.
     * 
     */
    private final Boolean supportsReadReplica;
    /**
     * Set of engine versions that this database engine version can be upgraded to.
     * 
     */
    private final List<String> validUpgradeTargets;
    private final String version;
    /**
     * The description of the database engine version.
     * 
     */
    private final String versionDescription;

    @OutputCustomType.Constructor({"engine","engineDescription","exportableLogTypes","id","parameterGroupFamily","preferredVersions","supportedTimezones","supportsLogExportsToCloudwatch","supportsReadReplica","validUpgradeTargets","version","versionDescription"})
    private GetEngineVersionResult(
        @Nullable String engine,
        String engineDescription,
        List<String> exportableLogTypes,
        String id,
        String parameterGroupFamily,
        @Nullable List<String> preferredVersions,
        List<String> supportedTimezones,
        Boolean supportsLogExportsToCloudwatch,
        Boolean supportsReadReplica,
        List<String> validUpgradeTargets,
        String version,
        String versionDescription) {
        this.engine = engine;
        this.engineDescription = Objects.requireNonNull(engineDescription);
        this.exportableLogTypes = Objects.requireNonNull(exportableLogTypes);
        this.id = Objects.requireNonNull(id);
        this.parameterGroupFamily = Objects.requireNonNull(parameterGroupFamily);
        this.preferredVersions = preferredVersions;
        this.supportedTimezones = Objects.requireNonNull(supportedTimezones);
        this.supportsLogExportsToCloudwatch = Objects.requireNonNull(supportsLogExportsToCloudwatch);
        this.supportsReadReplica = Objects.requireNonNull(supportsReadReplica);
        this.validUpgradeTargets = Objects.requireNonNull(validUpgradeTargets);
        this.version = Objects.requireNonNull(version);
        this.versionDescription = Objects.requireNonNull(versionDescription);
    }

    public Optional<String> getEngine() {
        return Optional.ofNullable(this.engine);
    }
    /**
     * The description of the database engine.
     * 
    */
    public String getEngineDescription() {
        return this.engineDescription;
    }
    /**
     * Set of log types that the database engine has available for export to CloudWatch Logs.
     * 
    */
    public List<String> getExportableLogTypes() {
        return this.exportableLogTypes;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getParameterGroupFamily() {
        return this.parameterGroupFamily;
    }
    public List<String> getPreferredVersions() {
        return this.preferredVersions == null ? List.of() : this.preferredVersions;
    }
    /**
     * Set of the time zones supported by this engine.
     * 
    */
    public List<String> getSupportedTimezones() {
        return this.supportedTimezones;
    }
    /**
     * Indicates whether the engine version supports exporting the log types specified by `exportable_log_types` to CloudWatch Logs.
     * 
    */
    public Boolean getSupportsLogExportsToCloudwatch() {
        return this.supportsLogExportsToCloudwatch;
    }
    /**
     * Indicates whether the database engine version supports read replicas.
     * 
    */
    public Boolean getSupportsReadReplica() {
        return this.supportsReadReplica;
    }
    /**
     * Set of engine versions that this database engine version can be upgraded to.
     * 
    */
    public List<String> getValidUpgradeTargets() {
        return this.validUpgradeTargets;
    }
    public String getVersion() {
        return this.version;
    }
    /**
     * The description of the database engine version.
     * 
    */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEngineVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String engine;
        private String engineDescription;
        private List<String> exportableLogTypes;
        private String id;
        private String parameterGroupFamily;
        private @Nullable List<String> preferredVersions;
        private List<String> supportedTimezones;
        private Boolean supportsLogExportsToCloudwatch;
        private Boolean supportsReadReplica;
        private List<String> validUpgradeTargets;
        private String version;
        private String versionDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEngineVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engine = defaults.engine;
    	      this.engineDescription = defaults.engineDescription;
    	      this.exportableLogTypes = defaults.exportableLogTypes;
    	      this.id = defaults.id;
    	      this.parameterGroupFamily = defaults.parameterGroupFamily;
    	      this.preferredVersions = defaults.preferredVersions;
    	      this.supportedTimezones = defaults.supportedTimezones;
    	      this.supportsLogExportsToCloudwatch = defaults.supportsLogExportsToCloudwatch;
    	      this.supportsReadReplica = defaults.supportsReadReplica;
    	      this.validUpgradeTargets = defaults.validUpgradeTargets;
    	      this.version = defaults.version;
    	      this.versionDescription = defaults.versionDescription;
        }

        public Builder setEngine(@Nullable String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setEngineDescription(String engineDescription) {
            this.engineDescription = Objects.requireNonNull(engineDescription);
            return this;
        }

        public Builder setExportableLogTypes(List<String> exportableLogTypes) {
            this.exportableLogTypes = Objects.requireNonNull(exportableLogTypes);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setParameterGroupFamily(String parameterGroupFamily) {
            this.parameterGroupFamily = Objects.requireNonNull(parameterGroupFamily);
            return this;
        }

        public Builder setPreferredVersions(@Nullable List<String> preferredVersions) {
            this.preferredVersions = preferredVersions;
            return this;
        }

        public Builder setSupportedTimezones(List<String> supportedTimezones) {
            this.supportedTimezones = Objects.requireNonNull(supportedTimezones);
            return this;
        }

        public Builder setSupportsLogExportsToCloudwatch(Boolean supportsLogExportsToCloudwatch) {
            this.supportsLogExportsToCloudwatch = Objects.requireNonNull(supportsLogExportsToCloudwatch);
            return this;
        }

        public Builder setSupportsReadReplica(Boolean supportsReadReplica) {
            this.supportsReadReplica = Objects.requireNonNull(supportsReadReplica);
            return this;
        }

        public Builder setValidUpgradeTargets(List<String> validUpgradeTargets) {
            this.validUpgradeTargets = Objects.requireNonNull(validUpgradeTargets);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVersionDescription(String versionDescription) {
            this.versionDescription = Objects.requireNonNull(versionDescription);
            return this;
        }
        public GetEngineVersionResult build() {
            return new GetEngineVersionResult(engine, engineDescription, exportableLogTypes, id, parameterGroupFamily, preferredVersions, supportedTimezones, supportsLogExportsToCloudwatch, supportsReadReplica, validUpgradeTargets, version, versionDescription);
        }
    }
}

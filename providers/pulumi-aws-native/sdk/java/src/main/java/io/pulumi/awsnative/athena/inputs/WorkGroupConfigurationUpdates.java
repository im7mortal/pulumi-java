// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.inputs;

import io.pulumi.awsnative.athena.inputs.WorkGroupEngineVersion;
import io.pulumi.awsnative.athena.inputs.WorkGroupResultConfigurationUpdates;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration information that will be updated for this workgroup, which includes the location in Amazon S3 where query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, whether the workgroup settings override the client-side settings, and the data usage limit for the amount of bytes scanned per query, if it is specified.
 * 
 */
public final class WorkGroupConfigurationUpdates extends io.pulumi.resources.InvokeArgs {

    public static final WorkGroupConfigurationUpdates Empty = new WorkGroupConfigurationUpdates();

    @InputImport(name="bytesScannedCutoffPerQuery")
    private final @Nullable Integer bytesScannedCutoffPerQuery;

    public Optional<Integer> getBytesScannedCutoffPerQuery() {
        return this.bytesScannedCutoffPerQuery == null ? Optional.empty() : Optional.ofNullable(this.bytesScannedCutoffPerQuery);
    }

    @InputImport(name="enforceWorkGroupConfiguration")
    private final @Nullable Boolean enforceWorkGroupConfiguration;

    public Optional<Boolean> getEnforceWorkGroupConfiguration() {
        return this.enforceWorkGroupConfiguration == null ? Optional.empty() : Optional.ofNullable(this.enforceWorkGroupConfiguration);
    }

    @InputImport(name="engineVersion")
    private final @Nullable WorkGroupEngineVersion engineVersion;

    public Optional<WorkGroupEngineVersion> getEngineVersion() {
        return this.engineVersion == null ? Optional.empty() : Optional.ofNullable(this.engineVersion);
    }

    @InputImport(name="publishCloudWatchMetricsEnabled")
    private final @Nullable Boolean publishCloudWatchMetricsEnabled;

    public Optional<Boolean> getPublishCloudWatchMetricsEnabled() {
        return this.publishCloudWatchMetricsEnabled == null ? Optional.empty() : Optional.ofNullable(this.publishCloudWatchMetricsEnabled);
    }

    @InputImport(name="removeBytesScannedCutoffPerQuery")
    private final @Nullable Boolean removeBytesScannedCutoffPerQuery;

    public Optional<Boolean> getRemoveBytesScannedCutoffPerQuery() {
        return this.removeBytesScannedCutoffPerQuery == null ? Optional.empty() : Optional.ofNullable(this.removeBytesScannedCutoffPerQuery);
    }

    @InputImport(name="requesterPaysEnabled")
    private final @Nullable Boolean requesterPaysEnabled;

    public Optional<Boolean> getRequesterPaysEnabled() {
        return this.requesterPaysEnabled == null ? Optional.empty() : Optional.ofNullable(this.requesterPaysEnabled);
    }

    @InputImport(name="resultConfigurationUpdates")
    private final @Nullable WorkGroupResultConfigurationUpdates resultConfigurationUpdates;

    public Optional<WorkGroupResultConfigurationUpdates> getResultConfigurationUpdates() {
        return this.resultConfigurationUpdates == null ? Optional.empty() : Optional.ofNullable(this.resultConfigurationUpdates);
    }

    public WorkGroupConfigurationUpdates(
        @Nullable Integer bytesScannedCutoffPerQuery,
        @Nullable Boolean enforceWorkGroupConfiguration,
        @Nullable WorkGroupEngineVersion engineVersion,
        @Nullable Boolean publishCloudWatchMetricsEnabled,
        @Nullable Boolean removeBytesScannedCutoffPerQuery,
        @Nullable Boolean requesterPaysEnabled,
        @Nullable WorkGroupResultConfigurationUpdates resultConfigurationUpdates) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
        this.engineVersion = engineVersion;
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
        this.removeBytesScannedCutoffPerQuery = removeBytesScannedCutoffPerQuery;
        this.requesterPaysEnabled = requesterPaysEnabled;
        this.resultConfigurationUpdates = resultConfigurationUpdates;
    }

    private WorkGroupConfigurationUpdates() {
        this.bytesScannedCutoffPerQuery = null;
        this.enforceWorkGroupConfiguration = null;
        this.engineVersion = null;
        this.publishCloudWatchMetricsEnabled = null;
        this.removeBytesScannedCutoffPerQuery = null;
        this.requesterPaysEnabled = null;
        this.resultConfigurationUpdates = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupConfigurationUpdates defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bytesScannedCutoffPerQuery;
        private @Nullable Boolean enforceWorkGroupConfiguration;
        private @Nullable WorkGroupEngineVersion engineVersion;
        private @Nullable Boolean publishCloudWatchMetricsEnabled;
        private @Nullable Boolean removeBytesScannedCutoffPerQuery;
        private @Nullable Boolean requesterPaysEnabled;
        private @Nullable WorkGroupResultConfigurationUpdates resultConfigurationUpdates;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupConfigurationUpdates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesScannedCutoffPerQuery = defaults.bytesScannedCutoffPerQuery;
    	      this.enforceWorkGroupConfiguration = defaults.enforceWorkGroupConfiguration;
    	      this.engineVersion = defaults.engineVersion;
    	      this.publishCloudWatchMetricsEnabled = defaults.publishCloudWatchMetricsEnabled;
    	      this.removeBytesScannedCutoffPerQuery = defaults.removeBytesScannedCutoffPerQuery;
    	      this.requesterPaysEnabled = defaults.requesterPaysEnabled;
    	      this.resultConfigurationUpdates = defaults.resultConfigurationUpdates;
        }

        public Builder setBytesScannedCutoffPerQuery(@Nullable Integer bytesScannedCutoffPerQuery) {
            this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
            return this;
        }

        public Builder setEnforceWorkGroupConfiguration(@Nullable Boolean enforceWorkGroupConfiguration) {
            this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
            return this;
        }

        public Builder setEngineVersion(@Nullable WorkGroupEngineVersion engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setPublishCloudWatchMetricsEnabled(@Nullable Boolean publishCloudWatchMetricsEnabled) {
            this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
            return this;
        }

        public Builder setRemoveBytesScannedCutoffPerQuery(@Nullable Boolean removeBytesScannedCutoffPerQuery) {
            this.removeBytesScannedCutoffPerQuery = removeBytesScannedCutoffPerQuery;
            return this;
        }

        public Builder setRequesterPaysEnabled(@Nullable Boolean requesterPaysEnabled) {
            this.requesterPaysEnabled = requesterPaysEnabled;
            return this;
        }

        public Builder setResultConfigurationUpdates(@Nullable WorkGroupResultConfigurationUpdates resultConfigurationUpdates) {
            this.resultConfigurationUpdates = resultConfigurationUpdates;
            return this;
        }

        public WorkGroupConfigurationUpdates build() {
            return new WorkGroupConfigurationUpdates(bytesScannedCutoffPerQuery, enforceWorkGroupConfiguration, engineVersion, publishCloudWatchMetricsEnabled, removeBytesScannedCutoffPerQuery, requesterPaysEnabled, resultConfigurationUpdates);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorConfig;
import io.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorMetricSet;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAnomalyDetectorResult {
    /**
     * Configuration options for the AnomalyDetector
     * 
     */
    private final @Nullable AnomalyDetectorConfig anomalyDetectorConfig;
    /**
     * A description for the AnomalyDetector.
     * 
     */
    private final @Nullable String anomalyDetectorDescription;
    private final @Nullable String arn;
    /**
     * KMS key used to encrypt the AnomalyDetector data
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * List of metric sets for anomaly detection
     * 
     */
    private final @Nullable List<AnomalyDetectorMetricSet> metricSetList;

    @OutputCustomType.Constructor({"anomalyDetectorConfig","anomalyDetectorDescription","arn","kmsKeyArn","metricSetList"})
    private GetAnomalyDetectorResult(
        @Nullable AnomalyDetectorConfig anomalyDetectorConfig,
        @Nullable String anomalyDetectorDescription,
        @Nullable String arn,
        @Nullable String kmsKeyArn,
        @Nullable List<AnomalyDetectorMetricSet> metricSetList) {
        this.anomalyDetectorConfig = anomalyDetectorConfig;
        this.anomalyDetectorDescription = anomalyDetectorDescription;
        this.arn = arn;
        this.kmsKeyArn = kmsKeyArn;
        this.metricSetList = metricSetList;
    }

    /**
     * Configuration options for the AnomalyDetector
     * 
    */
    public Optional<AnomalyDetectorConfig> getAnomalyDetectorConfig() {
        return Optional.ofNullable(this.anomalyDetectorConfig);
    }
    /**
     * A description for the AnomalyDetector.
     * 
    */
    public Optional<String> getAnomalyDetectorDescription() {
        return Optional.ofNullable(this.anomalyDetectorDescription);
    }
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * KMS key used to encrypt the AnomalyDetector data
     * 
    */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * List of metric sets for anomaly detection
     * 
    */
    public List<AnomalyDetectorMetricSet> getMetricSetList() {
        return this.metricSetList == null ? List.of() : this.metricSetList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnomalyDetectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AnomalyDetectorConfig anomalyDetectorConfig;
        private @Nullable String anomalyDetectorDescription;
        private @Nullable String arn;
        private @Nullable String kmsKeyArn;
        private @Nullable List<AnomalyDetectorMetricSet> metricSetList;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnomalyDetectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anomalyDetectorConfig = defaults.anomalyDetectorConfig;
    	      this.anomalyDetectorDescription = defaults.anomalyDetectorDescription;
    	      this.arn = defaults.arn;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.metricSetList = defaults.metricSetList;
        }

        public Builder setAnomalyDetectorConfig(@Nullable AnomalyDetectorConfig anomalyDetectorConfig) {
            this.anomalyDetectorConfig = anomalyDetectorConfig;
            return this;
        }

        public Builder setAnomalyDetectorDescription(@Nullable String anomalyDetectorDescription) {
            this.anomalyDetectorDescription = anomalyDetectorDescription;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setMetricSetList(@Nullable List<AnomalyDetectorMetricSet> metricSetList) {
            this.metricSetList = metricSetList;
            return this;
        }
        public GetAnomalyDetectorResult build() {
            return new GetAnomalyDetectorResult(anomalyDetectorConfig, anomalyDetectorDescription, arn, kmsKeyArn, metricSetList);
        }
    }
}

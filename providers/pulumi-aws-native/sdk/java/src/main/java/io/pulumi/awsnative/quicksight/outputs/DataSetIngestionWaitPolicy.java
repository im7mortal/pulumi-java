// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSetIngestionWaitPolicy {
    /**
     * <p>The maximum time (in hours) to wait for Ingestion to complete. Default timeout is 36 hours.
     *  Applicable only when DataSetImportMode mode is set to SPICE and WaitForSpiceIngestion is set to true.</p>
     * 
     */
    private final @Nullable Double ingestionWaitTimeInHours;
    /**
     * <p>Wait for SPICE ingestion to finish to mark dataset creation/update successful. Default (true).
     *   Applicable only when DataSetImportMode mode is set to SPICE.</p>
     * 
     */
    private final @Nullable Boolean waitForSpiceIngestion;

    @OutputCustomType.Constructor({"ingestionWaitTimeInHours","waitForSpiceIngestion"})
    private DataSetIngestionWaitPolicy(
        @Nullable Double ingestionWaitTimeInHours,
        @Nullable Boolean waitForSpiceIngestion) {
        this.ingestionWaitTimeInHours = ingestionWaitTimeInHours;
        this.waitForSpiceIngestion = waitForSpiceIngestion;
    }

    /**
     * <p>The maximum time (in hours) to wait for Ingestion to complete. Default timeout is 36 hours.
     *  Applicable only when DataSetImportMode mode is set to SPICE and WaitForSpiceIngestion is set to true.</p>
     * 
     */
    public Optional<Double> getIngestionWaitTimeInHours() {
        return Optional.ofNullable(this.ingestionWaitTimeInHours);
    }
    /**
     * <p>Wait for SPICE ingestion to finish to mark dataset creation/update successful. Default (true).
     *   Applicable only when DataSetImportMode mode is set to SPICE.</p>
     * 
     */
    public Optional<Boolean> getWaitForSpiceIngestion() {
        return Optional.ofNullable(this.waitForSpiceIngestion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetIngestionWaitPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double ingestionWaitTimeInHours;
        private @Nullable Boolean waitForSpiceIngestion;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetIngestionWaitPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestionWaitTimeInHours = defaults.ingestionWaitTimeInHours;
    	      this.waitForSpiceIngestion = defaults.waitForSpiceIngestion;
        }

        public Builder setIngestionWaitTimeInHours(@Nullable Double ingestionWaitTimeInHours) {
            this.ingestionWaitTimeInHours = ingestionWaitTimeInHours;
            return this;
        }

        public Builder setWaitForSpiceIngestion(@Nullable Boolean waitForSpiceIngestion) {
            this.waitForSpiceIngestion = waitForSpiceIngestion;
            return this;
        }

        public DataSetIngestionWaitPolicy build() {
            return new DataSetIngestionWaitPolicy(ingestionWaitTimeInHours, waitForSpiceIngestion);
        }
    }
}

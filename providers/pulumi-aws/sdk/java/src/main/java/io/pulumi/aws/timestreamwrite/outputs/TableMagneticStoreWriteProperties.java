// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.timestreamwrite.outputs;

import io.pulumi.aws.timestreamwrite.outputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TableMagneticStoreWriteProperties {
    /**
     * A flag to enable magnetic store writes.
     * 
     */
    private final @Nullable Boolean enableMagneticStoreWrites;
    /**
     * The location to write error reports for records rejected asynchronously during magnetic store writes. See Magnetic Store Rejected Data Location below for more details.
     * 
     */
    private final @Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation magneticStoreRejectedDataLocation;

    @OutputCustomType.Constructor({"enableMagneticStoreWrites","magneticStoreRejectedDataLocation"})
    private TableMagneticStoreWriteProperties(
        @Nullable Boolean enableMagneticStoreWrites,
        @Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation magneticStoreRejectedDataLocation) {
        this.enableMagneticStoreWrites = enableMagneticStoreWrites;
        this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
    }

    /**
     * A flag to enable magnetic store writes.
     * 
    */
    public Optional<Boolean> getEnableMagneticStoreWrites() {
        return Optional.ofNullable(this.enableMagneticStoreWrites);
    }
    /**
     * The location to write error reports for records rejected asynchronously during magnetic store writes. See Magnetic Store Rejected Data Location below for more details.
     * 
    */
    public Optional<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation> getMagneticStoreRejectedDataLocation() {
        return Optional.ofNullable(this.magneticStoreRejectedDataLocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableMagneticStoreWriteProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableMagneticStoreWrites;
        private @Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation magneticStoreRejectedDataLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(TableMagneticStoreWriteProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableMagneticStoreWrites = defaults.enableMagneticStoreWrites;
    	      this.magneticStoreRejectedDataLocation = defaults.magneticStoreRejectedDataLocation;
        }

        public Builder setEnableMagneticStoreWrites(@Nullable Boolean enableMagneticStoreWrites) {
            this.enableMagneticStoreWrites = enableMagneticStoreWrites;
            return this;
        }

        public Builder setMagneticStoreRejectedDataLocation(@Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
            return this;
        }
        public TableMagneticStoreWriteProperties build() {
            return new TableMagneticStoreWriteProperties(enableMagneticStoreWrites, magneticStoreRejectedDataLocation);
        }
    }
}

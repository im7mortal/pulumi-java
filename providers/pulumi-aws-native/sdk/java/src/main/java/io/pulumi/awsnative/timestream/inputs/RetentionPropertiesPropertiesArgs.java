// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The retention duration of the memory store and the magnetic store.
 * 
 */
public final class RetentionPropertiesPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RetentionPropertiesPropertiesArgs Empty = new RetentionPropertiesPropertiesArgs();

    /**
     * The duration for which data must be stored in the magnetic store.
     * 
     */
    @InputImport(name="magneticStoreRetentionPeriodInDays")
    private final @Nullable Input<String> magneticStoreRetentionPeriodInDays;

    public Input<String> getMagneticStoreRetentionPeriodInDays() {
        return this.magneticStoreRetentionPeriodInDays == null ? Input.empty() : this.magneticStoreRetentionPeriodInDays;
    }

    /**
     * The duration for which data must be stored in the memory store.
     * 
     */
    @InputImport(name="memoryStoreRetentionPeriodInHours")
    private final @Nullable Input<String> memoryStoreRetentionPeriodInHours;

    public Input<String> getMemoryStoreRetentionPeriodInHours() {
        return this.memoryStoreRetentionPeriodInHours == null ? Input.empty() : this.memoryStoreRetentionPeriodInHours;
    }

    public RetentionPropertiesPropertiesArgs(
        @Nullable Input<String> magneticStoreRetentionPeriodInDays,
        @Nullable Input<String> memoryStoreRetentionPeriodInHours) {
        this.magneticStoreRetentionPeriodInDays = magneticStoreRetentionPeriodInDays;
        this.memoryStoreRetentionPeriodInHours = memoryStoreRetentionPeriodInHours;
    }

    private RetentionPropertiesPropertiesArgs() {
        this.magneticStoreRetentionPeriodInDays = Input.empty();
        this.memoryStoreRetentionPeriodInHours = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPropertiesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> magneticStoreRetentionPeriodInDays;
        private @Nullable Input<String> memoryStoreRetentionPeriodInHours;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPropertiesPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.magneticStoreRetentionPeriodInDays = defaults.magneticStoreRetentionPeriodInDays;
    	      this.memoryStoreRetentionPeriodInHours = defaults.memoryStoreRetentionPeriodInHours;
        }

        public Builder setMagneticStoreRetentionPeriodInDays(@Nullable Input<String> magneticStoreRetentionPeriodInDays) {
            this.magneticStoreRetentionPeriodInDays = magneticStoreRetentionPeriodInDays;
            return this;
        }

        public Builder setMagneticStoreRetentionPeriodInDays(@Nullable String magneticStoreRetentionPeriodInDays) {
            this.magneticStoreRetentionPeriodInDays = Input.ofNullable(magneticStoreRetentionPeriodInDays);
            return this;
        }

        public Builder setMemoryStoreRetentionPeriodInHours(@Nullable Input<String> memoryStoreRetentionPeriodInHours) {
            this.memoryStoreRetentionPeriodInHours = memoryStoreRetentionPeriodInHours;
            return this;
        }

        public Builder setMemoryStoreRetentionPeriodInHours(@Nullable String memoryStoreRetentionPeriodInHours) {
            this.memoryStoreRetentionPeriodInHours = Input.ofNullable(memoryStoreRetentionPeriodInHours);
            return this;
        }

        public RetentionPropertiesPropertiesArgs build() {
            return new RetentionPropertiesPropertiesArgs(magneticStoreRetentionPeriodInDays, memoryStoreRetentionPeriodInHours);
        }
    }
}

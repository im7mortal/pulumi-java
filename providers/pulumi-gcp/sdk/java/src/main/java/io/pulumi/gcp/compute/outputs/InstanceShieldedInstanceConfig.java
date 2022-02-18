// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceShieldedInstanceConfig {
    /**
     * -- Compare the most recent boot measurements to the integrity policy baseline and return a pair of pass/fail results depending on whether they match or not. Defaults to true.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    private final @Nullable Boolean enableIntegrityMonitoring;
    /**
     * -- Verify the digital signature of all boot components, and halt the boot process if signature verification fails. Defaults to false.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    private final @Nullable Boolean enableSecureBoot;
    /**
     * -- Use a virtualized trusted platform module, which is a specialized computer chip you can use to encrypt objects like keys and certificates. Defaults to true.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    private final @Nullable Boolean enableVtpm;

    @OutputCustomType.Constructor({"enableIntegrityMonitoring","enableSecureBoot","enableVtpm"})
    private InstanceShieldedInstanceConfig(
        @Nullable Boolean enableIntegrityMonitoring,
        @Nullable Boolean enableSecureBoot,
        @Nullable Boolean enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    /**
     * -- Compare the most recent boot measurements to the integrity policy baseline and return a pair of pass/fail results depending on whether they match or not. Defaults to true.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    public Optional<Boolean> getEnableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }
    /**
     * -- Verify the digital signature of all boot components, and halt the boot process if signature verification fails. Defaults to false.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    public Optional<Boolean> getEnableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }
    /**
     * -- Use a virtualized trusted platform module, which is a specialized computer chip you can use to encrypt objects like keys and certificates. Defaults to true.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    public Optional<Boolean> getEnableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableIntegrityMonitoring;
        private @Nullable Boolean enableSecureBoot;
        private @Nullable Boolean enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder setEnableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder setEnableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }

        public Builder setEnableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }

        public InstanceShieldedInstanceConfig build() {
            return new InstanceShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
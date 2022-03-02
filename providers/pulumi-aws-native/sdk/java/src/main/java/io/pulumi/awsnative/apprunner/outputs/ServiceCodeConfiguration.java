// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.outputs;

import io.pulumi.awsnative.apprunner.enums.ServiceCodeConfigurationConfigurationSource;
import io.pulumi.awsnative.apprunner.outputs.ServiceCodeConfigurationValues;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceCodeConfiguration {
    private final @Nullable ServiceCodeConfigurationValues codeConfigurationValues;
    /**
     * Configuration Source
     * 
     */
    private final ServiceCodeConfigurationConfigurationSource configurationSource;

    @OutputCustomType.Constructor({"codeConfigurationValues","configurationSource"})
    private ServiceCodeConfiguration(
        @Nullable ServiceCodeConfigurationValues codeConfigurationValues,
        ServiceCodeConfigurationConfigurationSource configurationSource) {
        this.codeConfigurationValues = codeConfigurationValues;
        this.configurationSource = Objects.requireNonNull(configurationSource);
    }

    public Optional<ServiceCodeConfigurationValues> getCodeConfigurationValues() {
        return Optional.ofNullable(this.codeConfigurationValues);
    }
    /**
     * Configuration Source
     * 
    */
    public ServiceCodeConfigurationConfigurationSource getConfigurationSource() {
        return this.configurationSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCodeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceCodeConfigurationValues codeConfigurationValues;
        private ServiceCodeConfigurationConfigurationSource configurationSource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCodeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfigurationValues = defaults.codeConfigurationValues;
    	      this.configurationSource = defaults.configurationSource;
        }

        public Builder setCodeConfigurationValues(@Nullable ServiceCodeConfigurationValues codeConfigurationValues) {
            this.codeConfigurationValues = codeConfigurationValues;
            return this;
        }

        public Builder setConfigurationSource(ServiceCodeConfigurationConfigurationSource configurationSource) {
            this.configurationSource = Objects.requireNonNull(configurationSource);
            return this;
        }
        public ServiceCodeConfiguration build() {
            return new ServiceCodeConfiguration(codeConfigurationValues, configurationSource);
        }
    }
}

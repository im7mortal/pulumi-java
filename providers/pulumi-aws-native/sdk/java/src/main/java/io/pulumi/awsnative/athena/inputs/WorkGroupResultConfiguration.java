// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.inputs;

import io.pulumi.awsnative.athena.inputs.WorkGroupEncryptionConfiguration;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The location in Amazon S3 where query results are stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the workgroup settings.
 * 
 */
public final class WorkGroupResultConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final WorkGroupResultConfiguration Empty = new WorkGroupResultConfiguration();

    @InputImport(name="encryptionConfiguration")
    private final @Nullable WorkGroupEncryptionConfiguration encryptionConfiguration;

    public Optional<WorkGroupEncryptionConfiguration> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Optional.empty() : Optional.ofNullable(this.encryptionConfiguration);
    }

    @InputImport(name="outputLocation")
    private final @Nullable String outputLocation;

    public Optional<String> getOutputLocation() {
        return this.outputLocation == null ? Optional.empty() : Optional.ofNullable(this.outputLocation);
    }

    public WorkGroupResultConfiguration(
        @Nullable WorkGroupEncryptionConfiguration encryptionConfiguration,
        @Nullable String outputLocation) {
        this.encryptionConfiguration = encryptionConfiguration;
        this.outputLocation = outputLocation;
    }

    private WorkGroupResultConfiguration() {
        this.encryptionConfiguration = null;
        this.outputLocation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupResultConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkGroupEncryptionConfiguration encryptionConfiguration;
        private @Nullable String outputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupResultConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.outputLocation = defaults.outputLocation;
        }

        public Builder setEncryptionConfiguration(@Nullable WorkGroupEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setOutputLocation(@Nullable String outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }

        public WorkGroupResultConfiguration build() {
            return new WorkGroupResultConfiguration(encryptionConfiguration, outputLocation);
        }
    }
}

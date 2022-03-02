// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccountAuditConfigurationAuditCheckConfiguration {
    /**
     * True if the check is enabled.
     * 
     */
    private final @Nullable Boolean enabled;

    @OutputCustomType.Constructor({"enabled"})
    private AccountAuditConfigurationAuditCheckConfiguration(@Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * True if the check is enabled.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAuditConfigurationAuditCheckConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAuditConfigurationAuditCheckConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public AccountAuditConfigurationAuditCheckConfiguration build() {
            return new AccountAuditConfigurationAuditCheckConfiguration(enabled);
        }
    }
}

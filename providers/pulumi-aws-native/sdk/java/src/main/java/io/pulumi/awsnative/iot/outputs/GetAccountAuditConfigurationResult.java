// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.AccountAuditConfigurationAuditCheckConfigurations;
import io.pulumi.awsnative.iot.outputs.AccountAuditConfigurationAuditNotificationTargetConfigurations;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccountAuditConfigurationResult {
    private final @Nullable AccountAuditConfigurationAuditCheckConfigurations auditCheckConfigurations;
    private final @Nullable AccountAuditConfigurationAuditNotificationTargetConfigurations auditNotificationTargetConfigurations;
    /**
     * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates and other items as required when performing an audit.
     * 
     */
    private final @Nullable String roleArn;

    @OutputCustomType.Constructor({"auditCheckConfigurations","auditNotificationTargetConfigurations","roleArn"})
    private GetAccountAuditConfigurationResult(
        @Nullable AccountAuditConfigurationAuditCheckConfigurations auditCheckConfigurations,
        @Nullable AccountAuditConfigurationAuditNotificationTargetConfigurations auditNotificationTargetConfigurations,
        @Nullable String roleArn) {
        this.auditCheckConfigurations = auditCheckConfigurations;
        this.auditNotificationTargetConfigurations = auditNotificationTargetConfigurations;
        this.roleArn = roleArn;
    }

    public Optional<AccountAuditConfigurationAuditCheckConfigurations> getAuditCheckConfigurations() {
        return Optional.ofNullable(this.auditCheckConfigurations);
    }
    public Optional<AccountAuditConfigurationAuditNotificationTargetConfigurations> getAuditNotificationTargetConfigurations() {
        return Optional.ofNullable(this.auditNotificationTargetConfigurations);
    }
    /**
     * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates and other items as required when performing an audit.
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountAuditConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccountAuditConfigurationAuditCheckConfigurations auditCheckConfigurations;
        private @Nullable AccountAuditConfigurationAuditNotificationTargetConfigurations auditNotificationTargetConfigurations;
        private @Nullable String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountAuditConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditCheckConfigurations = defaults.auditCheckConfigurations;
    	      this.auditNotificationTargetConfigurations = defaults.auditNotificationTargetConfigurations;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setAuditCheckConfigurations(@Nullable AccountAuditConfigurationAuditCheckConfigurations auditCheckConfigurations) {
            this.auditCheckConfigurations = auditCheckConfigurations;
            return this;
        }

        public Builder setAuditNotificationTargetConfigurations(@Nullable AccountAuditConfigurationAuditNotificationTargetConfigurations auditNotificationTargetConfigurations) {
            this.auditNotificationTargetConfigurations = auditNotificationTargetConfigurations;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public GetAccountAuditConfigurationResult build() {
            return new GetAccountAuditConfigurationResult(auditCheckConfigurations, auditNotificationTargetConfigurations, roleArn);
        }
    }
}

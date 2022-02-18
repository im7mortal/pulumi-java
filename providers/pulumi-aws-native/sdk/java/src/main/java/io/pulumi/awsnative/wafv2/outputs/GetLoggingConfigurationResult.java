// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.LoggingConfigurationFieldToMatch;
import io.pulumi.awsnative.wafv2.outputs.LoggingFilterProperties;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLoggingConfigurationResult {
    /**
     * The Amazon Resource Names (ARNs) of the logging destinations that you want to associate with the web ACL.
     * 
     */
    private final @Nullable List<String> logDestinationConfigs;
    /**
     * Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation.
     * 
     */
    private final @Nullable LoggingFilterProperties loggingFilter;
    /**
     * Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy configuration. If true, only Firewall Manager can modify or delete the configuration.
     * 
     */
    private final @Nullable Boolean managedByFirewallManager;
    /**
     * The parts of the request that you want to keep out of the logs. For example, if you redact the HEADER field, the HEADER field in the firehose will be xxx.
     * 
     */
    private final @Nullable List<LoggingConfigurationFieldToMatch> redactedFields;

    @OutputCustomType.Constructor({"logDestinationConfigs","loggingFilter","managedByFirewallManager","redactedFields"})
    private GetLoggingConfigurationResult(
        @Nullable List<String> logDestinationConfigs,
        @Nullable LoggingFilterProperties loggingFilter,
        @Nullable Boolean managedByFirewallManager,
        @Nullable List<LoggingConfigurationFieldToMatch> redactedFields) {
        this.logDestinationConfigs = logDestinationConfigs;
        this.loggingFilter = loggingFilter;
        this.managedByFirewallManager = managedByFirewallManager;
        this.redactedFields = redactedFields;
    }

    /**
     * The Amazon Resource Names (ARNs) of the logging destinations that you want to associate with the web ACL.
     * 
     */
    public List<String> getLogDestinationConfigs() {
        return this.logDestinationConfigs == null ? List.of() : this.logDestinationConfigs;
    }
    /**
     * Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation.
     * 
     */
    public Optional<LoggingFilterProperties> getLoggingFilter() {
        return Optional.ofNullable(this.loggingFilter);
    }
    /**
     * Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy configuration. If true, only Firewall Manager can modify or delete the configuration.
     * 
     */
    public Optional<Boolean> getManagedByFirewallManager() {
        return Optional.ofNullable(this.managedByFirewallManager);
    }
    /**
     * The parts of the request that you want to keep out of the logs. For example, if you redact the HEADER field, the HEADER field in the firehose will be xxx.
     * 
     */
    public List<LoggingConfigurationFieldToMatch> getRedactedFields() {
        return this.redactedFields == null ? List.of() : this.redactedFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> logDestinationConfigs;
        private @Nullable LoggingFilterProperties loggingFilter;
        private @Nullable Boolean managedByFirewallManager;
        private @Nullable List<LoggingConfigurationFieldToMatch> redactedFields;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoggingConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestinationConfigs = defaults.logDestinationConfigs;
    	      this.loggingFilter = defaults.loggingFilter;
    	      this.managedByFirewallManager = defaults.managedByFirewallManager;
    	      this.redactedFields = defaults.redactedFields;
        }

        public Builder setLogDestinationConfigs(@Nullable List<String> logDestinationConfigs) {
            this.logDestinationConfigs = logDestinationConfigs;
            return this;
        }

        public Builder setLoggingFilter(@Nullable LoggingFilterProperties loggingFilter) {
            this.loggingFilter = loggingFilter;
            return this;
        }

        public Builder setManagedByFirewallManager(@Nullable Boolean managedByFirewallManager) {
            this.managedByFirewallManager = managedByFirewallManager;
            return this;
        }

        public Builder setRedactedFields(@Nullable List<LoggingConfigurationFieldToMatch> redactedFields) {
            this.redactedFields = redactedFields;
            return this;
        }

        public GetLoggingConfigurationResult build() {
            return new GetLoggingConfigurationResult(logDestinationConfigs, loggingFilter, managedByFirewallManager, redactedFields);
        }
    }
}

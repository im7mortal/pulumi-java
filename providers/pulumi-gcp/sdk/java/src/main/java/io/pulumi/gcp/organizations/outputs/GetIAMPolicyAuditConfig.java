// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.organizations.outputs.GetIAMPolicyAuditConfigAuditLogConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetIAMPolicyAuditConfig {
    /**
     * A nested block that defines the operations you'd like to log.
     * 
     */
    private final List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs;
    /**
     * Defines a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    private final String service;

    @OutputCustomType.Constructor({"auditLogConfigs","service"})
    private GetIAMPolicyAuditConfig(
        List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs,
        String service) {
        this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
        this.service = Objects.requireNonNull(service);
    }

    /**
     * A nested block that defines the operations you'd like to log.
     * 
    */
    public List<GetIAMPolicyAuditConfigAuditLogConfig> getAuditLogConfigs() {
        return this.auditLogConfigs;
    }
    /**
     * Defines a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIAMPolicyAuditConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIAMPolicyAuditConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.service = defaults.service;
        }

        public Builder setAuditLogConfigs(List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public GetIAMPolicyAuditConfig build() {
            return new GetIAMPolicyAuditConfig(auditLogConfigs, service);
        }
    }
}

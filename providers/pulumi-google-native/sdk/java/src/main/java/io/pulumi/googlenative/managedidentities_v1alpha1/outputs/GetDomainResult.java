// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.managedidentities_v1alpha1.outputs.TrustResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetDomainResult {
    private final Boolean auditLogsEnabled;
    private final List<String> authorizedNetworks;
    private final String createTime;
    private final String fqdn;
    private final Map<String,String> labels;
    private final List<String> locations;
    private final String managedIdentitiesAdminName;
    private final String name;
    private final String reservedIpRange;
    private final String state;
    private final String statusMessage;
    private final List<TrustResponse> trusts;
    private final String updateTime;

    @OutputCustomType.Constructor({"auditLogsEnabled","authorizedNetworks","createTime","fqdn","labels","locations","managedIdentitiesAdminName","name","reservedIpRange","state","statusMessage","trusts","updateTime"})
    private GetDomainResult(
        Boolean auditLogsEnabled,
        List<String> authorizedNetworks,
        String createTime,
        String fqdn,
        Map<String,String> labels,
        List<String> locations,
        String managedIdentitiesAdminName,
        String name,
        String reservedIpRange,
        String state,
        String statusMessage,
        List<TrustResponse> trusts,
        String updateTime) {
        this.auditLogsEnabled = Objects.requireNonNull(auditLogsEnabled);
        this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
        this.createTime = Objects.requireNonNull(createTime);
        this.fqdn = Objects.requireNonNull(fqdn);
        this.labels = Objects.requireNonNull(labels);
        this.locations = Objects.requireNonNull(locations);
        this.managedIdentitiesAdminName = Objects.requireNonNull(managedIdentitiesAdminName);
        this.name = Objects.requireNonNull(name);
        this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
        this.state = Objects.requireNonNull(state);
        this.statusMessage = Objects.requireNonNull(statusMessage);
        this.trusts = Objects.requireNonNull(trusts);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    public Boolean getAuditLogsEnabled() {
        return this.auditLogsEnabled;
    }
    public List<String> getAuthorizedNetworks() {
        return this.authorizedNetworks;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public String getFqdn() {
        return this.fqdn;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public List<String> getLocations() {
        return this.locations;
    }
    public String getManagedIdentitiesAdminName() {
        return this.managedIdentitiesAdminName;
    }
    public String getName() {
        return this.name;
    }
    public String getReservedIpRange() {
        return this.reservedIpRange;
    }
    public String getState() {
        return this.state;
    }
    public String getStatusMessage() {
        return this.statusMessage;
    }
    public List<TrustResponse> getTrusts() {
        return this.trusts;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean auditLogsEnabled;
        private List<String> authorizedNetworks;
        private String createTime;
        private String fqdn;
        private Map<String,String> labels;
        private List<String> locations;
        private String managedIdentitiesAdminName;
        private String name;
        private String reservedIpRange;
        private String state;
        private String statusMessage;
        private List<TrustResponse> trusts;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogsEnabled = defaults.auditLogsEnabled;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.createTime = defaults.createTime;
    	      this.fqdn = defaults.fqdn;
    	      this.labels = defaults.labels;
    	      this.locations = defaults.locations;
    	      this.managedIdentitiesAdminName = defaults.managedIdentitiesAdminName;
    	      this.name = defaults.name;
    	      this.reservedIpRange = defaults.reservedIpRange;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
    	      this.trusts = defaults.trusts;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setAuditLogsEnabled(Boolean auditLogsEnabled) {
            this.auditLogsEnabled = Objects.requireNonNull(auditLogsEnabled);
            return this;
        }

        public Builder setAuthorizedNetworks(List<String> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLocations(List<String> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setManagedIdentitiesAdminName(String managedIdentitiesAdminName) {
            this.managedIdentitiesAdminName = Objects.requireNonNull(managedIdentitiesAdminName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReservedIpRange(String reservedIpRange) {
            this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public Builder setTrusts(List<TrustResponse> trusts) {
            this.trusts = Objects.requireNonNull(trusts);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetDomainResult build() {
            return new GetDomainResult(auditLogsEnabled, authorizedNetworks, createTime, fqdn, labels, locations, managedIdentitiesAdminName, name, reservedIpRange, state, statusMessage, trusts, updateTime);
        }
    }
}
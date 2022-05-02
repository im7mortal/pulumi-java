// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dns_v2.outputs.ManagedZoneCloudLoggingConfigResponse;
import com.pulumi.googlenative.dns_v2.outputs.ManagedZoneDnsSecConfigResponse;
import com.pulumi.googlenative.dns_v2.outputs.ManagedZoneForwardingConfigResponse;
import com.pulumi.googlenative.dns_v2.outputs.ManagedZonePeeringConfigResponse;
import com.pulumi.googlenative.dns_v2.outputs.ManagedZonePrivateVisibilityConfigResponse;
import com.pulumi.googlenative.dns_v2.outputs.ManagedZoneReverseLookupConfigResponse;
import com.pulumi.googlenative.dns_v2.outputs.ManagedZoneServiceDirectoryConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetManagedZoneResult {
    private final ManagedZoneCloudLoggingConfigResponse cloudLoggingConfig;
    /**
     * @return The time that this resource was created on the server. This is in RFC3339 text format. Output only.
     * 
     */
    private final String creationTime;
    /**
     * @return A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the managed zone&#39;s function.
     * 
     */
    private final String description;
    /**
     * @return The DNS name of this managed zone, for instance &#34;example.com.&#34;.
     * 
     */
    private final String dnsName;
    /**
     * @return DNSSEC configuration.
     * 
     */
    private final ManagedZoneDnsSecConfigResponse dnssecConfig;
    /**
     * @return The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
     * 
     */
    private final ManagedZoneForwardingConfigResponse forwardingConfig;
    private final String kind;
    /**
     * @return User labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
     * 
     */
    private final String name;
    /**
     * @return Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
     * 
     */
    private final String nameServerSet;
    /**
     * @return Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     * 
     */
    private final List<String> nameServers;
    /**
     * @return The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
     * 
     */
    private final ManagedZonePeeringConfigResponse peeringConfig;
    /**
     * @return For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
     * 
     */
    private final ManagedZonePrivateVisibilityConfigResponse privateVisibilityConfig;
    /**
     * @return The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
     * 
     */
    private final ManagedZoneReverseLookupConfigResponse reverseLookupConfig;
    /**
     * @return This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
     * 
     */
    private final ManagedZoneServiceDirectoryConfigResponse serviceDirectoryConfig;
    /**
     * @return The zone&#39;s visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
     * 
     */
    private final String visibility;

    @CustomType.Constructor
    private GetManagedZoneResult(
        @CustomType.Parameter("cloudLoggingConfig") ManagedZoneCloudLoggingConfigResponse cloudLoggingConfig,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("dnsName") String dnsName,
        @CustomType.Parameter("dnssecConfig") ManagedZoneDnsSecConfigResponse dnssecConfig,
        @CustomType.Parameter("forwardingConfig") ManagedZoneForwardingConfigResponse forwardingConfig,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nameServerSet") String nameServerSet,
        @CustomType.Parameter("nameServers") List<String> nameServers,
        @CustomType.Parameter("peeringConfig") ManagedZonePeeringConfigResponse peeringConfig,
        @CustomType.Parameter("privateVisibilityConfig") ManagedZonePrivateVisibilityConfigResponse privateVisibilityConfig,
        @CustomType.Parameter("reverseLookupConfig") ManagedZoneReverseLookupConfigResponse reverseLookupConfig,
        @CustomType.Parameter("serviceDirectoryConfig") ManagedZoneServiceDirectoryConfigResponse serviceDirectoryConfig,
        @CustomType.Parameter("visibility") String visibility) {
        this.cloudLoggingConfig = cloudLoggingConfig;
        this.creationTime = creationTime;
        this.description = description;
        this.dnsName = dnsName;
        this.dnssecConfig = dnssecConfig;
        this.forwardingConfig = forwardingConfig;
        this.kind = kind;
        this.labels = labels;
        this.name = name;
        this.nameServerSet = nameServerSet;
        this.nameServers = nameServers;
        this.peeringConfig = peeringConfig;
        this.privateVisibilityConfig = privateVisibilityConfig;
        this.reverseLookupConfig = reverseLookupConfig;
        this.serviceDirectoryConfig = serviceDirectoryConfig;
        this.visibility = visibility;
    }

    public ManagedZoneCloudLoggingConfigResponse cloudLoggingConfig() {
        return this.cloudLoggingConfig;
    }
    /**
     * @return The time that this resource was created on the server. This is in RFC3339 text format. Output only.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the managed zone&#39;s function.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The DNS name of this managed zone, for instance &#34;example.com.&#34;.
     * 
     */
    public String dnsName() {
        return this.dnsName;
    }
    /**
     * @return DNSSEC configuration.
     * 
     */
    public ManagedZoneDnsSecConfigResponse dnssecConfig() {
        return this.dnssecConfig;
    }
    /**
     * @return The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
     * 
     */
    public ManagedZoneForwardingConfigResponse forwardingConfig() {
        return this.forwardingConfig;
    }
    public String kind() {
        return this.kind;
    }
    /**
     * @return User labels.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
     * 
     */
    public String nameServerSet() {
        return this.nameServerSet;
    }
    /**
     * @return Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     * 
     */
    public List<String> nameServers() {
        return this.nameServers;
    }
    /**
     * @return The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
     * 
     */
    public ManagedZonePeeringConfigResponse peeringConfig() {
        return this.peeringConfig;
    }
    /**
     * @return For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
     * 
     */
    public ManagedZonePrivateVisibilityConfigResponse privateVisibilityConfig() {
        return this.privateVisibilityConfig;
    }
    /**
     * @return The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
     * 
     */
    public ManagedZoneReverseLookupConfigResponse reverseLookupConfig() {
        return this.reverseLookupConfig;
    }
    /**
     * @return This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
     * 
     */
    public ManagedZoneServiceDirectoryConfigResponse serviceDirectoryConfig() {
        return this.serviceDirectoryConfig;
    }
    /**
     * @return The zone&#39;s visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
     * 
     */
    public String visibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedZoneResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneCloudLoggingConfigResponse cloudLoggingConfig;
        private String creationTime;
        private String description;
        private String dnsName;
        private ManagedZoneDnsSecConfigResponse dnssecConfig;
        private ManagedZoneForwardingConfigResponse forwardingConfig;
        private String kind;
        private Map<String,String> labels;
        private String name;
        private String nameServerSet;
        private List<String> nameServers;
        private ManagedZonePeeringConfigResponse peeringConfig;
        private ManagedZonePrivateVisibilityConfigResponse privateVisibilityConfig;
        private ManagedZoneReverseLookupConfigResponse reverseLookupConfig;
        private ManagedZoneServiceDirectoryConfigResponse serviceDirectoryConfig;
        private String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudLoggingConfig = defaults.cloudLoggingConfig;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.dnsName = defaults.dnsName;
    	      this.dnssecConfig = defaults.dnssecConfig;
    	      this.forwardingConfig = defaults.forwardingConfig;
    	      this.kind = defaults.kind;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.nameServerSet = defaults.nameServerSet;
    	      this.nameServers = defaults.nameServers;
    	      this.peeringConfig = defaults.peeringConfig;
    	      this.privateVisibilityConfig = defaults.privateVisibilityConfig;
    	      this.reverseLookupConfig = defaults.reverseLookupConfig;
    	      this.serviceDirectoryConfig = defaults.serviceDirectoryConfig;
    	      this.visibility = defaults.visibility;
        }

        public Builder cloudLoggingConfig(ManagedZoneCloudLoggingConfigResponse cloudLoggingConfig) {
            this.cloudLoggingConfig = Objects.requireNonNull(cloudLoggingConfig);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder dnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }
        public Builder dnssecConfig(ManagedZoneDnsSecConfigResponse dnssecConfig) {
            this.dnssecConfig = Objects.requireNonNull(dnssecConfig);
            return this;
        }
        public Builder forwardingConfig(ManagedZoneForwardingConfigResponse forwardingConfig) {
            this.forwardingConfig = Objects.requireNonNull(forwardingConfig);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nameServerSet(String nameServerSet) {
            this.nameServerSet = Objects.requireNonNull(nameServerSet);
            return this;
        }
        public Builder nameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }
        public Builder peeringConfig(ManagedZonePeeringConfigResponse peeringConfig) {
            this.peeringConfig = Objects.requireNonNull(peeringConfig);
            return this;
        }
        public Builder privateVisibilityConfig(ManagedZonePrivateVisibilityConfigResponse privateVisibilityConfig) {
            this.privateVisibilityConfig = Objects.requireNonNull(privateVisibilityConfig);
            return this;
        }
        public Builder reverseLookupConfig(ManagedZoneReverseLookupConfigResponse reverseLookupConfig) {
            this.reverseLookupConfig = Objects.requireNonNull(reverseLookupConfig);
            return this;
        }
        public Builder serviceDirectoryConfig(ManagedZoneServiceDirectoryConfigResponse serviceDirectoryConfig) {
            this.serviceDirectoryConfig = Objects.requireNonNull(serviceDirectoryConfig);
            return this;
        }
        public Builder visibility(String visibility) {
            this.visibility = Objects.requireNonNull(visibility);
            return this;
        }        public GetManagedZoneResult build() {
            return new GetManagedZoneResult(cloudLoggingConfig, creationTime, description, dnsName, dnssecConfig, forwardingConfig, kind, labels, name, nameServerSet, nameServers, peeringConfig, privateVisibilityConfig, reverseLookupConfig, serviceDirectoryConfig, visibility);
        }
    }
}

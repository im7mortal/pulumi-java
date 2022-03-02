// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AccessConfigResponse {
    /**
     * The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. The field is output only, an IPv6 address from a subnetwork associated with the instance will be allocated dynamically.
     * 
     */
    private final String externalIpv6;
    /**
     * The prefix length of the external IPv6 range.
     * 
     */
    private final Integer externalIpv6PrefixLength;
    /**
     * Type of the resource. Always compute#accessConfig for access configs.
     * 
     */
    private final String kind;
    /**
     * The name of this access configuration. The default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access.
     * 
     */
    private final String name;
    /**
     * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
     * 
     */
    private final String natIP;
    /**
     * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
     * 
     */
    private final String networkTier;
    /**
     * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
     * 
     */
    private final String publicPtrDomainName;
    /**
     * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
     * 
     */
    private final Boolean setPublicPtr;
    /**
     * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"externalIpv6","externalIpv6PrefixLength","kind","name","natIP","networkTier","publicPtrDomainName","setPublicPtr","type"})
    private AccessConfigResponse(
        String externalIpv6,
        Integer externalIpv6PrefixLength,
        String kind,
        String name,
        String natIP,
        String networkTier,
        String publicPtrDomainName,
        Boolean setPublicPtr,
        String type) {
        this.externalIpv6 = Objects.requireNonNull(externalIpv6);
        this.externalIpv6PrefixLength = Objects.requireNonNull(externalIpv6PrefixLength);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.natIP = Objects.requireNonNull(natIP);
        this.networkTier = Objects.requireNonNull(networkTier);
        this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
        this.setPublicPtr = Objects.requireNonNull(setPublicPtr);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. The field is output only, an IPv6 address from a subnetwork associated with the instance will be allocated dynamically.
     * 
    */
    public String getExternalIpv6() {
        return this.externalIpv6;
    }
    /**
     * The prefix length of the external IPv6 range.
     * 
    */
    public Integer getExternalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength;
    }
    /**
     * Type of the resource. Always compute#accessConfig for access configs.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of this access configuration. The default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
     * 
    */
    public String getNatIP() {
        return this.natIP;
    }
    /**
     * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
     * 
    */
    public String getNetworkTier() {
        return this.networkTier;
    }
    /**
     * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
     * 
    */
    public String getPublicPtrDomainName() {
        return this.publicPtrDomainName;
    }
    /**
     * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
     * 
    */
    public Boolean getSetPublicPtr() {
        return this.setPublicPtr;
    }
    /**
     * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalIpv6;
        private Integer externalIpv6PrefixLength;
        private String kind;
        private String name;
        private String natIP;
        private String networkTier;
        private String publicPtrDomainName;
        private Boolean setPublicPtr;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpv6 = defaults.externalIpv6;
    	      this.externalIpv6PrefixLength = defaults.externalIpv6PrefixLength;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.natIP = defaults.natIP;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
    	      this.setPublicPtr = defaults.setPublicPtr;
    	      this.type = defaults.type;
        }

        public Builder setExternalIpv6(String externalIpv6) {
            this.externalIpv6 = Objects.requireNonNull(externalIpv6);
            return this;
        }

        public Builder setExternalIpv6PrefixLength(Integer externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = Objects.requireNonNull(externalIpv6PrefixLength);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNatIP(String natIP) {
            this.natIP = Objects.requireNonNull(natIP);
            return this;
        }

        public Builder setNetworkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder setPublicPtrDomainName(String publicPtrDomainName) {
            this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
            return this;
        }

        public Builder setSetPublicPtr(Boolean setPublicPtr) {
            this.setPublicPtr = Objects.requireNonNull(setPublicPtr);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AccessConfigResponse build() {
            return new AccessConfigResponse(externalIpv6, externalIpv6PrefixLength, kind, name, natIP, networkTier, publicPtrDomainName, setPublicPtr, type);
        }
    }
}

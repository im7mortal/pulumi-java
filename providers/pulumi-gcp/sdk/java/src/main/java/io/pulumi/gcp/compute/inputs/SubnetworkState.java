// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SubnetworkLogConfigGetArgs;
import io.pulumi.gcp.compute.inputs.SubnetworkSecondaryIpRangeGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkState extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkState Empty = new SubnetworkState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
      private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource. This field can be set only at resource
     * creation time.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    @InputImport(name="externalIpv6Prefix")
      private final @Nullable Input<String> externalIpv6Prefix;

    public Input<String> getExternalIpv6Prefix() {
        return this.externalIpv6Prefix == null ? Input.empty() : this.externalIpv6Prefix;
    }

    /**
     * Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     * @Deprecated
     * This field is not useful for users, and has been removed as an output.
     * 
     */
    @Deprecated /* This field is not useful for users, and has been removed as an output. */
    @InputImport(name="fingerprint")
      private final @Nullable Input<String> fingerprint;

    @Deprecated /* This field is not useful for users, and has been removed as an output. */
    public Input<String> getFingerprint() {
        return this.fingerprint == null ? Input.empty() : this.fingerprint;
    }

    /**
     * The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    @InputImport(name="gatewayAddress")
      private final @Nullable Input<String> gatewayAddress;

    public Input<String> getGatewayAddress() {
        return this.gatewayAddress == null ? Input.empty() : this.gatewayAddress;
    }

    /**
     * The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * 
     */
    @InputImport(name="ipCidrRange")
      private final @Nullable Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Input.empty() : this.ipCidrRange;
    }

    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation
     * or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet
     * cannot enable direct path.
     * Possible values are `EXTERNAL`.
     * 
     */
    @InputImport(name="ipv6AccessType")
      private final @Nullable Input<String> ipv6AccessType;

    public Input<String> getIpv6AccessType() {
        return this.ipv6AccessType == null ? Input.empty() : this.ipv6AccessType;
    }

    /**
     * The range of internal IPv6 addresses that are owned by this subnetwork.
     * 
     */
    @InputImport(name="ipv6CidrRange")
      private final @Nullable Input<String> ipv6CidrRange;

    public Input<String> getIpv6CidrRange() {
        return this.ipv6CidrRange == null ? Input.empty() : this.ipv6CidrRange;
    }

    /**
     * Denotes the logging options for the subnetwork flow logs. If logging is enabled
     * logs will be exported to Stackdriver. This field cannot be set if the `purpose` of this
     * subnetwork is `INTERNAL_HTTPS_LOAD_BALANCER`
     * Structure is documented below.
     * 
     */
    @InputImport(name="logConfig")
      private final @Nullable Input<SubnetworkLogConfigGetArgs> logConfig;

    public Input<SubnetworkLogConfigGetArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * The name of the resource, provided by the client when initially
     * creating the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The network this subnet belongs to.
     * Only networks that are in the distributed mode can have subnetworks.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * When enabled, VMs in this subnetwork without external IP addresses can
     * access Google APIs and services by using Private Google Access.
     * 
     */
    @InputImport(name="privateIpGoogleAccess")
      private final @Nullable Input<Boolean> privateIpGoogleAccess;

    public Input<Boolean> getPrivateIpGoogleAccess() {
        return this.privateIpGoogleAccess == null ? Input.empty() : this.privateIpGoogleAccess;
    }

    /**
     * The private IPv6 google access type for the VMs in this subnet.
     * 
     */
    @InputImport(name="privateIpv6GoogleAccess")
      private final @Nullable Input<String> privateIpv6GoogleAccess;

    public Input<String> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Input.empty() : this.privateIpv6GoogleAccess;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The purpose of the resource. A subnetwork with purpose set to
     * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
     * reserved for Internal HTTP(S) Load Balancing.
     * If set to INTERNAL_HTTPS_LOAD_BALANCER you must also set the `role` field.
     * 
     */
    @InputImport(name="purpose")
      private final @Nullable Input<String> purpose;

    public Input<String> getPurpose() {
        return this.purpose == null ? Input.empty() : this.purpose;
    }

    /**
     * The GCP region for this subnetwork.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The role of subnetwork. Currently, this field is only used when
     * purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE
     * or BACKUP. An ACTIVE subnetwork is one that is currently being used
     * for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that
     * is ready to be promoted to ACTIVE or is currently draining.
     * Possible values are `ACTIVE` and `BACKUP`.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * An array of configurations for secondary IP ranges for VM instances
     * contained in this subnetwork. The primary IP of such VM must belong
     * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
     * to either primary or secondary ranges.
     * Structure is documented below.
     * 
     */
    @InputImport(name="secondaryIpRanges")
      private final @Nullable Input<List<SubnetworkSecondaryIpRangeGetArgs>> secondaryIpRanges;

    public Input<List<SubnetworkSecondaryIpRangeGetArgs>> getSecondaryIpRanges() {
        return this.secondaryIpRanges == null ? Input.empty() : this.secondaryIpRanges;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not.
     * If not specified IPV4_ONLY will be used.
     * Possible values are `IPV4_ONLY` and `IPV4_IPV6`.
     * 
     */
    @InputImport(name="stackType")
      private final @Nullable Input<String> stackType;

    public Input<String> getStackType() {
        return this.stackType == null ? Input.empty() : this.stackType;
    }

    public SubnetworkState(
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<String> externalIpv6Prefix,
        @Nullable Input<String> fingerprint,
        @Nullable Input<String> gatewayAddress,
        @Nullable Input<String> ipCidrRange,
        @Nullable Input<String> ipv6AccessType,
        @Nullable Input<String> ipv6CidrRange,
        @Nullable Input<SubnetworkLogConfigGetArgs> logConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<Boolean> privateIpGoogleAccess,
        @Nullable Input<String> privateIpv6GoogleAccess,
        @Nullable Input<String> project,
        @Nullable Input<String> purpose,
        @Nullable Input<String> region,
        @Nullable Input<String> role,
        @Nullable Input<List<SubnetworkSecondaryIpRangeGetArgs>> secondaryIpRanges,
        @Nullable Input<String> selfLink,
        @Nullable Input<String> stackType) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.externalIpv6Prefix = externalIpv6Prefix;
        this.fingerprint = fingerprint;
        this.gatewayAddress = gatewayAddress;
        this.ipCidrRange = ipCidrRange;
        this.ipv6AccessType = ipv6AccessType;
        this.ipv6CidrRange = ipv6CidrRange;
        this.logConfig = logConfig;
        this.name = name;
        this.network = network;
        this.privateIpGoogleAccess = privateIpGoogleAccess;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.project = project;
        this.purpose = purpose;
        this.region = region;
        this.role = role;
        this.secondaryIpRanges = secondaryIpRanges;
        this.selfLink = selfLink;
        this.stackType = stackType;
    }

    private SubnetworkState() {
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.externalIpv6Prefix = Input.empty();
        this.fingerprint = Input.empty();
        this.gatewayAddress = Input.empty();
        this.ipCidrRange = Input.empty();
        this.ipv6AccessType = Input.empty();
        this.ipv6CidrRange = Input.empty();
        this.logConfig = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.privateIpGoogleAccess = Input.empty();
        this.privateIpv6GoogleAccess = Input.empty();
        this.project = Input.empty();
        this.purpose = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
        this.secondaryIpRanges = Input.empty();
        this.selfLink = Input.empty();
        this.stackType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<String> externalIpv6Prefix;
        private @Nullable Input<String> fingerprint;
        private @Nullable Input<String> gatewayAddress;
        private @Nullable Input<String> ipCidrRange;
        private @Nullable Input<String> ipv6AccessType;
        private @Nullable Input<String> ipv6CidrRange;
        private @Nullable Input<SubnetworkLogConfigGetArgs> logConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<Boolean> privateIpGoogleAccess;
        private @Nullable Input<String> privateIpv6GoogleAccess;
        private @Nullable Input<String> project;
        private @Nullable Input<String> purpose;
        private @Nullable Input<String> region;
        private @Nullable Input<String> role;
        private @Nullable Input<List<SubnetworkSecondaryIpRangeGetArgs>> secondaryIpRanges;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<String> stackType;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.externalIpv6Prefix = defaults.externalIpv6Prefix;
    	      this.fingerprint = defaults.fingerprint;
    	      this.gatewayAddress = defaults.gatewayAddress;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.ipv6CidrRange = defaults.ipv6CidrRange;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.privateIpGoogleAccess = defaults.privateIpGoogleAccess;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
    	      this.secondaryIpRanges = defaults.secondaryIpRanges;
    	      this.selfLink = defaults.selfLink;
    	      this.stackType = defaults.stackType;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExternalIpv6Prefix(@Nullable Input<String> externalIpv6Prefix) {
            this.externalIpv6Prefix = externalIpv6Prefix;
            return this;
        }

        public Builder setExternalIpv6Prefix(@Nullable String externalIpv6Prefix) {
            this.externalIpv6Prefix = Input.ofNullable(externalIpv6Prefix);
            return this;
        }

        public Builder setFingerprint(@Nullable Input<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder setFingerprint(@Nullable String fingerprint) {
            this.fingerprint = Input.ofNullable(fingerprint);
            return this;
        }

        public Builder setGatewayAddress(@Nullable Input<String> gatewayAddress) {
            this.gatewayAddress = gatewayAddress;
            return this;
        }

        public Builder setGatewayAddress(@Nullable String gatewayAddress) {
            this.gatewayAddress = Input.ofNullable(gatewayAddress);
            return this;
        }

        public Builder setIpCidrRange(@Nullable Input<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder setIpCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Input.ofNullable(ipCidrRange);
            return this;
        }

        public Builder setIpv6AccessType(@Nullable Input<String> ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }

        public Builder setIpv6AccessType(@Nullable String ipv6AccessType) {
            this.ipv6AccessType = Input.ofNullable(ipv6AccessType);
            return this;
        }

        public Builder setIpv6CidrRange(@Nullable Input<String> ipv6CidrRange) {
            this.ipv6CidrRange = ipv6CidrRange;
            return this;
        }

        public Builder setIpv6CidrRange(@Nullable String ipv6CidrRange) {
            this.ipv6CidrRange = Input.ofNullable(ipv6CidrRange);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<SubnetworkLogConfigGetArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable SubnetworkLogConfigGetArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setPrivateIpGoogleAccess(@Nullable Input<Boolean> privateIpGoogleAccess) {
            this.privateIpGoogleAccess = privateIpGoogleAccess;
            return this;
        }

        public Builder setPrivateIpGoogleAccess(@Nullable Boolean privateIpGoogleAccess) {
            this.privateIpGoogleAccess = Input.ofNullable(privateIpGoogleAccess);
            return this;
        }

        public Builder setPrivateIpv6GoogleAccess(@Nullable Input<String> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder setPrivateIpv6GoogleAccess(@Nullable String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Input.ofNullable(privateIpv6GoogleAccess);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setPurpose(@Nullable Input<String> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder setPurpose(@Nullable String purpose) {
            this.purpose = Input.ofNullable(purpose);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setSecondaryIpRanges(@Nullable Input<List<SubnetworkSecondaryIpRangeGetArgs>> secondaryIpRanges) {
            this.secondaryIpRanges = secondaryIpRanges;
            return this;
        }

        public Builder setSecondaryIpRanges(@Nullable List<SubnetworkSecondaryIpRangeGetArgs> secondaryIpRanges) {
            this.secondaryIpRanges = Input.ofNullable(secondaryIpRanges);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setStackType(@Nullable Input<String> stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder setStackType(@Nullable String stackType) {
            this.stackType = Input.ofNullable(stackType);
            return this;
        }
        public SubnetworkState build() {
            return new SubnetworkState(creationTimestamp, description, externalIpv6Prefix, fingerprint, gatewayAddress, ipCidrRange, ipv6AccessType, ipv6CidrRange, logConfig, name, network, privateIpGoogleAccess, privateIpv6GoogleAccess, project, purpose, region, role, secondaryIpRanges, selfLink, stackType);
        }
    }
}

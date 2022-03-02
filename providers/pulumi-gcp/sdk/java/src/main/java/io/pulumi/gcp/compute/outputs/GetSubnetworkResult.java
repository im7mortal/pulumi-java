// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetSubnetworkSecondaryIpRange;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSubnetworkResult {
    /**
     * Description of this subnetwork.
     * 
     */
    private final String description;
    /**
     * The IP address of the gateway.
     * 
     */
    private final String gatewayAddress;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The range of IP addresses belonging to this subnetwork
     * secondary range.
     * 
     */
    private final String ipCidrRange;
    private final @Nullable String name;
    /**
     * The network name or resource link to the parent
     * network of this subnetwork.
     * 
     */
    private final String network;
    /**
     * Whether the VMs in this subnet
     * can access Google services without assigned external IP
     * addresses.
     * 
     */
    private final Boolean privateIpGoogleAccess;
    private final String project;
    private final String region;
    /**
     * An array of configurations for secondary IP ranges for
     * VM instances contained in this subnetwork. Structure is documented below.
     * 
     */
    private final List<GetSubnetworkSecondaryIpRange> secondaryIpRanges;
    private final String selfLink;

    @OutputCustomType.Constructor({"description","gatewayAddress","id","ipCidrRange","name","network","privateIpGoogleAccess","project","region","secondaryIpRanges","selfLink"})
    private GetSubnetworkResult(
        String description,
        String gatewayAddress,
        String id,
        String ipCidrRange,
        @Nullable String name,
        String network,
        Boolean privateIpGoogleAccess,
        String project,
        String region,
        List<GetSubnetworkSecondaryIpRange> secondaryIpRanges,
        String selfLink) {
        this.description = Objects.requireNonNull(description);
        this.gatewayAddress = Objects.requireNonNull(gatewayAddress);
        this.id = Objects.requireNonNull(id);
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
        this.name = name;
        this.network = Objects.requireNonNull(network);
        this.privateIpGoogleAccess = Objects.requireNonNull(privateIpGoogleAccess);
        this.project = Objects.requireNonNull(project);
        this.region = Objects.requireNonNull(region);
        this.secondaryIpRanges = Objects.requireNonNull(secondaryIpRanges);
        this.selfLink = Objects.requireNonNull(selfLink);
    }

    /**
     * Description of this subnetwork.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The IP address of the gateway.
     * 
    */
    public String getGatewayAddress() {
        return this.gatewayAddress;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The range of IP addresses belonging to this subnetwork
     * secondary range.
     * 
    */
    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The network name or resource link to the parent
     * network of this subnetwork.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Whether the VMs in this subnet
     * can access Google services without assigned external IP
     * addresses.
     * 
    */
    public Boolean getPrivateIpGoogleAccess() {
        return this.privateIpGoogleAccess;
    }
    public String getProject() {
        return this.project;
    }
    public String getRegion() {
        return this.region;
    }
    /**
     * An array of configurations for secondary IP ranges for
     * VM instances contained in this subnetwork. Structure is documented below.
     * 
    */
    public List<GetSubnetworkSecondaryIpRange> getSecondaryIpRanges() {
        return this.secondaryIpRanges;
    }
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String gatewayAddress;
        private String id;
        private String ipCidrRange;
        private @Nullable String name;
        private String network;
        private Boolean privateIpGoogleAccess;
        private String project;
        private String region;
        private List<GetSubnetworkSecondaryIpRange> secondaryIpRanges;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.gatewayAddress = defaults.gatewayAddress;
    	      this.id = defaults.id;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.privateIpGoogleAccess = defaults.privateIpGoogleAccess;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.secondaryIpRanges = defaults.secondaryIpRanges;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setGatewayAddress(String gatewayAddress) {
            this.gatewayAddress = Objects.requireNonNull(gatewayAddress);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setPrivateIpGoogleAccess(Boolean privateIpGoogleAccess) {
            this.privateIpGoogleAccess = Objects.requireNonNull(privateIpGoogleAccess);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSecondaryIpRanges(List<GetSubnetworkSecondaryIpRange> secondaryIpRanges) {
            this.secondaryIpRanges = Objects.requireNonNull(secondaryIpRanges);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public GetSubnetworkResult build() {
            return new GetSubnetworkResult(description, gatewayAddress, id, ipCidrRange, name, network, privateIpGoogleAccess, project, region, secondaryIpRanges, selfLink);
        }
    }
}

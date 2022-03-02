// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionCidrBlockSet;
import io.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionFilter;
import io.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionPeerCidrBlockSet;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVpcPeeringConnectionResult {
    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * 
     */
    private final Map<String,Boolean> accepter;
    /**
     * A CIDR block associated to the VPC of the specific VPC Peering Connection.
     * 
     */
    private final String cidrBlock;
    /**
     * List of objects with CIDR blocks of the requester VPC.
     * 
     */
    private final List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets;
    private final @Nullable List<GetVpcPeeringConnectionFilter> filters;
    private final String id;
    private final String ownerId;
    private final String peerCidrBlock;
    /**
     * List of objects with CIDR blocks of the accepter VPC.
     * 
     */
    private final List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets;
    private final String peerOwnerId;
    private final String peerRegion;
    private final String peerVpcId;
    private final String region;
    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * 
     */
    private final Map<String,Boolean> requester;
    private final String status;
    private final Map<String,String> tags;
    private final String vpcId;

    @OutputCustomType.Constructor({"accepter","cidrBlock","cidrBlockSets","filters","id","ownerId","peerCidrBlock","peerCidrBlockSets","peerOwnerId","peerRegion","peerVpcId","region","requester","status","tags","vpcId"})
    private GetVpcPeeringConnectionResult(
        Map<String,Boolean> accepter,
        String cidrBlock,
        List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets,
        @Nullable List<GetVpcPeeringConnectionFilter> filters,
        String id,
        String ownerId,
        String peerCidrBlock,
        List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets,
        String peerOwnerId,
        String peerRegion,
        String peerVpcId,
        String region,
        Map<String,Boolean> requester,
        String status,
        Map<String,String> tags,
        String vpcId) {
        this.accepter = Objects.requireNonNull(accepter);
        this.cidrBlock = Objects.requireNonNull(cidrBlock);
        this.cidrBlockSets = Objects.requireNonNull(cidrBlockSets);
        this.filters = filters;
        this.id = Objects.requireNonNull(id);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.peerCidrBlock = Objects.requireNonNull(peerCidrBlock);
        this.peerCidrBlockSets = Objects.requireNonNull(peerCidrBlockSets);
        this.peerOwnerId = Objects.requireNonNull(peerOwnerId);
        this.peerRegion = Objects.requireNonNull(peerRegion);
        this.peerVpcId = Objects.requireNonNull(peerVpcId);
        this.region = Objects.requireNonNull(region);
        this.requester = Objects.requireNonNull(requester);
        this.status = Objects.requireNonNull(status);
        this.tags = Objects.requireNonNull(tags);
        this.vpcId = Objects.requireNonNull(vpcId);
    }

    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * 
    */
    public Map<String,Boolean> getAccepter() {
        return this.accepter;
    }
    /**
     * A CIDR block associated to the VPC of the specific VPC Peering Connection.
     * 
    */
    public String getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * List of objects with CIDR blocks of the requester VPC.
     * 
    */
    public List<GetVpcPeeringConnectionCidrBlockSet> getCidrBlockSets() {
        return this.cidrBlockSets;
    }
    public List<GetVpcPeeringConnectionFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String getId() {
        return this.id;
    }
    public String getOwnerId() {
        return this.ownerId;
    }
    public String getPeerCidrBlock() {
        return this.peerCidrBlock;
    }
    /**
     * List of objects with CIDR blocks of the accepter VPC.
     * 
    */
    public List<GetVpcPeeringConnectionPeerCidrBlockSet> getPeerCidrBlockSets() {
        return this.peerCidrBlockSets;
    }
    public String getPeerOwnerId() {
        return this.peerOwnerId;
    }
    public String getPeerRegion() {
        return this.peerRegion;
    }
    public String getPeerVpcId() {
        return this.peerVpcId;
    }
    public String getRegion() {
        return this.region;
    }
    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * 
    */
    public Map<String,Boolean> getRequester() {
        return this.requester;
    }
    public String getStatus() {
        return this.status;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcPeeringConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Boolean> accepter;
        private String cidrBlock;
        private List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets;
        private @Nullable List<GetVpcPeeringConnectionFilter> filters;
        private String id;
        private String ownerId;
        private String peerCidrBlock;
        private List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets;
        private String peerOwnerId;
        private String peerRegion;
        private String peerVpcId;
        private String region;
        private Map<String,Boolean> requester;
        private String status;
        private Map<String,String> tags;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcPeeringConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accepter = defaults.accepter;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.cidrBlockSets = defaults.cidrBlockSets;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ownerId = defaults.ownerId;
    	      this.peerCidrBlock = defaults.peerCidrBlock;
    	      this.peerCidrBlockSets = defaults.peerCidrBlockSets;
    	      this.peerOwnerId = defaults.peerOwnerId;
    	      this.peerRegion = defaults.peerRegion;
    	      this.peerVpcId = defaults.peerVpcId;
    	      this.region = defaults.region;
    	      this.requester = defaults.requester;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAccepter(Map<String,Boolean> accepter) {
            this.accepter = Objects.requireNonNull(accepter);
            return this;
        }

        public Builder setCidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder setCidrBlockSets(List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets) {
            this.cidrBlockSets = Objects.requireNonNull(cidrBlockSets);
            return this;
        }

        public Builder setFilters(@Nullable List<GetVpcPeeringConnectionFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder setPeerCidrBlock(String peerCidrBlock) {
            this.peerCidrBlock = Objects.requireNonNull(peerCidrBlock);
            return this;
        }

        public Builder setPeerCidrBlockSets(List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets) {
            this.peerCidrBlockSets = Objects.requireNonNull(peerCidrBlockSets);
            return this;
        }

        public Builder setPeerOwnerId(String peerOwnerId) {
            this.peerOwnerId = Objects.requireNonNull(peerOwnerId);
            return this;
        }

        public Builder setPeerRegion(String peerRegion) {
            this.peerRegion = Objects.requireNonNull(peerRegion);
            return this;
        }

        public Builder setPeerVpcId(String peerVpcId) {
            this.peerVpcId = Objects.requireNonNull(peerVpcId);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRequester(Map<String,Boolean> requester) {
            this.requester = Objects.requireNonNull(requester);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetVpcPeeringConnectionResult build() {
            return new GetVpcPeeringConnectionResult(accepter, cidrBlock, cidrBlockSets, filters, id, ownerId, peerCidrBlock, peerCidrBlockSets, peerOwnerId, peerRegion, peerVpcId, region, requester, status, tags, vpcId);
        }
    }
}

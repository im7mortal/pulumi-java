// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowSourceProtocol;
import io.pulumi.awsnative.mediaconnect.inputs.FlowEncryptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings for the source of the flow.
 * 
 */
public final class FlowSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSourceArgs Empty = new FlowSourceArgs();

    /**
     * The type of decryption that is used on the content ingested from this source.
     * 
     */
    @InputImport(name="decryption")
    private final @Nullable Input<FlowEncryptionArgs> decryption;

    public Input<FlowEncryptionArgs> getDecryption() {
        return this.decryption == null ? Input.empty() : this.decryption;
    }

    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
     * 
     */
    @InputImport(name="entitlementArn")
    private final @Nullable Input<String> entitlementArn;

    public Input<String> getEntitlementArn() {
        return this.entitlementArn == null ? Input.empty() : this.entitlementArn;
    }

    /**
     * The IP address that the flow will be listening on for incoming content.
     * 
     */
    @InputImport(name="ingestIp")
    private final @Nullable Input<String> ingestIp;

    public Input<String> getIngestIp() {
        return this.ingestIp == null ? Input.empty() : this.ingestIp;
    }

    /**
     * The port that the flow will be listening on for incoming content.
     * 
     */
    @InputImport(name="ingestPort")
    private final @Nullable Input<Integer> ingestPort;

    public Input<Integer> getIngestPort() {
        return this.ingestPort == null ? Input.empty() : this.ingestPort;
    }

    /**
     * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     * 
     */
    @InputImport(name="maxBitrate")
    private final @Nullable Input<Integer> maxBitrate;

    public Input<Integer> getMaxBitrate() {
        return this.maxBitrate == null ? Input.empty() : this.maxBitrate;
    }

    /**
     * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * 
     */
    @InputImport(name="maxLatency")
    private final @Nullable Input<Integer> maxLatency;

    public Input<Integer> getMaxLatency() {
        return this.maxLatency == null ? Input.empty() : this.maxLatency;
    }

    /**
     * The minimum latency in milliseconds.
     * 
     */
    @InputImport(name="minLatency")
    private final @Nullable Input<Integer> minLatency;

    public Input<Integer> getMinLatency() {
        return this.minLatency == null ? Input.empty() : this.minLatency;
    }

    /**
     * The name of the source.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The protocol that is used by the source or output.
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable Input<FlowSourceProtocol> protocol;

    public Input<FlowSourceProtocol> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * The ARN of the source.
     * 
     */
    @InputImport(name="sourceArn")
    private final @Nullable Input<String> sourceArn;

    public Input<String> getSourceArn() {
        return this.sourceArn == null ? Input.empty() : this.sourceArn;
    }

    /**
     * The port that the flow will be listening on for incoming content.(ReadOnly)
     * 
     */
    @InputImport(name="sourceIngestPort")
    private final @Nullable Input<String> sourceIngestPort;

    public Input<String> getSourceIngestPort() {
        return this.sourceIngestPort == null ? Input.empty() : this.sourceIngestPort;
    }

    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     */
    @InputImport(name="streamId")
    private final @Nullable Input<String> streamId;

    public Input<String> getStreamId() {
        return this.streamId == null ? Input.empty() : this.streamId;
    }

    /**
     * The name of the VPC Interface this Source is configured with.
     * 
     */
    @InputImport(name="vpcInterfaceName")
    private final @Nullable Input<String> vpcInterfaceName;

    public Input<String> getVpcInterfaceName() {
        return this.vpcInterfaceName == null ? Input.empty() : this.vpcInterfaceName;
    }

    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     */
    @InputImport(name="whitelistCidr")
    private final @Nullable Input<String> whitelistCidr;

    public Input<String> getWhitelistCidr() {
        return this.whitelistCidr == null ? Input.empty() : this.whitelistCidr;
    }

    public FlowSourceArgs(
        @Nullable Input<FlowEncryptionArgs> decryption,
        @Nullable Input<String> description,
        @Nullable Input<String> entitlementArn,
        @Nullable Input<String> ingestIp,
        @Nullable Input<Integer> ingestPort,
        @Nullable Input<Integer> maxBitrate,
        @Nullable Input<Integer> maxLatency,
        @Nullable Input<Integer> minLatency,
        @Nullable Input<String> name,
        @Nullable Input<FlowSourceProtocol> protocol,
        @Nullable Input<String> sourceArn,
        @Nullable Input<String> sourceIngestPort,
        @Nullable Input<String> streamId,
        @Nullable Input<String> vpcInterfaceName,
        @Nullable Input<String> whitelistCidr) {
        this.decryption = decryption;
        this.description = description;
        this.entitlementArn = entitlementArn;
        this.ingestIp = ingestIp;
        this.ingestPort = ingestPort;
        this.maxBitrate = maxBitrate;
        this.maxLatency = maxLatency;
        this.minLatency = minLatency;
        this.name = name;
        this.protocol = protocol;
        this.sourceArn = sourceArn;
        this.sourceIngestPort = sourceIngestPort;
        this.streamId = streamId;
        this.vpcInterfaceName = vpcInterfaceName;
        this.whitelistCidr = whitelistCidr;
    }

    private FlowSourceArgs() {
        this.decryption = Input.empty();
        this.description = Input.empty();
        this.entitlementArn = Input.empty();
        this.ingestIp = Input.empty();
        this.ingestPort = Input.empty();
        this.maxBitrate = Input.empty();
        this.maxLatency = Input.empty();
        this.minLatency = Input.empty();
        this.name = Input.empty();
        this.protocol = Input.empty();
        this.sourceArn = Input.empty();
        this.sourceIngestPort = Input.empty();
        this.streamId = Input.empty();
        this.vpcInterfaceName = Input.empty();
        this.whitelistCidr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowEncryptionArgs> decryption;
        private @Nullable Input<String> description;
        private @Nullable Input<String> entitlementArn;
        private @Nullable Input<String> ingestIp;
        private @Nullable Input<Integer> ingestPort;
        private @Nullable Input<Integer> maxBitrate;
        private @Nullable Input<Integer> maxLatency;
        private @Nullable Input<Integer> minLatency;
        private @Nullable Input<String> name;
        private @Nullable Input<FlowSourceProtocol> protocol;
        private @Nullable Input<String> sourceArn;
        private @Nullable Input<String> sourceIngestPort;
        private @Nullable Input<String> streamId;
        private @Nullable Input<String> vpcInterfaceName;
        private @Nullable Input<String> whitelistCidr;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decryption = defaults.decryption;
    	      this.description = defaults.description;
    	      this.entitlementArn = defaults.entitlementArn;
    	      this.ingestIp = defaults.ingestIp;
    	      this.ingestPort = defaults.ingestPort;
    	      this.maxBitrate = defaults.maxBitrate;
    	      this.maxLatency = defaults.maxLatency;
    	      this.minLatency = defaults.minLatency;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.sourceArn = defaults.sourceArn;
    	      this.sourceIngestPort = defaults.sourceIngestPort;
    	      this.streamId = defaults.streamId;
    	      this.vpcInterfaceName = defaults.vpcInterfaceName;
    	      this.whitelistCidr = defaults.whitelistCidr;
        }

        public Builder setDecryption(@Nullable Input<FlowEncryptionArgs> decryption) {
            this.decryption = decryption;
            return this;
        }

        public Builder setDecryption(@Nullable FlowEncryptionArgs decryption) {
            this.decryption = Input.ofNullable(decryption);
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

        public Builder setEntitlementArn(@Nullable Input<String> entitlementArn) {
            this.entitlementArn = entitlementArn;
            return this;
        }

        public Builder setEntitlementArn(@Nullable String entitlementArn) {
            this.entitlementArn = Input.ofNullable(entitlementArn);
            return this;
        }

        public Builder setIngestIp(@Nullable Input<String> ingestIp) {
            this.ingestIp = ingestIp;
            return this;
        }

        public Builder setIngestIp(@Nullable String ingestIp) {
            this.ingestIp = Input.ofNullable(ingestIp);
            return this;
        }

        public Builder setIngestPort(@Nullable Input<Integer> ingestPort) {
            this.ingestPort = ingestPort;
            return this;
        }

        public Builder setIngestPort(@Nullable Integer ingestPort) {
            this.ingestPort = Input.ofNullable(ingestPort);
            return this;
        }

        public Builder setMaxBitrate(@Nullable Input<Integer> maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }

        public Builder setMaxBitrate(@Nullable Integer maxBitrate) {
            this.maxBitrate = Input.ofNullable(maxBitrate);
            return this;
        }

        public Builder setMaxLatency(@Nullable Input<Integer> maxLatency) {
            this.maxLatency = maxLatency;
            return this;
        }

        public Builder setMaxLatency(@Nullable Integer maxLatency) {
            this.maxLatency = Input.ofNullable(maxLatency);
            return this;
        }

        public Builder setMinLatency(@Nullable Input<Integer> minLatency) {
            this.minLatency = minLatency;
            return this;
        }

        public Builder setMinLatency(@Nullable Integer minLatency) {
            this.minLatency = Input.ofNullable(minLatency);
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

        public Builder setProtocol(@Nullable Input<FlowSourceProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable FlowSourceProtocol protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setSourceArn(@Nullable Input<String> sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        public Builder setSourceArn(@Nullable String sourceArn) {
            this.sourceArn = Input.ofNullable(sourceArn);
            return this;
        }

        public Builder setSourceIngestPort(@Nullable Input<String> sourceIngestPort) {
            this.sourceIngestPort = sourceIngestPort;
            return this;
        }

        public Builder setSourceIngestPort(@Nullable String sourceIngestPort) {
            this.sourceIngestPort = Input.ofNullable(sourceIngestPort);
            return this;
        }

        public Builder setStreamId(@Nullable Input<String> streamId) {
            this.streamId = streamId;
            return this;
        }

        public Builder setStreamId(@Nullable String streamId) {
            this.streamId = Input.ofNullable(streamId);
            return this;
        }

        public Builder setVpcInterfaceName(@Nullable Input<String> vpcInterfaceName) {
            this.vpcInterfaceName = vpcInterfaceName;
            return this;
        }

        public Builder setVpcInterfaceName(@Nullable String vpcInterfaceName) {
            this.vpcInterfaceName = Input.ofNullable(vpcInterfaceName);
            return this;
        }

        public Builder setWhitelistCidr(@Nullable Input<String> whitelistCidr) {
            this.whitelistCidr = whitelistCidr;
            return this;
        }

        public Builder setWhitelistCidr(@Nullable String whitelistCidr) {
            this.whitelistCidr = Input.ofNullable(whitelistCidr);
            return this;
        }

        public FlowSourceArgs build() {
            return new FlowSourceArgs(decryption, description, entitlementArn, ingestIp, ingestPort, maxBitrate, maxLatency, minLatency, name, protocol, sourceArn, sourceIngestPort, streamId, vpcInterfaceName, whitelistCidr);
        }
    }
}

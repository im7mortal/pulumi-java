// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A complex type that contains information about an Amazon VPC. Route 53 Resolver uses the records in the private hosted zone to route traffic in that VPC.
 * 
 */
public final class HostedZoneVPCArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostedZoneVPCArgs Empty = new HostedZoneVPCArgs();

    /**
     * The ID of an Amazon VPC.
     * 
     */
    @InputImport(name="vPCId", required=true)
    private final Input<String> vPCId;

    public Input<String> getVPCId() {
        return this.vPCId;
    }

    /**
     * The region that an Amazon VPC was created in. See https://docs.aws.amazon.com/general/latest/gr/rande.html for a list of up to date regions.
     * 
     */
    @InputImport(name="vPCRegion", required=true)
    private final Input<String> vPCRegion;

    public Input<String> getVPCRegion() {
        return this.vPCRegion;
    }

    public HostedZoneVPCArgs(
        Input<String> vPCId,
        Input<String> vPCRegion) {
        this.vPCId = Objects.requireNonNull(vPCId, "expected parameter 'vPCId' to be non-null");
        this.vPCRegion = Objects.requireNonNull(vPCRegion, "expected parameter 'vPCRegion' to be non-null");
    }

    private HostedZoneVPCArgs() {
        this.vPCId = Input.empty();
        this.vPCRegion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneVPCArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> vPCId;
        private Input<String> vPCRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneVPCArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vPCId = defaults.vPCId;
    	      this.vPCRegion = defaults.vPCRegion;
        }

        public Builder setVPCId(Input<String> vPCId) {
            this.vPCId = Objects.requireNonNull(vPCId);
            return this;
        }

        public Builder setVPCId(String vPCId) {
            this.vPCId = Input.of(Objects.requireNonNull(vPCId));
            return this;
        }

        public Builder setVPCRegion(Input<String> vPCRegion) {
            this.vPCRegion = Objects.requireNonNull(vPCRegion);
            return this;
        }

        public Builder setVPCRegion(String vPCRegion) {
            this.vPCRegion = Input.of(Objects.requireNonNull(vPCRegion));
            return this;
        }

        public HostedZoneVPCArgs build() {
            return new HostedZoneVPCArgs(vPCId, vPCRegion);
        }
    }
}

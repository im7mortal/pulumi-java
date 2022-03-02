// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.outputs;

import io.pulumi.azurenative.hanaonazure.outputs.IpAddressResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkProfileResponse {
    /**
     * Specifies the circuit id for connecting to express route.
     * 
     */
    private final String circuitId;
    /**
     * Specifies the network interfaces for the HANA instance.
     * 
     */
    private final @Nullable List<IpAddressResponse> networkInterfaces;

    @OutputCustomType.Constructor({"circuitId","networkInterfaces"})
    private NetworkProfileResponse(
        String circuitId,
        @Nullable List<IpAddressResponse> networkInterfaces) {
        this.circuitId = Objects.requireNonNull(circuitId);
        this.networkInterfaces = networkInterfaces;
    }

    /**
     * Specifies the circuit id for connecting to express route.
     * 
    */
    public String getCircuitId() {
        return this.circuitId;
    }
    /**
     * Specifies the network interfaces for the HANA instance.
     * 
    */
    public List<IpAddressResponse> getNetworkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String circuitId;
        private @Nullable List<IpAddressResponse> networkInterfaces;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.circuitId = defaults.circuitId;
    	      this.networkInterfaces = defaults.networkInterfaces;
        }

        public Builder setCircuitId(String circuitId) {
            this.circuitId = Objects.requireNonNull(circuitId);
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable List<IpAddressResponse> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public NetworkProfileResponse build() {
            return new NetworkProfileResponse(circuitId, networkInterfaces);
        }
    }
}

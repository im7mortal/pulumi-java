// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.inputs.InstanceMonthlyTransfer;
import io.pulumi.awsnative.lightsail.inputs.InstancePort;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Networking of the Instance.
 * 
 */
public final class InstanceNetworking extends io.pulumi.resources.InvokeArgs {

    public static final InstanceNetworking Empty = new InstanceNetworking();

    @InputImport(name="monthlyTransfer")
    private final @Nullable InstanceMonthlyTransfer monthlyTransfer;

    public Optional<InstanceMonthlyTransfer> getMonthlyTransfer() {
        return this.monthlyTransfer == null ? Optional.empty() : Optional.ofNullable(this.monthlyTransfer);
    }

    /**
     * Ports to the Instance.
     * 
     */
    @InputImport(name="ports", required=true)
    private final List<InstancePort> ports;

    public List<InstancePort> getPorts() {
        return this.ports;
    }

    public InstanceNetworking(
        @Nullable InstanceMonthlyTransfer monthlyTransfer,
        List<InstancePort> ports) {
        this.monthlyTransfer = monthlyTransfer;
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
    }

    private InstanceNetworking() {
        this.monthlyTransfer = null;
        this.ports = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InstanceMonthlyTransfer monthlyTransfer;
        private List<InstancePort> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthlyTransfer = defaults.monthlyTransfer;
    	      this.ports = defaults.ports;
        }

        public Builder setMonthlyTransfer(@Nullable InstanceMonthlyTransfer monthlyTransfer) {
            this.monthlyTransfer = monthlyTransfer;
            return this;
        }

        public Builder setPorts(List<InstancePort> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public InstanceNetworking build() {
            return new InstanceNetworking(monthlyTransfer, ports);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs Empty = new ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressFrom")
    private final @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom;

    public Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> getEgressFrom() {
        return this.egressFrom == null ? Input.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressTo")
    private final @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo;

    public Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> getEgressTo() {
        return this.egressTo == null ? Input.empty() : this.egressTo;
    }

    public ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs(
        @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom,
        @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs() {
        this.egressFrom = Input.empty();
        this.egressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom;
        private @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder setEgressFrom(@Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder setEgressFrom(@Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs egressFrom) {
            this.egressFrom = Input.ofNullable(egressFrom);
            return this;
        }

        public Builder setEgressTo(@Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }

        public Builder setEgressTo(@Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs egressTo) {
            this.egressTo = Input.ofNullable(egressTo);
            return this;
        }

        public ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs build() {
            return new ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs(egressFrom, egressTo);
        }
    }
}
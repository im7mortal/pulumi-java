// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRoutingControlArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRoutingControlArgs Empty = new GetRoutingControlArgs();

    /**
     * The Amazon Resource Name (ARN) of the routing control.
     * 
     */
    @InputImport(name="routingControlArn", required=true)
    private final String routingControlArn;

    public String getRoutingControlArn() {
        return this.routingControlArn;
    }

    public GetRoutingControlArgs(String routingControlArn) {
        this.routingControlArn = Objects.requireNonNull(routingControlArn, "expected parameter 'routingControlArn' to be non-null");
    }

    private GetRoutingControlArgs() {
        this.routingControlArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoutingControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String routingControlArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoutingControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routingControlArn = defaults.routingControlArn;
        }

        public Builder setRoutingControlArn(String routingControlArn) {
            this.routingControlArn = Objects.requireNonNull(routingControlArn);
            return this;
        }

        public GetRoutingControlArgs build() {
            return new GetRoutingControlArgs(routingControlArn);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEventSubscriptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventSubscriptionArgs Empty = new GetEventSubscriptionArgs();

    @InputImport(name="eventSubscriptionName", required=true)
    private final String eventSubscriptionName;

    public String getEventSubscriptionName() {
        return this.eventSubscriptionName;
    }

    @InputImport(name="scope", required=true)
    private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetEventSubscriptionArgs(
        String eventSubscriptionName,
        String scope) {
        this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName, "expected parameter 'eventSubscriptionName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetEventSubscriptionArgs() {
        this.eventSubscriptionName = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventSubscriptionName;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSubscriptionName = defaults.eventSubscriptionName;
    	      this.scope = defaults.scope;
        }

        public Builder setEventSubscriptionName(String eventSubscriptionName) {
            this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public GetEventSubscriptionArgs build() {
            return new GetEventSubscriptionArgs(eventSubscriptionName, scope);
        }
    }
}
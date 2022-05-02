// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v2.inputs.RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configures a RRSetRoutingPolicy that routes in a weighted round robin fashion.
 * 
 */
public final class RRSetRoutingPolicyWrrPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RRSetRoutingPolicyWrrPolicyArgs Empty = new RRSetRoutingPolicyWrrPolicyArgs();

    @Import(name="items")
    private @Nullable Output<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items;

    public Optional<Output<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private RRSetRoutingPolicyWrrPolicyArgs() {}

    private RRSetRoutingPolicyWrrPolicyArgs(RRSetRoutingPolicyWrrPolicyArgs $) {
        this.items = $.items;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RRSetRoutingPolicyWrrPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RRSetRoutingPolicyWrrPolicyArgs $;

        public Builder() {
            $ = new RRSetRoutingPolicyWrrPolicyArgs();
        }

        public Builder(RRSetRoutingPolicyWrrPolicyArgs defaults) {
            $ = new RRSetRoutingPolicyWrrPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder items(@Nullable Output<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs... items) {
            return items(List.of(items));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public RRSetRoutingPolicyWrrPolicyArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StaticRouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticRouteArgs Empty = new StaticRouteArgs();

    @InputImport(name="addressPrefixes")
    private final @Nullable Input<List<String>> addressPrefixes;

    public Input<List<String>> getAddressPrefixes() {
        return this.addressPrefixes == null ? Input.empty() : this.addressPrefixes;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="nextHopIpAddress")
    private final @Nullable Input<String> nextHopIpAddress;

    public Input<String> getNextHopIpAddress() {
        return this.nextHopIpAddress == null ? Input.empty() : this.nextHopIpAddress;
    }

    public StaticRouteArgs(
        @Nullable Input<List<String>> addressPrefixes,
        @Nullable Input<String> name,
        @Nullable Input<String> nextHopIpAddress) {
        this.addressPrefixes = addressPrefixes;
        this.name = name;
        this.nextHopIpAddress = nextHopIpAddress;
    }

    private StaticRouteArgs() {
        this.addressPrefixes = Input.empty();
        this.name = Input.empty();
        this.nextHopIpAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> addressPrefixes;
        private @Nullable Input<String> name;
        private @Nullable Input<String> nextHopIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
    	      this.name = defaults.name;
    	      this.nextHopIpAddress = defaults.nextHopIpAddress;
        }

        public Builder setAddressPrefixes(@Nullable Input<List<String>> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }

        public Builder setAddressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = Input.ofNullable(addressPrefixes);
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

        public Builder setNextHopIpAddress(@Nullable Input<String> nextHopIpAddress) {
            this.nextHopIpAddress = nextHopIpAddress;
            return this;
        }

        public Builder setNextHopIpAddress(@Nullable String nextHopIpAddress) {
            this.nextHopIpAddress = Input.ofNullable(nextHopIpAddress);
            return this;
        }

        public StaticRouteArgs build() {
            return new StaticRouteArgs(addressPrefixes, name, nextHopIpAddress);
        }
    }
}
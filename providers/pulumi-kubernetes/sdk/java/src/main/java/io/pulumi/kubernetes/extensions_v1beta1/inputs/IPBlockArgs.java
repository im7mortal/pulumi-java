// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IPBlockArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPBlockArgs Empty = new IPBlockArgs();

    @InputImport(name="cidr", required=true)
    private final Input<String> cidr;

    public Input<String> getCidr() {
        return this.cidr;
    }

    @InputImport(name="except")
    private final @Nullable Input<List<String>> except;

    public Input<List<String>> getExcept() {
        return this.except == null ? Input.empty() : this.except;
    }

    public IPBlockArgs(
        Input<String> cidr,
        @Nullable Input<List<String>> except) {
        this.cidr = Objects.requireNonNull(cidr, "expected parameter 'cidr' to be non-null");
        this.except = except;
    }

    private IPBlockArgs() {
        this.cidr = Input.empty();
        this.except = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cidr;
        private @Nullable Input<List<String>> except;

        public Builder() {
    	      // Empty
        }

        public Builder(IPBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.except = defaults.except;
        }

        public Builder setCidr(Input<String> cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }

        public Builder setCidr(String cidr) {
            this.cidr = Input.of(Objects.requireNonNull(cidr));
            return this;
        }

        public Builder setExcept(@Nullable Input<List<String>> except) {
            this.except = except;
            return this;
        }

        public Builder setExcept(@Nullable List<String> except) {
            this.except = Input.ofNullable(except);
            return this;
        }

        public IPBlockArgs build() {
            return new IPBlockArgs(cidr, except);
        }
    }
}
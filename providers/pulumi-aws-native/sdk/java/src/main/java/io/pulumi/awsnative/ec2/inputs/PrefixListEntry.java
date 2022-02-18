// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrefixListEntry extends io.pulumi.resources.InvokeArgs {

    public static final PrefixListEntry Empty = new PrefixListEntry();

    @InputImport(name="cidr", required=true)
    private final String cidr;

    public String getCidr() {
        return this.cidr;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    public PrefixListEntry(
        String cidr,
        @Nullable String description) {
        this.cidr = Objects.requireNonNull(cidr, "expected parameter 'cidr' to be non-null");
        this.description = description;
    }

    private PrefixListEntry() {
        this.cidr = null;
        this.description = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrefixListEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidr;
        private @Nullable String description;

        public Builder() {
    	      // Empty
        }

        public Builder(PrefixListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
        }

        public Builder setCidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public PrefixListEntry build() {
            return new PrefixListEntry(cidr, description);
        }
    }
}
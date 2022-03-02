// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.enums.IPSetIPAddressVersion;
import io.pulumi.awsnative.wafv2.outputs.IPSetTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIPSetResult {
    /**
     * List of IPAddresses.
     * 
     */
    private final @Nullable List<String> addresses;
    private final @Nullable String arn;
    private final @Nullable String description;
    private final @Nullable IPSetIPAddressVersion iPAddressVersion;
    private final @Nullable String id;
    private final @Nullable List<IPSetTag> tags;

    @OutputCustomType.Constructor({"addresses","arn","description","iPAddressVersion","id","tags"})
    private GetIPSetResult(
        @Nullable List<String> addresses,
        @Nullable String arn,
        @Nullable String description,
        @Nullable IPSetIPAddressVersion iPAddressVersion,
        @Nullable String id,
        @Nullable List<IPSetTag> tags) {
        this.addresses = addresses;
        this.arn = arn;
        this.description = description;
        this.iPAddressVersion = iPAddressVersion;
        this.id = id;
        this.tags = tags;
    }

    /**
     * List of IPAddresses.
     * 
    */
    public List<String> getAddresses() {
        return this.addresses == null ? List.of() : this.addresses;
    }
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<IPSetIPAddressVersion> getIPAddressVersion() {
        return Optional.ofNullable(this.iPAddressVersion);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<IPSetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIPSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addresses;
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable IPSetIPAddressVersion iPAddressVersion;
        private @Nullable String id;
        private @Nullable List<IPSetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIPSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.iPAddressVersion = defaults.iPAddressVersion;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder setAddresses(@Nullable List<String> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIPAddressVersion(@Nullable IPSetIPAddressVersion iPAddressVersion) {
            this.iPAddressVersion = iPAddressVersion;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setTags(@Nullable List<IPSetTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetIPSetResult build() {
            return new GetIPSetResult(addresses, arn, description, iPAddressVersion, id, tags);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DnsConfigurationResponse {
    private final List<String> nameServers;
    private final @Nullable String options;
    private final @Nullable String searchDomains;

    @OutputCustomType.Constructor({"nameServers","options","searchDomains"})
    private DnsConfigurationResponse(
        List<String> nameServers,
        @Nullable String options,
        @Nullable String searchDomains) {
        this.nameServers = Objects.requireNonNull(nameServers);
        this.options = options;
        this.searchDomains = searchDomains;
    }

    public List<String> getNameServers() {
        return this.nameServers;
    }
    public Optional<String> getOptions() {
        return Optional.ofNullable(this.options);
    }
    public Optional<String> getSearchDomains() {
        return Optional.ofNullable(this.searchDomains);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> nameServers;
        private @Nullable String options;
        private @Nullable String searchDomains;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameServers = defaults.nameServers;
    	      this.options = defaults.options;
    	      this.searchDomains = defaults.searchDomains;
        }

        public Builder setNameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }

        public Builder setOptions(@Nullable String options) {
            this.options = options;
            return this;
        }

        public Builder setSearchDomains(@Nullable String searchDomains) {
            this.searchDomains = searchDomains;
            return this;
        }

        public DnsConfigurationResponse build() {
            return new DnsConfigurationResponse(nameServers, options, searchDomains);
        }
    }
}
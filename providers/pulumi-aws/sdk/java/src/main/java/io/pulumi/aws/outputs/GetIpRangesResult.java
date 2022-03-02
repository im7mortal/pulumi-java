// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIpRangesResult {
    /**
     * The lexically ordered list of CIDR blocks.
     * 
     */
    private final List<String> cidrBlocks;
    /**
     * The publication time of the IP ranges (e.g., `2016-08-03-23-46-05`).
     * 
     */
    private final String createDate;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The lexically ordered list of IPv6 CIDR blocks.
     * 
     */
    private final List<String> ipv6CidrBlocks;
    private final @Nullable List<String> regions;
    private final List<String> services;
    /**
     * The publication time of the IP ranges, in Unix epoch time format
     * (e.g., `1470267965`).
     * 
     */
    private final Integer syncToken;
    private final @Nullable String url;

    @OutputCustomType.Constructor({"cidrBlocks","createDate","id","ipv6CidrBlocks","regions","services","syncToken","url"})
    private GetIpRangesResult(
        List<String> cidrBlocks,
        String createDate,
        String id,
        List<String> ipv6CidrBlocks,
        @Nullable List<String> regions,
        List<String> services,
        Integer syncToken,
        @Nullable String url) {
        this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
        this.createDate = Objects.requireNonNull(createDate);
        this.id = Objects.requireNonNull(id);
        this.ipv6CidrBlocks = Objects.requireNonNull(ipv6CidrBlocks);
        this.regions = regions;
        this.services = Objects.requireNonNull(services);
        this.syncToken = Objects.requireNonNull(syncToken);
        this.url = url;
    }

    /**
     * The lexically ordered list of CIDR blocks.
     * 
    */
    public List<String> getCidrBlocks() {
        return this.cidrBlocks;
    }
    /**
     * The publication time of the IP ranges (e.g., `2016-08-03-23-46-05`).
     * 
    */
    public String getCreateDate() {
        return this.createDate;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The lexically ordered list of IPv6 CIDR blocks.
     * 
    */
    public List<String> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks;
    }
    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
    }
    public List<String> getServices() {
        return this.services;
    }
    /**
     * The publication time of the IP ranges, in Unix epoch time format
     * (e.g., `1470267965`).
     * 
    */
    public Integer getSyncToken() {
        return this.syncToken;
    }
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpRangesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> cidrBlocks;
        private String createDate;
        private String id;
        private List<String> ipv6CidrBlocks;
        private @Nullable List<String> regions;
        private List<String> services;
        private Integer syncToken;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpRangesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.createDate = defaults.createDate;
    	      this.id = defaults.id;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.regions = defaults.regions;
    	      this.services = defaults.services;
    	      this.syncToken = defaults.syncToken;
    	      this.url = defaults.url;
        }

        public Builder setCidrBlocks(List<String> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }

        public Builder setCreateDate(String createDate) {
            this.createDate = Objects.requireNonNull(createDate);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIpv6CidrBlocks(List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = Objects.requireNonNull(ipv6CidrBlocks);
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setServices(List<String> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }

        public Builder setSyncToken(Integer syncToken) {
            this.syncToken = Objects.requireNonNull(syncToken);
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public GetIpRangesResult build() {
            return new GetIpRangesResult(cidrBlocks, createDate, id, ipv6CidrBlocks, regions, services, syncToken, url);
        }
    }
}

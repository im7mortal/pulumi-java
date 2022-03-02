// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterCacheNode {
    private final @Nullable String address;
    /**
     * Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferred_availability_zones` instead. Default: System chosen Availability Zone. Changing this value will re-create the resource.
     * 
     */
    private final @Nullable String availabilityZone;
    private final @Nullable String id;
    /**
     * The port number on which each of the cache nodes will accept connections. For Memcached the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replication_group_id`. Changing this value will re-create the resource.
     * 
     */
    private final @Nullable Integer port;

    @OutputCustomType.Constructor({"address","availabilityZone","id","port"})
    private ClusterCacheNode(
        @Nullable String address,
        @Nullable String availabilityZone,
        @Nullable String id,
        @Nullable Integer port) {
        this.address = address;
        this.availabilityZone = availabilityZone;
        this.id = id;
        this.port = port;
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    /**
     * Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferred_availability_zones` instead. Default: System chosen Availability Zone. Changing this value will re-create the resource.
     * 
    */
    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The port number on which each of the cache nodes will accept connections. For Memcached the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replication_group_id`. Changing this value will re-create the resource.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCacheNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String availabilityZone;
        private @Nullable String id;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCacheNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.id = defaults.id;
    	      this.port = defaults.port;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public ClusterCacheNode build() {
            return new ClusterCacheNode(address, availabilityZone, id, port);
        }
    }
}

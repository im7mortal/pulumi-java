// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class NodeConfigResponse {
    /**
     * Number of cpus per Memcached node.
     * 
     */
    private final Integer cpuCount;
    /**
     * Memory size in MiB for each Memcached node.
     * 
     */
    private final Integer memorySizeMb;

    @OutputCustomType.Constructor({"cpuCount","memorySizeMb"})
    private NodeConfigResponse(
        Integer cpuCount,
        Integer memorySizeMb) {
        this.cpuCount = Objects.requireNonNull(cpuCount);
        this.memorySizeMb = Objects.requireNonNull(memorySizeMb);
    }

    /**
     * Number of cpus per Memcached node.
     * 
    */
    public Integer getCpuCount() {
        return this.cpuCount;
    }
    /**
     * Memory size in MiB for each Memcached node.
     * 
    */
    public Integer getMemorySizeMb() {
        return this.memorySizeMb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuCount;
        private Integer memorySizeMb;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCount = defaults.cpuCount;
    	      this.memorySizeMb = defaults.memorySizeMb;
        }

        public Builder setCpuCount(Integer cpuCount) {
            this.cpuCount = Objects.requireNonNull(cpuCount);
            return this;
        }

        public Builder setMemorySizeMb(Integer memorySizeMb) {
            this.memorySizeMb = Objects.requireNonNull(memorySizeMb);
            return this;
        }
        public NodeConfigResponse build() {
            return new NodeConfigResponse(cpuCount, memorySizeMb);
        }
    }
}

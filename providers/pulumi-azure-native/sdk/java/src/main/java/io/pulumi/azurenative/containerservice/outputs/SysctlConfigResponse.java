// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SysctlConfigResponse {
    /**
     * Sysctl setting fs.aio-max-nr.
     * 
     */
    private final @Nullable Integer fsAioMaxNr;
    /**
     * Sysctl setting fs.file-max.
     * 
     */
    private final @Nullable Integer fsFileMax;
    /**
     * Sysctl setting fs.inotify.max_user_watches.
     * 
     */
    private final @Nullable Integer fsInotifyMaxUserWatches;
    /**
     * Sysctl setting fs.nr_open.
     * 
     */
    private final @Nullable Integer fsNrOpen;
    /**
     * Sysctl setting kernel.threads-max.
     * 
     */
    private final @Nullable Integer kernelThreadsMax;
    /**
     * Sysctl setting net.core.netdev_max_backlog.
     * 
     */
    private final @Nullable Integer netCoreNetdevMaxBacklog;
    /**
     * Sysctl setting net.core.optmem_max.
     * 
     */
    private final @Nullable Integer netCoreOptmemMax;
    /**
     * Sysctl setting net.core.rmem_default.
     * 
     */
    private final @Nullable Integer netCoreRmemDefault;
    /**
     * Sysctl setting net.core.rmem_max.
     * 
     */
    private final @Nullable Integer netCoreRmemMax;
    /**
     * Sysctl setting net.core.somaxconn.
     * 
     */
    private final @Nullable Integer netCoreSomaxconn;
    /**
     * Sysctl setting net.core.wmem_default.
     * 
     */
    private final @Nullable Integer netCoreWmemDefault;
    /**
     * Sysctl setting net.core.wmem_max.
     * 
     */
    private final @Nullable Integer netCoreWmemMax;
    /**
     * Sysctl setting net.ipv4.ip_local_port_range.
     * 
     */
    private final @Nullable String netIpv4IpLocalPortRange;
    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh1.
     * 
     */
    private final @Nullable Integer netIpv4NeighDefaultGcThresh1;
    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh2.
     * 
     */
    private final @Nullable Integer netIpv4NeighDefaultGcThresh2;
    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh3.
     * 
     */
    private final @Nullable Integer netIpv4NeighDefaultGcThresh3;
    /**
     * Sysctl setting net.ipv4.tcp_fin_timeout.
     * 
     */
    private final @Nullable Integer netIpv4TcpFinTimeout;
    /**
     * Sysctl setting net.ipv4.tcp_keepalive_probes.
     * 
     */
    private final @Nullable Integer netIpv4TcpKeepaliveProbes;
    /**
     * Sysctl setting net.ipv4.tcp_keepalive_time.
     * 
     */
    private final @Nullable Integer netIpv4TcpKeepaliveTime;
    /**
     * Sysctl setting net.ipv4.tcp_max_syn_backlog.
     * 
     */
    private final @Nullable Integer netIpv4TcpMaxSynBacklog;
    /**
     * Sysctl setting net.ipv4.tcp_max_tw_buckets.
     * 
     */
    private final @Nullable Integer netIpv4TcpMaxTwBuckets;
    /**
     * Sysctl setting net.ipv4.tcp_tw_reuse.
     * 
     */
    private final @Nullable Boolean netIpv4TcpTwReuse;
    /**
     * Sysctl setting net.ipv4.tcp_keepalive_intvl.
     * 
     */
    private final @Nullable Integer netIpv4TcpkeepaliveIntvl;
    /**
     * Sysctl setting net.netfilter.nf_conntrack_buckets.
     * 
     */
    private final @Nullable Integer netNetfilterNfConntrackBuckets;
    /**
     * Sysctl setting net.netfilter.nf_conntrack_max.
     * 
     */
    private final @Nullable Integer netNetfilterNfConntrackMax;
    /**
     * Sysctl setting vm.max_map_count.
     * 
     */
    private final @Nullable Integer vmMaxMapCount;
    /**
     * Sysctl setting vm.swappiness.
     * 
     */
    private final @Nullable Integer vmSwappiness;
    /**
     * Sysctl setting vm.vfs_cache_pressure.
     * 
     */
    private final @Nullable Integer vmVfsCachePressure;

    @OutputCustomType.Constructor({"fsAioMaxNr","fsFileMax","fsInotifyMaxUserWatches","fsNrOpen","kernelThreadsMax","netCoreNetdevMaxBacklog","netCoreOptmemMax","netCoreRmemDefault","netCoreRmemMax","netCoreSomaxconn","netCoreWmemDefault","netCoreWmemMax","netIpv4IpLocalPortRange","netIpv4NeighDefaultGcThresh1","netIpv4NeighDefaultGcThresh2","netIpv4NeighDefaultGcThresh3","netIpv4TcpFinTimeout","netIpv4TcpKeepaliveProbes","netIpv4TcpKeepaliveTime","netIpv4TcpMaxSynBacklog","netIpv4TcpMaxTwBuckets","netIpv4TcpTwReuse","netIpv4TcpkeepaliveIntvl","netNetfilterNfConntrackBuckets","netNetfilterNfConntrackMax","vmMaxMapCount","vmSwappiness","vmVfsCachePressure"})
    private SysctlConfigResponse(
        @Nullable Integer fsAioMaxNr,
        @Nullable Integer fsFileMax,
        @Nullable Integer fsInotifyMaxUserWatches,
        @Nullable Integer fsNrOpen,
        @Nullable Integer kernelThreadsMax,
        @Nullable Integer netCoreNetdevMaxBacklog,
        @Nullable Integer netCoreOptmemMax,
        @Nullable Integer netCoreRmemDefault,
        @Nullable Integer netCoreRmemMax,
        @Nullable Integer netCoreSomaxconn,
        @Nullable Integer netCoreWmemDefault,
        @Nullable Integer netCoreWmemMax,
        @Nullable String netIpv4IpLocalPortRange,
        @Nullable Integer netIpv4NeighDefaultGcThresh1,
        @Nullable Integer netIpv4NeighDefaultGcThresh2,
        @Nullable Integer netIpv4NeighDefaultGcThresh3,
        @Nullable Integer netIpv4TcpFinTimeout,
        @Nullable Integer netIpv4TcpKeepaliveProbes,
        @Nullable Integer netIpv4TcpKeepaliveTime,
        @Nullable Integer netIpv4TcpMaxSynBacklog,
        @Nullable Integer netIpv4TcpMaxTwBuckets,
        @Nullable Boolean netIpv4TcpTwReuse,
        @Nullable Integer netIpv4TcpkeepaliveIntvl,
        @Nullable Integer netNetfilterNfConntrackBuckets,
        @Nullable Integer netNetfilterNfConntrackMax,
        @Nullable Integer vmMaxMapCount,
        @Nullable Integer vmSwappiness,
        @Nullable Integer vmVfsCachePressure) {
        this.fsAioMaxNr = fsAioMaxNr;
        this.fsFileMax = fsFileMax;
        this.fsInotifyMaxUserWatches = fsInotifyMaxUserWatches;
        this.fsNrOpen = fsNrOpen;
        this.kernelThreadsMax = kernelThreadsMax;
        this.netCoreNetdevMaxBacklog = netCoreNetdevMaxBacklog;
        this.netCoreOptmemMax = netCoreOptmemMax;
        this.netCoreRmemDefault = netCoreRmemDefault;
        this.netCoreRmemMax = netCoreRmemMax;
        this.netCoreSomaxconn = netCoreSomaxconn;
        this.netCoreWmemDefault = netCoreWmemDefault;
        this.netCoreWmemMax = netCoreWmemMax;
        this.netIpv4IpLocalPortRange = netIpv4IpLocalPortRange;
        this.netIpv4NeighDefaultGcThresh1 = netIpv4NeighDefaultGcThresh1;
        this.netIpv4NeighDefaultGcThresh2 = netIpv4NeighDefaultGcThresh2;
        this.netIpv4NeighDefaultGcThresh3 = netIpv4NeighDefaultGcThresh3;
        this.netIpv4TcpFinTimeout = netIpv4TcpFinTimeout;
        this.netIpv4TcpKeepaliveProbes = netIpv4TcpKeepaliveProbes;
        this.netIpv4TcpKeepaliveTime = netIpv4TcpKeepaliveTime;
        this.netIpv4TcpMaxSynBacklog = netIpv4TcpMaxSynBacklog;
        this.netIpv4TcpMaxTwBuckets = netIpv4TcpMaxTwBuckets;
        this.netIpv4TcpTwReuse = netIpv4TcpTwReuse;
        this.netIpv4TcpkeepaliveIntvl = netIpv4TcpkeepaliveIntvl;
        this.netNetfilterNfConntrackBuckets = netNetfilterNfConntrackBuckets;
        this.netNetfilterNfConntrackMax = netNetfilterNfConntrackMax;
        this.vmMaxMapCount = vmMaxMapCount;
        this.vmSwappiness = vmSwappiness;
        this.vmVfsCachePressure = vmVfsCachePressure;
    }

    /**
     * Sysctl setting fs.aio-max-nr.
     * 
    */
    public Optional<Integer> getFsAioMaxNr() {
        return Optional.ofNullable(this.fsAioMaxNr);
    }
    /**
     * Sysctl setting fs.file-max.
     * 
    */
    public Optional<Integer> getFsFileMax() {
        return Optional.ofNullable(this.fsFileMax);
    }
    /**
     * Sysctl setting fs.inotify.max_user_watches.
     * 
    */
    public Optional<Integer> getFsInotifyMaxUserWatches() {
        return Optional.ofNullable(this.fsInotifyMaxUserWatches);
    }
    /**
     * Sysctl setting fs.nr_open.
     * 
    */
    public Optional<Integer> getFsNrOpen() {
        return Optional.ofNullable(this.fsNrOpen);
    }
    /**
     * Sysctl setting kernel.threads-max.
     * 
    */
    public Optional<Integer> getKernelThreadsMax() {
        return Optional.ofNullable(this.kernelThreadsMax);
    }
    /**
     * Sysctl setting net.core.netdev_max_backlog.
     * 
    */
    public Optional<Integer> getNetCoreNetdevMaxBacklog() {
        return Optional.ofNullable(this.netCoreNetdevMaxBacklog);
    }
    /**
     * Sysctl setting net.core.optmem_max.
     * 
    */
    public Optional<Integer> getNetCoreOptmemMax() {
        return Optional.ofNullable(this.netCoreOptmemMax);
    }
    /**
     * Sysctl setting net.core.rmem_default.
     * 
    */
    public Optional<Integer> getNetCoreRmemDefault() {
        return Optional.ofNullable(this.netCoreRmemDefault);
    }
    /**
     * Sysctl setting net.core.rmem_max.
     * 
    */
    public Optional<Integer> getNetCoreRmemMax() {
        return Optional.ofNullable(this.netCoreRmemMax);
    }
    /**
     * Sysctl setting net.core.somaxconn.
     * 
    */
    public Optional<Integer> getNetCoreSomaxconn() {
        return Optional.ofNullable(this.netCoreSomaxconn);
    }
    /**
     * Sysctl setting net.core.wmem_default.
     * 
    */
    public Optional<Integer> getNetCoreWmemDefault() {
        return Optional.ofNullable(this.netCoreWmemDefault);
    }
    /**
     * Sysctl setting net.core.wmem_max.
     * 
    */
    public Optional<Integer> getNetCoreWmemMax() {
        return Optional.ofNullable(this.netCoreWmemMax);
    }
    /**
     * Sysctl setting net.ipv4.ip_local_port_range.
     * 
    */
    public Optional<String> getNetIpv4IpLocalPortRange() {
        return Optional.ofNullable(this.netIpv4IpLocalPortRange);
    }
    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh1.
     * 
    */
    public Optional<Integer> getNetIpv4NeighDefaultGcThresh1() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh1);
    }
    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh2.
     * 
    */
    public Optional<Integer> getNetIpv4NeighDefaultGcThresh2() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh2);
    }
    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh3.
     * 
    */
    public Optional<Integer> getNetIpv4NeighDefaultGcThresh3() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh3);
    }
    /**
     * Sysctl setting net.ipv4.tcp_fin_timeout.
     * 
    */
    public Optional<Integer> getNetIpv4TcpFinTimeout() {
        return Optional.ofNullable(this.netIpv4TcpFinTimeout);
    }
    /**
     * Sysctl setting net.ipv4.tcp_keepalive_probes.
     * 
    */
    public Optional<Integer> getNetIpv4TcpKeepaliveProbes() {
        return Optional.ofNullable(this.netIpv4TcpKeepaliveProbes);
    }
    /**
     * Sysctl setting net.ipv4.tcp_keepalive_time.
     * 
    */
    public Optional<Integer> getNetIpv4TcpKeepaliveTime() {
        return Optional.ofNullable(this.netIpv4TcpKeepaliveTime);
    }
    /**
     * Sysctl setting net.ipv4.tcp_max_syn_backlog.
     * 
    */
    public Optional<Integer> getNetIpv4TcpMaxSynBacklog() {
        return Optional.ofNullable(this.netIpv4TcpMaxSynBacklog);
    }
    /**
     * Sysctl setting net.ipv4.tcp_max_tw_buckets.
     * 
    */
    public Optional<Integer> getNetIpv4TcpMaxTwBuckets() {
        return Optional.ofNullable(this.netIpv4TcpMaxTwBuckets);
    }
    /**
     * Sysctl setting net.ipv4.tcp_tw_reuse.
     * 
    */
    public Optional<Boolean> getNetIpv4TcpTwReuse() {
        return Optional.ofNullable(this.netIpv4TcpTwReuse);
    }
    /**
     * Sysctl setting net.ipv4.tcp_keepalive_intvl.
     * 
    */
    public Optional<Integer> getNetIpv4TcpkeepaliveIntvl() {
        return Optional.ofNullable(this.netIpv4TcpkeepaliveIntvl);
    }
    /**
     * Sysctl setting net.netfilter.nf_conntrack_buckets.
     * 
    */
    public Optional<Integer> getNetNetfilterNfConntrackBuckets() {
        return Optional.ofNullable(this.netNetfilterNfConntrackBuckets);
    }
    /**
     * Sysctl setting net.netfilter.nf_conntrack_max.
     * 
    */
    public Optional<Integer> getNetNetfilterNfConntrackMax() {
        return Optional.ofNullable(this.netNetfilterNfConntrackMax);
    }
    /**
     * Sysctl setting vm.max_map_count.
     * 
    */
    public Optional<Integer> getVmMaxMapCount() {
        return Optional.ofNullable(this.vmMaxMapCount);
    }
    /**
     * Sysctl setting vm.swappiness.
     * 
    */
    public Optional<Integer> getVmSwappiness() {
        return Optional.ofNullable(this.vmSwappiness);
    }
    /**
     * Sysctl setting vm.vfs_cache_pressure.
     * 
    */
    public Optional<Integer> getVmVfsCachePressure() {
        return Optional.ofNullable(this.vmVfsCachePressure);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SysctlConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fsAioMaxNr;
        private @Nullable Integer fsFileMax;
        private @Nullable Integer fsInotifyMaxUserWatches;
        private @Nullable Integer fsNrOpen;
        private @Nullable Integer kernelThreadsMax;
        private @Nullable Integer netCoreNetdevMaxBacklog;
        private @Nullable Integer netCoreOptmemMax;
        private @Nullable Integer netCoreRmemDefault;
        private @Nullable Integer netCoreRmemMax;
        private @Nullable Integer netCoreSomaxconn;
        private @Nullable Integer netCoreWmemDefault;
        private @Nullable Integer netCoreWmemMax;
        private @Nullable String netIpv4IpLocalPortRange;
        private @Nullable Integer netIpv4NeighDefaultGcThresh1;
        private @Nullable Integer netIpv4NeighDefaultGcThresh2;
        private @Nullable Integer netIpv4NeighDefaultGcThresh3;
        private @Nullable Integer netIpv4TcpFinTimeout;
        private @Nullable Integer netIpv4TcpKeepaliveProbes;
        private @Nullable Integer netIpv4TcpKeepaliveTime;
        private @Nullable Integer netIpv4TcpMaxSynBacklog;
        private @Nullable Integer netIpv4TcpMaxTwBuckets;
        private @Nullable Boolean netIpv4TcpTwReuse;
        private @Nullable Integer netIpv4TcpkeepaliveIntvl;
        private @Nullable Integer netNetfilterNfConntrackBuckets;
        private @Nullable Integer netNetfilterNfConntrackMax;
        private @Nullable Integer vmMaxMapCount;
        private @Nullable Integer vmSwappiness;
        private @Nullable Integer vmVfsCachePressure;

        public Builder() {
    	      // Empty
        }

        public Builder(SysctlConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsAioMaxNr = defaults.fsAioMaxNr;
    	      this.fsFileMax = defaults.fsFileMax;
    	      this.fsInotifyMaxUserWatches = defaults.fsInotifyMaxUserWatches;
    	      this.fsNrOpen = defaults.fsNrOpen;
    	      this.kernelThreadsMax = defaults.kernelThreadsMax;
    	      this.netCoreNetdevMaxBacklog = defaults.netCoreNetdevMaxBacklog;
    	      this.netCoreOptmemMax = defaults.netCoreOptmemMax;
    	      this.netCoreRmemDefault = defaults.netCoreRmemDefault;
    	      this.netCoreRmemMax = defaults.netCoreRmemMax;
    	      this.netCoreSomaxconn = defaults.netCoreSomaxconn;
    	      this.netCoreWmemDefault = defaults.netCoreWmemDefault;
    	      this.netCoreWmemMax = defaults.netCoreWmemMax;
    	      this.netIpv4IpLocalPortRange = defaults.netIpv4IpLocalPortRange;
    	      this.netIpv4NeighDefaultGcThresh1 = defaults.netIpv4NeighDefaultGcThresh1;
    	      this.netIpv4NeighDefaultGcThresh2 = defaults.netIpv4NeighDefaultGcThresh2;
    	      this.netIpv4NeighDefaultGcThresh3 = defaults.netIpv4NeighDefaultGcThresh3;
    	      this.netIpv4TcpFinTimeout = defaults.netIpv4TcpFinTimeout;
    	      this.netIpv4TcpKeepaliveProbes = defaults.netIpv4TcpKeepaliveProbes;
    	      this.netIpv4TcpKeepaliveTime = defaults.netIpv4TcpKeepaliveTime;
    	      this.netIpv4TcpMaxSynBacklog = defaults.netIpv4TcpMaxSynBacklog;
    	      this.netIpv4TcpMaxTwBuckets = defaults.netIpv4TcpMaxTwBuckets;
    	      this.netIpv4TcpTwReuse = defaults.netIpv4TcpTwReuse;
    	      this.netIpv4TcpkeepaliveIntvl = defaults.netIpv4TcpkeepaliveIntvl;
    	      this.netNetfilterNfConntrackBuckets = defaults.netNetfilterNfConntrackBuckets;
    	      this.netNetfilterNfConntrackMax = defaults.netNetfilterNfConntrackMax;
    	      this.vmMaxMapCount = defaults.vmMaxMapCount;
    	      this.vmSwappiness = defaults.vmSwappiness;
    	      this.vmVfsCachePressure = defaults.vmVfsCachePressure;
        }

        public Builder setFsAioMaxNr(@Nullable Integer fsAioMaxNr) {
            this.fsAioMaxNr = fsAioMaxNr;
            return this;
        }

        public Builder setFsFileMax(@Nullable Integer fsFileMax) {
            this.fsFileMax = fsFileMax;
            return this;
        }

        public Builder setFsInotifyMaxUserWatches(@Nullable Integer fsInotifyMaxUserWatches) {
            this.fsInotifyMaxUserWatches = fsInotifyMaxUserWatches;
            return this;
        }

        public Builder setFsNrOpen(@Nullable Integer fsNrOpen) {
            this.fsNrOpen = fsNrOpen;
            return this;
        }

        public Builder setKernelThreadsMax(@Nullable Integer kernelThreadsMax) {
            this.kernelThreadsMax = kernelThreadsMax;
            return this;
        }

        public Builder setNetCoreNetdevMaxBacklog(@Nullable Integer netCoreNetdevMaxBacklog) {
            this.netCoreNetdevMaxBacklog = netCoreNetdevMaxBacklog;
            return this;
        }

        public Builder setNetCoreOptmemMax(@Nullable Integer netCoreOptmemMax) {
            this.netCoreOptmemMax = netCoreOptmemMax;
            return this;
        }

        public Builder setNetCoreRmemDefault(@Nullable Integer netCoreRmemDefault) {
            this.netCoreRmemDefault = netCoreRmemDefault;
            return this;
        }

        public Builder setNetCoreRmemMax(@Nullable Integer netCoreRmemMax) {
            this.netCoreRmemMax = netCoreRmemMax;
            return this;
        }

        public Builder setNetCoreSomaxconn(@Nullable Integer netCoreSomaxconn) {
            this.netCoreSomaxconn = netCoreSomaxconn;
            return this;
        }

        public Builder setNetCoreWmemDefault(@Nullable Integer netCoreWmemDefault) {
            this.netCoreWmemDefault = netCoreWmemDefault;
            return this;
        }

        public Builder setNetCoreWmemMax(@Nullable Integer netCoreWmemMax) {
            this.netCoreWmemMax = netCoreWmemMax;
            return this;
        }

        public Builder setNetIpv4IpLocalPortRange(@Nullable String netIpv4IpLocalPortRange) {
            this.netIpv4IpLocalPortRange = netIpv4IpLocalPortRange;
            return this;
        }

        public Builder setNetIpv4NeighDefaultGcThresh1(@Nullable Integer netIpv4NeighDefaultGcThresh1) {
            this.netIpv4NeighDefaultGcThresh1 = netIpv4NeighDefaultGcThresh1;
            return this;
        }

        public Builder setNetIpv4NeighDefaultGcThresh2(@Nullable Integer netIpv4NeighDefaultGcThresh2) {
            this.netIpv4NeighDefaultGcThresh2 = netIpv4NeighDefaultGcThresh2;
            return this;
        }

        public Builder setNetIpv4NeighDefaultGcThresh3(@Nullable Integer netIpv4NeighDefaultGcThresh3) {
            this.netIpv4NeighDefaultGcThresh3 = netIpv4NeighDefaultGcThresh3;
            return this;
        }

        public Builder setNetIpv4TcpFinTimeout(@Nullable Integer netIpv4TcpFinTimeout) {
            this.netIpv4TcpFinTimeout = netIpv4TcpFinTimeout;
            return this;
        }

        public Builder setNetIpv4TcpKeepaliveProbes(@Nullable Integer netIpv4TcpKeepaliveProbes) {
            this.netIpv4TcpKeepaliveProbes = netIpv4TcpKeepaliveProbes;
            return this;
        }

        public Builder setNetIpv4TcpKeepaliveTime(@Nullable Integer netIpv4TcpKeepaliveTime) {
            this.netIpv4TcpKeepaliveTime = netIpv4TcpKeepaliveTime;
            return this;
        }

        public Builder setNetIpv4TcpMaxSynBacklog(@Nullable Integer netIpv4TcpMaxSynBacklog) {
            this.netIpv4TcpMaxSynBacklog = netIpv4TcpMaxSynBacklog;
            return this;
        }

        public Builder setNetIpv4TcpMaxTwBuckets(@Nullable Integer netIpv4TcpMaxTwBuckets) {
            this.netIpv4TcpMaxTwBuckets = netIpv4TcpMaxTwBuckets;
            return this;
        }

        public Builder setNetIpv4TcpTwReuse(@Nullable Boolean netIpv4TcpTwReuse) {
            this.netIpv4TcpTwReuse = netIpv4TcpTwReuse;
            return this;
        }

        public Builder setNetIpv4TcpkeepaliveIntvl(@Nullable Integer netIpv4TcpkeepaliveIntvl) {
            this.netIpv4TcpkeepaliveIntvl = netIpv4TcpkeepaliveIntvl;
            return this;
        }

        public Builder setNetNetfilterNfConntrackBuckets(@Nullable Integer netNetfilterNfConntrackBuckets) {
            this.netNetfilterNfConntrackBuckets = netNetfilterNfConntrackBuckets;
            return this;
        }

        public Builder setNetNetfilterNfConntrackMax(@Nullable Integer netNetfilterNfConntrackMax) {
            this.netNetfilterNfConntrackMax = netNetfilterNfConntrackMax;
            return this;
        }

        public Builder setVmMaxMapCount(@Nullable Integer vmMaxMapCount) {
            this.vmMaxMapCount = vmMaxMapCount;
            return this;
        }

        public Builder setVmSwappiness(@Nullable Integer vmSwappiness) {
            this.vmSwappiness = vmSwappiness;
            return this;
        }

        public Builder setVmVfsCachePressure(@Nullable Integer vmVfsCachePressure) {
            this.vmVfsCachePressure = vmVfsCachePressure;
            return this;
        }
        public SysctlConfigResponse build() {
            return new SysctlConfigResponse(fsAioMaxNr, fsFileMax, fsInotifyMaxUserWatches, fsNrOpen, kernelThreadsMax, netCoreNetdevMaxBacklog, netCoreOptmemMax, netCoreRmemDefault, netCoreRmemMax, netCoreSomaxconn, netCoreWmemDefault, netCoreWmemMax, netIpv4IpLocalPortRange, netIpv4NeighDefaultGcThresh1, netIpv4NeighDefaultGcThresh2, netIpv4NeighDefaultGcThresh3, netIpv4TcpFinTimeout, netIpv4TcpKeepaliveProbes, netIpv4TcpKeepaliveTime, netIpv4TcpMaxSynBacklog, netIpv4TcpMaxTwBuckets, netIpv4TcpTwReuse, netIpv4TcpkeepaliveIntvl, netNetfilterNfConntrackBuckets, netNetfilterNfConntrackMax, vmMaxMapCount, vmSwappiness, vmVfsCachePressure);
        }
    }
}

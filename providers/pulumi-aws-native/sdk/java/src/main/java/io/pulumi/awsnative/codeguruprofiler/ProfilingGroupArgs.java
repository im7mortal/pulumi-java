// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeguruprofiler;

import io.pulumi.awsnative.codeguruprofiler.enums.ProfilingGroupComputePlatform;
import io.pulumi.awsnative.codeguruprofiler.inputs.AgentPermissionsPropertiesArgs;
import io.pulumi.awsnative.codeguruprofiler.inputs.ProfilingGroupChannelArgs;
import io.pulumi.awsnative.codeguruprofiler.inputs.ProfilingGroupTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProfilingGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProfilingGroupArgs Empty = new ProfilingGroupArgs();

    /**
     * The agent permissions attached to this profiling group.
     * 
     */
    @InputImport(name="agentPermissions")
    private final @Nullable Input<AgentPermissionsPropertiesArgs> agentPermissions;

    public Input<AgentPermissionsPropertiesArgs> getAgentPermissions() {
        return this.agentPermissions == null ? Input.empty() : this.agentPermissions;
    }

    /**
     * Configuration for Notification Channels for Anomaly Detection feature in CodeGuru Profiler which enables customers to detect anomalies in the application profile for those methods that represent the highest proportion of CPU time or latency
     * 
     */
    @InputImport(name="anomalyDetectionNotificationConfiguration")
    private final @Nullable Input<List<ProfilingGroupChannelArgs>> anomalyDetectionNotificationConfiguration;

    public Input<List<ProfilingGroupChannelArgs>> getAnomalyDetectionNotificationConfiguration() {
        return this.anomalyDetectionNotificationConfiguration == null ? Input.empty() : this.anomalyDetectionNotificationConfiguration;
    }

    /**
     * The compute platform of the profiling group.
     * 
     */
    @InputImport(name="computePlatform")
    private final @Nullable Input<ProfilingGroupComputePlatform> computePlatform;

    public Input<ProfilingGroupComputePlatform> getComputePlatform() {
        return this.computePlatform == null ? Input.empty() : this.computePlatform;
    }

    /**
     * The name of the profiling group.
     * 
     */
    @InputImport(name="profilingGroupName")
    private final @Nullable Input<String> profilingGroupName;

    public Input<String> getProfilingGroupName() {
        return this.profilingGroupName == null ? Input.empty() : this.profilingGroupName;
    }

    /**
     * The tags associated with a profiling group.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<ProfilingGroupTagArgs>> tags;

    public Input<List<ProfilingGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ProfilingGroupArgs(
        @Nullable Input<AgentPermissionsPropertiesArgs> agentPermissions,
        @Nullable Input<List<ProfilingGroupChannelArgs>> anomalyDetectionNotificationConfiguration,
        @Nullable Input<ProfilingGroupComputePlatform> computePlatform,
        @Nullable Input<String> profilingGroupName,
        @Nullable Input<List<ProfilingGroupTagArgs>> tags) {
        this.agentPermissions = agentPermissions;
        this.anomalyDetectionNotificationConfiguration = anomalyDetectionNotificationConfiguration;
        this.computePlatform = computePlatform;
        this.profilingGroupName = profilingGroupName;
        this.tags = tags;
    }

    private ProfilingGroupArgs() {
        this.agentPermissions = Input.empty();
        this.anomalyDetectionNotificationConfiguration = Input.empty();
        this.computePlatform = Input.empty();
        this.profilingGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfilingGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AgentPermissionsPropertiesArgs> agentPermissions;
        private @Nullable Input<List<ProfilingGroupChannelArgs>> anomalyDetectionNotificationConfiguration;
        private @Nullable Input<ProfilingGroupComputePlatform> computePlatform;
        private @Nullable Input<String> profilingGroupName;
        private @Nullable Input<List<ProfilingGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfilingGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPermissions = defaults.agentPermissions;
    	      this.anomalyDetectionNotificationConfiguration = defaults.anomalyDetectionNotificationConfiguration;
    	      this.computePlatform = defaults.computePlatform;
    	      this.profilingGroupName = defaults.profilingGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setAgentPermissions(@Nullable Input<AgentPermissionsPropertiesArgs> agentPermissions) {
            this.agentPermissions = agentPermissions;
            return this;
        }

        public Builder setAgentPermissions(@Nullable AgentPermissionsPropertiesArgs agentPermissions) {
            this.agentPermissions = Input.ofNullable(agentPermissions);
            return this;
        }

        public Builder setAnomalyDetectionNotificationConfiguration(@Nullable Input<List<ProfilingGroupChannelArgs>> anomalyDetectionNotificationConfiguration) {
            this.anomalyDetectionNotificationConfiguration = anomalyDetectionNotificationConfiguration;
            return this;
        }

        public Builder setAnomalyDetectionNotificationConfiguration(@Nullable List<ProfilingGroupChannelArgs> anomalyDetectionNotificationConfiguration) {
            this.anomalyDetectionNotificationConfiguration = Input.ofNullable(anomalyDetectionNotificationConfiguration);
            return this;
        }

        public Builder setComputePlatform(@Nullable Input<ProfilingGroupComputePlatform> computePlatform) {
            this.computePlatform = computePlatform;
            return this;
        }

        public Builder setComputePlatform(@Nullable ProfilingGroupComputePlatform computePlatform) {
            this.computePlatform = Input.ofNullable(computePlatform);
            return this;
        }

        public Builder setProfilingGroupName(@Nullable Input<String> profilingGroupName) {
            this.profilingGroupName = profilingGroupName;
            return this;
        }

        public Builder setProfilingGroupName(@Nullable String profilingGroupName) {
            this.profilingGroupName = Input.ofNullable(profilingGroupName);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ProfilingGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ProfilingGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ProfilingGroupArgs build() {
            return new ProfilingGroupArgs(agentPermissions, anomalyDetectionNotificationConfiguration, computePlatform, profilingGroupName, tags);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.storagetransfer_v1.inputs.BandwidthLimitArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final AgentPoolArgs Empty = new AgentPoolArgs();

    /**
     * Required. The ID of the agent pool to create. The `agent_pool_id` must meet the following requirements: * Length of 128 characters or less. * Not start with the string `goog`. * Start with a lowercase ASCII character, followed by: * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (`-`), periods (`.`), underscores (`_`), or tildes (`~`). * One or more numerals or lowercase ASCII characters. As expressed by the regular expression: `^(?!goog)[a-z]([a-z0-9-._~]*[a-z0-9])?$`.
     * 
     */
    @Import(name="agentPoolId", required=true)
    private Output<String> agentPoolId;

    /**
     * @return Required. The ID of the agent pool to create. The `agent_pool_id` must meet the following requirements: * Length of 128 characters or less. * Not start with the string `goog`. * Start with a lowercase ASCII character, followed by: * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (`-`), periods (`.`), underscores (`_`), or tildes (`~`). * One or more numerals or lowercase ASCII characters. As expressed by the regular expression: `^(?!goog)[a-z]([a-z0-9-._~]*[a-z0-9])?$`.
     * 
     */
    public Output<String> agentPoolId() {
        return this.agentPoolId;
    }

    /**
     * Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
     * 
     */
    @Import(name="bandwidthLimit")
    private @Nullable Output<BandwidthLimitArgs> bandwidthLimit;

    /**
     * @return Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
     * 
     */
    public Optional<Output<BandwidthLimitArgs>> bandwidthLimit() {
        return Optional.ofNullable(this.bandwidthLimit);
    }

    /**
     * Specifies the client-specified AgentPool description.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Specifies the client-specified AgentPool description.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Specifies a unique string that identifies the agent pool. Format: `projects/{project_id}/agentPools/{agent_pool_id}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies a unique string that identifies the agent pool. Format: `projects/{project_id}/agentPools/{agent_pool_id}`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private AgentPoolArgs() {}

    private AgentPoolArgs(AgentPoolArgs $) {
        this.agentPoolId = $.agentPoolId;
        this.bandwidthLimit = $.bandwidthLimit;
        this.displayName = $.displayName;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentPoolArgs $;

        public Builder() {
            $ = new AgentPoolArgs();
        }

        public Builder(AgentPoolArgs defaults) {
            $ = new AgentPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentPoolId Required. The ID of the agent pool to create. The `agent_pool_id` must meet the following requirements: * Length of 128 characters or less. * Not start with the string `goog`. * Start with a lowercase ASCII character, followed by: * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (`-`), periods (`.`), underscores (`_`), or tildes (`~`). * One or more numerals or lowercase ASCII characters. As expressed by the regular expression: `^(?!goog)[a-z]([a-z0-9-._~]*[a-z0-9])?$`.
         * 
         * @return builder
         * 
         */
        public Builder agentPoolId(Output<String> agentPoolId) {
            $.agentPoolId = agentPoolId;
            return this;
        }

        /**
         * @param agentPoolId Required. The ID of the agent pool to create. The `agent_pool_id` must meet the following requirements: * Length of 128 characters or less. * Not start with the string `goog`. * Start with a lowercase ASCII character, followed by: * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (`-`), periods (`.`), underscores (`_`), or tildes (`~`). * One or more numerals or lowercase ASCII characters. As expressed by the regular expression: `^(?!goog)[a-z]([a-z0-9-._~]*[a-z0-9])?$`.
         * 
         * @return builder
         * 
         */
        public Builder agentPoolId(String agentPoolId) {
            return agentPoolId(Output.of(agentPoolId));
        }

        /**
         * @param bandwidthLimit Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimit(@Nullable Output<BandwidthLimitArgs> bandwidthLimit) {
            $.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * @param bandwidthLimit Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimit(BandwidthLimitArgs bandwidthLimit) {
            return bandwidthLimit(Output.of(bandwidthLimit));
        }

        /**
         * @param displayName Specifies the client-specified AgentPool description.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Specifies the client-specified AgentPool description.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name Specifies a unique string that identifies the agent pool. Format: `projects/{project_id}/agentPools/{agent_pool_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies a unique string that identifies the agent pool. Format: `projects/{project_id}/agentPools/{agent_pool_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public AgentPoolArgs build() {
            $.agentPoolId = Objects.requireNonNull($.agentPoolId, "expected parameter 'agentPoolId' to be non-null");
            return $;
        }
    }

}

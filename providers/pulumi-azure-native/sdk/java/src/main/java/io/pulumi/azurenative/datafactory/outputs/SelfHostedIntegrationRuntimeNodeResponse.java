// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SelfHostedIntegrationRuntimeNodeResponse {
    /**
     * The integration runtime capabilities dictionary
     * 
     */
    private final Map<String,String> capabilities;
    /**
     * Maximum concurrent jobs on the integration runtime node.
     * 
     */
    private final Integer concurrentJobsLimit;
    /**
     * The time at which the integration runtime will expire in ISO8601 format.
     * 
     */
    private final String expiryTime;
    /**
     * URI for the host machine of the integration runtime.
     * 
     */
    private final String hostServiceUri;
    /**
     * Indicates whether this node is the active dispatcher for integration runtime requests.
     * 
     */
    private final Boolean isActiveDispatcher;
    /**
     * The most recent time at which the integration runtime was connected in ISO8601 format.
     * 
     */
    private final String lastConnectTime;
    /**
     * The last time for the integration runtime node update end.
     * 
     */
    private final String lastEndUpdateTime;
    /**
     * The time the node last started up.
     * 
     */
    private final String lastStartTime;
    /**
     * The last time for the integration runtime node update start.
     * 
     */
    private final String lastStartUpdateTime;
    /**
     * The integration runtime node last stop time.
     * 
     */
    private final String lastStopTime;
    /**
     * The result of the last integration runtime node update.
     * 
     */
    private final String lastUpdateResult;
    /**
     * Machine name of the integration runtime node.
     * 
     */
    private final String machineName;
    /**
     * The maximum concurrent jobs in this integration runtime.
     * 
     */
    private final Integer maxConcurrentJobs;
    /**
     * Name of the integration runtime node.
     * 
     */
    private final String nodeName;
    /**
     * The time at which the integration runtime node was registered in ISO8601 format.
     * 
     */
    private final String registerTime;
    /**
     * Status of the integration runtime node.
     * 
     */
    private final String status;
    /**
     * Version of the integration runtime node.
     * 
     */
    private final String version;
    /**
     * Status of the integration runtime node version.
     * 
     */
    private final String versionStatus;

    @OutputCustomType.Constructor({"capabilities","concurrentJobsLimit","expiryTime","hostServiceUri","isActiveDispatcher","lastConnectTime","lastEndUpdateTime","lastStartTime","lastStartUpdateTime","lastStopTime","lastUpdateResult","machineName","maxConcurrentJobs","nodeName","registerTime","status","version","versionStatus"})
    private SelfHostedIntegrationRuntimeNodeResponse(
        Map<String,String> capabilities,
        Integer concurrentJobsLimit,
        String expiryTime,
        String hostServiceUri,
        Boolean isActiveDispatcher,
        String lastConnectTime,
        String lastEndUpdateTime,
        String lastStartTime,
        String lastStartUpdateTime,
        String lastStopTime,
        String lastUpdateResult,
        String machineName,
        Integer maxConcurrentJobs,
        String nodeName,
        String registerTime,
        String status,
        String version,
        String versionStatus) {
        this.capabilities = Objects.requireNonNull(capabilities);
        this.concurrentJobsLimit = Objects.requireNonNull(concurrentJobsLimit);
        this.expiryTime = Objects.requireNonNull(expiryTime);
        this.hostServiceUri = Objects.requireNonNull(hostServiceUri);
        this.isActiveDispatcher = Objects.requireNonNull(isActiveDispatcher);
        this.lastConnectTime = Objects.requireNonNull(lastConnectTime);
        this.lastEndUpdateTime = Objects.requireNonNull(lastEndUpdateTime);
        this.lastStartTime = Objects.requireNonNull(lastStartTime);
        this.lastStartUpdateTime = Objects.requireNonNull(lastStartUpdateTime);
        this.lastStopTime = Objects.requireNonNull(lastStopTime);
        this.lastUpdateResult = Objects.requireNonNull(lastUpdateResult);
        this.machineName = Objects.requireNonNull(machineName);
        this.maxConcurrentJobs = Objects.requireNonNull(maxConcurrentJobs);
        this.nodeName = Objects.requireNonNull(nodeName);
        this.registerTime = Objects.requireNonNull(registerTime);
        this.status = Objects.requireNonNull(status);
        this.version = Objects.requireNonNull(version);
        this.versionStatus = Objects.requireNonNull(versionStatus);
    }

    /**
     * The integration runtime capabilities dictionary
     * 
    */
    public Map<String,String> getCapabilities() {
        return this.capabilities;
    }
    /**
     * Maximum concurrent jobs on the integration runtime node.
     * 
    */
    public Integer getConcurrentJobsLimit() {
        return this.concurrentJobsLimit;
    }
    /**
     * The time at which the integration runtime will expire in ISO8601 format.
     * 
    */
    public String getExpiryTime() {
        return this.expiryTime;
    }
    /**
     * URI for the host machine of the integration runtime.
     * 
    */
    public String getHostServiceUri() {
        return this.hostServiceUri;
    }
    /**
     * Indicates whether this node is the active dispatcher for integration runtime requests.
     * 
    */
    public Boolean getIsActiveDispatcher() {
        return this.isActiveDispatcher;
    }
    /**
     * The most recent time at which the integration runtime was connected in ISO8601 format.
     * 
    */
    public String getLastConnectTime() {
        return this.lastConnectTime;
    }
    /**
     * The last time for the integration runtime node update end.
     * 
    */
    public String getLastEndUpdateTime() {
        return this.lastEndUpdateTime;
    }
    /**
     * The time the node last started up.
     * 
    */
    public String getLastStartTime() {
        return this.lastStartTime;
    }
    /**
     * The last time for the integration runtime node update start.
     * 
    */
    public String getLastStartUpdateTime() {
        return this.lastStartUpdateTime;
    }
    /**
     * The integration runtime node last stop time.
     * 
    */
    public String getLastStopTime() {
        return this.lastStopTime;
    }
    /**
     * The result of the last integration runtime node update.
     * 
    */
    public String getLastUpdateResult() {
        return this.lastUpdateResult;
    }
    /**
     * Machine name of the integration runtime node.
     * 
    */
    public String getMachineName() {
        return this.machineName;
    }
    /**
     * The maximum concurrent jobs in this integration runtime.
     * 
    */
    public Integer getMaxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }
    /**
     * Name of the integration runtime node.
     * 
    */
    public String getNodeName() {
        return this.nodeName;
    }
    /**
     * The time at which the integration runtime node was registered in ISO8601 format.
     * 
    */
    public String getRegisterTime() {
        return this.registerTime;
    }
    /**
     * Status of the integration runtime node.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Version of the integration runtime node.
     * 
    */
    public String getVersion() {
        return this.version;
    }
    /**
     * Status of the integration runtime node version.
     * 
    */
    public String getVersionStatus() {
        return this.versionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfHostedIntegrationRuntimeNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> capabilities;
        private Integer concurrentJobsLimit;
        private String expiryTime;
        private String hostServiceUri;
        private Boolean isActiveDispatcher;
        private String lastConnectTime;
        private String lastEndUpdateTime;
        private String lastStartTime;
        private String lastStartUpdateTime;
        private String lastStopTime;
        private String lastUpdateResult;
        private String machineName;
        private Integer maxConcurrentJobs;
        private String nodeName;
        private String registerTime;
        private String status;
        private String version;
        private String versionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfHostedIntegrationRuntimeNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.concurrentJobsLimit = defaults.concurrentJobsLimit;
    	      this.expiryTime = defaults.expiryTime;
    	      this.hostServiceUri = defaults.hostServiceUri;
    	      this.isActiveDispatcher = defaults.isActiveDispatcher;
    	      this.lastConnectTime = defaults.lastConnectTime;
    	      this.lastEndUpdateTime = defaults.lastEndUpdateTime;
    	      this.lastStartTime = defaults.lastStartTime;
    	      this.lastStartUpdateTime = defaults.lastStartUpdateTime;
    	      this.lastStopTime = defaults.lastStopTime;
    	      this.lastUpdateResult = defaults.lastUpdateResult;
    	      this.machineName = defaults.machineName;
    	      this.maxConcurrentJobs = defaults.maxConcurrentJobs;
    	      this.nodeName = defaults.nodeName;
    	      this.registerTime = defaults.registerTime;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
    	      this.versionStatus = defaults.versionStatus;
        }

        public Builder setCapabilities(Map<String,String> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }

        public Builder setConcurrentJobsLimit(Integer concurrentJobsLimit) {
            this.concurrentJobsLimit = Objects.requireNonNull(concurrentJobsLimit);
            return this;
        }

        public Builder setExpiryTime(String expiryTime) {
            this.expiryTime = Objects.requireNonNull(expiryTime);
            return this;
        }

        public Builder setHostServiceUri(String hostServiceUri) {
            this.hostServiceUri = Objects.requireNonNull(hostServiceUri);
            return this;
        }

        public Builder setIsActiveDispatcher(Boolean isActiveDispatcher) {
            this.isActiveDispatcher = Objects.requireNonNull(isActiveDispatcher);
            return this;
        }

        public Builder setLastConnectTime(String lastConnectTime) {
            this.lastConnectTime = Objects.requireNonNull(lastConnectTime);
            return this;
        }

        public Builder setLastEndUpdateTime(String lastEndUpdateTime) {
            this.lastEndUpdateTime = Objects.requireNonNull(lastEndUpdateTime);
            return this;
        }

        public Builder setLastStartTime(String lastStartTime) {
            this.lastStartTime = Objects.requireNonNull(lastStartTime);
            return this;
        }

        public Builder setLastStartUpdateTime(String lastStartUpdateTime) {
            this.lastStartUpdateTime = Objects.requireNonNull(lastStartUpdateTime);
            return this;
        }

        public Builder setLastStopTime(String lastStopTime) {
            this.lastStopTime = Objects.requireNonNull(lastStopTime);
            return this;
        }

        public Builder setLastUpdateResult(String lastUpdateResult) {
            this.lastUpdateResult = Objects.requireNonNull(lastUpdateResult);
            return this;
        }

        public Builder setMachineName(String machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }

        public Builder setMaxConcurrentJobs(Integer maxConcurrentJobs) {
            this.maxConcurrentJobs = Objects.requireNonNull(maxConcurrentJobs);
            return this;
        }

        public Builder setNodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }

        public Builder setRegisterTime(String registerTime) {
            this.registerTime = Objects.requireNonNull(registerTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVersionStatus(String versionStatus) {
            this.versionStatus = Objects.requireNonNull(versionStatus);
            return this;
        }
        public SelfHostedIntegrationRuntimeNodeResponse build() {
            return new SelfHostedIntegrationRuntimeNodeResponse(capabilities, concurrentJobsLimit, expiryTime, hostServiceUri, isActiveDispatcher, lastConnectTime, lastEndUpdateTime, lastStartTime, lastStartUpdateTime, lastStopTime, lastUpdateResult, machineName, maxConcurrentJobs, nodeName, registerTime, status, version, versionStatus);
        }
    }
}

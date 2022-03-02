// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.file_v1.outputs.FileShareConfigResponse;
import io.pulumi.googlenative.file_v1.outputs.NetworkConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceResult {
    /**
     * The time when the instance was created.
     * 
     */
    private final String createTime;
    /**
     * The description of the instance (2048 characters or less).
     * 
     */
    private final String description;
    /**
     * Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    private final String etag;
    /**
     * File system shares on the instance. For this version, only a single file share is supported.
     * 
     */
    private final List<FileShareConfigResponse> fileShares;
    /**
     * KMS key name used for data encryption.
     * 
     */
    private final String kmsKeyName;
    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name of the instance, in the format `projects/{project}/locations/{location}/instances/{instance}`.
     * 
     */
    private final String name;
    /**
     * VPC networks to which the instance is connected. For this version, only a single network is supported.
     * 
     */
    private final List<NetworkConfigResponse> networks;
    /**
     * Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * The instance state.
     * 
     */
    private final String state;
    /**
     * Additional information about the instance state, if available.
     * 
     */
    private final String statusMessage;
    /**
     * field indicates all the reasons the instance is in "SUSPENDED" state.
     * 
     */
    private final List<String> suspensionReasons;
    /**
     * The service tier of the instance.
     * 
     */
    private final String tier;

    @OutputCustomType.Constructor({"createTime","description","etag","fileShares","kmsKeyName","labels","name","networks","satisfiesPzs","state","statusMessage","suspensionReasons","tier"})
    private GetInstanceResult(
        String createTime,
        String description,
        String etag,
        List<FileShareConfigResponse> fileShares,
        String kmsKeyName,
        Map<String,String> labels,
        String name,
        List<NetworkConfigResponse> networks,
        Boolean satisfiesPzs,
        String state,
        String statusMessage,
        List<String> suspensionReasons,
        String tier) {
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.etag = Objects.requireNonNull(etag);
        this.fileShares = Objects.requireNonNull(fileShares);
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.networks = Objects.requireNonNull(networks);
        this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
        this.state = Objects.requireNonNull(state);
        this.statusMessage = Objects.requireNonNull(statusMessage);
        this.suspensionReasons = Objects.requireNonNull(suspensionReasons);
        this.tier = Objects.requireNonNull(tier);
    }

    /**
     * The time when the instance was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The description of the instance (2048 characters or less).
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * File system shares on the instance. For this version, only a single file share is supported.
     * 
    */
    public List<FileShareConfigResponse> getFileShares() {
        return this.fileShares;
    }
    /**
     * KMS key name used for data encryption.
     * 
    */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Resource labels to represent user provided metadata.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the instance, in the format `projects/{project}/locations/{location}/instances/{instance}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * VPC networks to which the instance is connected. For this version, only a single network is supported.
     * 
    */
    public List<NetworkConfigResponse> getNetworks() {
        return this.networks;
    }
    /**
     * Reserved for future use.
     * 
    */
    public Boolean getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * The instance state.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Additional information about the instance state, if available.
     * 
    */
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * field indicates all the reasons the instance is in "SUSPENDED" state.
     * 
    */
    public List<String> getSuspensionReasons() {
        return this.suspensionReasons;
    }
    /**
     * The service tier of the instance.
     * 
    */
    public String getTier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String etag;
        private List<FileShareConfigResponse> fileShares;
        private String kmsKeyName;
        private Map<String,String> labels;
        private String name;
        private List<NetworkConfigResponse> networks;
        private Boolean satisfiesPzs;
        private String state;
        private String statusMessage;
        private List<String> suspensionReasons;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.fileShares = defaults.fileShares;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.networks = defaults.networks;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
    	      this.suspensionReasons = defaults.suspensionReasons;
    	      this.tier = defaults.tier;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFileShares(List<FileShareConfigResponse> fileShares) {
            this.fileShares = Objects.requireNonNull(fileShares);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworks(List<NetworkConfigResponse> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }

        public Builder setSatisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public Builder setSuspensionReasons(List<String> suspensionReasons) {
            this.suspensionReasons = Objects.requireNonNull(suspensionReasons);
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public GetInstanceResult build() {
            return new GetInstanceResult(createTime, description, etag, fileShares, kmsKeyName, labels, name, networks, satisfiesPzs, state, statusMessage, suspensionReasons, tier);
        }
    }
}

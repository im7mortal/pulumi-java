// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2ContainerResponse;
import io.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2RevisionScalingResponse;
import io.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2VolumeResponse;
import io.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2VpcAccessResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRunOpV2RevisionTemplateResponse {
    /**
     * KRM-style annotations for the resource.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * Enables Confidential Cloud Run in Revisions created using this template.
     * 
     */
    private final Boolean confidential;
    /**
     * Sets the maximum number of requests that each serving instance can receive.
     * 
     */
    private final Integer containerConcurrency;
    /**
     * Holds the single container that defines the unit of execution for this Revision.
     * 
     */
    private final List<GoogleCloudRunOpV2ContainerResponse> containers;
    /**
     * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    private final String encryptionKey;
    /**
     * The sandbox environment to host this Revision.
     * 
     */
    private final String executionEnvironment;
    /**
     * KRM-style labels for the resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    private final String revision;
    /**
     * Scaling settings for this Revision.
     * 
     */
    private final GoogleCloudRunOpV2RevisionScalingResponse scaling;
    /**
     * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
     * 
     */
    private final String serviceAccount;
    /**
     * Max allowed time for an instance to respond to a request.
     * 
     */
    private final String timeout;
    /**
     * A list of Volumes to make available to containers.
     * 
     */
    private final List<GoogleCloudRunOpV2VolumeResponse> volumes;
    /**
     * VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    private final GoogleCloudRunOpV2VpcAccessResponse vpcAccess;

    @OutputCustomType.Constructor({"annotations","confidential","containerConcurrency","containers","encryptionKey","executionEnvironment","labels","revision","scaling","serviceAccount","timeout","volumes","vpcAccess"})
    private GoogleCloudRunOpV2RevisionTemplateResponse(
        Map<String,String> annotations,
        Boolean confidential,
        Integer containerConcurrency,
        List<GoogleCloudRunOpV2ContainerResponse> containers,
        String encryptionKey,
        String executionEnvironment,
        Map<String,String> labels,
        String revision,
        GoogleCloudRunOpV2RevisionScalingResponse scaling,
        String serviceAccount,
        String timeout,
        List<GoogleCloudRunOpV2VolumeResponse> volumes,
        GoogleCloudRunOpV2VpcAccessResponse vpcAccess) {
        this.annotations = Objects.requireNonNull(annotations);
        this.confidential = Objects.requireNonNull(confidential);
        this.containerConcurrency = Objects.requireNonNull(containerConcurrency);
        this.containers = Objects.requireNonNull(containers);
        this.encryptionKey = Objects.requireNonNull(encryptionKey);
        this.executionEnvironment = Objects.requireNonNull(executionEnvironment);
        this.labels = Objects.requireNonNull(labels);
        this.revision = Objects.requireNonNull(revision);
        this.scaling = Objects.requireNonNull(scaling);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.timeout = Objects.requireNonNull(timeout);
        this.volumes = Objects.requireNonNull(volumes);
        this.vpcAccess = Objects.requireNonNull(vpcAccess);
    }

    /**
     * KRM-style annotations for the resource.
     * 
    */
    public Map<String,String> getAnnotations() {
        return this.annotations;
    }
    /**
     * Enables Confidential Cloud Run in Revisions created using this template.
     * 
    */
    public Boolean getConfidential() {
        return this.confidential;
    }
    /**
     * Sets the maximum number of requests that each serving instance can receive.
     * 
    */
    public Integer getContainerConcurrency() {
        return this.containerConcurrency;
    }
    /**
     * Holds the single container that defines the unit of execution for this Revision.
     * 
    */
    public List<GoogleCloudRunOpV2ContainerResponse> getContainers() {
        return this.containers;
    }
    /**
     * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
    */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }
    /**
     * The sandbox environment to host this Revision.
     * 
    */
    public String getExecutionEnvironment() {
        return this.executionEnvironment;
    }
    /**
     * KRM-style labels for the resource.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
    */
    public String getRevision() {
        return this.revision;
    }
    /**
     * Scaling settings for this Revision.
     * 
    */
    public GoogleCloudRunOpV2RevisionScalingResponse getScaling() {
        return this.scaling;
    }
    /**
     * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Max allowed time for an instance to respond to a request.
     * 
    */
    public String getTimeout() {
        return this.timeout;
    }
    /**
     * A list of Volumes to make available to containers.
     * 
    */
    public List<GoogleCloudRunOpV2VolumeResponse> getVolumes() {
        return this.volumes;
    }
    /**
     * VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
    */
    public GoogleCloudRunOpV2VpcAccessResponse getVpcAccess() {
        return this.vpcAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2RevisionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private Boolean confidential;
        private Integer containerConcurrency;
        private List<GoogleCloudRunOpV2ContainerResponse> containers;
        private String encryptionKey;
        private String executionEnvironment;
        private Map<String,String> labels;
        private String revision;
        private GoogleCloudRunOpV2RevisionScalingResponse scaling;
        private String serviceAccount;
        private String timeout;
        private List<GoogleCloudRunOpV2VolumeResponse> volumes;
        private GoogleCloudRunOpV2VpcAccessResponse vpcAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2RevisionTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.confidential = defaults.confidential;
    	      this.containerConcurrency = defaults.containerConcurrency;
    	      this.containers = defaults.containers;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.executionEnvironment = defaults.executionEnvironment;
    	      this.labels = defaults.labels;
    	      this.revision = defaults.revision;
    	      this.scaling = defaults.scaling;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.timeout = defaults.timeout;
    	      this.volumes = defaults.volumes;
    	      this.vpcAccess = defaults.vpcAccess;
        }

        public Builder setAnnotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder setConfidential(Boolean confidential) {
            this.confidential = Objects.requireNonNull(confidential);
            return this;
        }

        public Builder setContainerConcurrency(Integer containerConcurrency) {
            this.containerConcurrency = Objects.requireNonNull(containerConcurrency);
            return this;
        }

        public Builder setContainers(List<GoogleCloudRunOpV2ContainerResponse> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }

        public Builder setEncryptionKey(String encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }

        public Builder setExecutionEnvironment(String executionEnvironment) {
            this.executionEnvironment = Objects.requireNonNull(executionEnvironment);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setRevision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder setScaling(GoogleCloudRunOpV2RevisionScalingResponse scaling) {
            this.scaling = Objects.requireNonNull(scaling);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setTimeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder setVolumes(List<GoogleCloudRunOpV2VolumeResponse> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }

        public Builder setVpcAccess(GoogleCloudRunOpV2VpcAccessResponse vpcAccess) {
            this.vpcAccess = Objects.requireNonNull(vpcAccess);
            return this;
        }
        public GoogleCloudRunOpV2RevisionTemplateResponse build() {
            return new GoogleCloudRunOpV2RevisionTemplateResponse(annotations, confidential, containerConcurrency, containers, encryptionKey, executionEnvironment, labels, revision, scaling, serviceAccount, timeout, volumes, vpcAccess);
        }
    }
}

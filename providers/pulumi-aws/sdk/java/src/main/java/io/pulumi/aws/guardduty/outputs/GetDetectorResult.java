// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDetectorResult {
    /**
     * The frequency of notifications sent about subsequent finding occurrences.
     * 
     */
    private final String findingPublishingFrequency;
    private final String id;
    /**
     * The service-linked role that grants GuardDuty access to the resources in the AWS account.
     * 
     */
    private final String serviceRoleArn;
    /**
     * The current status of the detector.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"findingPublishingFrequency","id","serviceRoleArn","status"})
    private GetDetectorResult(
        String findingPublishingFrequency,
        String id,
        String serviceRoleArn,
        String status) {
        this.findingPublishingFrequency = Objects.requireNonNull(findingPublishingFrequency);
        this.id = Objects.requireNonNull(id);
        this.serviceRoleArn = Objects.requireNonNull(serviceRoleArn);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * The frequency of notifications sent about subsequent finding occurrences.
     * 
    */
    public String getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }
    public String getId() {
        return this.id;
    }
    /**
     * The service-linked role that grants GuardDuty access to the resources in the AWS account.
     * 
    */
    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }
    /**
     * The current status of the detector.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDetectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String findingPublishingFrequency;
        private String id;
        private String serviceRoleArn;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDetectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.findingPublishingFrequency = defaults.findingPublishingFrequency;
    	      this.id = defaults.id;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.status = defaults.status;
        }

        public Builder setFindingPublishingFrequency(String findingPublishingFrequency) {
            this.findingPublishingFrequency = Objects.requireNonNull(findingPublishingFrequency);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setServiceRoleArn(String serviceRoleArn) {
            this.serviceRoleArn = Objects.requireNonNull(serviceRoleArn);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetDetectorResult build() {
            return new GetDetectorResult(findingPublishingFrequency, id, serviceRoleArn, status);
        }
    }
}

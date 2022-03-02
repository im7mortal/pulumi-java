// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetConnectionResult {
    /**
     * The ARN of the connection.
     * 
     */
    private final String arn;
    /**
     * The Direct Connect endpoint on which the physical connection terminates.
     * 
     */
    private final String awsDevice;
    /**
     * The bandwidth of the connection.
     * 
     */
    private final String bandwidth;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The AWS Direct Connect location where the connection is located.
     * 
     */
    private final String location;
    private final String name;
    /**
     * The ID of the AWS account that owns the connection.
     * 
     */
    private final String ownerAccountId;
    /**
     * The name of the service provider associated with the connection.
     * 
     */
    private final String providerName;
    /**
     * A map of tags for the resource.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"arn","awsDevice","bandwidth","id","location","name","ownerAccountId","providerName","tags"})
    private GetConnectionResult(
        String arn,
        String awsDevice,
        String bandwidth,
        String id,
        String location,
        String name,
        String ownerAccountId,
        String providerName,
        Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn);
        this.awsDevice = Objects.requireNonNull(awsDevice);
        this.bandwidth = Objects.requireNonNull(bandwidth);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.ownerAccountId = Objects.requireNonNull(ownerAccountId);
        this.providerName = Objects.requireNonNull(providerName);
        this.tags = Objects.requireNonNull(tags);
    }

    /**
     * The ARN of the connection.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The Direct Connect endpoint on which the physical connection terminates.
     * 
    */
    public String getAwsDevice() {
        return this.awsDevice;
    }
    /**
     * The bandwidth of the connection.
     * 
    */
    public String getBandwidth() {
        return this.bandwidth;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The AWS Direct Connect location where the connection is located.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The ID of the AWS account that owns the connection.
     * 
    */
    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The name of the service provider associated with the connection.
     * 
    */
    public String getProviderName() {
        return this.providerName;
    }
    /**
     * A map of tags for the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String awsDevice;
        private String bandwidth;
        private String id;
        private String location;
        private String name;
        private String ownerAccountId;
        private String providerName;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.awsDevice = defaults.awsDevice;
    	      this.bandwidth = defaults.bandwidth;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.ownerAccountId = defaults.ownerAccountId;
    	      this.providerName = defaults.providerName;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAwsDevice(String awsDevice) {
            this.awsDevice = Objects.requireNonNull(awsDevice);
            return this;
        }

        public Builder setBandwidth(String bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOwnerAccountId(String ownerAccountId) {
            this.ownerAccountId = Objects.requireNonNull(ownerAccountId);
            return this;
        }

        public Builder setProviderName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetConnectionResult build() {
            return new GetConnectionResult(arn, awsDevice, bandwidth, id, location, name, ownerAccountId, providerName, tags);
        }
    }
}

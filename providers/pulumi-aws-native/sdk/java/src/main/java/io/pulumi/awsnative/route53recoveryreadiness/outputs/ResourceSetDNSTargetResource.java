// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.outputs;

import io.pulumi.awsnative.route53recoveryreadiness.outputs.ResourceSetTargetResource;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceSetDNSTargetResource {
    /**
     * The domain name that acts as an ingress point to a portion of the customer application.
     * 
     */
    private final @Nullable String domainName;
    /**
     * The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the target resource.
     * 
     */
    private final @Nullable String hostedZoneArn;
    /**
     * The Route 53 record set ID that will uniquely identify a DNS record, given a name and a type.
     * 
     */
    private final @Nullable String recordSetId;
    /**
     * The type of DNS record of the target resource.
     * 
     */
    private final @Nullable String recordType;
    private final @Nullable ResourceSetTargetResource targetResource;

    @OutputCustomType.Constructor({"domainName","hostedZoneArn","recordSetId","recordType","targetResource"})
    private ResourceSetDNSTargetResource(
        @Nullable String domainName,
        @Nullable String hostedZoneArn,
        @Nullable String recordSetId,
        @Nullable String recordType,
        @Nullable ResourceSetTargetResource targetResource) {
        this.domainName = domainName;
        this.hostedZoneArn = hostedZoneArn;
        this.recordSetId = recordSetId;
        this.recordType = recordType;
        this.targetResource = targetResource;
    }

    /**
     * The domain name that acts as an ingress point to a portion of the customer application.
     * 
    */
    public Optional<String> getDomainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the target resource.
     * 
    */
    public Optional<String> getHostedZoneArn() {
        return Optional.ofNullable(this.hostedZoneArn);
    }
    /**
     * The Route 53 record set ID that will uniquely identify a DNS record, given a name and a type.
     * 
    */
    public Optional<String> getRecordSetId() {
        return Optional.ofNullable(this.recordSetId);
    }
    /**
     * The type of DNS record of the target resource.
     * 
    */
    public Optional<String> getRecordType() {
        return Optional.ofNullable(this.recordType);
    }
    public Optional<ResourceSetTargetResource> getTargetResource() {
        return Optional.ofNullable(this.targetResource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetDNSTargetResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domainName;
        private @Nullable String hostedZoneArn;
        private @Nullable String recordSetId;
        private @Nullable String recordType;
        private @Nullable ResourceSetTargetResource targetResource;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetDNSTargetResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.hostedZoneArn = defaults.hostedZoneArn;
    	      this.recordSetId = defaults.recordSetId;
    	      this.recordType = defaults.recordType;
    	      this.targetResource = defaults.targetResource;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setHostedZoneArn(@Nullable String hostedZoneArn) {
            this.hostedZoneArn = hostedZoneArn;
            return this;
        }

        public Builder setRecordSetId(@Nullable String recordSetId) {
            this.recordSetId = recordSetId;
            return this;
        }

        public Builder setRecordType(@Nullable String recordType) {
            this.recordType = recordType;
            return this;
        }

        public Builder setTargetResource(@Nullable ResourceSetTargetResource targetResource) {
            this.targetResource = targetResource;
            return this;
        }
        public ResourceSetDNSTargetResource build() {
            return new ResourceSetDNSTargetResource(domainName, hostedZoneArn, recordSetId, recordType, targetResource);
        }
    }
}

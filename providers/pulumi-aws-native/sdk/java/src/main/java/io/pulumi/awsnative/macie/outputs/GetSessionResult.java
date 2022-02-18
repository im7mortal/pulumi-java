// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie.outputs;

import io.pulumi.awsnative.macie.enums.SessionFindingPublishingFrequency;
import io.pulumi.awsnative.macie.enums.SessionStatus;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSessionResult {
    /**
     * AWS account ID of customer
     * 
     */
    private final @Nullable String awsAccountId;
    /**
     * A enumeration value that specifies how frequently finding updates are published.
     * 
     */
    private final @Nullable SessionFindingPublishingFrequency findingPublishingFrequency;
    /**
     * Service role used by Macie
     * 
     */
    private final @Nullable String serviceRole;
    /**
     * A enumeration value that specifies the status of the Macie Session.
     * 
     */
    private final @Nullable SessionStatus status;

    @OutputCustomType.Constructor({"awsAccountId","findingPublishingFrequency","serviceRole","status"})
    private GetSessionResult(
        @Nullable String awsAccountId,
        @Nullable SessionFindingPublishingFrequency findingPublishingFrequency,
        @Nullable String serviceRole,
        @Nullable SessionStatus status) {
        this.awsAccountId = awsAccountId;
        this.findingPublishingFrequency = findingPublishingFrequency;
        this.serviceRole = serviceRole;
        this.status = status;
    }

    /**
     * AWS account ID of customer
     * 
     */
    public Optional<String> getAwsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }
    /**
     * A enumeration value that specifies how frequently finding updates are published.
     * 
     */
    public Optional<SessionFindingPublishingFrequency> getFindingPublishingFrequency() {
        return Optional.ofNullable(this.findingPublishingFrequency);
    }
    /**
     * Service role used by Macie
     * 
     */
    public Optional<String> getServiceRole() {
        return Optional.ofNullable(this.serviceRole);
    }
    /**
     * A enumeration value that specifies the status of the Macie Session.
     * 
     */
    public Optional<SessionStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSessionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String awsAccountId;
        private @Nullable SessionFindingPublishingFrequency findingPublishingFrequency;
        private @Nullable String serviceRole;
        private @Nullable SessionStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSessionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.findingPublishingFrequency = defaults.findingPublishingFrequency;
    	      this.serviceRole = defaults.serviceRole;
    	      this.status = defaults.status;
        }

        public Builder setAwsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder setFindingPublishingFrequency(@Nullable SessionFindingPublishingFrequency findingPublishingFrequency) {
            this.findingPublishingFrequency = findingPublishingFrequency;
            return this;
        }

        public Builder setServiceRole(@Nullable String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        public Builder setStatus(@Nullable SessionStatus status) {
            this.status = status;
            return this;
        }

        public GetSessionResult build() {
            return new GetSessionResult(awsAccountId, findingPublishingFrequency, serviceRole, status);
        }
    }
}

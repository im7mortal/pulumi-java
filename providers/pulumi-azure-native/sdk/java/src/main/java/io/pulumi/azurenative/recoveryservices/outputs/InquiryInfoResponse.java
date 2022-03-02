// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.ErrorDetailResponse;
import io.pulumi.azurenative.recoveryservices.outputs.WorkloadInquiryDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InquiryInfoResponse {
    /**
     * Error Details if the Status is non-success.
     * 
     */
    private final @Nullable ErrorDetailResponse errorDetail;
    /**
     * Inquiry Details which will have workload specific details.
     * For e.g. - For SQL and oracle this will contain different details.
     * 
     */
    private final @Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails;
    /**
     * Inquiry Status for this container such as
     * InProgress | Failed | Succeeded
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"errorDetail","inquiryDetails","status"})
    private InquiryInfoResponse(
        @Nullable ErrorDetailResponse errorDetail,
        @Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails,
        @Nullable String status) {
        this.errorDetail = errorDetail;
        this.inquiryDetails = inquiryDetails;
        this.status = status;
    }

    /**
     * Error Details if the Status is non-success.
     * 
    */
    public Optional<ErrorDetailResponse> getErrorDetail() {
        return Optional.ofNullable(this.errorDetail);
    }
    /**
     * Inquiry Details which will have workload specific details.
     * For e.g. - For SQL and oracle this will contain different details.
     * 
    */
    public List<WorkloadInquiryDetailsResponse> getInquiryDetails() {
        return this.inquiryDetails == null ? List.of() : this.inquiryDetails;
    }
    /**
     * Inquiry Status for this container such as
     * InProgress | Failed | Succeeded
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InquiryInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ErrorDetailResponse errorDetail;
        private @Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(InquiryInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorDetail = defaults.errorDetail;
    	      this.inquiryDetails = defaults.inquiryDetails;
    	      this.status = defaults.status;
        }

        public Builder setErrorDetail(@Nullable ErrorDetailResponse errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        public Builder setInquiryDetails(@Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails) {
            this.inquiryDetails = inquiryDetails;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public InquiryInfoResponse build() {
            return new InquiryInfoResponse(errorDetail, inquiryDetails, status);
        }
    }
}

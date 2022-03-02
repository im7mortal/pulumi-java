// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1ApiCategoryDataResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetApicategoryResult {
    /**
     * Details of category.
     * 
     */
    private final GoogleCloudApigeeV1ApiCategoryDataResponse data;
    /**
     * ID that can be used to find errors in the log files.
     * 
     */
    private final String errorCode;
    /**
     * Description of the operation.
     * 
     */
    private final String message;
    /**
     * ID that can be used to find request details in the log files.
     * 
     */
    private final String requestId;
    /**
     * Status of the operation.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"data","errorCode","message","requestId","status"})
    private GetApicategoryResult(
        GoogleCloudApigeeV1ApiCategoryDataResponse data,
        String errorCode,
        String message,
        String requestId,
        String status) {
        this.data = Objects.requireNonNull(data);
        this.errorCode = Objects.requireNonNull(errorCode);
        this.message = Objects.requireNonNull(message);
        this.requestId = Objects.requireNonNull(requestId);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Details of category.
     * 
    */
    public GoogleCloudApigeeV1ApiCategoryDataResponse getData() {
        return this.data;
    }
    /**
     * ID that can be used to find errors in the log files.
     * 
    */
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * Description of the operation.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * ID that can be used to find request details in the log files.
     * 
    */
    public String getRequestId() {
        return this.requestId;
    }
    /**
     * Status of the operation.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApicategoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1ApiCategoryDataResponse data;
        private String errorCode;
        private String message;
        private String requestId;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApicategoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.errorCode = defaults.errorCode;
    	      this.message = defaults.message;
    	      this.requestId = defaults.requestId;
    	      this.status = defaults.status;
        }

        public Builder setData(GoogleCloudApigeeV1ApiCategoryDataResponse data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }

        public Builder setErrorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setRequestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetApicategoryResult build() {
            return new GetApicategoryResult(data, errorCode, message, requestId, status);
        }
    }
}

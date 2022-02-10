// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageResponse;
import java.util.Objects;


public final class GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse Empty = new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse();

    @InputImport(name="additionalCases", required=true)
    private final GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse additionalCases;

    public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse getAdditionalCases() {
        return this.additionalCases;
    }

    @InputImport(name="message", required=true)
    private final GoogleCloudDialogflowCxV3beta1ResponseMessageResponse message;

    public GoogleCloudDialogflowCxV3beta1ResponseMessageResponse getMessage() {
        return this.message;
    }

    public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse(
        GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse additionalCases,
        GoogleCloudDialogflowCxV3beta1ResponseMessageResponse message) {
        this.additionalCases = Objects.requireNonNull(additionalCases, "expected parameter 'additionalCases' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse() {
        this.additionalCases = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse additionalCases;
        private GoogleCloudDialogflowCxV3beta1ResponseMessageResponse message;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCases = defaults.additionalCases;
    	      this.message = defaults.message;
        }

        public Builder setAdditionalCases(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse additionalCases) {
            this.additionalCases = Objects.requireNonNull(additionalCases);
            return this;
        }

        public Builder setMessage(GoogleCloudDialogflowCxV3beta1ResponseMessageResponse message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse(additionalCases, message);
        }
    }
}
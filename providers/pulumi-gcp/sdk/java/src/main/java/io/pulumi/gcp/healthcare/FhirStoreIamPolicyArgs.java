// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FhirStoreIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreIamPolicyArgs Empty = new FhirStoreIamPolicyArgs();

    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="fhirStoreId", required=true)
    private final Input<String> fhirStoreId;

    public Input<String> getFhirStoreId() {
        return this.fhirStoreId;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
    private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    public FhirStoreIamPolicyArgs(
        Input<String> fhirStoreId,
        Input<String> policyData) {
        this.fhirStoreId = Objects.requireNonNull(fhirStoreId, "expected parameter 'fhirStoreId' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
    }

    private FhirStoreIamPolicyArgs() {
        this.fhirStoreId = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fhirStoreId;
        private Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.policyData = defaults.policyData;
        }

        public Builder setFhirStoreId(Input<String> fhirStoreId) {
            this.fhirStoreId = Objects.requireNonNull(fhirStoreId);
            return this;
        }

        public Builder setFhirStoreId(String fhirStoreId) {
            this.fhirStoreId = Input.of(Objects.requireNonNull(fhirStoreId));
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }

        public FhirStoreIamPolicyArgs build() {
            return new FhirStoreIamPolicyArgs(fhirStoreId, policyData);
        }
    }
}
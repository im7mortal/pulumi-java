// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PackageValidationResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final PackageValidationResultResponse Empty = new PackageValidationResultResponse();

    @InputImport(name="errors", required=true)
    private final List<String> errors;

    public List<String> getErrors() {
        return this.errors;
    }

    @InputImport(name="isValid", required=true)
    private final Boolean isValid;

    public Boolean getIsValid() {
        return this.isValid;
    }

    @InputImport(name="validationName", required=true)
    private final String validationName;

    public String getValidationName() {
        return this.validationName;
    }

    public PackageValidationResultResponse(
        List<String> errors,
        Boolean isValid,
        String validationName) {
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.isValid = Objects.requireNonNull(isValid, "expected parameter 'isValid' to be non-null");
        this.validationName = Objects.requireNonNull(validationName, "expected parameter 'validationName' to be non-null");
    }

    private PackageValidationResultResponse() {
        this.errors = List.of();
        this.isValid = null;
        this.validationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageValidationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> errors;
        private Boolean isValid;
        private String validationName;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageValidationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.isValid = defaults.isValid;
    	      this.validationName = defaults.validationName;
        }

        public Builder setErrors(List<String> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setIsValid(Boolean isValid) {
            this.isValid = Objects.requireNonNull(isValid);
            return this;
        }

        public Builder setValidationName(String validationName) {
            this.validationName = Objects.requireNonNull(validationName);
            return this;
        }

        public PackageValidationResultResponse build() {
            return new PackageValidationResultResponse(errors, isValid, validationName);
        }
    }
}
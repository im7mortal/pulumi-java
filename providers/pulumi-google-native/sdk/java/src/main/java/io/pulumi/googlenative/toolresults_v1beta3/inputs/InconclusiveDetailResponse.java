// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class InconclusiveDetailResponse extends io.pulumi.resources.InvokeArgs {

    public static final InconclusiveDetailResponse Empty = new InconclusiveDetailResponse();

    @InputImport(name="abortedByUser", required=true)
    private final Boolean abortedByUser;

    public Boolean getAbortedByUser() {
        return this.abortedByUser;
    }

    @InputImport(name="hasErrorLogs", required=true)
    private final Boolean hasErrorLogs;

    public Boolean getHasErrorLogs() {
        return this.hasErrorLogs;
    }

    @InputImport(name="infrastructureFailure", required=true)
    private final Boolean infrastructureFailure;

    public Boolean getInfrastructureFailure() {
        return this.infrastructureFailure;
    }

    public InconclusiveDetailResponse(
        Boolean abortedByUser,
        Boolean hasErrorLogs,
        Boolean infrastructureFailure) {
        this.abortedByUser = Objects.requireNonNull(abortedByUser, "expected parameter 'abortedByUser' to be non-null");
        this.hasErrorLogs = Objects.requireNonNull(hasErrorLogs, "expected parameter 'hasErrorLogs' to be non-null");
        this.infrastructureFailure = Objects.requireNonNull(infrastructureFailure, "expected parameter 'infrastructureFailure' to be non-null");
    }

    private InconclusiveDetailResponse() {
        this.abortedByUser = null;
        this.hasErrorLogs = null;
        this.infrastructureFailure = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InconclusiveDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean abortedByUser;
        private Boolean hasErrorLogs;
        private Boolean infrastructureFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(InconclusiveDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortedByUser = defaults.abortedByUser;
    	      this.hasErrorLogs = defaults.hasErrorLogs;
    	      this.infrastructureFailure = defaults.infrastructureFailure;
        }

        public Builder setAbortedByUser(Boolean abortedByUser) {
            this.abortedByUser = Objects.requireNonNull(abortedByUser);
            return this;
        }

        public Builder setHasErrorLogs(Boolean hasErrorLogs) {
            this.hasErrorLogs = Objects.requireNonNull(hasErrorLogs);
            return this;
        }

        public Builder setInfrastructureFailure(Boolean infrastructureFailure) {
            this.infrastructureFailure = Objects.requireNonNull(infrastructureFailure);
            return this;
        }

        public InconclusiveDetailResponse build() {
            return new InconclusiveDetailResponse(abortedByUser, hasErrorLogs, infrastructureFailure);
        }
    }
}
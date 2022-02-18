// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAccountAuditConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccountAuditConfigurationArgs Empty = new GetAccountAuditConfigurationArgs();

    /**
     * Your 12-digit account ID (used as the primary identifier for the CloudFormation resource).
     * 
     */
    @InputImport(name="accountId", required=true)
    private final String accountId;

    public String getAccountId() {
        return this.accountId;
    }

    public GetAccountAuditConfigurationArgs(String accountId) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
    }

    private GetAccountAuditConfigurationArgs() {
        this.accountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountAuditConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountAuditConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public GetAccountAuditConfigurationArgs build() {
            return new GetAccountAuditConfigurationArgs(accountId);
        }
    }
}

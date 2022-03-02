// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ApigatewayAuditLogConfigResponse {
    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    private final List<String> exemptedMembers;
    /**
     * The log type that this config enables.
     * 
     */
    private final String logType;

    @OutputCustomType.Constructor({"exemptedMembers","logType"})
    private ApigatewayAuditLogConfigResponse(
        List<String> exemptedMembers,
        String logType) {
        this.exemptedMembers = Objects.requireNonNull(exemptedMembers);
        this.logType = Objects.requireNonNull(logType);
    }

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
    */
    public List<String> getExemptedMembers() {
        return this.exemptedMembers;
    }
    /**
     * The log type that this config enables.
     * 
    */
    public String getLogType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayAuditLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> exemptedMembers;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayAuditLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder setExemptedMembers(List<String> exemptedMembers) {
            this.exemptedMembers = Objects.requireNonNull(exemptedMembers);
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public ApigatewayAuditLogConfigResponse build() {
            return new ApigatewayAuditLogConfigResponse(exemptedMembers, logType);
        }
    }
}

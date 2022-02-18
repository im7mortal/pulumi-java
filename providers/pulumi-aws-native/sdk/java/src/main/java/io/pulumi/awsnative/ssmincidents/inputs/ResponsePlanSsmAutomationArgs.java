// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.inputs;

import io.pulumi.awsnative.ssmincidents.enums.ResponsePlanSsmAutomationTargetAccount;
import io.pulumi.awsnative.ssmincidents.inputs.ResponsePlanSsmParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration to use when starting the SSM automation document.
 * 
 */
public final class ResponsePlanSsmAutomationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponsePlanSsmAutomationArgs Empty = new ResponsePlanSsmAutomationArgs();

    /**
     * The document name to use when starting the SSM automation document.
     * 
     */
    @InputImport(name="documentName", required=true)
    private final Input<String> documentName;

    public Input<String> getDocumentName() {
        return this.documentName;
    }

    /**
     * The version of the document to use when starting the SSM automation document.
     * 
     */
    @InputImport(name="documentVersion")
    private final @Nullable Input<String> documentVersion;

    public Input<String> getDocumentVersion() {
        return this.documentVersion == null ? Input.empty() : this.documentVersion;
    }

    /**
     * The parameters to set when starting the SSM automation document.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<List<ResponsePlanSsmParameterArgs>> parameters;

    public Input<List<ResponsePlanSsmParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The role ARN to use when starting the SSM automation document.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The account type to use when starting the SSM automation document.
     * 
     */
    @InputImport(name="targetAccount")
    private final @Nullable Input<ResponsePlanSsmAutomationTargetAccount> targetAccount;

    public Input<ResponsePlanSsmAutomationTargetAccount> getTargetAccount() {
        return this.targetAccount == null ? Input.empty() : this.targetAccount;
    }

    public ResponsePlanSsmAutomationArgs(
        Input<String> documentName,
        @Nullable Input<String> documentVersion,
        @Nullable Input<List<ResponsePlanSsmParameterArgs>> parameters,
        Input<String> roleArn,
        @Nullable Input<ResponsePlanSsmAutomationTargetAccount> targetAccount) {
        this.documentName = Objects.requireNonNull(documentName, "expected parameter 'documentName' to be non-null");
        this.documentVersion = documentVersion;
        this.parameters = parameters;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.targetAccount = targetAccount;
    }

    private ResponsePlanSsmAutomationArgs() {
        this.documentName = Input.empty();
        this.documentVersion = Input.empty();
        this.parameters = Input.empty();
        this.roleArn = Input.empty();
        this.targetAccount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanSsmAutomationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> documentName;
        private @Nullable Input<String> documentVersion;
        private @Nullable Input<List<ResponsePlanSsmParameterArgs>> parameters;
        private Input<String> roleArn;
        private @Nullable Input<ResponsePlanSsmAutomationTargetAccount> targetAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanSsmAutomationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentName = defaults.documentName;
    	      this.documentVersion = defaults.documentVersion;
    	      this.parameters = defaults.parameters;
    	      this.roleArn = defaults.roleArn;
    	      this.targetAccount = defaults.targetAccount;
        }

        public Builder setDocumentName(Input<String> documentName) {
            this.documentName = Objects.requireNonNull(documentName);
            return this;
        }

        public Builder setDocumentName(String documentName) {
            this.documentName = Input.of(Objects.requireNonNull(documentName));
            return this;
        }

        public Builder setDocumentVersion(@Nullable Input<String> documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }

        public Builder setDocumentVersion(@Nullable String documentVersion) {
            this.documentVersion = Input.ofNullable(documentVersion);
            return this;
        }

        public Builder setParameters(@Nullable Input<List<ResponsePlanSsmParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<ResponsePlanSsmParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setTargetAccount(@Nullable Input<ResponsePlanSsmAutomationTargetAccount> targetAccount) {
            this.targetAccount = targetAccount;
            return this;
        }

        public Builder setTargetAccount(@Nullable ResponsePlanSsmAutomationTargetAccount targetAccount) {
            this.targetAccount = Input.ofNullable(targetAccount);
            return this;
        }

        public ResponsePlanSsmAutomationArgs build() {
            return new ResponsePlanSsmAutomationArgs(documentName, documentVersion, parameters, roleArn, targetAccount);
        }
    }
}

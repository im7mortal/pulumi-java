// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.quicksight.inputs.AnalysisErrorArgs;
import io.pulumi.awsnative.quicksight.inputs.AnalysisParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.AnalysisResourcePermissionArgs;
import io.pulumi.awsnative.quicksight.inputs.AnalysisSourceEntityArgs;
import io.pulumi.awsnative.quicksight.inputs.AnalysisTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalysisArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalysisArgs Empty = new AnalysisArgs();

    @InputImport(name="analysisId", required=true)
    private final Input<String> analysisId;

    public Input<String> getAnalysisId() {
        return this.analysisId;
    }

    @InputImport(name="awsAccountId", required=true)
    private final Input<String> awsAccountId;

    public Input<String> getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>Errors associated with the analysis.</p>
     * 
     */
    @InputImport(name="errors")
    private final @Nullable Input<List<AnalysisErrorArgs>> errors;

    public Input<List<AnalysisErrorArgs>> getErrors() {
        return this.errors == null ? Input.empty() : this.errors;
    }

    /**
     * <p>The descriptive name of the analysis.</p>
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<AnalysisParametersArgs> parameters;

    public Input<AnalysisParametersArgs> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * <p>A structure that describes the principals and the resource-level permissions on an
     *             analysis. You can use the <code>Permissions</code> structure to grant permissions by
     *             providing a list of AWS Identity and Access Management (IAM) action information for each
     *             principal listed by Amazon Resource Name (ARN). </p>
     * 
     *         <p>To specify no permissions, omit <code>Permissions</code>.</p>
     * 
     */
    @InputImport(name="permissions")
    private final @Nullable Input<List<AnalysisResourcePermissionArgs>> permissions;

    public Input<List<AnalysisResourcePermissionArgs>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    @InputImport(name="sourceEntity", required=true)
    private final Input<AnalysisSourceEntityArgs> sourceEntity;

    public Input<AnalysisSourceEntityArgs> getSourceEntity() {
        return this.sourceEntity;
    }

    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the
     *             analysis.</p>
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<AnalysisTagArgs>> tags;

    public Input<List<AnalysisTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * <p>The ARN of the theme of the analysis.</p>
     * 
     */
    @InputImport(name="themeArn")
    private final @Nullable Input<String> themeArn;

    public Input<String> getThemeArn() {
        return this.themeArn == null ? Input.empty() : this.themeArn;
    }

    public AnalysisArgs(
        Input<String> analysisId,
        Input<String> awsAccountId,
        @Nullable Input<List<AnalysisErrorArgs>> errors,
        @Nullable Input<String> name,
        @Nullable Input<AnalysisParametersArgs> parameters,
        @Nullable Input<List<AnalysisResourcePermissionArgs>> permissions,
        Input<AnalysisSourceEntityArgs> sourceEntity,
        @Nullable Input<List<AnalysisTagArgs>> tags,
        @Nullable Input<String> themeArn) {
        this.analysisId = Objects.requireNonNull(analysisId, "expected parameter 'analysisId' to be non-null");
        this.awsAccountId = Objects.requireNonNull(awsAccountId, "expected parameter 'awsAccountId' to be non-null");
        this.errors = errors;
        this.name = name;
        this.parameters = parameters;
        this.permissions = permissions;
        this.sourceEntity = Objects.requireNonNull(sourceEntity, "expected parameter 'sourceEntity' to be non-null");
        this.tags = tags;
        this.themeArn = themeArn;
    }

    private AnalysisArgs() {
        this.analysisId = Input.empty();
        this.awsAccountId = Input.empty();
        this.errors = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.permissions = Input.empty();
        this.sourceEntity = Input.empty();
        this.tags = Input.empty();
        this.themeArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> analysisId;
        private Input<String> awsAccountId;
        private @Nullable Input<List<AnalysisErrorArgs>> errors;
        private @Nullable Input<String> name;
        private @Nullable Input<AnalysisParametersArgs> parameters;
        private @Nullable Input<List<AnalysisResourcePermissionArgs>> permissions;
        private Input<AnalysisSourceEntityArgs> sourceEntity;
        private @Nullable Input<List<AnalysisTagArgs>> tags;
        private @Nullable Input<String> themeArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisId = defaults.analysisId;
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.errors = defaults.errors;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.permissions = defaults.permissions;
    	      this.sourceEntity = defaults.sourceEntity;
    	      this.tags = defaults.tags;
    	      this.themeArn = defaults.themeArn;
        }

        public Builder setAnalysisId(Input<String> analysisId) {
            this.analysisId = Objects.requireNonNull(analysisId);
            return this;
        }

        public Builder setAnalysisId(String analysisId) {
            this.analysisId = Input.of(Objects.requireNonNull(analysisId));
            return this;
        }

        public Builder setAwsAccountId(Input<String> awsAccountId) {
            this.awsAccountId = Objects.requireNonNull(awsAccountId);
            return this;
        }

        public Builder setAwsAccountId(String awsAccountId) {
            this.awsAccountId = Input.of(Objects.requireNonNull(awsAccountId));
            return this;
        }

        public Builder setErrors(@Nullable Input<List<AnalysisErrorArgs>> errors) {
            this.errors = errors;
            return this;
        }

        public Builder setErrors(@Nullable List<AnalysisErrorArgs> errors) {
            this.errors = Input.ofNullable(errors);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParameters(@Nullable Input<AnalysisParametersArgs> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable AnalysisParametersArgs parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPermissions(@Nullable Input<List<AnalysisResourcePermissionArgs>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPermissions(@Nullable List<AnalysisResourcePermissionArgs> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }

        public Builder setSourceEntity(Input<AnalysisSourceEntityArgs> sourceEntity) {
            this.sourceEntity = Objects.requireNonNull(sourceEntity);
            return this;
        }

        public Builder setSourceEntity(AnalysisSourceEntityArgs sourceEntity) {
            this.sourceEntity = Input.of(Objects.requireNonNull(sourceEntity));
            return this;
        }

        public Builder setTags(@Nullable Input<List<AnalysisTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<AnalysisTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setThemeArn(@Nullable Input<String> themeArn) {
            this.themeArn = themeArn;
            return this;
        }

        public Builder setThemeArn(@Nullable String themeArn) {
            this.themeArn = Input.ofNullable(themeArn);
            return this;
        }

        public AnalysisArgs build() {
            return new AnalysisArgs(analysisId, awsAccountId, errors, name, parameters, permissions, sourceEntity, tags, themeArn);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.DomainSharingSettingsNotebookOutputOption;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies options when sharing an Amazon SageMaker Studio notebook. These settings are specified as part of DefaultUserSettings when the CreateDomain API is called, and as part of UserSettings when the CreateUserProfile API is called.
 * 
 */
public final class DomainSharingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainSharingSettingsArgs Empty = new DomainSharingSettingsArgs();

    /**
     * Whether to include the notebook cell output when sharing the notebook. The default is Disabled.
     * 
     */
    @InputImport(name="notebookOutputOption")
    private final @Nullable Input<DomainSharingSettingsNotebookOutputOption> notebookOutputOption;

    public Input<DomainSharingSettingsNotebookOutputOption> getNotebookOutputOption() {
        return this.notebookOutputOption == null ? Input.empty() : this.notebookOutputOption;
    }

    /**
     * When NotebookOutputOption is Allowed, the AWS Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * 
     */
    @InputImport(name="s3KmsKeyId")
    private final @Nullable Input<String> s3KmsKeyId;

    public Input<String> getS3KmsKeyId() {
        return this.s3KmsKeyId == null ? Input.empty() : this.s3KmsKeyId;
    }

    /**
     * When NotebookOutputOption is Allowed, the Amazon S3 bucket used to store the shared notebook snapshots.
     * 
     */
    @InputImport(name="s3OutputPath")
    private final @Nullable Input<String> s3OutputPath;

    public Input<String> getS3OutputPath() {
        return this.s3OutputPath == null ? Input.empty() : this.s3OutputPath;
    }

    public DomainSharingSettingsArgs(
        @Nullable Input<DomainSharingSettingsNotebookOutputOption> notebookOutputOption,
        @Nullable Input<String> s3KmsKeyId,
        @Nullable Input<String> s3OutputPath) {
        this.notebookOutputOption = notebookOutputOption;
        this.s3KmsKeyId = s3KmsKeyId;
        this.s3OutputPath = s3OutputPath;
    }

    private DomainSharingSettingsArgs() {
        this.notebookOutputOption = Input.empty();
        this.s3KmsKeyId = Input.empty();
        this.s3OutputPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSharingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DomainSharingSettingsNotebookOutputOption> notebookOutputOption;
        private @Nullable Input<String> s3KmsKeyId;
        private @Nullable Input<String> s3OutputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSharingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notebookOutputOption = defaults.notebookOutputOption;
    	      this.s3KmsKeyId = defaults.s3KmsKeyId;
    	      this.s3OutputPath = defaults.s3OutputPath;
        }

        public Builder setNotebookOutputOption(@Nullable Input<DomainSharingSettingsNotebookOutputOption> notebookOutputOption) {
            this.notebookOutputOption = notebookOutputOption;
            return this;
        }

        public Builder setNotebookOutputOption(@Nullable DomainSharingSettingsNotebookOutputOption notebookOutputOption) {
            this.notebookOutputOption = Input.ofNullable(notebookOutputOption);
            return this;
        }

        public Builder setS3KmsKeyId(@Nullable Input<String> s3KmsKeyId) {
            this.s3KmsKeyId = s3KmsKeyId;
            return this;
        }

        public Builder setS3KmsKeyId(@Nullable String s3KmsKeyId) {
            this.s3KmsKeyId = Input.ofNullable(s3KmsKeyId);
            return this;
        }

        public Builder setS3OutputPath(@Nullable Input<String> s3OutputPath) {
            this.s3OutputPath = s3OutputPath;
            return this;
        }

        public Builder setS3OutputPath(@Nullable String s3OutputPath) {
            this.s3OutputPath = Input.ofNullable(s3OutputPath);
            return this;
        }

        public DomainSharingSettingsArgs build() {
            return new DomainSharingSettingsArgs(notebookOutputOption, s3KmsKeyId, s3OutputPath);
        }
    }
}

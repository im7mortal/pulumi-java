// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.AzureFileVolumeArgs;
import io.pulumi.azurenative.containerinstance.inputs.GitRepoVolumeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    @InputImport(name="azureFile")
    private final @Nullable Input<AzureFileVolumeArgs> azureFile;

    public Input<AzureFileVolumeArgs> getAzureFile() {
        return this.azureFile == null ? Input.empty() : this.azureFile;
    }

    @InputImport(name="emptyDir")
    private final @Nullable Input<Object> emptyDir;

    public Input<Object> getEmptyDir() {
        return this.emptyDir == null ? Input.empty() : this.emptyDir;
    }

    @InputImport(name="gitRepo")
    private final @Nullable Input<GitRepoVolumeArgs> gitRepo;

    public Input<GitRepoVolumeArgs> getGitRepo() {
        return this.gitRepo == null ? Input.empty() : this.gitRepo;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="secret")
    private final @Nullable Input<Map<String,String>> secret;

    public Input<Map<String,String>> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    public VolumeArgs(
        @Nullable Input<AzureFileVolumeArgs> azureFile,
        @Nullable Input<Object> emptyDir,
        @Nullable Input<GitRepoVolumeArgs> gitRepo,
        Input<String> name,
        @Nullable Input<Map<String,String>> secret) {
        this.azureFile = azureFile;
        this.emptyDir = emptyDir;
        this.gitRepo = gitRepo;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secret = secret;
    }

    private VolumeArgs() {
        this.azureFile = Input.empty();
        this.emptyDir = Input.empty();
        this.gitRepo = Input.empty();
        this.name = Input.empty();
        this.secret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AzureFileVolumeArgs> azureFile;
        private @Nullable Input<Object> emptyDir;
        private @Nullable Input<GitRepoVolumeArgs> gitRepo;
        private Input<String> name;
        private @Nullable Input<Map<String,String>> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureFile = defaults.azureFile;
    	      this.emptyDir = defaults.emptyDir;
    	      this.gitRepo = defaults.gitRepo;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder setAzureFile(@Nullable Input<AzureFileVolumeArgs> azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        public Builder setAzureFile(@Nullable AzureFileVolumeArgs azureFile) {
            this.azureFile = Input.ofNullable(azureFile);
            return this;
        }

        public Builder setEmptyDir(@Nullable Input<Object> emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }

        public Builder setEmptyDir(@Nullable Object emptyDir) {
            this.emptyDir = Input.ofNullable(emptyDir);
            return this;
        }

        public Builder setGitRepo(@Nullable Input<GitRepoVolumeArgs> gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        public Builder setGitRepo(@Nullable GitRepoVolumeArgs gitRepo) {
            this.gitRepo = Input.ofNullable(gitRepo);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSecret(@Nullable Input<Map<String,String>> secret) {
            this.secret = secret;
            return this;
        }

        public Builder setSecret(@Nullable Map<String,String> secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }

        public VolumeArgs build() {
            return new VolumeArgs(azureFile, emptyDir, gitRepo, name, secret);
        }
    }
}
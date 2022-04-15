// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.helm.sh_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification defining the Helm chart repository to use.
 * 
 */
public final class RepositoryOptsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryOptsArgs Empty = new RepositoryOptsArgs();

    /**
     * The Repository's CA File
     * 
     */
    @Import(name="caFile")
      private final @Nullable Output<String> caFile;

    public Output<String> caFile() {
        return this.caFile == null ? Codegen.empty() : this.caFile;
    }

    /**
     * The repository's cert file
     * 
     */
    @Import(name="certFile")
      private final @Nullable Output<String> certFile;

    public Output<String> certFile() {
        return this.certFile == null ? Codegen.empty() : this.certFile;
    }

    /**
     * The repository's cert key file
     * 
     */
    @Import(name="keyFile")
      private final @Nullable Output<String> keyFile;

    public Output<String> keyFile() {
        return this.keyFile == null ? Codegen.empty() : this.keyFile;
    }

    /**
     * Password for HTTP basic authentication
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Repository where to locate the requested chart. If is a URL the chart is installed without installing the repository.
     * 
     */
    @Import(name="repo")
      private final @Nullable Output<String> repo;

    public Output<String> repo() {
        return this.repo == null ? Codegen.empty() : this.repo;
    }

    /**
     * Username for HTTP basic authentication
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> username() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public RepositoryOptsArgs(
        @Nullable Output<String> caFile,
        @Nullable Output<String> certFile,
        @Nullable Output<String> keyFile,
        @Nullable Output<String> password,
        @Nullable Output<String> repo,
        @Nullable Output<String> username) {
        this.caFile = caFile;
        this.certFile = certFile;
        this.keyFile = keyFile;
        this.password = password;
        this.repo = repo;
        this.username = username;
    }

    private RepositoryOptsArgs() {
        this.caFile = Codegen.empty();
        this.certFile = Codegen.empty();
        this.keyFile = Codegen.empty();
        this.password = Codegen.empty();
        this.repo = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryOptsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> caFile;
        private @Nullable Output<String> certFile;
        private @Nullable Output<String> keyFile;
        private @Nullable Output<String> password;
        private @Nullable Output<String> repo;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryOptsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caFile = defaults.caFile;
    	      this.certFile = defaults.certFile;
    	      this.keyFile = defaults.keyFile;
    	      this.password = defaults.password;
    	      this.repo = defaults.repo;
    	      this.username = defaults.username;
        }

        public Builder caFile(@Nullable Output<String> caFile) {
            this.caFile = caFile;
            return this;
        }
        public Builder caFile(@Nullable String caFile) {
            this.caFile = Codegen.ofNullable(caFile);
            return this;
        }
        public Builder certFile(@Nullable Output<String> certFile) {
            this.certFile = certFile;
            return this;
        }
        public Builder certFile(@Nullable String certFile) {
            this.certFile = Codegen.ofNullable(certFile);
            return this;
        }
        public Builder keyFile(@Nullable Output<String> keyFile) {
            this.keyFile = keyFile;
            return this;
        }
        public Builder keyFile(@Nullable String keyFile) {
            this.keyFile = Codegen.ofNullable(keyFile);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = Codegen.secret(password);
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.secret(password);
            return this;
        }
        public Builder repo(@Nullable Output<String> repo) {
            this.repo = repo;
            return this;
        }
        public Builder repo(@Nullable String repo) {
            this.repo = Codegen.ofNullable(repo);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public RepositoryOptsArgs build() {
            return new RepositoryOptsArgs(caFile, certFile, keyFile, password, repo, username);
        }
    }
}

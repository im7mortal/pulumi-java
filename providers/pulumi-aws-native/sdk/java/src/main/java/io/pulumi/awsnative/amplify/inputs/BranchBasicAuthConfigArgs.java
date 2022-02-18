// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BranchBasicAuthConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final BranchBasicAuthConfigArgs Empty = new BranchBasicAuthConfigArgs();

    @InputImport(name="enableBasicAuth")
    private final @Nullable Input<Boolean> enableBasicAuth;

    public Input<Boolean> getEnableBasicAuth() {
        return this.enableBasicAuth == null ? Input.empty() : this.enableBasicAuth;
    }

    @InputImport(name="password", required=true)
    private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public BranchBasicAuthConfigArgs(
        @Nullable Input<Boolean> enableBasicAuth,
        Input<String> password,
        Input<String> username) {
        this.enableBasicAuth = enableBasicAuth;
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private BranchBasicAuthConfigArgs() {
        this.enableBasicAuth = Input.empty();
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BranchBasicAuthConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableBasicAuth;
        private Input<String> password;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(BranchBasicAuthConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableBasicAuth = defaults.enableBasicAuth;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setEnableBasicAuth(@Nullable Input<Boolean> enableBasicAuth) {
            this.enableBasicAuth = enableBasicAuth;
            return this;
        }

        public Builder setEnableBasicAuth(@Nullable Boolean enableBasicAuth) {
            this.enableBasicAuth = Input.ofNullable(enableBasicAuth);
            return this;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }

        public BranchBasicAuthConfigArgs build() {
            return new BranchBasicAuthConfigArgs(enableBasicAuth, password, username);
        }
    }
}
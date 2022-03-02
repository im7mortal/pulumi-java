// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceCredentialsCredentialPair {
    /**
     * Password, maximum length of 1024 characters.
     * 
     */
    private final String password;
    /**
     * User name, maximum length of 64 characters.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"password","username"})
    private DataSourceCredentialsCredentialPair(
        String password,
        String username) {
        this.password = Objects.requireNonNull(password);
        this.username = Objects.requireNonNull(username);
    }

    /**
     * Password, maximum length of 1024 characters.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * User name, maximum length of 64 characters.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceCredentialsCredentialPair defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceCredentialsCredentialPair defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public DataSourceCredentialsCredentialPair build() {
            return new DataSourceCredentialsCredentialPair(password, username);
        }
    }
}

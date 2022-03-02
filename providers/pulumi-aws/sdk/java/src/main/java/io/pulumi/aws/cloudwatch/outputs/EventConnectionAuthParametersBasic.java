// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EventConnectionAuthParametersBasic {
    /**
     * A password for the authorization. Created and stored in AWS Secrets Manager.
     * 
     */
    private final String password;
    /**
     * A username for the authorization.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"password","username"})
    private EventConnectionAuthParametersBasic(
        String password,
        String username) {
        this.password = Objects.requireNonNull(password);
        this.username = Objects.requireNonNull(username);
    }

    /**
     * A password for the authorization. Created and stored in AWS Secrets Manager.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * A username for the authorization.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersBasic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersBasic defaults) {
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
        public EventConnectionAuthParametersBasic build() {
            return new EventConnectionAuthParametersBasic(password, username);
        }
    }
}

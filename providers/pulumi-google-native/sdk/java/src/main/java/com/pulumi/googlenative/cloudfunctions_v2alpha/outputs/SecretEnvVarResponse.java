// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v2alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecretEnvVarResponse {
    /**
     * @return Name of the environment variable.
     * 
     */
    private final String key;
    /**
     * @return Project identifier (preferably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
     * 
     */
    private final String project;
    /**
     * @return Name of the secret in secret manager (not the full resource name).
     * 
     */
    private final String secret;
    /**
     * @return Version of the secret (version number or the string &#39;latest&#39;). It is recommended to use a numeric version for secret environment variables as any updates to the secret value is not reflected until new instances start.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private SecretEnvVarResponse(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("secret") String secret,
        @CustomType.Parameter("version") String version) {
        this.key = key;
        this.project = project;
        this.secret = secret;
        this.version = version;
    }

    /**
     * @return Name of the environment variable.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Project identifier (preferably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Name of the secret in secret manager (not the full resource name).
     * 
     */
    public String secret() {
        return this.secret;
    }
    /**
     * @return Version of the secret (version number or the string &#39;latest&#39;). It is recommended to use a numeric version for secret environment variables as any updates to the secret value is not reflected until new instances start.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretEnvVarResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String project;
        private String secret;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretEnvVarResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.version = defaults.version;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public SecretEnvVarResponse build() {
            return new SecretEnvVarResponse(key, project, secret, version);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetEventConnectionResult {
    /**
     * The ARN (Amazon Resource Name) for the connection.
     * 
     */
    private final String arn;
    /**
     * The type of authorization to use to connect. One of `API_KEY`,`BASIC`,`OAUTH_CLIENT_CREDENTIALS`.
     * 
     */
    private final String authorizationType;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The name of the connection.
     * 
     */
    private final String name;
    /**
     * The ARN (Amazon Resource Name) for the secret created from the authorization parameters specified for the connection.
     * 
     */
    private final String secretArn;

    @OutputCustomType.Constructor({"arn","authorizationType","id","name","secretArn"})
    private GetEventConnectionResult(
        String arn,
        String authorizationType,
        String id,
        String name,
        String secretArn) {
        this.arn = Objects.requireNonNull(arn);
        this.authorizationType = Objects.requireNonNull(authorizationType);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.secretArn = Objects.requireNonNull(secretArn);
    }

    /**
     * The ARN (Amazon Resource Name) for the connection.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The type of authorization to use to connect. One of `API_KEY`,`BASIC`,`OAUTH_CLIENT_CREDENTIALS`.
     * 
    */
    public String getAuthorizationType() {
        return this.authorizationType;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the connection.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The ARN (Amazon Resource Name) for the secret created from the authorization parameters specified for the connection.
     * 
    */
    public String getSecretArn() {
        return this.secretArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String authorizationType;
        private String id;
        private String name;
        private String secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authorizationType = defaults.authorizationType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAuthorizationType(String authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }
        public GetEventConnectionResult build() {
            return new GetEventConnectionResult(arn, authorizationType, id, name, secretArn);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetEmailIdentityResult {
    /**
     * The ARN of the email identity.
     * 
     */
    private final String arn;
    /**
     * The email identity.
     * 
     */
    private final String email;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"arn","email","id"})
    private GetEmailIdentityResult(
        String arn,
        String email,
        String id) {
        this.arn = Objects.requireNonNull(arn);
        this.email = Objects.requireNonNull(email);
        this.id = Objects.requireNonNull(id);
    }

    /**
     * The ARN of the email identity.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The email identity.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEmailIdentityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String email;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEmailIdentityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetEmailIdentityResult build() {
            return new GetEmailIdentityResult(arn, email, id);
        }
    }
}

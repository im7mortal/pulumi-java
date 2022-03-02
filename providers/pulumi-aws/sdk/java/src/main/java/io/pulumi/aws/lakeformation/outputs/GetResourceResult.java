// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetResourceResult {
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private final String lastModified;
    /**
     * Role that the resource was registered with.
     * 
     */
    private final String roleArn;

    @OutputCustomType.Constructor({"arn","id","lastModified","roleArn"})
    private GetResourceResult(
        String arn,
        String id,
        String lastModified,
        String roleArn) {
        this.arn = Objects.requireNonNull(arn);
        this.id = Objects.requireNonNull(id);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.roleArn = Objects.requireNonNull(roleArn);
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * Role that the resource was registered with.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String lastModified;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public GetResourceResult build() {
            return new GetResourceResult(arn, id, lastModified, roleArn);
        }
    }
}

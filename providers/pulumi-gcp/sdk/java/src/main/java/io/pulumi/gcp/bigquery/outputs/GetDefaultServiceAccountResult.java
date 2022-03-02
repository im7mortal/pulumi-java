// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDefaultServiceAccountResult {
    /**
     * The email address of the service account. This value is often used to refer to the service account
     * in order to grant IAM permissions.
     * 
     */
    private final String email;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String project;

    @OutputCustomType.Constructor({"email","id","project"})
    private GetDefaultServiceAccountResult(
        String email,
        String id,
        String project) {
        this.email = Objects.requireNonNull(email);
        this.id = Objects.requireNonNull(id);
        this.project = Objects.requireNonNull(project);
    }

    /**
     * The email address of the service account. This value is often used to refer to the service account
     * in order to grant IAM permissions.
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
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultServiceAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String id;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.project = defaults.project;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public GetDefaultServiceAccountResult build() {
            return new GetDefaultServiceAccountResult(email, id, project);
        }
    }
}

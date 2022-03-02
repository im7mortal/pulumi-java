// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceReferenceResponse {
    /**
     * The name of the Cloud SQL instance being referenced. This does not include the project ID.
     * 
     */
    private final String name;
    /**
     * The project ID of the Cloud SQL instance being referenced. The default is the same project ID as the instance references it.
     * 
     */
    private final String project;
    /**
     * The region of the Cloud SQL instance being referenced.
     * 
     */
    private final String region;

    @OutputCustomType.Constructor({"name","project","region"})
    private InstanceReferenceResponse(
        String name,
        String project,
        String region) {
        this.name = Objects.requireNonNull(name);
        this.project = Objects.requireNonNull(project);
        this.region = Objects.requireNonNull(region);
    }

    /**
     * The name of the Cloud SQL instance being referenced. This does not include the project ID.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The project ID of the Cloud SQL instance being referenced. The default is the same project ID as the instance references it.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * The region of the Cloud SQL instance being referenced.
     * 
    */
    public String getRegion() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public InstanceReferenceResponse build() {
            return new InstanceReferenceResponse(name, project, region);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firebase.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetWebAppResult {
    private final String appId;
    private final String displayName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String project;

    @OutputCustomType.Constructor({"appId","displayName","id","name","project"})
    private GetWebAppResult(
        String appId,
        String displayName,
        String id,
        String name,
        String project) {
        this.appId = Objects.requireNonNull(appId);
        this.displayName = Objects.requireNonNull(displayName);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.project = Objects.requireNonNull(project);
    }

    public String getAppId() {
        return this.appId;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String displayName;
        private String id;
        private String name;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setAppId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
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

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public GetWebAppResult build() {
            return new GetWebAppResult(appId, displayName, id, name, project);
        }
    }
}

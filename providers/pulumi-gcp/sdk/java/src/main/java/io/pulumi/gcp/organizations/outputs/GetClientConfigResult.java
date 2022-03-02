// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClientConfigResult {
    /**
     * The OAuth2 access token used by the client to authenticate against the Google Cloud API.
     * 
     */
    private final String accessToken;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The ID of the project to apply any resources to.
     * 
     */
    private final String project;
    /**
     * The region to operate under.
     * 
     */
    private final String region;
    /**
     * The zone to operate under.
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor({"accessToken","id","project","region","zone"})
    private GetClientConfigResult(
        String accessToken,
        String id,
        String project,
        String region,
        String zone) {
        this.accessToken = Objects.requireNonNull(accessToken);
        this.id = Objects.requireNonNull(id);
        this.project = Objects.requireNonNull(project);
        this.region = Objects.requireNonNull(region);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * The OAuth2 access token used by the client to authenticate against the Google Cloud API.
     * 
    */
    public String getAccessToken() {
        return this.accessToken;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The ID of the project to apply any resources to.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * The region to operate under.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * The zone to operate under.
     * 
    */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessToken;
        private String id;
        private String project;
        private String region;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.id = defaults.id;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.zone = defaults.zone;
        }

        public Builder setAccessToken(String accessToken) {
            this.accessToken = Objects.requireNonNull(accessToken);
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

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetClientConfigResult build() {
            return new GetClientConfigResult(accessToken, id, project, region, zone);
        }
    }
}

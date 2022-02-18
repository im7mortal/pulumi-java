// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emr.outputs;

import io.pulumi.awsnative.emr.outputs.StudioTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStudioResult {
    /**
     * The Amazon Resource Name (ARN) of the EMR Studio.
     * 
     */
    private final @Nullable String arn;
    /**
     * The default Amazon S3 location to back up EMR Studio Workspaces and notebook files. A Studio user can select an alternative Amazon S3 location when creating a Workspace.
     * 
     */
    private final @Nullable String defaultS3Location;
    /**
     * A detailed description of the Studio.
     * 
     */
    private final @Nullable String description;
    /**
     * Your identity provider's authentication endpoint. Amazon EMR Studio redirects federated users to this endpoint for authentication when logging in to a Studio with the Studio URL.
     * 
     */
    private final @Nullable String idpAuthUrl;
    /**
     * The name of relay state parameter for external Identity Provider.
     * 
     */
    private final @Nullable String idpRelayStateParameterName;
    /**
     * A descriptive name for the Amazon EMR Studio.
     * 
     */
    private final @Nullable String name;
    /**
     * The ID of the EMR Studio.
     * 
     */
    private final @Nullable String studioId;
    /**
     * A list of up to 5 subnet IDs to associate with the Studio. The subnets must belong to the VPC specified by VpcId. Studio users can create a Workspace in any of the specified subnets.
     * 
     */
    private final @Nullable List<String> subnetIds;
    /**
     * A list of tags to associate with the Studio. Tags are user-defined key-value pairs that consist of a required key string with a maximum of 128 characters, and an optional value string with a maximum of 256 characters.
     * 
     */
    private final @Nullable List<StudioTag> tags;
    /**
     * The unique Studio access URL.
     * 
     */
    private final @Nullable String url;

    @OutputCustomType.Constructor({"arn","defaultS3Location","description","idpAuthUrl","idpRelayStateParameterName","name","studioId","subnetIds","tags","url"})
    private GetStudioResult(
        @Nullable String arn,
        @Nullable String defaultS3Location,
        @Nullable String description,
        @Nullable String idpAuthUrl,
        @Nullable String idpRelayStateParameterName,
        @Nullable String name,
        @Nullable String studioId,
        @Nullable List<String> subnetIds,
        @Nullable List<StudioTag> tags,
        @Nullable String url) {
        this.arn = arn;
        this.defaultS3Location = defaultS3Location;
        this.description = description;
        this.idpAuthUrl = idpAuthUrl;
        this.idpRelayStateParameterName = idpRelayStateParameterName;
        this.name = name;
        this.studioId = studioId;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.url = url;
    }

    /**
     * The Amazon Resource Name (ARN) of the EMR Studio.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The default Amazon S3 location to back up EMR Studio Workspaces and notebook files. A Studio user can select an alternative Amazon S3 location when creating a Workspace.
     * 
     */
    public Optional<String> getDefaultS3Location() {
        return Optional.ofNullable(this.defaultS3Location);
    }
    /**
     * A detailed description of the Studio.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Your identity provider's authentication endpoint. Amazon EMR Studio redirects federated users to this endpoint for authentication when logging in to a Studio with the Studio URL.
     * 
     */
    public Optional<String> getIdpAuthUrl() {
        return Optional.ofNullable(this.idpAuthUrl);
    }
    /**
     * The name of relay state parameter for external Identity Provider.
     * 
     */
    public Optional<String> getIdpRelayStateParameterName() {
        return Optional.ofNullable(this.idpRelayStateParameterName);
    }
    /**
     * A descriptive name for the Amazon EMR Studio.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The ID of the EMR Studio.
     * 
     */
    public Optional<String> getStudioId() {
        return Optional.ofNullable(this.studioId);
    }
    /**
     * A list of up to 5 subnet IDs to associate with the Studio. The subnets must belong to the VPC specified by VpcId. Studio users can create a Workspace in any of the specified subnets.
     * 
     */
    public List<String> getSubnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }
    /**
     * A list of tags to associate with the Studio. Tags are user-defined key-value pairs that consist of a required key string with a maximum of 128 characters, and an optional value string with a maximum of 256 characters.
     * 
     */
    public List<StudioTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The unique Studio access URL.
     * 
     */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStudioResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String defaultS3Location;
        private @Nullable String description;
        private @Nullable String idpAuthUrl;
        private @Nullable String idpRelayStateParameterName;
        private @Nullable String name;
        private @Nullable String studioId;
        private @Nullable List<String> subnetIds;
        private @Nullable List<StudioTag> tags;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStudioResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultS3Location = defaults.defaultS3Location;
    	      this.description = defaults.description;
    	      this.idpAuthUrl = defaults.idpAuthUrl;
    	      this.idpRelayStateParameterName = defaults.idpRelayStateParameterName;
    	      this.name = defaults.name;
    	      this.studioId = defaults.studioId;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.url = defaults.url;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDefaultS3Location(@Nullable String defaultS3Location) {
            this.defaultS3Location = defaultS3Location;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIdpAuthUrl(@Nullable String idpAuthUrl) {
            this.idpAuthUrl = idpAuthUrl;
            return this;
        }

        public Builder setIdpRelayStateParameterName(@Nullable String idpRelayStateParameterName) {
            this.idpRelayStateParameterName = idpRelayStateParameterName;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStudioId(@Nullable String studioId) {
            this.studioId = studioId;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setTags(@Nullable List<StudioTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public GetStudioResult build() {
            return new GetStudioResult(arn, defaultS3Location, description, idpAuthUrl, idpRelayStateParameterName, name, studioId, subnetIds, tags, url);
        }
    }
}

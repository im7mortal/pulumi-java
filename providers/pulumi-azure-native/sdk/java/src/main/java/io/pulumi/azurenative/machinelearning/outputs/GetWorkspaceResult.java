// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkspaceResult {
    private final String creationTime;
    private final String id;
    private final @Nullable String keyVaultIdentifierId;
    private final String location;
    private final String name;
    private final String ownerEmail;
    private final String studioEndpoint;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final String userStorageAccountId;
    private final String workspaceId;
    private final String workspaceState;
    private final String workspaceType;

    @OutputCustomType.Constructor({"creationTime","id","keyVaultIdentifierId","location","name","ownerEmail","studioEndpoint","tags","type","userStorageAccountId","workspaceId","workspaceState","workspaceType"})
    private GetWorkspaceResult(
        String creationTime,
        String id,
        @Nullable String keyVaultIdentifierId,
        String location,
        String name,
        String ownerEmail,
        String studioEndpoint,
        @Nullable Map<String,String> tags,
        String type,
        String userStorageAccountId,
        String workspaceId,
        String workspaceState,
        String workspaceType) {
        this.creationTime = Objects.requireNonNull(creationTime);
        this.id = Objects.requireNonNull(id);
        this.keyVaultIdentifierId = keyVaultIdentifierId;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.ownerEmail = Objects.requireNonNull(ownerEmail);
        this.studioEndpoint = Objects.requireNonNull(studioEndpoint);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.userStorageAccountId = Objects.requireNonNull(userStorageAccountId);
        this.workspaceId = Objects.requireNonNull(workspaceId);
        this.workspaceState = Objects.requireNonNull(workspaceState);
        this.workspaceType = Objects.requireNonNull(workspaceType);
    }

    public String getCreationTime() {
        return this.creationTime;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getKeyVaultIdentifierId() {
        return Optional.ofNullable(this.keyVaultIdentifierId);
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getOwnerEmail() {
        return this.ownerEmail;
    }
    public String getStudioEndpoint() {
        return this.studioEndpoint;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public String getUserStorageAccountId() {
        return this.userStorageAccountId;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }
    public String getWorkspaceState() {
        return this.workspaceState;
    }
    public String getWorkspaceType() {
        return this.workspaceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private String id;
        private @Nullable String keyVaultIdentifierId;
        private String location;
        private String name;
        private String ownerEmail;
        private String studioEndpoint;
        private @Nullable Map<String,String> tags;
        private String type;
        private String userStorageAccountId;
        private String workspaceId;
        private String workspaceState;
        private String workspaceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.id = defaults.id;
    	      this.keyVaultIdentifierId = defaults.keyVaultIdentifierId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.ownerEmail = defaults.ownerEmail;
    	      this.studioEndpoint = defaults.studioEndpoint;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userStorageAccountId = defaults.userStorageAccountId;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceState = defaults.workspaceState;
    	      this.workspaceType = defaults.workspaceType;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyVaultIdentifierId(@Nullable String keyVaultIdentifierId) {
            this.keyVaultIdentifierId = keyVaultIdentifierId;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOwnerEmail(String ownerEmail) {
            this.ownerEmail = Objects.requireNonNull(ownerEmail);
            return this;
        }

        public Builder setStudioEndpoint(String studioEndpoint) {
            this.studioEndpoint = Objects.requireNonNull(studioEndpoint);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserStorageAccountId(String userStorageAccountId) {
            this.userStorageAccountId = Objects.requireNonNull(userStorageAccountId);
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder setWorkspaceState(String workspaceState) {
            this.workspaceState = Objects.requireNonNull(workspaceState);
            return this;
        }

        public Builder setWorkspaceType(String workspaceType) {
            this.workspaceType = Objects.requireNonNull(workspaceType);
            return this;
        }

        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(creationTime, id, keyVaultIdentifierId, location, name, ownerEmail, studioEndpoint, tags, type, userStorageAccountId, workspaceId, workspaceState, workspaceType);
        }
    }
}
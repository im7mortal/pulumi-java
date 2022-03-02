// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.IdentityResponse;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccountResult {
    /**
     * Time at which the account was created.
     * 
     */
    private final String createdAt;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Identity Info on the Account
     * 
     */
    private final IdentityResponse identity;
    /**
     * Location of the azure resource.
     * 
     */
    private final @Nullable String location;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Provisioning state of the Account
     * 
     */
    private final String provisioningState;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Tags on the azure resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;
    /**
     * Email of the user who created the resource
     * 
     */
    private final String userEmail;
    /**
     * Name of the user who created the resource
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"createdAt","id","identity","location","name","provisioningState","systemData","tags","type","userEmail","userName"})
    private GetAccountResult(
        String createdAt,
        String id,
        IdentityResponse identity,
        @Nullable String location,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type,
        String userEmail,
        String userName) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.id = Objects.requireNonNull(id);
        this.identity = Objects.requireNonNull(identity);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.userEmail = Objects.requireNonNull(userEmail);
        this.userName = Objects.requireNonNull(userName);
    }

    /**
     * Time at which the account was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identity Info on the Account
     * 
    */
    public IdentityResponse getIdentity() {
        return this.identity;
    }
    /**
     * Location of the azure resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the Account
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Tags on the azure resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Email of the user who created the resource
     * 
    */
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Name of the user who created the resource
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private IdentityResponse identity;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private String userEmail;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userEmail = defaults.userEmail;
    	      this.userName = defaults.userName;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(IdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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

        public Builder setUserEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetAccountResult build() {
            return new GetAccountResult(createdAt, id, identity, location, name, provisioningState, systemData, tags, type, userEmail, userName);
        }
    }
}

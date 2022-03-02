// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.identitystore.outputs;

import io.pulumi.aws.identitystore.outputs.GetGroupFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetGroupResult {
    /**
     * The group's display name value.
     * 
     */
    private final String displayName;
    private final List<GetGroupFilter> filters;
    private final String groupId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String identityStoreId;

    @OutputCustomType.Constructor({"displayName","filters","groupId","id","identityStoreId"})
    private GetGroupResult(
        String displayName,
        List<GetGroupFilter> filters,
        String groupId,
        String id,
        String identityStoreId) {
        this.displayName = Objects.requireNonNull(displayName);
        this.filters = Objects.requireNonNull(filters);
        this.groupId = Objects.requireNonNull(groupId);
        this.id = Objects.requireNonNull(id);
        this.identityStoreId = Objects.requireNonNull(identityStoreId);
    }

    /**
     * The group's display name value.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    public List<GetGroupFilter> getFilters() {
        return this.filters;
    }
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private List<GetGroupFilter> filters;
        private String groupId;
        private String id;
        private String identityStoreId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.identityStoreId = defaults.identityStoreId;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFilters(List<GetGroupFilter> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }

        public Builder setGroupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentityStoreId(String identityStoreId) {
            this.identityStoreId = Objects.requireNonNull(identityStoreId);
            return this;
        }
        public GetGroupResult build() {
            return new GetGroupResult(displayName, filters, groupId, id, identityStoreId);
        }
    }
}

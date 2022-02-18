// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetGroupMembershipsMembershipMemberKey {
    /**
     * The ID of the entity. For Google-managed entities, the id is the email address of an existing
     * group or user. For external-identity-mapped entities, the id is a string conforming
     * to the Identity Source's requirements.
     * 
     */
    private final String id;
    /**
     * The namespace in which the entity exists.
     * If not populated, the EntityKey represents a Google-managed entity
     * such as a Google user or a Google Group.
     * If populated, the EntityKey represents an external-identity-mapped group.
     * 
     */
    private final String namespace;

    @OutputCustomType.Constructor({"id","namespace"})
    private GetGroupMembershipsMembershipMemberKey(
        String id,
        String namespace) {
        this.id = Objects.requireNonNull(id);
        this.namespace = Objects.requireNonNull(namespace);
    }

    /**
     * The ID of the entity. For Google-managed entities, the id is the email address of an existing
     * group or user. For external-identity-mapped entities, the id is a string conforming
     * to the Identity Source's requirements.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The namespace in which the entity exists.
     * If not populated, the EntityKey represents a Google-managed entity
     * such as a Google user or a Google Group.
     * If populated, the EntityKey represents an external-identity-mapped group.
     * 
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupMembershipsMembershipMemberKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupMembershipsMembershipMemberKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public GetGroupMembershipsMembershipMemberKey build() {
            return new GetGroupMembershipsMembershipMemberKey(id, namespace);
        }
    }
}
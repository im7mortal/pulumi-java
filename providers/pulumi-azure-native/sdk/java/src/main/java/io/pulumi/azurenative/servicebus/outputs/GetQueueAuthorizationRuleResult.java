// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetQueueAuthorizationRuleResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The rights associated with the rule.
     * 
     */
    private final List<String> rights;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","rights","type"})
    private GetQueueAuthorizationRuleResult(
        String id,
        String name,
        List<String> rights,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.rights = Objects.requireNonNull(rights);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The rights associated with the rule.
     * 
    */
    public List<String> getRights() {
        return this.rights;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueAuthorizationRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private List<String> rights;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueAuthorizationRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rights = defaults.rights;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRights(List<String> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetQueueAuthorizationRuleResult build() {
            return new GetQueueAuthorizationRuleResult(id, name, rights, type);
        }
    }
}

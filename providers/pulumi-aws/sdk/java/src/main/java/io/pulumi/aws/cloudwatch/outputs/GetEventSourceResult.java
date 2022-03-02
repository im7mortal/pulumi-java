// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEventSourceResult {
    /**
     * The ARN of the partner event source
     * 
     */
    private final String arn;
    /**
     * The name of the SaaS partner that created the event source
     * 
     */
    private final String createdBy;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The name of the event source
     * 
     */
    private final String name;
    private final @Nullable String namePrefix;
    /**
     * The state of the event source (`ACTIVE` or `PENDING`)
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"arn","createdBy","id","name","namePrefix","state"})
    private GetEventSourceResult(
        String arn,
        String createdBy,
        String id,
        String name,
        @Nullable String namePrefix,
        String state) {
        this.arn = Objects.requireNonNull(arn);
        this.createdBy = Objects.requireNonNull(createdBy);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.namePrefix = namePrefix;
        this.state = Objects.requireNonNull(state);
    }

    /**
     * The ARN of the partner event source
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The name of the SaaS partner that created the event source
     * 
    */
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the event source
     * 
    */
    public String getName() {
        return this.name;
    }
    public Optional<String> getNamePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }
    /**
     * The state of the event source (`ACTIVE` or `PENDING`)
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String createdBy;
        private String id;
        private String name;
        private @Nullable String namePrefix;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdBy = defaults.createdBy;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.state = defaults.state;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCreatedBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
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

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetEventSourceResult build() {
            return new GetEventSourceResult(arn, createdBy, id, name, namePrefix, state);
        }
    }
}

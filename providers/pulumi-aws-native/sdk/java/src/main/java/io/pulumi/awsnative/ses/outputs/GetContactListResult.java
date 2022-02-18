// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses.outputs;

import io.pulumi.awsnative.ses.outputs.ContactListTag;
import io.pulumi.awsnative.ses.outputs.ContactListTopic;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContactListResult {
    /**
     * The description of the contact list.
     * 
     */
    private final @Nullable String description;
    /**
     * The tags (keys and values) associated with the contact list.
     * 
     */
    private final @Nullable List<ContactListTag> tags;
    /**
     * The topics associated with the contact list.
     * 
     */
    private final @Nullable List<ContactListTopic> topics;

    @OutputCustomType.Constructor({"description","tags","topics"})
    private GetContactListResult(
        @Nullable String description,
        @Nullable List<ContactListTag> tags,
        @Nullable List<ContactListTopic> topics) {
        this.description = description;
        this.tags = tags;
        this.topics = topics;
    }

    /**
     * The description of the contact list.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The tags (keys and values) associated with the contact list.
     * 
     */
    public List<ContactListTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The topics associated with the contact list.
     * 
     */
    public List<ContactListTopic> getTopics() {
        return this.topics == null ? List.of() : this.topics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactListResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<ContactListTag> tags;
        private @Nullable List<ContactListTopic> topics;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.tags = defaults.tags;
    	      this.topics = defaults.topics;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setTags(@Nullable List<ContactListTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTopics(@Nullable List<ContactListTopic> topics) {
            this.topics = topics;
            return this;
        }

        public GetContactListResult build() {
            return new GetContactListResult(description, tags, topics);
        }
    }
}

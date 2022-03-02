// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketIntelligentTieringConfigurationFilter {
    /**
     * An object key name prefix that identifies the subset of objects to which the configuration applies.
     * 
     */
    private final @Nullable String prefix;
    /**
     * All of these tags must exist in the object's tag set in order for the configuration to apply.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @OutputCustomType.Constructor({"prefix","tags"})
    private BucketIntelligentTieringConfigurationFilter(
        @Nullable String prefix,
        @Nullable Map<String,String> tags) {
        this.prefix = prefix;
        this.tags = tags;
    }

    /**
     * An object key name prefix that identifies the subset of objects to which the configuration applies.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * All of these tags must exist in the object's tag set in order for the configuration to apply.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIntelligentTieringConfigurationFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String prefix;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIntelligentTieringConfigurationFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public BucketIntelligentTieringConfigurationFilter build() {
            return new BucketIntelligentTieringConfigurationFilter(prefix, tags);
        }
    }
}

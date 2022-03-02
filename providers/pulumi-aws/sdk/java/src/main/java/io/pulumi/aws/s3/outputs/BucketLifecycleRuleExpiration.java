// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketLifecycleRuleExpiration {
    /**
     * Specifies the date after which you want the corresponding action to take effect.
     * 
     */
    private final @Nullable String date;
    /**
     * Specifies the number of days after object creation when the specific rule action takes effect.
     * 
     */
    private final @Nullable Integer days;
    /**
     * On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
     * 
     */
    private final @Nullable Boolean expiredObjectDeleteMarker;

    @OutputCustomType.Constructor({"date","days","expiredObjectDeleteMarker"})
    private BucketLifecycleRuleExpiration(
        @Nullable String date,
        @Nullable Integer days,
        @Nullable Boolean expiredObjectDeleteMarker) {
        this.date = date;
        this.days = days;
        this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
    }

    /**
     * Specifies the date after which you want the corresponding action to take effect.
     * 
    */
    public Optional<String> getDate() {
        return Optional.ofNullable(this.date);
    }
    /**
     * Specifies the number of days after object creation when the specific rule action takes effect.
     * 
    */
    public Optional<Integer> getDays() {
        return Optional.ofNullable(this.days);
    }
    /**
     * On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
     * 
    */
    public Optional<Boolean> getExpiredObjectDeleteMarker() {
        return Optional.ofNullable(this.expiredObjectDeleteMarker);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleExpiration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String date;
        private @Nullable Integer days;
        private @Nullable Boolean expiredObjectDeleteMarker;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleExpiration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.days = defaults.days;
    	      this.expiredObjectDeleteMarker = defaults.expiredObjectDeleteMarker;
        }

        public Builder setDate(@Nullable String date) {
            this.date = date;
            return this;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = days;
            return this;
        }

        public Builder setExpiredObjectDeleteMarker(@Nullable Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }
        public BucketLifecycleRuleExpiration build() {
            return new BucketLifecycleRuleExpiration(date, days, expiredObjectDeleteMarker);
        }
    }
}

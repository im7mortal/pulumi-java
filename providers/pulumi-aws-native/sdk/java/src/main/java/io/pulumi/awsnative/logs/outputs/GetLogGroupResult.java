// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs.outputs;

import io.pulumi.awsnative.logs.outputs.LogGroupTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLogGroupResult {
    /**
     * The CloudWatch log group ARN.
     * 
     */
    private final @Nullable String arn;
    /**
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * The number of days to retain the log events in the specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
     * 
     */
    private final @Nullable Integer retentionInDays;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<LogGroupTag> tags;

    @OutputCustomType.Constructor({"arn","kmsKeyId","retentionInDays","tags"})
    private GetLogGroupResult(
        @Nullable String arn,
        @Nullable String kmsKeyId,
        @Nullable Integer retentionInDays,
        @Nullable List<LogGroupTag> tags) {
        this.arn = arn;
        this.kmsKeyId = kmsKeyId;
        this.retentionInDays = retentionInDays;
        this.tags = tags;
    }

    /**
     * The CloudWatch log group ARN.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data.
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * The number of days to retain the log events in the specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
     * 
    */
    public Optional<Integer> getRetentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<LogGroupTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String kmsKeyId;
        private @Nullable Integer retentionInDays;
        private @Nullable List<LogGroupTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setRetentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder setTags(@Nullable List<LogGroupTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetLogGroupResult build() {
            return new GetLogGroupResult(arn, kmsKeyId, retentionInDays, tags);
        }
    }
}

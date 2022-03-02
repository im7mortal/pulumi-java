// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TransferJobTransferSpecObjectConditions {
    /**
     * `exclude_prefixes` must follow the requirements described for `include_prefixes`. See [Requirements](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/TransferSpec#ObjectConditions).
     * 
     */
    private final @Nullable List<String> excludePrefixes;
    /**
     * If `include_prefixes` is specified, objects that satisfy the object conditions must have names that start with one of the `include_prefixes` and that do not start with any of the `exclude_prefixes`. If `include_prefixes` is not specified, all objects except those that have names starting with one of the `exclude_prefixes` must satisfy the object conditions. See [Requirements](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/TransferSpec#ObjectConditions).
     * 
     */
    private final @Nullable List<String> includePrefixes;
    /**
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String maxTimeElapsedSinceLastModification;
    /**
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String minTimeElapsedSinceLastModification;

    @OutputCustomType.Constructor({"excludePrefixes","includePrefixes","maxTimeElapsedSinceLastModification","minTimeElapsedSinceLastModification"})
    private TransferJobTransferSpecObjectConditions(
        @Nullable List<String> excludePrefixes,
        @Nullable List<String> includePrefixes,
        @Nullable String maxTimeElapsedSinceLastModification,
        @Nullable String minTimeElapsedSinceLastModification) {
        this.excludePrefixes = excludePrefixes;
        this.includePrefixes = includePrefixes;
        this.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
        this.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
    }

    /**
     * `exclude_prefixes` must follow the requirements described for `include_prefixes`. See [Requirements](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/TransferSpec#ObjectConditions).
     * 
    */
    public List<String> getExcludePrefixes() {
        return this.excludePrefixes == null ? List.of() : this.excludePrefixes;
    }
    /**
     * If `include_prefixes` is specified, objects that satisfy the object conditions must have names that start with one of the `include_prefixes` and that do not start with any of the `exclude_prefixes`. If `include_prefixes` is not specified, all objects except those that have names starting with one of the `exclude_prefixes` must satisfy the object conditions. See [Requirements](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/TransferSpec#ObjectConditions).
     * 
    */
    public List<String> getIncludePrefixes() {
        return this.includePrefixes == null ? List.of() : this.includePrefixes;
    }
    /**
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
    */
    public Optional<String> getMaxTimeElapsedSinceLastModification() {
        return Optional.ofNullable(this.maxTimeElapsedSinceLastModification);
    }
    /**
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
    */
    public Optional<String> getMinTimeElapsedSinceLastModification() {
        return Optional.ofNullable(this.minTimeElapsedSinceLastModification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecObjectConditions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludePrefixes;
        private @Nullable List<String> includePrefixes;
        private @Nullable String maxTimeElapsedSinceLastModification;
        private @Nullable String minTimeElapsedSinceLastModification;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecObjectConditions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludePrefixes = defaults.excludePrefixes;
    	      this.includePrefixes = defaults.includePrefixes;
    	      this.maxTimeElapsedSinceLastModification = defaults.maxTimeElapsedSinceLastModification;
    	      this.minTimeElapsedSinceLastModification = defaults.minTimeElapsedSinceLastModification;
        }

        public Builder setExcludePrefixes(@Nullable List<String> excludePrefixes) {
            this.excludePrefixes = excludePrefixes;
            return this;
        }

        public Builder setIncludePrefixes(@Nullable List<String> includePrefixes) {
            this.includePrefixes = includePrefixes;
            return this;
        }

        public Builder setMaxTimeElapsedSinceLastModification(@Nullable String maxTimeElapsedSinceLastModification) {
            this.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
            return this;
        }

        public Builder setMinTimeElapsedSinceLastModification(@Nullable String minTimeElapsedSinceLastModification) {
            this.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
            return this;
        }
        public TransferJobTransferSpecObjectConditions build() {
            return new TransferJobTransferSpecObjectConditions(excludePrefixes, includePrefixes, maxTimeElapsedSinceLastModification, minTimeElapsedSinceLastModification);
        }
    }
}

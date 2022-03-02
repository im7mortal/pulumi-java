// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ObjectConditionsResponse {
    /**
     * If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each exclude-prefix must start with the value of a path explicitly included by `include_prefixes`. The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
     * 
     */
    private final List<String> excludePrefixes;
    /**
     * If you specify `include_prefixes`, Storage Transfer Service uses the items in the `include_prefixes` array to determine which objects to include in a transfer. Objects must start with one of the matching `include_prefixes` for inclusion in the transfer. If exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes` specified for inclusion in the transfer. The following are requirements of `include_prefixes`: * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each include-prefix must omit the leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values can be empty, if specified. * Each include-prefix must include a distinct portion of the object namespace. No include-prefix may be a prefix of another include-prefix. The max size of `include_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
     * 
     */
    private final List<String> includePrefixes;
    /**
     * If specified, only objects with a "last modification time" before this timestamp and objects that don't have a "last modification time" are transferred.
     * 
     */
    private final String lastModifiedBefore;
    /**
     * If specified, only objects with a "last modification time" on or after this timestamp and objects that don't have a "last modification time" are transferred. The `last_modified_since` and `last_modified_before` fields can be used together for chunked data processing. For example, consider a script that processes each day's worth of data at a time. For that you'd set each of the fields as follows: * `last_modified_since` to the start of the day * `last_modified_before` to the end of the day
     * 
     */
    private final String lastModifiedSince;
    /**
     * Ensures that objects are not transferred if a specific maximum time has elapsed since the "last modification time". When a TransferOperation begins, objects with a "last modification time" are transferred only if the elapsed time between the start_time of the `TransferOperation`and the "last modification time" of the object is less than the value of max_time_elapsed_since_last_modification`. Objects that do not have a "last modification time" are also transferred.
     * 
     */
    private final String maxTimeElapsedSinceLastModification;
    /**
     * Ensures that objects are not transferred until a specific minimum time has elapsed after the "last modification time". When a TransferOperation begins, objects with a "last modification time" are transferred only if the elapsed time between the start_time of the `TransferOperation` and the "last modification time" of the object is equal to or greater than the value of min_time_elapsed_since_last_modification`. Objects that do not have a "last modification time" are also transferred.
     * 
     */
    private final String minTimeElapsedSinceLastModification;

    @OutputCustomType.Constructor({"excludePrefixes","includePrefixes","lastModifiedBefore","lastModifiedSince","maxTimeElapsedSinceLastModification","minTimeElapsedSinceLastModification"})
    private ObjectConditionsResponse(
        List<String> excludePrefixes,
        List<String> includePrefixes,
        String lastModifiedBefore,
        String lastModifiedSince,
        String maxTimeElapsedSinceLastModification,
        String minTimeElapsedSinceLastModification) {
        this.excludePrefixes = Objects.requireNonNull(excludePrefixes);
        this.includePrefixes = Objects.requireNonNull(includePrefixes);
        this.lastModifiedBefore = Objects.requireNonNull(lastModifiedBefore);
        this.lastModifiedSince = Objects.requireNonNull(lastModifiedSince);
        this.maxTimeElapsedSinceLastModification = Objects.requireNonNull(maxTimeElapsedSinceLastModification);
        this.minTimeElapsedSinceLastModification = Objects.requireNonNull(minTimeElapsedSinceLastModification);
    }

    /**
     * If you specify `exclude_prefixes`, Storage Transfer Service uses the items in the `exclude_prefixes` array to determine which objects to exclude from a transfer. Objects must not start with one of the matching `exclude_prefixes` for inclusion in a transfer. The following are requirements of `exclude_prefixes`: * Each exclude-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each exclude-prefix must omit the leading slash. For example, to exclude the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the exclude-prefix as `logs/y=2015/requests.gz`. * None of the exclude-prefix values can be empty, if specified. * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix may be a prefix of another exclude-prefix. * If include_prefixes is specified, then each exclude-prefix must start with the value of a path explicitly included by `include_prefixes`. The max size of `exclude_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
     * 
    */
    public List<String> getExcludePrefixes() {
        return this.excludePrefixes;
    }
    /**
     * If you specify `include_prefixes`, Storage Transfer Service uses the items in the `include_prefixes` array to determine which objects to include in a transfer. Objects must start with one of the matching `include_prefixes` for inclusion in the transfer. If exclude_prefixes is specified, objects must not start with any of the `exclude_prefixes` specified for inclusion in the transfer. The following are requirements of `include_prefixes`: * Each include-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each include-prefix must omit the leading slash. For example, to include the object `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include-prefix as `logs/y=2015/requests.gz`. * None of the include-prefix values can be empty, if specified. * Each include-prefix must include a distinct portion of the object namespace. No include-prefix may be a prefix of another include-prefix. The max size of `include_prefixes` is 1000. For more information, see [Filtering objects from transfers](/storage-transfer/docs/filtering-objects-from-transfers).
     * 
    */
    public List<String> getIncludePrefixes() {
        return this.includePrefixes;
    }
    /**
     * If specified, only objects with a "last modification time" before this timestamp and objects that don't have a "last modification time" are transferred.
     * 
    */
    public String getLastModifiedBefore() {
        return this.lastModifiedBefore;
    }
    /**
     * If specified, only objects with a "last modification time" on or after this timestamp and objects that don't have a "last modification time" are transferred. The `last_modified_since` and `last_modified_before` fields can be used together for chunked data processing. For example, consider a script that processes each day's worth of data at a time. For that you'd set each of the fields as follows: * `last_modified_since` to the start of the day * `last_modified_before` to the end of the day
     * 
    */
    public String getLastModifiedSince() {
        return this.lastModifiedSince;
    }
    /**
     * Ensures that objects are not transferred if a specific maximum time has elapsed since the "last modification time". When a TransferOperation begins, objects with a "last modification time" are transferred only if the elapsed time between the start_time of the `TransferOperation`and the "last modification time" of the object is less than the value of max_time_elapsed_since_last_modification`. Objects that do not have a "last modification time" are also transferred.
     * 
    */
    public String getMaxTimeElapsedSinceLastModification() {
        return this.maxTimeElapsedSinceLastModification;
    }
    /**
     * Ensures that objects are not transferred until a specific minimum time has elapsed after the "last modification time". When a TransferOperation begins, objects with a "last modification time" are transferred only if the elapsed time between the start_time of the `TransferOperation` and the "last modification time" of the object is equal to or greater than the value of min_time_elapsed_since_last_modification`. Objects that do not have a "last modification time" are also transferred.
     * 
    */
    public String getMinTimeElapsedSinceLastModification() {
        return this.minTimeElapsedSinceLastModification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectConditionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> excludePrefixes;
        private List<String> includePrefixes;
        private String lastModifiedBefore;
        private String lastModifiedSince;
        private String maxTimeElapsedSinceLastModification;
        private String minTimeElapsedSinceLastModification;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectConditionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludePrefixes = defaults.excludePrefixes;
    	      this.includePrefixes = defaults.includePrefixes;
    	      this.lastModifiedBefore = defaults.lastModifiedBefore;
    	      this.lastModifiedSince = defaults.lastModifiedSince;
    	      this.maxTimeElapsedSinceLastModification = defaults.maxTimeElapsedSinceLastModification;
    	      this.minTimeElapsedSinceLastModification = defaults.minTimeElapsedSinceLastModification;
        }

        public Builder setExcludePrefixes(List<String> excludePrefixes) {
            this.excludePrefixes = Objects.requireNonNull(excludePrefixes);
            return this;
        }

        public Builder setIncludePrefixes(List<String> includePrefixes) {
            this.includePrefixes = Objects.requireNonNull(includePrefixes);
            return this;
        }

        public Builder setLastModifiedBefore(String lastModifiedBefore) {
            this.lastModifiedBefore = Objects.requireNonNull(lastModifiedBefore);
            return this;
        }

        public Builder setLastModifiedSince(String lastModifiedSince) {
            this.lastModifiedSince = Objects.requireNonNull(lastModifiedSince);
            return this;
        }

        public Builder setMaxTimeElapsedSinceLastModification(String maxTimeElapsedSinceLastModification) {
            this.maxTimeElapsedSinceLastModification = Objects.requireNonNull(maxTimeElapsedSinceLastModification);
            return this;
        }

        public Builder setMinTimeElapsedSinceLastModification(String minTimeElapsedSinceLastModification) {
            this.minTimeElapsedSinceLastModification = Objects.requireNonNull(minTimeElapsedSinceLastModification);
            return this;
        }
        public ObjectConditionsResponse build() {
            return new ObjectConditionsResponse(excludePrefixes, includePrefixes, lastModifiedBefore, lastModifiedSince, maxTimeElapsedSinceLastModification, minTimeElapsedSinceLastModification);
        }
    }
}

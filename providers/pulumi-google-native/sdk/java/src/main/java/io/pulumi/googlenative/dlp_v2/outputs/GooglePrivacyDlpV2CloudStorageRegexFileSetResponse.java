// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2CloudStorageRegexFileSetResponse {
    /**
     * The name of a Cloud Storage bucket. Required.
     * 
     */
    private final String bucketName;
    /**
     * A list of regular expressions matching file paths to exclude. All files in the bucket that match at least one of these regular expressions will be excluded from the scan. Regular expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
     * 
     */
    private final List<String> excludeRegex;
    /**
     * A list of regular expressions matching file paths to include. All files in the bucket that match at least one of these regular expressions will be included in the set of files, except for those that also match an item in `exclude_regex`. Leaving this field empty will match all files by default (this is equivalent to including `.*` in the list). Regular expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
     * 
     */
    private final List<String> includeRegex;

    @OutputCustomType.Constructor({"bucketName","excludeRegex","includeRegex"})
    private GooglePrivacyDlpV2CloudStorageRegexFileSetResponse(
        String bucketName,
        List<String> excludeRegex,
        List<String> includeRegex) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.excludeRegex = Objects.requireNonNull(excludeRegex);
        this.includeRegex = Objects.requireNonNull(includeRegex);
    }

    /**
     * The name of a Cloud Storage bucket. Required.
     * 
    */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * A list of regular expressions matching file paths to exclude. All files in the bucket that match at least one of these regular expressions will be excluded from the scan. Regular expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
     * 
    */
    public List<String> getExcludeRegex() {
        return this.excludeRegex;
    }
    /**
     * A list of regular expressions matching file paths to include. All files in the bucket that match at least one of these regular expressions will be included in the set of files, except for those that also match an item in `exclude_regex`. Leaving this field empty will match all files by default (this is equivalent to including `.*` in the list). Regular expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
     * 
    */
    public List<String> getIncludeRegex() {
        return this.includeRegex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CloudStorageRegexFileSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private List<String> excludeRegex;
        private List<String> includeRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CloudStorageRegexFileSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.excludeRegex = defaults.excludeRegex;
    	      this.includeRegex = defaults.includeRegex;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setExcludeRegex(List<String> excludeRegex) {
            this.excludeRegex = Objects.requireNonNull(excludeRegex);
            return this;
        }

        public Builder setIncludeRegex(List<String> includeRegex) {
            this.includeRegex = Objects.requireNonNull(includeRegex);
            return this;
        }
        public GooglePrivacyDlpV2CloudStorageRegexFileSetResponse build() {
            return new GooglePrivacyDlpV2CloudStorageRegexFileSetResponse(bucketName, excludeRegex, includeRegex);
        }
    }
}

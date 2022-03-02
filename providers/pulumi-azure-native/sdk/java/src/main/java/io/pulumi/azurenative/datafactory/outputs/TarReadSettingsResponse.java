// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TarReadSettingsResponse {
    /**
     * Preserve the compression file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object preserveCompressionFileNameAsFolder;
    /**
     * The Compression setting type.
     * Expected value is 'TarReadSettings'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"preserveCompressionFileNameAsFolder","type"})
    private TarReadSettingsResponse(
        @Nullable Object preserveCompressionFileNameAsFolder,
        String type) {
        this.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Preserve the compression file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getPreserveCompressionFileNameAsFolder() {
        return Optional.ofNullable(this.preserveCompressionFileNameAsFolder);
    }
    /**
     * The Compression setting type.
     * Expected value is 'TarReadSettings'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TarReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object preserveCompressionFileNameAsFolder;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TarReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preserveCompressionFileNameAsFolder = defaults.preserveCompressionFileNameAsFolder;
    	      this.type = defaults.type;
        }

        public Builder setPreserveCompressionFileNameAsFolder(@Nullable Object preserveCompressionFileNameAsFolder) {
            this.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TarReadSettingsResponse build() {
            return new TarReadSettingsResponse(preserveCompressionFileNameAsFolder, type);
        }
    }
}

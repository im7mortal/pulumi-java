// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DocumentRequires {
    /**
     * The name of the required SSM document. The name can be an Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable String name;
    /**
     * The document version required by the current document.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"name","version"})
    private DocumentRequires(
        @Nullable String name,
        @Nullable String version) {
        this.name = name;
        this.version = version;
    }

    /**
     * The name of the required SSM document. The name can be an Amazon Resource Name (ARN).
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The document version required by the current document.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentRequires defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentRequires defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public DocumentRequires build() {
            return new DocumentRequires(name, version);
        }
    }
}

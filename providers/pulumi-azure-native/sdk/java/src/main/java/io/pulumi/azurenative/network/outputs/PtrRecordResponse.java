// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PtrRecordResponse {
    /**
     * The PTR target domain name for this PTR record.
     * 
     */
    private final @Nullable String ptrdname;

    @OutputCustomType.Constructor({"ptrdname"})
    private PtrRecordResponse(@Nullable String ptrdname) {
        this.ptrdname = ptrdname;
    }

    /**
     * The PTR target domain name for this PTR record.
     * 
    */
    public Optional<String> getPtrdname() {
        return Optional.ofNullable(this.ptrdname);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PtrRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ptrdname;

        public Builder() {
    	      // Empty
        }

        public Builder(PtrRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ptrdname = defaults.ptrdname;
        }

        public Builder setPtrdname(@Nullable String ptrdname) {
            this.ptrdname = ptrdname;
            return this;
        }
        public PtrRecordResponse build() {
            return new PtrRecordResponse(ptrdname);
        }
    }
}

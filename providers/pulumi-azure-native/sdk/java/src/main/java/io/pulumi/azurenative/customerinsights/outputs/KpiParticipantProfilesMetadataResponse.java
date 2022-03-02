// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KpiParticipantProfilesMetadataResponse {
    /**
     * Name of the type.
     * 
     */
    private final String typeName;

    @OutputCustomType.Constructor({"typeName"})
    private KpiParticipantProfilesMetadataResponse(String typeName) {
        this.typeName = Objects.requireNonNull(typeName);
    }

    /**
     * Name of the type.
     * 
    */
    public String getTypeName() {
        return this.typeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiParticipantProfilesMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String typeName;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiParticipantProfilesMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.typeName = defaults.typeName;
        }

        public Builder setTypeName(String typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }
        public KpiParticipantProfilesMetadataResponse build() {
            return new KpiParticipantProfilesMetadataResponse(typeName);
        }
    }
}

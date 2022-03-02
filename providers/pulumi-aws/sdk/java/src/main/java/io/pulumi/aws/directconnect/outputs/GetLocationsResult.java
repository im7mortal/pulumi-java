// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetLocationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The code for the locations.
     * 
     */
    private final List<String> locationCodes;

    @OutputCustomType.Constructor({"id","locationCodes"})
    private GetLocationsResult(
        String id,
        List<String> locationCodes) {
        this.id = Objects.requireNonNull(id);
        this.locationCodes = Objects.requireNonNull(locationCodes);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The code for the locations.
     * 
    */
    public List<String> getLocationCodes() {
        return this.locationCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> locationCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.locationCodes = defaults.locationCodes;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocationCodes(List<String> locationCodes) {
            this.locationCodes = Objects.requireNonNull(locationCodes);
            return this;
        }
        public GetLocationsResult build() {
            return new GetLocationsResult(id, locationCodes);
        }
    }
}

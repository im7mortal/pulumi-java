// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomImagePropertiesFromPlanResponse {
    /**
     * The id of the plan, equivalent to name of the plan
     * 
     */
    private final @Nullable String id;
    /**
     * The offer for the plan from the marketplace image the custom image is derived from
     * 
     */
    private final @Nullable String offer;
    /**
     * The publisher for the plan from the marketplace image the custom image is derived from
     * 
     */
    private final @Nullable String publisher;

    @OutputCustomType.Constructor({"id","offer","publisher"})
    private CustomImagePropertiesFromPlanResponse(
        @Nullable String id,
        @Nullable String offer,
        @Nullable String publisher) {
        this.id = id;
        this.offer = offer;
        this.publisher = publisher;
    }

    /**
     * The id of the plan, equivalent to name of the plan
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The offer for the plan from the marketplace image the custom image is derived from
     * 
    */
    public Optional<String> getOffer() {
        return Optional.ofNullable(this.offer);
    }
    /**
     * The publisher for the plan from the marketplace image the custom image is derived from
     * 
    */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImagePropertiesFromPlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String offer;
        private @Nullable String publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImagePropertiesFromPlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setOffer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        public CustomImagePropertiesFromPlanResponse build() {
            return new CustomImagePropertiesFromPlanResponse(id, offer, publisher);
        }
    }
}

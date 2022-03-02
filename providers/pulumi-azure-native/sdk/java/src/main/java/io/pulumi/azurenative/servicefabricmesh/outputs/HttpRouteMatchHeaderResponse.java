// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HttpRouteMatchHeaderResponse {
    /**
     * Name of header to match in request.
     * 
     */
    private final String name;
    /**
     * how to match header value
     * 
     */
    private final @Nullable String type;
    /**
     * Value of header to match in request.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"name","type","value"})
    private HttpRouteMatchHeaderResponse(
        String name,
        @Nullable String type,
        @Nullable String value) {
        this.name = Objects.requireNonNull(name);
        this.type = type;
        this.value = value;
    }

    /**
     * Name of header to match in request.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * how to match header value
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Value of header to match in request.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteMatchHeaderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteMatchHeaderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public HttpRouteMatchHeaderResponse build() {
            return new HttpRouteMatchHeaderResponse(name, type, value);
        }
    }
}

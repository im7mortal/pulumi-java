// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AnyResponse {
    /**
     * A URL/resource name that uniquely identifies the type of the serialized protocol buffer message. This string must contain at least one "/" character. The last segment of the URL's path must represent the fully qualified name of the type (as in `path/google.protobuf.Duration`). The name should be in a canonical form (e.g., leading "." is not accepted). In practice, teams usually precompile into the binary all types that they expect it to use in the context of Any. However, for URLs which use the scheme `http`, `https`, or no scheme, one can optionally set up a type server that maps type URLs to message definitions as follows: * If no scheme is provided, `https` is assumed. * An HTTP GET on the URL must yield a google.protobuf.Type value in binary format, or produce an error. * Applications are allowed to cache lookup results based on the URL, or have them precompiled into a binary to avoid any lookup. Therefore, binary compatibility needs to be preserved on changes to types. (Use versioned type names to manage breaking changes.) Note: this functionality is not currently available in the official protobuf release, and it is not used for type URLs beginning with type.googleapis.com. Schemes other than `http`, `https` (or the empty scheme) might be used with implementation specific semantics.
     * 
     */
    private final String typeUrl;
    /**
     * Must be a valid serialized protocol buffer of the above specified type.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"typeUrl","value"})
    private AnyResponse(
        String typeUrl,
        String value) {
        this.typeUrl = Objects.requireNonNull(typeUrl);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * A URL/resource name that uniquely identifies the type of the serialized protocol buffer message. This string must contain at least one "/" character. The last segment of the URL's path must represent the fully qualified name of the type (as in `path/google.protobuf.Duration`). The name should be in a canonical form (e.g., leading "." is not accepted). In practice, teams usually precompile into the binary all types that they expect it to use in the context of Any. However, for URLs which use the scheme `http`, `https`, or no scheme, one can optionally set up a type server that maps type URLs to message definitions as follows: * If no scheme is provided, `https` is assumed. * An HTTP GET on the URL must yield a google.protobuf.Type value in binary format, or produce an error. * Applications are allowed to cache lookup results based on the URL, or have them precompiled into a binary to avoid any lookup. Therefore, binary compatibility needs to be preserved on changes to types. (Use versioned type names to manage breaking changes.) Note: this functionality is not currently available in the official protobuf release, and it is not used for type URLs beginning with type.googleapis.com. Schemes other than `http`, `https` (or the empty scheme) might be used with implementation specific semantics.
     * 
    */
    public String getTypeUrl() {
        return this.typeUrl;
    }
    /**
     * Must be a valid serialized protocol buffer of the above specified type.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String typeUrl;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AnyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.typeUrl = defaults.typeUrl;
    	      this.value = defaults.value;
        }

        public Builder setTypeUrl(String typeUrl) {
            this.typeUrl = Objects.requireNonNull(typeUrl);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public AnyResponse build() {
            return new AnyResponse(typeUrl, value);
        }
    }
}

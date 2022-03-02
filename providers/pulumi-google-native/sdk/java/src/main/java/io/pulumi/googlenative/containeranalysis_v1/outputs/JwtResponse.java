// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JwtResponse {
    /**
     * The compact encoding of a JWS, which is always three base64 encoded strings joined by periods. For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1
     * 
     */
    private final String compactJwt;

    @OutputCustomType.Constructor({"compactJwt"})
    private JwtResponse(String compactJwt) {
        this.compactJwt = Objects.requireNonNull(compactJwt);
    }

    /**
     * The compact encoding of a JWS, which is always three base64 encoded strings joined by periods. For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1
     * 
    */
    public String getCompactJwt() {
        return this.compactJwt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compactJwt;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compactJwt = defaults.compactJwt;
        }

        public Builder setCompactJwt(String compactJwt) {
            this.compactJwt = Objects.requireNonNull(compactJwt);
            return this;
        }
        public JwtResponse build() {
            return new JwtResponse(compactJwt);
        }
    }
}

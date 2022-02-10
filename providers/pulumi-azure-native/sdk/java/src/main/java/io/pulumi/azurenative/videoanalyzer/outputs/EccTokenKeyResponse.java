// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EccTokenKeyResponse {
    private final String alg;
    private final String kid;
    private final String type;
    private final String x;
    private final String y;

    @OutputCustomType.Constructor({"alg","kid","type","x","y"})
    private EccTokenKeyResponse(
        String alg,
        String kid,
        String type,
        String x,
        String y) {
        this.alg = Objects.requireNonNull(alg);
        this.kid = Objects.requireNonNull(kid);
        this.type = Objects.requireNonNull(type);
        this.x = Objects.requireNonNull(x);
        this.y = Objects.requireNonNull(y);
    }

    public String getAlg() {
        return this.alg;
    }
    public String getKid() {
        return this.kid;
    }
    public String getType() {
        return this.type;
    }
    public String getX() {
        return this.x;
    }
    public String getY() {
        return this.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EccTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alg;
        private String kid;
        private String type;
        private String x;
        private String y;

        public Builder() {
    	      // Empty
        }

        public Builder(EccTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.kid = defaults.kid;
    	      this.type = defaults.type;
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder setAlg(String alg) {
            this.alg = Objects.requireNonNull(alg);
            return this;
        }

        public Builder setKid(String kid) {
            this.kid = Objects.requireNonNull(kid);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setX(String x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }

        public Builder setY(String y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }

        public EccTokenKeyResponse build() {
            return new EccTokenKeyResponse(alg, kid, type, x, y);
        }
    }
}
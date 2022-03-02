// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.IngressBackend;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HTTPIngressPath {
    /**
     * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
     * 
     */
    private final IngressBackend backend;
    /**
     * Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/' and must be present when using PathType with value "Exact" or "Prefix".
     * 
     */
    private final @Nullable String path;
    /**
     * PathType determines the interpretation of the Path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
     *   done on a path element by element basis. A path element refers is the
     *   list of labels in the path split by the '/' separator. A request is a
     *   match for path p if every p is an element-wise prefix of p of the
     *   request path. Note that if the last element of the path is a substring
     *   of the last element in request path, it is not a match (e.g. /foo/bar
     *   matches /foo/bar/baz, but does not match /foo/barbaz).
     * * ImplementationSpecific: Interpretation of the Path matching is up to
     *   the IngressClass. Implementations can treat this as a separate PathType
     *   or treat it identically to Prefix or Exact path types.
     *   Implementations are required to support all path types.
     * 
     */
    private final String pathType;

    @OutputCustomType.Constructor({"backend","path","pathType"})
    private HTTPIngressPath(
        IngressBackend backend,
        @Nullable String path,
        String pathType) {
        this.backend = Objects.requireNonNull(backend);
        this.path = path;
        this.pathType = Objects.requireNonNull(pathType);
    }

    /**
     * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
     * 
    */
    public IngressBackend getBackend() {
        return this.backend;
    }
    /**
     * Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/' and must be present when using PathType with value "Exact" or "Prefix".
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * PathType determines the interpretation of the Path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
     *   done on a path element by element basis. A path element refers is the
     *   list of labels in the path split by the '/' separator. A request is a
     *   match for path p if every p is an element-wise prefix of p of the
     *   request path. Note that if the last element of the path is a substring
     *   of the last element in request path, it is not a match (e.g. /foo/bar
     *   matches /foo/bar/baz, but does not match /foo/barbaz).
     * * ImplementationSpecific: Interpretation of the Path matching is up to
     *   the IngressClass. Implementations can treat this as a separate PathType
     *   or treat it identically to Prefix or Exact path types.
     *   Implementations are required to support all path types.
     * 
    */
    public String getPathType() {
        return this.pathType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPIngressPath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressBackend backend;
        private @Nullable String path;
        private String pathType;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPIngressPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backend = defaults.backend;
    	      this.path = defaults.path;
    	      this.pathType = defaults.pathType;
        }

        public Builder setBackend(IngressBackend backend) {
            this.backend = Objects.requireNonNull(backend);
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPathType(String pathType) {
            this.pathType = Objects.requireNonNull(pathType);
            return this;
        }
        public HTTPIngressPath build() {
            return new HTTPIngressPath(backend, path, pathType);
        }
    }
}

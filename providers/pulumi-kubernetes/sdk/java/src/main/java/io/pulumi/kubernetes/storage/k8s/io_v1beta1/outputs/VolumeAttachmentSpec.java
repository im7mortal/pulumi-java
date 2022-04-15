// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs.VolumeAttachmentSource;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VolumeAttachmentSpec {
    /**
     * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
     */
    private final String attacher;
    /**
     * The node that the volume should be attached to.
     * 
     */
    private final String nodeName;
    /**
     * Source represents the volume that should be attached.
     * 
     */
    private final VolumeAttachmentSource source;

    @CustomType.Constructor
    private VolumeAttachmentSpec(
        @CustomType.Parameter("attacher") String attacher,
        @CustomType.Parameter("nodeName") String nodeName,
        @CustomType.Parameter("source") VolumeAttachmentSource source) {
        this.attacher = attacher;
        this.nodeName = nodeName;
        this.source = source;
    }

    /**
     * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
    */
    public String attacher() {
        return this.attacher;
    }
    /**
     * The node that the volume should be attached to.
     * 
    */
    public String nodeName() {
        return this.nodeName;
    }
    /**
     * Source represents the volume that should be attached.
     * 
    */
    public VolumeAttachmentSource source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attacher;
        private String nodeName;
        private VolumeAttachmentSource source;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attacher = defaults.attacher;
    	      this.nodeName = defaults.nodeName;
    	      this.source = defaults.source;
        }

        public Builder attacher(String attacher) {
            this.attacher = Objects.requireNonNull(attacher);
            return this;
        }
        public Builder nodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }
        public Builder source(VolumeAttachmentSource source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public VolumeAttachmentSpec build() {
            return new VolumeAttachmentSpec(attacher, nodeName, source);
        }
    }
}

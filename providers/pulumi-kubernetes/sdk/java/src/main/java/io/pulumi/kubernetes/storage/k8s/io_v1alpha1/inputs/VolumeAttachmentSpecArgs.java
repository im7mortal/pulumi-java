// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.storage.k8s.io_v1alpha1.inputs.VolumeAttachmentSourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
 * 
 */
public final class VolumeAttachmentSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentSpecArgs Empty = new VolumeAttachmentSpecArgs();

    /**
     * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
     */
    @InputImport(name="attacher", required=true)
    private final Input<String> attacher;

    public Input<String> getAttacher() {
        return this.attacher;
    }

    /**
     * The node that the volume should be attached to.
     * 
     */
    @InputImport(name="nodeName", required=true)
    private final Input<String> nodeName;

    public Input<String> getNodeName() {
        return this.nodeName;
    }

    /**
     * Source represents the volume that should be attached.
     * 
     */
    @InputImport(name="source", required=true)
    private final Input<VolumeAttachmentSourceArgs> source;

    public Input<VolumeAttachmentSourceArgs> getSource() {
        return this.source;
    }

    public VolumeAttachmentSpecArgs(
        Input<String> attacher,
        Input<String> nodeName,
        Input<VolumeAttachmentSourceArgs> source) {
        this.attacher = Objects.requireNonNull(attacher, "expected parameter 'attacher' to be non-null");
        this.nodeName = Objects.requireNonNull(nodeName, "expected parameter 'nodeName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private VolumeAttachmentSpecArgs() {
        this.attacher = Input.empty();
        this.nodeName = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> attacher;
        private Input<String> nodeName;
        private Input<VolumeAttachmentSourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attacher = defaults.attacher;
    	      this.nodeName = defaults.nodeName;
    	      this.source = defaults.source;
        }

        public Builder setAttacher(Input<String> attacher) {
            this.attacher = Objects.requireNonNull(attacher);
            return this;
        }

        public Builder setAttacher(String attacher) {
            this.attacher = Input.of(Objects.requireNonNull(attacher));
            return this;
        }

        public Builder setNodeName(Input<String> nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }

        public Builder setNodeName(String nodeName) {
            this.nodeName = Input.of(Objects.requireNonNull(nodeName));
            return this;
        }

        public Builder setSource(Input<VolumeAttachmentSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(VolumeAttachmentSourceArgs source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public VolumeAttachmentSpecArgs build() {
            return new VolumeAttachmentSpecArgs(attacher, nodeName, source);
        }
    }
}

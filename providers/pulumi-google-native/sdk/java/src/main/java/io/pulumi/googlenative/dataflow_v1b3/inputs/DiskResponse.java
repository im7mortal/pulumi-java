// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskResponse Empty = new DiskResponse();

    @InputImport(name="diskType", required=true)
    private final String diskType;

    public String getDiskType() {
        return this.diskType;
    }

    @InputImport(name="mountPoint", required=true)
    private final String mountPoint;

    public String getMountPoint() {
        return this.mountPoint;
    }

    @InputImport(name="sizeGb", required=true)
    private final Integer sizeGb;

    public Integer getSizeGb() {
        return this.sizeGb;
    }

    public DiskResponse(
        String diskType,
        String mountPoint,
        Integer sizeGb) {
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.mountPoint = Objects.requireNonNull(mountPoint, "expected parameter 'mountPoint' to be non-null");
        this.sizeGb = Objects.requireNonNull(sizeGb, "expected parameter 'sizeGb' to be non-null");
    }

    private DiskResponse() {
        this.diskType = null;
        this.mountPoint = null;
        this.sizeGb = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskType;
        private String mountPoint;
        private Integer sizeGb;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskType = defaults.diskType;
    	      this.mountPoint = defaults.mountPoint;
    	      this.sizeGb = defaults.sizeGb;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setMountPoint(String mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }

        public Builder setSizeGb(Integer sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }

        public DiskResponse build() {
            return new DiskResponse(diskType, mountPoint, sizeGb);
        }
    }
}
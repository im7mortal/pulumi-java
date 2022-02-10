// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.notebooks_v1.outputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DiskResponse {
    private final Boolean autoDelete;
    private final Boolean boot;
    private final String deviceName;
    private final String diskSizeGb;
    private final List<GuestOsFeatureResponse> guestOsFeatures;
    private final String index;
    private final String $interface;
    private final String kind;
    private final List<String> licenses;
    private final String mode;
    private final String source;
    private final String type;

    @OutputCustomType.Constructor({"autoDelete","boot","deviceName","diskSizeGb","guestOsFeatures","index","$interface","kind","licenses","mode","source","type"})
    private DiskResponse(
        Boolean autoDelete,
        Boolean boot,
        String deviceName,
        String diskSizeGb,
        List<GuestOsFeatureResponse> guestOsFeatures,
        String index,
        String $interface,
        String kind,
        List<String> licenses,
        String mode,
        String source,
        String type) {
        this.autoDelete = Objects.requireNonNull(autoDelete);
        this.boot = Objects.requireNonNull(boot);
        this.deviceName = Objects.requireNonNull(deviceName);
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
        this.index = Objects.requireNonNull(index);
        this.$interface = Objects.requireNonNull($interface);
        this.kind = Objects.requireNonNull(kind);
        this.licenses = Objects.requireNonNull(licenses);
        this.mode = Objects.requireNonNull(mode);
        this.source = Objects.requireNonNull(source);
        this.type = Objects.requireNonNull(type);
    }

    public Boolean getAutoDelete() {
        return this.autoDelete;
    }
    public Boolean getBoot() {
        return this.boot;
    }
    public String getDeviceName() {
        return this.deviceName;
    }
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    public List<GuestOsFeatureResponse> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }
    public String getIndex() {
        return this.index;
    }
    public String get$interface() {
        return this.$interface;
    }
    public String getKind() {
        return this.kind;
    }
    public List<String> getLicenses() {
        return this.licenses;
    }
    public String getMode() {
        return this.mode;
    }
    public String getSource() {
        return this.source;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private String diskSizeGb;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private String index;
        private String $interface;
        private String kind;
        private List<String> licenses;
        private String mode;
        private String source;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.$interface = defaults.$interface;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder setAutoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }

        public Builder setBoot(Boolean boot) {
            this.boot = Objects.requireNonNull(boot);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setGuestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }

        public Builder setIndex(String index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder set$interface(String $interface) {
            this.$interface = Objects.requireNonNull($interface);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLicenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public DiskResponse build() {
            return new DiskResponse(autoDelete, boot, deviceName, diskSizeGb, guestOsFeatures, index, $interface, kind, licenses, mode, source, type);
        }
    }
}
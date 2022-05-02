// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.baremetalsolution_v2.enums.NfsExportPermissions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A NFS export entry.
 * 
 */
public final class NfsExportArgs extends com.pulumi.resources.ResourceArgs {

    public static final NfsExportArgs Empty = new NfsExportArgs();

    /**
     * Allow dev flag in NfsShare AllowedClientsRequest.
     * 
     */
    @Import(name="allowDev")
    private @Nullable Output<Boolean> allowDev;

    /**
     * @return Allow dev flag in NfsShare AllowedClientsRequest.
     * 
     */
    public Optional<Output<Boolean>> allowDev() {
        return Optional.ofNullable(this.allowDev);
    }

    /**
     * Allow the setuid flag.
     * 
     */
    @Import(name="allowSuid")
    private @Nullable Output<Boolean> allowSuid;

    /**
     * @return Allow the setuid flag.
     * 
     */
    public Optional<Output<Boolean>> allowSuid() {
        return Optional.ofNullable(this.allowSuid);
    }

    /**
     * A CIDR range.
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return A CIDR range.
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * Either a single machine, identified by an ID, or a comma-separated list of machine IDs.
     * 
     */
    @Import(name="machineId")
    private @Nullable Output<String> machineId;

    /**
     * @return Either a single machine, identified by an ID, or a comma-separated list of machine IDs.
     * 
     */
    public Optional<Output<String>> machineId() {
        return Optional.ofNullable(this.machineId);
    }

    /**
     * Network to use to publish the export.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return Network to use to publish the export.
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * Disable root squashing, which is a feature of NFS. Root squash is a special mapping of the remote superuser (root) identity when using identity authentication.
     * 
     */
    @Import(name="noRootSquash")
    private @Nullable Output<Boolean> noRootSquash;

    /**
     * @return Disable root squashing, which is a feature of NFS. Root squash is a special mapping of the remote superuser (root) identity when using identity authentication.
     * 
     */
    public Optional<Output<Boolean>> noRootSquash() {
        return Optional.ofNullable(this.noRootSquash);
    }

    /**
     * Export permissions.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<NfsExportPermissions> permissions;

    /**
     * @return Export permissions.
     * 
     */
    public Optional<Output<NfsExportPermissions>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    private NfsExportArgs() {}

    private NfsExportArgs(NfsExportArgs $) {
        this.allowDev = $.allowDev;
        this.allowSuid = $.allowSuid;
        this.cidr = $.cidr;
        this.machineId = $.machineId;
        this.networkId = $.networkId;
        this.noRootSquash = $.noRootSquash;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NfsExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NfsExportArgs $;

        public Builder() {
            $ = new NfsExportArgs();
        }

        public Builder(NfsExportArgs defaults) {
            $ = new NfsExportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowDev Allow dev flag in NfsShare AllowedClientsRequest.
         * 
         * @return builder
         * 
         */
        public Builder allowDev(@Nullable Output<Boolean> allowDev) {
            $.allowDev = allowDev;
            return this;
        }

        /**
         * @param allowDev Allow dev flag in NfsShare AllowedClientsRequest.
         * 
         * @return builder
         * 
         */
        public Builder allowDev(Boolean allowDev) {
            return allowDev(Output.of(allowDev));
        }

        /**
         * @param allowSuid Allow the setuid flag.
         * 
         * @return builder
         * 
         */
        public Builder allowSuid(@Nullable Output<Boolean> allowSuid) {
            $.allowSuid = allowSuid;
            return this;
        }

        /**
         * @param allowSuid Allow the setuid flag.
         * 
         * @return builder
         * 
         */
        public Builder allowSuid(Boolean allowSuid) {
            return allowSuid(Output.of(allowSuid));
        }

        /**
         * @param cidr A CIDR range.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr A CIDR range.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param machineId Either a single machine, identified by an ID, or a comma-separated list of machine IDs.
         * 
         * @return builder
         * 
         */
        public Builder machineId(@Nullable Output<String> machineId) {
            $.machineId = machineId;
            return this;
        }

        /**
         * @param machineId Either a single machine, identified by an ID, or a comma-separated list of machine IDs.
         * 
         * @return builder
         * 
         */
        public Builder machineId(String machineId) {
            return machineId(Output.of(machineId));
        }

        /**
         * @param networkId Network to use to publish the export.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId Network to use to publish the export.
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param noRootSquash Disable root squashing, which is a feature of NFS. Root squash is a special mapping of the remote superuser (root) identity when using identity authentication.
         * 
         * @return builder
         * 
         */
        public Builder noRootSquash(@Nullable Output<Boolean> noRootSquash) {
            $.noRootSquash = noRootSquash;
            return this;
        }

        /**
         * @param noRootSquash Disable root squashing, which is a feature of NFS. Root squash is a special mapping of the remote superuser (root) identity when using identity authentication.
         * 
         * @return builder
         * 
         */
        public Builder noRootSquash(Boolean noRootSquash) {
            return noRootSquash(Output.of(noRootSquash));
        }

        /**
         * @param permissions Export permissions.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<NfsExportPermissions> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Export permissions.
         * 
         * @return builder
         * 
         */
        public Builder permissions(NfsExportPermissions permissions) {
            return permissions(Output.of(permissions));
        }

        public NfsExportArgs build() {
            return $;
        }
    }

}

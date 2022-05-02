// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.FutureReservationSpecificSKUPropertiesArgs;
import com.pulumi.googlenative.compute_alpha.inputs.FutureReservationTimeWindowArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ShareSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FutureReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FutureReservationArgs Empty = new FutureReservationArgs();

    /**
     * An optional description of this resource. Provide this property when you create the future reservation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the future reservation.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * List of Projects/Folders to share with.
     * 
     */
    @Import(name="shareSettings")
    private @Nullable Output<ShareSettingsArgs> shareSettings;

    /**
     * @return List of Projects/Folders to share with.
     * 
     */
    public Optional<Output<ShareSettingsArgs>> shareSettings() {
        return Optional.ofNullable(this.shareSettings);
    }

    /**
     * Future Reservation configuration to indicate instance properties and total count.
     * 
     */
    @Import(name="specificSkuProperties")
    private @Nullable Output<FutureReservationSpecificSKUPropertiesArgs> specificSkuProperties;

    /**
     * @return Future Reservation configuration to indicate instance properties and total count.
     * 
     */
    public Optional<Output<FutureReservationSpecificSKUPropertiesArgs>> specificSkuProperties() {
        return Optional.ofNullable(this.specificSkuProperties);
    }

    /**
     * Time window for this Future Reservation.
     * 
     */
    @Import(name="timeWindow")
    private @Nullable Output<FutureReservationTimeWindowArgs> timeWindow;

    /**
     * @return Time window for this Future Reservation.
     * 
     */
    public Optional<Output<FutureReservationTimeWindowArgs>> timeWindow() {
        return Optional.ofNullable(this.timeWindow);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private FutureReservationArgs() {}

    private FutureReservationArgs(FutureReservationArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.project = $.project;
        this.requestId = $.requestId;
        this.shareSettings = $.shareSettings;
        this.specificSkuProperties = $.specificSkuProperties;
        this.timeWindow = $.timeWindow;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FutureReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FutureReservationArgs $;

        public Builder() {
            $ = new FutureReservationArgs();
        }

        public Builder(FutureReservationArgs defaults) {
            $ = new FutureReservationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the future reservation.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the future reservation.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param shareSettings List of Projects/Folders to share with.
         * 
         * @return builder
         * 
         */
        public Builder shareSettings(@Nullable Output<ShareSettingsArgs> shareSettings) {
            $.shareSettings = shareSettings;
            return this;
        }

        /**
         * @param shareSettings List of Projects/Folders to share with.
         * 
         * @return builder
         * 
         */
        public Builder shareSettings(ShareSettingsArgs shareSettings) {
            return shareSettings(Output.of(shareSettings));
        }

        /**
         * @param specificSkuProperties Future Reservation configuration to indicate instance properties and total count.
         * 
         * @return builder
         * 
         */
        public Builder specificSkuProperties(@Nullable Output<FutureReservationSpecificSKUPropertiesArgs> specificSkuProperties) {
            $.specificSkuProperties = specificSkuProperties;
            return this;
        }

        /**
         * @param specificSkuProperties Future Reservation configuration to indicate instance properties and total count.
         * 
         * @return builder
         * 
         */
        public Builder specificSkuProperties(FutureReservationSpecificSKUPropertiesArgs specificSkuProperties) {
            return specificSkuProperties(Output.of(specificSkuProperties));
        }

        /**
         * @param timeWindow Time window for this Future Reservation.
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(@Nullable Output<FutureReservationTimeWindowArgs> timeWindow) {
            $.timeWindow = timeWindow;
            return this;
        }

        /**
         * @param timeWindow Time window for this Future Reservation.
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(FutureReservationTimeWindowArgs timeWindow) {
            return timeWindow(Output.of(timeWindow));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public FutureReservationArgs build() {
            return $;
        }
    }

}

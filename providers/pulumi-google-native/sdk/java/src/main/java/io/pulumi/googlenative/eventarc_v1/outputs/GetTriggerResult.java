// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.eventarc_v1.outputs.DestinationResponse;
import io.pulumi.googlenative.eventarc_v1.outputs.EventFilterResponse;
import io.pulumi.googlenative.eventarc_v1.outputs.TransportResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetTriggerResult {
    /**
     * The creation time.
     * 
     */
    private final String createTime;
    /**
     * Destination specifies where the events should be sent to.
     * 
     */
    private final DestinationResponse destination;
    /**
     * This checksum is computed by the server based on the value of other fields, and might be sent only on create requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
     * 
     */
    private final List<EventFilterResponse> eventFilters;
    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    private final String name;
    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    private final String serviceAccount;
    /**
     * Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    private final TransportResponse transport;
    /**
     * Server-assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted.
     * 
     */
    private final String uid;
    /**
     * The last-modified time.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","destination","etag","eventFilters","labels","name","serviceAccount","transport","uid","updateTime"})
    private GetTriggerResult(
        String createTime,
        DestinationResponse destination,
        String etag,
        List<EventFilterResponse> eventFilters,
        Map<String,String> labels,
        String name,
        String serviceAccount,
        TransportResponse transport,
        String uid,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.destination = Objects.requireNonNull(destination);
        this.etag = Objects.requireNonNull(etag);
        this.eventFilters = Objects.requireNonNull(eventFilters);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.transport = Objects.requireNonNull(transport);
        this.uid = Objects.requireNonNull(uid);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The creation time.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Destination specifies where the events should be sent to.
     * 
    */
    public DestinationResponse getDestination() {
        return this.destination;
    }
    /**
     * This checksum is computed by the server based on the value of other fields, and might be sent only on create requests to ensure that the client has an up-to-date value before proceeding.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
     * 
    */
    public List<EventFilterResponse> getEventFilters() {
        return this.eventFilters;
    }
    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
    */
    public TransportResponse getTransport() {
        return this.transport;
    }
    /**
     * Server-assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted.
     * 
    */
    public String getUid() {
        return this.uid;
    }
    /**
     * The last-modified time.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private DestinationResponse destination;
        private String etag;
        private List<EventFilterResponse> eventFilters;
        private Map<String,String> labels;
        private String name;
        private String serviceAccount;
        private TransportResponse transport;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destination = defaults.destination;
    	      this.etag = defaults.etag;
    	      this.eventFilters = defaults.eventFilters;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.transport = defaults.transport;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDestination(DestinationResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setEventFilters(List<EventFilterResponse> eventFilters) {
            this.eventFilters = Objects.requireNonNull(eventFilters);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setTransport(TransportResponse transport) {
            this.transport = Objects.requireNonNull(transport);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetTriggerResult build() {
            return new GetTriggerResult(createTime, destination, etag, eventFilters, labels, name, serviceAccount, transport, uid, updateTime);
        }
    }
}

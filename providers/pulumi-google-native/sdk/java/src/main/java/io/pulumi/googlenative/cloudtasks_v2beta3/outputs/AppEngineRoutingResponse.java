// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AppEngineRoutingResponse {
    /**
     * The host that the task is sent to. The host is constructed from the domain name of the app associated with the queue's project ID (for example .appspot.com), and the service, version, and instance. Tasks which were created using the App Engine SDK might have a custom domain name. For more information, see [How Requests are Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
     * 
     */
    private final String host;
    /**
     * App instance. By default, the task is sent to an instance which is available when the task is attempted. Requests can only be sent to a specific instance if [manual scaling is used in App Engine Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support instances. For more information, see [App Engine Standard request routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
     * 
     */
    private final String instance;
    /**
     * App service. By default, the task is sent to the service which is the default service when the task is attempted. For some queues or tasks which were created using the App Engine Task Queue API, host is not parsable into service, version, and instance. For example, some tasks which were created using the App Engine SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If host is not parsable, then service, version, and instance are the empty string.
     * 
     */
    private final String service;
    /**
     * App version. By default, the task is sent to the version which is the default version when the task is attempted. For some queues or tasks which were created using the App Engine Task Queue API, host is not parsable into service, version, and instance. For example, some tasks which were created using the App Engine SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If host is not parsable, then service, version, and instance are the empty string.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"host","instance","service","version"})
    private AppEngineRoutingResponse(
        String host,
        String instance,
        String service,
        String version) {
        this.host = Objects.requireNonNull(host);
        this.instance = Objects.requireNonNull(instance);
        this.service = Objects.requireNonNull(service);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The host that the task is sent to. The host is constructed from the domain name of the app associated with the queue's project ID (for example .appspot.com), and the service, version, and instance. Tasks which were created using the App Engine SDK might have a custom domain name. For more information, see [How Requests are Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * App instance. By default, the task is sent to an instance which is available when the task is attempted. Requests can only be sent to a specific instance if [manual scaling is used in App Engine Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support instances. For more information, see [App Engine Standard request routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and [App Engine Flex request routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
     * 
    */
    public String getInstance() {
        return this.instance;
    }
    /**
     * App service. By default, the task is sent to the service which is the default service when the task is attempted. For some queues or tasks which were created using the App Engine Task Queue API, host is not parsable into service, version, and instance. For example, some tasks which were created using the App Engine SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If host is not parsable, then service, version, and instance are the empty string.
     * 
    */
    public String getService() {
        return this.service;
    }
    /**
     * App version. By default, the task is sent to the version which is the default version when the task is attempted. For some queues or tasks which were created using the App Engine Task Queue API, host is not parsable into service, version, and instance. For example, some tasks which were created using the App Engine SDK use a custom domain name; custom domains are not parsed by Cloud Tasks. If host is not parsable, then service, version, and instance are the empty string.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineRoutingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private String instance;
        private String service;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineRoutingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.instance = defaults.instance;
    	      this.service = defaults.service;
    	      this.version = defaults.version;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public AppEngineRoutingResponse build() {
            return new AppEngineRoutingResponse(host, instance, service, version);
        }
    }
}

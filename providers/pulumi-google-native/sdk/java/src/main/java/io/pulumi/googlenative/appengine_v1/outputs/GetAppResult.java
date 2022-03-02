// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.appengine_v1.outputs.FeatureSettingsResponse;
import io.pulumi.googlenative.appengine_v1.outputs.IdentityAwareProxyResponse;
import io.pulumi.googlenative.appengine_v1.outputs.UrlDispatchRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetAppResult {
    /**
     * Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account.
     * 
     */
    private final String authDomain;
    /**
     * Google Cloud Storage bucket that can be used for storing files associated with this application. This bucket is associated with the application and can be used by the gcloud deployment commands.
     * 
     */
    private final String codeBucket;
    /**
     * The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * 
     */
    private final String databaseType;
    /**
     * Google Cloud Storage bucket that can be used by this application to store content.
     * 
     */
    private final String defaultBucket;
    /**
     * Cookie expiration policy for this application.
     * 
     */
    private final String defaultCookieExpiration;
    /**
     * Hostname used to reach this application, as resolved by App Engine.
     * 
     */
    private final String defaultHostname;
    /**
     * HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
     * 
     */
    private final List<UrlDispatchRuleResponse> dispatchRules;
    /**
     * The feature specific settings to be used in the application.
     * 
     */
    private final FeatureSettingsResponse featureSettings;
    /**
     * The Google Container Registry domain used for storing managed build docker images for this application.
     * 
     */
    private final String gcrDomain;
    private final IdentityAwareProxyResponse iap;
    /**
     * Location from which this application runs. Application instances run out of the data centers in the specified location, which is also where all of the application's end user content is stored.Defaults to us-central.View the list of supported locations (https://cloud.google.com/appengine/docs/locations).
     * 
     */
    private final String location;
    /**
     * Full path to the Application resource in the API. Example: apps/myapp.
     * 
     */
    private final String name;
    /**
     * The service account associated with the application. This is the app-level default identity. If no identity provided during create version, Admin API will fallback to this one.
     * 
     */
    private final String serviceAccount;
    /**
     * Serving status of this application.
     * 
     */
    private final String servingStatus;

    @OutputCustomType.Constructor({"authDomain","codeBucket","databaseType","defaultBucket","defaultCookieExpiration","defaultHostname","dispatchRules","featureSettings","gcrDomain","iap","location","name","serviceAccount","servingStatus"})
    private GetAppResult(
        String authDomain,
        String codeBucket,
        String databaseType,
        String defaultBucket,
        String defaultCookieExpiration,
        String defaultHostname,
        List<UrlDispatchRuleResponse> dispatchRules,
        FeatureSettingsResponse featureSettings,
        String gcrDomain,
        IdentityAwareProxyResponse iap,
        String location,
        String name,
        String serviceAccount,
        String servingStatus) {
        this.authDomain = Objects.requireNonNull(authDomain);
        this.codeBucket = Objects.requireNonNull(codeBucket);
        this.databaseType = Objects.requireNonNull(databaseType);
        this.defaultBucket = Objects.requireNonNull(defaultBucket);
        this.defaultCookieExpiration = Objects.requireNonNull(defaultCookieExpiration);
        this.defaultHostname = Objects.requireNonNull(defaultHostname);
        this.dispatchRules = Objects.requireNonNull(dispatchRules);
        this.featureSettings = Objects.requireNonNull(featureSettings);
        this.gcrDomain = Objects.requireNonNull(gcrDomain);
        this.iap = Objects.requireNonNull(iap);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.servingStatus = Objects.requireNonNull(servingStatus);
    }

    /**
     * Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account.
     * 
    */
    public String getAuthDomain() {
        return this.authDomain;
    }
    /**
     * Google Cloud Storage bucket that can be used for storing files associated with this application. This bucket is associated with the application and can be used by the gcloud deployment commands.
     * 
    */
    public String getCodeBucket() {
        return this.codeBucket;
    }
    /**
     * The type of the Cloud Firestore or Cloud Datastore database associated with this application.
     * 
    */
    public String getDatabaseType() {
        return this.databaseType;
    }
    /**
     * Google Cloud Storage bucket that can be used by this application to store content.
     * 
    */
    public String getDefaultBucket() {
        return this.defaultBucket;
    }
    /**
     * Cookie expiration policy for this application.
     * 
    */
    public String getDefaultCookieExpiration() {
        return this.defaultCookieExpiration;
    }
    /**
     * Hostname used to reach this application, as resolved by App Engine.
     * 
    */
    public String getDefaultHostname() {
        return this.defaultHostname;
    }
    /**
     * HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
     * 
    */
    public List<UrlDispatchRuleResponse> getDispatchRules() {
        return this.dispatchRules;
    }
    /**
     * The feature specific settings to be used in the application.
     * 
    */
    public FeatureSettingsResponse getFeatureSettings() {
        return this.featureSettings;
    }
    /**
     * The Google Container Registry domain used for storing managed build docker images for this application.
     * 
    */
    public String getGcrDomain() {
        return this.gcrDomain;
    }
    public IdentityAwareProxyResponse getIap() {
        return this.iap;
    }
    /**
     * Location from which this application runs. Application instances run out of the data centers in the specified location, which is also where all of the application's end user content is stored.Defaults to us-central.View the list of supported locations (https://cloud.google.com/appengine/docs/locations).
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Full path to the Application resource in the API. Example: apps/myapp.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The service account associated with the application. This is the app-level default identity. If no identity provided during create version, Admin API will fallback to this one.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Serving status of this application.
     * 
    */
    public String getServingStatus() {
        return this.servingStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authDomain;
        private String codeBucket;
        private String databaseType;
        private String defaultBucket;
        private String defaultCookieExpiration;
        private String defaultHostname;
        private List<UrlDispatchRuleResponse> dispatchRules;
        private FeatureSettingsResponse featureSettings;
        private String gcrDomain;
        private IdentityAwareProxyResponse iap;
        private String location;
        private String name;
        private String serviceAccount;
        private String servingStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authDomain = defaults.authDomain;
    	      this.codeBucket = defaults.codeBucket;
    	      this.databaseType = defaults.databaseType;
    	      this.defaultBucket = defaults.defaultBucket;
    	      this.defaultCookieExpiration = defaults.defaultCookieExpiration;
    	      this.defaultHostname = defaults.defaultHostname;
    	      this.dispatchRules = defaults.dispatchRules;
    	      this.featureSettings = defaults.featureSettings;
    	      this.gcrDomain = defaults.gcrDomain;
    	      this.iap = defaults.iap;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.servingStatus = defaults.servingStatus;
        }

        public Builder setAuthDomain(String authDomain) {
            this.authDomain = Objects.requireNonNull(authDomain);
            return this;
        }

        public Builder setCodeBucket(String codeBucket) {
            this.codeBucket = Objects.requireNonNull(codeBucket);
            return this;
        }

        public Builder setDatabaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }

        public Builder setDefaultBucket(String defaultBucket) {
            this.defaultBucket = Objects.requireNonNull(defaultBucket);
            return this;
        }

        public Builder setDefaultCookieExpiration(String defaultCookieExpiration) {
            this.defaultCookieExpiration = Objects.requireNonNull(defaultCookieExpiration);
            return this;
        }

        public Builder setDefaultHostname(String defaultHostname) {
            this.defaultHostname = Objects.requireNonNull(defaultHostname);
            return this;
        }

        public Builder setDispatchRules(List<UrlDispatchRuleResponse> dispatchRules) {
            this.dispatchRules = Objects.requireNonNull(dispatchRules);
            return this;
        }

        public Builder setFeatureSettings(FeatureSettingsResponse featureSettings) {
            this.featureSettings = Objects.requireNonNull(featureSettings);
            return this;
        }

        public Builder setGcrDomain(String gcrDomain) {
            this.gcrDomain = Objects.requireNonNull(gcrDomain);
            return this;
        }

        public Builder setIap(IdentityAwareProxyResponse iap) {
            this.iap = Objects.requireNonNull(iap);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
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

        public Builder setServingStatus(String servingStatus) {
            this.servingStatus = Objects.requireNonNull(servingStatus);
            return this;
        }
        public GetAppResult build() {
            return new GetAppResult(authDomain, codeBucket, databaseType, defaultBucket, defaultCookieExpiration, defaultHostname, dispatchRules, featureSettings, gcrDomain, iap, location, name, serviceAccount, servingStatus);
        }
    }
}

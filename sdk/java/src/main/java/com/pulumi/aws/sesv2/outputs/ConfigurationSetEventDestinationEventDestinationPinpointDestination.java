// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConfigurationSetEventDestinationEventDestinationPinpointDestination {
    private String applicationArn;

    private ConfigurationSetEventDestinationEventDestinationPinpointDestination() {}
    public String applicationArn() {
        return this.applicationArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationSetEventDestinationEventDestinationPinpointDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationArn;
        public Builder() {}
        public Builder(ConfigurationSetEventDestinationEventDestinationPinpointDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationArn = defaults.applicationArn;
        }

        @CustomType.Setter
        public Builder applicationArn(String applicationArn) {
            this.applicationArn = Objects.requireNonNull(applicationArn);
            return this;
        }
        public ConfigurationSetEventDestinationEventDestinationPinpointDestination build() {
            final var o = new ConfigurationSetEventDestinationEventDestinationPinpointDestination();
            o.applicationArn = applicationArn;
            return o;
        }
    }
}

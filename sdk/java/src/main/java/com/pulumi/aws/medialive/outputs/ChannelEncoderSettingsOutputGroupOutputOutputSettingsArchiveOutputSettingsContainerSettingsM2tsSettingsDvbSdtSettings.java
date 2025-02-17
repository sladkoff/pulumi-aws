// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbSdtSettings {
    private @Nullable String outputSdt;
    private @Nullable Integer repInterval;
    private @Nullable String serviceName;
    private @Nullable String serviceProviderName;

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbSdtSettings() {}
    public Optional<String> outputSdt() {
        return Optional.ofNullable(this.outputSdt);
    }
    public Optional<Integer> repInterval() {
        return Optional.ofNullable(this.repInterval);
    }
    public Optional<String> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }
    public Optional<String> serviceProviderName() {
        return Optional.ofNullable(this.serviceProviderName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbSdtSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String outputSdt;
        private @Nullable Integer repInterval;
        private @Nullable String serviceName;
        private @Nullable String serviceProviderName;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbSdtSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputSdt = defaults.outputSdt;
    	      this.repInterval = defaults.repInterval;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceProviderName = defaults.serviceProviderName;
        }

        @CustomType.Setter
        public Builder outputSdt(@Nullable String outputSdt) {
            this.outputSdt = outputSdt;
            return this;
        }
        @CustomType.Setter
        public Builder repInterval(@Nullable Integer repInterval) {
            this.repInterval = repInterval;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        @CustomType.Setter
        public Builder serviceProviderName(@Nullable String serviceProviderName) {
            this.serviceProviderName = serviceProviderName;
            return this;
        }
        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbSdtSettings build() {
            final var o = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbSdtSettings();
            o.outputSdt = outputSdt;
            o.repInterval = repInterval;
            o.serviceName = serviceName;
            o.serviceProviderName = serviceProviderName;
            return o;
        }
    }
}

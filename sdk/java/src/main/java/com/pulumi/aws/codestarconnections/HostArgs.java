// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codestarconnections;

import com.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostArgs Empty = new HostArgs();

    /**
     * The name of the host to be created. The name must be unique in the calling AWS account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the host to be created. The name must be unique in the calling AWS account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The endpoint of the infrastructure to be represented by the host after it is created.
     * 
     */
    @Import(name="providerEndpoint", required=true)
    private Output<String> providerEndpoint;

    /**
     * @return The endpoint of the infrastructure to be represented by the host after it is created.
     * 
     */
    public Output<String> providerEndpoint() {
        return this.providerEndpoint;
    }

    /**
     * The name of the external provider where your third-party code repository is configured.
     * 
     */
    @Import(name="providerType", required=true)
    private Output<String> providerType;

    /**
     * @return The name of the external provider where your third-party code repository is configured.
     * 
     */
    public Output<String> providerType() {
        return this.providerType;
    }

    /**
     * The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * 
     */
    @Import(name="vpcConfiguration")
    private @Nullable Output<HostVpcConfigurationArgs> vpcConfiguration;

    /**
     * @return The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * 
     */
    public Optional<Output<HostVpcConfigurationArgs>> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    private HostArgs() {}

    private HostArgs(HostArgs $) {
        this.name = $.name;
        this.providerEndpoint = $.providerEndpoint;
        this.providerType = $.providerType;
        this.vpcConfiguration = $.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostArgs $;

        public Builder() {
            $ = new HostArgs();
        }

        public Builder(HostArgs defaults) {
            $ = new HostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the host to be created. The name must be unique in the calling AWS account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the host to be created. The name must be unique in the calling AWS account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param providerEndpoint The endpoint of the infrastructure to be represented by the host after it is created.
         * 
         * @return builder
         * 
         */
        public Builder providerEndpoint(Output<String> providerEndpoint) {
            $.providerEndpoint = providerEndpoint;
            return this;
        }

        /**
         * @param providerEndpoint The endpoint of the infrastructure to be represented by the host after it is created.
         * 
         * @return builder
         * 
         */
        public Builder providerEndpoint(String providerEndpoint) {
            return providerEndpoint(Output.of(providerEndpoint));
        }

        /**
         * @param providerType The name of the external provider where your third-party code repository is configured.
         * 
         * @return builder
         * 
         */
        public Builder providerType(Output<String> providerType) {
            $.providerType = providerType;
            return this;
        }

        /**
         * @param providerType The name of the external provider where your third-party code repository is configured.
         * 
         * @return builder
         * 
         */
        public Builder providerType(String providerType) {
            return providerType(Output.of(providerType));
        }

        /**
         * @param vpcConfiguration The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(@Nullable Output<HostVpcConfigurationArgs> vpcConfiguration) {
            $.vpcConfiguration = vpcConfiguration;
            return this;
        }

        /**
         * @param vpcConfiguration The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(HostVpcConfigurationArgs vpcConfiguration) {
            return vpcConfiguration(Output.of(vpcConfiguration));
        }

        public HostArgs build() {
            $.providerEndpoint = Objects.requireNonNull($.providerEndpoint, "expected parameter 'providerEndpoint' to be non-null");
            $.providerType = Objects.requireNonNull($.providerType, "expected parameter 'providerType' to be non-null");
            return $;
        }
    }

}

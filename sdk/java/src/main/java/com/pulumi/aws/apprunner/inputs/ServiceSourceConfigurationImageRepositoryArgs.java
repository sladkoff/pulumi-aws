// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.inputs;

import com.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryImageConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceSourceConfigurationImageRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationImageRepositoryArgs Empty = new ServiceSourceConfigurationImageRepositoryArgs();

    /**
     * Configuration for running the identified image. See Image Configuration below for more details.
     * 
     */
    @Import(name="imageConfiguration")
    private @Nullable Output<ServiceSourceConfigurationImageRepositoryImageConfigurationArgs> imageConfiguration;

    /**
     * @return Configuration for running the identified image. See Image Configuration below for more details.
     * 
     */
    public Optional<Output<ServiceSourceConfigurationImageRepositoryImageConfigurationArgs>> imageConfiguration() {
        return Optional.ofNullable(this.imageConfiguration);
    }

    /**
     * Identifier of an image. For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the
     * image name format, see Pulling an image in the Amazon ECR User Guide.
     * 
     */
    @Import(name="imageIdentifier", required=true)
    private Output<String> imageIdentifier;

    /**
     * @return Identifier of an image. For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the
     * image name format, see Pulling an image in the Amazon ECR User Guide.
     * 
     */
    public Output<String> imageIdentifier() {
        return this.imageIdentifier;
    }

    /**
     * Type of the image repository. This reflects the repository provider and whether the repository is private or public. Valid values: `ECR` , `ECR_PUBLIC`.
     * 
     */
    @Import(name="imageRepositoryType", required=true)
    private Output<String> imageRepositoryType;

    /**
     * @return Type of the image repository. This reflects the repository provider and whether the repository is private or public. Valid values: `ECR` , `ECR_PUBLIC`.
     * 
     */
    public Output<String> imageRepositoryType() {
        return this.imageRepositoryType;
    }

    private ServiceSourceConfigurationImageRepositoryArgs() {}

    private ServiceSourceConfigurationImageRepositoryArgs(ServiceSourceConfigurationImageRepositoryArgs $) {
        this.imageConfiguration = $.imageConfiguration;
        this.imageIdentifier = $.imageIdentifier;
        this.imageRepositoryType = $.imageRepositoryType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSourceConfigurationImageRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSourceConfigurationImageRepositoryArgs $;

        public Builder() {
            $ = new ServiceSourceConfigurationImageRepositoryArgs();
        }

        public Builder(ServiceSourceConfigurationImageRepositoryArgs defaults) {
            $ = new ServiceSourceConfigurationImageRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageConfiguration Configuration for running the identified image. See Image Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder imageConfiguration(@Nullable Output<ServiceSourceConfigurationImageRepositoryImageConfigurationArgs> imageConfiguration) {
            $.imageConfiguration = imageConfiguration;
            return this;
        }

        /**
         * @param imageConfiguration Configuration for running the identified image. See Image Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder imageConfiguration(ServiceSourceConfigurationImageRepositoryImageConfigurationArgs imageConfiguration) {
            return imageConfiguration(Output.of(imageConfiguration));
        }

        /**
         * @param imageIdentifier Identifier of an image. For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the
         * image name format, see Pulling an image in the Amazon ECR User Guide.
         * 
         * @return builder
         * 
         */
        public Builder imageIdentifier(Output<String> imageIdentifier) {
            $.imageIdentifier = imageIdentifier;
            return this;
        }

        /**
         * @param imageIdentifier Identifier of an image. For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the
         * image name format, see Pulling an image in the Amazon ECR User Guide.
         * 
         * @return builder
         * 
         */
        public Builder imageIdentifier(String imageIdentifier) {
            return imageIdentifier(Output.of(imageIdentifier));
        }

        /**
         * @param imageRepositoryType Type of the image repository. This reflects the repository provider and whether the repository is private or public. Valid values: `ECR` , `ECR_PUBLIC`.
         * 
         * @return builder
         * 
         */
        public Builder imageRepositoryType(Output<String> imageRepositoryType) {
            $.imageRepositoryType = imageRepositoryType;
            return this;
        }

        /**
         * @param imageRepositoryType Type of the image repository. This reflects the repository provider and whether the repository is private or public. Valid values: `ECR` , `ECR_PUBLIC`.
         * 
         * @return builder
         * 
         */
        public Builder imageRepositoryType(String imageRepositoryType) {
            return imageRepositoryType(Output.of(imageRepositoryType));
        }

        public ServiceSourceConfigurationImageRepositoryArgs build() {
            $.imageIdentifier = Objects.requireNonNull($.imageIdentifier, "expected parameter 'imageIdentifier' to be non-null");
            $.imageRepositoryType = Objects.requireNonNull($.imageRepositoryType, "expected parameter 'imageRepositoryType' to be non-null");
            return $;
        }
    }

}

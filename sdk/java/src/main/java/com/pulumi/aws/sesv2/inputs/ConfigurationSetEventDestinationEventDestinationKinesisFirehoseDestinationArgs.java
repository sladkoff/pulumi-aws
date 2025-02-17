// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs Empty = new ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs();

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that the Amazon SES API v2 sends email events to.
     * 
     */
    @Import(name="deliveryStreamArn", required=true)
    private Output<String> deliveryStreamArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that the Amazon SES API v2 sends email events to.
     * 
     */
    public Output<String> deliveryStreamArn() {
        return this.deliveryStreamArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that the Amazon SES API v2 uses to send email events to the Amazon Kinesis Data Firehose stream.
     * 
     */
    @Import(name="iamRoleArn", required=true)
    private Output<String> iamRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role that the Amazon SES API v2 uses to send email events to the Amazon Kinesis Data Firehose stream.
     * 
     */
    public Output<String> iamRoleArn() {
        return this.iamRoleArn;
    }

    private ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs() {}

    private ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs(ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs $) {
        this.deliveryStreamArn = $.deliveryStreamArn;
        this.iamRoleArn = $.iamRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs $;

        public Builder() {
            $ = new ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs();
        }

        public Builder(ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs defaults) {
            $ = new ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deliveryStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that the Amazon SES API v2 sends email events to.
         * 
         * @return builder
         * 
         */
        public Builder deliveryStreamArn(Output<String> deliveryStreamArn) {
            $.deliveryStreamArn = deliveryStreamArn;
            return this;
        }

        /**
         * @param deliveryStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that the Amazon SES API v2 sends email events to.
         * 
         * @return builder
         * 
         */
        public Builder deliveryStreamArn(String deliveryStreamArn) {
            return deliveryStreamArn(Output.of(deliveryStreamArn));
        }

        /**
         * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that the Amazon SES API v2 uses to send email events to the Amazon Kinesis Data Firehose stream.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(Output<String> iamRoleArn) {
            $.iamRoleArn = iamRoleArn;
            return this;
        }

        /**
         * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that the Amazon SES API v2 uses to send email events to the Amazon Kinesis Data Firehose stream.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(String iamRoleArn) {
            return iamRoleArn(Output.of(iamRoleArn));
        }

        public ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs build() {
            $.deliveryStreamArn = Objects.requireNonNull($.deliveryStreamArn, "expected parameter 'deliveryStreamArn' to be non-null");
            $.iamRoleArn = Objects.requireNonNull($.iamRoleArn, "expected parameter 'iamRoleArn' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs();

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    /**
     * Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `ip_set_forwarded_ip_config` below for more details.
     * 
     */
    @Import(name="ipSetForwardedIpConfig")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig;

    /**
     * @return Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `ip_set_forwarded_ip_config` below for more details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs>> ipSetForwardedIpConfig() {
        return Optional.ofNullable(this.ipSetForwardedIpConfig);
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs $) {
        this.arn = $.arn;
        this.ipSetForwardedIpConfig = $.ipSetForwardedIpConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the IP Set that this statement references.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the IP Set that this statement references.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param ipSetForwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `ip_set_forwarded_ip_config` below for more details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetForwardedIpConfig(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig) {
            $.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }

        /**
         * @param ipSetForwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `ip_set_forwarded_ip_config` below for more details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetForwardedIpConfig(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs ipSetForwardedIpConfig) {
            return ipSetForwardedIpConfig(Output.of(ipSetForwardedIpConfig));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}

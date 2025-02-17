// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiCorsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiCorsConfigurationArgs Empty = new ApiCorsConfigurationArgs();

    /**
     * Whether credentials are included in the CORS request.
     * 
     */
    @Import(name="allowCredentials")
    private @Nullable Output<Boolean> allowCredentials;

    /**
     * @return Whether credentials are included in the CORS request.
     * 
     */
    public Optional<Output<Boolean>> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }

    /**
     * Set of allowed HTTP headers.
     * 
     */
    @Import(name="allowHeaders")
    private @Nullable Output<List<String>> allowHeaders;

    /**
     * @return Set of allowed HTTP headers.
     * 
     */
    public Optional<Output<List<String>>> allowHeaders() {
        return Optional.ofNullable(this.allowHeaders);
    }

    /**
     * Set of allowed HTTP methods.
     * 
     */
    @Import(name="allowMethods")
    private @Nullable Output<List<String>> allowMethods;

    /**
     * @return Set of allowed HTTP methods.
     * 
     */
    public Optional<Output<List<String>>> allowMethods() {
        return Optional.ofNullable(this.allowMethods);
    }

    /**
     * Set of allowed origins.
     * 
     */
    @Import(name="allowOrigins")
    private @Nullable Output<List<String>> allowOrigins;

    /**
     * @return Set of allowed origins.
     * 
     */
    public Optional<Output<List<String>>> allowOrigins() {
        return Optional.ofNullable(this.allowOrigins);
    }

    /**
     * Set of exposed HTTP headers.
     * 
     */
    @Import(name="exposeHeaders")
    private @Nullable Output<List<String>> exposeHeaders;

    /**
     * @return Set of exposed HTTP headers.
     * 
     */
    public Optional<Output<List<String>>> exposeHeaders() {
        return Optional.ofNullable(this.exposeHeaders);
    }

    /**
     * Number of seconds that the browser should cache preflight request results.
     * 
     */
    @Import(name="maxAge")
    private @Nullable Output<Integer> maxAge;

    /**
     * @return Number of seconds that the browser should cache preflight request results.
     * 
     */
    public Optional<Output<Integer>> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    private ApiCorsConfigurationArgs() {}

    private ApiCorsConfigurationArgs(ApiCorsConfigurationArgs $) {
        this.allowCredentials = $.allowCredentials;
        this.allowHeaders = $.allowHeaders;
        this.allowMethods = $.allowMethods;
        this.allowOrigins = $.allowOrigins;
        this.exposeHeaders = $.exposeHeaders;
        this.maxAge = $.maxAge;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiCorsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiCorsConfigurationArgs $;

        public Builder() {
            $ = new ApiCorsConfigurationArgs();
        }

        public Builder(ApiCorsConfigurationArgs defaults) {
            $ = new ApiCorsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowCredentials Whether credentials are included in the CORS request.
         * 
         * @return builder
         * 
         */
        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            $.allowCredentials = allowCredentials;
            return this;
        }

        /**
         * @param allowCredentials Whether credentials are included in the CORS request.
         * 
         * @return builder
         * 
         */
        public Builder allowCredentials(Boolean allowCredentials) {
            return allowCredentials(Output.of(allowCredentials));
        }

        /**
         * @param allowHeaders Set of allowed HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder allowHeaders(@Nullable Output<List<String>> allowHeaders) {
            $.allowHeaders = allowHeaders;
            return this;
        }

        /**
         * @param allowHeaders Set of allowed HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder allowHeaders(List<String> allowHeaders) {
            return allowHeaders(Output.of(allowHeaders));
        }

        /**
         * @param allowHeaders Set of allowed HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder allowHeaders(String... allowHeaders) {
            return allowHeaders(List.of(allowHeaders));
        }

        /**
         * @param allowMethods Set of allowed HTTP methods.
         * 
         * @return builder
         * 
         */
        public Builder allowMethods(@Nullable Output<List<String>> allowMethods) {
            $.allowMethods = allowMethods;
            return this;
        }

        /**
         * @param allowMethods Set of allowed HTTP methods.
         * 
         * @return builder
         * 
         */
        public Builder allowMethods(List<String> allowMethods) {
            return allowMethods(Output.of(allowMethods));
        }

        /**
         * @param allowMethods Set of allowed HTTP methods.
         * 
         * @return builder
         * 
         */
        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }

        /**
         * @param allowOrigins Set of allowed origins.
         * 
         * @return builder
         * 
         */
        public Builder allowOrigins(@Nullable Output<List<String>> allowOrigins) {
            $.allowOrigins = allowOrigins;
            return this;
        }

        /**
         * @param allowOrigins Set of allowed origins.
         * 
         * @return builder
         * 
         */
        public Builder allowOrigins(List<String> allowOrigins) {
            return allowOrigins(Output.of(allowOrigins));
        }

        /**
         * @param allowOrigins Set of allowed origins.
         * 
         * @return builder
         * 
         */
        public Builder allowOrigins(String... allowOrigins) {
            return allowOrigins(List.of(allowOrigins));
        }

        /**
         * @param exposeHeaders Set of exposed HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(@Nullable Output<List<String>> exposeHeaders) {
            $.exposeHeaders = exposeHeaders;
            return this;
        }

        /**
         * @param exposeHeaders Set of exposed HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(List<String> exposeHeaders) {
            return exposeHeaders(Output.of(exposeHeaders));
        }

        /**
         * @param exposeHeaders Set of exposed HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }

        /**
         * @param maxAge Number of seconds that the browser should cache preflight request results.
         * 
         * @return builder
         * 
         */
        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        /**
         * @param maxAge Number of seconds that the browser should cache preflight request results.
         * 
         * @return builder
         * 
         */
        public Builder maxAge(Integer maxAge) {
            return maxAge(Output.of(maxAge));
        }

        public ApiCorsConfigurationArgs build() {
            return $;
        }
    }

}

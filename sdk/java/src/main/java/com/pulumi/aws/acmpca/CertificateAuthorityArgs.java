// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca;

import com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs;
import com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityArgs Empty = new CertificateAuthorityArgs();

    /**
     * Nested argument containing algorithms and certificate subject information. Defined below.
     * 
     */
    @Import(name="certificateAuthorityConfiguration", required=true)
    private Output<CertificateAuthorityCertificateAuthorityConfigurationArgs> certificateAuthorityConfiguration;

    /**
     * @return Nested argument containing algorithms and certificate subject information. Defined below.
     * 
     */
    public Output<CertificateAuthorityCertificateAuthorityConfigurationArgs> certificateAuthorityConfiguration() {
        return this.certificateAuthorityConfiguration;
    }

    /**
     * Whether the certificate authority is enabled or disabled. Defaults to `true`. Can only be disabled if the CA is in an `ACTIVE` state.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the certificate authority is enabled or disabled. Defaults to `true`. Can only be disabled if the CA is in an `ACTIVE` state.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
     * 
     */
    @Import(name="permanentDeletionTimeInDays")
    private @Nullable Output<Integer> permanentDeletionTimeInDays;

    /**
     * @return Number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
     * 
     */
    public Optional<Output<Integer>> permanentDeletionTimeInDays() {
        return Optional.ofNullable(this.permanentDeletionTimeInDays);
    }

    /**
     * Nested argument containing revocation configuration. Defined below.
     * 
     */
    @Import(name="revocationConfiguration")
    private @Nullable Output<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration;

    /**
     * @return Nested argument containing revocation configuration. Defined below.
     * 
     */
    public Optional<Output<CertificateAuthorityRevocationConfigurationArgs>> revocationConfiguration() {
        return Optional.ofNullable(this.revocationConfiguration);
    }

    /**
     * Key-value map of user-defined tags that are attached to the certificate authority. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of user-defined tags that are attached to the certificate authority. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly. Short-lived certificate validity is limited to seven days. Defaults to `GENERAL_PURPOSE`. Valid values: `GENERAL_PURPOSE` and `SHORT_LIVED_CERTIFICATE`.
     * 
     */
    @Import(name="usageMode")
    private @Nullable Output<String> usageMode;

    /**
     * @return Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly. Short-lived certificate validity is limited to seven days. Defaults to `GENERAL_PURPOSE`. Valid values: `GENERAL_PURPOSE` and `SHORT_LIVED_CERTIFICATE`.
     * 
     */
    public Optional<Output<String>> usageMode() {
        return Optional.ofNullable(this.usageMode);
    }

    private CertificateAuthorityArgs() {}

    private CertificateAuthorityArgs(CertificateAuthorityArgs $) {
        this.certificateAuthorityConfiguration = $.certificateAuthorityConfiguration;
        this.enabled = $.enabled;
        this.permanentDeletionTimeInDays = $.permanentDeletionTimeInDays;
        this.revocationConfiguration = $.revocationConfiguration;
        this.tags = $.tags;
        this.type = $.type;
        this.usageMode = $.usageMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityArgs $;

        public Builder() {
            $ = new CertificateAuthorityArgs();
        }

        public Builder(CertificateAuthorityArgs defaults) {
            $ = new CertificateAuthorityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateAuthorityConfiguration Nested argument containing algorithms and certificate subject information. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityConfiguration(Output<CertificateAuthorityCertificateAuthorityConfigurationArgs> certificateAuthorityConfiguration) {
            $.certificateAuthorityConfiguration = certificateAuthorityConfiguration;
            return this;
        }

        /**
         * @param certificateAuthorityConfiguration Nested argument containing algorithms and certificate subject information. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityConfiguration(CertificateAuthorityCertificateAuthorityConfigurationArgs certificateAuthorityConfiguration) {
            return certificateAuthorityConfiguration(Output.of(certificateAuthorityConfiguration));
        }

        /**
         * @param enabled Whether the certificate authority is enabled or disabled. Defaults to `true`. Can only be disabled if the CA is in an `ACTIVE` state.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the certificate authority is enabled or disabled. Defaults to `true`. Can only be disabled if the CA is in an `ACTIVE` state.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param permanentDeletionTimeInDays Number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
         * 
         * @return builder
         * 
         */
        public Builder permanentDeletionTimeInDays(@Nullable Output<Integer> permanentDeletionTimeInDays) {
            $.permanentDeletionTimeInDays = permanentDeletionTimeInDays;
            return this;
        }

        /**
         * @param permanentDeletionTimeInDays Number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
         * 
         * @return builder
         * 
         */
        public Builder permanentDeletionTimeInDays(Integer permanentDeletionTimeInDays) {
            return permanentDeletionTimeInDays(Output.of(permanentDeletionTimeInDays));
        }

        /**
         * @param revocationConfiguration Nested argument containing revocation configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder revocationConfiguration(@Nullable Output<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration) {
            $.revocationConfiguration = revocationConfiguration;
            return this;
        }

        /**
         * @param revocationConfiguration Nested argument containing revocation configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder revocationConfiguration(CertificateAuthorityRevocationConfigurationArgs revocationConfiguration) {
            return revocationConfiguration(Output.of(revocationConfiguration));
        }

        /**
         * @param tags Key-value map of user-defined tags that are attached to the certificate authority. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of user-defined tags that are attached to the certificate authority. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type Type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param usageMode Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly. Short-lived certificate validity is limited to seven days. Defaults to `GENERAL_PURPOSE`. Valid values: `GENERAL_PURPOSE` and `SHORT_LIVED_CERTIFICATE`.
         * 
         * @return builder
         * 
         */
        public Builder usageMode(@Nullable Output<String> usageMode) {
            $.usageMode = usageMode;
            return this;
        }

        /**
         * @param usageMode Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly. Short-lived certificate validity is limited to seven days. Defaults to `GENERAL_PURPOSE`. Valid values: `GENERAL_PURPOSE` and `SHORT_LIVED_CERTIFICATE`.
         * 
         * @return builder
         * 
         */
        public Builder usageMode(String usageMode) {
            return usageMode(Output.of(usageMode));
        }

        public CertificateAuthorityArgs build() {
            $.certificateAuthorityConfiguration = Objects.requireNonNull($.certificateAuthorityConfiguration, "expected parameter 'certificateAuthorityConfiguration' to be non-null");
            return $;
        }
    }

}

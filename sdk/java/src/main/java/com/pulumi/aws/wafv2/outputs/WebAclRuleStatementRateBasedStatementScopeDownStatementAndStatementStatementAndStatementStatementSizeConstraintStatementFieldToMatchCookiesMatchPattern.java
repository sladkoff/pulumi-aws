// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAll;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPattern {
    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAll all;
    private @Nullable List<String> excludedCookies;
    private @Nullable List<String> includedCookies;

    private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPattern() {}
    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAll> all() {
        return Optional.ofNullable(this.all);
    }
    public List<String> excludedCookies() {
        return this.excludedCookies == null ? List.of() : this.excludedCookies;
    }
    public List<String> includedCookies() {
        return this.includedCookies == null ? List.of() : this.includedCookies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPattern defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAll all;
        private @Nullable List<String> excludedCookies;
        private @Nullable List<String> includedCookies;
        public Builder() {}
        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.excludedCookies = defaults.excludedCookies;
    	      this.includedCookies = defaults.includedCookies;
        }

        @CustomType.Setter
        public Builder all(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAll all) {
            this.all = all;
            return this;
        }
        @CustomType.Setter
        public Builder excludedCookies(@Nullable List<String> excludedCookies) {
            this.excludedCookies = excludedCookies;
            return this;
        }
        public Builder excludedCookies(String... excludedCookies) {
            return excludedCookies(List.of(excludedCookies));
        }
        @CustomType.Setter
        public Builder includedCookies(@Nullable List<String> includedCookies) {
            this.includedCookies = includedCookies;
            return this;
        }
        public Builder includedCookies(String... includedCookies) {
            return includedCookies(List.of(includedCookies));
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPattern build() {
            final var o = new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchCookiesMatchPattern();
            o.all = all;
            o.excludedCookies = excludedCookies;
            o.includedCookies = includedCookies;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatement {
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
     * 
     */
    private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch fieldToMatch;
    /**
     * @return String representing the regular expression. Minimum of `1` and maximum of `512` characters.
     * 
     */
    private String regexString;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See `text_transformation` below for details.
     * 
     */
    private List<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementTextTransformation> textTransformations;

    private WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatement() {}
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See `field_to_match` below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return String representing the regular expression. Minimum of `1` and maximum of `512` characters.
     * 
     */
    public String regexString() {
        return this.regexString;
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See `text_transformation` below for details.
     * 
     */
    public List<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch fieldToMatch;
        private String regexString;
        private List<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementTextTransformation> textTransformations;
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexString = defaults.regexString;
    	      this.textTransformations = defaults.textTransformations;
        }

        @CustomType.Setter
        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        @CustomType.Setter
        public Builder regexString(String regexString) {
            this.regexString = Objects.requireNonNull(regexString);
            return this;
        }
        @CustomType.Setter
        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }
        public WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatement build() {
            final var o = new WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexMatchStatement();
            o.fieldToMatch = fieldToMatch;
            o.regexString = regexString;
            o.textTransformations = textTransformations;
            return o;
        }
    }
}

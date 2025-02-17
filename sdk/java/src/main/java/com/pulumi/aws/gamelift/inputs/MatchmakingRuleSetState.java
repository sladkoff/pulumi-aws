// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MatchmakingRuleSetState extends com.pulumi.resources.ResourceArgs {

    public static final MatchmakingRuleSetState Empty = new MatchmakingRuleSetState();

    /**
     * Rule Set ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Rule Set ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Name of the matchmaking rule set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the matchmaking rule set.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * JSON encoded string containing rule set data.
     * 
     */
    @Import(name="ruleSetBody")
    private @Nullable Output<String> ruleSetBody;

    /**
     * @return JSON encoded string containing rule set data.
     * 
     */
    public Optional<Output<String>> ruleSetBody() {
        return Optional.ofNullable(this.ruleSetBody);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private MatchmakingRuleSetState() {}

    private MatchmakingRuleSetState(MatchmakingRuleSetState $) {
        this.arn = $.arn;
        this.name = $.name;
        this.ruleSetBody = $.ruleSetBody;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MatchmakingRuleSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MatchmakingRuleSetState $;

        public Builder() {
            $ = new MatchmakingRuleSetState();
        }

        public Builder(MatchmakingRuleSetState defaults) {
            $ = new MatchmakingRuleSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Rule Set ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Rule Set ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name Name of the matchmaking rule set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the matchmaking rule set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ruleSetBody JSON encoded string containing rule set data.
         * 
         * @return builder
         * 
         */
        public Builder ruleSetBody(@Nullable Output<String> ruleSetBody) {
            $.ruleSetBody = ruleSetBody;
            return this;
        }

        /**
         * @param ruleSetBody JSON encoded string containing rule set data.
         * 
         * @return builder
         * 
         */
        public Builder ruleSetBody(String ruleSetBody) {
            return ruleSetBody(Output.of(ruleSetBody));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public MatchmakingRuleSetState build() {
            return $;
        }
    }

}

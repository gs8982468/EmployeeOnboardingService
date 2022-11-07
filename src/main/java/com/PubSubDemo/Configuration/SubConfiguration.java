package com.PubSubDemo.Configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import com.google.cloud.spring.pubsub.integration.AckMode;
import com.google.cloud.spring.pubsub.integration.inbound.PubSubInboundChannelAdapter;
import com.google.cloud.spring.pubsub.integration.inbound.PubSubMessageSource;
import com.google.pubsub.v1.ProjectSubscriptionName;

@Configuration
public class SubConfiguration {

	@Bean
	public MessageChannel inputChannel() {
		return new DirectChannel();
	}

	/*@Bean
	@InboundChannelAdapter(channel = "inputChannel", poller = @Poller(fixedDelay = "1"))
	public org.springframework.integration.core.MessageSource<Object> statusMessageChannelAdopter(
			PubSubTemplate simplePubSubTemplate) {
		final String subName = ProjectSubscriptionName.format("valid-might-365117", "PubSubStringOnly-sub");
		PubSubMessageSource mesageSource = new PubSubMessageSource(simplePubSubTemplate, subName);
		mesageSource.setAckMode(AckMode.AUTO);
		mesageSource.setBlockOnPull(true);
		mesageSource.setMaxFetchSize(100);
		return mesageSource;

	}*/

	@Bean
	public PubSubInboundChannelAdapter messageAdapter(@Qualifier("inputChannel") MessageChannel inputChannel,
			PubSubTemplate template) {
		final String subName = ProjectSubscriptionName.format("valid-might-365117", "PubSubStringOnly-sub");
		PubSubInboundChannelAdapter adapter = new PubSubInboundChannelAdapter(template, subName);
		adapter.setOutputChannel(inputChannel);
		return adapter;
	}

}

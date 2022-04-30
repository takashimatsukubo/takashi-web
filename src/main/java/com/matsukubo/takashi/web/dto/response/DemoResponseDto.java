package com.matsukubo.takashi.web.dto.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JacksonXmlRootElement(localName = "demo")
public class DemoResponseDto {

	@JacksonXmlProperty(localName = "item_id")
	private String itemId;

	@JacksonXmlProperty(localName = "item_name")
	private String itemName;

	@JacksonXmlProperty(localName = "item_detail")
	private String itemDetail;

}

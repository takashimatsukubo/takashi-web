package com.matsukubo.takashi.web.dto.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Getter;

@Getter
@JacksonXmlRootElement(localName = "demo")
public class DemoRequestDto {

	/** ユーザID */
	@JacksonXmlProperty(localName = "item_id")
	private String itemId;

	public DemoRequestDto() {}

}

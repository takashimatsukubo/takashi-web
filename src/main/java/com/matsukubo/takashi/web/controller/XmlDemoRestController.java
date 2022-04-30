package com.matsukubo.takashi.web.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matsukubo.takashi.web.dto.request.DemoRequestDto;
import com.matsukubo.takashi.web.dto.response.DemoResponseDto;

@RestController
public class XmlDemoRestController {

	@RequestMapping(value = "/item.xml", method = RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
	public DemoResponseDto getItem() {

		DemoResponseDto response = DemoResponseDto.builder()
				.itemId("1")
				.itemName("item1")
				.itemDetail("アイテム1")
				.build();

		System.out.println(response);

		return response;
	}

	@RequestMapping(value = "item.xml", method = RequestMethod.POST, produces = MediaType.TEXT_XML_VALUE)
	public DemoResponseDto getItemSelected(@RequestBody DemoRequestDto request) {

		DemoResponseDto response = DemoResponseDto.builder()
				.itemId(request.getItemId())
				.itemName("item2")
				.itemDetail("アイテム2")
				.build();

		System.out.println(response);

		return response;

	}

}

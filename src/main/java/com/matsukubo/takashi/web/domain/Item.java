package com.matsukubo.takashi.web.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

public class Item {

	@NotBlank(message = "名前を入力してください。")
	@Getter
	@Setter
	private String name;

	@NotBlank(message = "tweetは必須です")
	@Size(max = 100, message = "tweetは100文字以内です。")
	@Getter
	@Setter
	private String tweet;

}

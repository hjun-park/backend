package com.sikhye.chabak.src.post.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostingReq {

	@NotBlank
	private String title;

	@NotBlank
	private String content;

	private List<MultipartFile> images;

	@Builder
	public PostingReq(String title, String content, List<MultipartFile> images) {
		this.title = title;
		this.content = content;
		this.images = images;
	}

	public Boolean isEmptyOrNullImages() {
		if (images == null) {
			return true;
		} else return images.isEmpty();
	}
}

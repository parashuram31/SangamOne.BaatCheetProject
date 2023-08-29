package com.SangamOne.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.Model.Content;
import com.SangamOne.Repository.ContentRepository;

@RestController
@RequestMapping(value="/content")
public class ContentController {

	@Autowired
	ContentRepository contentRepository;
	
	@PostMapping("/addContent")
	public String addContent(@RequestBody Content content) {
		contentRepository.save(content);
		return "Inserted";
	}
	
	@GetMapping("/viewContent")
	public List<Content> viewAllContent(){
		return contentRepository.findAll();
		}
	}

package com.CoderTanu.Hatoes.Entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;

public class HatoesLink {
	
	private List<Link> links = new ArrayList<>();
	
	public void addLink(Link link) {
		links.add(link);
	}

}

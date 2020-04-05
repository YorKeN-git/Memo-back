package com.memo.dashboard.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Memo {
	
	@Id
	private String id;
	private String titre;
	private String contenu;
	private String priorite;
	private String status;
}

package com.memo.dashboard.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.memo.dashboard.models.Memo;
import com.memo.dashboard.repositories.MemoRepository;

@CrossOrigin
@RestController
@RequestMapping("memos")
public class MemoController {
	
	@Autowired
	private MemoRepository repository;
	
	@PostMapping("")
	public Memo save(@RequestBody Memo entity) {
		return this.repository.save(entity);
	}
	
	@GetMapping("")
	public List<Memo> getAllMemos(){
		return this.repository.findAll();
	}
	
	@GetMapping("/id/{id}")
	public Optional<Memo> getById(@PathVariable String id) {
		return this.repository.findById(id);
	}
	
	@PostMapping("/delete/{id}")
	public void deleteMemo(@PathVariable String id) {
		this.repository.deleteById(id);
	}
	
	/*@PostMapping("")
	public Memo memoDone(@RequestBody Memo entity) {
		return this.repository.save(entity);
	}*/
}

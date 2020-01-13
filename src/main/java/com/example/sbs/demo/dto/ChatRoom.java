package com.example.sbs.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatRoom {
	private int id;
	private String regDate;
	private String title;
	private String passwd;
	private int memberId;
}
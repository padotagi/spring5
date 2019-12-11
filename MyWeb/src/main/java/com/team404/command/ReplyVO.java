package com.team404.command;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ReplyVO {

	private int bno;
	private int rno;
	
	private String reply; //내용
	private String replyId; //작성자
	private String replyPw; //비밀번호
	private Timestamp replydate; //등록일
	private Timestamp updatedate; //수정일
	
}

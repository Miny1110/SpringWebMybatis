package com.exe.springmybatis;

import lombok.Getter;
import lombok.Setter;

/** 
 * @Getter : ���� ����
 * @Setter : ���� ����
 * @ToString: Object�� toString �������̵�
 * @Data : ���ͼ��� ����

 * ��ġ�� ���� ���� �ᵵ �ǰ� public/private �ڿ� �ᵵ �ȴ�.*/

@Getter
@Setter
public class CustomDTO {
	
	private int id;
	private String name;
	private int age;
	

}

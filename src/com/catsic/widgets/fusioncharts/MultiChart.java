package com.catsic.widgets.fusioncharts;

import java.util.List;

/**
 * @author moonights
 * @version 1.0
 * @file MultiChart.java
 * @date Dec 10, 2010
 * @time 9:27:40 AM
 * @TODO ������������ ���������ʾ��һ��ͼƬ��
 */
public class MultiChart {
	
	private String name ;  			//���ƣ���ʾ������
    private String color;  			//��ʾ����ɫ
    private List<String> values; 	//ֵ
   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
       
       
       
}

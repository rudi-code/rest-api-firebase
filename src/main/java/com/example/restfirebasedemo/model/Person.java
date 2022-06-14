/**
 * 
 */
package com.example.restfirebasedemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author rudi_
 * Apr 12, 2022
 */
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	private String name;
	private String age;
	private String location;
	

}

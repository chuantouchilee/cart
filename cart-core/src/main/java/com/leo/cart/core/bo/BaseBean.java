package com.leo.cart.core.bo;

import java.io.Serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 底层bean，抽出toString
 * @author hasee
 *
 */
public class BaseBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final ObjectMapper om = new ObjectMapper();
	
//	@Autowired
//	private JsonMapper jsonMapper;
//	
//	@Resource(name="jsonMapper")
//	public void setJsonMapper(JsonMapper jsonMapper) {
//		this.jsonMapper = jsonMapper;
//	}

	@Override
	public String toString() {
		try {
			return om.writeValueAsString(this);
//			return jsonMapper.objectToString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}

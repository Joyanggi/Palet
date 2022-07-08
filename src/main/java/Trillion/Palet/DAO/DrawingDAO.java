package Trillion.Palet.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Trillion.Palet.DTO.DrawingDTO;
import Trillion.Palet.DTO.ImgDTO;

@Repository
public class DrawingDAO {
	
	@Autowired
	private SqlSession mybatis;
	
//	public int add(DrawingDTO dto) {
//		mybatis.insert("Event.add", dto);
//		return dto.getDraw_seq();
//	}
	
	public int add(DrawingDTO dto) throws Exception {
		mybatis.insert("Event.add", dto);
		return (int) dto.getDraw_seq();
	}

	public List<Object> selectImage() {
		return  mybatis.selectList("Event.selectImage");
	}
	
	public List<Map<String, String>> selectAll() {
		return  mybatis.selectList("Event.selectImage");
	}
	
	public int testsave(DrawingDTO dto) {
		return mybatis.insert("Event.testsave",dto);
	}
}
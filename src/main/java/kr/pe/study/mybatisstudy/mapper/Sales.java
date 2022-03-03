package kr.pe.study.mybatisstudy.mapper;

import kr.pe.study.mybatisstudy.dao.SalesDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Sales {
    List<SalesDTO> getSales();
}

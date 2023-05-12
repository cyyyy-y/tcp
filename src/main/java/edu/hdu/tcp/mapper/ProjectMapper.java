package edu.hdu.tcp.mapper;

import edu.hdu.tcp.model.Project;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProjectMapper {
    public List<Project> selectAllProjects ();
}

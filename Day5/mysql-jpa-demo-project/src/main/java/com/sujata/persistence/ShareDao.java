package com.sujata.persistence;

import com.sujata.entity.Share;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShareDao extends JpaRepository<Share,Integer> {


}

package com.biz.bbs.pesrsistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biz.bbs.domain.BBsVO;

public interface BBsDao  extends JpaRepository<BBsVO, Long>{

}

package com.ssafy.happyhouse.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.model.HouseInfoDto;
import com.ssafy.happyhouse.model.SidoGugunCodeDto;
import com.ssafy.happyhouse.model.mapper.HouseMapMapper;

@Service
public class HouseMapServiceImpl implements HouseMapService {
	
	@Autowired
	private HouseMapMapper houseMapMapper;

	@Override
	public List<SidoGugunCodeDto> getSido() throws Exception {
		return houseMapMapper.getSido();
	}

	@Override
	public List<SidoGugunCodeDto> getGugunInSido(String sido) throws Exception {
		return houseMapMapper.getGugunInSido(sido);
	}

	@Override
	public List<HouseInfoDto> getDongInGugun(String gugun) throws Exception {
		return houseMapMapper.getDongInGugun(gugun);
	}

	@Override
	public List<HouseInfoDto> getAptInDong(Map<String, String> map) throws Exception {
		return houseMapMapper.getAptInDong(map);
	}

	@Override
	public List<HouseInfoDto> getAptNameInDong(String dong) throws Exception {
		// TODO Auto-generated method stub
		return houseMapMapper.getAptNameInDong(dong);
	}

	@Override
	public List<HouseInfoDto> getAptDealInCode(String code, String dong) throws Exception {
		// TODO Auto-generated method stub
		return houseMapMapper.getAptDealInCode(code, dong);
	}

	@Override
	public List<HouseInfoDto> getAptInAll(Map<String, String> map) throws Exception {
		// TODO Auto-generated method stub
		return houseMapMapper.getAptInAll(map);
	}

}

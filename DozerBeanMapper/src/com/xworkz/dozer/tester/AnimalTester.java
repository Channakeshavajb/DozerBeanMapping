package com.xworkz.dozer.tester;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.xworkz.dozer.model.LionEntity;
import com.xworkz.dozer.model.TigerEntity;

public class AnimalTester {

	public static void main(String[] args) {

		TigerEntity tigerEntity = new TigerEntity();
		tigerEntity.setName("black-King");
		tigerEntity.setAge(15);
		tigerEntity.setAddress("africa");
		System.out.println("data of tiger\t" + tigerEntity);
		Mapper mapper = new DozerBeanMapper();
		LionEntity lionEntity = new LionEntity();
		System.out.println("lionEntity is before dozer mapping\t"+lionEntity);
		mapper.map(tigerEntity, lionEntity);
		
		System.out.println("lionEntity is after dozer mapping\t"+lionEntity);

		// LionEntity lion=new DozerBeanMapper().map(tigerEntity, LionEntity.class);
	}

}

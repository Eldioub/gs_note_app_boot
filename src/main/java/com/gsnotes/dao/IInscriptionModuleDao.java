package com.gsnotes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsnotes.bo.InscriptionModule;
import com.gsnotes.bo.Module;


public interface IInscriptionModuleDao extends JpaRepository<InscriptionModule, Long> {
	
	List<InscriptionModule> getInscriptionModulesByModule(Module m);
	
}

package com.gsnotes.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsnotes.bo.InscriptionModule;
import com.gsnotes.dao.IInscriptionModuleDao;
import com.gsnotes.services.IInscriptionModuleService;
import com.gsnotes.bo.Module;


@Service
@Transactional
public class InscriptionModuleServiceImpl implements IInscriptionModuleService{

	@Autowired
	private IInscriptionModuleDao inscriptionModuleDao;
	
	@Override
	public void addInscriptionModule(InscriptionModule pInscriptionModule) {
		inscriptionModuleDao.save(pInscriptionModule);
	}

	@Override
	public void updateInscriptionModule(InscriptionModule pInscriptionModule) {
		inscriptionModuleDao.save(pInscriptionModule);
		
	}

	@Override
	public List<InscriptionModule> getAllInscriptionModules() {
		return inscriptionModuleDao.findAll();
	}

	@Override
	public void deleteInscriptionModule(Long id) {
		inscriptionModuleDao.deleteById(id);
	}

	@Override
	public InscriptionModule getInscriptionModuleById(Long id) {
		return inscriptionModuleDao.getById(id);
	}

	@Override
	public List<InscriptionModule >getInscriptionModuleByModule(Module m) {
		return inscriptionModuleDao.getInscriptionModulesByModule(m);
	}

}

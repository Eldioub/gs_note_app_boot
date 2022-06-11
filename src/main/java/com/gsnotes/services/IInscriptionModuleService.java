package com.gsnotes.services;

import java.util.List;

import com.gsnotes.bo.InscriptionModule;
import com.gsnotes.bo.Module;


public interface IInscriptionModuleService {

	void addInscriptionModule(InscriptionModule pInscriptionModule);

    void updateInscriptionModule(InscriptionModule pInscriptionModule);

    List<InscriptionModule> getAllInscriptionModules();

    void deleteInscriptionModule(Long id);

    InscriptionModule getInscriptionModuleById(Long id);
    
    List<InscriptionModule> getInscriptionModuleByModule(Module m);
	
}

package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Service
public class LanguageManager implements LanguageService {

	private ProgrammingLanguageRepository languageRepository;
	


	public LanguageManager(ProgrammingLanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}
	
	@Override
	public List<ProgrammingLanguage> getAll() {
		return languageRepository.getAll();
	}
	

	@Override
	public ProgrammingLanguage getById(int id) {
		
		return languageRepository.getById(id);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		for(ProgrammingLanguage language:languageRepository.getAll()) {
			if(language.getProgrammingLanguage().equals(programmingLanguage.getProgrammingLanguage())){
				throw new Exception("Bu programlama dili zaten bulunmaktadır. Yeni bir dil ekleyin");
			}else {
				languageRepository.add(programmingLanguage);
			}
		}
		if(programmingLanguage.getProgrammingLanguage().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez");
		}
	
		
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		languageRepository.update(programmingLanguage);
		
	}

}

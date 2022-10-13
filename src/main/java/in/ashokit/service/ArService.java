package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.binding.CitizenApp;

@Service
public interface ArService {

	public Integer createApplication(CitizenApp app);
}

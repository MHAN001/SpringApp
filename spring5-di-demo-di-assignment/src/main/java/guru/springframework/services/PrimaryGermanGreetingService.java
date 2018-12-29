package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
    @Qualifier("greetingRepositoryImpl")
    private GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}

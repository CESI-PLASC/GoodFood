package fr.mycompany.goodfood.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import fr.mycompany.goodfood.mapper.profiles.CommandeProfile;

@Configuration
public class MapperConfig {
    
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setFieldAccessLevel(AccessLevel.PRIVATE).setFieldMatchingEnabled(true);
        new CommandeProfile().setup(modelMapper);

        return modelMapper;
    }
}
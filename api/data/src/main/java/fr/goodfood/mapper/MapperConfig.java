package fr.goodfood.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import fr.goodfood.mapper.profiles.CommandeProfile;
import fr.goodfood.mapper.profiles.CompositionProfile;

@Configuration
public class MapperConfig {
    
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setFieldAccessLevel(AccessLevel.PRIVATE).setFieldMatchingEnabled(true);
        new CommandeProfile().setup(modelMapper);
        new CompositionProfile().setup(modelMapper);

        return modelMapper;
    }
}

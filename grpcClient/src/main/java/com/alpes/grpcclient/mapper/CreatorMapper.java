package com.alpes.grpcclient.mapper;

import com.alpes.Creator;
import com.alpes.grpcclient.dto.CreatorDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {
    private ModelMapper mapper = new ModelMapper();

    public CreatorDto fromCreatorToCreatorDto(Creator creator) {
        return this.mapper.map(creator, CreatorDto.class);
    }
}

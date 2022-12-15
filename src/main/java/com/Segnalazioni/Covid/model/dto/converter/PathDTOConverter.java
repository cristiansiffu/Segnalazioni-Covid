package com.Segnalazioni.Covid.model.dto.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.Segnalazioni.Covid.model.Path;
import com.Segnalazioni.Covid.model.dto.PathDTO;

@Component
public class PathDTOConverter implements Converter<PathDTO, Path> {

	@Override
	public Path convert(PathDTO source) {
		Path path = new Path();
		path.setDescription(source.getDescription());
		return path;
	}

}

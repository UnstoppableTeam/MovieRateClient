package org.company.model.dataholder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.company.model.dataholder.vo.genres.GenreInfo;
import org.company.model.dataholder.vo.genres.Genres;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GenresHolder {

    private Logger logger = LoggerFactory.getLogger("businessLogic");

    public List<GenreInfo> requestGenres() {
        Genres genres = null;
        try {
            genres = new ObjectMapper().readValue(new URL(Constants.REQUEST_GENRES), new TypeReference<Genres>() {});
        } catch (IOException e) {
            logger.warn("Ошибка получения списка жанров");
        }

        logger.info("Получен список жанров");
        return genres == null ? new ArrayList<>(Collections.emptyList()) : new ArrayList<>(genres.getGenres());
    }

}

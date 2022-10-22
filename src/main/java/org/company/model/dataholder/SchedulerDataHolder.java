package org.company.model.dataholder;

import org.company.entity.Film;
import org.company.entity.Genre;
import org.company.entity.converter.FilmConverter;
import org.company.entity.converter.GenreConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.company.repository.FilmsRepository;
import org.company.repository.GenresRepository;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
@EnableScheduling
public class SchedulerDataHolder {

    private Logger logger = LoggerFactory.getLogger("businessLogic");

    @Autowired
    private GenresRepository genresRepository;

    @Autowired
    private FilmsRepository filmsRepository;

    @Scheduled(fixedRate = 1000 * 60 * 60)//cron = "0 0 * * * *"
    public void schedulerStart() {
        DataHolder dataHolder = new DataHolderImpl();
        logger.info("Шедулер начал работу");

        List<Genre> genres = dataHolder.getGenres().stream()
                .map(GenreConverter::convertToGenre).collect(Collectors.toList());
        List<Film> filmsInfo = dataHolder.getFilmsInfo().stream()
                .map(FilmConverter::convertToFilm).collect(Collectors.toList());

        genresRepository.saveAll(genres);
        filmsRepository.saveAll(filmsInfo);
        logger.info("Шедулер закончил работу");
    }

}


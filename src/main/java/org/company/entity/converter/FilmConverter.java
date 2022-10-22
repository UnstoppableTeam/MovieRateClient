package org.company.entity.converter;

import lombok.NonNull;
import org.company.entity.Film;
import org.company.model.dataholder.vo.filmsinfo.FilmInfo;

public class FilmConverter {

    public static Film convertToFilm(@NonNull FilmInfo filmInfo) {
        return Film.builder()
                .id(filmInfo.getId())
                .genreIds(filmInfo.getGenreIds())
                .voteCount(filmInfo.getVoteCount())
                .averageVote(filmInfo.getAverageVote())
                .build();
    }

    public static FilmInfo convertToFilmInfo(@NonNull Film film) {
        return FilmInfo.builder()
                .id(film.getId())
                .genreIds(film.getGenreIds())
                .voteCount(film.getVoteCount())
                .averageVote(film.getAverageVote())
                .build();
    }

}

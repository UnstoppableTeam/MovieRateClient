package org.company.entity.converter;

import lombok.NonNull;
import org.company.entity.Genre;
import org.company.model.dataholder.vo.genres.GenreInfo;

public class GenreConverter {

    public static Genre convertToGenre(@NonNull GenreInfo genreInfo) {
        return Genre.builder()
                .id(genreInfo.getId())
                .name(genreInfo.getName())
                .build();
    }

    public static GenreInfo convertToGenreInfo(@NonNull Genre genre) {
        return GenreInfo.builder()
                .id(genre.getId())
                .name(genre.getName())
                .build();
    }

}

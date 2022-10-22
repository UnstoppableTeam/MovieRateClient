package org.company.model.dataholder;

import org.company.model.dataholder.vo.filmsinfo.FilmInfo;
import org.company.model.dataholder.vo.genres.GenreInfo;

import java.util.List;

interface DataHolder {

    List<GenreInfo> getGenres();

    List<FilmInfo> getFilmsInfo();

}

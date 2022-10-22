package org.company.model.dataholder;

import org.company.model.dataholder.vo.filmsinfo.FilmInfo;
import org.company.model.dataholder.vo.genres.GenreInfo;

import java.util.List;

public class DataHolderImpl implements DataHolder {

    private GenresHolder genresHolder = new GenresHolder();
    private FilmsInfoHolder filmsInfoHolder = new FilmsInfoHolder();

    @Override
    public List<GenreInfo> getGenres() {
        return genresHolder.requestGenres();
    }

    @Override
    public List<FilmInfo> getFilmsInfo() {
        return filmsInfoHolder.getFilmsInfo();
    }
}

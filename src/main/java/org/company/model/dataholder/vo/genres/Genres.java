package org.company.model.dataholder.vo.genres;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Genres {

    private List<GenreInfo> genres;

}

package hongnt.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

    //Task: Use the repository class to retrieve data from database
    public List<Movie> AllMovie(){
        return movieRepo.findAll();
    }

    public Optional<Movie>SingleMovie(String imdbId){
        return movieRepo.findMovieByImdbId(imdbId);
    }


}

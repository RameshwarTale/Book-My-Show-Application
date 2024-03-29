package com.acciojob.bookmyshowapplications.Controllers;

import com.acciojob.bookmyshowapplications.Models.Movie;
import com.acciojob.bookmyshowapplications.Requests.UpdateMovieRequest;
import com.acciojob.bookmyshowapplications.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("movie")
public class MovieControllers {

     @Autowired
    private MovieService movieService;

   @PostMapping("/addMovie")
    public String addMovie(@RequestBody Movie movie){

        String response = movieService.addMovie(movie);
        return response;
   }


   @PutMapping("/updateMovieAttributes")
    public String updateMovieAttributes(@RequestBody UpdateMovieRequest movieRequest){
       //You have made sure that only relevant attributes
       //are expose to the client

        String response = movieService.updateMovieAttributes(movieRequest);
        return response;
   }

}

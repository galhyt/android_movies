package com.example.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_movie_data.*

class MoviesActivity : AppCompatActivity() {
    private val movies: List<MovieItem> = listOf(
        MovieItem(img = R.drawable.black_panther, title = "Black Panther", overview = "King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war"),
        MovieItem(img = R.drawable.deadpool_2, title = "Deadpool", overview = "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life"),
        MovieItem(img = R.drawable.guardians_of_the_galaxy, title = "Guardians of the Galaxy", overview = "Light years from Earth, 26 years after being abducted, Peter Quill finds himself the prime target of a manhunt after discovering an orb wanted by Ronan the Accuser"),
        MovieItem(img = R.drawable.infinity_war_image, title = "Infinty War", overview = "The Avengers must stop Thanos, an intergalactic warlord, from getting his hands on all the infinity stones. However, Thanos is prepared to go to any lengths to carry out his insane plan."),
        MovieItem(img = R.drawable.interstellar, title = "Interstellar", overview = "Interstellar chronicles the adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage"),
        MovieItem(img = R.drawable.jurassic_world_fallen_kingdom, title = "Jurassic World", overview = "Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again"),
        MovieItem(img = R.drawable.ocean_eight, title = "Ocean Eight", overview = "Debbie Ocean, a criminal mastermind, gathers a crew of female thieves to pull off the heist of the century at New York's annual Met Gala"),
        MovieItem(img = R.drawable.the_first_purge, title = "The first Purge", overview = "To push the crime rate below one percent for the rest of the year, the New Founding Fathers of America test a sociological theory that vents aggression for one night in one isolated community. But when the violence of oppressors meets the rage of the others, the contagion will explode from the trial-city borders and spread across the nation"),
        MovieItem(img = R.drawable.the_meg, title = "The Meg", overview = "A deep sea submersible pilot revisits his past fears in the Mariana Trench, and accidentally unleashes the seventy foot ancestor of the Great White Shark believed to be extinct"),
        MovieItem(img = R.drawable.thor_ragnarok, title = "Thor", overview = "Thor is on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the prophecy of destruction to his homeworld and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        val rvMoviesList =  findViewById<RecyclerView>(R.id.moviesList)
        rvMoviesList.adapter = MoviesListViewAdapter(movies, this)
        rvMoviesList.layoutManager = LinearLayoutManager(this)
    }



}

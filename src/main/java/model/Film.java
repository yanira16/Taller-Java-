package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the actor database table.
 * 
 */
@Entity
@Table(name="film")
@NamedQuery(name="Film.findAll", query="SELECT a FROM Film a")
public class Film implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="film_id", unique=true, nullable=false)
	private int filmId;

	@Column(name="title", nullable=false, length=45)
	private String title;

	@Column(name="description", nullable=true, length=500)
	private String description;

	@Column(name="release_year", nullable=true)
	private int releaseYear;
	
	@Column(name="language_id", nullable=true)
	private int languageId;
	
	@Column(name="original_language_id", nullable=true)
	private int originalLanguageId;
	
	@Column(name="rental_duration", nullable=true)
	private int rentalDuration;
	
	@Column(name="rental_rate", nullable=true)
	private double rentalRate;
	
	@Column(name="length", nullable=true)
	private int length;
	
	@Column(name="replacement_cost", nullable=true)
	private double replacement_cost;
	
	@Column(name="rating", nullable=true)
	private String rating;
	
	@Column(name="special_features", nullable=true)
	private String specialFeatures;
	
	@OneToMany(mappedBy="film")
	List<FilmActor> lista;
	
	public List<Actor> obtenerActores()
	{
		List<Actor> nuevaLista = new ArrayList<Actor>();
		for(FilmActor contador : this.lista)
		{
			nuevaLista.add(contador.getActor());
		}
		return nuevaLista;
	}

	public Film() {
	}

	public int getFilmId() {
		return this.filmId;
	}

	public String getTitle() {
		return this.title;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getReleaseYear() {
		return this.releaseYear;
	}

	public int getLanguageId() {
		return this.languageId;
	}
	
	public int getOriginalLanguageId() {
		return this.originalLanguageId;
	}
	
	public int getRentalDuration() {
		return this.rentalDuration;
	}
	
	public double getRentalRate() {
		return this.rentalRate;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public double getReplacementCost() {
		return this.replacement_cost;
	}
	
	public String getRating() {
		return this.rating;
	}
	
	public String getSpecialFeatures() {
		return this.specialFeatures;
	}
	
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public void setOriginalLanguageId(int originalLanguageId) {
		this.originalLanguageId = originalLanguageId;
	}
	
	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	
	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void setReplacementCost(double replacement_cost) {
		this.replacement_cost = replacement_cost;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
}

package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the actor database table.
 * 
 */
@Entity
@Table(name="film_actor")
@NamedQuery(name="FilmActor.findAll", query="SELECT a FROM FilmActor a")
public class FilmActor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="actor_id", unique=true, nullable=false)
	private int actorId;
	
	@Id
	@Column(name="film_id", unique=true, nullable=false)
	private int filmId;

	@Column(name="last_update", nullable=false)
	private Timestamp lastUpdate;

	@ManyToOne
	@PrimaryKeyJoinColumn(name="actor_id", referencedColumnName="actor_id")
	private Actor actor;
	
	@ManyToOne
	@PrimaryKeyJoinColumn(name="film_id", referencedColumnName="film_id")
	private Film film;
	
	
	public FilmActor() {
	}
	
	public Film getFilm()
	{
		return this.film;
	}
	
	public Actor getActor()
	{
		return this.actor;
	}
	
	public int getactorId()
	{
		return this.actorId;
	}
	
	public int getfilmId()
	{
		return this.filmId;
	}
	
	public Timestamp getlastUpdate()
	{
		return this.lastUpdate;
	}
	
	public void setactorId(int actorId)
	{
		this.actorId = actorId;
	}
	
	public void setfilmId(int filmId)
	{
		this.filmId = filmId;
	}

	public void setlastUpdate(Timestamp lastUpdate)
	{
		this.lastUpdate = lastUpdate;
	}
	
	public void setActor(Actor actor)
	{
		this.actor = actor;
	}
	
	public void setFilm(Film film)
	{
		this.film = film;
	}

}
